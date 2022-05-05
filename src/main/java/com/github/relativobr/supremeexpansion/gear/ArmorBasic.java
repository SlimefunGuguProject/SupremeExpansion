package com.github.relativobr.supremeexpansion.gear;

import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class ArmorBasic {

    public static final SlimefunItemStack ADAMANTIUM_HELMET =
        new SlimefunItemStack(
            "ARMOR_ADAMANTIUM_HELMET",
            Material.DIAMOND_HELMET,
            "&f&l精金头盔",
            "&f&l由精金制成");
    public static final ItemStack[] RECIPE_ADAMANTIUM_HELMET = {
        SupremeComponents.ADAMANTIUM_PLATE,
        SupremeComponents.ADAMANTIUM_PLATE,
        SupremeComponents.ADAMANTIUM_PLATE,
        SupremeComponents.ADAMANTIUM_PLATE,
        null,
        SupremeComponents.ADAMANTIUM_PLATE,
        null,
        null,
        null
    };

    public static final SlimefunItemStack AURUM_HELMET =
        new SlimefunItemStack(
            "ARMOR_AURUM_HELMET",
            Material.DIAMOND_HELMET,
            "&f&lAurum Helmet",
            "&f&lA Helmet of Aurum");
    public static final ItemStack[] RECIPE_AURUM_HELMET = {
        SupremeComponents.AURUM_PLATE,
        SupremeComponents.AURUM_PLATE,
        SupremeComponents.AURUM_PLATE,
        SupremeComponents.AURUM_PLATE,
        null,
        SupremeComponents.AURUM_PLATE,
        null,
        null,
        null
    };

    public static final SlimefunItemStack TITANIUM_HELMET =
        new SlimefunItemStack(
            "ARMOR_TITANIUM_HELMET",
            Material.DIAMOND_HELMET,
            "&f&lTitanium Helmet",
            "&f&lA Helmet of Titanium");
    public static final ItemStack[] RECIPE_TITANIUM_HELMET = {
        SupremeComponents.TITANIUM_PLATE,
        SupremeComponents.TITANIUM_PLATE,
        SupremeComponents.TITANIUM_PLATE,
        SupremeComponents.TITANIUM_PLATE,
        null,
        SupremeComponents.TITANIUM_PLATE,
        null,
        null,
        null
    };

    public static final SlimefunItemStack ADAMANTIUM_CHESTPLATE =
        new SlimefunItemStack(
            "ARMOR_ADAMANTIUM_CHESTPLATE",
            Material.DIAMOND_CHESTPLATE,
            "&f&lAdamantium Chestplate",
            "&f&lA Chestplate of Adamantium");
    public static final ItemStack[] RECIPE_ADAMANTIUM_CHESTPLATE = {
        SupremeComponents.ADAMANTIUM_PLATE, null, SupremeComponents.ADAMANTIUM_PLATE,
        SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.ADAMANTIUM_PLATE,
        SupremeComponents.ADAMANTIUM_PLATE,
        SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.ADAMANTIUM_PLATE,
        SupremeComponents.ADAMANTIUM_PLATE
    };

    public static final SlimefunItemStack AURUM_CHESTPLATE =
        new SlimefunItemStack(
            "ARMOR_AURUM_CHESTPLATE",
            Material.DIAMOND_CHESTPLATE,
            "&f&lAurum Chestplate",
            "&f&lA Chestplate of Aurum");
    public static final ItemStack[] RECIPE_AURUM_CHESTPLATE = {
        SupremeComponents.AURUM_PLATE, null, SupremeComponents.AURUM_PLATE,
        SupremeComponents.AURUM_PLATE, SupremeComponents.AURUM_PLATE, SupremeComponents.AURUM_PLATE,
        SupremeComponents.AURUM_PLATE, SupremeComponents.AURUM_PLATE, SupremeComponents.AURUM_PLATE
    };

    public static final SlimefunItemStack TITANIUM_CHESTPLATE =
        new SlimefunItemStack(
            "ARMOR_TITANIUM_CHESTPLATE",
            Material.DIAMOND_CHESTPLATE,
            "&f&lTitanium Chestplate",
            "&f&lA Chestplate of Titanium");
    public static final ItemStack[] RECIPE_TITANIUM_CHESTPLATE = {
        SupremeComponents.TITANIUM_PLATE, null, SupremeComponents.TITANIUM_PLATE,
        SupremeComponents.TITANIUM_PLATE, SupremeComponents.TITANIUM_PLATE,
        SupremeComponents.TITANIUM_PLATE,
        SupremeComponents.TITANIUM_PLATE, SupremeComponents.TITANIUM_PLATE,
        SupremeComponents.TITANIUM_PLATE
    };

    public static final SlimefunItemStack ADAMANTIUM_LEGGINGS =
        new SlimefunItemStack(
            "ARMOR_ADAMANTIUM_LEGGINGS",
            Material.DIAMOND_LEGGINGS,
            "&f&lAdamantium Legging",
            "&f&lA Legging of Adamantium");
    public static final ItemStack[] RECIPE_ADAMANTIUM_LEGGINGS = {
        SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.ADAMANTIUM_PLATE,
        SupremeComponents.ADAMANTIUM_PLATE,
        SupremeComponents.ADAMANTIUM_PLATE, null, SupremeComponents.ADAMANTIUM_PLATE,
        SupremeComponents.ADAMANTIUM_PLATE, null, SupremeComponents.ADAMANTIUM_PLATE
    };

    public static final SlimefunItemStack AURUM_LEGGINGS =
        new SlimefunItemStack(
            "ARMOR_AURUM_LEGGINGS",
            Material.DIAMOND_LEGGINGS,
            "&f&lAurum Legging",
            "&f&lA Legging of Aurum");
    public static final ItemStack[] RECIPE_AURUM_LEGGINGS = {
        SupremeComponents.AURUM_PLATE, SupremeComponents.AURUM_PLATE, SupremeComponents.AURUM_PLATE,
        SupremeComponents.AURUM_PLATE, null, SupremeComponents.AURUM_PLATE,
        SupremeComponents.AURUM_PLATE, null, SupremeComponents.AURUM_PLATE
    };

    public static final SlimefunItemStack TITANIUM_LEGGINGS =
        new SlimefunItemStack(
            "ARMOR_TITANIUM_LEGGINGS",
            Material.DIAMOND_LEGGINGS,
            "&f&lTitanium Legging",
            "&f&lA Legging of Titanium");
    public static final ItemStack[] RECIPE_TITANIUM_LEGGINGS = {
        SupremeComponents.TITANIUM_PLATE, SupremeComponents.TITANIUM_PLATE,
        SupremeComponents.TITANIUM_PLATE,
        SupremeComponents.TITANIUM_PLATE, null, SupremeComponents.TITANIUM_PLATE,
        SupremeComponents.TITANIUM_PLATE, null, SupremeComponents.TITANIUM_PLATE
    };

    public static final SlimefunItemStack ADAMANTIUM_BOOTS =
        new SlimefunItemStack(
            "ARMOR_ADAMANTIUM_BOOTS",
            Material.DIAMOND_BOOTS,
            "&f&lAdamantium Boots",
            "&f&lA Boots of Adamantium");
    public static final ItemStack[] RECIPE_ADAMANTIUM_BOOTS = {
        null,
        null,
        null,
        SupremeComponents.ADAMANTIUM_PLATE,
        null,
        SupremeComponents.ADAMANTIUM_PLATE,
        SupremeComponents.ADAMANTIUM_PLATE,
        null,
        SupremeComponents.ADAMANTIUM_PLATE
    };

    public static final SlimefunItemStack AURUM_BOOTS =
        new SlimefunItemStack(
            "ARMOR_AURUM_BOOTS", Material.DIAMOND_BOOTS, "&f&lAurum Boots", "&f&lA Boots of Aurum");
    public static final ItemStack[] RECIPE_AURUM_BOOTS = {
        null,
        null,
        null,
        SupremeComponents.AURUM_PLATE,
        null,
        SupremeComponents.AURUM_PLATE,
        SupremeComponents.AURUM_PLATE,
        null,
        SupremeComponents.AURUM_PLATE
    };

    public static final SlimefunItemStack TITANIUM_BOOTS =
        new SlimefunItemStack(
            "ARMOR_TITANIUM_BOOTS",
            Material.DIAMOND_BOOTS,
            "&f&lTitanium Boots",
            "&f&lA Boots of Titanium");
    public static final ItemStack[] RECIPE_TITANIUM_BOOTS = {
        null,
        null,
        null,
        SupremeComponents.TITANIUM_PLATE,
        null,
        SupremeComponents.TITANIUM_PLATE,
        SupremeComponents.TITANIUM_PLATE,
        null,
        SupremeComponents.TITANIUM_PLATE
    };
}
