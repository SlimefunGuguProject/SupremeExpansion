package br.com.ohanacraft.supremeexpansion.gear;

import br.com.ohanacraft.supremeexpansion.gear.thornium.Boots;
import br.com.ohanacraft.supremeexpansion.gear.thornium.Chestplate;
import br.com.ohanacraft.supremeexpansion.gear.thornium.Helmet;
import br.com.ohanacraft.supremeexpansion.gear.thornium.Leggings;
import br.com.ohanacraft.supremeexpansion.Categories;
import br.com.ohanacraft.supremeexpansion.ItemTier;
import br.com.ohanacraft.supremeexpansion.SupremeExpansion;
import br.com.ohanacraft.supremeexpansion.machine.multiBlock.GearFabricator;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.ProtectionType;
import io.github.thebusybiscuit.slimefun4.core.attributes.ProtectiveArmor;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;
import io.github.thebusybiscuit.slimefun4.core.researching.Research;
import io.github.thebusybiscuit.slimefun4.implementation.items.armor.SlimefunArmorPiece;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import javax.annotation.Nonnull;


public class Armor extends SlimefunArmorPiece implements ProtectiveArmor, Soulbound, NotPlaceable {


    public static void setup(SupremeExpansion plugin) {

        // add Enchant
        plugin.addSupremeEnchantsAndSoulbound(Helmet.THORNIUM_HELMET, Helmet.THORNIUM_HELMET_MAGIC, Helmet.THORNIUM_HELMET_RARE,
                Helmet.THORNIUM_HELMET_EPIC, Helmet.THORNIUM_HELMET_LEGENDARY, Helmet.THORNIUM_HELMET_SUPREME,
                Chestplate.THORNIUM_CHESTPLATE, Chestplate.THORNIUM_CHESTPLATE_MAGIC, Chestplate.THORNIUM_CHESTPLATE_RARE,
                Chestplate.THORNIUM_CHESTPLATE_EPIC, Chestplate.THORNIUM_CHESTPLATE_LEGENDARY, Chestplate.THORNIUM_CHESTPLATE_SUPREME,
                Leggings.THORNIUM_LEGGINGS, Leggings.THORNIUM_LEGGINGS_MAGIC, Leggings.THORNIUM_LEGGINGS_RARE,
                Leggings.THORNIUM_LEGGINGS_EPIC, Leggings.THORNIUM_LEGGINGS_LEGENDARY, Leggings.THORNIUM_LEGGINGS_SUPREME,
                Boots.THORNIUM_BOOTS, Boots.THORNIUM_BOOTS_MAGIC, Boots.THORNIUM_BOOTS_RARE,
                Boots.THORNIUM_BOOTS_EPIC, Boots.THORNIUM_BOOTS_LEGENDARY, Boots.THORNIUM_BOOTS_SUPREME
        );


        final Armor helmet = new Armor(plugin, Helmet.THORNIUM_HELMET, Helmet.RECIPE_THORNIUM_HELMET);
        helmet.register(plugin);
        final Armor helmetMagic = new Armor(plugin, Helmet.THORNIUM_HELMET_MAGIC, ItemTier.getMagic(Helmet.THORNIUM_HELMET));
        helmetMagic.register(plugin);
        final Armor helmetRare = new Armor(plugin, Helmet.THORNIUM_HELMET_RARE, ItemTier.getRare(Helmet.THORNIUM_HELMET_MAGIC));
        helmetRare.register(plugin);
        final Armor helmetEpic = new Armor(plugin, Helmet.THORNIUM_HELMET_EPIC, ItemTier.getEpic(Helmet.THORNIUM_HELMET_RARE));
        helmetEpic.register(plugin);
        final Armor helmetLegendary = new Armor(plugin, Helmet.THORNIUM_HELMET_LEGENDARY, ItemTier.getLegendary(Helmet.THORNIUM_HELMET_EPIC));
        helmetLegendary.register(plugin);
        final Armor helmetSupreme = new Armor(plugin, Helmet.THORNIUM_HELMET_SUPREME, ItemTier.getSupreme(Helmet.THORNIUM_HELMET_LEGENDARY));
        helmetSupreme.register(plugin);

        final Armor chestplate = new Armor(plugin, Chestplate.THORNIUM_CHESTPLATE, Chestplate.RECIPE_THORNIUM_CHESTPLATE);
        chestplate.register(plugin);
        final Armor chestplateMagic = new Armor(plugin, Chestplate.THORNIUM_CHESTPLATE_MAGIC, ItemTier.getMagic(Chestplate.THORNIUM_CHESTPLATE));
        chestplateMagic.register(plugin);
        final Armor chestplateRare = new Armor(plugin, Chestplate.THORNIUM_CHESTPLATE_RARE, ItemTier.getRare(Chestplate.THORNIUM_CHESTPLATE_MAGIC));
        chestplateRare.register(plugin);
        final Armor chestplateEpic = new Armor(plugin, Chestplate.THORNIUM_CHESTPLATE_EPIC, ItemTier.getEpic(Chestplate.THORNIUM_CHESTPLATE_RARE));
        chestplateEpic.register(plugin);
        final Armor chestplateLegendary = new Armor(plugin, Chestplate.THORNIUM_CHESTPLATE_LEGENDARY, ItemTier.getLegendary(Chestplate.THORNIUM_CHESTPLATE_EPIC));
        chestplateLegendary.register(plugin);
        final Armor chestplateSupreme = new Armor(plugin, Chestplate.THORNIUM_CHESTPLATE_SUPREME, ItemTier.getSupreme(Chestplate.THORNIUM_CHESTPLATE_LEGENDARY));
        chestplateSupreme.register(plugin);

        final Armor leggings = new Armor(plugin, Leggings.THORNIUM_LEGGINGS, Leggings.RECIPE_THORNIUM_LEGGINGS);
        leggings.register(plugin);
        final Armor leggingsMagic = new Armor(plugin, Leggings.THORNIUM_LEGGINGS_MAGIC, ItemTier.getMagic(Leggings.THORNIUM_LEGGINGS));
        leggingsMagic.register(plugin);
        final Armor leggingsRare = new Armor(plugin, Leggings.THORNIUM_LEGGINGS_RARE, ItemTier.getRare(Leggings.THORNIUM_LEGGINGS_MAGIC));
        leggingsRare.register(plugin);
        final Armor leggingsEpic = new Armor(plugin, Leggings.THORNIUM_LEGGINGS_EPIC, ItemTier.getEpic(Leggings.THORNIUM_LEGGINGS_RARE));
        leggingsEpic.register(plugin);
        final Armor leggingsLegendary = new Armor(plugin, Leggings.THORNIUM_LEGGINGS_LEGENDARY, ItemTier.getLegendary(Leggings.THORNIUM_LEGGINGS_EPIC));
        leggingsLegendary.register(plugin);
        final Armor leggingsSupreme = new Armor(plugin, Leggings.THORNIUM_LEGGINGS_SUPREME, ItemTier.getSupreme(Leggings.THORNIUM_LEGGINGS_LEGENDARY));
        leggingsSupreme.register(plugin);

        final Armor boots = new Armor(plugin, Boots.THORNIUM_BOOTS, Boots.RECIPE_THORNIUM_BOOTS);
        boots.register(plugin);
        final Armor bootsMagic = new Armor(plugin, Boots.THORNIUM_BOOTS_MAGIC, ItemTier.getMagic(Boots.THORNIUM_BOOTS));
        bootsMagic.register(plugin);
        final Armor bootsRare = new Armor(plugin, Boots.THORNIUM_BOOTS_RARE, ItemTier.getRare(Boots.THORNIUM_BOOTS_MAGIC));
        bootsRare.register(plugin);
        final Armor bootsEpic = new Armor(plugin, Boots.THORNIUM_BOOTS_EPIC, ItemTier.getEpic(Boots.THORNIUM_BOOTS_RARE));
        bootsEpic.register(plugin);
        final Armor bootsLegendary = new Armor(plugin, Boots.THORNIUM_BOOTS_LEGENDARY, ItemTier.getLegendary(Boots.THORNIUM_BOOTS_EPIC));
        bootsLegendary.register(plugin);
        final Armor bootsSupreme = new Armor(plugin, Boots.THORNIUM_BOOTS_SUPREME, ItemTier.getSupreme(Boots.THORNIUM_BOOTS_LEGENDARY));
        bootsSupreme.register(plugin);


        // define research
        NamespacedKey researchSupremeexpansionBasicArmorKey = new NamespacedKey(plugin, "RESEARCH_SUPREMEEXPANSION_BASIC_ARMOR");
        Research researchSupremeexpansionBasicArmor = new Research(researchSupremeexpansionBasicArmorKey, 160, "Basic Armor", 10);
        researchSupremeexpansionBasicArmor.addItems(helmet);
        researchSupremeexpansionBasicArmor.addItems(helmetMagic);
        researchSupremeexpansionBasicArmor.addItems(helmetRare);
        researchSupremeexpansionBasicArmor.addItems(chestplate);
        researchSupremeexpansionBasicArmor.addItems(chestplateMagic);
        researchSupremeexpansionBasicArmor.addItems(chestplateRare);
        researchSupremeexpansionBasicArmor.addItems(leggings);
        researchSupremeexpansionBasicArmor.addItems(leggingsMagic);
        researchSupremeexpansionBasicArmor.addItems(leggingsRare);
        researchSupremeexpansionBasicArmor.addItems(boots);
        researchSupremeexpansionBasicArmor.addItems(bootsMagic);
        researchSupremeexpansionBasicArmor.addItems(bootsRare);
        researchSupremeexpansionBasicArmor.register();

        NamespacedKey researchSupremeexpansionAdvancedArmorKey = new NamespacedKey(plugin, "RESEARCH_SUPREMEEXPANSION_ADVANCED_ARMOR");
        Research researchSupremeexpansionAdvancedArmor = new Research(researchSupremeexpansionAdvancedArmorKey, 161, "Advanced Armor", 25);
        researchSupremeexpansionAdvancedArmor.addItems(helmetEpic);
        researchSupremeexpansionAdvancedArmor.addItems(helmetLegendary);
        researchSupremeexpansionAdvancedArmor.addItems(helmetSupreme);
        researchSupremeexpansionAdvancedArmor.addItems(chestplateEpic);
        researchSupremeexpansionAdvancedArmor.addItems(chestplateLegendary);
        researchSupremeexpansionAdvancedArmor.addItems(chestplateSupreme);
        researchSupremeexpansionAdvancedArmor.addItems(leggingsEpic);
        researchSupremeexpansionAdvancedArmor.addItems(leggingsLegendary);
        researchSupremeexpansionAdvancedArmor.addItems(leggingsSupreme);
        researchSupremeexpansionAdvancedArmor.addItems(bootsEpic);
        researchSupremeexpansionAdvancedArmor.addItems(bootsLegendary);
        researchSupremeexpansionAdvancedArmor.addItems(bootsSupreme);
        researchSupremeexpansionAdvancedArmor.register();

    }

    private Armor(SupremeExpansion plugin, SlimefunItemStack item, ItemStack[] recipe) {
        super(Categories.ARMOR_CATEGORY, item, GearFabricator.getMachine(), recipe, plugin.getSupremeEffects(item));
    }

    @Nonnull
    @Override
    public ProtectionType[] getProtectionTypes() {
        return new ProtectionType[] {
                ProtectionType.BEES, ProtectionType.RADIATION, ProtectionType.FLYING_INTO_WALL
        };
    }

    @Override
    public boolean isFullSetRequired() {
        return false;
    }

    @Nonnull
    @Override
    public NamespacedKey getArmorSetId() {
        return new NamespacedKey(getAddon().getJavaPlugin(), "supreme_armor");
    }

}
