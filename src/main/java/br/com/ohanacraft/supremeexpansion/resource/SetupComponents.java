package br.com.ohanacraft.supremeexpansion.resource;

import br.com.ohanacraft.supremeexpansion.Categories;
import br.com.ohanacraft.supremeexpansion.SupremeExpansion;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;
import javax.annotation.Nonnull;

public class SetupComponents {


    public static void setup(@Nonnull SupremeExpansion plugin) {

        registerSmeltery(plugin, Components.ALLOY_ZIRCONIUM, Components.RECIPE_ALLOY_ZIRCONIUM);
        registerSmeltery(plugin, Components.ALLOY_TITANIUM, Components.RECIPE_ALLOY_TITANIUM);
        registerSmeltery(plugin, Components.ALLOY_IRIDIUM, Components.RECIPE_ALLOY_IRIDIUM);
        registerSmeltery(plugin, Components.ALLOY_AURUM, Components.RECIPE_ALLOY_AURUM);
        registerSmeltery(plugin, Components.ALLOY_MANGANESE, Components.RECIPE_ALLOY_MANGANESE);
        registerSmeltery(plugin, Components.ALLOY_PLATINUM, Components.RECIPE_ALLOY_PLATINUM);
        registerSmeltery(plugin, Components.ALLOY_ADAMANTIUM, Components.RECIPE_ALLOY_ADAMANTIUM);

        registerEnhancedCraft(plugin, Components.ZIRCONIUM_PLATE, Components.RECIPE_ZIRCONIUM_PLATE);
        registerEnhancedCraft(plugin, Components.TITANIUM_PLATE, Components.RECIPE_TITANIUM_PLATE);
        registerEnhancedCraft(plugin, Components.IRIDIUM_PLATE, Components.RECIPE_IRIDIUM_PLATE);
        registerEnhancedCraft(plugin, Components.AURUM_PLATE, Components.RECIPE_AURUM_PLATE);
        registerEnhancedCraft(plugin, Components.MANGANESE_PLATE, Components.RECIPE_MANGANESE_PLATE);
        registerEnhancedCraft(plugin, Components.PLATINUM_PLATE, Components.RECIPE_PLATINUM_PLATE);
        registerEnhancedCraft(plugin, Components.ADAMANTIUM_PLATE, Components.RECIPE_ADAMANTIUM_PLATE);

        registerEnhancedCraft(plugin, Components.THORNIUM_BIT, Components.RECIPE_THORNIUM_BIT);
        registerEnhancedCraft(plugin, Components.THORNIUM_DUST, Components.RECIPE_THORNIUM_DUST);
        registerEnhancedCraft(plugin, Components.THORNIUM_INGOT, Components.RECIPE_THORNIUM_INGOT);
        registerEnhancedCraft(plugin, Components.THORNIUM_BIT_SYNTHETIC, Components.RECIPE_THORNIUM_BIT_SYNTHETIC);
        registerEnhancedCraft(plugin, Components.THORNIUM_DUST_SYNTHETIC, Components.RECIPE_THORNIUM_DUST_SYNTHETIC);
        registerEnhancedCraft(plugin, Components.THORNIUM_INGOT_SYNTHETIC, Components.RECIPE_THORNIUM_INGOT_SYNTHETIC);
        registerEnhancedCraft(plugin, Components.THORNIUM_CARBONADO, Components.RECIPE_THORNIUM_CARBONADO);
        registerEnhancedCraft(plugin, Components.THORNIUM_ENERGIZED, Components.RECIPE_THORNIUM_ENERGIZED);

        registerSmeltery(plugin, Components.THORNERITE, Components.RECIPE_THORNERITE);

        registerEnhancedCraft(plugin, Components.SUPREME_NUGGET, Components.RECIPE_SUPREME_NUGGET);
        registerEnhancedCraft(plugin, Components.SUPREME, Components.RECIPE_SUPREME);

        registerEnhancedCraft(plugin, Components.INDUCTOR_MACHINE, Components.RECIPE_INDUCTOR_MACHINE);
        registerEnhancedCraft(plugin, Components.STAINLESS_MACHINE, Components.RECIPE_STAINLESS_MACHINE);
        registerEnhancedCraft(plugin, Components.CONVEYANCE_MACHINE, Components.RECIPE_CONVEYANCE_MACHINE);
        registerEnhancedCraft(plugin, Components.CRYSTALLIZER_MACHINE, Components.RECIPE_CRYSTALLIZER_MACHINE);
        registerEnhancedCraft(plugin, Components.BLEND_MACHINE, Components.RECIPE_BLEND_MACHINE);

    }

    private static void registerSmeltery(SupremeExpansion plugin, SlimefunItemStack itemStack, ItemStack[] recipe) {
        new SlimefunItem(Categories.RESOURCE_CATEGORY, itemStack, RecipeType.SMELTERY, recipe).register(plugin);
    }

    private static void registerEnhancedCraft(SupremeExpansion plugin, SlimefunItemStack itemStack, ItemStack[] recipe) {
        new SlimefunItem(Categories.RESOURCE_CATEGORY, itemStack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe).register(plugin);
    }

}
