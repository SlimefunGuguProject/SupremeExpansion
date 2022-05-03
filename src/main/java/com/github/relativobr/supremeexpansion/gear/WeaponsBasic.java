package com.github.relativobr.supremeexpansion.gear;

import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class WeaponsBasic {

  public static final SlimefunItemStack ADAMANTIUM_SWORD =
      new SlimefunItemStack(
          "WEAPONS_ADAMANTIUM_SWORD",
          Material.DIAMOND_SWORD,
          "&f&lAdamantium Sword",
          "&f&lA Sword of Adamantium");
  public static final ItemStack[] RECIPE_ADAMANTIUM_SWORD = {
    null, SupremeComponents.ADAMANTIUM_PLATE, null,
    null, SupremeComponents.ADAMANTIUM_PLATE, null,
    null, new ItemStack(Material.STICK), null
  };

  public static final SlimefunItemStack AURUM_SWORD =
      new SlimefunItemStack(
          "WEAPONS_AURUM_SWORD", Material.DIAMOND_SWORD, "&f&lAurum Sword", "&f&lA Sword of Aurum");
  public static final ItemStack[] RECIPE_AURUM_SWORD = {
    null, SupremeComponents.AURUM_PLATE, null,
    null, SupremeComponents.AURUM_PLATE, null,
    null, new ItemStack(Material.STICK), null
  };

  public static final SlimefunItemStack TITANIUM_SWORD =
      new SlimefunItemStack(
          "WEAPONS_TITANIUM_SWORD",
          Material.DIAMOND_SWORD,
          "&f&lTitanium Sword",
          "&f&lA Sword of Titanium");
  public static final ItemStack[] RECIPE_TITANIUM_SWORD = {
    null, SupremeComponents.TITANIUM_PLATE, null,
    null, SupremeComponents.TITANIUM_PLATE, null,
    null, new ItemStack(Material.STICK), null
  };
}
