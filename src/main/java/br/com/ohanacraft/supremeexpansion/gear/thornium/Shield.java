package br.com.ohanacraft.supremeexpansion.gear.thornium;

import br.com.ohanacraft.supremeexpansion.magical.Cetrus;
import br.com.ohanacraft.supremeexpansion.resource.Components;
import br.com.ohanacraft.supremeexpansion.resource.CoreNature;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class Shield {

    public static final SlimefunItemStack THORNIUM_SHIELD = new SlimefunItemStack("WEAPONS_THORNIUM_SHIELD",
            Material.SHIELD, "&f&lThornium Shield", "&f&lA Shield of Thornium");
    public static final ItemStack[] RECIPE_THORNIUM_SHIELD = {
            CoreNature.RESOURCE_CORE_OAK_LOG, Components.THORNIUM_INGOT, CoreNature.RESOURCE_CORE_OAK_LOG,
            CoreNature.RESOURCE_CORE_OAK_LOG, Cetrus.CETRUS_LUX,       CoreNature.RESOURCE_CORE_OAK_LOG,
            null,        CoreNature.RESOURCE_CORE_OAK_LOG,        null
    };

    public static final SlimefunItemStack THORNIUM_SHIELD_MAGIC = new SlimefunItemStack("WEAPONS_THORNIUM_SHIELD_MAGIC",
            Material.SHIELD, "&a&lMagic Shield", "&f&lA Magic Shield of Thornium");

    public static final SlimefunItemStack THORNIUM_SHIELD_RARE = new SlimefunItemStack("WEAPONS_THORNIUM_SHIELD_RARE",
            Material.SHIELD, "&b&lRare Shield", "&f&lA Rare Shield of Thornium");

    public static final SlimefunItemStack THORNIUM_SHIELD_EPIC = new SlimefunItemStack("WEAPONS_THORNIUM_SHIELD_EPIC",
            Material.SHIELD, "&d&lEpic Shield", "&f&lA Epic Shield of Thornium");

    public static final SlimefunItemStack THORNIUM_SHIELD_LEGENDARY = new SlimefunItemStack("WEAPONS_THORNIUM_SHIELD_LEGENDARY",
            Material.SHIELD, "&6&lLegendary Shield", "&f&lA Legendary Shield of Thornium");

    public static final SlimefunItemStack THORNIUM_SHIELD_SUPREME = new SlimefunItemStack("WEAPONS_THORNIUM_SHIELD_SUPREME",
            Material.SHIELD, "&4&lSupreme Shield", "&f&lA Supreme Shield of Thornium");

}
