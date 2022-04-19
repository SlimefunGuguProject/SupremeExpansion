package br.com.ohanacraft.supremeexpansion.generators;

import br.com.ohanacraft.supremeexpansion.SupremeExpansion;
import javax.annotation.Nonnull;

public class SetupCapacitor {

  public static void setup(@Nonnull SupremeExpansion plugin) {

    final EnergyCapacitor itemAurunCapacity = new EnergyCapacitor(Capacitor.AURUM_CAPACITOR,
        Capacitor.MACHINE_AURUM_CAPACITOR, Capacitor.AURUM_CAPACITY);
    itemAurunCapacity.register(plugin);
    final EnergyCapacitor itemTitaniumCapacity = new EnergyCapacitor(Capacitor.TITANIUM_CAPACITOR,
        Capacitor.MACHINE_TITANIUM_CAPACITOR, Capacitor.TITANIUM_CAPACITY);
    itemTitaniumCapacity.register(plugin);
    final EnergyCapacitor itemAdamantiumCapacity = new EnergyCapacitor(
        Capacitor.ADAMANTIUM_CAPACITOR, Capacitor.MACHINE_ADAMANTIUM_CAPACITOR,
        Capacitor.ADAMANTIUM_CAPACITY);
    itemAdamantiumCapacity.register(plugin);
    final EnergyCapacitor itemThorniumCapacity = new EnergyCapacitor(Capacitor.THORNIUM_CAPACITOR,
        Capacitor.MACHINE_THORNIUM_CAPACITOR, Capacitor.THORNIUM_CAPACITY);
    itemThorniumCapacity.register(plugin);
    final EnergyCapacitor itemSupremeCapacity = new EnergyCapacitor(Capacitor.SUPREME_CAPACITOR,
        Capacitor.MACHINE_SUPREME_CAPACITOR, Capacitor.SUPREME_CAPACITY);
    itemSupremeCapacity.register(plugin);

  }

}
