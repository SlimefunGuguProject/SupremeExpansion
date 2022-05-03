package com.github.relativobr.supremeexpansion.setup;

import com.github.relativobr.supremeexpansion.Categories;
import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.machine.MultiBlockMagicalFabricator;
import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import com.github.relativobr.util.ItemNotPlaceable;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import javax.annotation.Nonnull;
import org.bukkit.inventory.ItemStack;

public class SetupSupremeComponents {


  public static void setup(@Nonnull SupremeExpansion plugin) {

    registerSmeltery(plugin, SupremeComponents.ALLOY_ZIRCONIUM, SupremeComponents.RECIPE_ALLOY_ZIRCONIUM);
    registerSmeltery(plugin, SupremeComponents.ALLOY_TITANIUM, SupremeComponents.RECIPE_ALLOY_TITANIUM);
    registerSmeltery(plugin, SupremeComponents.ALLOY_IRIDIUM, SupremeComponents.RECIPE_ALLOY_IRIDIUM);
    registerSmeltery(plugin, SupremeComponents.ALLOY_AURUM, SupremeComponents.RECIPE_ALLOY_AURUM);
    registerSmeltery(plugin, SupremeComponents.ALLOY_MANGANESE, SupremeComponents.RECIPE_ALLOY_MANGANESE);
    registerSmeltery(plugin, SupremeComponents.ALLOY_PLATINUM, SupremeComponents.RECIPE_ALLOY_PLATINUM);
    registerSmeltery(plugin, SupremeComponents.ALLOY_ADAMANTIUM, SupremeComponents.RECIPE_ALLOY_ADAMANTIUM);

    registerEnhancedCraft(plugin, SupremeComponents.ZIRCONIUM_PLATE, SupremeComponents.RECIPE_ZIRCONIUM_PLATE);
    registerEnhancedCraft(plugin, SupremeComponents.TITANIUM_PLATE, SupremeComponents.RECIPE_TITANIUM_PLATE);
    registerEnhancedCraft(plugin, SupremeComponents.IRIDIUM_PLATE, SupremeComponents.RECIPE_IRIDIUM_PLATE);
    registerEnhancedCraft(plugin, SupremeComponents.AURUM_PLATE, SupremeComponents.RECIPE_AURUM_PLATE);
    registerEnhancedCraft(plugin, SupremeComponents.MANGANESE_PLATE, SupremeComponents.RECIPE_MANGANESE_PLATE);
    registerEnhancedCraft(plugin, SupremeComponents.PLATINUM_PLATE, SupremeComponents.RECIPE_PLATINUM_PLATE);
    registerEnhancedCraft(plugin, SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.RECIPE_ADAMANTIUM_PLATE);

    registerEnhancedCraft(plugin, SupremeComponents.THORNIUM_BIT, SupremeComponents.RECIPE_THORNIUM_BIT);
    registerEnhancedCraft(plugin, SupremeComponents.THORNIUM_DUST, SupremeComponents.RECIPE_THORNIUM_DUST);
    registerEnhancedCraft(plugin, SupremeComponents.THORNIUM_INGOT, SupremeComponents.RECIPE_THORNIUM_INGOT);
    registerEnhancedCraft(plugin, SupremeComponents.THORNIUM_BIT_SYNTHETIC,
        SupremeComponents.RECIPE_THORNIUM_BIT_SYNTHETIC);
    registerEnhancedCraft(plugin, SupremeComponents.THORNIUM_DUST_SYNTHETIC,
        SupremeComponents.RECIPE_THORNIUM_DUST_SYNTHETIC);
    registerEnhancedCraft(plugin, SupremeComponents.THORNIUM_INGOT_SYNTHETIC,
        SupremeComponents.RECIPE_THORNIUM_INGOT_SYNTHETIC);
    registerEnhancedCraft(plugin, SupremeComponents.THORNIUM_CARBONADO,
        SupremeComponents.RECIPE_THORNIUM_CARBONADO);
    registerEnhancedCraft(plugin, SupremeComponents.THORNIUM_ENERGIZED,
        SupremeComponents.RECIPE_THORNIUM_ENERGIZED);

    registerSmeltery(plugin, SupremeComponents.THORNERITE, SupremeComponents.RECIPE_THORNERITE);

    registerMultiblock(plugin, SupremeComponents.SUPREME_NUGGET, SupremeComponents.RECIPE_SUPREME_NUGGET);
    registerMagicalFabricator(plugin, SupremeComponents.SUPREME, SupremeComponents.RECIPE_SUPREME);

    registerEnhancedCraft(plugin, SupremeComponents.INDUCTIVE_MACHINE,
        SupremeComponents.RECIPE_INDUCTIVE_MACHINE);
    registerEnhancedCraft(plugin, SupremeComponents.INDUCTOR_MACHINE, SupremeComponents.RECIPE_INDUCTOR_MACHINE);
    registerEnhancedCraft(plugin, SupremeComponents.RUSTLESS_MACHINE, SupremeComponents.RECIPE_RUSTLESS_MACHINE);
    registerEnhancedCraft(plugin, SupremeComponents.STAINLESS_MACHINE,
        SupremeComponents.RECIPE_STAINLESS_MACHINE);
    registerEnhancedCraft(plugin, SupremeComponents.CARRIAGE_MACHINE, SupremeComponents.RECIPE_CARRIAGE_MACHINE);
    registerEnhancedCraft(plugin, SupremeComponents.CONVEYANCE_MACHINE,
        SupremeComponents.RECIPE_CONVEYANCE_MACHINE);
    registerEnhancedCraft(plugin, SupremeComponents.PETRIFIER_MACHINE,
        SupremeComponents.RECIPE_PETRIFIER_MACHINE);
    registerEnhancedCraft(plugin, SupremeComponents.CRYSTALLIZER_MACHINE,
        SupremeComponents.RECIPE_CRYSTALLIZER_MACHINE);
    registerMagicalFabricator(plugin, SupremeComponents.BLEND_MACHINE, SupremeComponents.RECIPE_BLEND_MACHINE);

  }

  private static void registerSmeltery(SupremeExpansion plugin, SlimefunItemStack itemStack,
      ItemStack[] recipe) {
    new ItemNotPlaceable(Categories.COMPONENTS_CATEGORY, itemStack, RecipeType.SMELTERY,
        recipe).register(plugin);
  }

  private static void registerEnhancedCraft(SupremeExpansion plugin, SlimefunItemStack itemStack,
      ItemStack[] recipe) {
    new ItemNotPlaceable(Categories.COMPONENTS_CATEGORY, itemStack,
        RecipeType.ENHANCED_CRAFTING_TABLE, recipe).register(plugin);
  }

  private static void registerMagicalFabricator(SupremeExpansion plugin,
      SlimefunItemStack itemStack, ItemStack[] recipe) {
    new ItemNotPlaceable(Categories.COMPONENTS_CATEGORY, itemStack, MultiBlockMagicalFabricator.getMachine(),
        recipe).register(plugin);
  }

  private static void registerMultiblock(SupremeExpansion plugin, SlimefunItemStack itemStack,
      ItemStack[] recipe) {
    new ItemNotPlaceable(Categories.COMPONENTS_CATEGORY, itemStack, RecipeType.MULTIBLOCK,
        recipe).register(plugin);
  }

}
