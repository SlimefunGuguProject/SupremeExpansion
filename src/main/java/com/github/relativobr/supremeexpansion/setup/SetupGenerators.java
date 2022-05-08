package com.github.relativobr.supremeexpansion.setup;

import com.github.relativobr.electric.EnergyCapacitor;
import com.github.relativobr.electric.EnergyGenerator;
import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.generators.SupremeCapacitor;
import com.github.relativobr.supremeexpansion.generators.SupremeGenerator;
import com.github.relativobr.supremeexpansion.util.ItemGroups;

public class SetupGenerators {

    public static void setup(SupremeExpansion sup) {

        new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.BASIC_IGNIS_GENERATOR,
            SupremeGenerator.MACHINE_BASIC_IGNIS_GENERATOR)
            .setBuffer(SupremeGenerator.BASIC_IGNIS_BUFFER)
            .setEnergy(SupremeGenerator.BASIC_IGNIS_ENERGY)
            .setType(EnergyGenerator.Type.FIRE)
            .register(sup);

        new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.IGNIS_GENERATOR,
            SupremeGenerator.MACHINE_IGNIS_GENERATOR)
            .setBuffer(SupremeGenerator.IGNIS_BUFFER)
            .setEnergy(SupremeGenerator.IGNIS_ENERGY)
            .setType(EnergyGenerator.Type.FIRE)
            .register(sup);

        new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.BASIC_VENTUS_GENERATOR,
            SupremeGenerator.MACHINE_BASIC_VENTUS_GENERATOR)
            .setBuffer(SupremeGenerator.BASIC_VENTUS_BUFFER)
            .setEnergy(SupremeGenerator.BASIC_VENTUS_ENERGY)
            .setType(EnergyGenerator.Type.WIND)
            .register(sup);

        new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.VENTUS_GENERATOR,
            SupremeGenerator.MACHINE_VENTUS_GENERATOR)
            .setBuffer(SupremeGenerator.VENTUS_BUFFER)
            .setEnergy(SupremeGenerator.VENTUS_ENERGY)
            .setType(EnergyGenerator.Type.WIND)
            .register(sup);

        new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.BASIC_AQUA_GENERATOR,
            SupremeGenerator.MACHINE_BASIC_AQUA_GENERATOR)
            .setBuffer(SupremeGenerator.BASIC_AQUA_BUFFER)
            .setEnergy(SupremeGenerator.BASIC_AQUA_ENERGY)
            .setType(EnergyGenerator.Type.WATER)
            .register(sup);

        new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.AQUA_GENERATOR,
            SupremeGenerator.MACHINE_AQUA_GENERATOR)
            .setBuffer(SupremeGenerator.AQUA_BUFFER)
            .setEnergy(SupremeGenerator.AQUA_ENERGY)
            .setType(EnergyGenerator.Type.WATER)
            .register(sup);

        new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.BASIC_LUX_GENERATOR,
            SupremeGenerator.MACHINE_BASIC_LUX_GENERATOR)
            .setBuffer(SupremeGenerator.BASIC_LUX_BUFFER)
            .setEnergy(SupremeGenerator.BASIC_LUX_ENERGY)
            .setType(EnergyGenerator.Type.SKY)
            .register(sup);

        new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.LUX_GENERATOR,
            SupremeGenerator.MACHINE_LUX_GENERATOR)
            .setBuffer(SupremeGenerator.LUX_BUFFER)
            .setEnergy(SupremeGenerator.LUX_ENERGY)
            .setType(EnergyGenerator.Type.SKY)
            .register(sup);

        new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.BASIC_LUMIUM_GENERATOR,
            SupremeGenerator.MACHINE_BASIC_LUMIUM_GENERATOR)
            .setBuffer(SupremeGenerator.BASIC_LUMIUM_BUFFER)
            .setEnergy(SupremeGenerator.BASIC_LUMIUM_ENERGY)
            .setType(EnergyGenerator.Type.DARK)
            .register(sup);

        new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.LUMIUM_GENERATOR,
            SupremeGenerator.MACHINE_LUMIUM_GENERATOR)
            .setBuffer(SupremeGenerator.LUMIUM_BUFFER)
            .setEnergy(SupremeGenerator.LUMIUM_ENERGY)
            .setType(EnergyGenerator.Type.DARK)
            .register(sup);

        new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.THORNIUM_GENERATOR,
            SupremeGenerator.MACHINE_THORNIUM_GENERATOR)
            .setBuffer(SupremeGenerator.THORNIUM_BUFFER)
            .setEnergy(SupremeGenerator.THORNIUM_ENERGY)
            .setType(EnergyGenerator.Type.EVERY)
            .register(sup);

        new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.SUPREME_GENERATOR,
            SupremeGenerator.MACHINE_SUPREME_GENERATOR)
            .setBuffer(SupremeGenerator.SUPREME_BUFFER)
            .setEnergy(SupremeGenerator.SUPREME_ENERGY)
            .setType(EnergyGenerator.Type.EVERY)
            .register(sup);

        new EnergyCapacitor(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeCapacitor.AURUM_CAPACITOR,
            SupremeCapacitor.MACHINE_AURUM_CAPACITOR,
            SupremeCapacitor.AURUM_CAPACITY)
            .register(sup);

        new EnergyCapacitor(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeCapacitor.TITANIUM_CAPACITOR,
            SupremeCapacitor.MACHINE_TITANIUM_CAPACITOR,
            SupremeCapacitor.TITANIUM_CAPACITY)
            .register(sup);

        new EnergyCapacitor(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeCapacitor.ADAMANTIUM_CAPACITOR,
            SupremeCapacitor.MACHINE_ADAMANTIUM_CAPACITOR,
            SupremeCapacitor.ADAMANTIUM_CAPACITY)
            .register(sup);

        new EnergyCapacitor(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeCapacitor.THORNIUM_CAPACITOR,
            SupremeCapacitor.MACHINE_THORNIUM_CAPACITOR,
            SupremeCapacitor.THORNIUM_CAPACITY)
            .register(sup);

        new EnergyCapacitor(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeCapacitor.SUPREME_CAPACITOR,
            SupremeCapacitor.MACHINE_SUPREME_CAPACITOR,
            SupremeCapacitor.SUPREME_CAPACITY)
            .register(sup);
    }
}
