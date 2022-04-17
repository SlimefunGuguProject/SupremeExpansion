package br.com.ohanacraft.supremeexpansion.machine.quarry;

import br.com.ohanacraft.supremeexpansion.core.SupremeCore;
import br.com.ohanacraft.supremeexpansion.magical.Cetrus;
import br.com.ohanacraft.supremeexpansion.resource.Components;
import br.com.ohanacraft.supremeexpansion.util.Energy;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class MachineQuarry {
    
    public static final SlimefunItemStack UNIQUENUGGETS_QUARRY = new SlimefunItemStack(
            "UNIQUENUGGETS_QUARRY",
            "ec7007d16abcfac9c6830c74d37cfd439a26373457d91452c1a96b8e04a6d",
            "&eNuggets of Supreme Quarry",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            Energy.energyPowerPerItem(10),
            Energy.energyBuffer(1000)
    );

    public static final SlimefunItemStack THORNIUM_QUARRY = new SlimefunItemStack(
            "THORNIUM_QUARRY",
            "6ddd4a12da1cc2c9f9d6cd49fc778e3a11f3757de6dd312d70a0d47885189c0",
            "&eThornium Quarry",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            Energy.energyPowerPerItem(10),
            Energy.energyBuffer(1000)
    );

    public static final SlimefunItemStack DIAMOND_QUARRY = new SlimefunItemStack(
            "DIAMOND_QUARRY",
            "666070ce03a545ee4d263bcf27f36338d249d7cb7a2376f92c1673ae134e04b6",
            "&eDiamond Quarry",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            Energy.energyPowerPerItem(10),
            Energy.energyBuffer(1000)
    );

    public static final SlimefunItemStack GOLD_QUARRY = new SlimefunItemStack(
            "GOLD_QUARRY",
            "6c07d48fd8764bc8d01a10cc6426578862090d9e856f3a8dd7f974a7521efc43",
            "&eGold Quarry",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            Energy.energyPowerPerItem(20),
            Energy.energyBuffer(10000)
    );

    public static final SlimefunItemStack IRON_QUARRY = new SlimefunItemStack(
            "IRON_QUARRY",
            "f8eecae423359d3f5efd1063a9a7bcfaa43839d75d3b223c808df7961dd173d0",
            "&eIron Quarry",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            Energy.energyPowerPerItem(20),
            Energy.energyBuffer(10000)
    );

    public static final SlimefunItemStack COAL_QUARRY = new SlimefunItemStack(
            "COAL_QUARRY",
            "579ee734b739c0d19546d5b4b049c01a055506cc00b0cfcbf177883d2c814c04",
            "&eCoal Quarry",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            Energy.energyPowerPerItem(20),
            Energy.energyBuffer(10000)
    );

    public static final ItemStack[] MACHINE_SUPREMENUGGETS_QUARRY = new ItemStack[] {
            new ItemStack(Cetrus.CETRUS_LUMIUM), new ItemStack(Components.THORNERITE), new ItemStack(Cetrus.CETRUS_LUMIUM),
            new ItemStack(SupremeCore.CORE_OF_NATURE), MachineQuarry.THORNIUM_QUARRY, new ItemStack(SupremeCore.CORE_OF_BLOCK),
            new ItemStack(SupremeCore.CORE_OF_LIFE), new ItemStack(SlimefunItems.NUCLEAR_REACTOR), new ItemStack(SupremeCore.CORE_OF_DEATH)};

    public static final ItemStack[] MACHINE_THORNIUM_QUARRY = new ItemStack[] {
            new ItemStack(Cetrus.CETRUS_LUMIUM), new ItemStack(Components.ALLOY_ADAMANTIUM), new ItemStack(Cetrus.CETRUS_LUMIUM),
            new ItemStack(Components.CRYSTALLIZER_MACHINE), MachineQuarry.DIAMOND_QUARRY, new ItemStack(Components.CRYSTALLIZER_MACHINE),
            new ItemStack(SlimefunItems.ELECTRIC_MOTOR), new ItemStack(SlimefunItems.WITHER_ASSEMBLER), new ItemStack(SlimefunItems.ELECTRIC_MOTOR)};

    public static final ItemStack[] MACHINE_DIAMOND_QUARRY = new ItemStack[] {
            new ItemStack(Cetrus.CETRUS_AQUA), new ItemStack(Components.ALLOY_TITANIUM), new ItemStack(Cetrus.CETRUS_AQUA),
            new ItemStack(Components.INDUCTOR_MACHINE), MachineQuarry.GOLD_QUARRY, new ItemStack(Components.INDUCTOR_MACHINE),
            new ItemStack(SlimefunItems.ELECTRIC_MOTOR), new ItemStack(SlimefunItems.HEATED_PRESSURE_CHAMBER), new ItemStack(SlimefunItems.ELECTRIC_MOTOR)};

    public static final ItemStack[] MACHINE_GOLD_QUARRY = new ItemStack[] {
            new ItemStack(Cetrus.CETRUS_LUX), new ItemStack(Components.ALLOY_AURUM),  new ItemStack(Cetrus.CETRUS_LUX),
            new ItemStack(Components.CONVEYANCE_MACHINE), MachineQuarry.IRON_QUARRY, new ItemStack(Components.CONVEYANCE_MACHINE),
            new ItemStack(SlimefunItems.ELECTRO_MAGNET), new ItemStack(SlimefunItems.ELECTRIC_SMELTERY), new ItemStack(SlimefunItems.ELECTRO_MAGNET)};

    public static final ItemStack[] MACHINE_IRON_QUARRY = new ItemStack[] {
            new ItemStack(Cetrus.CETRUS_VENTUS), new ItemStack(Components.ALLOY_IRIDIUM), new ItemStack(Cetrus.CETRUS_VENTUS),
            new ItemStack(Components.STAINLESS_MACHINE), MachineQuarry.COAL_QUARRY, new ItemStack(Components.STAINLESS_MACHINE),
            new ItemStack(SlimefunItems.ELECTRO_MAGNET), new ItemStack(SlimefunItems.IRON_GOLEM_ASSEMBLER), new ItemStack(SlimefunItems.ELECTRO_MAGNET)};

    public static final ItemStack[] MACHINE_COAL_QUARRY = new ItemStack[] {
            new ItemStack(Cetrus.CETRUS_IGNIS), new ItemStack(Components.ALLOY_PLATINUM), new ItemStack(Cetrus.CETRUS_IGNIS),
            new ItemStack(Material.DIAMOND_PICKAXE), new ItemStack(SlimefunItems.GEO_MINER), new ItemStack(Material.DIAMOND_PICKAXE),
            new ItemStack(SlimefunItems.COAL_GENERATOR), new ItemStack(SlimefunItems.CARBON_PRESS), new ItemStack(SlimefunItems.LARGE_CAPACITOR)};


}