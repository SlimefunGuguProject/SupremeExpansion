package com.github.relativobr.supremeexpansion.util;

import com.github.relativobr.supremeexpansion.SupremeExpansion;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class ItemGroups {

  public static NestedItemGroup MULTI_CATEGORY = new NestedItemGroup(
      new NamespacedKey(SupremeExpansion.inst(), "MAIN"),
      new CustomItemStack(
          PlayerHead.getItemStack(PlayerSkin.fromHashCode(
              "c69e3e6e5b2b92f0beb368b738b993d7ba225bf9bb2758bfc9fc2daba4a5a7d"
          )),
          "&4至尊研究院"));

  public static ItemGroup RESOURCE_CATEGORY = new SubItemGroup(
      new NamespacedKey(SupremeExpansion.inst(), "RESOURCE"), MULTI_CATEGORY,
      new CustomItemStack(Material.GOLDEN_APPLE, "&4资源"));

  public static ItemGroup COMPONENTS_CATEGORY = new SubItemGroup(
      new NamespacedKey(SupremeExpansion.inst(), "COMPONENTS"), MULTI_CATEGORY,
      new CustomItemStack(Material.NETHERITE_INGOT, "&4零件"));

  public static ItemGroup MAGICAL_CATEGORY = new SubItemGroup(
      new NamespacedKey(SupremeExpansion.inst(), "MAGICAL"), MULTI_CATEGORY,
      new CustomItemStack(Material.BREWING_STAND, "&4魔法与核心"));

  public static ItemGroup MACHINES_CATEGORY = new SubItemGroup(
      new NamespacedKey(SupremeExpansion.inst(), "MACHINES"), MULTI_CATEGORY,
      new CustomItemStack(Material.OBSERVER, "&4机器"));

  public static ItemGroup ELECTRIC_CATEGORY = new SubItemGroup(
      new NamespacedKey(SupremeExpansion.inst(), "ELECTRIC"), MULTI_CATEGORY,
      new CustomItemStack(
          PlayerHead.getItemStack(PlayerSkin.fromHashCode(
            "77400ea19dbd84f75c39ad6823ac4ef786f39f48fc6f84602366ac29b837422"
          )),
          "&4电力"));

  public static ItemGroup TOOLS_CATEGORY = new SubItemGroup(
      new NamespacedKey(SupremeExpansion.inst(), "TOOLS"), MULTI_CATEGORY,
      new CustomItemStack(Material.NETHERITE_PICKAXE, "&4至尊工具"));

  public static ItemGroup ARMOR_CATEGORY = new SubItemGroup(
      new NamespacedKey(SupremeExpansion.inst(), "ARMOR"), MULTI_CATEGORY,
      new CustomItemStack(Material.NETHERITE_CHESTPLATE, "&4至尊盔甲"));

  public static ItemGroup WEAPONS_CATEGORY = new SubItemGroup(
      new NamespacedKey(SupremeExpansion.inst(), "WEAPONS"), MULTI_CATEGORY,
      new CustomItemStack(Material.NETHERITE_SWORD, "&4至尊武器"));

}
