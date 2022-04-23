package com.github.relativobr.supremeexpansion.gear.basic;

import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class BasicShovel {

  public static final SlimefunItemStack ADAMANTIUM_SHOVEL = new SlimefunItemStack(
      "TOOLS_ADAMANTIUM_SHOVEL",
      Material.DIAMOND_SHOVEL, "&f&l精金锹", "&f&l由精金制成");
  public static final ItemStack[] RECIPE_ADAMANTIUM_SHOVEL = {
      null, Components.ADAMANTIUM_PLATE, null,
      null, new ItemStack(Material.STICK), null,
      null, new ItemStack(Material.STICK), null
  };

  public static final SlimefunItemStack AURUM_SHOVEL = new SlimefunItemStack("TOOLS_AURUM_SHOVEL",
      Material.DIAMOND_SHOVEL, "&f&l金合金锹", "&f&l由金合金制成");
  public static final ItemStack[] RECIPE_AURUM_SHOVEL = {
      null, Components.AURUM_PLATE, null,
      null, new ItemStack(Material.STICK), null,
      null, new ItemStack(Material.STICK), null
  };

  public static final SlimefunItemStack TITANIUM_SHOVEL = new SlimefunItemStack(
      "TOOLS_TITANIUM_SHOVEL",
      Material.DIAMOND_SHOVEL, "&f&l钛合金锹", "&f&l由钛合金制成");
  public static final ItemStack[] RECIPE_TITANIUM_SHOVEL = {
      null, Components.TITANIUM_PLATE, null,
      null, new ItemStack(Material.STICK), null,
      null, new ItemStack(Material.STICK), null
  };

}
