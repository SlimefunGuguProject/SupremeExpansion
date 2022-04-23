package com.github.relativobr.supremeexpansion.gear.thornium;

import com.github.relativobr.supremeexpansion.core.CoreNature;
import com.github.relativobr.supremeexpansion.magical.Cetrus;
import com.github.relativobr.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class Shield {

  public static final SlimefunItemStack THORNIUM_SHIELD = new SlimefunItemStack(
      "WEAPONS_THORNIUM_SHIELD",
      Material.SHIELD, "&f&l钍石盾", "&f&l由钍制成的盾");
  public static final ItemStack[] RECIPE_THORNIUM_SHIELD = {
      CoreNature.RESOURCE_CORE_OAK_LOG, Components.THORNIUM_INGOT, CoreNature.RESOURCE_CORE_OAK_LOG,
      CoreNature.RESOURCE_CORE_OAK_LOG, Cetrus.CETRUS_LUX, CoreNature.RESOURCE_CORE_OAK_LOG,
      null, CoreNature.RESOURCE_CORE_OAK_LOG, null
  };

  public static final SlimefunItemStack THORNIUM_SHIELD_MAGIC = new SlimefunItemStack(
      "WEAPONS_THORNIUM_SHIELD_MAGIC",
      Material.SHIELD, "&a&l魔法盾", "&f&l一个蕴含魔法的盾牌");

  public static final SlimefunItemStack THORNIUM_SHIELD_RARE = new SlimefunItemStack(
      "WEAPONS_THORNIUM_SHIELD_RARE",
      Material.SHIELD, "&b&l珍馐盾", "&f&l一个珍奇的盾牌");

  public static final SlimefunItemStack THORNIUM_SHIELD_EPIC = new SlimefunItemStack(
      "WEAPONS_THORNIUM_SHIELD_EPIC",
      Material.SHIELD, "&d&l精英盾", "&f&l一个精良的盾牌");

  public static final SlimefunItemStack THORNIUM_SHIELD_LEGENDARY = new SlimefunItemStack(
      "WEAPONS_THORNIUM_SHIELD_LEGENDARY",
      Material.SHIELD, "&6&l神话盾", "&f&l它曾在历史书上出现过");

  public static final SlimefunItemStack THORNIUM_SHIELD_SUPREME = new SlimefunItemStack(
      "WEAPONS_THORNIUM_SHIELD_SUPREME",
      Material.SHIELD, "&4&l至尊盾", "&f&l至尊的终极之盾");

}
