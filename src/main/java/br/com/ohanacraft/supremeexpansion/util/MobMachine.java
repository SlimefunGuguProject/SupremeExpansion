package br.com.ohanacraft.supremeexpansion.util;

import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.apache.commons.lang.Validate;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class MobMachine extends MachineRecipe implements Predicate<LivingEntity> {

  private final Predicate<LivingEntity> predicate;

  @ParametersAreNonnullByDefault
  public MobMachine(ItemStack input, ItemStack result, Predicate<LivingEntity> predicate) {
    super(15, new ItemStack[]{input}, new ItemStack[]{result});
    Validate.notNull(predicate, "The Predicate must not be null");
    this.predicate = predicate;
  }

  public boolean test(@Nonnull LivingEntity entity) {
    return this.predicate.test(entity);
  }
}
