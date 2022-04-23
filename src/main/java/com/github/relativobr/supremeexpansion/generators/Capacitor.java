package com.github.relativobr.supremeexpansion.generators;

import com.github.relativobr.supremeexpansion.core.CoreAlloy;
import com.github.relativobr.supremeexpansion.magical.Cetrus;
import com.github.relativobr.supremeexpansion.resource.Components;
import com.github.relativobr.supremeexpansion.util.Energy;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.inventory.ItemStack;

public class Capacitor {

  public static final int AURUM_CAPACITY = 1000000;
  public static final int TITANIUM_CAPACITY = 4000000;
  public static final int ADAMANTIUM_CAPACITY = 16000000;
  public static final int THORNIUM_CAPACITY = 100000000;
  public static final int SUPREME_CAPACITY = 1600000000; // infinity

  public static final SlimefunItemStack AURUM_CAPACITOR = new SlimefunItemStack("AURUM_CAPACITOR",
      "db2b1c052e84a4ad245a4d1ca5b10bd7f5249af0ca373f99174ce7990e597836", "&9金电容", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.CAPACITOR),
      Energy.energyCapacity(AURUM_CAPACITY));
  public static final ItemStack[] MACHINE_TITANIUM_CAPACITOR = new ItemStack[]{
      Components.TITANIUM_PLATE, AURUM_CAPACITOR, Components.TITANIUM_PLATE,
      Components.TITANIUM_PLATE, CoreAlloy.RESOURCE_CORE_REDSTONE, Components.TITANIUM_PLATE,
      Components.STAINLESS_MACHINE, AURUM_CAPACITOR, Components.STAINLESS_MACHINE
  };
  public static final ItemStack[] MACHINE_AURUM_CAPACITOR = new ItemStack[]{
      Components.AURUM_PLATE, SlimefunItems.ENERGIZED_CAPACITOR, Components.AURUM_PLATE,
      Components.AURUM_PLATE, CoreAlloy.RESOURCE_CORE_IRON, Components.AURUM_PLATE,
      Components.INDUCTOR_MACHINE, SlimefunItems.ENERGIZED_CAPACITOR, Components.INDUCTOR_MACHINE
  };
  public static final SlimefunItemStack TITANIUM_CAPACITOR = new SlimefunItemStack(
      "TITANIUM_CAPACITOR",
      "b30ad864b265ab178a03e27fc249a1e32941e007486febd0059e4e3b76c11958", "&9钛电容",
      "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.CAPACITOR),
      Energy.energyCapacity(TITANIUM_CAPACITY));
  public static final ItemStack[] MACHINE_ADAMANTIUM_CAPACITOR = new ItemStack[]{
      Components.ADAMANTIUM_PLATE, TITANIUM_CAPACITOR, Components.ADAMANTIUM_PLATE,
      Components.ADAMANTIUM_PLATE, CoreAlloy.RESOURCE_CORE_EMERALD, Components.ADAMANTIUM_PLATE,
      Components.CONVEYANCE_MACHINE, TITANIUM_CAPACITOR, Components.CONVEYANCE_MACHINE
  };
  public static final SlimefunItemStack ADAMANTIUM_CAPACITOR = new SlimefunItemStack(
      "ADAMANTIUM_CAPACITOR",
      "9ac52419b99025828c89fa825945e6948e45bb5a22e4425a59e9096e4c1ac38", "&9精金电容",
      "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.CAPACITOR),
      Energy.energyCapacity(ADAMANTIUM_CAPACITY));
  public static final ItemStack[] MACHINE_THORNIUM_CAPACITOR = new ItemStack[]{
      Components.THORNIUM_ENERGIZED, ADAMANTIUM_CAPACITOR, Components.THORNIUM_ENERGIZED,
      Components.THORNIUM_ENERGIZED, Cetrus.CETRUS_LUMIUM, Components.THORNIUM_ENERGIZED,
      Components.CRYSTALLIZER_MACHINE, ADAMANTIUM_CAPACITOR, Components.CRYSTALLIZER_MACHINE
  };
  public static final SlimefunItemStack THORNIUM_CAPACITOR = new SlimefunItemStack(
      "THORNIUM_CAPACITOR",
      "9aab01a5d9512e3175bf3af2edbfd59419dc5662605c42c91730e711254efcc4", "&9钍电容",
      "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR),
      Energy.energyCapacity(THORNIUM_CAPACITY));
  public static final ItemStack[] MACHINE_SUPREME_CAPACITOR = new ItemStack[]{
      Components.SUPREME, THORNIUM_CAPACITOR, Components.SUPREME,
      Components.SUPREME, Cetrus.CETRUS_LUMIUM, Components.SUPREME,
      Components.THORNERITE, THORNIUM_CAPACITOR, Components.THORNERITE
  };
  public static final SlimefunItemStack SUPREME_CAPACITOR = new SlimefunItemStack(
      "SUPREME_CAPACITOR",
      "77400ea19dbd84f75c39ad6823ac4ef786f39f48fc6f84602366ac29b837422", "&9至尊电容",
      "&c&o切勿在多个能源网中使用",
      "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR),
      Energy.energyCapacity(null));


}
