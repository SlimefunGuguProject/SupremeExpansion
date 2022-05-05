package com.github.relativobr.supremeexpansion.setup;

import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.core.SupremeMainCore;
import com.github.relativobr.supremeexpansion.machine.MultiBlockCoreFabricator;
import com.github.relativobr.supremeexpansion.util.ItemGroups;
import com.github.relativobr.util.ItemNotPlaceable;

public class SetupSupremeCore {

    public static void setup(SupremeExpansion sup) {

        new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeMainCore.CORE_OF_BLOCK,
            MultiBlockCoreFabricator.getMachine(),
            SupremeMainCore.RECIPE_CORE_OF_BLOCK)
            .register(sup);

        new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeMainCore.CORE_OF_DEATH,
            MultiBlockCoreFabricator.getMachine(),
            SupremeMainCore.RECIPE_CORE_OF_DEATH)
            .register(sup);

        new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeMainCore.CORE_OF_LIFE,
            MultiBlockCoreFabricator.getMachine(),
            SupremeMainCore.RECIPE_CORE_OF_LIFE)
            .register(sup);

        new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeMainCore.CORE_OF_COLOR,
            MultiBlockCoreFabricator.getMachine(),
            SupremeMainCore.RECIPE_CORE_OF_COLOR)
            .register(sup);

        new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeMainCore.CORE_OF_NATURE,
            MultiBlockCoreFabricator.getMachine(),
            SupremeMainCore.RECIPE_CORE_OF_NATURE)
            .register(sup);

        new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeMainCore.CORE_OF_ALLOY,
            MultiBlockCoreFabricator.getMachine(),
            SupremeMainCore.RECIPE_CORE_OF_ALLOY)
            .register(sup);
    }
}
