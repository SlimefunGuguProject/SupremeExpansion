package br.com.ohanacraft.supremeexpansion.gear.thornium;

import br.com.ohanacraft.supremeexpansion.magical.Cetrus;
import br.com.ohanacraft.supremeexpansion.resource.Components;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class Sword {


    public static final SlimefunItemStack THORNIUM_SWORD = new SlimefunItemStack("WEAPONS_THORNIUM_SWORD",
            Material.NETHERITE_SWORD, "&f&lThornium Sword", "&f&lA Sword of Thornium");
    public static final ItemStack[] RECIPE_THORNIUM_SWORD = {
            null,   Components.THORNIUM_INGOT,        null,
            null,   Components.THORNIUM_INGOT,        null,
            null,   Cetrus.CETRUS_LUMIUM,  null
    };

    public static final SlimefunItemStack THORNIUM_SWORD_MAGIC = new SlimefunItemStack("WEAPONS_THORNIUM_SWORD_MAGIC",
            Material.NETHERITE_SWORD, "&a&lMagic Sword", "&f&lA Magic Sword of Thornium");

    public static final SlimefunItemStack THORNIUM_SWORD_RARE = new SlimefunItemStack("WEAPONS_THORNIUM_SWORD_RARE",
            Material.NETHERITE_SWORD, "&b&lRare Sword", "&f&lA Rare Sword of Thornium");

    public static final SlimefunItemStack THORNIUM_SWORD_EPIC = new SlimefunItemStack("WEAPONS_THORNIUM_SWORD_EPIC",
            Material.NETHERITE_SWORD, "&d&lEpic Sword", "&f&lA Epic Sword of Thornium");

    public static final SlimefunItemStack THORNIUM_SWORD_LEGENDARY = new SlimefunItemStack("WEAPONS_THORNIUM_SWORD_LEGENDARY",
            Material.NETHERITE_SWORD, "&6&lLegendary Sword", "&f&lA Legendary Sword of Thornium");

    public static final SlimefunItemStack THORNIUM_SWORD_SUPREME = new SlimefunItemStack("WEAPONS_THORNIUM_SWORD_SUPREME",
            Material.NETHERITE_SWORD, "&4&lSupreme Sword", "&f&lA Supreme Sword of Thornium");

}
