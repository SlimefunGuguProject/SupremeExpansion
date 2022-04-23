package com.github.relativobr.supremeexpansion.gear.thornium;

import com.github.relativobr.supremeexpansion.magical.Cetrus;
import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class Pickaxe {


  public static final SlimefunItemStack THORNIUM_PICKAXE = new SlimefunItemStack(
      "TOOLS_THORNIUM_PICKAXE",
      Material.NETHERITE_PICKAXE, "&f&l钍石镐", "&f&l由钍做的镐子");
  public static final ItemStack[] RECIPE_THORNIUM_PICKAXE = {
      Components.THORNIUM_INGOT, Cetrus.CETRUS_IGNIS, Components.THORNIUM_INGOT,
      null, SlimefunItems.STAFF_ELEMENTAL, null,
      null, SlimefunItems.STAFF_ELEMENTAL, null
  };

  public static final SlimefunItemStack THORNIUM_PICKAXE_MAGIC = new SlimefunItemStack(
      "TOOLS_THORNIUM_PICKAXE_MAGIC",
      Material.NETHERITE_PICKAXE, "&a&l魔法镐", "&f&l一把蕴含魔法的镐子");

  public static final SlimefunItemStack THORNIUM_PICKAXE_RARE = new SlimefunItemStack(
      "TOOLS_THORNIUM_PICKAXE_RARE",
      Material.NETHERITE_PICKAXE, "&b&l珍馐镐", "&f&l一把珍奇的镐子");

  public static final SlimefunItemStack THORNIUM_PICKAXE_EPIC = new SlimefunItemStack(
      "TOOLS_THORNIUM_PICKAXE_EPIC",
      Material.NETHERITE_PICKAXE, "&d&l精英镐", "&f&l一把精良的镐子");

  public static final SlimefunItemStack THORNIUM_PICKAXE_LEGENDARY = new SlimefunItemStack(
      "TOOLS_THORNIUM_PICKAXE_LEGENDARY",
      Material.NETHERITE_PICKAXE, "&6&l神话镐", "&f&l它曾在历史书上出现过");

  public static final SlimefunItemStack THORNIUM_PICKAXE_SUPREME = new SlimefunItemStack(
      "TOOLS_THORNIUM_PICKAXE_SUPREME",
      Material.NETHERITE_PICKAXE, "&4&l至尊镐", "&f&l至尊的终极之镐");

}
