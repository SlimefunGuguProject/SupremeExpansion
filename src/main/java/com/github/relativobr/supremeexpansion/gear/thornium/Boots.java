package com.github.relativobr.supremeexpansion.gear.thornium;

import com.github.relativobr.supremeexpansion.magical.Cetrus;
import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Boots {

  public static final SlimefunItemStack THORNIUM_BOOTS = new SlimefunItemStack(
      "ARMOR_THORNIUM_BOOTS",
      Material.NETHERITE_BOOTS, "&f&l钍石靴", "&f&l由钍做的靴子");
  public static final ItemStack[] RECIPE_THORNIUM_BOOTS = {
      null, null, null,
      Cetrus.CETRUS_IGNIS, null, Cetrus.CETRUS_IGNIS,
      Components.THORNIUM_INGOT, null, Components.THORNIUM_INGOT
  };

  public static final SlimefunItemStack THORNIUM_BOOTS_MAGIC = new SlimefunItemStack(
      "ARMOR_THORNIUM_BOOTS_MAGIC",
      Material.NETHERITE_BOOTS, "&a&l魔法靴", "&f&l一双蕴含魔法的靴子");

  public static final SlimefunItemStack THORNIUM_BOOTS_RARE = new SlimefunItemStack(
      "ARMOR_THORNIUM_BOOTS_RARE",
      Material.NETHERITE_BOOTS, "&b&l珍馐靴", "&f&l一双珍奇的靴子");

  public static final SlimefunItemStack THORNIUM_BOOTS_EPIC = new SlimefunItemStack(
      "ARMOR_THORNIUM_BOOTS_EPIC",
      Material.NETHERITE_BOOTS, "&d&l精英斧", "&f&l一双精良的靴子");

  public static final SlimefunItemStack THORNIUM_BOOTS_LEGENDARY = new SlimefunItemStack(
      "ARMOR_THORNIUM_BOOTS_LEGENDARY",
      Material.NETHERITE_BOOTS, "&6&l神话斧", "&f&l他曾在历史书上出现过");

  public static final SlimefunItemStack THORNIUM_BOOTS_SUPREME = new SlimefunItemStack(
      "ARMOR_THORNIUM_BOOTS_SUPREME",
      Material.NETHERITE_BOOTS, "&4&l至尊斧", "&f&l至尊的终极之靴");

}
