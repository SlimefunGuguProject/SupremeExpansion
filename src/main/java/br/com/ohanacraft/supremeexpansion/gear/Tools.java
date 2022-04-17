package br.com.ohanacraft.supremeexpansion.gear;

import br.com.ohanacraft.supremeexpansion.gear.basic.BasicAxe;
import br.com.ohanacraft.supremeexpansion.gear.basic.BasicPickaxe;
import br.com.ohanacraft.supremeexpansion.gear.thornium.Axe;
import br.com.ohanacraft.supremeexpansion.gear.thornium.Pickaxe;
import br.com.ohanacraft.supremeexpansion.gear.thornium.Shovel;
import br.com.ohanacraft.supremeexpansion.Categories;
import br.com.ohanacraft.supremeexpansion.ItemTier;
import br.com.ohanacraft.supremeexpansion.SupremeExpansion;
import br.com.ohanacraft.supremeexpansion.machine.multiBlock.GearFabricator;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;
import io.github.thebusybiscuit.slimefun4.core.researching.Research;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import javax.annotation.Nonnull;


public class Tools extends SlimefunItem implements Soulbound, NotPlaceable {


    public static void setup(SupremeExpansion plugin) {

        // add Enchant
        plugin.addGearEnchants(BasicPickaxe.TITANIUM_PICKAXE,
                BasicPickaxe.AURUM_PICKAXE,
                BasicPickaxe.ADAMANTIUM_PICKAXE,
                BasicAxe.TITANIUM_AXE,
                BasicAxe.AURUM_AXE,
                BasicAxe.ADAMANTIUM_AXE
        );

        // add Enchant
        plugin.addSupremeEnchantsAndSoulbound(Axe.THORNIUM_AXE, Axe.THORNIUM_AXE_MAGIC, Axe.THORNIUM_AXE_RARE,
                Axe.THORNIUM_AXE_EPIC, Axe.THORNIUM_AXE_LEGENDARY, Axe.THORNIUM_AXE_SUPREME,
                Pickaxe.THORNIUM_PICKAXE, Pickaxe.THORNIUM_PICKAXE_MAGIC, Pickaxe.THORNIUM_PICKAXE_RARE,
                Pickaxe.THORNIUM_PICKAXE_EPIC, Pickaxe.THORNIUM_PICKAXE_LEGENDARY, Pickaxe.THORNIUM_PICKAXE_SUPREME,
                Shovel.THORNIUM_SHOVEL, Shovel.THORNIUM_SHOVEL_MAGIC, Shovel.THORNIUM_SHOVEL_RARE,
                Shovel.THORNIUM_SHOVEL_EPIC, Shovel.THORNIUM_SHOVEL_LEGENDARY, Shovel.THORNIUM_SHOVEL_SUPREME
        );

        final Tools titaniumAxe = new Tools(BasicAxe.TITANIUM_AXE, BasicAxe.RECIPE_TITANIUM_AXE);
        titaniumAxe.register(plugin);
        final Tools aurumAxe = new Tools(BasicAxe.AURUM_AXE, BasicAxe.RECIPE_AURUM_AXE);
        aurumAxe.register(plugin);
        final Tools adamantiumAxe = new Tools(BasicAxe.ADAMANTIUM_AXE, BasicAxe.RECIPE_ADAMANTIUM_AXE);
        adamantiumAxe.register(plugin);
        final Tools axe = new Tools(Axe.THORNIUM_AXE, Axe.RECIPE_THORNIUM_AXE);
        axe.register(plugin);
        final Tools axeMagic = new Tools(Axe.THORNIUM_AXE_MAGIC, ItemTier.getMagic(Axe.THORNIUM_AXE));
        axeMagic.register(plugin);
        final Tools axeRare = new Tools(Axe.THORNIUM_AXE_RARE, ItemTier.getRare(Axe.THORNIUM_AXE_MAGIC));
        axeRare.register(plugin);
        final Tools axeEpic = new Tools(Axe.THORNIUM_AXE_EPIC, ItemTier.getEpic(Axe.THORNIUM_AXE_RARE));
        axeEpic.register(plugin);
        final Tools axeLegendary = new Tools(Axe.THORNIUM_AXE_LEGENDARY, ItemTier.getLegendary(Axe.THORNIUM_AXE_EPIC));
        axeLegendary.register(plugin);
        final Tools axeSupreme = new Tools(Axe.THORNIUM_AXE_SUPREME, ItemTier.getSupreme(Axe.THORNIUM_AXE_LEGENDARY));
        axeSupreme.register(plugin);

        final Tools titaniumPickaxe = new Tools(BasicPickaxe.TITANIUM_PICKAXE, BasicPickaxe.RECIPE_TITANIUM_PICKAXE);
        titaniumPickaxe.register(plugin);
        final Tools aurumPickaxe = new Tools(BasicPickaxe.AURUM_PICKAXE, BasicPickaxe.RECIPE_AURUM_PICKAXE);
        aurumPickaxe.register(plugin);
        final Tools adamantiumPickaxe = new Tools(BasicPickaxe.ADAMANTIUM_PICKAXE, BasicPickaxe.RECIPE_ADAMANTIUM_PICKAXE);
        adamantiumPickaxe.register(plugin);
        final Tools pickaxe = new Tools(Pickaxe.THORNIUM_PICKAXE, Pickaxe.RECIPE_THORNIUM_PICKAXE);
        pickaxe.register(plugin);
        final Tools pickaxeMagic = new Tools(Pickaxe.THORNIUM_PICKAXE_MAGIC, ItemTier.getMagic(Pickaxe.THORNIUM_PICKAXE));
        pickaxeMagic.register(plugin);
        final Tools pickaxeRare = new Tools(Pickaxe.THORNIUM_PICKAXE_RARE, ItemTier.getRare(Pickaxe.THORNIUM_PICKAXE_MAGIC));
        pickaxeRare.register(plugin);
        final Tools pickaxeEpic = new Tools(Pickaxe.THORNIUM_PICKAXE_EPIC, ItemTier.getEpic(Pickaxe.THORNIUM_PICKAXE_RARE));
        pickaxeEpic.register(plugin);
        final Tools pickaxeLegendary = new Tools(Pickaxe.THORNIUM_PICKAXE_LEGENDARY, ItemTier.getLegendary(Pickaxe.THORNIUM_PICKAXE_EPIC));
        pickaxeLegendary.register(plugin);
        final Tools pickaxeSupreme = new Tools(Pickaxe.THORNIUM_PICKAXE_SUPREME, ItemTier.getSupreme(Pickaxe.THORNIUM_PICKAXE_LEGENDARY));
        pickaxeSupreme.register(plugin);

        final Tools shovel = new Tools(Shovel.THORNIUM_SHOVEL, Shovel.RECIPE_THORNIUM_SHOVEL);
        shovel.register(plugin);
        final Tools shovelMagic = new Tools(Shovel.THORNIUM_SHOVEL_MAGIC, ItemTier.getMagic(Shovel.THORNIUM_SHOVEL));
        shovelMagic.register(plugin);
        final Tools shovelRare = new Tools(Shovel.THORNIUM_SHOVEL_RARE, ItemTier.getRare(Shovel.THORNIUM_SHOVEL_MAGIC));
        shovelRare.register(plugin);
        final Tools shovelEpic = new Tools(Shovel.THORNIUM_SHOVEL_EPIC, ItemTier.getEpic(Shovel.THORNIUM_SHOVEL_RARE));
        shovelEpic.register(plugin);
        final Tools shovelLegendary = new Tools(Shovel.THORNIUM_SHOVEL_LEGENDARY, ItemTier.getLegendary(Shovel.THORNIUM_SHOVEL_EPIC));
        shovelLegendary.register(plugin);
        final Tools shovelSupreme = new Tools(Shovel.THORNIUM_SHOVEL_SUPREME, ItemTier.getSupreme(Shovel.THORNIUM_SHOVEL_LEGENDARY));
        shovelSupreme.register(plugin);

        // define research
        NamespacedKey researchSupremeexpansionBasicToolsKey = new NamespacedKey(plugin, "RESEARCH_SUPREMEEXPANSION_BASIC_TOOLS");
        Research researchSupremeexpansionBasicTools = new Research(researchSupremeexpansionBasicToolsKey, 140, "Basic Tools", 10);
        researchSupremeexpansionBasicTools.addItems(titaniumPickaxe);
        researchSupremeexpansionBasicTools.addItems(aurumAxe);
        researchSupremeexpansionBasicTools.addItems(adamantiumAxe);
        researchSupremeexpansionBasicTools.addItems(axe);
        researchSupremeexpansionBasicTools.addItems(axeMagic);
        researchSupremeexpansionBasicTools.addItems(axeRare);
        researchSupremeexpansionBasicTools.addItems(titaniumPickaxe);
        researchSupremeexpansionBasicTools.addItems(aurumPickaxe);
        researchSupremeexpansionBasicTools.addItems(adamantiumPickaxe);
        researchSupremeexpansionBasicTools.addItems(pickaxe);
        researchSupremeexpansionBasicTools.addItems(pickaxeMagic);
        researchSupremeexpansionBasicTools.addItems(pickaxeRare);
        researchSupremeexpansionBasicTools.addItems(shovel);
        researchSupremeexpansionBasicTools.addItems(shovelMagic);
        researchSupremeexpansionBasicTools.addItems(shovelRare);
        researchSupremeexpansionBasicTools.register();

        NamespacedKey researchSupremeexpansionAdvancedToolsKey = new NamespacedKey(plugin, "RESEARCH_SUPREMEEXPANSION_ADVANCED_TOOLS");
        Research researchSupremeexpansionAdvancedTools = new Research(researchSupremeexpansionAdvancedToolsKey, 141, "Advanced Tools", 25);
        researchSupremeexpansionAdvancedTools.addItems(axeEpic);
        researchSupremeexpansionAdvancedTools.addItems(axeLegendary);
        researchSupremeexpansionAdvancedTools.addItems(axeSupreme);
        researchSupremeexpansionAdvancedTools.addItems(pickaxeEpic);
        researchSupremeexpansionAdvancedTools.addItems(pickaxeLegendary);
        researchSupremeexpansionAdvancedTools.addItems(pickaxeSupreme);
        researchSupremeexpansionAdvancedTools.addItems(shovelEpic);
        researchSupremeexpansionAdvancedTools.addItems(shovelLegendary);
        researchSupremeexpansionAdvancedTools.addItems(shovelSupreme);
        researchSupremeexpansionAdvancedTools.register();
        
    }

    private Tools(@Nonnull SlimefunItemStack stack, ItemStack[] recipe) {
        super(Categories.TOOLS_CATEGORY, stack, GearFabricator.getMachine(), recipe);
    }
    
}
