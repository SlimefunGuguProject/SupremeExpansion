package com.github.relativobr.supremeexpansion.setup;

import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.machine.MultiBlockCoreFabricator;
import com.github.relativobr.supremeexpansion.machine.MultiBlockGearFabricator;
import com.github.relativobr.supremeexpansion.machine.MultiBlockMagicalFabricator;

public class SetupBasicMachine {

  public static void setup(SupremeExpansion sup) {

    // define CoreFabricator
    new MultiBlockCoreFabricator().register(sup);

    // define MagicalFabricator
    new MultiBlockMagicalFabricator().register(sup);

    // define GearFabricator
    new MultiBlockGearFabricator().register(sup);
  }
}
