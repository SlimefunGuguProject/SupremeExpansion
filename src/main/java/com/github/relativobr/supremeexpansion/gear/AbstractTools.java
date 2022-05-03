package com.github.relativobr.supremeexpansion.gear;

import com.github.relativobr.supremeexpansion.Categories;
import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.machine.MultiBlockGearFabricator;
import com.github.relativobr.supremeexpansion.util.ItemTier;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;
import javax.annotation.Nonnull;
import org.bukkit.inventory.ItemStack;


public class AbstractTools extends SlimefunItem implements Soulbound, NotPlaceable {


  private AbstractTools(@Nonnull SlimefunItemStack stack, ItemStack[] recipe) {
    super(Categories.TOOLS_CATEGORY, stack, MultiBlockGearFabricator.getMachine(), recipe);
  }

  public static void setup(SupremeExpansion plugin) {

    // add Enchant
    plugin.addGearEnchants(ToolsBasic.TITANIUM_PICKAXE,
        ToolsBasic.AURUM_PICKAXE,
        ToolsBasic.ADAMANTIUM_PICKAXE,
        ToolsBasic.TITANIUM_AXE,
        ToolsBasic.AURUM_AXE,
        ToolsBasic.ADAMANTIUM_AXE,
        ToolsBasic.TITANIUM_SHOVEL,
        ToolsBasic.AURUM_SHOVEL,
        ToolsBasic.ADAMANTIUM_SHOVEL
    );

    // add Enchant
    plugin.addSupremeEnchantsAndSoulbound(ToolsThornium.THORNIUM_AXE,
        ToolsThornium.THORNIUM_AXE_MAGIC,
        ToolsThornium.THORNIUM_AXE_RARE,
        ToolsThornium.THORNIUM_AXE_EPIC, ToolsThornium.THORNIUM_AXE_LEGENDARY,
        ToolsThornium.THORNIUM_AXE_SUPREME,
        ToolsThornium.THORNIUM_PICKAXE, ToolsThornium.THORNIUM_PICKAXE_MAGIC,
        ToolsThornium.THORNIUM_PICKAXE_RARE,
        ToolsThornium.THORNIUM_PICKAXE_EPIC, ToolsThornium.THORNIUM_PICKAXE_LEGENDARY,
        ToolsThornium.THORNIUM_PICKAXE_SUPREME,
        ToolsThornium.THORNIUM_SHOVEL, ToolsThornium.THORNIUM_SHOVEL_MAGIC,
        ToolsThornium.THORNIUM_SHOVEL_RARE,
        ToolsThornium.THORNIUM_SHOVEL_EPIC, ToolsThornium.THORNIUM_SHOVEL_LEGENDARY,
        ToolsThornium.THORNIUM_SHOVEL_SUPREME
    );

    final AbstractTools titaniumAxe = new AbstractTools(ToolsBasic.TITANIUM_AXE, ToolsBasic.RECIPE_TITANIUM_AXE);
    titaniumAxe.register(plugin);
    final AbstractTools aurumAxe = new AbstractTools(ToolsBasic.AURUM_AXE, ToolsBasic.RECIPE_AURUM_AXE);
    aurumAxe.register(plugin);
    final AbstractTools adamantiumAxe = new AbstractTools(ToolsBasic.ADAMANTIUM_AXE,
        ToolsBasic.RECIPE_ADAMANTIUM_AXE);
    adamantiumAxe.register(plugin);
    final AbstractTools axe = new AbstractTools(ToolsThornium.THORNIUM_AXE, ToolsThornium.RECIPE_THORNIUM_AXE);
    axe.register(plugin);
    final AbstractTools axeMagic = new AbstractTools(ToolsThornium.THORNIUM_AXE_MAGIC,
        ItemTier.getMagic(ToolsThornium.THORNIUM_AXE));
    axeMagic.register(plugin);
    final AbstractTools axeRare = new AbstractTools(ToolsThornium.THORNIUM_AXE_RARE,
        ItemTier.getRare(ToolsThornium.THORNIUM_AXE_MAGIC));
    axeRare.register(plugin);
    final AbstractTools axeEpic = new AbstractTools(ToolsThornium.THORNIUM_AXE_EPIC,
        ItemTier.getEpic(ToolsThornium.THORNIUM_AXE_RARE));
    axeEpic.register(plugin);
    final AbstractTools axeLegendary = new AbstractTools(ToolsThornium.THORNIUM_AXE_LEGENDARY,
        ItemTier.getLegendary(ToolsThornium.THORNIUM_AXE_EPIC));
    axeLegendary.register(plugin);
    final AbstractTools axeSupreme = new AbstractTools(ToolsThornium.THORNIUM_AXE_SUPREME,
        ItemTier.getSupreme(ToolsThornium.THORNIUM_AXE_LEGENDARY));
    axeSupreme.register(plugin);

    final AbstractTools titaniumPickaxe = new AbstractTools(ToolsBasic.TITANIUM_PICKAXE,
        ToolsBasic.RECIPE_TITANIUM_PICKAXE);
    titaniumPickaxe.register(plugin);
    final AbstractTools aurumPickaxe = new AbstractTools(ToolsBasic.AURUM_PICKAXE,
        ToolsBasic.RECIPE_AURUM_PICKAXE);
    aurumPickaxe.register(plugin);
    final AbstractTools adamantiumPickaxe = new AbstractTools(ToolsBasic.ADAMANTIUM_PICKAXE,
        ToolsBasic.RECIPE_ADAMANTIUM_PICKAXE);
    adamantiumPickaxe.register(plugin);
    final AbstractTools pickaxe = new AbstractTools(ToolsThornium.THORNIUM_PICKAXE,
        ToolsThornium.RECIPE_THORNIUM_PICKAXE);
    pickaxe.register(plugin);
    final AbstractTools pickaxeMagic = new AbstractTools(ToolsThornium.THORNIUM_PICKAXE_MAGIC,
        ItemTier.getMagic(ToolsThornium.THORNIUM_PICKAXE));
    pickaxeMagic.register(plugin);
    final AbstractTools pickaxeRare = new AbstractTools(ToolsThornium.THORNIUM_PICKAXE_RARE,
        ItemTier.getRare(ToolsThornium.THORNIUM_PICKAXE_MAGIC));
    pickaxeRare.register(plugin);
    final AbstractTools pickaxeEpic = new AbstractTools(ToolsThornium.THORNIUM_PICKAXE_EPIC,
        ItemTier.getEpic(ToolsThornium.THORNIUM_PICKAXE_RARE));
    pickaxeEpic.register(plugin);
    final AbstractTools pickaxeLegendary = new AbstractTools(ToolsThornium.THORNIUM_PICKAXE_LEGENDARY,
        ItemTier.getLegendary(ToolsThornium.THORNIUM_PICKAXE_EPIC));
    pickaxeLegendary.register(plugin);
    final AbstractTools pickaxeSupreme = new AbstractTools(ToolsThornium.THORNIUM_PICKAXE_SUPREME,
        ItemTier.getSupreme(ToolsThornium.THORNIUM_PICKAXE_LEGENDARY));
    pickaxeSupreme.register(plugin);

    final AbstractTools titaniumShovel = new AbstractTools(ToolsBasic.TITANIUM_SHOVEL,
        ToolsBasic.RECIPE_TITANIUM_SHOVEL);
    titaniumShovel.register(plugin);
    final AbstractTools aurumShovel = new AbstractTools(ToolsBasic.AURUM_SHOVEL, ToolsBasic.RECIPE_AURUM_SHOVEL);
    aurumShovel.register(plugin);
    final AbstractTools adamantiumShovel = new AbstractTools(ToolsBasic.ADAMANTIUM_SHOVEL,
        ToolsBasic.RECIPE_ADAMANTIUM_SHOVEL);
    adamantiumShovel.register(plugin);
    final AbstractTools shovel = new AbstractTools(ToolsThornium.THORNIUM_SHOVEL,
        ToolsThornium.RECIPE_THORNIUM_SHOVEL);
    shovel.register(plugin);
    final AbstractTools shovelMagic = new AbstractTools(ToolsThornium.THORNIUM_SHOVEL_MAGIC,
        ItemTier.getMagic(ToolsThornium.THORNIUM_SHOVEL));
    shovelMagic.register(plugin);
    final AbstractTools shovelRare = new AbstractTools(ToolsThornium.THORNIUM_SHOVEL_RARE,
        ItemTier.getRare(ToolsThornium.THORNIUM_SHOVEL_MAGIC));
    shovelRare.register(plugin);
    final AbstractTools shovelEpic = new AbstractTools(ToolsThornium.THORNIUM_SHOVEL_EPIC,
        ItemTier.getEpic(ToolsThornium.THORNIUM_SHOVEL_RARE));
    shovelEpic.register(plugin);
    final AbstractTools shovelLegendary = new AbstractTools(ToolsThornium.THORNIUM_SHOVEL_LEGENDARY,
        ItemTier.getLegendary(ToolsThornium.THORNIUM_SHOVEL_EPIC));
    shovelLegendary.register(plugin);
    final AbstractTools shovelSupreme = new AbstractTools(ToolsThornium.THORNIUM_SHOVEL_SUPREME,
        ItemTier.getSupreme(ToolsThornium.THORNIUM_SHOVEL_LEGENDARY));
    shovelSupreme.register(plugin);

  }

}
