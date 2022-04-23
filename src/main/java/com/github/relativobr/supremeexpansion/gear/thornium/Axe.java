package com.github.relativobr.supremeexpansion.gear.thornium;

import com.github.relativobr.supremeexpansion.magical.Cetrus;
import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class Axe {


  public static final SlimefunItemStack THORNIUM_AXE = new SlimefunItemStack("TOOLS_THORNIUM_AXE",
      Material.NETHERITE_AXE, "&f&l钍石斧", "&f&l由钍做的斧头");
  public static final ItemStack[] RECIPE_THORNIUM_AXE = {
      Components.THORNIUM_INGOT, Cetrus.CETRUS_VENTUS, null,
      Components.THORNIUM_INGOT, SlimefunItems.STAFF_ELEMENTAL, null,
      null, SlimefunItems.STAFF_ELEMENTAL, null
  };

  public static final SlimefunItemStack THORNIUM_AXE_MAGIC = new SlimefunItemStack(
      "TOOLS_THORNIUM_AXE_MAGIC",
      Material.NETHERITE_AXE, "&a&l魔法斧", "&f&l一把蕴含魔法的斧头");

  public static final SlimefunItemStack THORNIUM_AXE_RARE = new SlimefunItemStack(
      "TOOLS_THORNIUM_AXE_RARE",
      Material.NETHERITE_AXE, "&b&l珍馐斧", "&f&l一把珍奇的斧头");

  public static final SlimefunItemStack THORNIUM_AXE_EPIC = new SlimefunItemStack(
      "TOOLS_THORNIUM_AXE_EPIC",
      Material.NETHERITE_AXE, "&d&l精英斧", "&f&l一把精良的斧头");

  public static final SlimefunItemStack THORNIUM_AXE_LEGENDARY = new SlimefunItemStack(
      "TOOLS_THORNIUM_AXE_LEGENDARY",
      Material.NETHERITE_AXE, "&6&l神话斧", "&f&l它曾在历史书上出现过");

  public static final SlimefunItemStack THORNIUM_AXE_SUPREME = new SlimefunItemStack(
      "TOOLS_THORNIUM_AXE_SUPREME",
      Material.NETHERITE_AXE, "&4&l至尊斧", "&f&l至尊的终极之斧");

}
