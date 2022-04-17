package br.com.ohanacraft.supremeexpansion.gear.basic;

import br.com.ohanacraft.supremeexpansion.resource.Components;
import br.com.ohanacraft.supremeexpansion.resource.CoreNature;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class BasicSword {

    public static final SlimefunItemStack ADAMANTIUM_SWORD = new SlimefunItemStack("WEAPONS_ADAMANTIUM_SWORD",
            Material.DIAMOND_SWORD, "&f&lAdamantium Sword", "&f&lA Sword of Adamantium");
    public static final ItemStack[] RECIPE_ADAMANTIUM_SWORD = {
            null,   Components.ADAMANTIUM_PLATE,        null,
            null,   Components.ADAMANTIUM_PLATE,        null,
            null,   CoreNature.RESOURCE_CORE_DARK_OAK_LOG,  null
    };

    public static final SlimefunItemStack AURUM_SWORD = new SlimefunItemStack("WEAPONS_AURUM_SWORD",
            Material.DIAMOND_SWORD, "&f&lAurum Sword", "&f&lA Sword of Aurum");
    public static final ItemStack[] RECIPE_AURUM_SWORD = {
            null,   Components.AURUM_PLATE,        null,
            null,   Components.AURUM_PLATE,        null,
            null,   CoreNature.RESOURCE_CORE_ACACIA_LOG,  null
    };

    public static final SlimefunItemStack TITANIUM_SWORD = new SlimefunItemStack("WEAPONS_TITANIUM_SWORD",
            Material.DIAMOND_SWORD, "&f&lTitanium Sword", "&f&lA Sword of Titanium");
    public static final ItemStack[] RECIPE_TITANIUM_SWORD = {
            null,   Components.TITANIUM_PLATE,        null,
            null,   Components.TITANIUM_PLATE,        null,
            null,   CoreNature.RESOURCE_CORE_SPRUCE_LOG,  null
    };

}
