package br.com.ohanacraft.supremeexpansion.resource;

import br.com.ohanacraft.supremeexpansion.Categories;
import br.com.ohanacraft.supremeexpansion.SupremeExpansion;
import br.com.ohanacraft.supremeexpansion.util.CustomCoreRecipe;
import br.com.ohanacraft.supremeexpansion.machine.multiBlock.CoreFabricator;
import io.github.thebusybiscuit.slimefun4.core.researching.Research;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import org.bukkit.NamespacedKey;
import javax.annotation.Nonnull;

public class SetupResourceCore {


    public static void setup(@Nonnull SupremeExpansion plugin) {

        
        SlimefunItem itemResourceCoreStone = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreBlock.RESOURCE_CORE_STONE,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_STONE));
        itemResourceCoreStone.register(plugin);

        
        SlimefunItem itemResourceCoreGranite = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreBlock.RESOURCE_CORE_GRANITE,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_GRANITE));
        itemResourceCoreGranite.register(plugin);

        
        SlimefunItem itemResourceCoreDiorite = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreBlock.RESOURCE_CORE_DIORITE,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_DIORITE));
        itemResourceCoreDiorite.register(plugin);

        
        SlimefunItem itemResourceCoreAndesite = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreBlock.RESOURCE_CORE_ANDESITE,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_ANDESITE));
        itemResourceCoreAndesite.register(plugin);

        
        SlimefunItem itemResourceCoreGravel = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreBlock.RESOURCE_CORE_GRAVEL,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_GRAVEL));
        itemResourceCoreGravel.register(plugin);

        
        SlimefunItem itemResourceCoreSand = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreBlock.RESOURCE_CORE_SAND,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_SAND));
        itemResourceCoreSand.register(plugin);

        
        SlimefunItem itemResourceCoreEndstone = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreBlock.RESOURCE_CORE_ENDSTONE,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_ENDSTONE));
        itemResourceCoreEndstone.register(plugin);

        
        SlimefunItem itemResourceCoreClay = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreBlock.RESOURCE_CORE_CLAY,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_CLAY));
        itemResourceCoreClay.register(plugin);

        
        SlimefunItem itemResourceCoreSnow = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreBlock.RESOURCE_CORE_SNOW,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreBlock.RECIPE_RESOURCE_CORE_SNOW));
        itemResourceCoreSnow.register(plugin);

        
        SlimefunItem itemResourceCorePorkchop = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreDeath.RESOURCE_CORE_PORKCHOP,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_PORKCHOP));
        itemResourceCorePorkchop.register(plugin);

        
        SlimefunItem itemResourceCoreBeef = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreDeath.RESOURCE_CORE_BEEF,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_BEEF));
        itemResourceCoreBeef.register(plugin);

        
        SlimefunItem itemResourceCoreMutton = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreDeath.RESOURCE_CORE_MUTTON,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_MUTTON));
        itemResourceCoreMutton.register(plugin);

        
        SlimefunItem itemResourceCoreRawChicken = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreDeath.RESOURCE_CORE_CHICKEN,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_CHICKEN));
        itemResourceCoreRawChicken.register(plugin);

        
        SlimefunItem itemResourceCoreSalmon = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreDeath.RESOURCE_CORE_SALMON,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_SALMON));
        itemResourceCoreSalmon.register(plugin);

        
        SlimefunItem itemResourceCoreCod = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreDeath.RESOURCE_CORE_COD,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_COD));
        itemResourceCoreCod.register(plugin);

        
        SlimefunItem itemResourceCoreLead = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreDeath.RESOURCE_CORE_STRING,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_STRING));
        itemResourceCoreLead.register(plugin);

        
        SlimefunItem itemResourceCoreSpiderEye = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreDeath.RESOURCE_CORE_SPIDER_EYE,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_SPIDER_EYE));
        itemResourceCoreSpiderEye.register(plugin);

        
        SlimefunItem itemResourceCoreGhastTear = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreDeath.RESOURCE_CORE_TEAR,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreDeath.RECIPE_RESOURCE_CORE_TEAR));
        itemResourceCoreGhastTear.register(plugin);

        
        SlimefunItem itemResourceCorePotato = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreLife.RESOURCE_CORE_POTATO,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_POTATO));
        itemResourceCorePotato.register(plugin);

        
        SlimefunItem itemResourceCoreApple = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreLife.RESOURCE_CORE_APPLE,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_APPLE));
        itemResourceCoreApple.register(plugin);

        
        SlimefunItem itemResourceCoreBeetroot = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreLife.RESOURCE_CORE_BEETROOT,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_BEETROOT));
        itemResourceCoreBeetroot.register(plugin);

        
        SlimefunItem itemResourceCoreWheat = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreLife.RESOURCE_CORE_WHEAT,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_WHEAT));
        itemResourceCoreWheat.register(plugin);

        
        SlimefunItem itemResourceCoreSugarCane = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreLife.RESOURCE_CORE_SUGAR_CANE,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_SUGAR_CANE));
        itemResourceCoreSugarCane.register(plugin);

        
        SlimefunItem itemResourceCoreSweetBerries = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreLife.RESOURCE_CORE_SWEET_BERRIES,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_SWEET_BERRIES));
        itemResourceCoreSweetBerries.register(plugin);

        
        SlimefunItem itemResourceCoreMelon = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreLife.RESOURCE_CORE_MELON,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_MELON));
        itemResourceCoreMelon.register(plugin);

        
        SlimefunItem itemResourceCoreCarrot = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreLife.RESOURCE_CORE_CARROT,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_CARROT));
        itemResourceCoreCarrot.register(plugin);

        
        SlimefunItem itemResourceCorePumpkin = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreLife.RESOURCE_CORE_PUMPKIN,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreLife.RECIPE_RESOURCE_CORE_PUMPKIN));
        itemResourceCorePumpkin.register(plugin);

        
        SlimefunItem itemResourceCoreRed = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreColor.RESOURCE_CORE_RED,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_RED));
        itemResourceCoreRed.register(plugin);

        
        SlimefunItem itemResourceCoreYellow = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreColor.RESOURCE_CORE_YELLOW,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_YELLOW));
        itemResourceCoreYellow.register(plugin);

        
        SlimefunItem itemResourceCorePurple = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreColor.RESOURCE_CORE_PURPLE,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_PURPLE));
        itemResourceCorePurple.register(plugin);

        
        SlimefunItem itemResourceCoreBlue = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreColor.RESOURCE_CORE_BLUE,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_BLUE));
        itemResourceCoreBlue.register(plugin);

        
        SlimefunItem itemResourceCoreBlack = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreColor.RESOURCE_CORE_BLACK,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_BLACK));
        itemResourceCoreBlack.register(plugin);

        
        SlimefunItem itemResourceCoreGreen = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreColor.RESOURCE_CORE_GREEN,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_GREEN));
        itemResourceCoreGreen.register(plugin);

        
        SlimefunItem itemResourceCorePink = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreColor.RESOURCE_CORE_PINK,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_PINK));
        itemResourceCorePink.register(plugin);

        
        SlimefunItem itemResourceCoreGray = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreColor.RESOURCE_CORE_GRAY,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_GRAY));
        itemResourceCoreGray.register(plugin);

        
        SlimefunItem itemResourceCoreCyan = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreColor.RESOURCE_CORE_CYAN,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreColor.RECIPE_RESOURCE_CORE_CYAN));
        itemResourceCoreCyan.register(plugin);

        
        SlimefunItem itemResourceCoreOakLog = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreNature.RESOURCE_CORE_OAK_LOG,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_OAK_LOG));
        itemResourceCoreOakLog.register(plugin);

        
        SlimefunItem itemResourceCoreSpruceLog = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreNature.RESOURCE_CORE_SPRUCE_LOG,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_SPRUCE_LOG));
        itemResourceCoreSpruceLog.register(plugin);

        
        SlimefunItem itemResourceCoreBirchLog = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreNature.RESOURCE_CORE_BIRCH_LOG,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_BIRCH_LOG));
        itemResourceCoreBirchLog.register(plugin);

        
        SlimefunItem itemResourceCoreJungleLog = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreNature.RESOURCE_CORE_JUNGLE_LOG,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_JUNGLE_LOG));
        itemResourceCoreJungleLog.register(plugin);

        
        SlimefunItem itemResourceCoreAcaciaLog = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreNature.RESOURCE_CORE_ACACIA_LOG,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_ACACIA_LOG));
        itemResourceCoreAcaciaLog.register(plugin);

        
        SlimefunItem itemResourceCoreDarkLog = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreNature.RESOURCE_CORE_DARK_OAK_LOG,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_DARK_OAK_LOG));
        itemResourceCoreDarkLog.register(plugin);

        
        SlimefunItem itemResourceCoreCrimsonLog = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreNature.RESOURCE_CORE_CRIMSON_STEM,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_CRIMSON_STEM));
        itemResourceCoreCrimsonLog.register(plugin);

        
        SlimefunItem itemResourceCoreWarpedLog = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreNature.RESOURCE_CORE_WARPED_STEM,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_WARPED_STEM));
        itemResourceCoreWarpedLog.register(plugin);

        
        SlimefunItem itemResourceCoreWitherRose = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreNature.RESOURCE_CORE_WITHER_ROSE,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreNature.RECIPE_RESOURCE_CORE_WITHER_ROSE));
        itemResourceCoreWitherRose.register(plugin);

        SlimefunItem itemResourceCoreCoal = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreAlloy.RESOURCE_CORE_COAL,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_COAL));
        itemResourceCoreCoal.register(plugin);

        SlimefunItem itemResourceCoreIron = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreAlloy.RESOURCE_CORE_IRON,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_IRON));
        itemResourceCoreIron.register(plugin);

        SlimefunItem itemResourceCoreGold = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreAlloy.RESOURCE_CORE_GOLD,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_GOLD));
        itemResourceCoreGold.register(plugin);

        SlimefunItem itemResourceCoreRedstone = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreAlloy.RESOURCE_CORE_REDSTONE,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_REDSTONE));
        itemResourceCoreRedstone.register(plugin);

        SlimefunItem itemResourceCoreLapis = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreAlloy.RESOURCE_CORE_LAPIS,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_LAPIS));
        itemResourceCoreLapis.register(plugin);

        SlimefunItem itemResourceCoreDiamond = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreAlloy.RESOURCE_CORE_DIAMOND,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_DIAMOND));
        itemResourceCoreDiamond.register(plugin);

        SlimefunItem itemResourceCoreEmerald = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreAlloy.RESOURCE_CORE_EMERALD,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_EMERALD));
        itemResourceCoreEmerald.register(plugin);

        SlimefunItem itemResourceCoreQuartz = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreAlloy.RESOURCE_CORE_QUARTZ,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_QUARTZ));
        itemResourceCoreQuartz.register(plugin);

        SlimefunItem itemResourceCoreNetherite = new SlimefunItem(Categories.RESOURCE_CATEGORY, CoreAlloy.RESOURCE_CORE_NETHERITE,
                CoreFabricator.getMachine(), CustomCoreRecipe.getRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_NETHERITE));
        itemResourceCoreNetherite.register(plugin);
        
        NamespacedKey research_supremeexpansion_resource_core_key = new NamespacedKey(plugin, "RESEARCH_SUPREMEEXPANSION_RESOURCE_CORE");
        Research research_supremeexpansion_resource_core = new Research(research_supremeexpansion_resource_core_key, 300, "Supreme Resource Core", 25);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreApple);
        research_supremeexpansion_resource_core.addItems(itemResourceCorePotato);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreBeetroot);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreWheat);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreSugarCane);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreSweetBerries);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreMelon);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreCarrot);
        research_supremeexpansion_resource_core.addItems(itemResourceCorePumpkin);
        research_supremeexpansion_resource_core.addItems(itemResourceCorePorkchop);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreBeef);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreMutton);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreRawChicken);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreSalmon);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreCod);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreLead);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreSpiderEye);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreGhastTear);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreRed);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreYellow);
        research_supremeexpansion_resource_core.addItems(itemResourceCorePurple);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreBlue);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreBlack);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreGreen);
        research_supremeexpansion_resource_core.addItems(itemResourceCorePink);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreGray);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreCyan);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreStone);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreGranite);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreDiorite);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreAndesite);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreGravel);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreSand);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreEndstone);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreClay);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreSnow);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreOakLog);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreSpruceLog);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreBirchLog);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreJungleLog);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreAcaciaLog);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreDarkLog);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreCrimsonLog);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreWarpedLog);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreWitherRose);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreCoal);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreIron);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreGold);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreRedstone);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreLapis);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreDiamond);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreEmerald);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreQuartz);
        research_supremeexpansion_resource_core.addItems(itemResourceCoreNetherite);
        research_supremeexpansion_resource_core.register();


    }

}
