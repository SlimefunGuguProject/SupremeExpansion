package com.github.relativobr.supremeexpansion.gear;

import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class ToolsBasic {

    public static final SlimefunItemStack ADAMANTIUM_AXE =
        new SlimefunItemStack(
            "TOOLS_ADAMANTIUM_AXE",
            Material.DIAMOND_AXE,
            "&f&l精金斧",
            "&f&l由精金制成");
    public static final ItemStack[] RECIPE_ADAMANTIUM_AXE = {
        SupremeComponents.ADAMANTIUM_PLATE,
        SupremeComponents.ADAMANTIUM_PLATE,
        null,
        SupremeComponents.ADAMANTIUM_PLATE,
        new ItemStack(Material.STICK),
        null,
        null,
        new ItemStack(Material.STICK),
        null
    };

    public static final SlimefunItemStack AURUM_AXE =
        new SlimefunItemStack(
            "TOOLS_AURUM_AXE",
            Material.DIAMOND_AXE,
            "&f&l金合金斧",
            "&f&l由金合金制成");
    public static final ItemStack[] RECIPE_AURUM_AXE = {
        SupremeComponents.AURUM_PLATE,
        SupremeComponents.AURUM_PLATE,
        null,
        SupremeComponents.AURUM_PLATE,
        new ItemStack(Material.STICK),
        null,
        null,
        new ItemStack(Material.STICK),
        null
    };

    public static final SlimefunItemStack TITANIUM_AXE =
        new SlimefunItemStack(
            "TOOLS_TITANIUM_AXE",
            Material.DIAMOND_AXE,
            "&f&l钛合金斧",
            "&f&l由钛合金制成");
    public static final ItemStack[] RECIPE_TITANIUM_AXE = {
        SupremeComponents.TITANIUM_PLATE,
        SupremeComponents.TITANIUM_PLATE,
        null,
        SupremeComponents.TITANIUM_PLATE,
        new ItemStack(Material.STICK),
        null,
        null,
        new ItemStack(Material.STICK),
        null
    };

    public static final SlimefunItemStack ADAMANTIUM_PICKAXE =
        new SlimefunItemStack(
            "TOOLS_ADAMANTIUM_PICKAXE",
            Material.DIAMOND_PICKAXE,
            "&f&l精金镐",
            "&f&l由精金制成");
    public static final ItemStack[] RECIPE_ADAMANTIUM_PICKAXE = {
        SupremeComponents.ADAMANTIUM_PLATE,
        SupremeComponents.ADAMANTIUM_PLATE,
        SupremeComponents.ADAMANTIUM_PLATE,
        null,
        new ItemStack(Material.STICK),
        null,
        null,
        new ItemStack(Material.STICK),
        null
    };

    public static final SlimefunItemStack AURUM_PICKAXE =
        new SlimefunItemStack(
            "TOOLS_AURUM_PICKAXE",
            Material.DIAMOND_PICKAXE,
            "&f&l金合金镐",
            "&f&l由金合金制成");
    public static final ItemStack[] RECIPE_AURUM_PICKAXE = {
        SupremeComponents.AURUM_PLATE,
        SupremeComponents.AURUM_PLATE,
        SupremeComponents.AURUM_PLATE,
        null,
        new ItemStack(Material.STICK),
        null,
        null,
        new ItemStack(Material.STICK),
        null
    };

    public static final SlimefunItemStack TITANIUM_PICKAXE =
        new SlimefunItemStack(
            "TOOLS_TITANIUM_PICKAXE",
            Material.DIAMOND_PICKAXE,
            "&f&l钛合金镐",
            "&f&l由钛合金制成");
    public static final ItemStack[] RECIPE_TITANIUM_PICKAXE = {
        SupremeComponents.TITANIUM_PLATE,
        SupremeComponents.TITANIUM_PLATE,
        SupremeComponents.TITANIUM_PLATE,
        null,
        new ItemStack(Material.STICK),
        null,
        null,
        new ItemStack(Material.STICK),
        null
    };

    public static final SlimefunItemStack ADAMANTIUM_SHOVEL =
        new SlimefunItemStack(
            "TOOLS_ADAMANTIUM_SHOVEL",
            Material.DIAMOND_SHOVEL,
            "&f&l精金锹",
            "&f&l由精金制成");
    public static final ItemStack[] RECIPE_ADAMANTIUM_SHOVEL = {
        null, SupremeComponents.ADAMANTIUM_PLATE, null,
        null, new ItemStack(Material.STICK), null,
        null, new ItemStack(Material.STICK), null
    };

    public static final SlimefunItemStack AURUM_SHOVEL =
        new SlimefunItemStack(
            "TOOLS_AURUM_SHOVEL",
            Material.DIAMOND_SHOVEL,
            "&f&l金合金锹",
            "&f&l由金合金制成");
    public static final ItemStack[] RECIPE_AURUM_SHOVEL = {
        null, SupremeComponents.AURUM_PLATE, null,
        null, new ItemStack(Material.STICK), null,
        null, new ItemStack(Material.STICK), null
    };

    public static final SlimefunItemStack TITANIUM_SHOVEL =
        new SlimefunItemStack(
            "TOOLS_TITANIUM_SHOVEL",
            Material.DIAMOND_SHOVEL,
            "&f&l钛合金锹",
            "&f&l由钛合金制成");
    public static final ItemStack[] RECIPE_TITANIUM_SHOVEL = {
        null, SupremeComponents.TITANIUM_PLATE, null,
        null, new ItemStack(Material.STICK), null,
        null, new ItemStack(Material.STICK), null
    };
}
