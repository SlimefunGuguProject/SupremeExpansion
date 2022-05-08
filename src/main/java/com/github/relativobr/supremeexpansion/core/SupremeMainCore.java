package com.github.relativobr.supremeexpansion.core;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeMainCore {

    public static final SlimefunItemStack CORE_OF_LIFE =
        new SlimefunItemStack(
            "CORE_OF_LIFE",
            "faff2eb498e5c6a04484f0c9f785b448479ab213df95ec91176a308a12add70",
            "&a生命核心",
            "",
            "&7核心中包含从世界各地",
            "&7收集到的生命碎片.");
    public static final ItemStack[] RECIPE_CORE_OF_LIFE = {
        new SlimefunItemStack(SupremeCoreLife.RESOURCE_CORE_POTATO, 64),
        new SlimefunItemStack(SupremeCoreLife.RESOURCE_CORE_CARROT, 64),
        new SlimefunItemStack(SupremeCoreLife.RESOURCE_CORE_BEETROOT, 64),
        new SlimefunItemStack(SupremeCoreLife.RESOURCE_CORE_WHEAT, 64),
        new SlimefunItemStack(SupremeCoreLife.RESOURCE_CORE_SUGAR_CANE, 64),
        new SlimefunItemStack(SupremeCoreLife.RESOURCE_CORE_SWEET_BERRIES, 64),
        new SlimefunItemStack(SupremeCoreLife.RESOURCE_CORE_MELON, 64),
        new SlimefunItemStack(SupremeCoreLife.RESOURCE_CORE_PUMPKIN, 64),
        new SlimefunItemStack(SupremeCoreLife.RESOURCE_CORE_APPLE, 64),
    };

    public static final SlimefunItemStack CORE_OF_DEATH =
        new SlimefunItemStack(
            "CORE_OF_DEATH",
            "9e95293acbcd4f55faf5947bfc5135038b275a7ab81087341b9ec6e453e839",
            "&a死亡核心",
            "",
            "&7核心中包含各种",
            "&7已经超生实体的灵魂");
    public static final ItemStack[] RECIPE_CORE_OF_DEATH = {
        new SlimefunItemStack(SupremeCoreDeath.RESOURCE_CORE_PORKCHOP, 64),
        new SlimefunItemStack(SupremeCoreDeath.RESOURCE_CORE_BEEF, 64),
        new SlimefunItemStack(SupremeCoreDeath.RESOURCE_CORE_MUTTON, 64),
        new SlimefunItemStack(SupremeCoreDeath.RESOURCE_CORE_CHICKEN, 64),
        new SlimefunItemStack(SupremeCoreDeath.RESOURCE_CORE_SALMON, 64),
        new SlimefunItemStack(SupremeCoreDeath.RESOURCE_CORE_COD, 64),
        new SlimefunItemStack(SupremeCoreDeath.RESOURCE_CORE_STRING, 64),
        new SlimefunItemStack(SupremeCoreDeath.RESOURCE_CORE_SPIDER_EYE, 64),
        new SlimefunItemStack(SupremeCoreDeath.RESOURCE_CORE_TEAR, 64)
    };

    public static final SlimefunItemStack CORE_OF_COLOR =
        new SlimefunItemStack(
            "CORE_OF_COLOR",
            "163bcaf6d2679d8d7d9bf6a474a48a77a8e91747a1084c09256ebc86cb74811",
            "&a霓虹核心",
            "",
            "&7核心中包含万物的颜色",
            "&7青出于蓝而胜于蓝.");
    public static final ItemStack[] RECIPE_CORE_OF_COLOR = {
        new SlimefunItemStack(SupremeCoreColor.RESOURCE_CORE_RED, 64),
        new SlimefunItemStack(SupremeCoreColor.RESOURCE_CORE_YELLOW, 64),
        new SlimefunItemStack(SupremeCoreColor.RESOURCE_CORE_PURPLE, 64),
        new SlimefunItemStack(SupremeCoreColor.RESOURCE_CORE_BLUE, 64),
        new SlimefunItemStack(SupremeCoreColor.RESOURCE_CORE_BLACK, 64),
        new SlimefunItemStack(SupremeCoreColor.RESOURCE_CORE_GREEN, 64),
        new SlimefunItemStack(SupremeCoreColor.RESOURCE_CORE_PINK, 64),
        new SlimefunItemStack(SupremeCoreColor.RESOURCE_CORE_GRAY, 64),
        new SlimefunItemStack(SupremeCoreColor.RESOURCE_CORE_CYAN, 64)
    };

    public static final SlimefunItemStack CORE_OF_BLOCK =
        new SlimefunItemStack(
            "CORE_OF_BLOCK",
            "14d844fee24d5f27ddb669438528d83b684d901b75a6889fe7488dfc4cf7a1c",
            "&a方块核心",
            "",
            "&7核心中包含从世界各地",
            "&7收集到的方块.");
    public static final ItemStack[] RECIPE_CORE_OF_BLOCK = {
        new SlimefunItemStack(SupremeCoreBlock.RESOURCE_CORE_STONE, 64),
        new SlimefunItemStack(SupremeCoreBlock.RESOURCE_CORE_GRANITE, 64),
        new SlimefunItemStack(SupremeCoreBlock.RESOURCE_CORE_DIORITE, 64),
        new SlimefunItemStack(SupremeCoreBlock.RESOURCE_CORE_ANDESITE, 64),
        new SlimefunItemStack(SupremeCoreBlock.RESOURCE_CORE_GRAVEL, 64),
        new SlimefunItemStack(SupremeCoreBlock.RESOURCE_CORE_SAND, 64),
        new SlimefunItemStack(SupremeCoreBlock.RESOURCE_CORE_ENDSTONE, 64),
        new SlimefunItemStack(SupremeCoreBlock.RESOURCE_CORE_CLAY, 64),
        new SlimefunItemStack(SupremeCoreBlock.RESOURCE_CORE_SNOW, 64)
    };

    public static final SlimefunItemStack CORE_OF_NATURE =
        new SlimefunItemStack(
            "CORE_OF_NATURE",
            "32fa8f38c7b22096619c3a6d6498b405530e48d5d4f91e2aacea578844d5c67",
            "&a自然核心",
            "",
            "&7核心中包含大自然的力量.");
    public static final ItemStack[] RECIPE_CORE_OF_NATURE = {
        new SlimefunItemStack(SupremeCoreNature.RESOURCE_CORE_OAK_LOG, 64),
        new SlimefunItemStack(SupremeCoreNature.RESOURCE_CORE_SPRUCE_LOG, 64),
        new SlimefunItemStack(SupremeCoreNature.RESOURCE_CORE_BIRCH_LOG, 64),
        new SlimefunItemStack(SupremeCoreNature.RESOURCE_CORE_JUNGLE_LOG, 64),
        new SlimefunItemStack(SupremeCoreNature.RESOURCE_CORE_WITHER_ROSE, 64),
        new SlimefunItemStack(SupremeCoreNature.RESOURCE_CORE_ACACIA_LOG, 64),
        new SlimefunItemStack(SupremeCoreNature.RESOURCE_CORE_DARK_OAK_LOG, 64),
        new SlimefunItemStack(SupremeCoreNature.RESOURCE_CORE_CRIMSON_STEM, 64),
        new SlimefunItemStack(SupremeCoreNature.RESOURCE_CORE_WARPED_STEM, 64)
    };

    public static final SlimefunItemStack CORE_OF_ALLOY =
        new SlimefunItemStack(
            "CORE_OF_ALLOY",
            "cbfb41f866e7e8e593659986c9d6e88cd37677b3f7bd44253e5871e66d1d424",
            "&a矿石核心",
            "",
            "&7核心中包含了各种矿石",
            "&7它们是玩家工业化的基础.");
    public static final ItemStack[] RECIPE_CORE_OF_ALLOY = {
        new SlimefunItemStack(SupremeCoreAlloy.RESOURCE_CORE_COAL, 64),
        new SlimefunItemStack(SupremeCoreAlloy.RESOURCE_CORE_IRON, 64),
        new SlimefunItemStack(SupremeCoreAlloy.RESOURCE_CORE_GOLD, 64),
        new SlimefunItemStack(SupremeCoreAlloy.RESOURCE_CORE_LAPIS, 64),
        new SlimefunItemStack(SupremeCoreAlloy.RESOURCE_CORE_REDSTONE, 64),
        new SlimefunItemStack(SupremeCoreAlloy.RESOURCE_CORE_QUARTZ, 64),
        new SlimefunItemStack(SupremeCoreAlloy.RESOURCE_CORE_DIAMOND, 64),
        new SlimefunItemStack(SupremeCoreAlloy.RESOURCE_CORE_EMERALD, 64),
        new SlimefunItemStack(SupremeCoreAlloy.RESOURCE_CORE_NETHERITE, 64)
    };
}
