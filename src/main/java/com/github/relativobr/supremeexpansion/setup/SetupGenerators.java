package com.github.relativobr.supremeexpansion.setup;

import com.github.relativobr.electric.EnergyCapacitor;
import com.github.relativobr.electric.EnergyGenerator;
import com.github.relativobr.supremeexpansion.Categories;
import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.generators.SupremeCapacitor;
import com.github.relativobr.supremeexpansion.generators.SupremeGenerator;
import javax.annotation.Nonnull;

public class SetupGenerators {

  public static void setup(@Nonnull SupremeExpansion plugin) {

    final EnergyGenerator itemBasicIgnisGenerator = new EnergyGenerator(
        Categories.ELECTRIC_CATEGORY,
        SupremeGenerator.BASIC_IGNIS_GENERATOR, SupremeGenerator.MACHINE_BASIC_IGNIS_GENERATOR)
        .setBuffer(SupremeGenerator.BASIC_IGNIS_BUFFER)
        .setEnergy(SupremeGenerator.BASIC_IGNIS_ENERGY)
        .setType(EnergyGenerator.Type.FIRE);
    itemBasicIgnisGenerator.register(plugin);

    final EnergyGenerator itemIgnisGenerator = new EnergyGenerator(Categories.ELECTRIC_CATEGORY,
        SupremeGenerator.IGNIS_GENERATOR,
        SupremeGenerator.MACHINE_IGNIS_GENERATOR)
        .setBuffer(SupremeGenerator.IGNIS_BUFFER)
        .setEnergy(SupremeGenerator.IGNIS_ENERGY)
        .setType(EnergyGenerator.Type.FIRE);
    itemIgnisGenerator.register(plugin);

    final EnergyGenerator itemBasicVentusGenerator = new EnergyGenerator(
        Categories.ELECTRIC_CATEGORY,
        SupremeGenerator.BASIC_VENTUS_GENERATOR, SupremeGenerator.MACHINE_BASIC_VENTUS_GENERATOR)
        .setBuffer(SupremeGenerator.BASIC_VENTUS_BUFFER)
        .setEnergy(SupremeGenerator.BASIC_VENTUS_ENERGY)
        .setType(EnergyGenerator.Type.WIND);
    itemBasicVentusGenerator.register(plugin);

    final EnergyGenerator itemVentusGenerator = new EnergyGenerator(Categories.ELECTRIC_CATEGORY,
        SupremeGenerator.VENTUS_GENERATOR,
        SupremeGenerator.MACHINE_VENTUS_GENERATOR)
        .setBuffer(SupremeGenerator.VENTUS_BUFFER)
        .setEnergy(SupremeGenerator.VENTUS_ENERGY)
        .setType(EnergyGenerator.Type.WIND);
    itemVentusGenerator.register(plugin);

    final EnergyGenerator itemBasicAquaGenerator = new EnergyGenerator(Categories.ELECTRIC_CATEGORY,
        SupremeGenerator.BASIC_AQUA_GENERATOR, SupremeGenerator.MACHINE_BASIC_AQUA_GENERATOR)
        .setBuffer(SupremeGenerator.BASIC_AQUA_BUFFER)
        .setEnergy(SupremeGenerator.BASIC_AQUA_ENERGY)
        .setType(EnergyGenerator.Type.WATER);
    itemBasicAquaGenerator.register(plugin);

    final EnergyGenerator itemAquaGenerator = new EnergyGenerator(Categories.ELECTRIC_CATEGORY,
        SupremeGenerator.AQUA_GENERATOR,
        SupremeGenerator.MACHINE_AQUA_GENERATOR)
        .setBuffer(SupremeGenerator.AQUA_BUFFER)
        .setEnergy(SupremeGenerator.AQUA_ENERGY)
        .setType(EnergyGenerator.Type.WATER);
    itemAquaGenerator.register(plugin);

    final EnergyGenerator itemBasicLuxGenerator = new EnergyGenerator(Categories.ELECTRIC_CATEGORY,
        SupremeGenerator.BASIC_LUX_GENERATOR,
        SupremeGenerator.MACHINE_BASIC_LUX_GENERATOR)
        .setBuffer(SupremeGenerator.BASIC_LUX_BUFFER)
        .setEnergy(SupremeGenerator.BASIC_LUX_ENERGY)
        .setType(EnergyGenerator.Type.SKY);
    itemBasicLuxGenerator.register(plugin);

    final EnergyGenerator itemLuxGenerator = new EnergyGenerator(Categories.ELECTRIC_CATEGORY,
        SupremeGenerator.LUX_GENERATOR,
        SupremeGenerator.MACHINE_LUX_GENERATOR)
        .setBuffer(SupremeGenerator.LUX_BUFFER)
        .setEnergy(SupremeGenerator.LUX_ENERGY)
        .setType(EnergyGenerator.Type.SKY);
    itemLuxGenerator.register(plugin);

    final EnergyGenerator itemBasicLumiumGenerator = new EnergyGenerator(
        Categories.ELECTRIC_CATEGORY,
        SupremeGenerator.BASIC_LUMIUM_GENERATOR, SupremeGenerator.MACHINE_BASIC_LUMIUM_GENERATOR)
        .setBuffer(SupremeGenerator.BASIC_LUMIUM_BUFFER)
        .setEnergy(SupremeGenerator.BASIC_LUMIUM_ENERGY)
        .setType(EnergyGenerator.Type.DARK);
    itemBasicLumiumGenerator.register(plugin);

    final EnergyGenerator itemLumiumGenerator = new EnergyGenerator(Categories.ELECTRIC_CATEGORY,
        SupremeGenerator.LUMIUM_GENERATOR,
        SupremeGenerator.MACHINE_LUMIUM_GENERATOR)
        .setBuffer(SupremeGenerator.LUMIUM_BUFFER)
        .setEnergy(SupremeGenerator.LUMIUM_ENERGY)
        .setType(EnergyGenerator.Type.DARK);
    itemLumiumGenerator.register(plugin);

    final EnergyGenerator itemThorniumGenerator = new EnergyGenerator(Categories.ELECTRIC_CATEGORY,
        SupremeGenerator.THORNIUM_GENERATOR,
        SupremeGenerator.MACHINE_THORNIUM_GENERATOR)
        .setBuffer(SupremeGenerator.THORNIUM_BUFFER)
        .setEnergy(SupremeGenerator.THORNIUM_ENERGY)
        .setType(EnergyGenerator.Type.EVERY);
    itemThorniumGenerator.register(plugin);

    final EnergyGenerator itemSupremeGenerator = new EnergyGenerator(Categories.ELECTRIC_CATEGORY,
        SupremeGenerator.SUPREME_GENERATOR,
        SupremeGenerator.MACHINE_SUPREME_GENERATOR)
        .setBuffer(SupremeGenerator.SUPREME_BUFFER)
        .setEnergy(SupremeGenerator.SUPREME_ENERGY)
        .setType(EnergyGenerator.Type.EVERY);
    itemSupremeGenerator.register(plugin);

    final EnergyCapacitor itemAurunCapacity = new EnergyCapacitor(Categories.ELECTRIC_CATEGORY,
        SupremeCapacitor.AURUM_CAPACITOR,
        SupremeCapacitor.MACHINE_AURUM_CAPACITOR, SupremeCapacitor.AURUM_CAPACITY);
    itemAurunCapacity.register(plugin);

    final EnergyCapacitor itemTitaniumCapacity = new EnergyCapacitor(Categories.ELECTRIC_CATEGORY,
        SupremeCapacitor.TITANIUM_CAPACITOR,
        SupremeCapacitor.MACHINE_TITANIUM_CAPACITOR, SupremeCapacitor.TITANIUM_CAPACITY);
    itemTitaniumCapacity.register(plugin);

    final EnergyCapacitor itemAdamantiumCapacity = new EnergyCapacitor(Categories.ELECTRIC_CATEGORY,
        SupremeCapacitor.ADAMANTIUM_CAPACITOR, SupremeCapacitor.MACHINE_ADAMANTIUM_CAPACITOR,
        SupremeCapacitor.ADAMANTIUM_CAPACITY);
    itemAdamantiumCapacity.register(plugin);

    final EnergyCapacitor itemThorniumCapacity = new EnergyCapacitor(Categories.ELECTRIC_CATEGORY,
        SupremeCapacitor.THORNIUM_CAPACITOR,
        SupremeCapacitor.MACHINE_THORNIUM_CAPACITOR, SupremeCapacitor.THORNIUM_CAPACITY);
    itemThorniumCapacity.register(plugin);

    final EnergyCapacitor itemSupremeCapacity = new EnergyCapacitor(Categories.ELECTRIC_CATEGORY,
        SupremeCapacitor.SUPREME_CAPACITOR,
        SupremeCapacitor.MACHINE_SUPREME_CAPACITOR, SupremeCapacitor.SUPREME_CAPACITY);
    itemSupremeCapacity.register(plugin);

  }


}
