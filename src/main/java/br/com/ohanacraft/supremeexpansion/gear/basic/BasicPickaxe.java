package br.com.ohanacraft.supremeexpansion.gear.basic;

import br.com.ohanacraft.supremeexpansion.resource.Components;
import br.com.ohanacraft.supremeexpansion.resource.CoreNature;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class BasicPickaxe {

    public static final SlimefunItemStack ADAMANTIUM_PICKAXE = new SlimefunItemStack("TOOLS_ADAMANTIUM_PICKAXE",
            Material.DIAMOND_PICKAXE, "&f&lAdamantium Pickaxe", "&f&lA Pickaxe of Adamantium");
    public static final ItemStack[] RECIPE_ADAMANTIUM_PICKAXE = {
            Components.ADAMANTIUM_PLATE,   Components.ADAMANTIUM_PLATE,        Components.ADAMANTIUM_PLATE,
            null,   CoreNature.RESOURCE_CORE_DARK_OAK_LOG,        null,
            null,   CoreNature.RESOURCE_CORE_DARK_OAK_LOG,  null
    };

    public static final SlimefunItemStack AURUM_PICKAXE = new SlimefunItemStack("TOOLS_AURUM_PICKAXE",
            Material.DIAMOND_PICKAXE, "&f&lAurum Pickaxe", "&f&lA Pickaxe of Aurum");
    public static final ItemStack[] RECIPE_AURUM_PICKAXE = {
            Components.AURUM_PLATE,   Components.AURUM_PLATE,        Components.AURUM_PLATE,
            null,   CoreNature.RESOURCE_CORE_ACACIA_LOG,        null,
            null,   CoreNature.RESOURCE_CORE_ACACIA_LOG,  null
    };

    public static final SlimefunItemStack TITANIUM_PICKAXE = new SlimefunItemStack("TOOLS_TITANIUM_PICKAXE",
            Material.DIAMOND_PICKAXE, "&f&lTitanium Pickaxe", "&f&lA Pickaxe of Titanium");
    public static final ItemStack[] RECIPE_TITANIUM_PICKAXE = {
            Components.TITANIUM_PLATE,   Components.TITANIUM_PLATE,        Components.TITANIUM_PLATE,
            null,   CoreNature.RESOURCE_CORE_SPRUCE_LOG,        null,
            null,   CoreNature.RESOURCE_CORE_SPRUCE_LOG,  null
    };

}
