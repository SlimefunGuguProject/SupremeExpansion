package br.com.ohanacraft.supremeexpansion.core;

import br.com.ohanacraft.supremeexpansion.Categories;
import br.com.ohanacraft.supremeexpansion.SupremeExpansion;
import br.com.ohanacraft.supremeexpansion.machine.multiBlock.CoreFabricator;
import io.github.thebusybiscuit.slimefun4.core.researching.Research;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import org.bukkit.NamespacedKey;
import javax.annotation.Nonnull;

public class SetupCore {

    public static void setup(@Nonnull SupremeExpansion plugin) {

        SlimefunItem itemCoreOfBlock = new SlimefunItem(Categories.CORE_CATEGORY, SupremeCore.CORE_OF_BLOCK,
                CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_BLOCK);
        itemCoreOfBlock.register(plugin);

        SlimefunItem itemCoreOfDeath = new SlimefunItem(Categories.CORE_CATEGORY, SupremeCore.CORE_OF_DEATH,
                CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_DEATH);
        itemCoreOfDeath.register(plugin);

        SlimefunItem itemCoreOfLife = new SlimefunItem(Categories.CORE_CATEGORY, SupremeCore.CORE_OF_LIFE,
                CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_LIFE);
        itemCoreOfLife.register(plugin);

        SlimefunItem itemCoreOfColor = new SlimefunItem(Categories.CORE_CATEGORY, SupremeCore.CORE_OF_COLOR,
                CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_COLOR);
        itemCoreOfColor.register(plugin);

        SlimefunItem itemCoreOfNature = new SlimefunItem(Categories.CORE_CATEGORY, SupremeCore.CORE_OF_NATURE,
                CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_NATURE);
        itemCoreOfNature.register(plugin);

        SlimefunItem itemCoreOfAllow = new SlimefunItem(Categories.CORE_CATEGORY, SupremeCore.CORE_OF_ALLOY,
                CoreFabricator.getMachine(), SupremeCore.RECIPE_CORE_OF_ALLOY);
        itemCoreOfAllow.register(plugin);

        NamespacedKey researchSupremeexpansionCoreKey = new NamespacedKey(plugin, "RESEARCH_SUPREMEEXPANSION_CORE");
        Research researchSupremeexpansionCore = new Research(researchSupremeexpansionCoreKey, 100, "Supreme Core", 50);
        researchSupremeexpansionCore.addItems(itemCoreOfBlock);
        researchSupremeexpansionCore.addItems(itemCoreOfDeath);
        researchSupremeexpansionCore.addItems(itemCoreOfLife);
        researchSupremeexpansionCore.addItems(itemCoreOfColor);
        researchSupremeexpansionCore.addItems(itemCoreOfNature);
        researchSupremeexpansionCore.addItems(itemCoreOfAllow);
        researchSupremeexpansionCore.register();

    }

}
