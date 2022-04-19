package br.com.ohanacraft.supremeexpansion.core;

import br.com.ohanacraft.supremeexpansion.Categories;
import br.com.ohanacraft.supremeexpansion.SupremeExpansion;
import br.com.ohanacraft.supremeexpansion.machine.multiBlock.CoreFabricator;
import br.com.ohanacraft.supremeexpansion.util.CustomCoreRecipe;
import br.com.ohanacraft.supremeexpansion.util.ItemNotPlaceable;
import javax.annotation.Nonnull;

public class SetupResourceCore {


  public static void setup(@Nonnull SupremeExpansion plugin) {

    ItemNotPlaceable itemResourceCoreStone = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreBlock.RESOURCE_CORE_STONE, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_STONE));
    itemResourceCoreStone.register(plugin);

    ItemNotPlaceable itemResourceCoreGranite = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreBlock.RESOURCE_CORE_GRANITE, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_GRANITE));
    itemResourceCoreGranite.register(plugin);

    ItemNotPlaceable itemResourceCoreDiorite = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreBlock.RESOURCE_CORE_DIORITE, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_DIORITE));
    itemResourceCoreDiorite.register(plugin);

    ItemNotPlaceable itemResourceCoreAndesite = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreBlock.RESOURCE_CORE_ANDESITE, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_ANDESITE));
    itemResourceCoreAndesite.register(plugin);

    ItemNotPlaceable itemResourceCoreGravel = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreBlock.RESOURCE_CORE_GRAVEL, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_GRAVEL));
    itemResourceCoreGravel.register(plugin);

    ItemNotPlaceable itemResourceCoreSand = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreBlock.RESOURCE_CORE_SAND, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_SAND));
    itemResourceCoreSand.register(plugin);

    ItemNotPlaceable itemResourceCoreEndstone = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreBlock.RESOURCE_CORE_ENDSTONE, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_ENDSTONE));
    itemResourceCoreEndstone.register(plugin);

    ItemNotPlaceable itemResourceCoreClay = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreBlock.RESOURCE_CORE_CLAY, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_CLAY));
    itemResourceCoreClay.register(plugin);

    ItemNotPlaceable itemResourceCoreSnow = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreBlock.RESOURCE_CORE_SNOW, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_SNOW));
    itemResourceCoreSnow.register(plugin);

    ItemNotPlaceable itemResourceCorePorkchop = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreDeath.RESOURCE_CORE_PORKCHOP, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_PORKCHOP));
    itemResourceCorePorkchop.register(plugin);

    ItemNotPlaceable itemResourceCoreBeef = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreDeath.RESOURCE_CORE_BEEF, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_BEEF));
    itemResourceCoreBeef.register(plugin);

    ItemNotPlaceable itemResourceCoreMutton = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreDeath.RESOURCE_CORE_MUTTON, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_MUTTON));
    itemResourceCoreMutton.register(plugin);

    ItemNotPlaceable itemResourceCoreRawChicken = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreDeath.RESOURCE_CORE_CHICKEN, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_CHICKEN));
    itemResourceCoreRawChicken.register(plugin);

    ItemNotPlaceable itemResourceCoreSalmon = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreDeath.RESOURCE_CORE_SALMON, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_SALMON));
    itemResourceCoreSalmon.register(plugin);

    ItemNotPlaceable itemResourceCoreCod = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreDeath.RESOURCE_CORE_COD, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_COD));
    itemResourceCoreCod.register(plugin);

    ItemNotPlaceable itemResourceCoreLead = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreDeath.RESOURCE_CORE_STRING, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_STRING));
    itemResourceCoreLead.register(plugin);

    ItemNotPlaceable itemResourceCoreSpiderEye = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreDeath.RESOURCE_CORE_SPIDER_EYE, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_SPIDER_EYE));
    itemResourceCoreSpiderEye.register(plugin);

    ItemNotPlaceable itemResourceCoreGhastTear = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreDeath.RESOURCE_CORE_TEAR, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_TEAR));
    itemResourceCoreGhastTear.register(plugin);

    ItemNotPlaceable itemResourceCorePotato = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreLife.RESOURCE_CORE_POTATO, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_POTATO));
    itemResourceCorePotato.register(plugin);

    ItemNotPlaceable itemResourceCoreApple = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreLife.RESOURCE_CORE_APPLE, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_APPLE));
    itemResourceCoreApple.register(plugin);

    ItemNotPlaceable itemResourceCoreBeetroot = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreLife.RESOURCE_CORE_BEETROOT, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_BEETROOT));
    itemResourceCoreBeetroot.register(plugin);

    ItemNotPlaceable itemResourceCoreWheat = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreLife.RESOURCE_CORE_WHEAT, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_WHEAT));
    itemResourceCoreWheat.register(plugin);

    ItemNotPlaceable itemResourceCoreSugarCane = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreLife.RESOURCE_CORE_SUGAR_CANE, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_SUGAR_CANE));
    itemResourceCoreSugarCane.register(plugin);

    ItemNotPlaceable itemResourceCoreSweetBerries = new ItemNotPlaceable(
        Categories.RESOURCE_CATEGORY, CoreLife.RESOURCE_CORE_SWEET_BERRIES,
        CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_SWEET_BERRIES));
    itemResourceCoreSweetBerries.register(plugin);

    ItemNotPlaceable itemResourceCoreMelon = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreLife.RESOURCE_CORE_MELON, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_MELON));
    itemResourceCoreMelon.register(plugin);

    ItemNotPlaceable itemResourceCoreCarrot = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreLife.RESOURCE_CORE_CARROT, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_CARROT));
    itemResourceCoreCarrot.register(plugin);

    ItemNotPlaceable itemResourceCorePumpkin = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreLife.RESOURCE_CORE_PUMPKIN, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_PUMPKIN));
    itemResourceCorePumpkin.register(plugin);

    ItemNotPlaceable itemResourceCoreRed = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreColor.RESOURCE_CORE_RED, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_RED));
    itemResourceCoreRed.register(plugin);

    ItemNotPlaceable itemResourceCoreYellow = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreColor.RESOURCE_CORE_YELLOW, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_YELLOW));
    itemResourceCoreYellow.register(plugin);

    ItemNotPlaceable itemResourceCorePurple = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreColor.RESOURCE_CORE_PURPLE, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_PURPLE));
    itemResourceCorePurple.register(plugin);

    ItemNotPlaceable itemResourceCoreBlue = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreColor.RESOURCE_CORE_BLUE, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_BLUE));
    itemResourceCoreBlue.register(plugin);

    ItemNotPlaceable itemResourceCoreBlack = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreColor.RESOURCE_CORE_BLACK, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_BLACK));
    itemResourceCoreBlack.register(plugin);

    ItemNotPlaceable itemResourceCoreGreen = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreColor.RESOURCE_CORE_GREEN, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_GREEN));
    itemResourceCoreGreen.register(plugin);

    ItemNotPlaceable itemResourceCorePink = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreColor.RESOURCE_CORE_PINK, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_PINK));
    itemResourceCorePink.register(plugin);

    ItemNotPlaceable itemResourceCoreGray = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreColor.RESOURCE_CORE_GRAY, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_GRAY));
    itemResourceCoreGray.register(plugin);

    ItemNotPlaceable itemResourceCoreCyan = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreColor.RESOURCE_CORE_CYAN, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_CYAN));
    itemResourceCoreCyan.register(plugin);

    ItemNotPlaceable itemResourceCoreOakLog = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreNature.RESOURCE_CORE_OAK_LOG, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_OAK_LOG));
    itemResourceCoreOakLog.register(plugin);

    ItemNotPlaceable itemResourceCoreSpruceLog = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreNature.RESOURCE_CORE_SPRUCE_LOG, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_SPRUCE_LOG));
    itemResourceCoreSpruceLog.register(plugin);

    ItemNotPlaceable itemResourceCoreBirchLog = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreNature.RESOURCE_CORE_BIRCH_LOG, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_BIRCH_LOG));
    itemResourceCoreBirchLog.register(plugin);

    ItemNotPlaceable itemResourceCoreJungleLog = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreNature.RESOURCE_CORE_JUNGLE_LOG, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_JUNGLE_LOG));
    itemResourceCoreJungleLog.register(plugin);

    ItemNotPlaceable itemResourceCoreAcaciaLog = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreNature.RESOURCE_CORE_ACACIA_LOG, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_ACACIA_LOG));
    itemResourceCoreAcaciaLog.register(plugin);

    ItemNotPlaceable itemResourceCoreDarkLog = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreNature.RESOURCE_CORE_DARK_OAK_LOG, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_DARK_OAK_LOG));
    itemResourceCoreDarkLog.register(plugin);

    ItemNotPlaceable itemResourceCoreCrimsonLog = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreNature.RESOURCE_CORE_CRIMSON_STEM, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_CRIMSON_STEM));
    itemResourceCoreCrimsonLog.register(plugin);

    ItemNotPlaceable itemResourceCoreWarpedLog = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreNature.RESOURCE_CORE_WARPED_STEM, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_WARPED_STEM));
    itemResourceCoreWarpedLog.register(plugin);

    ItemNotPlaceable itemResourceCoreWitherRose = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreNature.RESOURCE_CORE_WITHER_ROSE, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_WITHER_ROSE));
    itemResourceCoreWitherRose.register(plugin);

    ItemNotPlaceable itemResourceCoreCoal = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreAlloy.RESOURCE_CORE_COAL, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_COAL));
    itemResourceCoreCoal.register(plugin);

    ItemNotPlaceable itemResourceCoreIron = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreAlloy.RESOURCE_CORE_IRON, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_IRON));
    itemResourceCoreIron.register(plugin);

    ItemNotPlaceable itemResourceCoreGold = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreAlloy.RESOURCE_CORE_GOLD, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_GOLD));
    itemResourceCoreGold.register(plugin);

    ItemNotPlaceable itemResourceCoreRedstone = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreAlloy.RESOURCE_CORE_REDSTONE, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_REDSTONE));
    itemResourceCoreRedstone.register(plugin);

    ItemNotPlaceable itemResourceCoreLapis = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreAlloy.RESOURCE_CORE_LAPIS, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_LAPIS));
    itemResourceCoreLapis.register(plugin);

    ItemNotPlaceable itemResourceCoreDiamond = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreAlloy.RESOURCE_CORE_DIAMOND, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_DIAMOND));
    itemResourceCoreDiamond.register(plugin);

    ItemNotPlaceable itemResourceCoreEmerald = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreAlloy.RESOURCE_CORE_EMERALD, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_EMERALD));
    itemResourceCoreEmerald.register(plugin);

    ItemNotPlaceable itemResourceCoreQuartz = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreAlloy.RESOURCE_CORE_QUARTZ, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_QUARTZ));
    itemResourceCoreQuartz.register(plugin);

    ItemNotPlaceable itemResourceCoreNetherite = new ItemNotPlaceable(Categories.RESOURCE_CATEGORY,
        CoreAlloy.RESOURCE_CORE_NETHERITE, CoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_NETHERITE));
    itemResourceCoreNetherite.register(plugin);


  }

}
