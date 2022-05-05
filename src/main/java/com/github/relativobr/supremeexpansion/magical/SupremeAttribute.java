package com.github.relativobr.supremeexpansion.magical;

import com.github.relativobr.supremeexpansion.core.SupremeMainCore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeAttribute {

  public static final SlimefunItemStack ATTRIBUTE_MAGIC =
      new SlimefunItemStack(
          "ATTRIBUTE_MAGIC",
          "16d1c19b0dabdf7360fbd18df9dfd1c615da2f8d2c84fc4216565d9c5dd",
          "&aAttribute Magic",
          "",
          "&7A super magic attribute with special effects");
  public static final ItemStack[] RECIPE_ATTRIBUTE_MAGIC = {
    new SlimefunItemStack(SupremeCetrus.CETRUS_LUX, 1),
    new SlimefunItemStack(SupremeCetrus.CETRUS_VENTUS, 1),
    new SlimefunItemStack(SupremeCetrus.CETRUS_LUX, 1),
    new SlimefunItemStack(SupremeCetrus.CETRUS_AQUA, 1),
    new ItemStack(Material.NETHER_WART, 64),
    new SlimefunItemStack(SupremeCetrus.CETRUS_AQUA, 1),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_LIFE, 1),
    new SlimefunItemStack(SupremeCetrus.CETRUS_VENTUS, 1),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_NATURE, 1)
  };

  public static final SlimefunItemStack ATTRIBUTE_BOMB =
      new SlimefunItemStack(
          "ATTRIBUTE_BOMB",
          "44253275e1b7757130a2d637d07f522fcc6686dc804346f0e71668d5ce6d5891",
          "&aAttribute Bomb",
          "",
          "&7A super bomb attribute with special effects");
  public static final ItemStack[] RECIPE_ATTRIBUTE_BOMB = {
    new SlimefunItemStack(SupremeCetrus.CETRUS_IGNIS, 1),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_BLOCK, 1),
    new SlimefunItemStack(SupremeCetrus.CETRUS_IGNIS, 1),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_BLOCK, 1),
    new ItemStack(Material.GUNPOWDER, 64),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_BLOCK, 1),
    new SlimefunItemStack(SupremeCetrus.CETRUS_IGNIS, 1),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_BLOCK, 1),
    new SlimefunItemStack(SupremeCetrus.CETRUS_IGNIS, 1)
  };

  public static final SlimefunItemStack ATTRIBUTE_FORTUNE =
      new SlimefunItemStack(
          "ATTRIBUTE_FORTUNE",
          "81251d814bdea8fc4881aeb6e7d1f48a2edf9cdba9ab4e3fa7f7359c5b92",
          "&aAttribute Fortune",
          "",
          "&7A super fortune attribute with special effects");
  public static final ItemStack[] RECIPE_ATTRIBUTE_FORTUNE = {
    new ItemStack(Material.DIAMOND_BLOCK, 64),
    new ItemStack(Material.GOLD_BLOCK, 64),
    new ItemStack(Material.NETHERITE_BLOCK, 64),
    new SlimefunItemStack(SupremeAttribute.getMagic(), 1),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_ALLOY, 1),
    new SlimefunItemStack(SupremeAttribute.getMagic(), 1),
    new ItemStack(Material.OBSIDIAN, 64),
    new ItemStack(Material.REDSTONE_BLOCK, 64),
    new ItemStack(Material.NETHER_STAR, 64)
  };

  public static final SlimefunItemStack ATTRIBUTE_IMPETUS =
      new SlimefunItemStack(
          "ATTRIBUTE_IMPETUS",
          "f2d27936be90709046d9b4eec4e2a67d6ed583e4cf94f53c0569431357423",
          "&aAttribute Impetus",
          "",
          "&7A super impetus attribute with special effects");
  public static final ItemStack[] RECIPE_ATTRIBUTE_IMPETUS = {
    new SlimefunItemStack(SupremeAttribute.getMagic(), 1),
    new SlimefunItemStack(SupremeAttribute.getBomb(), 1),
    new SlimefunItemStack(SupremeCetrus.CETRUS_AQUA, 1),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_DEATH, 1),
    new SlimefunItemStack(SupremeCetrus.CETRUS_IGNIS, 1),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_DEATH, 1),
    new SlimefunItemStack(SupremeCetrus.CETRUS_VENTUS, 1),
    new SlimefunItemStack(SupremeAttribute.getFortune(), 1),
    new SlimefunItemStack(SupremeCetrus.CETRUS_LUMIUM, 1)
  };

  public static SlimefunItemStack getMagic() {
    final SlimefunItemStack attributeMagic = SupremeAttribute.ATTRIBUTE_MAGIC;
    attributeMagic.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 20);
    attributeMagic.addUnsafeEnchantment(Enchantment.DURABILITY, 20);
    attributeMagic.addUnsafeEnchantment(Enchantment.MENDING, 10);
    return attributeMagic;
  }

  public static SlimefunItemStack getBomb() {
    final SlimefunItemStack attributeBomb = SupremeAttribute.ATTRIBUTE_BOMB;
    attributeBomb.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 20);
    attributeBomb.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 20);
    attributeBomb.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 20);
    attributeBomb.addUnsafeEnchantment(Enchantment.THORNS, 10);
    return attributeBomb;
  }

  public static SlimefunItemStack getFortune() {
    final SlimefunItemStack attributeFortune = SupremeAttribute.ATTRIBUTE_FORTUNE;
    attributeFortune.addUnsafeEnchantment(Enchantment.DIG_SPEED, 20);
    attributeFortune.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 10);
    return attributeFortune;
  }

  public static SlimefunItemStack getImpetus() {
    final SlimefunItemStack attributeImpetus = SupremeAttribute.ATTRIBUTE_IMPETUS;
    attributeImpetus.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 20);
    attributeImpetus.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 10);
    attributeImpetus.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 10);
    return attributeImpetus;
  }
}
