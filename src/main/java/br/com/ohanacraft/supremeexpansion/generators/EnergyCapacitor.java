package br.com.ohanacraft.supremeexpansion.generators;

import br.com.ohanacraft.supremeexpansion.Categories;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.Capacitor;
import org.bukkit.inventory.ItemStack;

public class EnergyCapacitor extends Capacitor {

  public EnergyCapacitor(SlimefunItemStack item, ItemStack[] recipe, int capacity) {
    super(Categories.ELECTRIC_CATEGORY, capacity, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
  }

}
