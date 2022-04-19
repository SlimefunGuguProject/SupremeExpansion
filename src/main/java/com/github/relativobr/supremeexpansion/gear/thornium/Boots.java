package com.github.relativobr.supremeexpansion.gear.thornium;

import com.github.relativobr.supremeexpansion.magical.Cetrus;
import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Boots {

  public static final SlimefunItemStack THORNIUM_BOOTS = new SlimefunItemStack(
      "ARMOR_THORNIUM_BOOTS",
      Material.NETHERITE_BOOTS, "&f&lThornium boots", "&f&lA boots of Thornium");
  public static final ItemStack[] RECIPE_THORNIUM_BOOTS = {
      null, null, null,
      Cetrus.CETRUS_IGNIS, null, Cetrus.CETRUS_IGNIS,
      Components.THORNIUM_INGOT, null, Components.THORNIUM_INGOT
  };

  public static final SlimefunItemStack THORNIUM_BOOTS_MAGIC = new SlimefunItemStack(
      "ARMOR_THORNIUM_BOOTS_MAGIC",
      Material.NETHERITE_BOOTS, "&a&lMagic Boots", "&f&lA Magic boots of Thornium");

  public static final SlimefunItemStack THORNIUM_BOOTS_RARE = new SlimefunItemStack(
      "ARMOR_THORNIUM_BOOTS_RARE",
      Material.NETHERITE_BOOTS, "&b&lRare Boots", "&f&lA Rare boots of Thornium");

  public static final SlimefunItemStack THORNIUM_BOOTS_EPIC = new SlimefunItemStack(
      "ARMOR_THORNIUM_BOOTS_EPIC",
      Material.NETHERITE_BOOTS, "&d&lEpic Boots", "&f&lA Epic boots of Thornium");

  public static final SlimefunItemStack THORNIUM_BOOTS_LEGENDARY = new SlimefunItemStack(
      "ARMOR_THORNIUM_BOOTS_LEGENDARY",
      Material.NETHERITE_BOOTS, "&6&lLegendary Boots", "&f&lA Legendary boots of Thornium");

  public static final SlimefunItemStack THORNIUM_BOOTS_SUPREME = new SlimefunItemStack(
      "ARMOR_THORNIUM_BOOTS_SUPREME",
      Material.NETHERITE_BOOTS, "&4&lSupreme Boots", "&f&lA Supreme boots of Thornium");

}
