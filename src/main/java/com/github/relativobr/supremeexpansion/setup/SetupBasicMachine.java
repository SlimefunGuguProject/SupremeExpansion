package com.github.relativobr.supremeexpansion.setup;

import com.github.relativobr.supremeexpansion.Categories;
import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.machine.MultiBlockCoreFabricator;
import com.github.relativobr.supremeexpansion.machine.MultiBlockGearFabricator;
import com.github.relativobr.supremeexpansion.machine.MultiBlockMagicalFabricator;
import javax.annotation.Nonnull;

public class SetupBasicMachine {

  public static void setup(@Nonnull SupremeExpansion plugin) {

    // define CoreFabricator
    MultiBlockCoreFabricator multiBlockCoreFabricator = new MultiBlockCoreFabricator(plugin, Categories.MACHINES_CATEGORY);
    multiBlockCoreFabricator.register(plugin);

    // define MagicalFabricator
    MultiBlockMagicalFabricator multiBlockMagicalFabricator = new MultiBlockMagicalFabricator(plugin,
        Categories.MACHINES_CATEGORY);
    multiBlockMagicalFabricator.register(plugin);

    // define GearFabricator
    MultiBlockGearFabricator multiBlockGearFabricator = new MultiBlockGearFabricator(plugin, Categories.MACHINES_CATEGORY);
    multiBlockGearFabricator.register(plugin);

  }


}