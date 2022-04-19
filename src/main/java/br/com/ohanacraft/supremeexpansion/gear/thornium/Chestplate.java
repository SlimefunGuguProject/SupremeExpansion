package br.com.ohanacraft.supremeexpansion.gear.thornium;

import br.com.ohanacraft.supremeexpansion.magical.Cetrus;
import br.com.ohanacraft.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Chestplate {

  public static final SlimefunItemStack THORNIUM_CHESTPLATE = new SlimefunItemStack(
      "ARMOR_THORNIUM_CHESTPLATE",
      Material.NETHERITE_CHESTPLATE, "&f&lThornium Chestplate", "&f&lA chestplate of Thornium");
  public static final ItemStack[] RECIPE_THORNIUM_CHESTPLATE = {
      Components.THORNIUM_INGOT, null, Components.THORNIUM_INGOT,
      Components.THORNIUM_INGOT, Cetrus.CETRUS_LUMIUM, Components.THORNIUM_INGOT,
      Components.THORNIUM_INGOT, Components.THORNIUM_INGOT, Components.THORNIUM_INGOT
  };

  public static final SlimefunItemStack THORNIUM_CHESTPLATE_MAGIC = new SlimefunItemStack(
      "ARMOR_THORNIUM_CHESTPLATE_MAGIC",
      Material.NETHERITE_CHESTPLATE, "&a&lMagic Chestplate", "&f&lA Magic chestplate of Thornium");

  public static final SlimefunItemStack THORNIUM_CHESTPLATE_RARE = new SlimefunItemStack(
      "ARMOR_THORNIUM_CHESTPLATE_RARE",
      Material.NETHERITE_CHESTPLATE, "&b&lRare Chestplate", "&f&lA Rare chestplate of Thornium");

  public static final SlimefunItemStack THORNIUM_CHESTPLATE_EPIC = new SlimefunItemStack(
      "ARMOR_THORNIUM_CHESTPLATE_EPIC",
      Material.NETHERITE_CHESTPLATE, "&d&lEpic Chestplate", "&f&lA Epic chestplate of Thornium");

  public static final SlimefunItemStack THORNIUM_CHESTPLATE_LEGENDARY = new SlimefunItemStack(
      "ARMOR_THORNIUM_CHESTPLATE_LEGENDARY",
      Material.NETHERITE_CHESTPLATE, "&6&lLegendary Chestplate",
      "&f&lA Legendary chestplate of Thornium");

  public static final SlimefunItemStack THORNIUM_CHESTPLATE_SUPREME = new SlimefunItemStack(
      "ARMOR_THORNIUM_CHESTPLATE_SUPREME",
      Material.NETHERITE_CHESTPLATE, "&4&lSupreme Chestplate",
      "&f&lA Supreme chestplate of Thornium");

}
