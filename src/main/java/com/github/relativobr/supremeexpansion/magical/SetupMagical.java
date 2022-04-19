package com.github.relativobr.supremeexpansion.magical;

import com.github.relativobr.supremeexpansion.Categories;
import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.machine.multiBlock.MagicalFabricator;
import com.github.relativobr.supremeexpansion.util.ItemNotPlaceable;
import javax.annotation.Nonnull;

public class SetupMagical {


  public static void setup(@Nonnull SupremeExpansion plugin) {

    ItemNotPlaceable itemCetrusLumium = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        Cetrus.CETRUS_LUMIUM,
        MagicalFabricator.getMachine(), Cetrus.RECIPE_CETRUS_LUMIUM);
    itemCetrusLumium.register(plugin);

    ItemNotPlaceable itemCetrusLux = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        Cetrus.CETRUS_LUX,
        MagicalFabricator.getMachine(), Cetrus.RECIPE_CETRUS_LUX);
    itemCetrusLux.register(plugin);

    ItemNotPlaceable itemCetrusVentus = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        Cetrus.CETRUS_VENTUS,
        MagicalFabricator.getMachine(), Cetrus.RECIPE_CETRUS_VENTUS);
    itemCetrusVentus.register(plugin);

    ItemNotPlaceable itemCetrusAqua = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        Cetrus.CETRUS_AQUA,
        MagicalFabricator.getMachine(), Cetrus.RECIPE_CETRUS_AQUA);
    itemCetrusAqua.register(plugin);

    ItemNotPlaceable itemCetrusIgnis = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        Cetrus.CETRUS_IGNIS,
        MagicalFabricator.getMachine(), Cetrus.RECIPE_CETRUS_IGNIS);
    itemCetrusIgnis.register(plugin);

    ItemNotPlaceable itemAttributeMagic = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        Attribute.getMagic(),
        MagicalFabricator.getMachine(), Attribute.RECIPE_ATTRIBUTE_MAGIC);
    itemAttributeMagic.register(plugin);
    ItemNotPlaceable itemAttributeBomb = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        Attribute.getBomb(),
        MagicalFabricator.getMachine(), Attribute.RECIPE_ATTRIBUTE_BOMB);
    itemAttributeBomb.register(plugin);
    ItemNotPlaceable itemAttributeFortune = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        Attribute.getFortune(),
        MagicalFabricator.getMachine(), Attribute.RECIPE_ATTRIBUTE_FORTUNE);
    itemAttributeFortune.register(plugin);
    ItemNotPlaceable itemAttributeImpetus = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        Attribute.getImpetus(),
        MagicalFabricator.getMachine(), Attribute.RECIPE_ATTRIBUTE_IMPETUS);
    itemAttributeImpetus.register(plugin);


  }

}
