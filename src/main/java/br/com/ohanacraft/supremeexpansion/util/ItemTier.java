package br.com.ohanacraft.supremeexpansion.util;

import br.com.ohanacraft.supremeexpansion.magical.Cetrus;
import br.com.ohanacraft.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

public class ItemTier {

  public static ItemStack[] getMagic(SlimefunItemStack preItem) {
    return new ItemStack[]{
        Components.THORNIUM_BIT_SYNTHETIC, preItem, Components.THORNIUM_BIT_SYNTHETIC,
        Components.THORNIUM_BIT_SYNTHETIC, new ItemStack(Cetrus.CETRUS_IGNIS),
        Components.THORNIUM_BIT_SYNTHETIC,
        Components.THORNIUM_BIT_SYNTHETIC, preItem, Components.THORNIUM_BIT_SYNTHETIC
    };
  }

  public static ItemStack[] getRare(SlimefunItemStack preItem) {
    return new ItemStack[]{
        Components.THORNIUM_DUST_SYNTHETIC, preItem, Components.THORNIUM_DUST_SYNTHETIC,
        Components.THORNIUM_DUST_SYNTHETIC, new ItemStack(Cetrus.CETRUS_VENTUS),
        Components.THORNIUM_DUST_SYNTHETIC,
        Components.THORNIUM_DUST_SYNTHETIC, preItem, Components.THORNIUM_DUST_SYNTHETIC
    };
  }

  public static ItemStack[] getEpic(SlimefunItemStack preItem) {
    return new ItemStack[]{
        Components.THORNIUM_INGOT_SYNTHETIC, preItem, Components.THORNIUM_INGOT_SYNTHETIC,
        Components.THORNIUM_INGOT_SYNTHETIC, new ItemStack(Cetrus.CETRUS_LUX),
        Components.THORNIUM_INGOT_SYNTHETIC,
        Components.THORNIUM_INGOT_SYNTHETIC, preItem, Components.THORNIUM_INGOT_SYNTHETIC
    };
  }

  public static ItemStack[] getLegendary(SlimefunItemStack preItem) {
    return new ItemStack[]{
        Components.THORNIUM_CARBONADO, preItem, Components.THORNIUM_CARBONADO,
        Components.THORNIUM_CARBONADO, new ItemStack(Cetrus.CETRUS_LUMIUM),
        Components.THORNIUM_CARBONADO,
        Components.THORNIUM_CARBONADO, preItem, Components.THORNIUM_CARBONADO
    };
  }

  public static ItemStack[] getSupreme(SlimefunItemStack preItem) {
    return new ItemStack[]{
        Components.THORNIUM_ENERGIZED, preItem, Components.THORNIUM_ENERGIZED,
        Components.THORNIUM_ENERGIZED, Components.SUPREME, Components.THORNIUM_ENERGIZED,
        Components.THORNIUM_ENERGIZED, preItem, Components.THORNIUM_ENERGIZED
    };
  }

}
