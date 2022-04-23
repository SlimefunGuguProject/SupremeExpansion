package com.github.relativobr.supremeexpansion.gear.thornium;

import com.github.relativobr.supremeexpansion.magical.Cetrus;
import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Chestplate {

  public static final SlimefunItemStack THORNIUM_CHESTPLATE = new SlimefunItemStack(
      "ARMOR_THORNIUM_CHESTPLATE",
      Material.NETHERITE_CHESTPLATE, "&f&l钍石胸甲", "&f&l由钍做的胸甲");
  public static final ItemStack[] RECIPE_THORNIUM_CHESTPLATE = {
      Components.THORNIUM_INGOT, null, Components.THORNIUM_INGOT,
      Components.THORNIUM_INGOT, Cetrus.CETRUS_LUMIUM, Components.THORNIUM_INGOT,
      Components.THORNIUM_INGOT, Components.THORNIUM_INGOT, Components.THORNIUM_INGOT
  };

  public static final SlimefunItemStack THORNIUM_CHESTPLATE_MAGIC = new SlimefunItemStack(
      "ARMOR_THORNIUM_CHESTPLATE_MAGIC",
      Material.NETHERITE_CHESTPLATE, "&a&l魔法胸甲", "&f&l一件蕴含魔法的胸甲");

  public static final SlimefunItemStack THORNIUM_CHESTPLATE_RARE = new SlimefunItemStack(
      "ARMOR_THORNIUM_CHESTPLATE_RARE",
      Material.NETHERITE_CHESTPLATE, "&b&l珍馐胸甲", "&f&l一件珍奇的胸甲");

  public static final SlimefunItemStack THORNIUM_CHESTPLATE_EPIC = new SlimefunItemStack(
      "ARMOR_THORNIUM_CHESTPLATE_EPIC",
      Material.NETHERITE_CHESTPLATE, "&d&l精英胸甲", "&f&l一件精良的胸甲");

  public static final SlimefunItemStack THORNIUM_CHESTPLATE_LEGENDARY = new SlimefunItemStack(
      "ARMOR_THORNIUM_CHESTPLATE_LEGENDARY",
      Material.NETHERITE_CHESTPLATE, "&6&l神话胸甲",
      "&f&l它曾在历史书上出现过");

  public static final SlimefunItemStack THORNIUM_CHESTPLATE_SUPREME = new SlimefunItemStack(
      "ARMOR_THORNIUM_CHESTPLATE_SUPREME",
      Material.NETHERITE_CHESTPLATE, "&4&l至尊胸甲",
      "&f&l至尊的终极胸甲");

}
