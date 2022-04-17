package br.com.ohanacraft.supremeexpansion.magical;

import br.com.ohanacraft.supremeexpansion.core.SupremeCore;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public class Cetrus {


    public static final SlimefunItemStack CETRUS_LUX = new SlimefunItemStack("CETRUS_LUX",
            Material.PAPER, "&aCetro Lux", "", "&7A super lux scepter");
    public static final ItemStack[] RECIPE_CETRUS_LUX = {
            new ItemStack(Material.FLINT, 64),   new ItemStack(Material.GLOWSTONE, 64),   new ItemStack(Material.TORCH, 64),
            new SlimefunItemStack(SupremeCore.CORE_OF_LIFE, 1),   new ItemStack(Material.CAMPFIRE, 64),   new SlimefunItemStack(SupremeCore.CORE_OF_NATURE, 1),
            new ItemStack(Material.REDSTONE_LAMP, 64),   new ItemStack(Material.SEA_LANTERN, 64),   new ItemStack(Material.SHROOMLIGHT, 64)
    };

    public static final SlimefunItemStack CETRUS_VENTUS = new SlimefunItemStack("CETRUS_VENTUS",
            Material.PAPER, "&aCetro Ventus", "", "&7A super ventus scepter");
    public static final ItemStack[] RECIPE_CETRUS_VENTUS = {
            new ItemStack(Material.FEATHER, 64),   new ItemStack(Material.LEATHER, 64),   new ItemStack(Material.CHORUS_FRUIT, 64),
            new SlimefunItemStack(SupremeCore.CORE_OF_DEATH, 1),   new ItemStack(Material.COBBLESTONE, 64),   new SlimefunItemStack(SupremeCore.CORE_OF_COLOR, 1),
            new ItemStack(Material.ARROW, 64),   new ItemStack(Material.PHANTOM_MEMBRANE, 64),   new ItemStack(Material.ENDER_PEARL, 16)
    };

    public static final SlimefunItemStack CETRUS_LUMIUM = new SlimefunItemStack("CETRUS_LUMIUM",
            Material.PAPER, "&aCetro Lumium", "", "&7A super lumium scepter");
    public static final ItemStack[] RECIPE_CETRUS_LUMIUM = {
            new SlimefunItemStack(SupremeCore.CORE_OF_LIFE,1),   new ItemStack(Material.WITHER_SKELETON_SKULL, 64),    new SlimefunItemStack(SupremeCore.CORE_OF_COLOR,1),
            new SlimefunItemStack(SupremeCore.CORE_OF_BLOCK,1),  new ItemStack(Material.NETHER_STAR, 64),     new SlimefunItemStack(SupremeCore.CORE_OF_ALLOY,1),
            new SlimefunItemStack(SupremeCore.CORE_OF_NATURE,1),  new ItemStack(Material.DRAGON_BREATH, 16),    new SlimefunItemStack(SupremeCore.CORE_OF_DEATH,1)
    };

    public static final SlimefunItemStack CETRUS_AQUA = new SlimefunItemStack("CETRUS_AQUA",
            Material.PAPER, "&aCetro Aqua", "", "&7A super aqua scepter");
    public static final ItemStack[] RECIPE_CETRUS_AQUA = {
          new ItemStack(Material.ICE, 64),   new ItemStack(Material.LILY_PAD, 64),   new ItemStack(Material.SALMON, 64),
          new ItemStack(Material.COD, 64),   new SlimefunItemStack(SupremeCore.CORE_OF_NATURE, 2),   new ItemStack(Material.TROPICAL_FISH, 64),
          new ItemStack(Material.PUFFERFISH, 64),   new ItemStack(Material.NAUTILUS_SHELL, 64),   new ItemStack(Material.WATER_BUCKET, 1)
    };

    public static final SlimefunItemStack CETRUS_IGNIS = new SlimefunItemStack("CETRUS_IGNIS",
            Material.PAPER, "&aCetro Ignis", "", "&7A super ignis scepter");
    public static final ItemStack[] RECIPE_CETRUS_IGNIS = {
            new ItemStack(Material.NETHERRACK, 64),   new ItemStack(Material.BLAZE_ROD, 64),   new ItemStack(Material.SOUL_SAND, 64),
            new ItemStack(Material.QUARTZ_BLOCK, 64),   new SlimefunItemStack(SupremeCore.CORE_OF_BLOCK, 2),   new ItemStack(Material.MAGMA_CREAM, 64),
            new ItemStack(Material.GUNPOWDER, 64),   new ItemStack(Material.OBSIDIAN, 64),   new ItemStack(Material.LAVA_BUCKET, 1)
    };

}
