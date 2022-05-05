package com.github.relativobr.supremeexpansion;

import com.github.relativobr.supremeexpansion.setup.MainSetup;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import net.guizhanss.guizhanlib.updater.GuizhanBuildsUpdater;
import org.bukkit.ChatColor;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

public class SupremeExpansion extends JavaPlugin implements SlimefunAddon {

    private static SupremeExpansion instance;

    public static SupremeExpansion inst() {
        return instance;
    }

    @Override
    public void onEnable() {

        instance = this;

        SupremeExpansion.inst().log(Level.INFO, "########################################");
        SupremeExpansion.inst().log(Level.INFO, "       SupremeExpansion 至尊研究院        ");
        SupremeExpansion.inst().log(Level.INFO, "########################################");

        Config cfg = new Config(this);
        if (cfg.getBoolean("options.auto-update") &&
            getDescription().getVersion().startsWith("Builds ")) {
            new GuizhanBuildsUpdater(this, getFile(), "SlimefunGuguProject", "SupremeExpansion", "master", false).start();
        }

        MainSetup.setup(this);

    }

    @Override
    public void onDisable() {
        instance = null;
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/SlimefunGuguProject/SupremeExpansion";
    }

    @Override
    @Nonnull
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
                "配置文件中缺少 \"supreme-enchant\" 相关设置，请尝试重新生成配置文件，或汇报该问题!");
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

            lore.add(ChatColor.LIGHT_PURPLE + "至尊研究院");
            lore.add(ChatColor.AQUA + "灵魂绑定");

            // find path
            String itemPath = item.getItemId().toLowerCase();

            String amplifier = "I";
            if (itemPath.contains("legendary") || itemPath.contains("supreme")) {
                amplifier = "III";
            } else if (itemPath.contains("epic") || itemPath.contains("rare")) {
                amplifier = "II";
            }

            if (itemPath.contains("helmet")) {
                lore.add(ChatColor.DARK_PURPLE + "夜视 " + amplifier);
                lore.add(ChatColor.DARK_PURPLE + "潮涌核心 " + amplifier);
                lore.add(ChatColor.DARK_PURPLE + "水下呼吸 " + amplifier);
            } else if (itemPath.contains("chestplate")) {
                lore.add(ChatColor.DARK_PURPLE + "抗性提升 " + amplifier);
                lore.add(ChatColor.DARK_PURPLE + "力量 " + amplifier);
                lore.add(ChatColor.DARK_PURPLE + "饱和 " + amplifier);
            } else if (itemPath.contains("leggings")) {
                lore.add(ChatColor.DARK_PURPLE + "速度 " + amplifier);
                lore.add(ChatColor.DARK_PURPLE + "急迫 " + amplifier);
                lore.add(ChatColor.DARK_PURPLE + "生命恢复 " + amplifier);
            } else if (itemPath.contains("boots")) {
                lore.add(ChatColor.DARK_PURPLE + "海豚的恩惠 " + amplifier);
                lore.add(ChatColor.DARK_PURPLE + "防火 " + amplifier);
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
                    "物品 " + itemPath + " 的设置缺失，请尝试重新生成配置文件，或汇报该问题!");
            }

            // add meta
            item.setItemMeta(meta);

        }
    }

    public void addGearEnchants(@Nonnull SlimefunItemStack... items) {
        ConfigurationSection typeSection = this.getConfig().getConfigurationSection("supreme-enchant");

        if (typeSection == null) {
            log(Level.SEVERE,
                "配置文件中缺少 \"supreme-enchant\" 相关设置，请尝试重新生成配置文件，或汇报该问题!");
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

            lore.add(ChatColor.LIGHT_PURPLE + "至尊研究院");
            lore.add(ChatColor.AQUA + "灵魂绑定");

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
                    "物品 " + itemPath + " 的设置缺失，请尝试重新生成配置文件，或汇报该问题!");
            }

            // add meta
            item.setItemMeta(meta);

        }
    }

    public final void log(Level level, String messages) {
        this.getLogger().log(level, messages);
    }

}
