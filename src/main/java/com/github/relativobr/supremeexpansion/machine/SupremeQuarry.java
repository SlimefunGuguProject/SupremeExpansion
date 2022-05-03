package com.github.relativobr.supremeexpansion.machine;

import com.github.relativobr.supremeexpansion.core.SupremeMainCore;
import com.github.relativobr.supremeexpansion.magical.SupremeCetrus;
import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import com.github.relativobr.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class SupremeQuarry {

  public static final SlimefunItemStack UNIQUENUGGETS_QUARRY = new SlimefunItemStack(
      "UNIQUENUGGETS_QUARRY",
      "ec7007d16abcfac9c6830c74d37cfd439a26373457d91452c1a96b8e04a6d",
      "&eNuggets of Supreme Quarry",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
      UtilEnergy.energyPowerPerItem(10),
      UtilEnergy.energyBuffer(1000)
  );

  public static final SlimefunItemStack THORNIUM_QUARRY = new SlimefunItemStack(
      "THORNIUM_QUARRY",
      "6ddd4a12da1cc2c9f9d6cd49fc778e3a11f3757de6dd312d70a0d47885189c0",
      "&eThornium Quarry",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
      UtilEnergy.energyPowerPerItem(10),
      UtilEnergy.energyBuffer(1000)
  );

  public static final SlimefunItemStack DIAMOND_QUARRY = new SlimefunItemStack(
      "DIAMOND_QUARRY",
      "666070ce03a545ee4d263bcf27f36338d249d7cb7a2376f92c1673ae134e04b6",
      "&eDiamond Quarry",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
      UtilEnergy.energyPowerPerItem(10),
      UtilEnergy.energyBuffer(1000)
  );

  public static final SlimefunItemStack GOLD_QUARRY = new SlimefunItemStack(
      "GOLD_QUARRY",
      "6c07d48fd8764bc8d01a10cc6426578862090d9e856f3a8dd7f974a7521efc43",
      "&eGold Quarry",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
      UtilEnergy.energyPowerPerItem(20),
      UtilEnergy.energyBuffer(10000)
  );

  public static final SlimefunItemStack IRON_QUARRY = new SlimefunItemStack(
      "IRON_QUARRY",
      "f8eecae423359d3f5efd1063a9a7bcfaa43839d75d3b223c808df7961dd173d0",
      "&eIron Quarry",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
      UtilEnergy.energyPowerPerItem(20),
      UtilEnergy.energyBuffer(10000)
  );

  public static final SlimefunItemStack COAL_QUARRY = new SlimefunItemStack(
      "COAL_QUARRY",
      "579ee734b739c0d19546d5b4b049c01a055506cc00b0cfcbf177883d2c814c04",
      "&eCoal Quarry",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
      UtilEnergy.energyPowerPerItem(20),
      UtilEnergy.energyBuffer(10000)
  );

  public static final ItemStack[] MACHINE_SUPREMENUGGETS_QUARRY = new ItemStack[]{
      new ItemStack(SupremeCetrus.CETRUS_LUMIUM), new ItemStack(SupremeComponents.THORNERITE),
      new ItemStack(SupremeCetrus.CETRUS_LUMIUM),
      new ItemStack(SupremeMainCore.CORE_OF_NATURE), SupremeQuarry.THORNIUM_QUARRY,
      new ItemStack(SupremeMainCore.CORE_OF_BLOCK),
      new ItemStack(SupremeMainCore.CORE_OF_LIFE), new ItemStack(SlimefunItems.NUCLEAR_REACTOR),
      new ItemStack(SupremeMainCore.CORE_OF_DEATH)};

  public static final ItemStack[] MACHINE_THORNIUM_QUARRY = new ItemStack[]{
      new ItemStack(SupremeCetrus.CETRUS_LUMIUM), new ItemStack(SupremeComponents.ALLOY_ADAMANTIUM),
      new ItemStack(SupremeCetrus.CETRUS_LUMIUM),
      new ItemStack(SupremeComponents.CRYSTALLIZER_MACHINE), SupremeQuarry.DIAMOND_QUARRY,
      new ItemStack(SupremeComponents.CRYSTALLIZER_MACHINE),
      new ItemStack(SlimefunItems.ELECTRIC_MOTOR), new ItemStack(SlimefunItems.WITHER_ASSEMBLER),
      new ItemStack(SlimefunItems.ELECTRIC_MOTOR)};

  public static final ItemStack[] MACHINE_DIAMOND_QUARRY = new ItemStack[]{
      new ItemStack(SupremeCetrus.CETRUS_AQUA), new ItemStack(SupremeComponents.ALLOY_TITANIUM),
      new ItemStack(SupremeCetrus.CETRUS_AQUA),
      new ItemStack(SupremeComponents.INDUCTOR_MACHINE), SupremeQuarry.GOLD_QUARRY,
      new ItemStack(SupremeComponents.INDUCTOR_MACHINE),
      new ItemStack(SlimefunItems.ELECTRIC_MOTOR),
      new ItemStack(SlimefunItems.HEATED_PRESSURE_CHAMBER),
      new ItemStack(SlimefunItems.ELECTRIC_MOTOR)};

  public static final ItemStack[] MACHINE_GOLD_QUARRY = new ItemStack[]{
      new ItemStack(SupremeCetrus.CETRUS_LUX), new ItemStack(SupremeComponents.ALLOY_AURUM),
      new ItemStack(SupremeCetrus.CETRUS_LUX),
      new ItemStack(SupremeComponents.CONVEYANCE_MACHINE), SupremeQuarry.IRON_QUARRY,
      new ItemStack(SupremeComponents.CONVEYANCE_MACHINE),
      new ItemStack(SlimefunItems.ELECTRO_MAGNET), new ItemStack(SlimefunItems.ELECTRIC_SMELTERY),
      new ItemStack(SlimefunItems.ELECTRO_MAGNET)};

  public static final ItemStack[] MACHINE_IRON_QUARRY = new ItemStack[]{
      new ItemStack(SupremeCetrus.CETRUS_VENTUS), new ItemStack(SupremeComponents.ALLOY_IRIDIUM),
      new ItemStack(SupremeCetrus.CETRUS_VENTUS),
      new ItemStack(SupremeComponents.STAINLESS_MACHINE), SupremeQuarry.COAL_QUARRY,
      new ItemStack(SupremeComponents.STAINLESS_MACHINE),
      new ItemStack(SlimefunItems.ELECTRO_MAGNET),
      new ItemStack(SlimefunItems.IRON_GOLEM_ASSEMBLER),
      new ItemStack(SlimefunItems.ELECTRO_MAGNET)};

  public static final ItemStack[] MACHINE_COAL_QUARRY = new ItemStack[]{
      new ItemStack(SupremeCetrus.CETRUS_IGNIS), new ItemStack(SupremeComponents.ALLOY_PLATINUM),
      new ItemStack(SupremeCetrus.CETRUS_IGNIS),
      new ItemStack(Material.DIAMOND_PICKAXE), new ItemStack(SlimefunItems.GEO_MINER),
      new ItemStack(Material.DIAMOND_PICKAXE),
      new ItemStack(SlimefunItems.COAL_GENERATOR), new ItemStack(SlimefunItems.CARBON_PRESS),
      new ItemStack(SlimefunItems.LARGE_CAPACITOR)};


}