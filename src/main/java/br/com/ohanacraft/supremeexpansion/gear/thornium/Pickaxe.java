package br.com.ohanacraft.supremeexpansion.gear.thornium;

import br.com.ohanacraft.supremeexpansion.magical.Cetrus;
import br.com.ohanacraft.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class Pickaxe {


    public static final SlimefunItemStack THORNIUM_PICKAXE = new SlimefunItemStack("TOOLS_THORNIUM_PICKAXE",
            Material.NETHERITE_PICKAXE, "&f&lThornium Pickaxe", "&f&lA Pickaxe of Thornium");
    public static final ItemStack[] RECIPE_THORNIUM_PICKAXE = {
            Components.THORNIUM_INGOT,   Cetrus.CETRUS_IGNIS,        Components.THORNIUM_INGOT,
            null,   SlimefunItems.STAFF_ELEMENTAL,        null,
            null,   SlimefunItems.STAFF_ELEMENTAL,  null
    };

    public static final SlimefunItemStack THORNIUM_PICKAXE_MAGIC = new SlimefunItemStack("TOOLS_THORNIUM_PICKAXE_MAGIC",
            Material.NETHERITE_PICKAXE, "&a&lMagic Pickaxe", "&f&lA Magic Pickaxe of Thornium");

    public static final SlimefunItemStack THORNIUM_PICKAXE_RARE = new SlimefunItemStack("TOOLS_THORNIUM_PICKAXE_RARE",
            Material.NETHERITE_PICKAXE, "&b&lRare Pickaxe", "&f&lA Rare Pickaxe of Thornium");

    public static final SlimefunItemStack THORNIUM_PICKAXE_EPIC = new SlimefunItemStack("TOOLS_THORNIUM_PICKAXE_EPIC",
            Material.NETHERITE_PICKAXE, "&d&lEpic Pickaxe", "&f&lA Epic Pickaxe of Thornium");

    public static final SlimefunItemStack THORNIUM_PICKAXE_LEGENDARY = new SlimefunItemStack("TOOLS_THORNIUM_PICKAXE_LEGENDARY",
            Material.NETHERITE_PICKAXE, "&6&lLegendary Pickaxe", "&f&lA Legendary Pickaxe of Thornium");

    public static final SlimefunItemStack THORNIUM_PICKAXE_SUPREME = new SlimefunItemStack("TOOLS_THORNIUM_PICKAXE_SUPREME",
            Material.NETHERITE_PICKAXE, "&4&lSupreme Pickaxe", "&f&lA Supreme Pickaxe of Thornium");

}
