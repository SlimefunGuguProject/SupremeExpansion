package com.github.relativobr.supremeexpansion.setup;

import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.machine.MultiBlockMagicalFabricator;
import com.github.relativobr.supremeexpansion.magical.SupremeAttribute;
import com.github.relativobr.supremeexpansion.magical.SupremeCetrus;
import com.github.relativobr.supremeexpansion.util.ItemGroups;
import com.github.relativobr.util.ItemNotPlaceable;

public class SetupMagical {

    public static void setup(SupremeExpansion sup) {

        new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeCetrus.CETRUS_LUMIUM,
            MultiBlockMagicalFabricator.getMachine(),
            SupremeCetrus.RECIPE_CETRUS_LUMIUM)
            .register(sup);

        new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeCetrus.CETRUS_LUX,
            MultiBlockMagicalFabricator.getMachine(),
            SupremeCetrus.RECIPE_CETRUS_LUX)
            .register(sup);

        new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeCetrus.CETRUS_VENTUS,
            MultiBlockMagicalFabricator.getMachine(),
            SupremeCetrus.RECIPE_CETRUS_VENTUS)
            .register(sup);

        new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeCetrus.CETRUS_AQUA,
            MultiBlockMagicalFabricator.getMachine(),
            SupremeCetrus.RECIPE_CETRUS_AQUA)
            .register(sup);

        new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeCetrus.CETRUS_IGNIS,
            MultiBlockMagicalFabricator.getMachine(),
            SupremeCetrus.RECIPE_CETRUS_IGNIS)
            .register(sup);

        new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeAttribute.getMagic(),
            MultiBlockMagicalFabricator.getMachine(),
            SupremeAttribute.RECIPE_ATTRIBUTE_MAGIC)
            .register(sup);

        new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeAttribute.getBomb(),
            MultiBlockMagicalFabricator.getMachine(),
            SupremeAttribute.RECIPE_ATTRIBUTE_BOMB)
            .register(sup);

        new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeAttribute.getFortune(),
            MultiBlockMagicalFabricator.getMachine(),
            SupremeAttribute.RECIPE_ATTRIBUTE_FORTUNE)
            .register(sup);

        new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeAttribute.getImpetus(),
            MultiBlockMagicalFabricator.getMachine(),
            SupremeAttribute.RECIPE_ATTRIBUTE_IMPETUS)
            .register(sup);
    }
}
