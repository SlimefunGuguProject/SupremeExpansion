package com.github.relativobr.supremeexpansion.gear;

import com.github.relativobr.supremeexpansion.Categories;
import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.machine.MultiBlockGearFabricator;
import com.github.relativobr.supremeexpansion.util.ItemTier;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;
import javax.annotation.Nonnull;
import org.bukkit.inventory.ItemStack;


public class AbstractWeapons extends SlimefunItem implements Soulbound, NotPlaceable {


  public AbstractWeapons(@Nonnull SlimefunItemStack stack, ItemStack[] recipe) {
    super(Categories.WEAPONS_CATEGORY, stack, MultiBlockGearFabricator.getMachine(), recipe);
  }

  public static void setup(SupremeExpansion plugin) {

    // add Enchant
    plugin.addGearEnchants(WeaponsBasic.TITANIUM_SWORD,
        WeaponsBasic.AURUM_SWORD,
        WeaponsBasic.ADAMANTIUM_SWORD
    );

    // add Enchant
    plugin.addSupremeEnchantsAndSoulbound(WeaponsThornium.THORNIUM_BOW,
        WeaponsThornium.THORNIUM_BOW_MAGIC,
        WeaponsThornium.THORNIUM_BOW_RARE,
        WeaponsThornium.THORNIUM_BOW_EPIC, WeaponsThornium.THORNIUM_BOW_LEGENDARY,
        WeaponsThornium.THORNIUM_BOW_SUPREME,
        WeaponsThornium.THORNIUM_SWORD, WeaponsThornium.THORNIUM_SWORD_MAGIC,
        WeaponsThornium.THORNIUM_SWORD_RARE,
        WeaponsThornium.THORNIUM_SWORD_EPIC, WeaponsThornium.THORNIUM_SWORD_LEGENDARY,
        WeaponsThornium.THORNIUM_SWORD_SUPREME,
        WeaponsThornium.THORNIUM_SHIELD, WeaponsThornium.THORNIUM_SHIELD_MAGIC,
        WeaponsThornium.THORNIUM_SHIELD_RARE,
        WeaponsThornium.THORNIUM_SHIELD_EPIC, WeaponsThornium.THORNIUM_SHIELD_LEGENDARY,
        WeaponsThornium.THORNIUM_SHIELD_SUPREME
    );

    final AbstractWeapons bow = new AbstractWeapons(WeaponsThornium.THORNIUM_BOW,
        WeaponsThornium.RECIPE_THORNIUM_BOW);
    bow.register(plugin);
    final AbstractWeapons bowMagic = new AbstractWeapons(WeaponsThornium.THORNIUM_BOW_MAGIC,
        ItemTier.getMagic(WeaponsThornium.THORNIUM_BOW));
    bowMagic.register(plugin);
    final AbstractWeapons bowRare = new AbstractWeapons(WeaponsThornium.THORNIUM_BOW_RARE,
        ItemTier.getRare(WeaponsThornium.THORNIUM_BOW_MAGIC));
    bowRare.register(plugin);
    final AbstractWeapons bowEpic = new AbstractWeapons(WeaponsThornium.THORNIUM_BOW_EPIC,
        ItemTier.getEpic(WeaponsThornium.THORNIUM_BOW_RARE));
    bowEpic.register(plugin);
    final AbstractWeapons bowLegendary = new AbstractWeapons(WeaponsThornium.THORNIUM_BOW_LEGENDARY,
        ItemTier.getLegendary(WeaponsThornium.THORNIUM_BOW_EPIC));
    bowLegendary.register(plugin);
    final AbstractWeapons bowSupreme = new AbstractWeapons(WeaponsThornium.THORNIUM_BOW_SUPREME,
        ItemTier.getSupreme(WeaponsThornium.THORNIUM_BOW_LEGENDARY));
    bowSupreme.register(plugin);

    final AbstractWeapons titaniumSword = new AbstractWeapons(WeaponsBasic.TITANIUM_SWORD,
        WeaponsBasic.RECIPE_TITANIUM_SWORD);
    titaniumSword.register(plugin);
    final AbstractWeapons aurumSword = new AbstractWeapons(WeaponsBasic.AURUM_SWORD,
        WeaponsBasic.RECIPE_AURUM_SWORD);
    aurumSword.register(plugin);
    final AbstractWeapons adamantiumSword = new AbstractWeapons(WeaponsBasic.ADAMANTIUM_SWORD,
        WeaponsBasic.RECIPE_ADAMANTIUM_SWORD);
    adamantiumSword.register(plugin);

    final AbstractWeapons sword = new AbstractWeapons(WeaponsThornium.THORNIUM_SWORD,
        WeaponsThornium.RECIPE_THORNIUM_SWORD);
    sword.register(plugin);
    final AbstractWeapons swordMagic = new AbstractWeapons(WeaponsThornium.THORNIUM_SWORD_MAGIC,
        ItemTier.getMagic(WeaponsThornium.THORNIUM_SWORD));
    swordMagic.register(plugin);
    final AbstractWeapons swordRare = new AbstractWeapons(WeaponsThornium.THORNIUM_SWORD_RARE,
        ItemTier.getRare(WeaponsThornium.THORNIUM_SWORD_MAGIC));
    swordRare.register(plugin);
    final AbstractWeapons swordEpic = new AbstractWeapons(WeaponsThornium.THORNIUM_SWORD_EPIC,
        ItemTier.getEpic(WeaponsThornium.THORNIUM_SWORD_RARE));
    swordEpic.register(plugin);
    final AbstractWeapons swordLegendary = new AbstractWeapons(WeaponsThornium.THORNIUM_SWORD_LEGENDARY,
        ItemTier.getLegendary(WeaponsThornium.THORNIUM_SWORD_EPIC));
    swordLegendary.register(plugin);
    final AbstractWeapons swordSupreme = new AbstractWeapons(WeaponsThornium.THORNIUM_SWORD_SUPREME,
        ItemTier.getSupreme(WeaponsThornium.THORNIUM_SWORD_LEGENDARY));
    swordSupreme.register(plugin);

    final AbstractWeapons shield = new AbstractWeapons(WeaponsThornium.THORNIUM_SHIELD,
        WeaponsThornium.RECIPE_THORNIUM_SHIELD);
    shield.register(plugin);
    final AbstractWeapons shieldMagic = new AbstractWeapons(WeaponsThornium.THORNIUM_SHIELD_MAGIC,
        ItemTier.getMagic(WeaponsThornium.THORNIUM_SHIELD));
    shieldMagic.register(plugin);
    final AbstractWeapons shieldRare = new AbstractWeapons(WeaponsThornium.THORNIUM_SHIELD_RARE,
        ItemTier.getRare(WeaponsThornium.THORNIUM_SHIELD_MAGIC));
    shieldRare.register(plugin);
    final AbstractWeapons shieldEpic = new AbstractWeapons(WeaponsThornium.THORNIUM_SHIELD_EPIC,
        ItemTier.getEpic(WeaponsThornium.THORNIUM_SHIELD_RARE));
    shieldEpic.register(plugin);
    final AbstractWeapons shieldLegendary = new AbstractWeapons(WeaponsThornium.THORNIUM_SHIELD_LEGENDARY,
        ItemTier.getLegendary(WeaponsThornium.THORNIUM_SHIELD_EPIC));
    shieldLegendary.register(plugin);
    final AbstractWeapons shieldSupreme = new AbstractWeapons(WeaponsThornium.THORNIUM_SHIELD_SUPREME,
        ItemTier.getSupreme(WeaponsThornium.THORNIUM_SHIELD_LEGENDARY));
    shieldSupreme.register(plugin);

  }

}
