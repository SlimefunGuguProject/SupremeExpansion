package com.github.relativobr.supremeexpansion.magical;

import com.github.relativobr.supremeexpansion.core.SupremeCore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class Attribute {

  public static final SlimefunItemStack ATTRIBUTE_MAGIC = new SlimefunItemStack("ATTRIBUTE_MAGIC",
      "16d1c19b0dabdf7360fbd18df9dfd1c615da2f8d2c84fc4216565d9c5dd", "&a魔法属性", "",
      "&7具有特殊效果的超级魔法属性");
  public static final ItemStack[] RECIPE_ATTRIBUTE_MAGIC = {
      new SlimefunItemStack(Cetrus.CETRUS_LUX, 1), new SlimefunItemStack(Cetrus.CETRUS_VENTUS, 1),
      new SlimefunItemStack(Cetrus.CETRUS_LUX, 1),
      new SlimefunItemStack(Cetrus.CETRUS_AQUA, 1), new ItemStack(Material.NETHER_WART, 64),
      new SlimefunItemStack(Cetrus.CETRUS_AQUA, 1),
      new SlimefunItemStack(SupremeCore.CORE_OF_LIFE, 1),
      new SlimefunItemStack(Cetrus.CETRUS_VENTUS, 1),
      new SlimefunItemStack(SupremeCore.CORE_OF_NATURE, 1)
  };

  public static final SlimefunItemStack ATTRIBUTE_BOMB = new SlimefunItemStack("ATTRIBUTE_BOMB",
      "44253275e1b7757130a2d637d07f522fcc6686dc804346f0e71668d5ce6d5891", "&a爆炸属性", "",
      "&7具有特殊效果的超级爆炸属性");
  public static final ItemStack[] RECIPE_ATTRIBUTE_BOMB = {
      new SlimefunItemStack(Cetrus.CETRUS_IGNIS, 1),
      new SlimefunItemStack(SupremeCore.CORE_OF_BLOCK, 1),
      new SlimefunItemStack(Cetrus.CETRUS_IGNIS, 1),
      new SlimefunItemStack(SupremeCore.CORE_OF_BLOCK, 1), new ItemStack(Material.GUNPOWDER, 64),
      new SlimefunItemStack(SupremeCore.CORE_OF_BLOCK, 1),
      new SlimefunItemStack(Cetrus.CETRUS_IGNIS, 1),
      new SlimefunItemStack(SupremeCore.CORE_OF_BLOCK, 1),
      new SlimefunItemStack(Cetrus.CETRUS_IGNIS, 1)
  };

  public static final SlimefunItemStack ATTRIBUTE_FORTUNE = new SlimefunItemStack(
      "ATTRIBUTE_FORTUNE",
      "81251d814bdea8fc4881aeb6e7d1f48a2edf9cdba9ab4e3fa7f7359c5b92", "&a幸运属性", "",
      "&7具有特殊效果的超级幸运属性");
  public static final ItemStack[] RECIPE_ATTRIBUTE_FORTUNE = {
      new ItemStack(Material.DIAMOND_BLOCK, 64), new ItemStack(Material.GOLD_BLOCK, 64),
      new ItemStack(Material.NETHERITE_BLOCK, 64),
      new SlimefunItemStack(Attribute.getMagic(), 1),
      new SlimefunItemStack(SupremeCore.CORE_OF_ALLOY, 1),
      new SlimefunItemStack(Attribute.getMagic(), 1),
      new ItemStack(Material.OBSIDIAN, 64), new ItemStack(Material.REDSTONE_BLOCK, 64),
      new ItemStack(Material.NETHER_STAR, 64)
  };

  public static final SlimefunItemStack ATTRIBUTE_IMPETUS = new SlimefunItemStack(
      "ATTRIBUTE_IMPETUS",
      "f2d27936be90709046d9b4eec4e2a67d6ed583e4cf94f53c0569431357423", "&a速度属性", "",
      "&7具有特殊效果的超级速度属性");
  public static final ItemStack[] RECIPE_ATTRIBUTE_IMPETUS = {
      new SlimefunItemStack(Attribute.getMagic(), 1), new SlimefunItemStack(Attribute.getBomb(), 1),
      new SlimefunItemStack(Cetrus.CETRUS_AQUA, 1),
      new SlimefunItemStack(SupremeCore.CORE_OF_DEATH, 1),
      new SlimefunItemStack(Cetrus.CETRUS_IGNIS, 1),
      new SlimefunItemStack(SupremeCore.CORE_OF_DEATH, 1),
      new SlimefunItemStack(Cetrus.CETRUS_VENTUS, 1),
      new SlimefunItemStack(Attribute.getFortune(), 1),
      new SlimefunItemStack(Cetrus.CETRUS_LUMIUM, 1)
  };

  public static SlimefunItemStack getMagic() {
    final SlimefunItemStack attributeMagic = Attribute.ATTRIBUTE_MAGIC;
    attributeMagic.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 20);
    attributeMagic.addUnsafeEnchantment(Enchantment.DURABILITY, 20);
    attributeMagic.addUnsafeEnchantment(Enchantment.MENDING, 10);
    return attributeMagic;
  }

  public static SlimefunItemStack getBomb() {
    final SlimefunItemStack attributeBomb = Attribute.ATTRIBUTE_BOMB;
    attributeBomb.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 20);
    attributeBomb.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 20);
    attributeBomb.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 20);
    attributeBomb.addUnsafeEnchantment(Enchantment.THORNS, 10);
    return attributeBomb;
  }

  public static SlimefunItemStack getFortune() {
    final SlimefunItemStack attributeFortune = Attribute.ATTRIBUTE_FORTUNE;
    attributeFortune.addUnsafeEnchantment(Enchantment.DIG_SPEED, 20);
    attributeFortune.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 10);
    return attributeFortune;
  }

  public static SlimefunItemStack getImpetus() {
    final SlimefunItemStack attributeImpetus = Attribute.ATTRIBUTE_IMPETUS;
    attributeImpetus.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 20);
    attributeImpetus.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 10);
    attributeImpetus.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 10);
    return attributeImpetus;
  }

}
