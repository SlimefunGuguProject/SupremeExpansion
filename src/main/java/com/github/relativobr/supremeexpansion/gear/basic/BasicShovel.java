package com.github.relativobr.supremeexpansion.gear.basic;

import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class BasicShovel {

  public static final SlimefunItemStack ADAMANTIUM_SHOVEL = new SlimefunItemStack(
      "TOOLS_ADAMANTIUM_SHOVEL",
      Material.DIAMOND_SHOVEL, "&f&lAdamantium Shovel", "&f&lA Shovel of Adamantium");
  public static final ItemStack[] RECIPE_ADAMANTIUM_SHOVEL = {
      null, Components.ADAMANTIUM_PLATE, null,
      null, new ItemStack(Material.STICK), null,
      null, new ItemStack(Material.STICK), null
  };

  public static final SlimefunItemStack AURUM_SHOVEL = new SlimefunItemStack("TOOLS_AURUM_SHOVEL",
      Material.DIAMOND_SHOVEL, "&f&lAurum Shovel", "&f&lA Shovel of Aurum");
  public static final ItemStack[] RECIPE_AURUM_SHOVEL = {
      null, Components.AURUM_PLATE, null,
      null, new ItemStack(Material.STICK), null,
      null, new ItemStack(Material.STICK), null
  };

  public static final SlimefunItemStack TITANIUM_SHOVEL = new SlimefunItemStack(
      "TOOLS_TITANIUM_SHOVEL",
      Material.DIAMOND_SHOVEL, "&f&lTitanium Shovel", "&f&lA Shovel of Titanium");
  public static final ItemStack[] RECIPE_TITANIUM_SHOVEL = {
      null, Components.TITANIUM_PLATE, null,
      null, new ItemStack(Material.STICK), null,
      null, new ItemStack(Material.STICK), null
  };

}
