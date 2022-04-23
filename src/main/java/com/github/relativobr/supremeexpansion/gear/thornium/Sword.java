package com.github.relativobr.supremeexpansion.gear.thornium;

import com.github.relativobr.supremeexpansion.magical.Cetrus;
import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class Sword {


  public static final SlimefunItemStack THORNIUM_SWORD = new SlimefunItemStack(
      "WEAPONS_THORNIUM_SWORD",
      Material.NETHERITE_SWORD, "&f&l钍石剑", "&f&l由钍制成的剑");
  public static final ItemStack[] RECIPE_THORNIUM_SWORD = {
      null, Components.THORNIUM_INGOT, null,
      null, Components.THORNIUM_INGOT, null,
      null, Cetrus.CETRUS_LUMIUM, null
  };

  public static final SlimefunItemStack THORNIUM_SWORD_MAGIC = new SlimefunItemStack(
      "WEAPONS_THORNIUM_SWORD_MAGIC",
      Material.NETHERITE_SWORD, "&a&l魔法剑", "&f&l一把蕴含魔法的剑");

  public static final SlimefunItemStack THORNIUM_SWORD_RARE = new SlimefunItemStack(
      "WEAPONS_THORNIUM_SWORD_RARE",
      Material.NETHERITE_SWORD, "&b&l珍馐剑", "&f&l一把珍奇的剑");

  public static final SlimefunItemStack THORNIUM_SWORD_EPIC = new SlimefunItemStack(
      "WEAPONS_THORNIUM_SWORD_EPIC",
      Material.NETHERITE_SWORD, "&d&l精英剑", "&f&l一把精良的剑");

  public static final SlimefunItemStack THORNIUM_SWORD_LEGENDARY = new SlimefunItemStack(
      "WEAPONS_THORNIUM_SWORD_LEGENDARY",
      Material.NETHERITE_SWORD, "&6&l神话剑", "&f&l它曾在历史书上出现过");

  public static final SlimefunItemStack THORNIUM_SWORD_SUPREME = new SlimefunItemStack(
      "WEAPONS_THORNIUM_SWORD_SUPREME",
      Material.NETHERITE_SWORD, "&4&l至尊剑", "&f&l至尊的终极之剑");

}
