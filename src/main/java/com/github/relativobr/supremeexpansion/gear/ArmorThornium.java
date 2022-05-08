package com.github.relativobr.supremeexpansion.gear;

import com.github.relativobr.supremeexpansion.magical.SupremeCetrus;
import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class ArmorThornium {

    public static final SlimefunItemStack THORNIUM_BOOTS =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_BOOTS",
            Material.NETHERITE_BOOTS,
            "&f&l钍石靴",
            "&f&l由钍制成的靴子");
    public static final ItemStack[] RECIPE_THORNIUM_BOOTS = {
        null, null, null,
        SupremeCetrus.CETRUS_IGNIS, null, SupremeCetrus.CETRUS_IGNIS,
        SupremeComponents.THORNIUM_INGOT, null, SupremeComponents.THORNIUM_INGOT
    };

    public static final SlimefunItemStack THORNIUM_BOOTS_MAGIC =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_BOOTS_MAGIC",
            Material.NETHERITE_BOOTS,
            "&a&l魔法靴",
            "&f&l一双蕴含魔法的靴子");

    public static final SlimefunItemStack THORNIUM_BOOTS_RARE =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_BOOTS_RARE",
            Material.NETHERITE_BOOTS,
            "&b&l稀有靴",
            "&f&l一双珍奇的靴子");

    public static final SlimefunItemStack THORNIUM_BOOTS_EPIC =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_BOOTS_EPIC",
            Material.NETHERITE_BOOTS,
            "&d&l史诗斧",
            "&f&l一双精良的靴子");

    public static final SlimefunItemStack THORNIUM_BOOTS_LEGENDARY =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_BOOTS_LEGENDARY",
            Material.NETHERITE_BOOTS,
            "&6&l传说斧",
            "&f&l它曾在历史书上出现过");

    public static final SlimefunItemStack THORNIUM_BOOTS_SUPREME =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_BOOTS_SUPREME",
            Material.NETHERITE_BOOTS,
            "&4&l至尊斧",
            "&f&l至尊的终极之靴");

    public static final SlimefunItemStack THORNIUM_CHESTPLATE =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_CHESTPLATE",
            Material.NETHERITE_CHESTPLATE,
            "&f&l钍石胸甲",
            "&f&l由钍制成的胸甲");
    public static final ItemStack[] RECIPE_THORNIUM_CHESTPLATE = {
        SupremeComponents.THORNIUM_INGOT, null, SupremeComponents.THORNIUM_INGOT,
        SupremeComponents.THORNIUM_INGOT, SupremeCetrus.CETRUS_LUMIUM, SupremeComponents.THORNIUM_INGOT,
        SupremeComponents.THORNIUM_INGOT, SupremeComponents.THORNIUM_INGOT, SupremeComponents.THORNIUM_INGOT
    };

    public static final SlimefunItemStack THORNIUM_CHESTPLATE_MAGIC =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_CHESTPLATE_MAGIC",
            Material.NETHERITE_CHESTPLATE,
            "&a&l魔法胸甲",
            "&f&l一件蕴含魔法的胸甲");

    public static final SlimefunItemStack THORNIUM_CHESTPLATE_RARE =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_CHESTPLATE_RARE",
            Material.NETHERITE_CHESTPLATE,
            "&b&l稀有胸甲",
            "&f&l一件珍奇的胸甲");

    public static final SlimefunItemStack THORNIUM_CHESTPLATE_EPIC =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_CHESTPLATE_EPIC",
            Material.NETHERITE_CHESTPLATE,
            "&d&l史诗胸甲",
            "&f&l一件精良的胸甲");

    public static final SlimefunItemStack THORNIUM_CHESTPLATE_LEGENDARY =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_CHESTPLATE_LEGENDARY",
            Material.NETHERITE_CHESTPLATE,
            "&6&l传说胸甲",
            "&f&l它曾在历史书上出现过");

    public static final SlimefunItemStack THORNIUM_CHESTPLATE_SUPREME =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_CHESTPLATE_SUPREME",
            Material.NETHERITE_CHESTPLATE,
            "&4&l至尊胸甲",
            "&f&l至尊的终极胸甲");

    public static final SlimefunItemStack THORNIUM_HELMET =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_HELMET",
            Material.NETHERITE_HELMET,
            "&f&l钍石头盔",
            "&f&l由钍制成的头盔");
    public static final ItemStack[] RECIPE_THORNIUM_HELMET = {
        SupremeComponents.THORNIUM_INGOT, SupremeCetrus.CETRUS_AQUA, SupremeComponents.THORNIUM_INGOT,
        SupremeComponents.THORNIUM_INGOT, null, SupremeComponents.THORNIUM_INGOT,
        null, null, null
    };

    public static final SlimefunItemStack THORNIUM_HELMET_MAGIC =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_HELMET_MAGIC",
            Material.NETHERITE_HELMET,
            "&a&l魔法头盔",
            "&f&l一件蕴含魔法的头盔");

    public static final SlimefunItemStack THORNIUM_HELMET_RARE =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_HELMET_RARE",
            Material.NETHERITE_HELMET,
            "&b&l稀有头盔",
            "&f&l一件珍奇的头盔");

    public static final SlimefunItemStack THORNIUM_HELMET_EPIC =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_HELMET_EPIC",
            Material.NETHERITE_HELMET,
            "&d&l史诗头盔",
            "&f&l一件精良的头盔");

    public static final SlimefunItemStack THORNIUM_HELMET_LEGENDARY =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_HELMET_LEGENDARY",
            Material.NETHERITE_HELMET,
            "&6&l传说头盔",
            "&f&l它曾在历史书上出现过");

    public static final SlimefunItemStack THORNIUM_HELMET_SUPREME =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_HELMET_SUPREME",
            Material.NETHERITE_HELMET,
            "&4&l至尊头盔",
            "&f&l至尊的终极头盔");

    public static final SlimefunItemStack THORNIUM_LEGGINGS =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_LEGGINGS",
            Material.NETHERITE_LEGGINGS,
            "&f&l钍石护腿",
            "&f&l由钍制成的护腿");
    public static final ItemStack[] RECIPE_THORNIUM_LEGGINGS = {
        SupremeCetrus.CETRUS_VENTUS, SupremeComponents.THORNIUM_INGOT, SupremeCetrus.CETRUS_VENTUS,
        SupremeComponents.THORNIUM_INGOT, null, SupremeComponents.THORNIUM_INGOT,
        SupremeComponents.THORNIUM_INGOT, null, SupremeComponents.THORNIUM_INGOT
    };

    public static final SlimefunItemStack THORNIUM_LEGGINGS_MAGIC =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_LEGGINGS_MAGIC",
            Material.NETHERITE_LEGGINGS,
            "&a&l魔法护腿",
            "&f&l一件蕴含魔法的护腿");

    public static final SlimefunItemStack THORNIUM_LEGGINGS_RARE =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_LEGGINGS_RARE",
            Material.NETHERITE_LEGGINGS,
            "&b&l稀有护腿",
            "&f&l一件珍奇的护腿");

    public static final SlimefunItemStack THORNIUM_LEGGINGS_EPIC =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_LEGGINGS_EPIC",
            Material.NETHERITE_LEGGINGS,
            "&d&l史诗护腿",
            "&f&l一件精良的护腿");

    public static final SlimefunItemStack THORNIUM_LEGGINGS_LEGENDARY =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_LEGGINGS_LEGENDARY",
            Material.NETHERITE_LEGGINGS,
            "&6&l传说护腿",
            "&f&l它曾在历史书上出现过");

    public static final SlimefunItemStack THORNIUM_LEGGINGS_SUPREME =
        new SlimefunItemStack(
            "ARMOR_THORNIUM_LEGGINGS_SUPREME",
            Material.NETHERITE_LEGGINGS,
            "&4&l至尊护腿",
            "&f&l至尊的终极护腿");
}
