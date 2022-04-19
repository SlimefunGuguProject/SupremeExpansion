package com.github.relativobr.supremeexpansion.gear.thornium;

import com.github.relativobr.supremeexpansion.core.CoreDeath;
import com.github.relativobr.supremeexpansion.magical.Cetrus;
import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class Bow {


  public static final SlimefunItemStack THORNIUM_BOW = new SlimefunItemStack("WEAPONS_THORNIUM_BOW",
      Material.BOW, "&f&lThornium Bow", "&f&lA Bow of Thornium");
  public static final ItemStack[] RECIPE_THORNIUM_BOW = {
      null, Components.THORNIUM_INGOT, CoreDeath.RESOURCE_CORE_STRING,
      Cetrus.CETRUS_LUMIUM, null, CoreDeath.RESOURCE_CORE_STRING,
      null, Components.THORNIUM_INGOT, CoreDeath.RESOURCE_CORE_STRING
  };

  public static final SlimefunItemStack THORNIUM_BOW_MAGIC = new SlimefunItemStack(
      "WEAPONS_THORNIUM_BOW_MAGIC",
      Material.BOW, "&a&lMagic Bow", "&f&lA Magic Bow of Thornium");

  public static final SlimefunItemStack THORNIUM_BOW_RARE = new SlimefunItemStack(
      "WEAPONS_THORNIUM_BOW_RARE",
      Material.BOW, "&b&lRare Bow", "&f&lA Rare Bow of Thornium");

  public static final SlimefunItemStack THORNIUM_BOW_EPIC = new SlimefunItemStack(
      "WEAPONS_THORNIUM_BOW_EPIC",
      Material.BOW, "&d&lEpic Bow", "&f&lA Epic Bow of Thornium");

  public static final SlimefunItemStack THORNIUM_BOW_LEGENDARY = new SlimefunItemStack(
      "WEAPONS_THORNIUM_BOW_LEGENDARY",
      Material.BOW, "&6&lLegendary Bow", "&f&lA Legendary Bow of Thornium");

  public static final SlimefunItemStack THORNIUM_BOW_SUPREME = new SlimefunItemStack(
      "WEAPONS_THORNIUM_BOW_SUPREME",
      Material.BOW, "&4&lSupreme Bow", "&f&lA Supreme Bow ofThornium");


}
