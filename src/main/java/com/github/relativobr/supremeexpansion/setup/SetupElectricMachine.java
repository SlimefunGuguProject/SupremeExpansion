package com.github.relativobr.supremeexpansion.setup;

import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.machine.ElectricCoreMachine;
import com.github.relativobr.supremeexpansion.util.ItemGroups;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class SetupElectricMachine {

    public static void setup(SupremeExpansion sup) {

        new ElectricCoreMachine(
            ItemGroups.MACHINES_CATEGORY,
            ElectricCoreMachine.ELECTRIC_CORE_MACHINE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ElectricCoreMachine.RECIPE_ELECTRIC_CORE_MACHINE)
            .setMachineIdentifier(ElectricCoreMachine.ELECTRIC_CORE_MACHINE.getItemId())
            .setMachineRecipes(ElectricCoreMachine.getAllRecipe())
            .setCapacity(40)
            .setEnergyConsumption(20)
            .setProcessingSpeed(1)
            .register(sup);

        new ElectricCoreMachine(
            ItemGroups.MACHINES_CATEGORY,
            ElectricCoreMachine.ELECTRIC_CORE_MACHINE_II,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ElectricCoreMachine.RECIPE_ELECTRIC_CORE_MACHINE_II)
            .setMachineIdentifier(ElectricCoreMachine.ELECTRIC_CORE_MACHINE_II.getItemId())
            .setMachineRecipes(ElectricCoreMachine.getAllRecipe())
            .setCapacity(200)
            .setEnergyConsumption(100)
            .setProcessingSpeed(5)
            .register(sup);

        new ElectricCoreMachine(
            ItemGroups.MACHINES_CATEGORY,
            ElectricCoreMachine.ELECTRIC_CORE_MACHINE_III,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            ElectricCoreMachine.RECIPE_ELECTRIC_CORE_MACHINE_III)
            .setMachineIdentifier(ElectricCoreMachine.ELECTRIC_CORE_MACHINE_III.getItemId())
            .setMachineRecipes(ElectricCoreMachine.getAllRecipe())
            .setCapacity(600)
            .setEnergyConsumption(300)
            .setProcessingSpeed(15)
            .register(sup);
    }
}
