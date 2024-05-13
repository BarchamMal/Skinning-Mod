package barch.tsm.Blocks.Infuser;

import barch.tsm.Armor.ArmorItems;
import barch.tsm.Blocks.InfuserRegister;
import barch.tsm.Carcases.AnimalByproducts;
import barch.tsm.Foods.Meat;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static barch.tsm.TheSkinningMod.LOGGER;

public class InfuserEnchantmentRegistry {

    public static Map<String, List<Enchantment>> EnchantmentRegistry = new HashMap<>();
    public static Map<Item, String> ElementRegistry = new HashMap<>();
    public static Map<Item, Enchantment> EnchantmentItemRegistry = new HashMap<>();

    public static void register(Item elementItem, String elementName) {
        ElementRegistry.put(elementItem, elementName);
    }

    public static void register(String element, Enchantment enchantment) {
        if (enchantment.isTreasure()) {
            return;
        }
        if (!EnchantmentRegistry.containsKey(element)) {
            EnchantmentRegistry.put(element, new ArrayList<>());
        }
        List<Enchantment> enchantmentList = EnchantmentRegistry.get(element);
        enchantmentList.add(enchantment);
    }


    public static void register(Item item, Enchantment enchantment) {
        EnchantmentItemRegistry.put(item, enchantment);
    }

    public static boolean isEnchantmentItem(Item item) {
        return EnchantmentItemRegistry.containsKey(item);
    }

    public static boolean isElement(Item item) {
        return ElementRegistry.containsKey(item);
    }


    public static String getElement(Enchantment enchantment) {
        for (Map.Entry<String, List<Enchantment>> entry : EnchantmentRegistry.entrySet()) {
            if (entry.getValue().contains(enchantment)) {
                return entry.getKey();
            }
        }
        return null;
    }
    public static String getElement(Item item) {
        return ElementRegistry.get(item);
    }

