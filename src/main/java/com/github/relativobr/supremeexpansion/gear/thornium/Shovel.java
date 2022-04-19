package com.github.relativobr.supremeexpansion.gear.thornium;

import com.github.relativobr.supremeexpansion.magical.Cetrus;
import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class Shovel {


  public static final SlimefunItemStack THORNIUM_SHOVEL = new SlimefunItemStack(
      "TOOLS_THORNIUM_SHOVEL",
      Material.NETHERITE_SHOVEL, "&f&lThornium Shovel", "&f&lA Shovel of Thornium");
  public static final ItemStack[] RECIPE_THORNIUM_SHOVEL = {
      null, Components.THORNIUM_INGOT, null,
      null, Cetrus.CETRUS_AQUA, null,
      null, SlimefunItems.STAFF_ELEMENTAL, null
  };

  public static final SlimefunItemStack THORNIUM_SHOVEL_MAGIC = new SlimefunItemStack(
      "TOOLS_THORNIUM_SHOVEL_MAGIC",
      Material.NETHERITE_SHOVEL, "&a&lMagic Shovel", "&f&lA Magic Shovel of Thornium");

  public static final SlimefunItemStack THORNIUM_SHOVEL_RARE = new SlimefunItemStack(
      "TOOLS_THORNIUM_SHOVEL_RARE",
      Material.NETHERITE_SHOVEL, "&b&lRare Shovel", "&f&lA Rare Shovel of Thornium");

  public static final SlimefunItemStack THORNIUM_SHOVEL_EPIC = new SlimefunItemStack(
      "TOOLS_THORNIUM_SHOVEL_EPIC",
      Material.NETHERITE_SHOVEL, "&d&lEpic Shovel", "&f&lA Epic Shovel of Thornium");

  public static final SlimefunItemStack THORNIUM_SHOVEL_LEGENDARY = new SlimefunItemStack(
      "TOOLS_THORNIUM_SHOVEL_LEGENDARY",
      Material.NETHERITE_SHOVEL, "&6&lLegendary Shovel", "&f&lA Legendary Shovel of Thornium");

  public static final SlimefunItemStack THORNIUM_SHOVEL_SUPREME = new SlimefunItemStack(
      "TOOLS_THORNIUM_SHOVEL_SUPREME",
      Material.NETHERITE_SHOVEL, "&4&lSupreme Shovel", "&f&lA Supreme Shovel of Thornium");

}
