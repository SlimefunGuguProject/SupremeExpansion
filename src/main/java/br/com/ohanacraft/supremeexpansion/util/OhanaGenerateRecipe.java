package br.com.ohanacraft.supremeexpansion.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bukkit.inventory.ItemStack;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class OhanaGenerateRecipe {

  private int tierDaMaquina;
  private ItemStack itemParaGerar;
  private ItemStack[] receitaDoItem;

  public int getTierDaMaquina() {
    return this.tierDaMaquina;
  }

  public ItemStack getItemParaGerar() {
    return this.itemParaGerar;
  }

  public ItemStack[] getReceitaDoItem() {
    return receitaDoItem;
  }

}