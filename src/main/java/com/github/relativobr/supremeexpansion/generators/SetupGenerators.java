package com.github.relativobr.supremeexpansion.generators;

import com.github.relativobr.supremeexpansion.SupremeExpansion;
import javax.annotation.Nonnull;

public class SetupGenerators {

  public static void setup(@Nonnull SupremeExpansion plugin) {

    final EnergyGenerator itemBasicIgnisGenerator = new EnergyGenerator(
        Generator.BASIC_IGNIS_GENERATOR, Generator.MACHINE_BASIC_IGNIS_GENERATOR)
        .setBuffer(Generator.BASIC_IGNIS_BUFFER)
        .setEnergy(Generator.BASIC_IGNIS_ENERGY)
        .setType(EnergyGenerator.Type.FIRE);
    itemBasicIgnisGenerator.register(plugin);

    final EnergyGenerator itemIgnisGenerator = new EnergyGenerator(Generator.IGNIS_GENERATOR,
        Generator.MACHINE_IGNIS_GENERATOR)
        .setBuffer(Generator.IGNIS_BUFFER)
        .setEnergy(Generator.IGNIS_ENERGY)
        .setType(EnergyGenerator.Type.FIRE);
    itemIgnisGenerator.register(plugin);

    final EnergyGenerator itemBasicVentusGenerator = new EnergyGenerator(
        Generator.BASIC_VENTUS_GENERATOR, Generator.MACHINE_BASIC_VENTUS_GENERATOR)
        .setBuffer(Generator.BASIC_VENTUS_BUFFER)
        .setEnergy(Generator.BASIC_VENTUS_ENERGY)
        .setType(EnergyGenerator.Type.WIND);
    itemBasicVentusGenerator.register(plugin);

    final EnergyGenerator itemVentusGenerator = new EnergyGenerator(Generator.VENTUS_GENERATOR,
        Generator.MACHINE_VENTUS_GENERATOR)
        .setBuffer(Generator.VENTUS_BUFFER)
        .setEnergy(Generator.VENTUS_ENERGY)
        .setType(EnergyGenerator.Type.WIND);
    itemVentusGenerator.register(plugin);

    final EnergyGenerator itemBasicAquaGenerator = new EnergyGenerator(
        Generator.BASIC_AQUA_GENERATOR, Generator.MACHINE_BASIC_AQUA_GENERATOR)
        .setBuffer(Generator.BASIC_AQUA_BUFFER)
        .setEnergy(Generator.BASIC_AQUA_ENERGY)
        .setType(EnergyGenerator.Type.WATER);
    itemBasicAquaGenerator.register(plugin);

    final EnergyGenerator itemAquaGenerator = new EnergyGenerator(Generator.AQUA_GENERATOR,
        Generator.MACHINE_AQUA_GENERATOR)
        .setBuffer(Generator.AQUA_BUFFER)
        .setEnergy(Generator.AQUA_ENERGY)
        .setType(EnergyGenerator.Type.WATER);
    itemAquaGenerator.register(plugin);

    final EnergyGenerator itemBasicLuxGenerator = new EnergyGenerator(Generator.BASIC_LUX_GENERATOR,
        Generator.MACHINE_BASIC_LUX_GENERATOR)
        .setBuffer(Generator.BASIC_LUX_BUFFER)
        .setEnergy(Generator.BASIC_LUX_ENERGY)
        .setType(EnergyGenerator.Type.SKY);
    itemBasicLuxGenerator.register(plugin);

    final EnergyGenerator itemLuxGenerator = new EnergyGenerator(Generator.LUX_GENERATOR,
        Generator.MACHINE_LUX_GENERATOR)
        .setBuffer(Generator.LUX_BUFFER)
        .setEnergy(Generator.LUX_ENERGY)
        .setType(EnergyGenerator.Type.SKY);
    itemLuxGenerator.register(plugin);

    final EnergyGenerator itemBasicLumiumGenerator = new EnergyGenerator(
        Generator.BASIC_LUMIUM_GENERATOR, Generator.MACHINE_BASIC_LUMIUM_GENERATOR)
        .setBuffer(Generator.BASIC_LUMIUM_BUFFER)
        .setEnergy(Generator.BASIC_LUMIUM_ENERGY)
        .setType(EnergyGenerator.Type.DARK);
    itemBasicLumiumGenerator.register(plugin);

    final EnergyGenerator itemLumiumGenerator = new EnergyGenerator(Generator.LUMIUM_GENERATOR,
        Generator.MACHINE_LUMIUM_GENERATOR)
        .setBuffer(Generator.LUMIUM_BUFFER)
        .setEnergy(Generator.LUMIUM_ENERGY)
        .setType(EnergyGenerator.Type.DARK);
    itemLumiumGenerator.register(plugin);

    final EnergyGenerator itemThorniumGenerator = new EnergyGenerator(Generator.THORNIUM_GENERATOR,
        Generator.MACHINE_THORNIUM_GENERATOR)
        .setBuffer(Generator.THORNIUM_BUFFER)
        .setEnergy(Generator.THORNIUM_ENERGY)
        .setType(EnergyGenerator.Type.EVERY);
    itemThorniumGenerator.register(plugin);

    final EnergyGenerator itemSupremeGenerator = new EnergyGenerator(Generator.SUPREME_GENERATOR,
        Generator.MACHINE_SUPREME_GENERATOR)
        .setBuffer(Generator.SUPREME_BUFFER)
        .setEnergy(Generator.SUPREME_ENERGY)
        .setType(EnergyGenerator.Type.EVERY);
    itemSupremeGenerator.register(plugin);


  }


}
