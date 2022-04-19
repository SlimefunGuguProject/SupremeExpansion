package com.github.relativobr.supremeexpansion.gear.thornium;

import com.github.relativobr.supremeexpansion.magical.Cetrus;
import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class Axe {


  public static final SlimefunItemStack THORNIUM_AXE = new SlimefunItemStack("TOOLS_THORNIUM_AXE",
      Material.NETHERITE_AXE, "&f&lThornium Axe", "&f&lA Axe of Thornium");
  public static final ItemStack[] RECIPE_THORNIUM_AXE = {
      Components.THORNIUM_INGOT, Cetrus.CETRUS_VENTUS, null,
      Components.THORNIUM_INGOT, SlimefunItems.STAFF_ELEMENTAL, null,
      null, SlimefunItems.STAFF_ELEMENTAL, null
  };

  public static final SlimefunItemStack THORNIUM_AXE_MAGIC = new SlimefunItemStack(
      "TOOLS_THORNIUM_AXE_MAGIC",
      Material.NETHERITE_AXE, "&a&lMagic Axe", "&f&lA Magic Axe of Thornium");

  public static final SlimefunItemStack THORNIUM_AXE_RARE = new SlimefunItemStack(
      "TOOLS_THORNIUM_AXE_RARE",
      Material.NETHERITE_AXE, "&b&lRare Axe", "&f&lA Rare Axe of Thornium");

  public static final SlimefunItemStack THORNIUM_AXE_EPIC = new SlimefunItemStack(
      "TOOLS_THORNIUM_AXE_EPIC",
      Material.NETHERITE_AXE, "&d&lEpic Axe", "&f&lA Epic Axe of Thornium");

  public static final SlimefunItemStack THORNIUM_AXE_LEGENDARY = new SlimefunItemStack(
      "TOOLS_THORNIUM_AXE_LEGENDARY",
      Material.NETHERITE_AXE, "&6&lLegendary Axe", "&f&lA Legendary Axe of Thornium");

  public static final SlimefunItemStack THORNIUM_AXE_SUPREME = new SlimefunItemStack(
      "TOOLS_THORNIUM_AXE_SUPREME",
      Material.NETHERITE_AXE, "&4&lSupreme Axe", "&f&lA Supreme Axe of Thornium");

}
