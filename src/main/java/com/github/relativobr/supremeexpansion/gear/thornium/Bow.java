package com.github.relativobr.supremeexpansion.gear.thornium;

import com.github.relativobr.supremeexpansion.core.CoreDeath;
import com.github.relativobr.supremeexpansion.magical.Cetrus;
import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class Bow {


  public static final SlimefunItemStack THORNIUM_BOW = new SlimefunItemStack("WEAPONS_THORNIUM_BOW",
      Material.BOW, "&f&l钍石弓", "&f&l由钍制成的弓");
  public static final ItemStack[] RECIPE_THORNIUM_BOW = {
      null, Components.THORNIUM_INGOT, CoreDeath.RESOURCE_CORE_STRING,
      Cetrus.CETRUS_LUMIUM, null, CoreDeath.RESOURCE_CORE_STRING,
      null, Components.THORNIUM_INGOT, CoreDeath.RESOURCE_CORE_STRING
  };

  public static final SlimefunItemStack THORNIUM_BOW_MAGIC = new SlimefunItemStack(
      "WEAPONS_THORNIUM_BOW_MAGIC",
      Material.BOW, "&a&l魔法弓", "&f&l一把蕴含魔法的弓");

  public static final SlimefunItemStack THORNIUM_BOW_RARE = new SlimefunItemStack(
      "WEAPONS_THORNIUM_BOW_RARE",
      Material.BOW, "&b&l珍馐弓", "&f&l一把珍奇的弓");

  public static final SlimefunItemStack THORNIUM_BOW_EPIC = new SlimefunItemStack(
      "WEAPONS_THORNIUM_BOW_EPIC",
      Material.BOW, "&d&l精英弓", "&f&l一把精良的弓");

  public static final SlimefunItemStack THORNIUM_BOW_LEGENDARY = new SlimefunItemStack(
      "WEAPONS_THORNIUM_BOW_LEGENDARY",
      Material.BOW, "&6&l神话弓", "&f&l它曾在历史书上出现过");

  public static final SlimefunItemStack THORNIUM_BOW_SUPREME = new SlimefunItemStack(
      "WEAPONS_THORNIUM_BOW_SUPREME",
      Material.BOW, "&4&l至尊弓", "&f&l至尊的终极之弓");


}
