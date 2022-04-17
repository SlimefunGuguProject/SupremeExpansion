package br.com.ohanacraft.supremeexpansion.machine;

import br.com.ohanacraft.supremeexpansion.Categories;
import br.com.ohanacraft.supremeexpansion.SupremeExpansion;
import br.com.ohanacraft.supremeexpansion.machine.quarry.BasicQuarry;
import br.com.ohanacraft.supremeexpansion.machine.quarry.MachineQuarry;
import br.com.ohanacraft.supremeexpansion.resource.Components;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import javax.annotation.Nonnull;

public class SetupQuarry {

    public static void setup(@Nonnull SupremeExpansion plugin) {

        boolean enableQuarry = SupremeExpansion.inst().getConfig().getBoolean("options.enable-quarry");

        if(enableQuarry){

            boolean enableQuarryUniqueNuggets = SupremeExpansion.inst().getConfig().getBoolean("options.enable-quarry-uniquenuggets");
            if(enableQuarryUniqueNuggets){

                BasicQuarry quarrySupremeNuggets = new BasicQuarry(Categories.MACHINES_CATEGORY,
                        MachineQuarry.UNIQUENUGGETS_QUARRY, MachineQuarry.MACHINE_SUPREMENUGGETS_QUARRY)
                        .setOutput(new ItemStack[] {
                                new SlimefunItemStack(Components.SUPREME_NUGGET, 20), new ItemStack(Material.NETHERITE_BLOCK, 20), new ItemStack(Material.EMERALD_BLOCK, 20),
                                new ItemStack(Material.DIAMOND_BLOCK, 20), new SlimefunItemStack(Components.THORNIUM_BIT, 20)})
                        .setCapacity(1000)
                        .setEnergyConsumption(10);
                plugin.addLoreQuarry(MachineQuarry.UNIQUENUGGETS_QUARRY, quarrySupremeNuggets.getOutput());
                quarrySupremeNuggets.register(plugin);

            }

            BasicQuarry quarryThornium = new BasicQuarry(Categories.MACHINES_CATEGORY,
                    MachineQuarry.THORNIUM_QUARRY, MachineQuarry.MACHINE_THORNIUM_QUARRY)
                    .setOutput(new ItemStack[] {
                            new SlimefunItemStack(Components.THORNIUM_BIT, 10), new ItemStack(Material.NETHERITE_INGOT, 10), new ItemStack(Material.IRON_BLOCK, 10),
                            new ItemStack(Material.COAL_BLOCK, 15), new ItemStack(Material.LAPIS_BLOCK, 15), new ItemStack(Material.QUARTZ_BLOCK, 15),
                            new ItemStack(Material.REDSTONE_BLOCK, 15), new ItemStack(Material.GOLD_BLOCK, 10)})
                    .setCapacity(1000)
                    .setEnergyConsumption(10);
            plugin.addLoreQuarry(MachineQuarry.THORNIUM_QUARRY, quarryThornium.getOutput());
            quarryThornium.register(plugin);

            BasicQuarry quarryDiamond = new BasicQuarry(Categories.MACHINES_CATEGORY,
                    MachineQuarry.DIAMOND_QUARRY, MachineQuarry.MACHINE_DIAMOND_QUARRY)
                    .setOutput(new ItemStack[] {
                            new ItemStack(Material.DIAMOND, 20), new ItemStack(Material.EMERALD, 20), new ItemStack(Material.QUARTZ, 20),
                            new ItemStack(Material.OBSIDIAN, 5), new ItemStack(Material.CRYING_OBSIDIAN, 5), new ItemStack(Material.END_STONE, 20),
                            new ItemStack(Material.SEA_LANTERN, 5), new ItemStack(Material.BLACKSTONE, 5)})
                    .setCapacity(1000)
                    .setEnergyConsumption(10);
            plugin.addLoreQuarry(MachineQuarry.DIAMOND_QUARRY, quarryDiamond.getOutput());
            quarryDiamond.register(plugin);

            BasicQuarry quarryGold = new BasicQuarry(Categories.MACHINES_CATEGORY,
                    MachineQuarry.GOLD_QUARRY, MachineQuarry.MACHINE_GOLD_QUARRY)
                    .setOutput(new ItemStack[] {
                            new ItemStack(Material.GOLD_INGOT, 20), new ItemStack(Material.GLOWSTONE_DUST, 5), new ItemStack(Material.LAPIS_LAZULI, 20),
                            new ItemStack(Material.REDSTONE, 20), new SlimefunItemStack(SlimefunItems.SULFATE, 10), new SlimefunItemStack(SlimefunItems.OIL_BUCKET, 5),
                            new ItemStack(Material.CLAY, 10), new ItemStack(Material.SNOW_BLOCK, 10)})
                    .setCapacity(1000)
                    .setEnergyConsumption(10);
            plugin.addLoreQuarry(MachineQuarry.GOLD_QUARRY, quarryGold.getOutput());
            quarryGold.register(plugin);

            BasicQuarry quarryIron = new BasicQuarry(Categories.MACHINES_CATEGORY,
                    MachineQuarry.IRON_QUARRY, MachineQuarry.MACHINE_IRON_QUARRY)
                    .setOutput(new ItemStack[] {
                            new ItemStack(Material.IRON_INGOT, 20), new ItemStack(Material.ICE, 10), new ItemStack(Material.SAND, 10),
                            new ItemStack(Material.GRANITE,20), new ItemStack(Material.ANDESITE, 20), new ItemStack(Material.DIORITE, 20)})
                    .setCapacity(1000)
                    .setEnergyConsumption(10);
            plugin.addLoreQuarry(MachineQuarry.IRON_QUARRY, quarryIron.getOutput());
            quarryIron.register(plugin);

            BasicQuarry quarryCoal = new BasicQuarry(Categories.MACHINES_CATEGORY,
                    MachineQuarry.COAL_QUARRY, MachineQuarry.MACHINE_COAL_QUARRY)
                    .setOutput(new ItemStack[] {
                            new ItemStack(Material.COAL, 20), new ItemStack(Material.MYCELIUM, 10), new ItemStack(Material.COBBLESTONE, 10),
                            new ItemStack(Material.GRAVEL, 20), new ItemStack(Material.CLAY_BALL, 20), new ItemStack(Material.SNOWBALL, 20)})
                    .setCapacity(1000)
                    .setEnergyConsumption(10);
            plugin.addLoreQuarry(MachineQuarry.COAL_QUARRY, quarryCoal.getOutput());
            quarryCoal.register(plugin);

        }

    }


}