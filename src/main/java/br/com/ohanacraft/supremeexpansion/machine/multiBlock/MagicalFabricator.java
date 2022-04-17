package br.com.ohanacraft.supremeexpansion.machine.multiBlock;

import br.com.ohanacraft.supremeexpansion.SupremeExpansion;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.multiblocks.MultiBlockMachine;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.inventory.ItemUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Dispenser;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.Map;

public class MagicalFabricator extends MultiBlockMachine implements NotPlaceable {

    private final SupremeExpansion plugin;

    public static final SlimefunItemStack MAGICAL_FABRICATOR = new SlimefunItemStack("MACHINE_MAGICAL_FABRICATOR",
            Material.CRYING_OBSIDIAN, "&eMagical Fabricator",
            "", "&7&oYou can craft magical here!",
            "", "&aMultiBlock Machine");

    public static final RecipeType MACHINE_MAGICAL_FABRICATOR = new RecipeType(new NamespacedKey(SupremeExpansion.instance,
            "MACHINE_MAGICAL_FABRICATOR_KEY"), MAGICAL_FABRICATOR);

    @ParametersAreNonnullByDefault
    public MagicalFabricator(SupremeExpansion plugin, Category category) {
        super(category, MAGICAL_FABRICATOR, new ItemStack[] {
                        new ItemStack(Material.CRYING_OBSIDIAN), new ItemStack(Material.PURPLE_STAINED_GLASS), new ItemStack(Material.CRYING_OBSIDIAN),
                        new ItemStack(Material.IRON_BARS), new ItemStack(Material.IRON_TRAPDOOR), new ItemStack(Material.IRON_BARS),
                        new ItemStack(Material.NETHERITE_BLOCK), new ItemStack(Material.DISPENSER), new ItemStack(Material.NETHERITE_BLOCK) },
                new ItemStack[0], BlockFace.SELF);
        this.plugin = plugin;
    }

    public static RecipeType getMachine() {
        return MACHINE_MAGICAL_FABRICATOR;
    }

    @Override
    public void onInteract(Player p, Block b) {

        Block dispenser = b.getRelative(BlockFace.DOWN);
        if(!dispenser.isEmpty()) {

            Inventory inv = ((Dispenser) dispenser.getState()).getInventory();
            List<ItemStack[]> inputs = RecipeType.getRecipeInputList(this);

            recipe:
            for (ItemStack[] input : inputs) {
                for (int i = 0; i < inv.getContents().length; i++) {
                    final ItemStack content = inv.getContents()[i];
                    final ItemStack itemStack = input[i];
                    if(itemStack != null) {
                        final Map<Enchantment, Integer> enchantments = itemStack.getEnchantments();
                        if (!SlimefunUtils.isItemSimilar(content, itemStack, true, true)
                                || (!enchantments.isEmpty() && enchantments.equals(content.getEnchantments()))) {
                            continue recipe;
                        }
                    } else if(content != null) {
                        continue recipe;
                    }
                }

                ItemStack output = RecipeType.getRecipeOutputList(this, input);
                SlimefunItem outputItem = SlimefunItem.getByItem(output);

                if (outputItem == null || outputItem.canUse(p, true)) {

                    Inventory outputInv = findOutputInventory(output, dispenser, inv);
                    boolean canFit = false;
                    for (int i = 0; i < inv.getContents().length; i++) {
                        if (inv.getContents()[i] != null || inv.getContents()[i].getAmount() == inv.getContents()[i].getMaxStackSize()
                                || outputInv != null ) {
                            canFit = true;
                        }
                    }


                    if (!canFit) {
                        SlimefunPlugin.getLocalization().sendMessage(p, "machines.full-inventory", true);
                        return;
                    }

                    for (int i = 0; i < inv.getContents().length; i++) {
                        ItemStack item = inv.getItem(i);
                        if (item != null) {
                            ItemUtils.consumeItem(item, input[i].getAmount(), false);
                        }
                    }

                    Bukkit.getScheduler().runTaskLater(plugin, () -> p.getWorld().playSound(dispenser.getLocation(),
                            Sound.BLOCK_LAVA_EXTINGUISH, 1F, 1F), 55L);
                    for (int i = 1; i < 7; i++) {
                        Bukkit.getScheduler().runTaskLater(plugin, () -> p.getWorld().playSound(dispenser.getLocation(),
                                Sound.BLOCK_METAL_PLACE, 7F, 1F), i * 5L);
                    }

                    if(outputInv != null){
                        outputInv.addItem(output);
                    } else {
                        inv.addItem(output);
                    }

                }

                return;

            }
        }

        SlimefunPlugin.getLocalization().sendMessage(p, "machines.pattern-not-found", true);

    }

}
