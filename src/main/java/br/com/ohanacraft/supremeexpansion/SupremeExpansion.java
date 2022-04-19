package br.com.ohanacraft.supremeexpansion;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import javax.annotation.Nonnull;
import org.bukkit.ChatColor;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SupremeExpansion extends JavaPlugin implements SlimefunAddon {

  public static SupremeExpansion instance = null;

  public static SupremeExpansion inst() {
    return instance;
  }

  @Override
  public void onEnable() {

    Config cfg = new Config(this);

    if (cfg.getBoolean("options.auto-update") && getDescription().getVersion()
        .startsWith("DEV - ")) {
     // new GitHubBuildsUpdater(this, getFile(), "RelativoBR/SupremeExpansion/master").start();
    }

    instance = this;

    // build supreme expansion
    SupremeExpansion.inst().log(Level.INFO, "### START SETUP SUPREME ###");
    Setup.setup(this);
    SupremeExpansion.inst().log(Level.INFO, "### END SETUP SUPREME ###");

  }

  @Override
  public String getBugTrackerURL() {
    return "";
  }

  @Override
  public JavaPlugin getJavaPlugin() {
    return this;
  }

  @Nonnull
  private static Map<Enchantment, Integer> getEnchants(@Nonnull ConfigurationSection section) {
    Map<Enchantment, Integer> enchants = new HashMap<>();
    for (String path : section.getKeys(false)) {
      Enchantment e = new EnchantmentWrapper(path);
      if (e != null) {
        int level = section.getInt(path);
        if (level > 0 && level <= 100) {
          enchants.put(e, level);
        } else if (level != 0) {
          enchants.put(e, 1);
        }
      }
    }
    return enchants;
  }

  public void addSupremeEnchantsAndSoulbound(@Nonnull SlimefunItemStack... items) {

    ConfigurationSection typeSection = this.getConfig().getConfigurationSection("supreme-enchant");

    if (typeSection == null) {
      log(Level.SEVERE,
          "Config section \"supreme-enchant\" missing, Check your config and report this!");
      return;
    }

    for (SlimefunItemStack item : items) {

      ItemMeta meta = item.getItemMeta();

      // lore
      List<String> lore;
      if (meta.hasLore()) {
        lore = meta.getLore();
      } else {
        lore = new ArrayList<>();
        lore.add("");
      }

      lore.add(ChatColor.LIGHT_PURPLE + "Supreme Expansion");
      lore.add(ChatColor.AQUA + "Soulbound");

      // find path
      String itemPath = item.getItemId().toLowerCase();

      String amplifier = "I";
      if (itemPath.contains("legendary") || itemPath.contains("supreme")) {
        amplifier = "III";
      } else if (itemPath.contains("epic") || itemPath.contains("rare")) {
        amplifier = "II";
      }

      if (itemPath.contains("helmet")) {
        lore.add(ChatColor.DARK_PURPLE + "Night Vision " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "Conduit Power " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "Water Breathing " + amplifier);
      } else if (itemPath.contains("chestplate")) {
        lore.add(ChatColor.DARK_PURPLE + "Damage Resistance " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "Increase Damage " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "Saturation " + amplifier);
      } else if (itemPath.contains("leggings")) {
        lore.add(ChatColor.DARK_PURPLE + "Speed " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "Fast Digging " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "Regeneration " + amplifier);
      } else if (itemPath.contains("boots")) {
        lore.add(ChatColor.DARK_PURPLE + "Dolphins Grace " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "Fire Resistance " + amplifier);
      }

      meta.setLore(lore);

      ConfigurationSection itemSection = typeSection.getConfigurationSection(itemPath);
      if (itemSection != null) {
        // unbreakable and enchants
        meta.setUnbreakable(itemSection.getBoolean("unbreakable"));
        for (Map.Entry<Enchantment, Integer> entry : getEnchants(itemSection).entrySet()) {
          meta.addEnchant(entry.getKey(), entry.getValue(), true);
        }
      } else {
        log(Level.SEVERE,
            "Config section for " + itemPath + " missing, Check your config and report this!");
      }

      // add meta
      item.setItemMeta(meta);

    }
  }

  public void addGearEnchants(@Nonnull SlimefunItemStack... items) {
    ConfigurationSection typeSection = this.getConfig().getConfigurationSection("supreme-enchant");

    if (typeSection == null) {
      log(Level.SEVERE,
          "Config section \"supreme-enchant\" missing, Check your config and report this!");
      return;
    }

    for (SlimefunItemStack item : items) {

      ItemMeta meta = item.getItemMeta();

      // lore
      List<String> lore;
      if (meta.hasLore()) {
        lore = meta.getLore();
      } else {
        lore = new ArrayList<>();
        lore.add("");
      }

      lore.add(ChatColor.LIGHT_PURPLE + "Supreme Expansion");
      lore.add(ChatColor.AQUA + "Soulbound");

      // find path
      String itemPath = item.getItemId().toLowerCase();

      meta.setLore(lore);

      ConfigurationSection itemSection = typeSection.getConfigurationSection(itemPath);
      if (itemSection != null) {
        // unbreakable and enchants
        meta.setUnbreakable(itemSection.getBoolean("unbreakable"));
        for (Map.Entry<Enchantment, Integer> entry : getEnchants(itemSection).entrySet()) {
          meta.addEnchant(entry.getKey(), entry.getValue(), true);
        }
      } else {
        log(Level.SEVERE,
            "Config section for " + itemPath + " missing, Check your config and report this!");
      }

      // add meta
      item.setItemMeta(meta);

    }
  }

  public PotionEffect[] getSupremeEffects(SlimefunItemStack item) {

    // find path
    String itemPath = item.getItemId().toLowerCase();
    PotionEffect[] effect;
    int amplifier = 0;
    if (itemPath.contains("legendary") || itemPath.contains("supreme")) {
      amplifier = 2;
    } else if (itemPath.contains("epic") || itemPath.contains("rare")) {
      amplifier = 1;
    }

    if (itemPath.contains("helmet")) {
      effect = new PotionEffect[]{
          new PotionEffect(PotionEffectType.NIGHT_VISION, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.CONDUIT_POWER, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.WATER_BREATHING, 600, amplifier, false, false, false)
      };
    } else if (itemPath.contains("chestplate")) {
      effect = new PotionEffect[]{
          new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.SATURATION, 600, amplifier, false, false, false)
      };
    } else if (itemPath.contains("leggings")) {
      effect = new PotionEffect[]{
          new PotionEffect(PotionEffectType.SPEED, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.FAST_DIGGING, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.REGENERATION, 600, amplifier, false, false, false)
      };
    } else if (itemPath.contains("boots")) {
      effect = new PotionEffect[]{
          new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, amplifier, false, false, false)
      };
    } else {
      effect = new PotionEffect[]{};
    }

    return effect;

  }

  public void addLoreQuarry(@Nonnull SlimefunItemStack item, ItemStack[] output) {
    ItemMeta meta = item.getItemMeta();
    // lore
    List<String> lore;
    if (meta.hasLore()) {
      lore = meta.getLore();
    } else {
      lore = new ArrayList<>();
    }
    for (ItemStack itemStack : output) {
      if (itemStack.getItemMeta() != null) {
        String name = itemStack.getType().name();
        if (itemStack.getItemMeta().hasDisplayName()) {
          name = itemStack.getItemMeta().getDisplayName();
        } else {
          name = name.replace("_", " ");
          name = name.substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());
          name = ChatColor.AQUA + name;
        }
        lore.add(name + " " + ChatColor.YELLOW + itemStack.getAmount() + "%");
      }
    }
    meta.setLore(lore);
    // add meta
    item.setItemMeta(meta);
  }

  public final void log(Level level, String messages) {
    this.getLogger().log(level, messages);
  }

}
