package br.com.ohanacraft.supremeexpansion;

import io.github.thebusybiscuit.slimefun4.core.categories.MultiCategory;
import io.github.thebusybiscuit.slimefun4.core.categories.SubCategory;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class Categories {

    public static MultiCategory MULTI_CATEGORY = new MultiCategory(new NamespacedKey(SupremeExpansion.inst(), "MAIN"),
                new CustomItem(SkullItem.fromHash("c69e3e6e5b2b92f0beb368b738b993d7ba225bf9bb2758bfc9fc2daba4a5a7d"), "&4Supreme Expansion"));

    public static Category RESOURCE_CATEGORY = new SubCategory(new NamespacedKey(SupremeExpansion.inst(), "RESOURCE"), MULTI_CATEGORY,
                new CustomItem(Material.GOLDEN_APPLE, "&4Resource"));

    public static Category MAGICAL_CATEGORY = new SubCategory(new NamespacedKey(SupremeExpansion.inst(), "MAGICAL"), MULTI_CATEGORY,
                new CustomItem(Material.BREWING_STAND, "&4Magical"));

    public static Category CORE_CATEGORY = new SubCategory(new NamespacedKey(SupremeExpansion.inst(), "CORE"), MULTI_CATEGORY,
                new CustomItem(Material.SHROOMLIGHT, "&4Supreme Core"));

    public static Category MACHINES_CATEGORY = new SubCategory(new NamespacedKey(SupremeExpansion.inst(), "MACHINES"), MULTI_CATEGORY,
                new CustomItem(Material.OBSERVER, "&4Machines"));

    public static Category TOOLS_CATEGORY = new SubCategory(new NamespacedKey(SupremeExpansion.inst(), "TOOLS"), MULTI_CATEGORY,
                new CustomItem(Material.NETHERITE_PICKAXE, "&4Supreme Tools"));

    public static Category ARMOR_CATEGORY = new SubCategory(new NamespacedKey(SupremeExpansion.inst(), "ARMOR"), MULTI_CATEGORY,
                new CustomItem(Material.NETHERITE_CHESTPLATE, "&4Supreme Armor"));

    public static Category WEAPONS_CATEGORY = new SubCategory(new NamespacedKey(SupremeExpansion.inst(), "WEAPONS"), MULTI_CATEGORY,
                new CustomItem(Material.NETHERITE_SWORD, "&4Supreme Weapons"));
    
}
