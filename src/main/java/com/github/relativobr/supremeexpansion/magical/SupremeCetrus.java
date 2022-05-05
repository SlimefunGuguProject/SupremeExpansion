package com.github.relativobr.supremeexpansion.magical;

import com.github.relativobr.supremeexpansion.core.SupremeMainCore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeCetrus {

  public static final SlimefunItemStack CETRUS_LUX =
      new SlimefunItemStack(
          "CETRUS_LUX",
          "92cb6e51c461e7359526bea5e06209cddde7c6469a819f3405cf0a038c159502",
          "&aCetrus Lux",
          "",
          "&7A super lux scepter");
  public static final ItemStack[] RECIPE_CETRUS_LUX = {
    new ItemStack(Material.FLINT, 64),
    new ItemStack(Material.GLOWSTONE, 64),
    new ItemStack(Material.TORCH, 64),
    new ItemStack(Material.CAMPFIRE, 64),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_LIFE, 1),
    new ItemStack(Material.SEA_LANTERN, 64),
    new ItemStack(Material.REDSTONE_LAMP, 64),
    new ItemStack(Material.SEA_LANTERN, 64),
    new ItemStack(Material.SHROOMLIGHT, 64)
  };

  public static final SlimefunItemStack CETRUS_VENTUS =
      new SlimefunItemStack(
          "CETRUS_VENTUS",
          "b28f1c0c5092e12d33770df45c5845a9610886039b34abe93a16c5e942dfc8e4",
          "&aCetrus Ventus",
          "",
          "&7A super ventus scepter");
  public static final ItemStack[] RECIPE_CETRUS_VENTUS = {
    new ItemStack(Material.FEATHER, 64),
    new ItemStack(Material.LEATHER, 64),
    new ItemStack(Material.CHORUS_FRUIT, 64),
    new ItemStack(Material.COBBLESTONE, 64),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_NATURE, 1),
    new ItemStack(Material.SAND, 64),
    new ItemStack(Material.ARROW, 64),
    new ItemStack(Material.PHANTOM_MEMBRANE, 64),
    new ItemStack(Material.ENDER_PEARL, 16)
  };

  public static final SlimefunItemStack CETRUS_LUMIUM =
      new SlimefunItemStack(
          "CETRUS_LUMIUM",
          "4b1cce22de19ed6727abc5e6c2d57864c871a44c956bbe2eb3960269b686b8b3",
          "&aCetrus Lumium",
          "",
          "&7A super lumium scepter");
  public static final ItemStack[] RECIPE_CETRUS_LUMIUM = {
    new ItemStack(Material.DIRT, 64),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_BLOCK, 1),
    new ItemStack(Material.GRASS_BLOCK, 64),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_LIFE, 1),
    new ItemStack(Material.OBSIDIAN, 64),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_DEATH, 1),
    new ItemStack(Material.WITHER_SKELETON_SKULL, 64),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_ALLOY, 1),
    new ItemStack(Material.NETHER_STAR, 64)
  };

  public static final SlimefunItemStack CETRUS_AQUA =
      new SlimefunItemStack(
          "CETRUS_AQUA",
          "36161daa3589ec9c8187459ac36fd4dd2646c040678d3bfacb72a2210c6c801c",
          "&aCetrus Aqua",
          "",
          "&7A super aqua scepter");
  public static final ItemStack[] RECIPE_CETRUS_AQUA = {
    new ItemStack(Material.ICE, 64),
    new ItemStack(Material.LILY_PAD, 64),
    new ItemStack(Material.SALMON, 64),
    new ItemStack(Material.COD, 64),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_DEATH, 1),
    new ItemStack(Material.TROPICAL_FISH, 64),
    new ItemStack(Material.PUFFERFISH, 64),
    new ItemStack(Material.NAUTILUS_SHELL, 64),
    new ItemStack(Material.WATER_BUCKET, 1)
  };

  public static final SlimefunItemStack CETRUS_IGNIS =
      new SlimefunItemStack(
          "CETRUS_IGNIS",
          "e672959028f274b379d430f068f0f15a4f793eac12afb94ae0b4e50cf895df0f",
          "&aCetrus Ignis",
          "",
          "&7A super ignis scepter");
  public static final ItemStack[] RECIPE_CETRUS_IGNIS = {
    new ItemStack(Material.NETHERRACK, 64),
    new ItemStack(Material.BLAZE_ROD, 64),
    new ItemStack(Material.SOUL_SAND, 64),
    new ItemStack(Material.QUARTZ_BLOCK, 64),
    new SlimefunItemStack(SupremeMainCore.CORE_OF_BLOCK, 1),
    new ItemStack(Material.MAGMA_CREAM, 64),
    new ItemStack(Material.GUNPOWDER, 64),
    new ItemStack(Material.OBSIDIAN, 64),
    new ItemStack(Material.LAVA_BUCKET, 1)
  };
}
