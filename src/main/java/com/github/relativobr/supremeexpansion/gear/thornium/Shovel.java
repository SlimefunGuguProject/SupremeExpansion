package com.github.relativobr.supremeexpansion.gear.thornium;

import com.github.relativobr.supremeexpansion.magical.Cetrus;
import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class Shovel {


  public static final SlimefunItemStack THORNIUM_SHOVEL = new SlimefunItemStack(
      "TOOLS_THORNIUM_SHOVEL",
      Material.NETHERITE_SHOVEL, "&f&l钍石锹", "&f&l由钍制成的锹");
  public static final ItemStack[] RECIPE_THORNIUM_SHOVEL = {
      null, Components.THORNIUM_INGOT, null,
      null, Cetrus.CETRUS_AQUA, null,
      null, SlimefunItems.STAFF_ELEMENTAL, null
  };

  public static final SlimefunItemStack THORNIUM_SHOVEL_MAGIC = new SlimefunItemStack(
      "TOOLS_THORNIUM_SHOVEL_MAGIC",
      Material.NETHERITE_SHOVEL, "&a&l魔法锹", "&f&l一把蕴含魔法的锹");

  public static final SlimefunItemStack THORNIUM_SHOVEL_RARE = new SlimefunItemStack(
      "TOOLS_THORNIUM_SHOVEL_RARE",
      Material.NETHERITE_SHOVEL, "&b&l珍馐锹", "&f&l一把珍奇的锹");

  public static final SlimefunItemStack THORNIUM_SHOVEL_EPIC = new SlimefunItemStack(
      "TOOLS_THORNIUM_SHOVEL_EPIC",
      Material.NETHERITE_SHOVEL, "&d&l精英锹", "&f&l一把精良的锹");

  public static final SlimefunItemStack THORNIUM_SHOVEL_LEGENDARY = new SlimefunItemStack(
      "TOOLS_THORNIUM_SHOVEL_LEGENDARY",
      Material.NETHERITE_SHOVEL, "&6&l神话锹", "&f&l它曾在历史上出现过");

  public static final SlimefunItemStack THORNIUM_SHOVEL_SUPREME = new SlimefunItemStack(
      "TOOLS_THORNIUM_SHOVEL_SUPREME",
      Material.NETHERITE_SHOVEL, "&4&l至尊锹", "&f&l至尊的终极之锹");

}
