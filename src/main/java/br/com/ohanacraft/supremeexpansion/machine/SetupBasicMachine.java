package br.com.ohanacraft.supremeexpansion.machine;

import br.com.ohanacraft.supremeexpansion.Categories;
import br.com.ohanacraft.supremeexpansion.SupremeExpansion;
import br.com.ohanacraft.supremeexpansion.machine.multiBlock.CoreFabricator;
import br.com.ohanacraft.supremeexpansion.machine.multiBlock.GearFabricator;
import br.com.ohanacraft.supremeexpansion.machine.multiBlock.MagicalFabricator;
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