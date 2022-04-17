package br.com.ohanacraft.supremeexpansion.machine.quarry;

import br.com.ohanacraft.supremeexpansion.SupremeExpansion;
import br.com.ohanacraft.supremeexpansion.machine.generic.UtilMachine;
import br.com.ohanacraft.supremeexpansion.machine.multiBlock.MagicalFabricator;
import br.com.ohanacraft.supremeexpansion.util.InventoryRecipe;
import io.github.thebusybiscuit.slimefun4.api.items.ItemState;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockPlaceHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.tags.SlimefunTag;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.protection.ProtectableAction;
import org.apache.commons.lang.Validate;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class BasicQuarry extends SlimefunItem implements EnergyNetComponent {

    private static final DecimalFormat FORMAT = new DecimalFormat("###,###,##0.00", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
    private static final int TICK_DELAY = SupremeExpansion.inst().getConfig().getInt("options.custom-ticker-delay");
    private int tickDelayThreshold = 0;
    private int energyConsumed = -1;
    private int energyCapacity = -1;
    private int energyCharge = 0;
    private boolean enabled = true;

    private ItemStack[] output;

    public BasicQuarry(Category category, SlimefunItemStack iconMachine, ItemStack[] machine) {
        super(category, iconMachine, MagicalFabricator.getMachine(), machine);
        addItemHandler(onPlace(), onRightClick());
    }

    @Override
    public void preRegister() {
        addItemHandler(new BlockTicker() {
            @Override
            public void tick(Block b, SlimefunItem sf, Config data) {
                BasicQuarry.this.tick(b, sf);
            }
            @Override
            public boolean isSynchronized() {
                return true;
            }
        });
    }

    public void tick(Block b, SlimefunItem sf) {
        Block targetBlock = b.getRelative(BlockFace.DOWN);
        if (isInvalidInventory(targetBlock) || !this.enabled || getCharge(b.getLocation()) < getEnergyConsumption()) {
            //disabled machine or no energy, abort...
            return;
        }
        BlockState state = targetBlock.getState();
        if (state instanceof InventoryHolder) {
            // The delay is not same as minecraft tick,
            // but it's based on 'custom-ticker-delay' config.
            if (tickDelayThreshold < TICK_DELAY) {
                tickDelayThreshold++;
                return;
            }
            tickDelayThreshold = 0;
            Inventory inv = ((InventoryHolder) state).getInventory();
            if (inv.firstEmpty() != -1) {
                ItemStack material = UtilMachine.getMaterial(this.getOutput(), UtilMachine.getRandomInt());
                if(material != null){
                    final ItemStack itemStack = material.clone();
                    itemStack.setAmount(1);
                    inv.addItem(itemStack);
                    Location loc = b.getLocation().add(0.5, 0.8, 0.5);
                    b.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, loc, 6);
                    removeCharge(b.getLocation(), getEnergyConsumption());
                    energyCharge = getCharge(b.getLocation());
                }
            }
        }
    }

    @Nonnull
    private BlockPlaceHandler onPlace() {
        return new BlockPlaceHandler(false) {
            @Override
            public void onPlayerPlace(BlockPlaceEvent e) {
                Block b = e.getBlockPlaced();
                BlockStorage.addBlockInfo(b, "owner", e.getPlayer().getUniqueId().toString());
            }
        };
    }

    @Nonnull
    public BlockUseHandler onRightClick() {
        return e -> {
        e.cancel();
        Player p = e.getPlayer();
        Block b = e.getClickedBlock().get();
        energyCharge = getCharge(b.getLocation());
        if (isInvalidInventory(b.getRelative(BlockFace.DOWN))) {
            SlimefunPlugin.getLocalization().sendMessage(p, "machines.CARGO_NODES.must-be-placed");
        } else if (BlockStorage.getLocationInfo(b.getLocation(), "owner").equals(p.getUniqueId().toString())
            && SlimefunPlugin.getProtectionManager().hasPermission(p, b, ProtectableAction.INTERACT_BLOCK)) {
            showMachine(p, b);
        } else {
            SlimefunPlugin.getLocalization().sendMessage(p, "inventory.no-access");
        }
    };
    }

    @ParametersAreNonnullByDefault
    protected void showMachine(Player p, Block b) {

        Validate.notNull(p, "The Player should not be null");
        Validate.notNull(b, "The Block should not be null");
        ChestMenu menu = new ChestMenu(getItemName());
        menu.setPlayerInventoryClickable(false);
        menu.setEmptySlotsClickable(false);

        ChestMenuUtils.drawBackground(menu, InventoryRecipe.QUARRY_BORDER);
        ChestMenuUtils.drawBackground(menu, InventoryRecipe.QUARRY_OUTPUT);
        ChestMenuUtils.drawBackground(menu, InventoryRecipe.QUARRY_OUTPUT_BORDER);

        for(int i = 0; i < InventoryRecipe.QUARRY_INPUT_BORDER.length; ++i) {
            int slot = InventoryRecipe.QUARRY_INPUT_BORDER[i];
            menu.addItem(slot, ChestMenuUtils.getInputSlotTexture(), ChestMenuUtils.getEmptyClickHandler());
        }

        final String powerPerSecond = LoreBuilder.powerPerSecond(getEnergyConsumption());
        final String powerCharged = LoreBuilder.powerCharged(energyCharge, getCapacity());
        if(energyCharge < getEnergyConsumption() || !this.enabled){
            menu.addItem(InventoryRecipe.QUARRY_STATUS, new CustomItem(Material.OBSIDIAN, ChatColor.RED + "NOT-ACTIVE",  powerPerSecond, powerCharged));
            menu.addMenuClickHandler(InventoryRecipe.QUARRY_STATUS, ChestMenuUtils.getEmptyClickHandler());
        } else {
            menu.addItem(InventoryRecipe.QUARRY_STATUS, new CustomItem(Material.GLOWSTONE, ChatColor.GREEN + "ACTIVE",  powerPerSecond,  powerCharged));
            menu.addMenuClickHandler(InventoryRecipe.QUARRY_STATUS, ChestMenuUtils.getEmptyClickHandler());
        }
        if (enabled) {
            menu.addItem(InventoryRecipe.QUARRY_BUTTON, new CustomItem(Material.EMERALD_BLOCK, SlimefunPlugin.getLocalization().getMessages(p, "messages.auto-crafting.tooltips.enabled")));
            menu.addMenuClickHandler(InventoryRecipe.QUARRY_BUTTON, (pl, item, slot, action) -> {
                enabled = false;
                showMachine(p, b);
                return false;
            });
        } else {
            menu.addItem(InventoryRecipe.QUARRY_BUTTON, new CustomItem(Material.REDSTONE_BLOCK, SlimefunPlugin.getLocalization().getMessages(p, "messages.auto-crafting.tooltips.disabled")));
            menu.addMenuClickHandler(InventoryRecipe.QUARRY_BUTTON, (pl, item, slot, action) -> {
                enabled = true;
                showMachine(p, b);
                return false;
            });
        }
        p.playSound(p.getLocation(), Sound.BLOCK_BARREL_OPEN, 1, 1);
        menu.open(p);
    }

    protected boolean isInvalidInventory(@Nonnull Block block) {
        Material type = block.getType();
        switch (type) {
            case CHEST:
            case TRAPPED_CHEST:
            case BARREL:
                return false;
            default:
                return !SlimefunTag.SHULKER_BOXES.isTagged(type);
        }
    }

    @Nonnull
    public static String format(double number) {
        return FORMAT.format(number);
    }

    @Override
    public int getCapacity() {
        return energyCapacity;
    }

    public int getEnergyConsumption() {
        return energyConsumed;
    }

    @Nonnull
    public final BasicQuarry setCapacity(int capacity) {
        Validate.isTrue(capacity > 0, "The capacity must be greater than zero!");
        if (getState() == ItemState.UNREGISTERED) {
            energyCapacity = capacity;
            return this;
        } else {
            throw new IllegalStateException("You cannot modify the capacity after the Item was registered.");
        }
    }

    @Nonnull
    public final BasicQuarry setEnergyConsumption(int energyConsumption) {
        Validate.isTrue(energyConsumption > 0, "The energy consumption must be greater than zero!");
        Validate.isTrue(energyCapacity > 0, "You must specify the capacity before you can set the consumption amount.");
        Validate.isTrue(energyConsumption <= energyCapacity, "The energy consumption cannot be higher than the capacity (" + energyCapacity + ')');
        this.energyConsumed = energyConsumption;
        return this;
    }

    @Nonnull
    @Override
    public final EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.CONSUMER;
    }

    public BasicQuarry setOutput(ItemStack[] output){
        this.output = output;
        return this;
    }

    public ItemStack[] getOutput() {
        return output;
    }


}