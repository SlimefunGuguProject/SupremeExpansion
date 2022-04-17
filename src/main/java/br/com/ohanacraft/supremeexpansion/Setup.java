package br.com.ohanacraft.supremeexpansion;

import br.com.ohanacraft.supremeexpansion.core.SetupCore;
import br.com.ohanacraft.supremeexpansion.gear.Armor;
import br.com.ohanacraft.supremeexpansion.gear.Tools;
import br.com.ohanacraft.supremeexpansion.gear.Weapons;
import br.com.ohanacraft.supremeexpansion.machine.SetupBasicMachine;
import br.com.ohanacraft.supremeexpansion.machine.SetupElectricMachine;
import br.com.ohanacraft.supremeexpansion.machine.SetupQuarry;
import br.com.ohanacraft.supremeexpansion.magical.SetupMagical;
import br.com.ohanacraft.supremeexpansion.resource.SetupComponents;
import br.com.ohanacraft.supremeexpansion.resource.SetupResourceCore;
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

        // setup Weapons
        boolean enableWeapons = SupremeExpansion.inst().getConfig().getBoolean("options.enable-weapons");
        boolean enableTools = SupremeExpansion.inst().getConfig().getBoolean("options.enable-tools");
        boolean enableArmor = SupremeExpansion.inst().getConfig().getBoolean("options.enable-armor");
        if(enableWeapons){
            Weapons.setup(plugin);
        }
        if(enableTools){
            Tools.setup(plugin);
        }
        if(enableArmor){
            Armor.setup(plugin);
        }
    }

}
