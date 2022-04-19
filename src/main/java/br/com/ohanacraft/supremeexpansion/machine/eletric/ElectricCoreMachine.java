package br.com.ohanacraft.supremeexpansion.machine.eletric;

import br.com.ohanacraft.supremeexpansion.core.CoreAlloy;
import br.com.ohanacraft.supremeexpansion.core.CoreBlock;
import br.com.ohanacraft.supremeexpansion.core.CoreColor;
import br.com.ohanacraft.supremeexpansion.core.CoreDeath;
import br.com.ohanacraft.supremeexpansion.core.CoreLife;
import br.com.ohanacraft.supremeexpansion.core.CoreNature;
import br.com.ohanacraft.supremeexpansion.machine.generic.MediumContainerMachine;
import br.com.ohanacraft.supremeexpansion.magical.Cetrus;
import br.com.ohanacraft.supremeexpansion.resource.Components;
import br.com.ohanacraft.supremeexpansion.util.CustomCoreRecipe;
import br.com.ohanacraft.supremeexpansion.util.Energy;
import br.com.ohanacraft.supremeexpansion.util.SimpleRecipe;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ElectricCoreMachine extends MediumContainerMachine {

  public static final SlimefunItemStack ELECTRIC_CORE_MACHINE = new SlimefunItemStack(
      "ELECTRIC_CORE_MACHINE",
      Material.SHROOMLIGHT, "&bElectric Core Machine",
      "", "&fCraft resource of core",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      Energy.energyPowerPerSecond(20));

  public static final ItemStack[] RECIPE_ELECTRIC_CORE_MACHINE = new ItemStack[]{
      Components.STAINLESS_MACHINE, SlimefunItems.PROGRAMMABLE_ANDROID_3,
      Components.STAINLESS_MACHINE,
      Components.INDUCTOR_MACHINE, Components.CRYSTALLIZER_MACHINE, Components.INDUCTOR_MACHINE,
      SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.CARBONADO_EDGED_CAPACITOR,
      SlimefunItems.ELECTRIC_MOTOR};

  public static final SlimefunItemStack ELECTRIC_CORE_MACHINE_II = new SlimefunItemStack(
      "ELECTRIC_CORE_MACHINE_II",
      Material.SHROOMLIGHT, "&bElectric Core Machine II",
      "", "&fAdvanced craft resource of core",
      "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
      Energy.energyPowerPerSecond(100));

  public static final ItemStack[] RECIPE_ELECTRIC_CORE_MACHINE_II = new ItemStack[]{
      Components.CONVEYANCE_MACHINE, Cetrus.CETRUS_LUX, Components.CONVEYANCE_MACHINE,
      Components.INDUCTOR_MACHINE, ElectricCoreMachine.ELECTRIC_CORE_MACHINE,
      Components.INDUCTOR_MACHINE,
      Components.BLEND_MACHINE, Cetrus.CETRUS_IGNIS, Components.BLEND_MACHINE};

  public static final SlimefunItemStack ELECTRIC_CORE_MACHINE_III = new SlimefunItemStack(
      "ELECTRIC_CORE_MACHINE_III",
      Material.SHROOMLIGHT, "&bElectric Core Machine III",
      "", "&fAdvanced craft resource of core",
      "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15),
      Energy.energyPowerPerSecond(300));

  public static final ItemStack[] RECIPE_ELECTRIC_CORE_MACHINE_III = new ItemStack[]{
      Components.THORNERITE, Cetrus.CETRUS_LUX, Components.THORNERITE,
      Components.SUPREME, ElectricCoreMachine.ELECTRIC_CORE_MACHINE_II, Components.SUPREME,
      Components.CRYSTALLIZER_MACHINE, Cetrus.CETRUS_LUMIUM, Components.CRYSTALLIZER_MACHINE};

  public ElectricCoreMachine(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
      ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<SimpleRecipe> getAllRecipe() {
    List<SimpleRecipe> list = new ArrayList<>();
    list.add(addRecipe(CoreBlock.RECIPE_RESOURCE_CORE_STONE));
    list.add(addRecipe(CoreBlock.RECIPE_RESOURCE_CORE_GRANITE));
    list.add(addRecipe(CoreBlock.RECIPE_RESOURCE_CORE_DIORITE));
    list.add(addRecipe(CoreBlock.RECIPE_RESOURCE_CORE_ANDESITE));
    list.add(addRecipe(CoreBlock.RECIPE_RESOURCE_CORE_GRAVEL));
    list.add(addRecipe(CoreBlock.RECIPE_RESOURCE_CORE_SAND));
    list.add(addRecipe(CoreBlock.RECIPE_RESOURCE_CORE_ENDSTONE));
    list.add(addRecipe(CoreBlock.RECIPE_RESOURCE_CORE_CLAY));
    list.add(addRecipe(CoreBlock.RECIPE_RESOURCE_CORE_SNOW));
    list.add(addRecipe(CoreColor.RECIPE_RESOURCE_CORE_RED));
    list.add(addRecipe(CoreColor.RECIPE_RESOURCE_CORE_YELLOW));
    list.add(addRecipe(CoreColor.RECIPE_RESOURCE_CORE_PURPLE));
    list.add(addRecipe(CoreColor.RECIPE_RESOURCE_CORE_BLUE));
    list.add(addRecipe(CoreColor.RECIPE_RESOURCE_CORE_BLACK));
    list.add(addRecipe(CoreColor.RECIPE_RESOURCE_CORE_GREEN));
    list.add(addRecipe(CoreColor.RECIPE_RESOURCE_CORE_PINK));
    list.add(addRecipe(CoreColor.RECIPE_RESOURCE_CORE_GRAY));
    list.add(addRecipe(CoreColor.RECIPE_RESOURCE_CORE_CYAN));
    list.add(addRecipe(CoreDeath.RECIPE_RESOURCE_CORE_PORKCHOP));
    list.add(addRecipe(CoreDeath.RECIPE_RESOURCE_CORE_BEEF));
    list.add(addRecipe(CoreDeath.RECIPE_RESOURCE_CORE_MUTTON));
    list.add(addRecipe(CoreDeath.RECIPE_RESOURCE_CORE_CHICKEN));
    list.add(addRecipe(CoreDeath.RECIPE_RESOURCE_CORE_SALMON));
    list.add(addRecipe(CoreDeath.RECIPE_RESOURCE_CORE_COD));
    list.add(addRecipe(CoreDeath.RECIPE_RESOURCE_CORE_STRING));
    list.add(addRecipe(CoreDeath.RECIPE_RESOURCE_CORE_SPIDER_EYE));
    list.add(addRecipe(CoreDeath.RECIPE_RESOURCE_CORE_TEAR));
    list.add(addRecipe(CoreLife.RECIPE_RESOURCE_CORE_POTATO));
    list.add(addRecipe(CoreLife.RECIPE_RESOURCE_CORE_APPLE));
    list.add(addRecipe(CoreLife.RECIPE_RESOURCE_CORE_BEETROOT));
    list.add(addRecipe(CoreLife.RECIPE_RESOURCE_CORE_WHEAT));
    list.add(addRecipe(CoreLife.RECIPE_RESOURCE_CORE_SUGAR_CANE));
    list.add(addRecipe(CoreLife.RECIPE_RESOURCE_CORE_SWEET_BERRIES));
    list.add(addRecipe(CoreLife.RECIPE_RESOURCE_CORE_MELON));
    list.add(addRecipe(CoreLife.RECIPE_RESOURCE_CORE_CARROT));
    list.add(addRecipe(CoreLife.RECIPE_RESOURCE_CORE_PUMPKIN));
    list.add(addRecipe(CoreNature.RECIPE_RESOURCE_CORE_OAK_LOG));
    list.add(addRecipe(CoreNature.RECIPE_RESOURCE_CORE_SPRUCE_LOG));
    list.add(addRecipe(CoreNature.RECIPE_RESOURCE_CORE_BIRCH_LOG));
    list.add(addRecipe(CoreNature.RECIPE_RESOURCE_CORE_JUNGLE_LOG));
    list.add(addRecipe(CoreNature.RECIPE_RESOURCE_CORE_ACACIA_LOG));
    list.add(addRecipe(CoreNature.RECIPE_RESOURCE_CORE_DARK_OAK_LOG));
    list.add(addRecipe(CoreNature.RECIPE_RESOURCE_CORE_CRIMSON_STEM));
    list.add(addRecipe(CoreNature.RECIPE_RESOURCE_CORE_WARPED_STEM));
    list.add(addRecipe(CoreNature.RECIPE_RESOURCE_CORE_WITHER_ROSE));
    list.add(addRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_COAL));
    list.add(addRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_IRON));
    list.add(addRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_GOLD));
    list.add(addRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_LAPIS));
    list.add(addRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_REDSTONE));
    list.add(addRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_QUARTZ));
    list.add(addRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_DIAMOND));
    list.add(addRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_EMERALD));
    list.add(addRecipe(CoreAlloy.RECIPE_RESOURCE_CORE_NETHERITE));
    return list;
  }

  private static SimpleRecipe addRecipe(CustomCoreRecipe customCoreRecipe) {
    final ItemStack itemStack1 = new ItemStack(customCoreRecipe.getMainItem(),
        customCoreRecipe.getMainItem().getMaxStackSize());
    final ItemStack itemStack2 = new ItemStack(customCoreRecipe.getSecondItem(),
        customCoreRecipe.getSecondItem().getMaxStackSize());
    final ItemStack itemStack3 = new ItemStack(customCoreRecipe.getLastItem(),
        customCoreRecipe.getLastItem().getMaxStackSize());
    return new SimpleRecipe(customCoreRecipe.getMaterial(),
        new ItemStack[]{
            itemStack1, itemStack1, itemStack1,
            itemStack2, itemStack2, itemStack2,
            itemStack3, itemStack3, itemStack3
        });
  }

}
