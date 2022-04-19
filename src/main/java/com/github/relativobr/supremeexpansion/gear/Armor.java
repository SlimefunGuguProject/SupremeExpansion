package com.github.relativobr.supremeexpansion.gear;

import com.github.relativobr.supremeexpansion.Categories;
import com.github.relativobr.supremeexpansion.util.ItemTier;
import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.gear.basic.BasicArmor;
import com.github.relativobr.supremeexpansion.gear.thornium.Boots;
import com.github.relativobr.supremeexpansion.gear.thornium.Chestplate;
import com.github.relativobr.supremeexpansion.gear.thornium.Helmet;
import com.github.relativobr.supremeexpansion.gear.thornium.Leggings;
import com.github.relativobr.supremeexpansion.machine.multiBlock.GearFabricator;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.ProtectionType;
import io.github.thebusybiscuit.slimefun4.core.attributes.ProtectiveArmor;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;
import io.github.thebusybiscuit.slimefun4.implementation.items.armor.SlimefunArmorPiece;
import javax.annotation.Nonnull;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;


public class Armor extends SlimefunArmorPiece implements ProtectiveArmor, Soulbound, NotPlaceable {


  private Armor(SupremeExpansion plugin, SlimefunItemStack item, ItemStack[] recipe) {
    super(Categories.ARMOR_CATEGORY, item, GearFabricator.getMachine(), recipe,
        plugin.getSupremeEffects(item));
  }

