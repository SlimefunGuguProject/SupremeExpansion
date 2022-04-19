package br.com.ohanacraft.supremeexpansion.util;

import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.inventory.ItemStack;

public class AquariumMachine extends MachineRecipe {

  @ParametersAreNonnullByDefault
  public AquariumMachine(ItemStack input, ItemStack[] result) {
    super(15, new ItemStack[]{input}, result);
  }

}
