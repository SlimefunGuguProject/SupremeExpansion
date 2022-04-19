package br.com.ohanacraft.supremeexpansion.resource;

import br.com.ohanacraft.supremeexpansion.core.CoreAlloy;
import br.com.ohanacraft.supremeexpansion.core.CoreBlock;
import br.com.ohanacraft.supremeexpansion.machine.quarry.MachineQuarry;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public class Components {

  public static final SlimefunItemStack SUPREME_NUGGET = new SlimefunItemStack("SUPREME_NUGGET",
      "cffc977cc7e10e564a09638a53bbc4c54c9c8dac7450ba3dfa3c9099d94f5", "&aNugget Supreme", "",
      "&7From the Supremacia...");
  public static final ItemStack[] RECIPE_SUPREME_NUGGET = {
      null, null, null,
      null, MachineQuarry.UNIQUENUGGETS_QUARRY, null,
      null, null, null
  };

  public static final SlimefunItemStack SUPREME = new SlimefunItemStack("SUPREME",
      "c69e3e6e5b2b92f0beb368b738b993d7ba225bf9bb2758bfc9fc2daba4a5a7d", "&aSupreme", "",
      "&7From the Nugget Supreme");
  public static final ItemStack[] RECIPE_SUPREME = {
      new ItemStack(SUPREME_NUGGET), new ItemStack(SUPREME_NUGGET), new ItemStack(SUPREME_NUGGET),
      new ItemStack(SUPREME_NUGGET), new ItemStack(SUPREME_NUGGET), new ItemStack(SUPREME_NUGGET),
      new ItemStack(SUPREME_NUGGET), new ItemStack(SUPREME_NUGGET), new ItemStack(SUPREME_NUGGET)
  };

  public static final SlimefunItemStack THORNIUM_BIT = new SlimefunItemStack(
      "RESOURCE_THORNIUM_BIT",
      Material.IRON_NUGGET, "&aThornium Bit", "", "&7From the depths of the word...");
  public static final ItemStack[] RECIPE_THORNIUM_BIT = {
      null, null, null,
      MachineQuarry.THORNIUM_QUARRY, MachineQuarry.UNIQUENUGGETS_QUARRY, null,
      null, null, null
  };

  public static final SlimefunItemStack THORNIUM_DUST = new SlimefunItemStack(
      "RESOURCE_THORNIUM_DUST",
      Material.GUNPOWDER, "&aThornium Dust", "", "&7From the Thornium Bit");
  public static final ItemStack[] RECIPE_THORNIUM_DUST = {
      new ItemStack(THORNIUM_BIT), new ItemStack(THORNIUM_BIT), new ItemStack(THORNIUM_BIT),
      new ItemStack(THORNIUM_BIT), new ItemStack(THORNIUM_BIT), new ItemStack(THORNIUM_BIT),
      new ItemStack(THORNIUM_BIT), new ItemStack(THORNIUM_BIT), new ItemStack(THORNIUM_BIT)
  };

  public static final SlimefunItemStack THORNIUM_INGOT = new SlimefunItemStack(
      "RESOURCE_THORNIUM_INGOT",
      Material.IRON_INGOT, "&aThornium Ingot", "", "&7From the Thornium Dust");
  public static final ItemStack[] RECIPE_THORNIUM_INGOT = {
      new ItemStack(THORNIUM_DUST), new ItemStack(THORNIUM_DUST), new ItemStack(THORNIUM_DUST),
      new ItemStack(THORNIUM_DUST), new ItemStack(THORNIUM_DUST), new ItemStack(THORNIUM_DUST),
      new ItemStack(THORNIUM_DUST), new ItemStack(THORNIUM_DUST), new ItemStack(THORNIUM_DUST)
  };

  public static final SlimefunItemStack THORNIUM_BIT_SYNTHETIC = new SlimefunItemStack(
      "RESOURCE_THORNIUM_BIT_SYNTHETIC",
      Material.GOLD_NUGGET, "&aThornium Bit Synthetic", "", "&7From the Thornium Bit");
  public static final ItemStack[] RECIPE_THORNIUM_BIT_SYNTHETIC = {
      new ItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE),
      new ItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT),
      new ItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE),
      new ItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT), new ItemStack(THORNIUM_BIT),
      new ItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT),
      new ItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE),
      new ItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT),
      new ItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE)
  };

  public static final SlimefunItemStack THORNIUM_DUST_SYNTHETIC = new SlimefunItemStack(
      "RESOURCE_THORNIUM_DUST_SYNTHETIC",
      Material.GLOWSTONE_DUST, "&aThornium Dust Synthetic", "", "&7From the Thornium Dust");
  public static final ItemStack[] RECIPE_THORNIUM_DUST_SYNTHETIC = {
      new ItemStack(SlimefunItems.SYNTHETIC_EMERALD),
      new ItemStack(SlimefunItems.HARDENED_METAL_INGOT),
      new ItemStack(SlimefunItems.SYNTHETIC_EMERALD),
      new ItemStack(SlimefunItems.HARDENED_METAL_INGOT), new ItemStack(THORNIUM_DUST),
      new ItemStack(SlimefunItems.HARDENED_METAL_INGOT),
      new ItemStack(SlimefunItems.SYNTHETIC_EMERALD),
      new ItemStack(SlimefunItems.HARDENED_METAL_INGOT),
      new ItemStack(SlimefunItems.SYNTHETIC_EMERALD)
  };

  public static final SlimefunItemStack THORNIUM_INGOT_SYNTHETIC = new SlimefunItemStack(
      "RESOURCE_THORNIUM_INGOT_SYNTHETIC",
      Material.GOLD_INGOT, "&aThornium Ingot Synthetic", "", "&7From the Thornium Ingot");
  public static final ItemStack[] RECIPE_THORNIUM_INGOT_SYNTHETIC = {
      new ItemStack(SlimefunItems.SYNTHETIC_DIAMOND), new ItemStack(SlimefunItems.STEEL_PLATE),
      new ItemStack(SlimefunItems.SYNTHETIC_DIAMOND),
      new ItemStack(SlimefunItems.STEEL_PLATE), new ItemStack(THORNIUM_INGOT),
      new ItemStack(SlimefunItems.STEEL_PLATE),
      new ItemStack(SlimefunItems.SYNTHETIC_DIAMOND), new ItemStack(SlimefunItems.STEEL_PLATE),
      new ItemStack(SlimefunItems.SYNTHETIC_DIAMOND)
  };

  public static final SlimefunItemStack THORNIUM_CARBONADO = new SlimefunItemStack(
      "RESOURCE_THORNIUM_CARBONADO",
      Material.NETHERITE_INGOT, "&aThornium Carbonado", "", "&7From the Thornium Ingot");
  public static final ItemStack[] RECIPE_THORNIUM_CARBONADO = {
      new ItemStack(SlimefunItems.CARBONADO), new ItemStack(SlimefunItems.REINFORCED_PLATE),
      new ItemStack(SlimefunItems.CARBONADO),
      new ItemStack(SlimefunItems.REINFORCED_PLATE), new ItemStack(THORNIUM_INGOT),
      new ItemStack(SlimefunItems.REINFORCED_PLATE),
      new ItemStack(SlimefunItems.CARBONADO), new ItemStack(SlimefunItems.REINFORCED_PLATE),
      new ItemStack(SlimefunItems.CARBONADO)
  };

  public static final SlimefunItemStack THORNIUM_ENERGIZED = new SlimefunItemStack(
      "RESOURCE_THORNIUM_ENERGIZED",
      Material.NETHERITE_INGOT, "&aThornium Energized", "", "&7From the Thornium Ingot");
  public static final ItemStack[] RECIPE_THORNIUM_ENERGIZED = {
      new ItemStack(SlimefunItems.BLISTERING_INGOT_3), new ItemStack(SlimefunItems.REDSTONE_ALLOY),
      new ItemStack(SlimefunItems.BLISTERING_INGOT_3),
      new ItemStack(SlimefunItems.REDSTONE_ALLOY), new ItemStack(THORNIUM_CARBONADO),
      new ItemStack(SlimefunItems.REDSTONE_ALLOY),
      new ItemStack(SlimefunItems.BLISTERING_INGOT_3), new ItemStack(SlimefunItems.REDSTONE_ALLOY),
      new ItemStack(SlimefunItems.BLISTERING_INGOT_3)
  };

  public static final SlimefunItemStack ALLOY_ZIRCONIUM = new SlimefunItemStack(
      "RESOURCE_ALLOY_ZIRCONIUM",
      Material.IRON_INGOT, "&aAlloy Zirconium", "", "&7Machine Component");
  public static final ItemStack[] RECIPE_ALLOY_ZIRCONIUM = {
      new ItemStack(SlimefunItems.ZINC_DUST), new ItemStack(SlimefunItems.SOLDER_INGOT),
      new ItemStack(SlimefunItems.ZINC_INGOT),
      null, null, null,
      null, null, null
  };


  public static final SlimefunItemStack ZIRCONIUM_PLATE = new SlimefunItemStack(
      "RESOURCE_ZIRCONIUM_PLATE",
      Material.IRON_BLOCK, "&aZirconium Plate", "", "&7Machine Component");
  public static final ItemStack[] RECIPE_ZIRCONIUM_PLATE = {
      new ItemStack(ALLOY_ZIRCONIUM), new ItemStack(ALLOY_ZIRCONIUM),
      new ItemStack(ALLOY_ZIRCONIUM),
      CoreBlock.RESOURCE_CORE_DIORITE, CoreBlock.RESOURCE_CORE_DIORITE,
      CoreBlock.RESOURCE_CORE_DIORITE,
      new ItemStack(ALLOY_ZIRCONIUM), new ItemStack(ALLOY_ZIRCONIUM), new ItemStack(ALLOY_ZIRCONIUM)
  };


  public static final SlimefunItemStack ALLOY_TITANIUM = new SlimefunItemStack(
      "RESOURCE_ALLOY_TITANIUM",
      Material.IRON_INGOT, "&aAlloy Titanium", "", "&7Machine Component");
  public static final ItemStack[] RECIPE_ALLOY_TITANIUM = {
      new ItemStack(SlimefunItems.TIN_DUST), new ItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT),
      new ItemStack(SlimefunItems.TIN_INGOT),
      null, null, null,
      null, null, null
  };


  public static final SlimefunItemStack TITANIUM_PLATE = new SlimefunItemStack(
      "RESOURCE_TITANIUM_PLATE",
      Material.IRON_BLOCK, "&aTitanium Plate", "", "&7Machine Component");
  public static final ItemStack[] RECIPE_TITANIUM_PLATE = {
      new ItemStack(ALLOY_TITANIUM), new ItemStack(ALLOY_TITANIUM), new ItemStack(ALLOY_TITANIUM),
      CoreBlock.RESOURCE_CORE_ANDESITE, CoreBlock.RESOURCE_CORE_ANDESITE,
      CoreBlock.RESOURCE_CORE_ANDESITE,
      new ItemStack(ALLOY_TITANIUM), new ItemStack(ALLOY_TITANIUM), new ItemStack(ALLOY_TITANIUM)
  };


  public static final SlimefunItemStack ALLOY_IRIDIUM = new SlimefunItemStack(
      "RESOURCE_ALLOY_IRIDIUM",
      Material.IRON_INGOT, "&aAlloy Iridium", "", "&7Machine Component");
  public static final ItemStack[] RECIPE_ALLOY_IRIDIUM = {
      new ItemStack(SlimefunItems.SILVER_DUST), new ItemStack(SlimefunItems.BILLON_INGOT),
      new ItemStack(SlimefunItems.SILVER_INGOT),
      null, null, null,
      null, null, null
  };


  public static final SlimefunItemStack IRIDIUM_PLATE = new SlimefunItemStack(
      "RESOURCE_IRIDIUM_PLATE",
      Material.IRON_BLOCK, "&aIridium Plate", "", "&7Machine Component");
  public static final ItemStack[] RECIPE_IRIDIUM_PLATE = {
      new ItemStack(ALLOY_IRIDIUM), new ItemStack(ALLOY_IRIDIUM), new ItemStack(ALLOY_IRIDIUM),
      CoreBlock.RESOURCE_CORE_GRAVEL, CoreBlock.RESOURCE_CORE_GRAVEL,
      CoreBlock.RESOURCE_CORE_GRAVEL,
      new ItemStack(ALLOY_IRIDIUM), new ItemStack(ALLOY_IRIDIUM), new ItemStack(ALLOY_IRIDIUM)
  };


  public static final SlimefunItemStack ALLOY_AURUM = new SlimefunItemStack("RESOURCE_ALLOY_AURUM",
      Material.GOLD_INGOT, "&aAlloy Aurum", "", "&7Machine Component");
  public static final ItemStack[] RECIPE_ALLOY_AURUM = {
      new ItemStack(SlimefunItems.GOLD_DUST), new ItemStack(SlimefunItems.COBALT_INGOT),
      new ItemStack(SlimefunItems.GOLD_24K),
      null, null, null,
      null, null, null
  };


  public static final SlimefunItemStack AURUM_PLATE = new SlimefunItemStack("RESOURCE_AURUM_PLATE",
      Material.GOLD_BLOCK, "&aAurum Plate", "", "&7Machine Component");
  public static final ItemStack[] RECIPE_AURUM_PLATE = {
      new ItemStack(ALLOY_AURUM), new ItemStack(ALLOY_AURUM), new ItemStack(ALLOY_AURUM),
      CoreBlock.RESOURCE_CORE_SAND, CoreBlock.RESOURCE_CORE_SAND, CoreBlock.RESOURCE_CORE_SAND,
      new ItemStack(ALLOY_AURUM), new ItemStack(ALLOY_AURUM), new ItemStack(ALLOY_AURUM)
  };


  public static final SlimefunItemStack ALLOY_MANGANESE = new SlimefunItemStack(
      "RESOURCE_ALLOY_MANGANESE",
      Material.GOLD_INGOT, "&aAlloy Manganese", "", "&7Machine Component");
  public static final ItemStack[] RECIPE_ALLOY_MANGANESE = {
      new ItemStack(SlimefunItems.MAGNESIUM_DUST), new ItemStack(SlimefunItems.DURALUMIN_INGOT),
      new ItemStack(SlimefunItems.MAGNESIUM_INGOT),
      null, null, null,
      null, null, null
  };


  public static final SlimefunItemStack MANGANESE_PLATE = new SlimefunItemStack(
      "RESOURCE_MANGANESE_PLATE",
      Material.GOLD_BLOCK, "&aManganese Plate", "", "&7Machine Component");
  public static final ItemStack[] RECIPE_MANGANESE_PLATE = {
      new ItemStack(ALLOY_MANGANESE), new ItemStack(ALLOY_MANGANESE),
      new ItemStack(ALLOY_MANGANESE),
      CoreBlock.RESOURCE_CORE_GRANITE, CoreBlock.RESOURCE_CORE_GRANITE,
      CoreBlock.RESOURCE_CORE_GRANITE,
      new ItemStack(ALLOY_MANGANESE), new ItemStack(ALLOY_MANGANESE), new ItemStack(ALLOY_MANGANESE)
  };


  public static final SlimefunItemStack ALLOY_PLATINUM = new SlimefunItemStack(
      "RESOURCE_ALLOY_PLATINUM",
      Material.GOLD_INGOT, "&aAlloy Platinum", "", "&7Machine Component");
  public static final ItemStack[] RECIPE_ALLOY_PLATINUM = {
      new ItemStack(SlimefunItems.LEAD_DUST), new ItemStack(SlimefunItems.BRASS_INGOT),
      new ItemStack(SlimefunItems.LEAD_INGOT),
      null, null, null,
      null, null, null
  };


  public static final SlimefunItemStack PLATINUM_PLATE = new SlimefunItemStack(
      "RESOURCE_PLATINUM_PLATE",
      Material.GOLD_BLOCK, "&aPlatinum Plate", "", "&7Machine Component");
  public static final ItemStack[] RECIPE_PLATINUM_PLATE = {
      new ItemStack(ALLOY_PLATINUM), new ItemStack(ALLOY_PLATINUM), new ItemStack(ALLOY_PLATINUM),
      CoreBlock.RESOURCE_CORE_CLAY, CoreBlock.RESOURCE_CORE_CLAY, CoreBlock.RESOURCE_CORE_CLAY,
      new ItemStack(ALLOY_PLATINUM), new ItemStack(ALLOY_PLATINUM), new ItemStack(ALLOY_PLATINUM)
  };


  public static final SlimefunItemStack ALLOY_ADAMANTIUM = new SlimefunItemStack(
      "RESOURCE_ALLOY_ADAMANTIUM",
      Material.NETHERITE_INGOT, "&aAlloy Adamantium", "", "&7Machine Component");
  public static final ItemStack[] RECIPE_ALLOY_ADAMANTIUM = {
      new ItemStack(SlimefunItems.ALUMINUM_DUST),
      new ItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT),
      new ItemStack(SlimefunItems.ALUMINUM_INGOT),
      null, null, null,
      null, null, null
  };


  public static final SlimefunItemStack ADAMANTIUM_PLATE = new SlimefunItemStack(
      "RESOURCE_ADAMANTIUM_PLATE",
      Material.NETHERITE_BLOCK, "&aAdamantium Plate", "", "&7Machine Component");
  public static final ItemStack[] RECIPE_ADAMANTIUM_PLATE = {
      new ItemStack(ALLOY_ADAMANTIUM), new ItemStack(ALLOY_ADAMANTIUM),
      new ItemStack(ALLOY_ADAMANTIUM),
      CoreBlock.RESOURCE_CORE_STONE, CoreBlock.RESOURCE_CORE_STONE, CoreBlock.RESOURCE_CORE_STONE,
      new ItemStack(ALLOY_ADAMANTIUM), new ItemStack(ALLOY_ADAMANTIUM),
      new ItemStack(ALLOY_ADAMANTIUM)
  };


  public static final SlimefunItemStack THORNERITE = new SlimefunItemStack("RESOURCE_THORNERITE",
      Material.NETHERITE_INGOT, "&aThornerite", "", "&7Machine Component");
  public static final ItemStack[] RECIPE_THORNERITE = {
      new ItemStack(Components.THORNIUM_INGOT), new ItemStack(ALLOY_ADAMANTIUM),
      new ItemStack(ALLOY_IRIDIUM),
      new ItemStack(ALLOY_PLATINUM), new ItemStack(ALLOY_TITANIUM), new ItemStack(ALLOY_ZIRCONIUM),
      null, null, null
  };


  public static final SlimefunItemStack INDUCTIVE_MACHINE = new SlimefunItemStack(
      "RESOURCE_INDUCTIVE_MACHINE",
      Material.DEAD_FIRE_CORAL_BLOCK, "&aInductive Machine", "", "&cMachine Component");
  public static final ItemStack[] RECIPE_INDUCTIVE_MACHINE = {
      SlimefunItems.REDSTONE_ALLOY, new ItemStack(ALLOY_PLATINUM), SlimefunItems.REDSTONE_ALLOY,
      new ItemStack(ALLOY_IRIDIUM), SlimefunItems.ELECTRO_MAGNET, new ItemStack(ALLOY_IRIDIUM),
      SlimefunItems.REDSTONE_ALLOY, new ItemStack(ALLOY_PLATINUM), SlimefunItems.REDSTONE_ALLOY
  };

  public static final SlimefunItemStack INDUCTOR_MACHINE = new SlimefunItemStack(
      "RESOURCE_INDUCTOR_MACHINE",
      Material.FIRE_CORAL_BLOCK, "&aInductor Machine", "", "&cAdvanced Machine Component");
  public static final ItemStack[] RECIPE_INDUCTOR_MACHINE = {
      SlimefunItems.REDSTONE_ALLOY, new ItemStack(PLATINUM_PLATE), SlimefunItems.REDSTONE_ALLOY,
      new ItemStack(IRIDIUM_PLATE), new ItemStack(INDUCTIVE_MACHINE), new ItemStack(IRIDIUM_PLATE),
      SlimefunItems.REDSTONE_ALLOY, new ItemStack(PLATINUM_PLATE), SlimefunItems.REDSTONE_ALLOY
  };

  public static final SlimefunItemStack RUSTLESS_MACHINE = new SlimefunItemStack(
      "RESOURCE_RUSTLESS_MACHINE",
      Material.DEAD_BRAIN_CORAL_BLOCK, "&aRustless Machine", "", "&cMachine Component");
  public static final ItemStack[] RECIPE_RUSTLESS_MACHINE = {
      SlimefunItems.HARDENED_METAL_INGOT, new ItemStack(ALLOY_ZIRCONIUM),
      SlimefunItems.HARDENED_METAL_INGOT,
      new ItemStack(ALLOY_MANGANESE), SlimefunItems.ELECTRO_MAGNET, new ItemStack(ALLOY_MANGANESE),
      SlimefunItems.HARDENED_METAL_INGOT, new ItemStack(ALLOY_ZIRCONIUM),
      SlimefunItems.HARDENED_METAL_INGOT
  };

  public static final SlimefunItemStack STAINLESS_MACHINE = new SlimefunItemStack(
      "RESOURCE_STAINLESS_MACHINE",
      Material.BRAIN_CORAL_BLOCK, "&aStainless Machine", "", "&cAdvanced Machine Component");
  public static final ItemStack[] RECIPE_STAINLESS_MACHINE = {
      SlimefunItems.HARDENED_METAL_INGOT, new ItemStack(ZIRCONIUM_PLATE),
      SlimefunItems.HARDENED_METAL_INGOT,
      new ItemStack(MANGANESE_PLATE), new ItemStack(RUSTLESS_MACHINE),
      new ItemStack(MANGANESE_PLATE),
      SlimefunItems.HARDENED_METAL_INGOT, new ItemStack(ZIRCONIUM_PLATE),
      SlimefunItems.HARDENED_METAL_INGOT
  };

  public static final SlimefunItemStack CARRIAGE_MACHINE = new SlimefunItemStack(
      "RESOURCE_CARRIAGE_MACHINE",
      Material.DEAD_HORN_CORAL_BLOCK, "&aCarriage Machine", "", "&cMachine Component");
  public static final ItemStack[] RECIPE_CARRIAGE_MACHINE = {
      SlimefunItems.GILDED_IRON, new ItemStack(ALLOY_AURUM), SlimefunItems.GILDED_IRON,
      new ItemStack(ALLOY_TITANIUM), SlimefunItems.ELECTRO_MAGNET, new ItemStack(ALLOY_TITANIUM),
      SlimefunItems.GILDED_IRON, new ItemStack(ALLOY_AURUM), SlimefunItems.GILDED_IRON
  };

  public static final SlimefunItemStack CONVEYANCE_MACHINE = new SlimefunItemStack(
      "RESOURCE_CONVEYANCE_MACHINE",
      Material.HORN_CORAL_BLOCK, "&aConveyance Machine", "", "&cAdvanced Machine Component");
  public static final ItemStack[] RECIPE_CONVEYANCE_MACHINE = {
      SlimefunItems.GILDED_IRON, new ItemStack(AURUM_PLATE), SlimefunItems.GILDED_IRON,
      new ItemStack(TITANIUM_PLATE), new ItemStack(CARRIAGE_MACHINE), new ItemStack(TITANIUM_PLATE),
      SlimefunItems.GILDED_IRON, new ItemStack(AURUM_PLATE), SlimefunItems.GILDED_IRON
  };

  public static final SlimefunItemStack PETRIFIER_MACHINE = new SlimefunItemStack(
      "RESOURCE_PETRIFIER_MACHINE",
      Material.DEAD_TUBE_CORAL_BLOCK, "&aPetrifier Machine", "", "&cMachine Component");
  public static final ItemStack[] RECIPE_PETRIFIER_MACHINE = {
      new ItemStack(CoreAlloy.RESOURCE_CORE_COAL), new ItemStack(RUSTLESS_MACHINE),
      new ItemStack(CoreAlloy.RESOURCE_CORE_COAL),
      new ItemStack(ALLOY_ADAMANTIUM), new ItemStack(CARRIAGE_MACHINE),
      new ItemStack(ALLOY_ADAMANTIUM),
      new ItemStack(CoreBlock.RESOURCE_CORE_STONE), new ItemStack(INDUCTIVE_MACHINE),
      new ItemStack(CoreBlock.RESOURCE_CORE_STONE)
  };

  public static final SlimefunItemStack CRYSTALLIZER_MACHINE = new SlimefunItemStack(
      "RESOURCE_CRYSTALLIZER_MACHINE",
      Material.TUBE_CORAL_BLOCK, "&aCrystallizer Machine", "", "&cAdvanced Machine Component");
  public static final ItemStack[] RECIPE_CRYSTALLIZER_MACHINE = {
      new ItemStack(CoreAlloy.RESOURCE_CORE_DIAMOND), new ItemStack(STAINLESS_MACHINE),
      new ItemStack(CoreAlloy.RESOURCE_CORE_DIAMOND),
      new ItemStack(ADAMANTIUM_PLATE), new ItemStack(PETRIFIER_MACHINE),
      new ItemStack(ADAMANTIUM_PLATE),
      new ItemStack(CoreAlloy.RESOURCE_CORE_EMERALD), new ItemStack(INDUCTOR_MACHINE),
      new ItemStack(CoreAlloy.RESOURCE_CORE_EMERALD)
  };

  public static final SlimefunItemStack BLEND_MACHINE = new SlimefunItemStack(
      "RESOURCE_BLEND_MACHINE",
      Material.BUBBLE_CORAL_BLOCK, "&aBlend Machine", "", "&cAdvanced Machine Component");
  public static final ItemStack[] RECIPE_BLEND_MACHINE = {
      new ItemStack(INDUCTOR_MACHINE), new ItemStack(CoreAlloy.RESOURCE_CORE_DIAMOND),
      new ItemStack(INDUCTOR_MACHINE),
      new ItemStack(CRYSTALLIZER_MACHINE), new ItemStack(CoreAlloy.RESOURCE_CORE_EMERALD),
      new ItemStack(CRYSTALLIZER_MACHINE),
      new ItemStack(CONVEYANCE_MACHINE), new ItemStack(CoreAlloy.RESOURCE_CORE_NETHERITE),
      new ItemStack(CONVEYANCE_MACHINE)
  };

}
