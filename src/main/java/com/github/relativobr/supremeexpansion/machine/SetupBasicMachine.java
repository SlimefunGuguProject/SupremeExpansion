package com.github.relativobr.supremeexpansion.machine;

import com.github.relativobr.supremeexpansion.Categories;
import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.machine.multiBlock.CoreFabricator;
import com.github.relativobr.supremeexpansion.machine.multiBlock.GearFabricator;
import com.github.relativobr.supremeexpansion.machine.multiBlock.MagicalFabricator;
import javax.annotation.Nonnull;

public class SetupBasicMachine {

  public static void setup(@Nonnull SupremeExpansion plugin) {

    // define CoreFabricator
    CoreFabricator coreFabricator = new CoreFabricator(plugin, Categories.MACHINES_CATEGORY);
    coreFabricator.register(plugin);

    // define MagicalFabricator
    MagicalFabricator magicalFabricator = new MagicalFabricator(plugin,
        Categories.MACHINES_CATEGORY);
    magicalFabricator.register(plugin);

    // define GearFabricator
    GearFabricator gearFabricator = new GearFabricator(plugin, Categories.MACHINES_CATEGORY);
    gearFabricator.register(plugin);

  }


}