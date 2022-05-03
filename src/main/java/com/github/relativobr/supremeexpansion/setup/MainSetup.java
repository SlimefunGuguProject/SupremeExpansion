package com.github.relativobr.supremeexpansion.setup;

import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.gear.AbstractArmor;
import com.github.relativobr.supremeexpansion.gear.AbstractTools;
import com.github.relativobr.supremeexpansion.gear.AbstractWeapons;
import javax.annotation.Nonnull;


public class MainSetup {


  public static void setup(@Nonnull SupremeExpansion plugin) {

    // setup Machine
    SetupBasicMachine.setup(plugin);
    SetupSupremeQuarry.setup(plugin);
    SetupElectricMachine.setup(plugin);

    // setup Resource
    SetupResourceCore.setup(plugin);
    SetupSupremeComponents.setup(plugin);
    SetupMagical.setup(plugin);

    // setup Core
    SetupSupremeCore.setup(plugin);

    if (plugin.getConfig().getBoolean("options.enable-weapons")) {
      AbstractWeapons.setup(plugin);
    }

    if (SupremeExpansion.inst().getConfig().getBoolean("options.enable-tools")) {
      AbstractTools.setup(plugin);
    }

    if (SupremeExpansion.inst().getConfig().getBoolean("options.enable-armor")) {
      AbstractArmor.setup(plugin);
    }

    // setup Energy
    SetupGenerators.setup(plugin);

  }

}
