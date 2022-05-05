package com.github.relativobr.supremeexpansion.setup;

import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.gear.AbstractArmor;
import com.github.relativobr.supremeexpansion.gear.AbstractTools;
import com.github.relativobr.supremeexpansion.gear.AbstractWeapons;

public class MainSetup {

  public static void setup(SupremeExpansion sup) {

    SetupBasicMachine.setup(sup);
    SetupResourceCore.setup(sup);
    SetupSupremeCore.setup(sup);
    SetupMagical.setup(sup);
    SetupSupremeComponents.setup(sup);
    SetupElectricMachine.setup(sup);
    SetupGenerators.setup(sup);

    if (sup.getConfig().getBoolean("options.enable-weapons")) {
      AbstractWeapons.setup(sup);
    }

    if (sup.getConfig().getBoolean("options.enable-tools")) {
      AbstractTools.setup(sup);
    }

    if (sup.getConfig().getBoolean("options.enable-armor")) {
      AbstractArmor.setup(sup);
    }

    if (sup.getConfig().getBoolean("options.enable-quarry")) {
      SetupSupremeQuarry.setup(sup);
    }

  }
}
