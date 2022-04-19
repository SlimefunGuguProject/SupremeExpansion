package br.com.ohanacraft.supremeexpansion;

import br.com.ohanacraft.supremeexpansion.core.SetupCore;
import br.com.ohanacraft.supremeexpansion.core.SetupResourceCore;
import br.com.ohanacraft.supremeexpansion.gear.Armor;
import br.com.ohanacraft.supremeexpansion.gear.Tools;
import br.com.ohanacraft.supremeexpansion.gear.Weapons;
import br.com.ohanacraft.supremeexpansion.generators.SetupCapacitor;
import br.com.ohanacraft.supremeexpansion.generators.SetupGenerators;
import br.com.ohanacraft.supremeexpansion.machine.SetupBasicMachine;
import br.com.ohanacraft.supremeexpansion.machine.SetupElectricMachine;
import br.com.ohanacraft.supremeexpansion.machine.SetupQuarry;
import br.com.ohanacraft.supremeexpansion.magical.SetupMagical;
import br.com.ohanacraft.supremeexpansion.resource.SetupComponents;
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
