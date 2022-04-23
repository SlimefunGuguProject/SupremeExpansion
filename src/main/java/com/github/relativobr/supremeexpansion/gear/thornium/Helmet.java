package com.github.relativobr.supremeexpansion.gear.thornium;

import com.github.relativobr.supremeexpansion.magical.Cetrus;
import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Helmet {

  public static final SlimefunItemStack THORNIUM_HELMET = new SlimefunItemStack(
      "ARMOR_THORNIUM_HELMET",
      Material.NETHERITE_HELMET, "&f&l钍石头盔", "&f&l由钍做的头盔");
  public static final ItemStack[] RECIPE_THORNIUM_HELMET = {
      Components.THORNIUM_INGOT, Cetrus.CETRUS_AQUA, Components.THORNIUM_INGOT,
      Components.THORNIUM_INGOT, null, Components.THORNIUM_INGOT,
      null, null, null
  };

  public static final SlimefunItemStack THORNIUM_HELMET_MAGIC = new SlimefunItemStack(
      "ARMOR_THORNIUM_HELMET_MAGIC",
      Material.NETHERITE_HELMET, "&a&l魔法头盔", "&f&l一件蕴含魔法的头盔");

  public static final SlimefunItemStack THORNIUM_HELMET_RARE = new SlimefunItemStack(
      "ARMOR_THORNIUM_HELMET_RARE",
      Material.NETHERITE_HELMET, "&b&l珍馐头盔", "&f&l一件珍奇的头盔");

  public static final SlimefunItemStack THORNIUM_HELMET_EPIC = new SlimefunItemStack(
      "ARMOR_THORNIUM_HELMET_EPIC",
      Material.NETHERITE_HELMET, "&d&l精英头盔", "&f&l一件精良的头盔");

  public static final SlimefunItemStack THORNIUM_HELMET_LEGENDARY = new SlimefunItemStack(
      "ARMOR_THORNIUM_HELMET_LEGENDARY",
      Material.NETHERITE_HELMET, "&6&l神话头盔", "&f&l它曾在历史书上出现过");

  public static final SlimefunItemStack THORNIUM_HELMET_SUPREME = new SlimefunItemStack(
      "ARMOR_THORNIUM_HELMET_SUPREME",
      Material.NETHERITE_HELMET, "&4&l至尊头盔", "&f&l至尊的终极头盔");

}
