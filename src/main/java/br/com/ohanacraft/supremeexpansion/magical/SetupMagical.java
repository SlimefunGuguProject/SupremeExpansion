package br.com.ohanacraft.supremeexpansion.magical;

import br.com.ohanacraft.supremeexpansion.Categories;
import br.com.ohanacraft.supremeexpansion.SupremeExpansion;
import br.com.ohanacraft.supremeexpansion.machine.multiBlock.MagicalFabricator;
import io.github.thebusybiscuit.slimefun4.core.researching.Research;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import org.bukkit.NamespacedKey;

import javax.annotation.Nonnull;

public class SetupMagical {


    public static void setup(@Nonnull SupremeExpansion plugin) {

        SlimefunItem itemCetrusLumium = new SlimefunItem(Categories.MAGICAL_CATEGORY, Cetrus.CETRUS_LUMIUM,
                MagicalFabricator.getMachine(), Cetrus.RECIPE_CETRUS_LUMIUM);
        itemCetrusLumium.register(plugin);

        SlimefunItem itemCetrusLux = new SlimefunItem(Categories.MAGICAL_CATEGORY, Cetrus.CETRUS_LUX,
                MagicalFabricator.getMachine(), Cetrus.RECIPE_CETRUS_LUX);
        itemCetrusLux.register(plugin);

        SlimefunItem itemCetrusVentus = new SlimefunItem(Categories.MAGICAL_CATEGORY, Cetrus.CETRUS_VENTUS,
                MagicalFabricator.getMachine(), Cetrus.RECIPE_CETRUS_VENTUS);
        itemCetrusVentus.register(plugin);

        SlimefunItem itemCetrusAqua = new SlimefunItem(Categories.MAGICAL_CATEGORY, Cetrus.CETRUS_AQUA,
                MagicalFabricator.getMachine(), Cetrus.RECIPE_CETRUS_AQUA);
        itemCetrusAqua.register(plugin);

        SlimefunItem itemCetrusIgnis = new SlimefunItem(Categories.MAGICAL_CATEGORY, Cetrus.CETRUS_IGNIS,
                MagicalFabricator.getMachine(), Cetrus.RECIPE_CETRUS_IGNIS);
        itemCetrusIgnis.register(plugin);



        SlimefunItem itemAttributeMagic = new SlimefunItem(Categories.MAGICAL_CATEGORY, Attribute.getMagic(),
                MagicalFabricator.getMachine(), Attribute.RECIPE_ATTRIBUTE_MAGIC);
        itemAttributeMagic.register(plugin);
        SlimefunItem itemAttributeBomb = new SlimefunItem(Categories.MAGICAL_CATEGORY, Attribute.getBomb(),
                MagicalFabricator.getMachine(), Attribute.RECIPE_ATTRIBUTE_BOMB);
        itemAttributeBomb.register(plugin);
        SlimefunItem itemAttributeFortune = new SlimefunItem(Categories.MAGICAL_CATEGORY, Attribute.getFortune(),
                MagicalFabricator.getMachine(), Attribute.RECIPE_ATTRIBUTE_FORTUNE);
        itemAttributeFortune.register(plugin);
        SlimefunItem itemAttributeImpetus = new SlimefunItem(Categories.MAGICAL_CATEGORY, Attribute.getImpetus(),
                MagicalFabricator.getMachine(), Attribute.RECIPE_ATTRIBUTE_IMPETUS);
        itemAttributeImpetus.register(plugin);


        NamespacedKey researchSupremeexpansionResourceCetrusKey = new NamespacedKey(plugin, "RESEARCH_SUPREMEEXPANSION_CETRUS");
        Research researchSupremeexpansionResourceCetrus = new Research(researchSupremeexpansionResourceCetrusKey, 200, "Supreme Resource Cetrus", 50);
        researchSupremeexpansionResourceCetrus.addItems(itemCetrusLumium);
        researchSupremeexpansionResourceCetrus.addItems(itemCetrusLux);
        researchSupremeexpansionResourceCetrus.addItems(itemCetrusVentus);
        researchSupremeexpansionResourceCetrus.addItems(itemCetrusAqua);
        researchSupremeexpansionResourceCetrus.addItems(itemCetrusIgnis);
        researchSupremeexpansionResourceCetrus.register();


        NamespacedKey researchSupremeexpansionResourceAttributeKey = new NamespacedKey(plugin, "RESEARCH_SUPREMEEXPANSION_ATTRIBUTE");
        Research researchSupremeexpansionResourceAttribute = new Research(researchSupremeexpansionResourceAttributeKey, 201, "Supreme Resource Attribute", 50);
        researchSupremeexpansionResourceAttribute.addItems(itemAttributeMagic);
        researchSupremeexpansionResourceAttribute.addItems(itemAttributeBomb);
        researchSupremeexpansionResourceAttribute.addItems(itemAttributeFortune);
        researchSupremeexpansionResourceAttribute.addItems(itemAttributeImpetus);
        researchSupremeexpansionResourceAttribute.register();


    }

}
