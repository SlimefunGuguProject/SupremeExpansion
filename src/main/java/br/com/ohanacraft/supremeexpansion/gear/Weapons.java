package br.com.ohanacraft.supremeexpansion.gear;

import br.com.ohanacraft.supremeexpansion.gear.basic.BasicSword;
import br.com.ohanacraft.supremeexpansion.gear.thornium.Bow;
import br.com.ohanacraft.supremeexpansion.gear.thornium.Shield;
import br.com.ohanacraft.supremeexpansion.gear.thornium.Sword;
import br.com.ohanacraft.supremeexpansion.Categories;
import br.com.ohanacraft.supremeexpansion.ItemTier;
import br.com.ohanacraft.supremeexpansion.SupremeExpansion;
import br.com.ohanacraft.supremeexpansion.machine.multiBlock.GearFabricator;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;
import io.github.thebusybiscuit.slimefun4.core.researching.Research;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import javax.annotation.Nonnull;


public class Weapons extends SlimefunItem implements Soulbound, NotPlaceable {


    public static void setup(SupremeExpansion plugin) {

        // add Enchant
        plugin.addGearEnchants(BasicSword.TITANIUM_SWORD,
                BasicSword.AURUM_SWORD,
                BasicSword.ADAMANTIUM_SWORD
        );

        // add Enchant
        plugin.addSupremeEnchantsAndSoulbound(Bow.THORNIUM_BOW, Bow.THORNIUM_BOW_MAGIC, Bow.THORNIUM_BOW_RARE,
                Bow.THORNIUM_BOW_EPIC, Bow.THORNIUM_BOW_LEGENDARY, Bow.THORNIUM_BOW_SUPREME,
                Sword.THORNIUM_SWORD, Sword.THORNIUM_SWORD_MAGIC, Sword.THORNIUM_SWORD_RARE,
                Sword.THORNIUM_SWORD_EPIC, Sword.THORNIUM_SWORD_LEGENDARY, Sword.THORNIUM_SWORD_SUPREME,
                Shield.THORNIUM_SHIELD, Shield.THORNIUM_SHIELD_MAGIC, Shield.THORNIUM_SHIELD_RARE,
                Shield.THORNIUM_SHIELD_EPIC, Shield.THORNIUM_SHIELD_LEGENDARY, Shield.THORNIUM_SHIELD_SUPREME
        );

        final Weapons bow = new Weapons(Bow.THORNIUM_BOW, Bow.RECIPE_THORNIUM_BOW);
        bow.register(plugin);
        final Weapons bowMagic = new Weapons(Bow.THORNIUM_BOW_MAGIC, ItemTier.getMagic(Bow.THORNIUM_BOW));
        bowMagic.register(plugin);
        final Weapons bowRare = new Weapons(Bow.THORNIUM_BOW_RARE, ItemTier.getRare(Bow.THORNIUM_BOW_MAGIC));
        bowRare.register(plugin);
        final Weapons bowEpic = new Weapons(Bow.THORNIUM_BOW_EPIC, ItemTier.getEpic(Bow.THORNIUM_BOW_RARE));
        bowEpic.register(plugin);
        final Weapons bowLegendary = new Weapons(Bow.THORNIUM_BOW_LEGENDARY, ItemTier.getLegendary(Bow.THORNIUM_BOW_EPIC));
        bowLegendary.register(plugin);
        final Weapons bowSupreme = new Weapons(Bow.THORNIUM_BOW_SUPREME, ItemTier.getSupreme(Bow.THORNIUM_BOW_LEGENDARY));
        bowSupreme.register(plugin);

        final Weapons titaniumSword = new Weapons(BasicSword.TITANIUM_SWORD, BasicSword.RECIPE_TITANIUM_SWORD);
        titaniumSword.register(plugin);
        final Weapons aurumSword = new Weapons(BasicSword.AURUM_SWORD, BasicSword.RECIPE_AURUM_SWORD);
        aurumSword.register(plugin);
        final Weapons adamantiumSword = new Weapons(BasicSword.ADAMANTIUM_SWORD, BasicSword.RECIPE_ADAMANTIUM_SWORD);
        adamantiumSword.register(plugin);

        final Weapons sword = new Weapons(Sword.THORNIUM_SWORD, Sword.RECIPE_THORNIUM_SWORD);
        sword.register(plugin);
        final Weapons swordMagic = new Weapons(Sword.THORNIUM_SWORD_MAGIC, ItemTier.getMagic(Sword.THORNIUM_SWORD));
        swordMagic.register(plugin);
        final Weapons swordRare = new Weapons(Sword.THORNIUM_SWORD_RARE, ItemTier.getRare(Sword.THORNIUM_SWORD_MAGIC));
        swordRare.register(plugin);
        final Weapons swordEpic = new Weapons(Sword.THORNIUM_SWORD_EPIC, ItemTier.getEpic(Sword.THORNIUM_SWORD_RARE));
        swordEpic.register(plugin);
        final Weapons swordLegendary = new Weapons(Sword.THORNIUM_SWORD_LEGENDARY, ItemTier.getLegendary(Sword.THORNIUM_SWORD_EPIC));
        swordLegendary.register(plugin);
        final Weapons swordSupreme = new Weapons(Sword.THORNIUM_SWORD_SUPREME, ItemTier.getSupreme(Sword.THORNIUM_SWORD_LEGENDARY));
        swordSupreme.register(plugin);

        final Weapons shield = new Weapons(Shield.THORNIUM_SHIELD, Shield.RECIPE_THORNIUM_SHIELD);
        shield.register(plugin);
        final Weapons shieldMagic = new Weapons(Shield.THORNIUM_SHIELD_MAGIC, ItemTier.getMagic(Shield.THORNIUM_SHIELD));
        shieldMagic.register(plugin);
        final Weapons shieldRare = new Weapons(Shield.THORNIUM_SHIELD_RARE, ItemTier.getRare(Shield.THORNIUM_SHIELD_MAGIC));
        shieldRare.register(plugin);
        final Weapons shieldEpic = new Weapons(Shield.THORNIUM_SHIELD_EPIC, ItemTier.getEpic(Shield.THORNIUM_SHIELD_RARE));
        shieldEpic.register(plugin);
        final Weapons shieldLegendary = new Weapons(Shield.THORNIUM_SHIELD_LEGENDARY, ItemTier.getLegendary(Shield.THORNIUM_SHIELD_EPIC));
        shieldLegendary.register(plugin);
        final Weapons shieldSupreme = new Weapons(Shield.THORNIUM_SHIELD_SUPREME, ItemTier.getSupreme(Shield.THORNIUM_SHIELD_LEGENDARY));
        shieldSupreme.register(plugin);

        // define research
        NamespacedKey researchSupremeexpansionBasicWeaponsKey = new NamespacedKey(plugin, "RESEARCH_SUPREMEEXPANSION_BASIC_WEAPONS");
        Research researchSupremeexpansionBasicWeapons = new Research(researchSupremeexpansionBasicWeaponsKey, 150, "Basic Weapons", 10);
        researchSupremeexpansionBasicWeapons.addItems(titaniumSword);
        researchSupremeexpansionBasicWeapons.addItems(aurumSword);
        researchSupremeexpansionBasicWeapons.addItems(adamantiumSword);
        researchSupremeexpansionBasicWeapons.addItems(bow);
        researchSupremeexpansionBasicWeapons.addItems(bowMagic);
        researchSupremeexpansionBasicWeapons.addItems(bowRare);
        researchSupremeexpansionBasicWeapons.addItems(sword);
        researchSupremeexpansionBasicWeapons.addItems(swordMagic);
        researchSupremeexpansionBasicWeapons.addItems(swordRare);
        researchSupremeexpansionBasicWeapons.addItems(shield);
        researchSupremeexpansionBasicWeapons.addItems(shieldMagic);
        researchSupremeexpansionBasicWeapons.addItems(shieldRare);
        researchSupremeexpansionBasicWeapons.register();

        NamespacedKey researchSupremeexpansionAdvancedWeaponsKey = new NamespacedKey(plugin, "RESEARCH_SUPREMEEXPANSION_ADVANCED_WEAPONS");
        Research researchSupremeexpansionAdvancedWeapons = new Research(researchSupremeexpansionAdvancedWeaponsKey, 151, "Advanced Weapons", 25);
        researchSupremeexpansionAdvancedWeapons.addItems(bowEpic);
        researchSupremeexpansionAdvancedWeapons.addItems(bowLegendary);
        researchSupremeexpansionAdvancedWeapons.addItems(bowSupreme);
        researchSupremeexpansionAdvancedWeapons.addItems(swordEpic);
        researchSupremeexpansionAdvancedWeapons.addItems(swordLegendary);
        researchSupremeexpansionAdvancedWeapons.addItems(swordSupreme);
        researchSupremeexpansionAdvancedWeapons.addItems(shieldEpic);
        researchSupremeexpansionAdvancedWeapons.addItems(shieldLegendary);
        researchSupremeexpansionAdvancedWeapons.addItems(shieldSupreme);
        researchSupremeexpansionAdvancedWeapons.register();


    }

    private Weapons(@Nonnull SlimefunItemStack stack, ItemStack[] recipe) {
        super(Categories.WEAPONS_CATEGORY, stack, GearFabricator.getMachine(), recipe);
    }

}
