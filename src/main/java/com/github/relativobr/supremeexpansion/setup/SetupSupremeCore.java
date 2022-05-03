package com.github.relativobr.supremeexpansion.setup;

import com.github.relativobr.supremeexpansion.Categories;
import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.core.SupremeMainCore;
import com.github.relativobr.supremeexpansion.machine.MultiBlockCoreFabricator;
import com.github.relativobr.util.ItemNotPlaceable;
import javax.annotation.Nonnull;

public class SetupSupremeCore {

  public static void setup(@Nonnull SupremeExpansion plugin) {

    ItemNotPlaceable itemCoreOfBlock = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeMainCore.CORE_OF_BLOCK,
        MultiBlockCoreFabricator.getMachine(), SupremeMainCore.RECIPE_CORE_OF_BLOCK);
    itemCoreOfBlock.register(plugin);

    ItemNotPlaceable itemCoreOfDeath = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeMainCore.CORE_OF_DEATH,
        MultiBlockCoreFabricator.getMachine(), SupremeMainCore.RECIPE_CORE_OF_DEATH);
    itemCoreOfDeath.register(plugin);

    ItemNotPlaceable itemCoreOfLife = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeMainCore.CORE_OF_LIFE,
        MultiBlockCoreFabricator.getMachine(), SupremeMainCore.RECIPE_CORE_OF_LIFE);
    itemCoreOfLife.register(plugin);

    ItemNotPlaceable itemCoreOfColor = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeMainCore.CORE_OF_COLOR,
        MultiBlockCoreFabricator.getMachine(), SupremeMainCore.RECIPE_CORE_OF_COLOR);
    itemCoreOfColor.register(plugin);

    ItemNotPlaceable itemCoreOfNature = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeMainCore.CORE_OF_NATURE,
        MultiBlockCoreFabricator.getMachine(), SupremeMainCore.RECIPE_CORE_OF_NATURE);
    itemCoreOfNature.register(plugin);

    ItemNotPlaceable itemCoreOfAllow = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeMainCore.CORE_OF_ALLOY,
        MultiBlockCoreFabricator.getMachine(), SupremeMainCore.RECIPE_CORE_OF_ALLOY);
    itemCoreOfAllow.register(plugin);

  }

}
