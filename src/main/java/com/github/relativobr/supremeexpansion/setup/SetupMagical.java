package com.github.relativobr.supremeexpansion.setup;

import com.github.relativobr.supremeexpansion.Categories;
import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.machine.MultiBlockMagicalFabricator;
import com.github.relativobr.supremeexpansion.magical.SupremeAttribute;
import com.github.relativobr.supremeexpansion.magical.SupremeCetrus;
import com.github.relativobr.util.ItemNotPlaceable;
import javax.annotation.Nonnull;

public class SetupMagical {

  public static void setup(@Nonnull SupremeExpansion plugin) {

    ItemNotPlaceable itemCetrusLumium = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCetrus.CETRUS_LUMIUM,
        MultiBlockMagicalFabricator.getMachine(), SupremeCetrus.RECIPE_CETRUS_LUMIUM);
    itemCetrusLumium.register(plugin);

    ItemNotPlaceable itemCetrusLux = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCetrus.CETRUS_LUX,
        MultiBlockMagicalFabricator.getMachine(), SupremeCetrus.RECIPE_CETRUS_LUX);
    itemCetrusLux.register(plugin);

    ItemNotPlaceable itemCetrusVentus = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCetrus.CETRUS_VENTUS,
        MultiBlockMagicalFabricator.getMachine(), SupremeCetrus.RECIPE_CETRUS_VENTUS);
    itemCetrusVentus.register(plugin);

    ItemNotPlaceable itemCetrusAqua = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCetrus.CETRUS_AQUA,
        MultiBlockMagicalFabricator.getMachine(), SupremeCetrus.RECIPE_CETRUS_AQUA);
    itemCetrusAqua.register(plugin);

    ItemNotPlaceable itemCetrusIgnis = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeCetrus.CETRUS_IGNIS,
        MultiBlockMagicalFabricator.getMachine(), SupremeCetrus.RECIPE_CETRUS_IGNIS);
    itemCetrusIgnis.register(plugin);

    ItemNotPlaceable itemAttributeMagic = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeAttribute.getMagic(),
        MultiBlockMagicalFabricator.getMachine(), SupremeAttribute.RECIPE_ATTRIBUTE_MAGIC);
    itemAttributeMagic.register(plugin);
    ItemNotPlaceable itemAttributeBomb = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeAttribute.getBomb(),
        MultiBlockMagicalFabricator.getMachine(), SupremeAttribute.RECIPE_ATTRIBUTE_BOMB);
    itemAttributeBomb.register(plugin);
    ItemNotPlaceable itemAttributeFortune = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeAttribute.getFortune(),
        MultiBlockMagicalFabricator.getMachine(), SupremeAttribute.RECIPE_ATTRIBUTE_FORTUNE);
    itemAttributeFortune.register(plugin);
    ItemNotPlaceable itemAttributeImpetus = new ItemNotPlaceable(Categories.MAGICAL_CATEGORY,
        SupremeAttribute.getImpetus(),
        MultiBlockMagicalFabricator.getMachine(), SupremeAttribute.RECIPE_ATTRIBUTE_IMPETUS);
    itemAttributeImpetus.register(plugin);


  }

}
