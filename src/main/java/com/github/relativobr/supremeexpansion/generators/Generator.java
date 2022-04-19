package com.github.relativobr.supremeexpansion.generators;

import com.github.relativobr.supremeexpansion.core.CoreAlloy;
import com.github.relativobr.supremeexpansion.magical.Cetrus;
import com.github.relativobr.supremeexpansion.resource.Components;
import com.github.relativobr.supremeexpansion.util.Energy;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Generator {

  //BASIC TIER
  public static final int BASIC_IGNIS_ENERGY = 2500;
  public static final int BASIC_IGNIS_BUFFER = 5000;
  public static final int BASIC_VENTUS_ENERGY = 2500;
  public static final int BASIC_VENTUS_BUFFER = 5000;
  public static final int BASIC_AQUA_ENERGY = 2500;
  public static final int BASIC_AQUA_BUFFER = 5000;
  public static final int BASIC_LUX_ENERGY = 2500;
  public static final int BASIC_LUX_BUFFER = 5000;
  public static final int BASIC_LUMIUM_ENERGY = 5000;
  public static final int BASIC_LUMIUM_BUFFER = 10000;
  //ADVANCED TIER
  public static final int IGNIS_ENERGY = 25000;
  public static final int IGNIS_BUFFER = 50000;
  public static final int VENTUS_ENERGY = 25000;
  public static final int VENTUS_BUFFER = 50000;
  public static final int AQUA_ENERGY = 25000;
  public static final int AQUA_BUFFER = 50000;
  public static final int LUX_ENERGY = 25000;
  public static final int LUX_BUFFER = 50000;
  public static final int LUMIUM_ENERGY = 75000;
  public static final int LUMIUM_BUFFER = 500000;
  //END_GAME TIER
  public static final int THORNIUM_ENERGY = 1000000; //  (IGNIS + AQUA + VENTUS)
  public static final int THORNIUM_BUFFER = 6000000;
  public static final int SUPREME_ENERGY = 2000000; //  (LUX + LUMIUM + THORNIUM)
  public static final int SUPREME_BUFFER = 12000000;


  public static final SlimefunItemStack BASIC_IGNIS_GENERATOR = new SlimefunItemStack(
      "BASIC_IGNIS_GENERATOR",
      Material.ORANGE_CONCRETE, "&9Basic Ignis Generator", "&fNeed fire under this block to work",
      "", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      Energy.energyBuffer(BASIC_IGNIS_BUFFER), Energy.energyPowerPerSecond(BASIC_IGNIS_ENERGY));

  public static final ItemStack[] MACHINE_BASIC_IGNIS_GENERATOR = new ItemStack[]{
      Components.ALLOY_AURUM, CoreAlloy.RESOURCE_CORE_COAL, Components.ALLOY_AURUM,
      Components.INDUCTIVE_MACHINE, SlimefunItems.COAL_GENERATOR_2, Components.INDUCTIVE_MACHINE,
      Components.CARRIAGE_MACHINE, SlimefunItems.STAFF_FIRE, Components.CARRIAGE_MACHINE
  };

  public static final SlimefunItemStack IGNIS_GENERATOR = new SlimefunItemStack("IGNIS_GENERATOR",
      Material.ORANGE_GLAZED_TERRACOTTA, "&9Ignis Generator",
      "&fNeed fire under this block to work", "", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      Energy.energyBuffer(IGNIS_BUFFER), Energy.energyPowerPerSecond(IGNIS_ENERGY));

  public static final ItemStack[] MACHINE_IGNIS_GENERATOR = new ItemStack[]{
      Components.AURUM_PLATE, Cetrus.CETRUS_IGNIS, Components.AURUM_PLATE,
      Components.INDUCTOR_MACHINE, SlimefunItems.COAL_GENERATOR_2, Components.INDUCTOR_MACHINE,
      Components.CONVEYANCE_MACHINE, SlimefunItems.STAFF_FIRE, Components.CONVEYANCE_MACHINE
  };

  public static final SlimefunItemStack BASIC_VENTUS_GENERATOR = new SlimefunItemStack(
      "BASIC_VENTUS_GENERATOR",
      Material.LIGHT_BLUE_CONCRETE, "&9Basic Ventus Generator", "&fIt needs to be with its faces",
      "&fin the wind to work", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      Energy.energyBuffer(BASIC_VENTUS_BUFFER), Energy.energyPowerPerSecond(BASIC_VENTUS_ENERGY));

  public static final ItemStack[] MACHINE_BASIC_VENTUS_GENERATOR = new ItemStack[]{
      Components.ALLOY_IRIDIUM, CoreAlloy.RESOURCE_CORE_LAPIS, Components.ALLOY_IRIDIUM,
      Components.INDUCTIVE_MACHINE, SlimefunItems.BIO_REACTOR, Components.INDUCTIVE_MACHINE,
      Components.CARRIAGE_MACHINE, SlimefunItems.STAFF_WIND, Components.CARRIAGE_MACHINE
  };

  public static final SlimefunItemStack VENTUS_GENERATOR = new SlimefunItemStack("VENTUS_GENERATOR",
      Material.LIGHT_BLUE_GLAZED_TERRACOTTA, "&9Ventus Generator",
      "&fIt needs to be with its faces", "&fin the wind to work", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      Energy.energyBuffer(VENTUS_BUFFER), Energy.energyPowerPerSecond(VENTUS_ENERGY));

  public static final ItemStack[] MACHINE_VENTUS_GENERATOR = new ItemStack[]{
      Components.IRIDIUM_PLATE, Cetrus.CETRUS_VENTUS, Components.IRIDIUM_PLATE,
      Components.INDUCTOR_MACHINE, SlimefunItems.BIO_REACTOR, Components.INDUCTOR_MACHINE,
      Components.CONVEYANCE_MACHINE, SlimefunItems.STAFF_WIND, Components.CONVEYANCE_MACHINE
  };

  public static final SlimefunItemStack BASIC_AQUA_GENERATOR = new SlimefunItemStack(
      "BASIC_AQUA_GENERATOR",
      Material.BLUE_CONCRETE, "&9Basic Aqua Generator", "&fNeed water under this block to work", "",
      "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      Energy.energyBuffer(BASIC_AQUA_BUFFER), Energy.energyPowerPerSecond(BASIC_AQUA_ENERGY));
  public static final ItemStack[] MACHINE_AQUA_GENERATOR = new ItemStack[]{
      Components.MANGANESE_PLATE, Cetrus.CETRUS_AQUA, Components.MANGANESE_PLATE,
      Components.INDUCTOR_MACHINE, BASIC_AQUA_GENERATOR, Components.INDUCTOR_MACHINE,
      Components.CONVEYANCE_MACHINE, SlimefunItems.STAFF_WATER, Components.CONVEYANCE_MACHINE
  };
  public static final ItemStack[] MACHINE_BASIC_AQUA_GENERATOR = new ItemStack[]{
      Components.ALLOY_MANGANESE, CoreAlloy.RESOURCE_CORE_DIAMOND, Components.ALLOY_MANGANESE,
      Components.INDUCTIVE_MACHINE, SlimefunItems.MAGNESIUM_GENERATOR, Components.INDUCTIVE_MACHINE,
      Components.CARRIAGE_MACHINE, SlimefunItems.STAFF_WATER, Components.CARRIAGE_MACHINE
  };
  public static final SlimefunItemStack AQUA_GENERATOR = new SlimefunItemStack("AQUA_GENERATOR",
      Material.BLUE_GLAZED_TERRACOTTA, "&9Aqua Generator", "&fNeed water under this block to work",
      "", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      Energy.energyBuffer(AQUA_BUFFER), Energy.energyPowerPerSecond(AQUA_ENERGY));
  public static final ItemStack[] MACHINE_THORNIUM_GENERATOR = new ItemStack[]{
      Components.THORNIUM_ENERGIZED, IGNIS_GENERATOR, Components.THORNIUM_ENERGIZED,
      Components.THORNIUM_ENERGIZED, AQUA_GENERATOR, Components.THORNIUM_ENERGIZED,
      Components.CRYSTALLIZER_MACHINE, VENTUS_GENERATOR, Components.CRYSTALLIZER_MACHINE
  };
  public static final SlimefunItemStack BASIC_LUX_GENERATOR = new SlimefunItemStack(
      "BASIC_LUX_GENERATOR",
      Material.WHITE_CONCRETE, "&9Basic Lux Generator", "&fNeeds to receive sunlight",
      "&for moonlight to work", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      Energy.energyBuffer(BASIC_LUX_BUFFER), Energy.energyPowerPerSecond(BASIC_LUX_ENERGY));
  public static final ItemStack[] MACHINE_LUX_GENERATOR = new ItemStack[]{
      Components.TITANIUM_PLATE, Cetrus.CETRUS_LUX, Components.TITANIUM_PLATE,
      Components.INDUCTOR_MACHINE, BASIC_LUX_GENERATOR, Components.INDUCTOR_MACHINE,
      Components.CONVEYANCE_MACHINE, SlimefunItems.STAFF_STORM, Components.CONVEYANCE_MACHINE
  };
  public static final ItemStack[] MACHINE_BASIC_LUX_GENERATOR = new ItemStack[]{
      Components.ALLOY_TITANIUM, CoreAlloy.RESOURCE_CORE_QUARTZ, Components.TITANIUM_PLATE,
      Components.INDUCTIVE_MACHINE, SlimefunItems.SOLAR_GENERATOR_4, Components.INDUCTIVE_MACHINE,
      Components.CARRIAGE_MACHINE, SlimefunItems.STAFF_STORM, Components.CARRIAGE_MACHINE
  };
  public static final SlimefunItemStack LUX_GENERATOR = new SlimefunItemStack("LUX_GENERATOR",
      Material.WHITE_GLAZED_TERRACOTTA, "&9Lux Generator", "&fNeeds to receive sunlight",
      "&for moonlight to work", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      Energy.energyBuffer(LUX_BUFFER), Energy.energyPowerPerSecond(LUX_ENERGY));
  public static final SlimefunItemStack BASIC_LUMIUM_GENERATOR = new SlimefunItemStack(
      "BASIC_LUMIUM_GENERATOR",
      Material.BROWN_CONCRETE, "&9Basic Lumium Generator", "&fNeeds to be below ground to work", "",
      "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      Energy.energyBuffer(BASIC_LUMIUM_BUFFER), Energy.energyPowerPerSecond(BASIC_LUMIUM_ENERGY));
  public static final ItemStack[] MACHINE_LUMIUM_GENERATOR = new ItemStack[]{
      Components.ADAMANTIUM_PLATE, Cetrus.CETRUS_LUMIUM, Components.ADAMANTIUM_PLATE,
      Components.INDUCTOR_MACHINE, BASIC_LUMIUM_GENERATOR, Components.INDUCTOR_MACHINE,
      Components.CRYSTALLIZER_MACHINE, SlimefunItems.GEO_MINER, Components.CRYSTALLIZER_MACHINE
  };
  public static final ItemStack[] MACHINE_BASIC_LUMIUM_GENERATOR = new ItemStack[]{
      Components.ALLOY_ADAMANTIUM, CoreAlloy.RESOURCE_CORE_NETHERITE, Components.ALLOY_ADAMANTIUM,
      Components.INDUCTIVE_MACHINE, SlimefunItems.LAVA_GENERATOR_2, Components.INDUCTIVE_MACHINE,
      Components.PETRIFIER_MACHINE, SlimefunItems.GEO_MINER, Components.PETRIFIER_MACHINE
  };
  public static final SlimefunItemStack LUMIUM_GENERATOR = new SlimefunItemStack("LUMIUM_GENERATOR",
      Material.BROWN_GLAZED_TERRACOTTA, "&9Lumium Generator", "&fNeeds to be below ground to work",
      "", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      Energy.energyBuffer(LUMIUM_BUFFER), Energy.energyPowerPerSecond(LUMIUM_ENERGY));
  public static final SlimefunItemStack THORNIUM_GENERATOR = new SlimefunItemStack(
      "THORNIUM_GENERATOR",
      Material.BLACK_GLAZED_TERRACOTTA, "&9Thornium Generator", "&fGenerates energy anywhere", "",
      "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
      Energy.energyBuffer(THORNIUM_BUFFER), Energy.energyPowerPerSecond(THORNIUM_ENERGY));
  public static final ItemStack[] MACHINE_SUPREME_GENERATOR = new ItemStack[]{
      Components.SUPREME, LUX_GENERATOR, Components.SUPREME,
      Components.SUPREME, LUMIUM_GENERATOR, Components.SUPREME,
      Components.CRYSTALLIZER_MACHINE, THORNIUM_GENERATOR, Components.CRYSTALLIZER_MACHINE
  };
  public static final SlimefunItemStack SUPREME_GENERATOR = new SlimefunItemStack(
      "SUPREME_GENERATOR",
      Material.PURPLE_GLAZED_TERRACOTTA, "&9Supreme Generator", "&fGenerates energy anywhere", "",
      "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
      Energy.energyBuffer(SUPREME_BUFFER), Energy.energyPowerPerSecond(SUPREME_ENERGY));

}