  public static void setup(SupremeExpansion plugin) {

    // add Enchant
    plugin.addGearEnchants(BasicArmor.TITANIUM_HELMET,
        BasicArmor.AURUM_HELMET,
        BasicArmor.ADAMANTIUM_HELMET,
        BasicArmor.TITANIUM_CHESTPLATE,
        BasicArmor.AURUM_CHESTPLATE,
        BasicArmor.ADAMANTIUM_CHESTPLATE,
        BasicArmor.TITANIUM_LEGGINGS,
        BasicArmor.AURUM_LEGGINGS,
        BasicArmor.ADAMANTIUM_LEGGINGS,
        BasicArmor.TITANIUM_BOOTS,
        BasicArmor.AURUM_BOOTS,
        BasicArmor.ADAMANTIUM_BOOTS
    );

    // add Enchant
    plugin.addSupremeEnchantsAndSoulbound(Helmet.THORNIUM_HELMET, Helmet.THORNIUM_HELMET_MAGIC,
        Helmet.THORNIUM_HELMET_RARE,
        Helmet.THORNIUM_HELMET_EPIC, Helmet.THORNIUM_HELMET_LEGENDARY,
        Helmet.THORNIUM_HELMET_SUPREME,
        Chestplate.THORNIUM_CHESTPLATE, Chestplate.THORNIUM_CHESTPLATE_MAGIC,
        Chestplate.THORNIUM_CHESTPLATE_RARE,
        Chestplate.THORNIUM_CHESTPLATE_EPIC, Chestplate.THORNIUM_CHESTPLATE_LEGENDARY,
        Chestplate.THORNIUM_CHESTPLATE_SUPREME,
        Leggings.THORNIUM_LEGGINGS, Leggings.THORNIUM_LEGGINGS_MAGIC,
        Leggings.THORNIUM_LEGGINGS_RARE,
        Leggings.THORNIUM_LEGGINGS_EPIC, Leggings.THORNIUM_LEGGINGS_LEGENDARY,
        Leggings.THORNIUM_LEGGINGS_SUPREME,
        Boots.THORNIUM_BOOTS, Boots.THORNIUM_BOOTS_MAGIC, Boots.THORNIUM_BOOTS_RARE,
        Boots.THORNIUM_BOOTS_EPIC, Boots.THORNIUM_BOOTS_LEGENDARY, Boots.THORNIUM_BOOTS_SUPREME
    );

    new Armor(plugin, BasicArmor.TITANIUM_HELMET, BasicArmor.RECIPE_TITANIUM_HELMET).register(
        plugin);
    new Armor(plugin, BasicArmor.AURUM_HELMET, BasicArmor.RECIPE_AURUM_HELMET).register(plugin);
    new Armor(plugin, BasicArmor.ADAMANTIUM_HELMET, BasicArmor.RECIPE_ADAMANTIUM_HELMET).register(
        plugin);
    new Armor(plugin, Helmet.THORNIUM_HELMET, Helmet.RECIPE_THORNIUM_HELMET).register(plugin);
    new Armor(plugin, Helmet.THORNIUM_HELMET_MAGIC,
        ItemTier.getMagic(Helmet.THORNIUM_HELMET)).register(plugin);
    new Armor(plugin, Helmet.THORNIUM_HELMET_RARE,
        ItemTier.getRare(Helmet.THORNIUM_HELMET_MAGIC)).register(plugin);
    new Armor(plugin, Helmet.THORNIUM_HELMET_EPIC,
        ItemTier.getEpic(Helmet.THORNIUM_HELMET_RARE)).register(plugin);
    new Armor(plugin, Helmet.THORNIUM_HELMET_LEGENDARY,
        ItemTier.getLegendary(Helmet.THORNIUM_HELMET_EPIC)).register(plugin);
    new Armor(plugin, Helmet.THORNIUM_HELMET_SUPREME,
        ItemTier.getSupreme(Helmet.THORNIUM_HELMET_LEGENDARY)).register(plugin);

    new Armor(plugin, BasicArmor.TITANIUM_CHESTPLATE,
        BasicArmor.RECIPE_TITANIUM_CHESTPLATE).register(plugin);
    new Armor(plugin, BasicArmor.AURUM_CHESTPLATE, BasicArmor.RECIPE_AURUM_CHESTPLATE).register(
        plugin);
    new Armor(plugin, BasicArmor.ADAMANTIUM_CHESTPLATE,
        BasicArmor.RECIPE_ADAMANTIUM_CHESTPLATE).register(plugin);
    new Armor(plugin, Chestplate.THORNIUM_CHESTPLATE,
        Chestplate.RECIPE_THORNIUM_CHESTPLATE).register(plugin);
    new Armor(plugin, Chestplate.THORNIUM_CHESTPLATE_MAGIC,
        ItemTier.getMagic(Chestplate.THORNIUM_CHESTPLATE)).register(plugin);
    new Armor(plugin, Chestplate.THORNIUM_CHESTPLATE_RARE,
        ItemTier.getRare(Chestplate.THORNIUM_CHESTPLATE_MAGIC)).register(plugin);
    new Armor(plugin, Chestplate.THORNIUM_CHESTPLATE_EPIC,
        ItemTier.getEpic(Chestplate.THORNIUM_CHESTPLATE_RARE)).register(plugin);
    new Armor(plugin, Chestplate.THORNIUM_CHESTPLATE_LEGENDARY,
        ItemTier.getLegendary(Chestplate.THORNIUM_CHESTPLATE_EPIC)).register(plugin);
    new Armor(plugin, Chestplate.THORNIUM_CHESTPLATE_SUPREME,
        ItemTier.getSupreme(Chestplate.THORNIUM_CHESTPLATE_LEGENDARY)).register(plugin);

    new Armor(plugin, BasicArmor.TITANIUM_LEGGINGS, BasicArmor.RECIPE_TITANIUM_LEGGINGS).register(
        plugin);
    new Armor(plugin, BasicArmor.AURUM_LEGGINGS, BasicArmor.RECIPE_AURUM_LEGGINGS).register(plugin);
    new Armor(plugin, BasicArmor.ADAMANTIUM_LEGGINGS,
        BasicArmor.RECIPE_ADAMANTIUM_LEGGINGS).register(plugin);
    new Armor(plugin, Leggings.THORNIUM_LEGGINGS, Leggings.RECIPE_THORNIUM_LEGGINGS).register(
        plugin);
    new Armor(plugin, Leggings.THORNIUM_LEGGINGS_MAGIC,
        ItemTier.getMagic(Leggings.THORNIUM_LEGGINGS)).register(plugin);
    new Armor(plugin, Leggings.THORNIUM_LEGGINGS_RARE,
        ItemTier.getRare(Leggings.THORNIUM_LEGGINGS_MAGIC)).register(plugin);
    new Armor(plugin, Leggings.THORNIUM_LEGGINGS_EPIC,
        ItemTier.getEpic(Leggings.THORNIUM_LEGGINGS_RARE)).register(plugin);
    new Armor(plugin, Leggings.THORNIUM_LEGGINGS_LEGENDARY,
        ItemTier.getLegendary(Leggings.THORNIUM_LEGGINGS_EPIC)).register(plugin);
    new Armor(plugin, Leggings.THORNIUM_LEGGINGS_SUPREME,
        ItemTier.getSupreme(Leggings.THORNIUM_LEGGINGS_LEGENDARY)).register(plugin);

    new Armor(plugin, BasicArmor.TITANIUM_BOOTS, BasicArmor.RECIPE_TITANIUM_BOOTS).register(plugin);
    new Armor(plugin, BasicArmor.AURUM_BOOTS, BasicArmor.RECIPE_AURUM_BOOTS).register(plugin);
    new Armor(plugin, BasicArmor.ADAMANTIUM_BOOTS, BasicArmor.RECIPE_ADAMANTIUM_BOOTS).register(
        plugin);
    new Armor(plugin, Boots.THORNIUM_BOOTS, Boots.RECIPE_THORNIUM_BOOTS).register(plugin);
    new Armor(plugin, Boots.THORNIUM_BOOTS_MAGIC, ItemTier.getMagic(Boots.THORNIUM_BOOTS)).register(
        plugin);
    new Armor(plugin, Boots.THORNIUM_BOOTS_RARE,
        ItemTier.getRare(Boots.THORNIUM_BOOTS_MAGIC)).register(plugin);
    new Armor(plugin, Boots.THORNIUM_BOOTS_EPIC,
        ItemTier.getEpic(Boots.THORNIUM_BOOTS_RARE)).register(plugin);
    new Armor(plugin, Boots.THORNIUM_BOOTS_LEGENDARY,
        ItemTier.getLegendary(Boots.THORNIUM_BOOTS_EPIC)).register(plugin);
    new Armor(plugin, Boots.THORNIUM_BOOTS_SUPREME,
        ItemTier.getSupreme(Boots.THORNIUM_BOOTS_LEGENDARY)).register(plugin);


  }

  @Nonnull
  @Override
  public ProtectionType[] getProtectionTypes() {
    return new ProtectionType[]{
        ProtectionType.BEES, ProtectionType.RADIATION, ProtectionType.FLYING_INTO_WALL
    };
  }

  @Override
  public boolean isFullSetRequired() {
    return false;
  }

  @Nonnull
  @Override
  public NamespacedKey getArmorSetId() {
    return new NamespacedKey(getAddon().getJavaPlugin(), "supreme_armor");
  }

}
