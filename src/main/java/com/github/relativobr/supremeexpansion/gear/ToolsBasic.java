package com.github.relativobr.supremeexpansion.gear;

import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class ToolsBasic {

  public static final SlimefunItemStack ADAMANTIUM_AXE =
      new SlimefunItemStack(
          "TOOLS_ADAMANTIUM_AXE",
          Material.DIAMOND_AXE,
          "&f&lAdamantium Axe",
          "&f&lA Axe of Adamantium");
  public static final ItemStack[] RECIPE_ADAMANTIUM_AXE = {
    SupremeComponents.ADAMANTIUM_PLATE,
    SupremeComponents.ADAMANTIUM_PLATE,
    null,
    SupremeComponents.ADAMANTIUM_PLATE,
    new ItemStack(Material.STICK),
    null,
    null,
    new ItemStack(Material.STICK),
    null
  };

  public static final SlimefunItemStack AURUM_AXE =
      new SlimefunItemStack(
          "TOOLS_AURUM_AXE", Material.DIAMOND_AXE, "&f&lAurum Axe", "&f&lA Axe of Aurum");
  public static final ItemStack[] RECIPE_AURUM_AXE = {
    SupremeComponents.AURUM_PLATE,
    SupremeComponents.AURUM_PLATE,
    null,
    SupremeComponents.AURUM_PLATE,
    new ItemStack(Material.STICK),
    null,
    null,
    new ItemStack(Material.STICK),
    null
  };

  public static final SlimefunItemStack TITANIUM_AXE =
      new SlimefunItemStack(
          "TOOLS_TITANIUM_AXE", Material.DIAMOND_AXE, "&f&lTitanium Axe", "&f&lA Axe of Titanium");
  public static final ItemStack[] RECIPE_TITANIUM_AXE = {
    SupremeComponents.TITANIUM_PLATE,
    SupremeComponents.TITANIUM_PLATE,
    null,
    SupremeComponents.TITANIUM_PLATE,
    new ItemStack(Material.STICK),
    null,
    null,
    new ItemStack(Material.STICK),
    null
  };

  public static final SlimefunItemStack ADAMANTIUM_PICKAXE =
      new SlimefunItemStack(
          "TOOLS_ADAMANTIUM_PICKAXE",
          Material.DIAMOND_PICKAXE,
          "&f&lAdamantium Pickaxe",
          "&f&lA Pickaxe of Adamantium");
  public static final ItemStack[] RECIPE_ADAMANTIUM_PICKAXE = {
    SupremeComponents.ADAMANTIUM_PLATE,
    SupremeComponents.ADAMANTIUM_PLATE,
    SupremeComponents.ADAMANTIUM_PLATE,
    null,
    new ItemStack(Material.STICK),
    null,
    null,
    new ItemStack(Material.STICK),
    null
  };

  public static final SlimefunItemStack AURUM_PICKAXE =
      new SlimefunItemStack(
          "TOOLS_AURUM_PICKAXE",
          Material.DIAMOND_PICKAXE,
          "&f&lAurum Pickaxe",
          "&f&lA Pickaxe of Aurum");
  public static final ItemStack[] RECIPE_AURUM_PICKAXE = {
    SupremeComponents.AURUM_PLATE,
    SupremeComponents.AURUM_PLATE,
    SupremeComponents.AURUM_PLATE,
    null,
    new ItemStack(Material.STICK),
    null,
    null,
    new ItemStack(Material.STICK),
    null
  };

  public static final SlimefunItemStack TITANIUM_PICKAXE =
      new SlimefunItemStack(
          "TOOLS_TITANIUM_PICKAXE",
          Material.DIAMOND_PICKAXE,
          "&f&lTitanium Pickaxe",
          "&f&lA Pickaxe of Titanium");
  public static final ItemStack[] RECIPE_TITANIUM_PICKAXE = {
    SupremeComponents.TITANIUM_PLATE,
    SupremeComponents.TITANIUM_PLATE,
    SupremeComponents.TITANIUM_PLATE,
    null,
    new ItemStack(Material.STICK),
    null,
    null,
    new ItemStack(Material.STICK),
    null
  };

  public static final SlimefunItemStack ADAMANTIUM_SHOVEL =
      new SlimefunItemStack(
          "TOOLS_ADAMANTIUM_SHOVEL",
          Material.DIAMOND_SHOVEL,
          "&f&lAdamantium Shovel",
          "&f&lA Shovel of Adamantium");
  public static final ItemStack[] RECIPE_ADAMANTIUM_SHOVEL = {
    null, SupremeComponents.ADAMANTIUM_PLATE, null,
    null, new ItemStack(Material.STICK), null,
    null, new ItemStack(Material.STICK), null
  };

  public static final SlimefunItemStack AURUM_SHOVEL =
      new SlimefunItemStack(
          "TOOLS_AURUM_SHOVEL",
          Material.DIAMOND_SHOVEL,
          "&f&lAurum Shovel",
          "&f&lA Shovel of Aurum");
  public static final ItemStack[] RECIPE_AURUM_SHOVEL = {
    null, SupremeComponents.AURUM_PLATE, null,
    null, new ItemStack(Material.STICK), null,
    null, new ItemStack(Material.STICK), null
  };

  public static final SlimefunItemStack TITANIUM_SHOVEL =
      new SlimefunItemStack(
          "TOOLS_TITANIUM_SHOVEL",
          Material.DIAMOND_SHOVEL,
          "&f&lTitanium Shovel",
          "&f&lA Shovel of Titanium");
  public static final ItemStack[] RECIPE_TITANIUM_SHOVEL = {
    null, SupremeComponents.TITANIUM_PLATE, null,
    null, new ItemStack(Material.STICK), null,
    null, new ItemStack(Material.STICK), null
  };
}
