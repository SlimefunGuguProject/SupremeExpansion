package com.github.relativobr.supremeexpansion.resource;

import com.github.relativobr.supremeexpansion.core.SupremeCoreAlloy;
import com.github.relativobr.supremeexpansion.core.SupremeCoreBlock;
import com.github.relativobr.supremeexpansion.machine.SupremeQuarry;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeComponents {

    public static final SlimefunItemStack SUPREME_NUGGET =
        new SlimefunItemStack(
            "SUPREME_NUGGET",
            "cffc977cc7e10e564a09638a53bbc4c54c9c8dac7450ba3dfa3c9099d94f5",
            "&a至尊粒子",
            "",
            "&7由虚无到至尊...");
    public static final ItemStack[] RECIPE_SUPREME_NUGGET = {
        null, null, null,
        null, SupremeQuarry.UNIQUENUGGETS_QUARRY, null,
        null, null, null
    };

    public static final SlimefunItemStack SUPREME =
        new SlimefunItemStack(
            "SUPREME",
            "c69e3e6e5b2b92f0beb368b738b993d7ba225bf9bb2758bfc9fc2daba4a5a7d",
            "&a至尊之心",
            "",
            "&7由至尊粒子制作而成");
    public static final ItemStack[] RECIPE_SUPREME = {
        SupremeComponents.SUPREME_NUGGET, SupremeComponents.SUPREME_NUGGET,
        SupremeComponents.SUPREME_NUGGET,
        SupremeComponents.SUPREME_NUGGET, SupremeComponents.SUPREME_NUGGET,
        SupremeComponents.SUPREME_NUGGET,
        SupremeComponents.SUPREME_NUGGET, SupremeComponents.SUPREME_NUGGET,
        SupremeComponents.SUPREME_NUGGET
    };

    public static final SlimefunItemStack THORNIUM_BIT =
        new SlimefunItemStack(
            "RESOURCE_THORNIUM_BIT",
            Material.IRON_NUGGET,
            "&a钍粒",
            "",
            "&7从世界深处迸发...");
    public static final ItemStack[] RECIPE_THORNIUM_BIT = {
        null,
        null,
        null,
        SupremeQuarry.THORNIUM_QUARRY,
        SupremeQuarry.UNIQUENUGGETS_QUARRY,
        null,
        null,
        null,
        null
    };

    public static final SlimefunItemStack THORNIUM_DUST =
        new SlimefunItemStack(
            "RESOURCE_THORNIUM_DUST",
            Material.GUNPOWDER,
            "&a钍粉",
            "",
            "&7由钍粒聚合");
    public static final ItemStack[] RECIPE_THORNIUM_DUST = {
        SupremeComponents.THORNIUM_BIT, SupremeComponents.THORNIUM_BIT, SupremeComponents.THORNIUM_BIT,
        SupremeComponents.THORNIUM_BIT, SupremeComponents.THORNIUM_BIT, SupremeComponents.THORNIUM_BIT,
        SupremeComponents.THORNIUM_BIT, SupremeComponents.THORNIUM_BIT, SupremeComponents.THORNIUM_BIT
    };

    public static final SlimefunItemStack THORNIUM_INGOT =
        new SlimefunItemStack(
            "RESOURCE_THORNIUM_INGOT",
            Material.IRON_INGOT,
            "&a至尊钍锭",
            "",
            "&7由钍粉冶炼");
    public static final ItemStack[] RECIPE_THORNIUM_INGOT = {
        SupremeComponents.THORNIUM_DUST, SupremeComponents.THORNIUM_DUST,
        SupremeComponents.THORNIUM_DUST,
        SupremeComponents.THORNIUM_DUST, SupremeComponents.THORNIUM_DUST,
        SupremeComponents.THORNIUM_DUST,
        SupremeComponents.THORNIUM_DUST, SupremeComponents.THORNIUM_DUST,
        SupremeComponents.THORNIUM_DUST
    };

    public static final SlimefunItemStack THORNIUM_BIT_SYNTHETIC =
        new SlimefunItemStack(
            "RESOURCE_THORNIUM_BIT_SYNTHETIC",
            Material.GOLD_NUGGET,
            "&a人造钍粒",
            "",
            "&7新的发现");
    public static final ItemStack[] RECIPE_THORNIUM_BIT_SYNTHETIC = {
        SlimefunItems.SYNTHETIC_SAPPHIRE,
        SlimefunItems.DAMASCUS_STEEL_INGOT,
        SlimefunItems.SYNTHETIC_SAPPHIRE,
        SlimefunItems.DAMASCUS_STEEL_INGOT,
        SupremeComponents.THORNIUM_BIT,
        SlimefunItems.DAMASCUS_STEEL_INGOT,
        SlimefunItems.SYNTHETIC_SAPPHIRE,
        SlimefunItems.DAMASCUS_STEEL_INGOT,
        SlimefunItems.SYNTHETIC_SAPPHIRE
    };

    public static final SlimefunItemStack THORNIUM_DUST_SYNTHETIC =
        new SlimefunItemStack(
            "RESOURCE_THORNIUM_DUST_SYNTHETIC",
            Material.GLOWSTONE_DUST,
            "&a人造钍粉",
            "",
            "&7由钍粒聚合");
    public static final ItemStack[] RECIPE_THORNIUM_DUST_SYNTHETIC = {
        SlimefunItems.SYNTHETIC_EMERALD,
        SlimefunItems.HARDENED_METAL_INGOT,
        SlimefunItems.SYNTHETIC_EMERALD,
        SlimefunItems.HARDENED_METAL_INGOT,
        SupremeComponents.THORNIUM_DUST,
        SlimefunItems.HARDENED_METAL_INGOT,
        SlimefunItems.SYNTHETIC_EMERALD,
        SlimefunItems.HARDENED_METAL_INGOT,
        SlimefunItems.SYNTHETIC_EMERALD
    };

    public static final SlimefunItemStack THORNIUM_INGOT_SYNTHETIC =
        new SlimefunItemStack(
            "RESOURCE_THORNIUM_INGOT_SYNTHETIC",
            Material.GOLD_INGOT,
            "&a人造至尊钍锭",
            "",
            "&7由钍粉冶炼");
    public static final ItemStack[] RECIPE_THORNIUM_INGOT_SYNTHETIC = {
        SlimefunItems.SYNTHETIC_DIAMOND,
        SlimefunItems.STEEL_PLATE,
        SlimefunItems.SYNTHETIC_DIAMOND,
        SlimefunItems.STEEL_PLATE,
        SupremeComponents.THORNIUM_INGOT,
        SlimefunItems.STEEL_PLATE,
        SlimefunItems.SYNTHETIC_DIAMOND,
        SlimefunItems.STEEL_PLATE,
        SlimefunItems.SYNTHETIC_DIAMOND
    };

    public static final SlimefunItemStack THORNIUM_CARBONADO =
        new SlimefunItemStack(
            "RESOURCE_THORNIUM_CARBONADO",
            Material.NETHERITE_INGOT,
            "&a碳钍",
            "",
            "&7由钍开发的新材料");
    public static final ItemStack[] RECIPE_THORNIUM_CARBONADO = {
        SlimefunItems.CARBONADO,
        SlimefunItems.REINFORCED_PLATE,
        SlimefunItems.CARBONADO,
        SlimefunItems.REINFORCED_PLATE,
        SupremeComponents.THORNIUM_INGOT,
        SlimefunItems.REINFORCED_PLATE,
        SlimefunItems.CARBONADO,
        SlimefunItems.REINFORCED_PLATE,
        SlimefunItems.CARBONADO
    };

    public static final SlimefunItemStack THORNIUM_ENERGIZED =
        new SlimefunItemStack(
            "RESOURCE_THORNIUM_ENERGIZED",
            Material.NETHERITE_INGOT,
            "&a充能钍",
            "",
            "&7将能量注入钍中");
    public static final ItemStack[] RECIPE_THORNIUM_ENERGIZED = {
        SlimefunItems.BLISTERING_INGOT_3,
        SlimefunItems.REDSTONE_ALLOY,
        SlimefunItems.BLISTERING_INGOT_3,
        SlimefunItems.REDSTONE_ALLOY,
        SupremeComponents.THORNIUM_CARBONADO,
        SlimefunItems.REDSTONE_ALLOY,
        SlimefunItems.BLISTERING_INGOT_3,
        SlimefunItems.REDSTONE_ALLOY,
        SlimefunItems.BLISTERING_INGOT_3
    };

    public static final SlimefunItemStack ALLOY_ZIRCONIUM =
        new SlimefunItemStack(
            "RESOURCE_ALLOY_ZIRCONIUM",
            Material.IRON_INGOT,
            "&a锆合金",
            "",
            "&7机器零件");
    public static final ItemStack[] RECIPE_ALLOY_ZIRCONIUM = {
        SlimefunItems.ZINC_DUST,
        SlimefunItems.SOLDER_INGOT,
        SlimefunItems.ZINC_INGOT,
        null,
        null,
        null,
        null,
        null,
        null
    };

    public static final SlimefunItemStack ZIRCONIUM_PLATE =
        new SlimefunItemStack(
            "RESOURCE_ZIRCONIUM_PLATE",
            Material.IRON_BLOCK,
            "&a锆合金板",
            "",
            "&7机器零件");
    public static final ItemStack[] RECIPE_ZIRCONIUM_PLATE = {
        SupremeComponents.ALLOY_ZIRCONIUM,
        SupremeComponents.ALLOY_ZIRCONIUM,
        SupremeComponents.ALLOY_ZIRCONIUM,
        SupremeCoreBlock.RESOURCE_CORE_DIORITE,
        SupremeCoreBlock.RESOURCE_CORE_DIORITE,
        SupremeCoreBlock.RESOURCE_CORE_DIORITE,
        SupremeComponents.ALLOY_ZIRCONIUM,
        SupremeComponents.ALLOY_ZIRCONIUM,
        SupremeComponents.ALLOY_ZIRCONIUM
    };

    public static final SlimefunItemStack ALLOY_TITANIUM =
        new SlimefunItemStack(
            "RESOURCE_ALLOY_TITANIUM",
            Material.IRON_INGOT,
            "&a钛合金",
            "",
            "&7机器零件");
    public static final ItemStack[] RECIPE_ALLOY_TITANIUM = {
        SlimefunItems.TIN_DUST,
        SlimefunItems.DAMASCUS_STEEL_INGOT,
        SlimefunItems.TIN_INGOT,
        null,
        null,
        null,
        null,
        null,
        null
    };

    public static final SlimefunItemStack TITANIUM_PLATE =
        new SlimefunItemStack(
            "RESOURCE_TITANIUM_PLATE",
            Material.IRON_BLOCK,
            "&a钛合金板",
            "",
            "&7机器零件");
    public static final ItemStack[] RECIPE_TITANIUM_PLATE = {
        SupremeComponents.ALLOY_TITANIUM,
        SupremeComponents.ALLOY_TITANIUM,
        SupremeComponents.ALLOY_TITANIUM,
        SupremeCoreBlock.RESOURCE_CORE_ANDESITE,
        SupremeCoreBlock.RESOURCE_CORE_ANDESITE,
        SupremeCoreBlock.RESOURCE_CORE_ANDESITE,
        SupremeComponents.ALLOY_TITANIUM,
        SupremeComponents.ALLOY_TITANIUM,
        SupremeComponents.ALLOY_TITANIUM
    };

    public static final SlimefunItemStack ALLOY_IRIDIUM =
        new SlimefunItemStack(
            "RESOURCE_ALLOY_IRIDIUM",
            Material.IRON_INGOT,
            "&a铱合金",
            "",
            "&7机器零件");
    public static final ItemStack[] RECIPE_ALLOY_IRIDIUM = {
        SlimefunItems.SILVER_DUST,
        SlimefunItems.BILLON_INGOT,
        SlimefunItems.SILVER_INGOT,
        null,
        null,
        null,
        null,
        null,
        null
    };

    public static final SlimefunItemStack IRIDIUM_PLATE =
        new SlimefunItemStack(
            "RESOURCE_IRIDIUM_PLATE",
            Material.IRON_BLOCK,
            "&a铱合金板",
            "",
            "&7机器零件");
    public static final ItemStack[] RECIPE_IRIDIUM_PLATE = {
        SupremeComponents.ALLOY_IRIDIUM,
        SupremeComponents.ALLOY_IRIDIUM,
        SupremeComponents.ALLOY_IRIDIUM,
        SupremeCoreBlock.RESOURCE_CORE_GRAVEL,
        SupremeCoreBlock.RESOURCE_CORE_GRAVEL,
        SupremeCoreBlock.RESOURCE_CORE_GRAVEL,
        SupremeComponents.ALLOY_IRIDIUM,
        SupremeComponents.ALLOY_IRIDIUM,
        SupremeComponents.ALLOY_IRIDIUM
    };

    public static final SlimefunItemStack ALLOY_AURUM =
        new SlimefunItemStack(
            "RESOURCE_ALLOY_AURUM", Material.GOLD_INGOT, "&a金合金", "", "&7机器零件");
    public static final ItemStack[] RECIPE_ALLOY_AURUM = {
        SlimefunItems.GOLD_DUST,
        SlimefunItems.COBALT_INGOT,
        SlimefunItems.GOLD_24K,
        null,
        null,
        null,
        null,
        null,
        null
    };

    public static final SlimefunItemStack AURUM_PLATE =
        new SlimefunItemStack(
            "RESOURCE_AURUM_PLATE", Material.GOLD_BLOCK, "&a金合金板", "", "&7机器零件");
    public static final ItemStack[] RECIPE_AURUM_PLATE = {
        SupremeComponents.ALLOY_AURUM,
        SupremeComponents.ALLOY_AURUM,
        SupremeComponents.ALLOY_AURUM,
        SupremeCoreBlock.RESOURCE_CORE_SAND,
        SupremeCoreBlock.RESOURCE_CORE_SAND,
        SupremeCoreBlock.RESOURCE_CORE_SAND,
        SupremeComponents.ALLOY_AURUM,
        SupremeComponents.ALLOY_AURUM,
        SupremeComponents.ALLOY_AURUM
    };

    public static final SlimefunItemStack ALLOY_MANGANESE =
        new SlimefunItemStack(
            "RESOURCE_ALLOY_MANGANESE",
            Material.GOLD_INGOT,
            "&a镁合金",
            "",
            "&7机器零件");
    public static final ItemStack[] RECIPE_ALLOY_MANGANESE = {
        SlimefunItems.MAGNESIUM_DUST,
        SlimefunItems.DURALUMIN_INGOT,
        SlimefunItems.MAGNESIUM_INGOT,
        null,
        null,
        null,
        null,
        null,
        null
    };

    public static final SlimefunItemStack MANGANESE_PLATE =
        new SlimefunItemStack(
            "RESOURCE_MANGANESE_PLATE",
            Material.GOLD_BLOCK,
            "&a镁合金板",
            "",
            "&7机器零件");
    public static final ItemStack[] RECIPE_MANGANESE_PLATE = {
        SupremeComponents.ALLOY_MANGANESE,
        SupremeComponents.ALLOY_MANGANESE,
        SupremeComponents.ALLOY_MANGANESE,
        SupremeCoreBlock.RESOURCE_CORE_GRANITE,
        SupremeCoreBlock.RESOURCE_CORE_GRANITE,
        SupremeCoreBlock.RESOURCE_CORE_GRANITE,
        SupremeComponents.ALLOY_MANGANESE,
        SupremeComponents.ALLOY_MANGANESE,
        SupremeComponents.ALLOY_MANGANESE
    };

    public static final SlimefunItemStack ALLOY_PLATINUM =
        new SlimefunItemStack(
            "RESOURCE_ALLOY_PLATINUM",
            Material.GOLD_INGOT,
            "&a铂合金",
            "",
            "&7机器零件");
    public static final ItemStack[] RECIPE_ALLOY_PLATINUM = {
        SlimefunItems.LEAD_DUST,
        SlimefunItems.BRASS_INGOT,
        SlimefunItems.LEAD_INGOT,
        null,
        null,
        null,
        null,
        null,
        null
    };

    public static final SlimefunItemStack PLATINUM_PLATE =
        new SlimefunItemStack(
            "RESOURCE_PLATINUM_PLATE",
            Material.GOLD_BLOCK,
            "&a铂合金板",
            "",
            "&7机器零件");
    public static final ItemStack[] RECIPE_PLATINUM_PLATE = {
        SupremeComponents.ALLOY_PLATINUM,
        SupremeComponents.ALLOY_PLATINUM,
        SupremeComponents.ALLOY_PLATINUM,
        SupremeCoreBlock.RESOURCE_CORE_CLAY,
        SupremeCoreBlock.RESOURCE_CORE_CLAY,
        SupremeCoreBlock.RESOURCE_CORE_CLAY,
        SupremeComponents.ALLOY_PLATINUM,
        SupremeComponents.ALLOY_PLATINUM,
        SupremeComponents.ALLOY_PLATINUM
    };

    public static final SlimefunItemStack ALLOY_ADAMANTIUM =
        new SlimefunItemStack(
            "RESOURCE_ALLOY_ADAMANTIUM",
            Material.NETHERITE_INGOT,
            "&a精金合金",
            "",
            "&7机器零件");
    public static final ItemStack[] RECIPE_ALLOY_ADAMANTIUM = {
        SlimefunItems.ALUMINUM_DUST,
        SlimefunItems.REINFORCED_ALLOY_INGOT,
        SlimefunItems.ALUMINUM_INGOT,
        null,
        null,
        null,
        null,
        null,
        null
    };

    public static final SlimefunItemStack ADAMANTIUM_PLATE =
        new SlimefunItemStack(
            "RESOURCE_ADAMANTIUM_PLATE",
            Material.NETHERITE_BLOCK,
            "&a精金合金板",
            "",
            "&7机器零件");
    public static final ItemStack[] RECIPE_ADAMANTIUM_PLATE = {
        SupremeComponents.ALLOY_ADAMANTIUM,
        SupremeComponents.ALLOY_ADAMANTIUM,
        SupremeComponents.ALLOY_ADAMANTIUM,
        SupremeCoreBlock.RESOURCE_CORE_STONE,
        SupremeCoreBlock.RESOURCE_CORE_STONE,
        SupremeCoreBlock.RESOURCE_CORE_STONE,
        SupremeComponents.ALLOY_ADAMANTIUM,
        SupremeComponents.ALLOY_ADAMANTIUM,
        SupremeComponents.ALLOY_ADAMANTIUM
    };

    public static final SlimefunItemStack THORNERITE =
        new SlimefunItemStack(
            "RESOURCE_THORNERITE",
            Material.NETHERITE_INGOT,
            "&aThornerite",
            "",
            "&7机器零件");
    public static final ItemStack[] RECIPE_THORNERITE = {
        SupremeComponents.THORNIUM_INGOT,
        SupremeComponents.ALLOY_ADAMANTIUM,
        SupremeComponents.ALLOY_IRIDIUM,
        SupremeComponents.ALLOY_PLATINUM,
        SupremeComponents.ALLOY_TITANIUM,
        SupremeComponents.ALLOY_ZIRCONIUM,
        null,
        null,
        null
    };

    public static final SlimefunItemStack INDUCTIVE_MACHINE =
        new SlimefunItemStack(
            "RESOURCE_INDUCTIVE_MACHINE",
            Material.DEAD_FIRE_CORAL_BLOCK,
            "&aInductive Machine",
            "",
            "&c机器零件");
    public static final ItemStack[] RECIPE_INDUCTIVE_MACHINE = {
        SlimefunItems.REDSTONE_ALLOY,
        SupremeComponents.ALLOY_PLATINUM,
        SlimefunItems.REDSTONE_ALLOY,
        SupremeComponents.ALLOY_IRIDIUM,
        SlimefunItems.ELECTRO_MAGNET,
        SupremeComponents.ALLOY_IRIDIUM,
        SlimefunItems.REDSTONE_ALLOY,
        SupremeComponents.ALLOY_PLATINUM,
        SlimefunItems.REDSTONE_ALLOY
    };

    public static final SlimefunItemStack INDUCTOR_MACHINE =
        new SlimefunItemStack(
            "RESOURCE_INDUCTOR_MACHINE",
            Material.FIRE_CORAL_BLOCK,
            "&aInductor Machine",
            "",
            "&cAdvanced 机器零件");
    public static final ItemStack[] RECIPE_INDUCTOR_MACHINE = {
        SlimefunItems.REDSTONE_ALLOY,
        SupremeComponents.PLATINUM_PLATE,
        SlimefunItems.REDSTONE_ALLOY,
        SupremeComponents.IRIDIUM_PLATE,
        SupremeComponents.INDUCTIVE_MACHINE,
        SupremeComponents.IRIDIUM_PLATE,
        SlimefunItems.REDSTONE_ALLOY,
        SupremeComponents.PLATINUM_PLATE,
        SlimefunItems.REDSTONE_ALLOY
    };

    public static final SlimefunItemStack RUSTLESS_MACHINE =
        new SlimefunItemStack(
            "RESOURCE_RUSTLESS_MACHINE",
            Material.DEAD_BRAIN_CORAL_BLOCK,
            "&aRustless Machine",
            "",
            "&c机器零件");
    public static final ItemStack[] RECIPE_RUSTLESS_MACHINE = {
        SlimefunItems.HARDENED_METAL_INGOT,
        SupremeComponents.ALLOY_ZIRCONIUM,
        SlimefunItems.HARDENED_METAL_INGOT,
        SupremeComponents.ALLOY_MANGANESE,
        SlimefunItems.ELECTRO_MAGNET,
        SupremeComponents.ALLOY_MANGANESE,
        SlimefunItems.HARDENED_METAL_INGOT,
        SupremeComponents.ALLOY_ZIRCONIUM,
        SlimefunItems.HARDENED_METAL_INGOT
    };

    public static final SlimefunItemStack STAINLESS_MACHINE =
        new SlimefunItemStack(
            "RESOURCE_STAINLESS_MACHINE",
            Material.BRAIN_CORAL_BLOCK,
            "&aStainless Machine",
            "",
            "&cAdvanced 机器零件");
    public static final ItemStack[] RECIPE_STAINLESS_MACHINE = {
        SlimefunItems.HARDENED_METAL_INGOT,
        SupremeComponents.ZIRCONIUM_PLATE,
        SlimefunItems.HARDENED_METAL_INGOT,
        SupremeComponents.MANGANESE_PLATE,
        SupremeComponents.RUSTLESS_MACHINE,
        SupremeComponents.MANGANESE_PLATE,
        SlimefunItems.HARDENED_METAL_INGOT,
        SupremeComponents.ZIRCONIUM_PLATE,
        SlimefunItems.HARDENED_METAL_INGOT
    };

    public static final SlimefunItemStack CARRIAGE_MACHINE =
        new SlimefunItemStack(
            "RESOURCE_CARRIAGE_MACHINE",
            Material.DEAD_HORN_CORAL_BLOCK,
            "&aCarriage Machine",
            "",
            "&c机器零件");
    public static final ItemStack[] RECIPE_CARRIAGE_MACHINE = {
        SlimefunItems.GILDED_IRON,
        SupremeComponents.ALLOY_AURUM,
        SlimefunItems.GILDED_IRON,
        SupremeComponents.ALLOY_TITANIUM,
        SlimefunItems.ELECTRO_MAGNET,
        SupremeComponents.ALLOY_TITANIUM,
        SlimefunItems.GILDED_IRON,
        SupremeComponents.ALLOY_AURUM,
        SlimefunItems.GILDED_IRON
    };

    public static final SlimefunItemStack CONVEYANCE_MACHINE =
        new SlimefunItemStack(
            "RESOURCE_CONVEYANCE_MACHINE",
            Material.HORN_CORAL_BLOCK,
            "&aConveyance Machine",
            "",
            "&cAdvanced 机器零件");
    public static final ItemStack[] RECIPE_CONVEYANCE_MACHINE = {
        SlimefunItems.GILDED_IRON,
        SupremeComponents.AURUM_PLATE,
        SlimefunItems.GILDED_IRON,
        SupremeComponents.TITANIUM_PLATE,
        SupremeComponents.CARRIAGE_MACHINE,
        SupremeComponents.TITANIUM_PLATE,
        SlimefunItems.GILDED_IRON,
        SupremeComponents.AURUM_PLATE,
        SlimefunItems.GILDED_IRON
    };

    public static final SlimefunItemStack PETRIFIER_MACHINE =
        new SlimefunItemStack(
            "RESOURCE_PETRIFIER_MACHINE",
            Material.DEAD_TUBE_CORAL_BLOCK,
            "&aPetrifier Machine",
            "",
            "&c机器零件");
    public static final ItemStack[] RECIPE_PETRIFIER_MACHINE = {
        SupremeCoreAlloy.RESOURCE_CORE_COAL,
        SupremeComponents.RUSTLESS_MACHINE,
        SupremeCoreAlloy.RESOURCE_CORE_COAL,
        SupremeComponents.ALLOY_ADAMANTIUM,
        SupremeComponents.CARRIAGE_MACHINE,
        SupremeComponents.ALLOY_ADAMANTIUM,
        SupremeCoreBlock.RESOURCE_CORE_STONE,
        SupremeComponents.INDUCTIVE_MACHINE,
        SupremeCoreBlock.RESOURCE_CORE_STONE
    };

    public static final SlimefunItemStack CRYSTALLIZER_MACHINE =
        new SlimefunItemStack(
            "RESOURCE_CRYSTALLIZER_MACHINE",
            Material.TUBE_CORAL_BLOCK,
            "&aCrystallizer Machine",
            "",
            "&cAdvanced 机器零件");
    public static final ItemStack[] RECIPE_CRYSTALLIZER_MACHINE = {
        SupremeCoreAlloy.RESOURCE_CORE_DIAMOND, new ItemStack(STAINLESS_MACHINE),
        SupremeCoreAlloy.RESOURCE_CORE_DIAMOND,
        SupremeComponents.SYNTHETIC_RUBY, SupremeComponents.PETRIFIER_MACHINE,
        SupremeComponents.SYNTHETIC_RUBY,
        SupremeCoreAlloy.RESOURCE_CORE_EMERALD, SupremeComponents.INDUCTOR_MACHINE,
        SupremeCoreAlloy.RESOURCE_CORE_EMERALD
    };

    public static final SlimefunItemStack BLEND_MACHINE =
        new SlimefunItemStack(
            "RESOURCE_BLEND_MACHINE",
            Material.BUBBLE_CORAL_BLOCK,
            "&aBlend Machine",
            "",
            "&cAdvanced 机器零件");
    public static final ItemStack[] RECIPE_BLEND_MACHINE = {
        SupremeComponents.INDUCTOR_MACHINE,
        SupremeCoreAlloy.RESOURCE_CORE_DIAMOND,
        SupremeComponents.INDUCTOR_MACHINE,
        SupremeComponents.CRYSTALLIZER_MACHINE,
        SupremeCoreAlloy.RESOURCE_CORE_EMERALD,
        SupremeComponents.CRYSTALLIZER_MACHINE,
        SupremeComponents.CONVEYANCE_MACHINE,
        SupremeCoreAlloy.RESOURCE_CORE_NETHERITE,
        SupremeComponents.CONVEYANCE_MACHINE
    };

    public static final SlimefunItemStack SYNTHETIC_AMETHYST =
        new SlimefunItemStack(
            "RESOURCE_SYNTHETIC_AMETHYST", Material.PURPLE_DYE, "&4Synthetic Amethyst", "");
    public static final ItemStack[] RECIPE_SYNTHETIC_AMETHYST = {
        SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.MAGIC_LUMP_3, SlimefunItems.SYNTHETIC_SAPPHIRE,
        SlimefunItems.MAGIC_LUMP_3, new ItemStack(Material.AMETHYST_SHARD), SlimefunItems.MAGIC_LUMP_3,
        SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.MAGIC_LUMP_3, SlimefunItems.SYNTHETIC_SAPPHIRE
    };

    public static final SlimefunItemStack SYNTHETIC_RUBY =
        new SlimefunItemStack("RESOURCE_SYNTHETIC_RUBY", Material.PINK_DYE, "&4Synthetic Ruby", "");
    public static final ItemStack[] RECIPE_SYNTHETIC_RUBY = {
        SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_DIAMOND,
        SlimefunItems.SYNTHETIC_EMERALD,
        SlimefunItems.SYNTHETIC_DIAMOND, SupremeComponents.SYNTHETIC_AMETHYST,
        SlimefunItems.SYNTHETIC_DIAMOND,
        SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_DIAMOND,
        SlimefunItems.SYNTHETIC_EMERALD
    };
}