    public static Item getItemFromElement(String elementName) {
        for (Map.Entry<Item, String> entry : ElementRegistry.entrySet()) {
            if (entry.getValue().equals(elementName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static String getElementFromEnchantment(Enchantment enchantment) {
        for (Map.Entry<String, List<Enchantment>> entry : EnchantmentRegistry.entrySet()) {
            if (entry.getValue().contains(enchantment)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static Item getEnchantmentItem(Enchantment enchantment) {
        for (Map.Entry<Item, Enchantment> entry : EnchantmentItemRegistry.entrySet()) {
            if (entry.getValue().equals(enchantment)) {
                return entry.getKey();
            }
        }
        return null;
    }




    public static void RegisterAll() {

        InfuserEnchantmentRegistry.register(InfuserRegister.REALITY_ESSENCE_FIRE, "fire");
        InfuserEnchantmentRegistry.register(InfuserRegister.REALITY_ESSENCE_WATER, "water");
        InfuserEnchantmentRegistry.register(InfuserRegister.REALITY_ESSENCE_EARTH, "earth");
        InfuserEnchantmentRegistry.register(InfuserRegister.REALITY_ESSENCE_AIR, "air");
        InfuserEnchantmentRegistry.register(InfuserRegister.REALITY_ESSENCE_MAGIC, "magic");
        InfuserEnchantmentRegistry.register(InfuserRegister.REALITY_ESSENCE_NATURE, "nature");
        InfuserEnchantmentRegistry.register(InfuserRegister.REALITY_ESSENCE_LIFE, "life");
        InfuserEnchantmentRegistry.register(InfuserRegister.REALITY_ESSENCE_DEATH, "death");
        InfuserEnchantmentRegistry.register(InfuserRegister.REALITY_ESSENCE_FORCE, "force");
        InfuserEnchantmentRegistry.register(InfuserRegister.REALITY_ESSENCE_VOID, "void");
        InfuserEnchantmentRegistry.register(InfuserRegister.REALITY_ESSENCE_LIGHT, "light");
        InfuserEnchantmentRegistry.register(InfuserRegister.REALITY_ESSENCE_DARKNESS, "darkness");
        InfuserEnchantmentRegistry.register(InfuserRegister.REALITY_ESSENCE_ICE, "cold");
        InfuserEnchantmentRegistry.register(InfuserRegister.REALITY_ESSENCE_ELECTRICITY, "electricity");

        InfuserEnchantmentRegistry.register("fire", Enchantments.FIRE_ASPECT);
        InfuserEnchantmentRegistry.register("fire", Enchantments.FLAME);
        InfuserEnchantmentRegistry.register("water", Enchantments.DEPTH_STRIDER);
        InfuserEnchantmentRegistry.register("water", Enchantments.AQUA_AFFINITY);
        InfuserEnchantmentRegistry.register("water", Enchantments.RESPIRATION);
        InfuserEnchantmentRegistry.register("water", Enchantments.RIPTIDE);
        InfuserEnchantmentRegistry.register("earth", Enchantments.PROTECTION);
        InfuserEnchantmentRegistry.register("earth", Enchantments.EFFICIENCY);
        InfuserEnchantmentRegistry.register("earth", Enchantments.POWER);
        InfuserEnchantmentRegistry.register("air", Enchantments.FEATHER_FALLING);
        InfuserEnchantmentRegistry.register("air", Enchantments.PROJECTILE_PROTECTION);
        InfuserEnchantmentRegistry.register("air", Enchantments.KNOCKBACK);
        InfuserEnchantmentRegistry.register("magic", Enchantments.LUCK_OF_THE_SEA);
        InfuserEnchantmentRegistry.register("magic", Enchantments.LURE);
        InfuserEnchantmentRegistry.register("magic", Enchantments.LOOTING);
        InfuserEnchantmentRegistry.register("magic", Enchantments.FORTUNE);
        InfuserEnchantmentRegistry.register("nature", Enchantments.SILK_TOUCH);
        InfuserEnchantmentRegistry.register("nature", Enchantments.PIERCING);
        InfuserEnchantmentRegistry.register("nature", Enchantments.LOYALTY);
        InfuserEnchantmentRegistry.register("nature", Enchantments.PUNCH);
        InfuserEnchantmentRegistry.register("life", Enchantments.UNBREAKING);
        InfuserEnchantmentRegistry.register("life", Enchantments.MULTISHOT);
        InfuserEnchantmentRegistry.register("death", Enchantments.SMITE);
        InfuserEnchantmentRegistry.register("death", Enchantments.BANE_OF_ARTHROPODS);
        InfuserEnchantmentRegistry.register("death", Enchantments.SWEEPING_EDGE);
        InfuserEnchantmentRegistry.register("death", Enchantments.SHARPNESS);
        InfuserEnchantmentRegistry.register("death", Enchantments.IMPALING);
        InfuserEnchantmentRegistry.register("force", Enchantments.BLAST_PROTECTION);
        InfuserEnchantmentRegistry.register("light", Enchantments.INFINITY);
        InfuserEnchantmentRegistry.register("light", Enchantments.QUICK_CHARGE);
        InfuserEnchantmentRegistry.register("cold", Enchantments.FIRE_PROTECTION);
        InfuserEnchantmentRegistry.register("electricity", Enchantments.THORNS);
        InfuserEnchantmentRegistry.register("electricity", Enchantments.CHANNELING);

        InfuserEnchantmentRegistry.register(Items.HONEYCOMB, Enchantments.FIRE_ASPECT);
        InfuserEnchantmentRegistry.register(Items.FIRE_CHARGE, Enchantments.FLAME);
        InfuserEnchantmentRegistry.register(ArmorItems.LARGE_COLORFUL_FISH_SCALE, Enchantments.DEPTH_STRIDER);
        InfuserEnchantmentRegistry.register(Items.GLOW_INK_SAC, Enchantments.AQUA_AFFINITY);
        InfuserEnchantmentRegistry.register(AnimalByproducts.LARGE_SCUTE, Enchantments.RESPIRATION);
        InfuserEnchantmentRegistry.register(Items.PRISMARINE_SHARD, Enchantments.RIPTIDE);
        InfuserEnchantmentRegistry.register(ArmorItems.LARGE_FISH_SCALE, Enchantments.PROTECTION);
        InfuserEnchantmentRegistry.register(Items.GOLD_NUGGET, Enchantments.EFFICIENCY);
        InfuserEnchantmentRegistry.register(Items.RABBIT_HIDE, Enchantments.POWER);
        InfuserEnchantmentRegistry.register(Items.FEATHER, Enchantments.FEATHER_FALLING);
        InfuserEnchantmentRegistry.register(Items.CHAIN, Enchantments.PROJECTILE_PROTECTION);
        InfuserEnchantmentRegistry.register(Items.SLIME_BALL, Enchantments.KNOCKBACK);
        InfuserEnchantmentRegistry.register(Items.PRISMARINE_CRYSTALS, Enchantments.LUCK_OF_THE_SEA);
        InfuserEnchantmentRegistry.register(Meat.COOKED_POISONOUS_FISH_STEAK, Enchantments.LURE);
        InfuserEnchantmentRegistry.register(Items.DRIED_KELP, Enchantments.LOOTING);
        InfuserEnchantmentRegistry.register(Items.BAKED_POTATO, Enchantments.FORTUNE);
        InfuserEnchantmentRegistry.register(Items.WHITE_WOOL, Enchantments.SILK_TOUCH);
        InfuserEnchantmentRegistry.register(Items.ARROW, Enchantments.PIERCING);
        InfuserEnchantmentRegistry.register(Items.BONE, Enchantments.LOYALTY);
        InfuserEnchantmentRegistry.register(Items.CLAY, Enchantments.PUNCH);
        InfuserEnchantmentRegistry.register(Items.IRON_INGOT, Enchantments.UNBREAKING);
        InfuserEnchantmentRegistry.register(Items.EGG, Enchantments.MULTISHOT);
        InfuserEnchantmentRegistry.register(Items.GLISTERING_MELON_SLICE, Enchantments.SMITE);
        InfuserEnchantmentRegistry.register(Items.FERMENTED_SPIDER_EYE, Enchantments.BANE_OF_ARTHROPODS);
        InfuserEnchantmentRegistry.register(Items.GUNPOWDER, Enchantments.SWEEPING_EDGE);
        InfuserEnchantmentRegistry.register(AnimalByproducts.STINGER, Enchantments.SHARPNESS);
        InfuserEnchantmentRegistry.register(Items.STICK, Enchantments.IMPALING);
        InfuserEnchantmentRegistry.register(ArmorItems.SALVAGED_FISH_SCALES, Enchantments.BLAST_PROTECTION);
        InfuserEnchantmentRegistry.register(Items.FLINT, Enchantments.INFINITY);
        InfuserEnchantmentRegistry.register(Items.STRING, Enchantments.QUICK_CHARGE);
        InfuserEnchantmentRegistry.register(Items.PACKED_ICE, Enchantments.FIRE_PROTECTION);
        InfuserEnchantmentRegistry.register(AnimalByproducts.PUFFERFISH_SPIKE, Enchantments.THORNS);
        InfuserEnchantmentRegistry.register(Items.SNOWBALL, Enchantments.CHANNELING);


    }

}
