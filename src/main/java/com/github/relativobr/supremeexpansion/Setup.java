package com.github.relativobr.supremeexpansion;

import com.github.relativobr.supremeexpansion.core.SetupCore;
import com.github.relativobr.supremeexpansion.core.SetupResourceCore;
import com.github.relativobr.supremeexpansion.gear.Armor;
import com.github.relativobr.supremeexpansion.gear.Tools;
import com.github.relativobr.supremeexpansion.gear.Weapons;
import com.github.relativobr.supremeexpansion.generators.SetupCapacitor;
import com.github.relativobr.supremeexpansion.generators.SetupGenerators;
import com.github.relativobr.supremeexpansion.machine.SetupBasicMachine;
import com.github.relativobr.supremeexpansion.machine.SetupElectricMachine;
import com.github.relativobr.supremeexpansion.machine.SetupQuarry;
import com.github.relativobr.supremeexpansion.magical.SetupMagical;
import com.github.relativobr.supremeexpansion.resource.SetupComponents;
import javax.annotation.Nonnull;


public class Setup {


  public static void setup(@Nonnull SupremeExpansion plugin) {

    // setup Machine
    SetupBasicMachine.setup(plugin);
    SetupQuarry.setup(plugin);
    SetupElectricMachine.setup(plugin);

    // setup Resource
    SetupResourceCore.setup(plugin);
    SetupComponents.setup(plugin);
    SetupMagical.setup(plugin);

    // setup Core
    SetupCore.setup(plugin);

    if (plugin.getConfig().getBoolean("options.enable-weapons")) {
      Weapons.setup(plugin);
    }

    if (SupremeExpansion.inst().getConfig().getBoolean("options.enable-tools")) {
      Tools.setup(plugin);
    }

    if (SupremeExpansion.inst().getConfig().getBoolean("options.enable-armor")) {
      Armor.setup(plugin);
    }

    // setup Energy
    SetupGenerators.setup(plugin);
    SetupCapacitor.setup(plugin);

  }

}
