package br.com.ohanacraft.supremeexpansion.gear.thornium;

import br.com.ohanacraft.supremeexpansion.magical.Cetrus;
import br.com.ohanacraft.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Helmet {

  public static final SlimefunItemStack THORNIUM_HELMET = new SlimefunItemStack(
      "ARMOR_THORNIUM_HELMET",
      Material.NETHERITE_HELMET, "&f&lThornium Helmet", "&f&lA helmet of Thornium");
  public static final ItemStack[] RECIPE_THORNIUM_HELMET = {
      Components.THORNIUM_INGOT, Cetrus.CETRUS_AQUA, Components.THORNIUM_INGOT,
      Components.THORNIUM_INGOT, null, Components.THORNIUM_INGOT,
      null, null, null
  };

  public static final SlimefunItemStack THORNIUM_HELMET_MAGIC = new SlimefunItemStack(
      "ARMOR_THORNIUM_HELMET_MAGIC",
      Material.NETHERITE_HELMET, "&a&lMagic Helmet", "&f&lA Magic helmet of Thornium");

  public static final SlimefunItemStack THORNIUM_HELMET_RARE = new SlimefunItemStack(
      "ARMOR_THORNIUM_HELMET_RARE",
      Material.NETHERITE_HELMET, "&b&lRare Helmet", "&f&lA Rare helmet of Thornium");

  public static final SlimefunItemStack THORNIUM_HELMET_EPIC = new SlimefunItemStack(
      "ARMOR_THORNIUM_HELMET_EPIC",
      Material.NETHERITE_HELMET, "&d&lEpic Helmet", "&f&lA Epic helmet of Thornium");

  public static final SlimefunItemStack THORNIUM_HELMET_LEGENDARY = new SlimefunItemStack(
      "ARMOR_THORNIUM_HELMET_LEGENDARY",
      Material.NETHERITE_HELMET, "&6&lLegendary Helmet", "&f&lA Legendary helmet of Thornium");

  public static final SlimefunItemStack THORNIUM_HELMET_SUPREME = new SlimefunItemStack(
      "ARMOR_THORNIUM_HELMET_SUPREME",
      Material.NETHERITE_HELMET, "&4&lSupreme Helmet", "&f&lA Supreme helmet of Thornium");

}
