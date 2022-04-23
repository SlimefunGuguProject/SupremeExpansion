package com.github.relativobr.supremeexpansion.gear.thornium;

import com.github.relativobr.supremeexpansion.magical.Cetrus;
import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Leggings {

  public static final SlimefunItemStack THORNIUM_LEGGINGS = new SlimefunItemStack(
      "ARMOR_THORNIUM_LEGGINGS",
      Material.NETHERITE_LEGGINGS, "&f&l钍石护腿", "&f&lA leggings of Thornium");
  public static final ItemStack[] RECIPE_THORNIUM_LEGGINGS = {
      Cetrus.CETRUS_VENTUS, Components.THORNIUM_INGOT, Cetrus.CETRUS_VENTUS,
      Components.THORNIUM_INGOT, null, Components.THORNIUM_INGOT,
      Components.THORNIUM_INGOT, null, Components.THORNIUM_INGOT
  };

  public static final SlimefunItemStack THORNIUM_LEGGINGS_MAGIC = new SlimefunItemStack(
      "ARMOR_THORNIUM_LEGGINGS_MAGIC",
      Material.NETHERITE_LEGGINGS, "&a&l魔法护腿", "&f&l一件蕴含魔法的护腿");

  public static final SlimefunItemStack THORNIUM_LEGGINGS_RARE = new SlimefunItemStack(
      "ARMOR_THORNIUM_LEGGINGS_RARE",
      Material.NETHERITE_LEGGINGS, "&b&l珍馐护腿", "&f&l一件珍奇的护腿");

  public static final SlimefunItemStack THORNIUM_LEGGINGS_EPIC = new SlimefunItemStack(
      "ARMOR_THORNIUM_LEGGINGS_EPIC",
      Material.NETHERITE_LEGGINGS, "&d&l精英护腿", "&f&l一件精良的护腿");

  public static final SlimefunItemStack THORNIUM_LEGGINGS_LEGENDARY = new SlimefunItemStack(
      "ARMOR_THORNIUM_LEGGINGS_LEGENDARY",
      Material.NETHERITE_LEGGINGS, "&6&l神话护腿",
      "&f&l它曾在历史书上出现过");

  public static final SlimefunItemStack THORNIUM_LEGGINGS_SUPREME = new SlimefunItemStack(
      "ARMOR_THORNIUM_LEGGINGS_SUPREME",
      Material.NETHERITE_LEGGINGS, "&4&l至尊护腿", "&f&l至尊的终极护腿");

}
