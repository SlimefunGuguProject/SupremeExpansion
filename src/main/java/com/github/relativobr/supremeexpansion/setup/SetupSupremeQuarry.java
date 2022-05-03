package com.github.relativobr.supremeexpansion.setup;

import com.github.relativobr.supremeexpansion.Categories;
import com.github.relativobr.supremeexpansion.SupremeExpansion;
import com.github.relativobr.supremeexpansion.machine.AbstractQuarry;
import com.github.relativobr.supremeexpansion.machine.SupremeQuarry;
import com.github.relativobr.supremeexpansion.resource.SupremeComponents;
import com.github.relativobr.supremeexpansion.util.ItemUtil;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import javax.annotation.Nonnull;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class SetupSupremeQuarry {

  public static void setup(@Nonnull SupremeExpansion plugin) {

    boolean enableQuarry = SupremeExpansion.inst().getConfig().getBoolean("options.enable-quarry");

    if (enableQuarry) {

      boolean enableQuarryUniqueNuggets = SupremeExpansion.inst().getConfig()
          .getBoolean("options.enable-quarry-uniquenuggets");
      if (enableQuarryUniqueNuggets) {

        AbstractQuarry quarrySupremeNuggets = new AbstractQuarry(Categories.MACHINES_CATEGORY,
            SupremeQuarry.UNIQUENUGGETS_QUARRY, SupremeQuarry.MACHINE_SUPREMENUGGETS_QUARRY)
            .setOutput(new ItemStack[]{
                new SlimefunItemStack(SupremeComponents.SUPREME_NUGGET, 5),
                new ItemStack(Material.NETHERITE_BLOCK, 5),
                new ItemStack(Material.EMERALD_BLOCK, 10),
                new ItemStack(Material.DIAMOND_BLOCK, 10),
                new SlimefunItemStack(SupremeComponents.THORNIUM_BIT, 10),
                new ItemStack(Material.COAL_BLOCK, 20)
                , new ItemStack(Material.IRON_BLOCK, 20), new ItemStack(Material.GOLD_BLOCK, 20)})
            .setCapacity(1000)
            .setEnergyConsumption(10);
        ItemUtil.addLoreQuarry(SupremeQuarry.UNIQUENUGGETS_QUARRY, quarrySupremeNuggets.getOutput());
        quarrySupremeNuggets.register(plugin);

      }

      AbstractQuarry quarryThornium = new AbstractQuarry(Categories.MACHINES_CATEGORY,
          SupremeQuarry.THORNIUM_QUARRY, SupremeQuarry.MACHINE_THORNIUM_QUARRY)
          .setOutput(new ItemStack[]{
              new SlimefunItemStack(SupremeComponents.THORNIUM_BIT, 5),
              new ItemStack(Material.NETHERITE_INGOT, 5), new ItemStack(Material.IRON_BLOCK, 15),
              new ItemStack(Material.COAL_BLOCK, 15), new ItemStack(Material.LAPIS_BLOCK, 15),
              new ItemStack(Material.QUARTZ_BLOCK, 15),
              new ItemStack(Material.REDSTONE_BLOCK, 15), new ItemStack(Material.GOLD_BLOCK, 15)})
          .setCapacity(1000)
          .setEnergyConsumption(10);
      ItemUtil.addLoreQuarry(SupremeQuarry.THORNIUM_QUARRY, quarryThornium.getOutput());
      quarryThornium.register(plugin);

      AbstractQuarry quarryDiamond = new AbstractQuarry(Categories.MACHINES_CATEGORY,
          SupremeQuarry.DIAMOND_QUARRY, SupremeQuarry.MACHINE_DIAMOND_QUARRY)
          .setOutput(new ItemStack[]{
              new ItemStack(Material.DIAMOND, 20), new ItemStack(Material.EMERALD, 20),
              new ItemStack(Material.QUARTZ, 20),
              new ItemStack(Material.OBSIDIAN, 5), new ItemStack(Material.CRYING_OBSIDIAN, 5),
              new ItemStack(Material.END_STONE, 20),
              new ItemStack(Material.SEA_LANTERN, 5), new ItemStack(Material.BLACKSTONE, 5)})
          .setCapacity(1000)
          .setEnergyConsumption(10);
      ItemUtil.addLoreQuarry(SupremeQuarry.DIAMOND_QUARRY, quarryDiamond.getOutput());
      quarryDiamond.register(plugin);

      AbstractQuarry quarryGold = new AbstractQuarry(Categories.MACHINES_CATEGORY,
          SupremeQuarry.GOLD_QUARRY, SupremeQuarry.MACHINE_GOLD_QUARRY)
          .setOutput(new ItemStack[]{
              new ItemStack(Material.GOLD_INGOT, 20), new ItemStack(Material.GLOWSTONE_DUST, 5),
              new ItemStack(Material.LAPIS_LAZULI, 20),
              new ItemStack(Material.REDSTONE, 20),
              new SlimefunItemStack(SlimefunItems.SULFATE, 10),
              new SlimefunItemStack(SlimefunItems.OIL_BUCKET, 5),
              new ItemStack(Material.CLAY, 10), new ItemStack(Material.SNOW_BLOCK, 10)})
          .setCapacity(1000)
          .setEnergyConsumption(10);
      ItemUtil.addLoreQuarry(SupremeQuarry.GOLD_QUARRY, quarryGold.getOutput());
      quarryGold.register(plugin);

      AbstractQuarry quarryIron = new AbstractQuarry(Categories.MACHINES_CATEGORY,
          SupremeQuarry.IRON_QUARRY, SupremeQuarry.MACHINE_IRON_QUARRY)
          .setOutput(new ItemStack[]{
              new ItemStack(Material.IRON_INGOT, 20), new ItemStack(Material.ICE, 10),
              new ItemStack(Material.SAND, 10),
              new ItemStack(Material.GRANITE, 20), new ItemStack(Material.ANDESITE, 20),
              new ItemStack(Material.DIORITE, 20)})
          .setCapacity(1000)
          .setEnergyConsumption(10);
      ItemUtil.addLoreQuarry(SupremeQuarry.IRON_QUARRY, quarryIron.getOutput());
      quarryIron.register(plugin);

      AbstractQuarry quarryCoal = new AbstractQuarry(Categories.MACHINES_CATEGORY,
          SupremeQuarry.COAL_QUARRY, SupremeQuarry.MACHINE_COAL_QUARRY)
          .setOutput(new ItemStack[]{
              new ItemStack(Material.COAL, 20), new ItemStack(Material.MYCELIUM, 10),
              new ItemStack(Material.COBBLESTONE, 10),
              new ItemStack(Material.GRAVEL, 20), new ItemStack(Material.CLAY_BALL, 20),
              new ItemStack(Material.SNOWBALL, 20)})
          .setCapacity(1000)
          .setEnergyConsumption(10);
      ItemUtil.addLoreQuarry(SupremeQuarry.COAL_QUARRY, quarryCoal.getOutput());
      quarryCoal.register(plugin);

    }

  }


}