package com.github.relativobr.supremeexpansion.gear.basic;

import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class BasicPickaxe {

  public static final SlimefunItemStack ADAMANTIUM_PICKAXE = new SlimefunItemStack(
      "TOOLS_ADAMANTIUM_PICKAXE",
      Material.DIAMOND_PICKAXE, "&f&lAdamantium Pickaxe", "&f&lA Pickaxe of Adamantium");
  public static final ItemStack[] RECIPE_ADAMANTIUM_PICKAXE = {
      Components.ADAMANTIUM_PLATE, Components.ADAMANTIUM_PLATE, Components.ADAMANTIUM_PLATE,
      null, new ItemStack(Material.STICK), null,
      null, new ItemStack(Material.STICK), null
  };

  public static final SlimefunItemStack AURUM_PICKAXE = new SlimefunItemStack("TOOLS_AURUM_PICKAXE",
      Material.DIAMOND_PICKAXE, "&f&lAurum Pickaxe", "&f&lA Pickaxe of Aurum");
  public static final ItemStack[] RECIPE_AURUM_PICKAXE = {
      Components.AURUM_PLATE, Components.AURUM_PLATE, Components.AURUM_PLATE,
      null, new ItemStack(Material.STICK), null,
      null, new ItemStack(Material.STICK), null
  };

  public static final SlimefunItemStack TITANIUM_PICKAXE = new SlimefunItemStack(
      "TOOLS_TITANIUM_PICKAXE",
      Material.DIAMOND_PICKAXE, "&f&lTitanium Pickaxe", "&f&lA Pickaxe of Titanium");
  public static final ItemStack[] RECIPE_TITANIUM_PICKAXE = {
      Components.TITANIUM_PLATE, Components.TITANIUM_PLATE, Components.TITANIUM_PLATE,
      null, new ItemStack(Material.STICK), null,
      null, new ItemStack(Material.STICK), null
  };

}
