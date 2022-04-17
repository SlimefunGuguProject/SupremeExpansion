package br.com.ohanacraft.supremeexpansion.core;

import br.com.ohanacraft.supremeexpansion.resource.*;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class SupremeCore {

    public static final SlimefunItemStack CORE_OF_LIFE = new SlimefunItemStack("CORE_OF_LIFE",
            Material.PAPER, "&aCore of Life", "", "&7This core contains fragments of life","&7that have been collected by the world.");
    public static final ItemStack[] RECIPE_CORE_OF_LIFE ={
            new SlimefunItemStack(CoreLife.RESOURCE_CORE_POTATO, 64), new SlimefunItemStack(CoreLife.RESOURCE_CORE_CARROT, 64), new SlimefunItemStack(CoreLife.RESOURCE_CORE_BEETROOT, 64),
            new SlimefunItemStack(CoreLife.RESOURCE_CORE_WHEAT, 64), new SlimefunItemStack(CoreLife.RESOURCE_CORE_SUGAR_CANE, 64), new SlimefunItemStack(CoreLife.RESOURCE_CORE_SWEET_BERRIES, 64),
            new SlimefunItemStack(CoreLife.RESOURCE_CORE_MELON, 64), new SlimefunItemStack(CoreLife.RESOURCE_CORE_PUMPKIN, 64), new SlimefunItemStack(CoreLife.RESOURCE_CORE_APPLE, 64),
    };

    public static final SlimefunItemStack CORE_OF_DEATH = new SlimefunItemStack("CORE_OF_DEATH",
            Material.PAPER, "&aCore of Death", "", "&7This core contains the souls of ", "&7various entities that have gone beyond.");
    public static final ItemStack[] RECIPE_CORE_OF_DEATH ={
            new SlimefunItemStack(CoreDeath.RESOURCE_CORE_PORKCHOP, 64), new SlimefunItemStack(CoreDeath.RESOURCE_CORE_BEEF, 64), new SlimefunItemStack(CoreDeath.RESOURCE_CORE_MUTTON, 64),
            new SlimefunItemStack(CoreDeath.RESOURCE_CORE_CHICKEN, 64), new SlimefunItemStack(CoreDeath.RESOURCE_CORE_SALMON, 64), new SlimefunItemStack(CoreDeath.RESOURCE_CORE_COD, 64),
            new SlimefunItemStack(CoreDeath.RESOURCE_CORE_STRING, 64), new SlimefunItemStack(CoreDeath.RESOURCE_CORE_SPIDER_EYE, 64), new SlimefunItemStack(CoreDeath.RESOURCE_CORE_TEAR, 64)
    };

    public static final SlimefunItemStack CORE_OF_COLOR = new SlimefunItemStack("CORE_OF_COLOR",
            Material.PAPER, "&aCore of Color", "", "&7This core contains several colors","&7that have been collected around the world.");
    public static final ItemStack[] RECIPE_CORE_OF_COLOR ={
            new SlimefunItemStack(CoreColor.RESOURCE_CORE_RED, 64), new SlimefunItemStack(CoreColor.RESOURCE_CORE_YELLOW, 64), new SlimefunItemStack(CoreColor.RESOURCE_CORE_PURPLE, 64),
            new SlimefunItemStack(CoreColor.RESOURCE_CORE_BLUE, 64), new SlimefunItemStack(CoreColor.RESOURCE_CORE_BLACK, 64), new SlimefunItemStack(CoreColor.RESOURCE_CORE_GREEN, 64),
            new SlimefunItemStack(CoreColor.RESOURCE_CORE_PINK, 64), new SlimefunItemStack(CoreColor.RESOURCE_CORE_GRAY, 64), new SlimefunItemStack(CoreColor.RESOURCE_CORE_CYAN, 64)
    };

    public static final SlimefunItemStack CORE_OF_BLOCK = new SlimefunItemStack("CORE_OF_BLOCK",
            Material.PAPER, "&aCore of Block", "", "&7This core contains several blocks","&7that have been collected around the world.");
    public static final ItemStack[] RECIPE_CORE_OF_BLOCK ={
            new SlimefunItemStack(CoreBlock.RESOURCE_CORE_STONE, 64), new SlimefunItemStack(CoreBlock.RESOURCE_CORE_GRANITE, 64), new SlimefunItemStack(CoreBlock.RESOURCE_CORE_DIORITE, 64),
            new SlimefunItemStack(CoreBlock.RESOURCE_CORE_ANDESITE, 64), new SlimefunItemStack(CoreBlock.RESOURCE_CORE_GRAVEL, 64), new SlimefunItemStack(CoreBlock.RESOURCE_CORE_SAND, 64),
            new SlimefunItemStack(CoreBlock.RESOURCE_CORE_ENDSTONE, 64), new SlimefunItemStack(CoreBlock.RESOURCE_CORE_CLAY, 64), new SlimefunItemStack(CoreBlock.RESOURCE_CORE_SNOW, 64)
    };

    public static final SlimefunItemStack CORE_OF_NATURE = new SlimefunItemStack("CORE_OF_NATURE",
            Material.PAPER, "&aCore of Nature", "", "&7This core contains several natural","&7that have been collected around the world.");
    public static final ItemStack[] RECIPE_CORE_OF_NATURE ={
            new SlimefunItemStack(CoreNature.RESOURCE_CORE_OAK_LOG, 64), new SlimefunItemStack(CoreNature.RESOURCE_CORE_SPRUCE_LOG, 64), new SlimefunItemStack(CoreNature.RESOURCE_CORE_BIRCH_LOG, 64),
            new SlimefunItemStack(CoreNature.RESOURCE_CORE_JUNGLE_LOG, 64), new SlimefunItemStack(CoreNature.RESOURCE_CORE_WITHER_ROSE, 64), new SlimefunItemStack(CoreNature.RESOURCE_CORE_ACACIA_LOG, 64),
            new SlimefunItemStack(CoreNature.RESOURCE_CORE_DARK_OAK_LOG, 64), new SlimefunItemStack(CoreNature.RESOURCE_CORE_CRIMSON_STEM, 64), new SlimefunItemStack(CoreNature.RESOURCE_CORE_WARPED_STEM, 64)
    };

    public static final SlimefunItemStack CORE_OF_ALLOY = new SlimefunItemStack("CORE_OF_ALLOY",
            Material.PAPER, "&aCore of Alloy", "", "&7This core contains several ores","&7that have been collected around the world.");
    public static final ItemStack[] RECIPE_CORE_OF_ALLOY ={
            new SlimefunItemStack(CoreAlloy.RESOURCE_CORE_COAL, 64), new SlimefunItemStack(CoreAlloy.RESOURCE_CORE_IRON, 64), new SlimefunItemStack(CoreAlloy.RESOURCE_CORE_GOLD, 64),
            new SlimefunItemStack(CoreAlloy.RESOURCE_CORE_LAPIS, 64), new SlimefunItemStack(CoreAlloy.RESOURCE_CORE_REDSTONE, 64), new SlimefunItemStack(CoreAlloy.RESOURCE_CORE_QUARTZ, 64),
            new SlimefunItemStack(CoreAlloy.RESOURCE_CORE_DIAMOND, 64), new SlimefunItemStack(CoreAlloy.RESOURCE_CORE_EMERALD, 64), new SlimefunItemStack(CoreAlloy.RESOURCE_CORE_NETHERITE, 64)
    };

}
