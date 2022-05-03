package com.github.relativobr.supremeexpansion.setup;

import com.github.relativobr.supremeexpansion.Categories;
import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.core.SupremeCoreAlloy;
import com.github.relativobr.supremeexpansion.core.SupremeCoreBlock;
import com.github.relativobr.supremeexpansion.core.SupremeCoreColor;
import com.github.relativobr.supremeexpansion.core.SupremeCoreDeath;
import com.github.relativobr.supremeexpansion.core.SupremeCoreLife;
import com.github.relativobr.supremeexpansion.core.SupremeCoreNature;
import com.github.relativobr.supremeexpansion.machine.MultiBlockCoreFabricator;
import com.github.relativobr.recipe.CustomCoreRecipe;
import com.github.relativobr.util.ItemNotPlaceable;
import javax.annotation.Nonnull;

public class SetupResourceCore {


  public static void setup(@Nonnull SupremeExpansion plugin) {

    ItemNotPlaceable itemResourceCoreStone = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_STONE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_STONE));
    itemResourceCoreStone.register(plugin);

    ItemNotPlaceable itemResourceCoreGranite = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_GRANITE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_GRANITE));
    itemResourceCoreGranite.register(plugin);

    ItemNotPlaceable itemResourceCoreDiorite = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_DIORITE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_DIORITE));
    itemResourceCoreDiorite.register(plugin);

    ItemNotPlaceable itemResourceCoreAndesite = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_ANDESITE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_ANDESITE));
    itemResourceCoreAndesite.register(plugin);

    ItemNotPlaceable itemResourceCoreGravel = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_GRAVEL, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_GRAVEL));
    itemResourceCoreGravel.register(plugin);

    ItemNotPlaceable itemResourceCoreSand = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_SAND, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_SAND));
    itemResourceCoreSand.register(plugin);

    ItemNotPlaceable itemResourceCoreEndstone = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_ENDSTONE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_ENDSTONE));
    itemResourceCoreEndstone.register(plugin);

    ItemNotPlaceable itemResourceCoreClay = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_CLAY, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_CLAY));
    itemResourceCoreClay.register(plugin);

    ItemNotPlaceable itemResourceCoreSnow = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_SNOW, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_SNOW));
    itemResourceCoreSnow.register(plugin);

    ItemNotPlaceable itemResourceCorePorkchop = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_PORKCHOP, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_PORKCHOP));
    itemResourceCorePorkchop.register(plugin);

    ItemNotPlaceable itemResourceCoreBeef = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_BEEF, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_BEEF));
    itemResourceCoreBeef.register(plugin);

    ItemNotPlaceable itemResourceCoreMutton = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_MUTTON, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_MUTTON));
    itemResourceCoreMutton.register(plugin);

    ItemNotPlaceable itemResourceCoreRawChicken = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_CHICKEN, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_CHICKEN));
    itemResourceCoreRawChicken.register(plugin);

    ItemNotPlaceable itemResourceCoreSalmon = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_SALMON, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_SALMON));
    itemResourceCoreSalmon.register(plugin);

    ItemNotPlaceable itemResourceCoreCod = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_COD, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_COD));
    itemResourceCoreCod.register(plugin);

    ItemNotPlaceable itemResourceCoreLead = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_STRING, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_STRING));
    itemResourceCoreLead.register(plugin);

    ItemNotPlaceable itemResourceCoreSpiderEye = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_SPIDER_EYE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_SPIDER_EYE));
    itemResourceCoreSpiderEye.register(plugin);

    ItemNotPlaceable itemResourceCoreGhastTear = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_TEAR, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_TEAR));
    itemResourceCoreGhastTear.register(plugin);

    ItemNotPlaceable itemResourceCorePotato = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreLife.RESOURCE_CORE_POTATO, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_POTATO));
    itemResourceCorePotato.register(plugin);

    ItemNotPlaceable itemResourceCoreApple = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreLife.RESOURCE_CORE_APPLE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_APPLE));
    itemResourceCoreApple.register(plugin);

    ItemNotPlaceable itemResourceCoreBeetroot = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreLife.RESOURCE_CORE_BEETROOT, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_BEETROOT));
    itemResourceCoreBeetroot.register(plugin);

    ItemNotPlaceable itemResourceCoreWheat = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreLife.RESOURCE_CORE_WHEAT, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_WHEAT));
    itemResourceCoreWheat.register(plugin);

    ItemNotPlaceable itemResourceCoreSugarCane = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreLife.RESOURCE_CORE_SUGAR_CANE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_SUGAR_CANE));
    itemResourceCoreSugarCane.register(plugin);

    ItemNotPlaceable itemResourceCoreSweetBerries = new ItemNotPlaceable(
        Categories.RESOURCE_CATEGORY, SupremeCoreLife.RESOURCE_CORE_SWEET_BERRIES,
        MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_SWEET_BERRIES));
    itemResourceCoreSweetBerries.register(plugin);

    ItemNotPlaceable itemResourceCoreMelon = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreLife.RESOURCE_CORE_MELON, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_MELON));
    itemResourceCoreMelon.register(plugin);

    ItemNotPlaceable itemResourceCoreCarrot = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreLife.RESOURCE_CORE_CARROT, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_CARROT));
    itemResourceCoreCarrot.register(plugin);

    ItemNotPlaceable itemResourceCorePumpkin = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreLife.RESOURCE_CORE_PUMPKIN, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_PUMPKIN));
    itemResourceCorePumpkin.register(plugin);

    ItemNotPlaceable itemResourceCoreRed = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_RED, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_RED));
    itemResourceCoreRed.register(plugin);

    ItemNotPlaceable itemResourceCoreYellow = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_YELLOW, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_YELLOW));
    itemResourceCoreYellow.register(plugin);

    ItemNotPlaceable itemResourceCorePurple = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_PURPLE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_PURPLE));
    itemResourceCorePurple.register(plugin);

    ItemNotPlaceable itemResourceCoreBlue = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_BLUE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_BLUE));
    itemResourceCoreBlue.register(plugin);

    ItemNotPlaceable itemResourceCoreBlack = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_BLACK, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_BLACK));
    itemResourceCoreBlack.register(plugin);

    ItemNotPlaceable itemResourceCoreGreen = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_GREEN, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_GREEN));
    itemResourceCoreGreen.register(plugin);

    ItemNotPlaceable itemResourceCorePink = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_PINK, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_PINK));
    itemResourceCorePink.register(plugin);

    ItemNotPlaceable itemResourceCoreGray = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_GRAY, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_GRAY));
    itemResourceCoreGray.register(plugin);

    ItemNotPlaceable itemResourceCoreCyan = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_CYAN, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_CYAN));
    itemResourceCoreCyan.register(plugin);

    ItemNotPlaceable itemResourceCoreOakLog = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_OAK_LOG, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_OAK_LOG));
    itemResourceCoreOakLog.register(plugin);

    ItemNotPlaceable itemResourceCoreSpruceLog = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_SPRUCE_LOG, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_SPRUCE_LOG));
    itemResourceCoreSpruceLog.register(plugin);

    ItemNotPlaceable itemResourceCoreBirchLog = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_BIRCH_LOG, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_BIRCH_LOG));
    itemResourceCoreBirchLog.register(plugin);

    ItemNotPlaceable itemResourceCoreJungleLog = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_JUNGLE_LOG, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_JUNGLE_LOG));
    itemResourceCoreJungleLog.register(plugin);

    ItemNotPlaceable itemResourceCoreAcaciaLog = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_ACACIA_LOG, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_ACACIA_LOG));
    itemResourceCoreAcaciaLog.register(plugin);

    ItemNotPlaceable itemResourceCoreDarkLog = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_DARK_OAK_LOG, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_DARK_OAK_LOG));
    itemResourceCoreDarkLog.register(plugin);

    ItemNotPlaceable itemResourceCoreCrimsonLog = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_CRIMSON_STEM, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_CRIMSON_STEM));
    itemResourceCoreCrimsonLog.register(plugin);

    ItemNotPlaceable itemResourceCoreWarpedLog = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_WARPED_STEM, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_WARPED_STEM));
    itemResourceCoreWarpedLog.register(plugin);

    ItemNotPlaceable itemResourceCoreWitherRose = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_WITHER_ROSE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_WITHER_ROSE));
    itemResourceCoreWitherRose.register(plugin);

    ItemNotPlaceable itemResourceCoreCoal = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_COAL, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_COAL));
    itemResourceCoreCoal.register(plugin);

    ItemNotPlaceable itemResourceCoreIron = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_IRON, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_IRON));
    itemResourceCoreIron.register(plugin);

    ItemNotPlaceable itemResourceCoreGold = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_GOLD, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_GOLD));
    itemResourceCoreGold.register(plugin);

    ItemNotPlaceable itemResourceCoreRedstone = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_REDSTONE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_REDSTONE));
    itemResourceCoreRedstone.register(plugin);

    ItemNotPlaceable itemResourceCoreLapis = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_LAPIS, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_LAPIS));
    itemResourceCoreLapis.register(plugin);

    ItemNotPlaceable itemResourceCoreDiamond = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_DIAMOND, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_DIAMOND));
    itemResourceCoreDiamond.register(plugin);

    ItemNotPlaceable itemResourceCoreEmerald = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_EMERALD, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_EMERALD));
    itemResourceCoreEmerald.register(plugin);

    ItemNotPlaceable itemResourceCoreQuartz = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_QUARTZ, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_QUARTZ));
    itemResourceCoreQuartz.register(plugin);

    ItemNotPlaceable itemResourceCoreNetherite = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_NETHERITE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_NETHERITE));
    itemResourceCoreNetherite.register(plugin);


  }

}
