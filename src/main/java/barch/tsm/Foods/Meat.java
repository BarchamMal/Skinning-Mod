package barch.tsm.Foods;

import barch.tsm.Glue.ItemGrouped;
import barch.tsm.Glue.ItemGrouper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.tsm.TheSkinningMod.CARCASES_GROUP;
import static barch.tsm.TheSkinningMod.NAMESPACE;

public class Meat {

    public static final FoodComponent GROUND_MEAT_FOOD = new FoodComponent.Builder().meat().hunger(3).saturationModifier(1).build();
    public static final FoodComponent HAMBURGER_FOOD = new FoodComponent.Builder().meat().hunger(4).saturationModifier(8).build();
    public static final FoodComponent SAUSAGE_FOOD = new FoodComponent.Builder().meat().hunger(1).saturationModifier(.5f).build();
    public static final FoodComponent COOKED_SAUSAGE_FOOD = new FoodComponent.Builder().meat().hunger(3).saturationModifier(5).build();
    public static final FoodComponent RARE_MEAT_FOOD = new FoodComponent.Builder().meat().hunger(1).saturationModifier(.5f).build();
    public static final FoodComponent COOKED_RARE_MEAT_FOOD = new FoodComponent.Builder().meat().hunger(7).saturationModifier(10).build();
    public static final FoodComponent POISON_MEAT_FOOD = new FoodComponent.Builder().meat().hunger(1).saturationModifier(.5f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 2), 0.9f).build();
    public static final FoodComponent COOKED_TOXIC_MEAT_FOOD = new FoodComponent.Builder().meat().hunger(7).saturationModifier(10).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 1), 0.4f).build();


    public static final Item CHICKEN_LEG = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_CHICKEN_LEG = createFood(HAMBURGER_FOOD);
    public static final Item CHICKEN_WING = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_CHICKEN_WING = createFood(HAMBURGER_FOOD);

    public static final Item GROUND_BEEF = createFood(GROUND_MEAT_FOOD);
    public static final Item HAMBURGER = createFood(GROUND_MEAT_FOOD);
    public static final Item GROUND_MUTTON = createFood(GROUND_MEAT_FOOD);
    public static final Item MUTTON_HAMBURGER = createFood(GROUND_MEAT_FOOD);
    public static final Item GROUND_PORK = createFood(GROUND_MEAT_FOOD);
    public static final Item PORK_HAMBURGER = createFood(GROUND_MEAT_FOOD);

    public static final Item LIVER = createFood(RARE_MEAT_FOOD);
    public static final Item COOKED_LIVER = createFood(COOKED_RARE_MEAT_FOOD);
    public static final Item RIB = createFood(RARE_MEAT_FOOD);
    public static final Item COOKED_RIB = createFood(COOKED_RARE_MEAT_FOOD);
    public static final Item TONGUE = createFood(RARE_MEAT_FOOD);
    public static final Item COOKED_TONGUE = createFood(COOKED_RARE_MEAT_FOOD);

    public static final Item SAUSAGE = createFood(SAUSAGE_FOOD);
    public static final Item COOKED_SAUSAGE = createFood(COOKED_SAUSAGE_FOOD);
    public static final Item HAM = createFood(RARE_MEAT_FOOD);
    public static final Item COOKED_HAM = createFood(COOKED_RARE_MEAT_FOOD);
    public static final Item BACON = createFood(SAUSAGE_FOOD);
    public static final Item COOKED_BACON = createFood(COOKED_SAUSAGE_FOOD);

    public static final Item SALMON_STEAK = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_SALMON_STEAK = createFood(HAMBURGER_FOOD);
    public static final Item COD_STEAK = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_COD_STEAK = createFood(HAMBURGER_FOOD);
    public static final Item TROPICAL_FISH_STEAK = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_TROPICAL_FISH_STEAK = createFood(HAMBURGER_FOOD);
    public static final Item PUFFERFISH_STEAK = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_PUFFERFISH_STEAK = createFood(HAMBURGER_FOOD);
    public static final Item POISONOUS_FISH_STEAK = createFood(POISON_MEAT_FOOD);
    public static final Item COOKED_POISONOUS_FISH_STEAK = createFood(COOKED_TOXIC_MEAT_FOOD);
    public static final Item TURTLE_STEAK = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_TURTLE_STEAK = createFood(HAMBURGER_FOOD);

    public static final Item SQUID_TENTACLE = createFood(RARE_MEAT_FOOD);
    public static final Item COOKED_SQUID_TENTACLE = createFood(COOKED_RARE_MEAT_FOOD);
    public static final Item GLOW_SQUID_TENTACLE = createFood(RARE_MEAT_FOOD);
    public static final Item COOKED_GLOW_SQUID_TENTACLE = createFood(COOKED_RARE_MEAT_FOOD);

    private static Item createFood(FoodComponent foodComponent) {
        return new Item(new FabricItemSettings().food(foodComponent));
    }

    public static void registerAll() {
        registerItems();
        groupItems();
    }

    public static void registerItems() {

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "chicken_leg"), CHICKEN_LEG);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_chicken_leg"), COOKED_CHICKEN_LEG);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "chicken_wing"), CHICKEN_WING);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_chicken_wing"), COOKED_CHICKEN_WING);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "ground_beef"), GROUND_BEEF);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_ground_beef"), HAMBURGER);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "ground_mutton"), GROUND_MUTTON);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_ground_mutton"), MUTTON_HAMBURGER);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "ground_pork"), GROUND_PORK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_ground_pork"), PORK_HAMBURGER);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "liver"), LIVER);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_liver"), COOKED_LIVER);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "rib"), RIB);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_rib"), COOKED_RIB);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "tongue"), TONGUE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_tongue"), COOKED_TONGUE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "sausage"), SAUSAGE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_sausage"), COOKED_SAUSAGE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "ham"), HAM);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_ham"), COOKED_HAM);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bacon"), BACON);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_bacon"), COOKED_BACON);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "salmon_steak"), SALMON_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_salmon_steak"), COOKED_SALMON_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cod_steak"), COD_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_cod_steak"), COOKED_COD_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "tropical_fish_steak"), TROPICAL_FISH_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_tropical_fish_steak"), COOKED_TROPICAL_FISH_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "pufferfish_steak"), PUFFERFISH_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_pufferfish_steak"), COOKED_PUFFERFISH_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "poison_fish_steak"), POISONOUS_FISH_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_poison_fish_steak"), COOKED_POISONOUS_FISH_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "turtle_steak"), TURTLE_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_turtle_steak"), COOKED_TURTLE_STEAK);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "squid_tentacle"), SQUID_TENTACLE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_squid_tentacle"), COOKED_SQUID_TENTACLE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "glow_squid_tentacle"), GLOW_SQUID_TENTACLE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_glow_squid_tentacle"), COOKED_GLOW_SQUID_TENTACLE);

    }

    public static void groupItems() {

        ItemGrouper.GroupItem(CHICKEN_LEG, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, Items.AIR)});
        ItemGrouper.GroupItem(COOKED_CHICKEN_LEG, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, CHICKEN_LEG)});
        ItemGrouper.GroupItem(CHICKEN_WING, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_CHICKEN_LEG)});
        ItemGrouper.GroupItem(COOKED_CHICKEN_WING, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, CHICKEN_WING)});

        ItemGrouper.GroupItem(GROUND_BEEF, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_CHICKEN_WING)});
        ItemGrouper.GroupItem(HAMBURGER, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, GROUND_BEEF)});
        ItemGrouper.GroupItem(GROUND_MUTTON, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, HAMBURGER)});
        ItemGrouper.GroupItem(MUTTON_HAMBURGER, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, GROUND_MUTTON)});
        ItemGrouper.GroupItem(GROUND_PORK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, MUTTON_HAMBURGER)});
        ItemGrouper.GroupItem(PORK_HAMBURGER, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, GROUND_PORK)});

        ItemGrouper.GroupItem(LIVER, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, PORK_HAMBURGER)});
        ItemGrouper.GroupItem(COOKED_LIVER, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, LIVER)});
        ItemGrouper.GroupItem(RIB, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_LIVER)});
        ItemGrouper.GroupItem(COOKED_RIB, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, RIB)});
        ItemGrouper.GroupItem(TONGUE, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_RIB)});
        ItemGrouper.GroupItem(COOKED_TONGUE, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, TONGUE)});

        ItemGrouper.GroupItem(SAUSAGE, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_TONGUE)});
        ItemGrouper.GroupItem(COOKED_SAUSAGE, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, SAUSAGE)});
        ItemGrouper.GroupItem(HAM, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_SAUSAGE)});
        ItemGrouper.GroupItem(COOKED_HAM, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, HAM)});
        ItemGrouper.GroupItem(BACON, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_HAM)});
        ItemGrouper.GroupItem(COOKED_BACON, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, BACON)});


        ItemGrouper.GroupItem(SALMON_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_BACON)});
        ItemGrouper.GroupItem(COOKED_SALMON_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, SALMON_STEAK)});
        ItemGrouper.GroupItem(COD_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_SALMON_STEAK)});
        ItemGrouper.GroupItem(COOKED_COD_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COD_STEAK)});
        ItemGrouper.GroupItem(TROPICAL_FISH_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_COD_STEAK)});
        ItemGrouper.GroupItem(COOKED_TROPICAL_FISH_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, TROPICAL_FISH_STEAK)});
        ItemGrouper.GroupItem(PUFFERFISH_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_TROPICAL_FISH_STEAK)});
        ItemGrouper.GroupItem(COOKED_PUFFERFISH_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, PUFFERFISH_STEAK)});
        ItemGrouper.GroupItem(POISONOUS_FISH_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_PUFFERFISH_STEAK)});
        ItemGrouper.GroupItem(COOKED_POISONOUS_FISH_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, POISONOUS_FISH_STEAK)});

        ItemGrouper.GroupItem(TURTLE_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_POISONOUS_FISH_STEAK)});
        ItemGrouper.GroupItem(COOKED_TURTLE_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, TURTLE_STEAK)});
        ItemGrouper.GroupItem(SQUID_TENTACLE, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, TURTLE_STEAK)});
        ItemGrouper.GroupItem(COOKED_SQUID_TENTACLE, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, SQUID_TENTACLE)});
        ItemGrouper.GroupItem(GLOW_SQUID_TENTACLE, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_SQUID_TENTACLE)});
        ItemGrouper.GroupItem(COOKED_GLOW_SQUID_TENTACLE, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, GLOW_SQUID_TENTACLE)});

    }

}
