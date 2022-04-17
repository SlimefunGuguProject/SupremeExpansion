package br.com.ohanacraft.supremeexpansion.machine;

import br.com.ohanacraft.supremeexpansion.Categories;
import br.com.ohanacraft.supremeexpansion.SupremeExpansion;
import br.com.ohanacraft.supremeexpansion.machine.eletric.ElectricCoreMachine;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import javax.annotation.Nonnull;


public class SetupElectricMachine {


    public static void setup(@Nonnull SupremeExpansion plugin) {

        new ElectricCoreMachine(Categories.MACHINES_CATEGORY, ElectricCoreMachine.ELECTRIC_CORE_MACHINE, RecipeType.ENHANCED_CRAFTING_TABLE,
                ElectricCoreMachine.RECIPE_ELECTRIC_CORE_MACHINE)
                .setMachineIdentifier(ElectricCoreMachine.ELECTRIC_CORE_MACHINE.getItemId())
                .setMachineRecipes(ElectricCoreMachine.getAllRecipe())
                .setCapacity(40)
                .setEnergyConsumption(20)
                .setProcessingSpeed(1)
                .register(plugin);

        new ElectricCoreMachine(Categories.MACHINES_CATEGORY, ElectricCoreMachine.ELECTRIC_CORE_MACHINE_II, RecipeType.ENHANCED_CRAFTING_TABLE,
                ElectricCoreMachine.RECIPE_ELECTRIC_CORE_MACHINE_II)
                .setMachineIdentifier(ElectricCoreMachine.ELECTRIC_CORE_MACHINE_II.getItemId())
                .setMachineRecipes(ElectricCoreMachine.getAllRecipe())
                .setCapacity(200)
                .setEnergyConsumption(100)
                .setProcessingSpeed(5)
                .register(plugin);

        new ElectricCoreMachine(Categories.MACHINES_CATEGORY, ElectricCoreMachine.ELECTRIC_CORE_MACHINE_III, RecipeType.ENHANCED_CRAFTING_TABLE,
                ElectricCoreMachine.RECIPE_ELECTRIC_CORE_MACHINE_III)
                .setMachineIdentifier(ElectricCoreMachine.ELECTRIC_CORE_MACHINE_III.getItemId())
                .setMachineRecipes(ElectricCoreMachine.getAllRecipe())
                .setCapacity(600)
                .setEnergyConsumption(300)
                .setProcessingSpeed(15)
                .register(plugin);

    }

}