package com.github.relativobr.supremeexpansion.core;

import com.github.relativobr.supremeexpansion.Categories;
import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.machine.multiBlock.CoreFabricator;
import com.github.relativobr.supremeexpansion.util.ItemNotPlaceable;
import javax.annotation.Nonnull;

public class SetupCore {

  public static void setup(@Nonnull SupremeExpansion plugin) {

    ItemNotPlaceable itemCoreOfBlock = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCore.CORE_OF_BLOCK,
        CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_BLOCK);
    itemCoreOfBlock.register(plugin);

    ItemNotPlaceable itemCoreOfDeath = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCore.CORE_OF_DEATH,
        CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_DEATH);
    itemCoreOfDeath.register(plugin);

    ItemNotPlaceable itemCoreOfLife = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCore.CORE_OF_LIFE,
        CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_LIFE);
    itemCoreOfLife.register(plugin);

    ItemNotPlaceable itemCoreOfColor = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCore.CORE_OF_COLOR,
        CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_COLOR);
    itemCoreOfColor.register(plugin);

    ItemNotPlaceable itemCoreOfNature = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCore.CORE_OF_NATURE,
        CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_NATURE);
    itemCoreOfNature.register(plugin);

    ItemNotPlaceable itemCoreOfAllow = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCore.CORE_OF_ALLOY,
        CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_ALLOY);
    itemCoreOfAllow.register(plugin);

  }

}
