package com.github.relativobr.supremeexpansion.gear;

import com.github.relativobr.supremeexpansion.core.SupremeCoreDeath;
import com.github.relativobr.supremeexpansion.core.SupremeCoreNature;
import com.github.relativobr.supremeexpansion.magical.SupremeCetrus;
import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class WeaponsThornium {

    public static final SlimefunItemStack THORNIUM_BOW =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_BOW",
            Material.BOW,
            "&f&l钍石弓",
            "&f&l由钍制成的弓");
    public static final ItemStack[] RECIPE_THORNIUM_BOW = {
        null,
        SupremeComponents.THORNIUM_INGOT,
        SupremeCoreDeath.RESOURCE_CORE_STRING,
        SupremeCetrus.CETRUS_LUMIUM,
        null,
        SupremeCoreDeath.RESOURCE_CORE_STRING,
        null,
        SupremeComponents.THORNIUM_INGOT,
        SupremeCoreDeath.RESOURCE_CORE_STRING
    };

    public static final SlimefunItemStack THORNIUM_BOW_MAGIC =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_BOW_MAGIC",
            Material.BOW,
            "&a&l魔法弓",
            "&f&l一把蕴含魔法的弓");

    public static final SlimefunItemStack THORNIUM_BOW_RARE =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_BOW_RARE",
            Material.BOW,
            "&b&l稀有弓",
            "&f&l一把珍奇的弓");

    public static final SlimefunItemStack THORNIUM_BOW_EPIC =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_BOW_EPIC",
            Material.BOW,
            "&d&l史诗弓",
            "&f&l一把精良的弓");

    public static final SlimefunItemStack THORNIUM_BOW_LEGENDARY =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_BOW_LEGENDARY",
            Material.BOW,
            "&6&l传说弓",
            "&f&l它曾在历史书上出现过");

    public static final SlimefunItemStack THORNIUM_BOW_SUPREME =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_BOW_SUPREME",
            Material.BOW,
            "&4&l至尊弓",
            "&f&l至尊的终极之弓");

    public static final SlimefunItemStack THORNIUM_SHIELD =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_SHIELD",
            Material.SHIELD,
            "&f&l钍石盾",
            "&f&l由钍制成的盾");
    public static final ItemStack[] RECIPE_THORNIUM_SHIELD = {
        SupremeCoreNature.RESOURCE_CORE_OAK_LOG,
        SupremeComponents.THORNIUM_INGOT,
        SupremeCoreNature.RESOURCE_CORE_OAK_LOG,
        SupremeCoreNature.RESOURCE_CORE_OAK_LOG,
        SupremeCetrus.CETRUS_LUX,
        SupremeCoreNature.RESOURCE_CORE_OAK_LOG,
        null,
        SupremeCoreNature.RESOURCE_CORE_OAK_LOG,
        null
    };

    public static final SlimefunItemStack THORNIUM_SHIELD_MAGIC =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_SHIELD_MAGIC",
            Material.SHIELD,
            "&a&l魔法盾",
            "&f&l一个蕴含魔法的盾牌");

    public static final SlimefunItemStack THORNIUM_SHIELD_RARE =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_SHIELD_RARE",
            Material.SHIELD,
            "&b&l稀有盾",
            "&f&l一个珍奇的盾牌");

    public static final SlimefunItemStack THORNIUM_SHIELD_EPIC =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_SHIELD_EPIC",
            Material.SHIELD,
            "&d&l史诗盾",
            "&f&l一个精良的盾牌");

    public static final SlimefunItemStack THORNIUM_SHIELD_LEGENDARY =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_SHIELD_LEGENDARY",
            Material.SHIELD,
            "&6&l传说盾",
            "&f&l它曾在历史书上出现过");

    public static final SlimefunItemStack THORNIUM_SHIELD_SUPREME =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_SHIELD_SUPREME",
            Material.SHIELD,
            "&4&l至尊盾",
            "&f&l至尊的终极之盾");

    public static final SlimefunItemStack THORNIUM_SWORD =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_SWORD",
            Material.NETHERITE_SWORD,
            "&f&l钍石剑",
            "&f&l由钍制成的剑");
    public static final ItemStack[] RECIPE_THORNIUM_SWORD = {
        null, SupremeComponents.THORNIUM_INGOT, null,
        null, SupremeComponents.THORNIUM_INGOT, null,
        null, SupremeCetrus.CETRUS_LUMIUM, null
    };

    public static final SlimefunItemStack THORNIUM_SWORD_MAGIC =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_SWORD_MAGIC",
            Material.NETHERITE_SWORD,
            "&a&l魔法剑",
            "&f&l一把蕴含魔法的剑");

    public static final SlimefunItemStack THORNIUM_SWORD_RARE =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_SWORD_RARE",
            Material.NETHERITE_SWORD,
            "&b&l稀有剑",
            "&f&l一把珍奇的剑");

    public static final SlimefunItemStack THORNIUM_SWORD_EPIC =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_SWORD_EPIC",
            Material.NETHERITE_SWORD,
            "&d&l史诗剑",
            "&f&l一把精良的剑");

    public static final SlimefunItemStack THORNIUM_SWORD_LEGENDARY =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_SWORD_LEGENDARY",
            Material.NETHERITE_SWORD,
            "&6&l传说剑",
            "&f&l它曾在历史书上出现过");

    public static final SlimefunItemStack THORNIUM_SWORD_SUPREME =
        new SlimefunItemStack(
            "WEAPONS_THORNIUM_SWORD_SUPREME",
            Material.NETHERITE_SWORD,
            "&4&l至尊剑",
            "&f&l至尊的终极之剑");
}
