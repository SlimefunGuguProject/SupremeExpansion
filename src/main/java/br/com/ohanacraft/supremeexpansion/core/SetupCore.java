package br.com.ohanacraft.supremeexpansion.core;

import br.com.ohanacraft.supremeexpansion.Categories;
import br.com.ohanacraft.supremeexpansion.SupremeExpansion;
import br.com.ohanacraft.supremeexpansion.machine.multiBlock.CoreFabricator;
import br.com.ohanacraft.supremeexpansion.util.ItemNotPlaceable;
import javax.annotation.Nonnull;

public class SetupCore {

  public static void setup(@Nonnull SupremeExpansion plugin) {

    ItemNotPlaceable itemCoreOfBlock = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCore.CORE_OF_BLOCK,
        CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_BLOCK);
    itemCoreOfBlock.register(plugin);

    ItemNotPlaceable itemCoreOfDeath = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCore.CORE_OF_DEATH,
        CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_DEATH);
    itemCoreOfDeath.register(plugin);

    ItemNotPlaceable itemCoreOfLife = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCore.CORE_OF_LIFE,
        CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_LIFE);
    itemCoreOfLife.register(plugin);

    ItemNotPlaceable itemCoreOfColor = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCore.CORE_OF_COLOR,
        CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_COLOR);
    itemCoreOfColor.register(plugin);

    ItemNotPlaceable itemCoreOfNature = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCore.CORE_OF_NATURE,
        CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_NATURE);
    itemCoreOfNature.register(plugin);

    ItemNotPlaceable itemCoreOfAllow = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCore.CORE_OF_ALLOY,
        CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_ALLOY);
    itemCoreOfAllow.register(plugin);

  }

}
