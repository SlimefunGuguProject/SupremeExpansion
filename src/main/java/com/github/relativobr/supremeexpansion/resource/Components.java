package com.github.relativobr.supremeexpansion.resource;

import com.github.relativobr.supremeexpansion.core.CoreAlloy;
import com.github.relativobr.supremeexpansion.core.CoreBlock;
import com.github.relativobr.supremeexpansion.machine.quarry.MachineQuarry;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public class Components {

  public static final SlimefunItemStack SUPREME_NUGGET = new SlimefunItemStack("SUPREME_NUGGET",
      "cffc977cc7e10e564a09638a53bbc4c54c9c8dac7450ba3dfa3c9099d94f5", "&a至尊粒子", "",
      "&7由虚无到至尊...");
  public static final ItemStack[] RECIPE_SUPREME_NUGGET = {
      null, null, null,
      null, MachineQuarry.UNIQUENUGGETS_QUARRY, null,
      null, null, null
  };

  public static final SlimefunItemStack SUPREME = new SlimefunItemStack("SUPREME",
      "c69e3e6e5b2b92f0beb368b738b993d7ba225bf9bb2758bfc9fc2daba4a5a7d", "&a至尊之心", "",
      "&7由至尊粒子组装而成");
  public static final ItemStack[] RECIPE_SUPREME = {
      new ItemStack(SUPREME_NUGGET), new ItemStack(SUPREME_NUGGET), new ItemStack(SUPREME_NUGGET),
      new ItemStack(SUPREME_NUGGET), new ItemStack(SUPREME_NUGGET), new ItemStack(SUPREME_NUGGET),
      new ItemStack(SUPREME_NUGGET), new ItemStack(SUPREME_NUGGET), new ItemStack(SUPREME_NUGGET)
  };

  public static final SlimefunItemStack THORNIUM_BIT = new SlimefunItemStack(
      "RESOURCE_THORNIUM_BIT",
      Material.IRON_NUGGET, "&a钍粒", "", "&7从世界深处迸发...");
  public static final ItemStack[] RECIPE_THORNIUM_BIT = {
      null, null, null,
      MachineQuarry.THORNIUM_QUARRY, MachineQuarry.UNIQUENUGGETS_QUARRY, null,
      null, null, null
  };

  public static final SlimefunItemStack THORNIUM_DUST = new SlimefunItemStack(
      "RESOURCE_THORNIUM_DUST",
      Material.GUNPOWDER, "&a钍粉", "", "&7由钍粒聚合");
  public static final ItemStack[] RECIPE_THORNIUM_DUST = {
      new ItemStack(THORNIUM_BIT), new ItemStack(THORNIUM_BIT), new ItemStack(THORNIUM_BIT),
      new ItemStack(THORNIUM_BIT), new ItemStack(THORNIUM_BIT), new ItemStack(THORNIUM_BIT),
      new ItemStack(THORNIUM_BIT), new ItemStack(THORNIUM_BIT), new ItemStack(THORNIUM_BIT)
  };

  public static final SlimefunItemStack THORNIUM_INGOT = new SlimefunItemStack(
      "RESOURCE_THORNIUM_INGOT",
      Material.IRON_INGOT, "&a至尊钍锭", "", "&7由钍粉冶炼");
  public static final ItemStack[] RECIPE_THORNIUM_INGOT = {
      new ItemStack(THORNIUM_DUST), new ItemStack(THORNIUM_DUST), new ItemStack(THORNIUM_DUST),
      new ItemStack(THORNIUM_DUST), new ItemStack(THORNIUM_DUST), new ItemStack(THORNIUM_DUST),
      new ItemStack(THORNIUM_DUST), new ItemStack(THORNIUM_DUST), new ItemStack(THORNIUM_DUST)
  };

  public static final SlimefunItemStack THORNIUM_BIT_SYNTHETIC = new SlimefunItemStack(
      "RESOURCE_THORNIUM_BIT_SYNTHETIC",
      Material.GOLD_NUGGET, "&a人造钍粒", "", "&7新的发现...");
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
      Material.GLOWSTONE_DUST, "&a人造钍粉", "", "&7由钍粒聚合");
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
      Material.GOLD_INGOT, "&a人造至尊钍锭", "", "&7由钍粉冶炼");
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
      Material.NETHERITE_INGOT, "&a碳钍", "", "&7由钍开发的新材料");
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
      Material.NETHERITE_INGOT, "&a充能钍", "", "&7将能量注入钍中");
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
      Material.IRON_INGOT, "&a锆合金", "", "&7用于制作基础零件");
  public static final ItemStack[] RECIPE_ALLOY_ZIRCONIUM = {
      new ItemStack(SlimefunItems.ZINC_DUST), new ItemStack(SlimefunItems.SOLDER_INGOT),
      new ItemStack(SlimefunItems.ZINC_INGOT),
      null, null, null,
      null, null, null
  };


  public static final SlimefunItemStack ZIRCONIUM_PLATE = new SlimefunItemStack(
      "RESOURCE_ZIRCONIUM_PLATE",
      Material.IRON_BLOCK, "&a合金锆板", "", "&7用于制作基础零件");
  public static final ItemStack[] RECIPE_ZIRCONIUM_PLATE = {
      new ItemStack(ALLOY_ZIRCONIUM), new ItemStack(ALLOY_ZIRCONIUM),
      new ItemStack(ALLOY_ZIRCONIUM),
      CoreBlock.RESOURCE_CORE_DIORITE, CoreBlock.RESOURCE_CORE_DIORITE,
      CoreBlock.RESOURCE_CORE_DIORITE,
      new ItemStack(ALLOY_ZIRCONIUM), new ItemStack(ALLOY_ZIRCONIUM), new ItemStack(ALLOY_ZIRCONIUM)
  };


  public static final SlimefunItemStack ALLOY_TITANIUM = new SlimefunItemStack(
      "RESOURCE_ALLOY_TITANIUM",
      Material.IRON_INGOT, "&a钛合金", "", "&7人造骨骼？");
  public static final ItemStack[] RECIPE_ALLOY_TITANIUM = {
      new ItemStack(SlimefunItems.TIN_DUST), new ItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT),
      new ItemStack(SlimefunItems.TIN_INGOT),
      null, null, null,
      null, null, null
  };


  public static final SlimefunItemStack TITANIUM_PLATE = new SlimefunItemStack(
      "RESOURCE_TITANIUM_PLATE",
      Material.IRON_BLOCK, "&a合金钛板", "", "&7柔韧性极强的材料");
  public static final ItemStack[] RECIPE_TITANIUM_PLATE = {
      new ItemStack(ALLOY_TITANIUM), new ItemStack(ALLOY_TITANIUM), new ItemStack(ALLOY_TITANIUM),
      CoreBlock.RESOURCE_CORE_ANDESITE, CoreBlock.RESOURCE_CORE_ANDESITE,
      CoreBlock.RESOURCE_CORE_ANDESITE,
      new ItemStack(ALLOY_TITANIUM), new ItemStack(ALLOY_TITANIUM), new ItemStack(ALLOY_TITANIUM)
  };


  public static final SlimefunItemStack ALLOY_IRIDIUM = new SlimefunItemStack(
      "RESOURCE_ALLOY_IRIDIUM",
      Material.IRON_INGOT, "&a铱合金", "", "&7一种珍稀的材料");
  public static final ItemStack[] RECIPE_ALLOY_IRIDIUM = {
      new ItemStack(SlimefunItems.SILVER_DUST), new ItemStack(SlimefunItems.BILLON_INGOT),
      new ItemStack(SlimefunItems.SILVER_INGOT),
      null, null, null,
      null, null, null
  };


  public static final SlimefunItemStack IRIDIUM_PLATE = new SlimefunItemStack(
      "RESOURCE_IRIDIUM_PLATE",
      Material.IRON_BLOCK, "&a合金铱板", "", "&7一种珍稀的材料");
  public static final ItemStack[] RECIPE_IRIDIUM_PLATE = {
      new ItemStack(ALLOY_IRIDIUM), new ItemStack(ALLOY_IRIDIUM), new ItemStack(ALLOY_IRIDIUM),
      CoreBlock.RESOURCE_CORE_GRAVEL, CoreBlock.RESOURCE_CORE_GRAVEL,
      CoreBlock.RESOURCE_CORE_GRAVEL,
      new ItemStack(ALLOY_IRIDIUM), new ItemStack(ALLOY_IRIDIUM), new ItemStack(ALLOY_IRIDIUM)
  };


  public static final SlimefunItemStack ALLOY_AURUM = new SlimefunItemStack("RESOURCE_ALLOY_AURUM",
      Material.GOLD_INGOT, "&a金合金", "", "&7由金子做的合金");
  public static final ItemStack[] RECIPE_ALLOY_AURUM = {
      new ItemStack(SlimefunItems.GOLD_DUST), new ItemStack(SlimefunItems.COBALT_INGOT),
      new ItemStack(SlimefunItems.GOLD_24K),
      null, null, null,
      null, null, null
  };


  public static final SlimefunItemStack AURUM_PLATE = new SlimefunItemStack("RESOURCE_AURUM_PLATE",
      Material.GOLD_BLOCK, "&a合金金板", "", "&7由金合金做的合金板");
  public static final ItemStack[] RECIPE_AURUM_PLATE = {
      new ItemStack(ALLOY_AURUM), new ItemStack(ALLOY_AURUM), new ItemStack(ALLOY_AURUM),
      CoreBlock.RESOURCE_CORE_SAND, CoreBlock.RESOURCE_CORE_SAND, CoreBlock.RESOURCE_CORE_SAND,
      new ItemStack(ALLOY_AURUM), new ItemStack(ALLOY_AURUM), new ItemStack(ALLOY_AURUM)
  };


  public static final SlimefunItemStack ALLOY_MANGANESE = new SlimefunItemStack(
      "RESOURCE_ALLOY_MANGANESE",
      Material.GOLD_INGOT, "&a锰合金", "", "&7催化剂？");
  public static final ItemStack[] RECIPE_ALLOY_MANGANESE = {
      new ItemStack(SlimefunItems.MAGNESIUM_DUST), new ItemStack(SlimefunItems.DURALUMIN_INGOT),
      new ItemStack(SlimefunItems.MAGNESIUM_INGOT),
      null, null, null,
      null, null, null
  };


  public static final SlimefunItemStack MANGANESE_PLATE = new SlimefunItemStack(
      "RESOURCE_MANGANESE_PLATE",
      Material.GOLD_BLOCK, "&a合金锰板", "", "&7坚固且耐用");
  public static final ItemStack[] RECIPE_MANGANESE_PLATE = {
      new ItemStack(ALLOY_MANGANESE), new ItemStack(ALLOY_MANGANESE),
      new ItemStack(ALLOY_MANGANESE),
      CoreBlock.RESOURCE_CORE_GRANITE, CoreBlock.RESOURCE_CORE_GRANITE,
      CoreBlock.RESOURCE_CORE_GRANITE,
      new ItemStack(ALLOY_MANGANESE), new ItemStack(ALLOY_MANGANESE), new ItemStack(ALLOY_MANGANESE)
  };


  public static final SlimefunItemStack ALLOY_PLATINUM = new SlimefunItemStack(
      "RESOURCE_ALLOY_PLATINUM",
      Material.GOLD_INGOT, "&a铂合金", "", "&7软而刚硬");
  public static final ItemStack[] RECIPE_ALLOY_PLATINUM = {
      new ItemStack(SlimefunItems.LEAD_DUST), new ItemStack(SlimefunItems.BRASS_INGOT),
      new ItemStack(SlimefunItems.LEAD_INGOT),
      null, null, null,
      null, null, null
  };


  public static final SlimefunItemStack PLATINUM_PLATE = new SlimefunItemStack(
      "RESOURCE_PLATINUM_PLATE",
      Material.GOLD_BLOCK, "&a合金铂板", "", "&7一种常用的基础材料");
  public static final ItemStack[] RECIPE_PLATINUM_PLATE = {
      new ItemStack(ALLOY_PLATINUM), new ItemStack(ALLOY_PLATINUM), new ItemStack(ALLOY_PLATINUM),
      CoreBlock.RESOURCE_CORE_CLAY, CoreBlock.RESOURCE_CORE_CLAY, CoreBlock.RESOURCE_CORE_CLAY,
      new ItemStack(ALLOY_PLATINUM), new ItemStack(ALLOY_PLATINUM), new ItemStack(ALLOY_PLATINUM)
  };


  public static final SlimefunItemStack ALLOY_ADAMANTIUM = new SlimefunItemStack(
      "RESOURCE_ALLOY_ADAMANTIUM",
      Material.NETHERITE_INGOT, "&a精金合金", "", "&7似乎很难发现到它");
  public static final ItemStack[] RECIPE_ALLOY_ADAMANTIUM = {
      new ItemStack(SlimefunItems.ALUMINUM_DUST),
      new ItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT),
      new ItemStack(SlimefunItems.ALUMINUM_INGOT),
      null, null, null,
      null, null, null
  };


  public static final SlimefunItemStack ADAMANTIUM_PLATE = new SlimefunItemStack(
      "RESOURCE_ADAMANTIUM_PLATE",
      Material.NETHERITE_BLOCK, "&a合金精金板", "", "&7闪亮且奢侈");
  public static final ItemStack[] RECIPE_ADAMANTIUM_PLATE = {
      new ItemStack(ALLOY_ADAMANTIUM), new ItemStack(ALLOY_ADAMANTIUM),
      new ItemStack(ALLOY_ADAMANTIUM),
      CoreBlock.RESOURCE_CORE_STONE, CoreBlock.RESOURCE_CORE_STONE, CoreBlock.RESOURCE_CORE_STONE,
      new ItemStack(ALLOY_ADAMANTIUM), new ItemStack(ALLOY_ADAMANTIUM),
      new ItemStack(ALLOY_ADAMANTIUM)
  };


  public static final SlimefunItemStack THORNERITE = new SlimefunItemStack("RESOURCE_THORNERITE",
      Material.NETHERITE_INGOT, "&a钍石", "", "&7适用于某些零件");
  public static final ItemStack[] RECIPE_THORNERITE = {
      new ItemStack(Components.THORNIUM_INGOT), new ItemStack(ALLOY_ADAMANTIUM),
      new ItemStack(ALLOY_IRIDIUM),
      new ItemStack(ALLOY_PLATINUM), new ItemStack(ALLOY_TITANIUM), new ItemStack(ALLOY_ZIRCONIUM),
      null, null, null
  };


  public static final SlimefunItemStack INDUCTIVE_MACHINE = new SlimefunItemStack(
      "RESOURCE_INDUCTIVE_MACHINE",
      Material.DEAD_FIRE_CORAL_BLOCK, "&a感应仪", "", "&c用于合成至尊机器");
  public static final ItemStack[] RECIPE_INDUCTIVE_MACHINE = {
      SlimefunItems.REDSTONE_ALLOY, new ItemStack(ALLOY_PLATINUM), SlimefunItems.REDSTONE_ALLOY,
      new ItemStack(ALLOY_IRIDIUM), SlimefunItems.ELECTRO_MAGNET, new ItemStack(ALLOY_IRIDIUM),
      SlimefunItems.REDSTONE_ALLOY, new ItemStack(ALLOY_PLATINUM), SlimefunItems.REDSTONE_ALLOY
  };

  public static final SlimefunItemStack INDUCTOR_MACHINE = new SlimefunItemStack(
      "RESOURCE_INDUCTOR_MACHINE",
      Material.FIRE_CORAL_BLOCK, "&a高级感应仪", "", "&c用于合成高级至尊机器");
  public static final ItemStack[] RECIPE_INDUCTOR_MACHINE = {
      SlimefunItems.REDSTONE_ALLOY, new ItemStack(PLATINUM_PLATE), SlimefunItems.REDSTONE_ALLOY,
      new ItemStack(IRIDIUM_PLATE), new ItemStack(INDUCTIVE_MACHINE), new ItemStack(IRIDIUM_PLATE),
      SlimefunItems.REDSTONE_ALLOY, new ItemStack(PLATINUM_PLATE), SlimefunItems.REDSTONE_ALLOY
  };

  public static final SlimefunItemStack RUSTLESS_MACHINE = new SlimefunItemStack(
      "RESOURCE_RUSTLESS_MACHINE",
      Material.DEAD_BRAIN_CORAL_BLOCK, "&a不锈钢核心", "", "&c抗腐蚀性大大增强");
  public static final ItemStack[] RECIPE_RUSTLESS_MACHINE = {
      SlimefunItems.HARDENED_METAL_INGOT, new ItemStack(ALLOY_ZIRCONIUM),
      SlimefunItems.HARDENED_METAL_INGOT,
      new ItemStack(ALLOY_MANGANESE), SlimefunItems.ELECTRO_MAGNET, new ItemStack(ALLOY_MANGANESE),
      SlimefunItems.HARDENED_METAL_INGOT, new ItemStack(ALLOY_ZIRCONIUM),
      SlimefunItems.HARDENED_METAL_INGOT
  };

  public static final SlimefunItemStack STAINLESS_MACHINE = new SlimefunItemStack(
      "RESOURCE_STAINLESS_MACHINE",
      Material.BRAIN_CORAL_BLOCK, "&a高级不锈钢核心", "", "&c精加工以后将更加坚固");
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
      Material.DEAD_HORN_CORAL_BLOCK, "&a滑座", "", "&c机床上的部件");
  public static final ItemStack[] RECIPE_CARRIAGE_MACHINE = {
      SlimefunItems.GILDED_IRON, new ItemStack(ALLOY_AURUM), SlimefunItems.GILDED_IRON,
      new ItemStack(ALLOY_TITANIUM), SlimefunItems.ELECTRO_MAGNET, new ItemStack(ALLOY_TITANIUM),
      SlimefunItems.GILDED_IRON, new ItemStack(ALLOY_AURUM), SlimefunItems.GILDED_IRON
  };

  public static final SlimefunItemStack CONVEYANCE_MACHINE = new SlimefunItemStack(
      "RESOURCE_CONVEYANCE_MACHINE",
      Material.HORN_CORAL_BLOCK, "&a运输仪", "", "&c高效便捷");
  public static final ItemStack[] RECIPE_CONVEYANCE_MACHINE = {
      SlimefunItems.GILDED_IRON, new ItemStack(AURUM_PLATE), SlimefunItems.GILDED_IRON,
      new ItemStack(TITANIUM_PLATE), new ItemStack(CARRIAGE_MACHINE), new ItemStack(TITANIUM_PLATE),
      SlimefunItems.GILDED_IRON, new ItemStack(AURUM_PLATE), SlimefunItems.GILDED_IRON
  };

  public static final SlimefunItemStack PETRIFIER_MACHINE = new SlimefunItemStack(
      "RESOURCE_PETRIFIER_MACHINE",
      Material.DEAD_TUBE_CORAL_BLOCK, "&a石化核心", "", "&c用于制作基础至尊机器);
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
      Material.TUBE_CORAL_BLOCK, "&a水晶化核心", "", "&c用于制作高级至尊机器");
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
      Material.BUBBLE_CORAL_BLOCK, "&a搅拌核心", "", "&c锋利且耐用");
  public static final ItemStack[] RECIPE_BLEND_MACHINE = {
      new ItemStack(INDUCTOR_MACHINE), new ItemStack(CoreAlloy.RESOURCE_CORE_DIAMOND),
      new ItemStack(INDUCTOR_MACHINE),
      new ItemStack(CRYSTALLIZER_MACHINE), new ItemStack(CoreAlloy.RESOURCE_CORE_EMERALD),
      new ItemStack(CRYSTALLIZER_MACHINE),
      new ItemStack(CONVEYANCE_MACHINE), new ItemStack(CoreAlloy.RESOURCE_CORE_NETHERITE),
      new ItemStack(CONVEYANCE_MACHINE)
  };

}
