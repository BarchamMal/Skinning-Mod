package barch.tsm.Foods;

import barch.tsm.Glue.ItemGrouped;
import barch.tsm.Glue.ItemGrouper;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.tsm.TheSkinningMod.NAMESPACE;

public class Meat {

    public static final FoodComponent GROUND_MEAT_FOOD = new FoodComponent.Builder().nutrition(3).saturationModifier(1).build();
    public static final FoodComponent HAMBURGER_FOOD = new FoodComponent.Builder().nutrition(4).saturationModifier(8).build();
    public static final FoodComponent SAUSAGE_FOOD = new FoodComponent.Builder().nutrition(1).saturationModifier(.5f).build();
    public static final FoodComponent COOKED_SAUSAGE_FOOD = new FoodComponent.Builder().nutrition(3).saturationModifier(5).build();
    public static final FoodComponent RARE_MEAT_FOOD = new FoodComponent.Builder().nutrition(1).saturationModifier(.5f).build();
    public static final FoodComponent COOKED_RARE_MEAT_FOOD = new FoodComponent.Builder().nutrition(7).saturationModifier(10).build();
    public static final FoodComponent POISON_MEAT_FOOD = new FoodComponent.Builder().nutrition(1).saturationModifier(.5f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 2), 0.9f).build();
    public static final FoodComponent COOKED_TOXIC_MEAT_FOOD = new FoodComponent.Builder().nutrition(7).saturationModifier(10).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 1), 0.4f).build();


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


    public static final Item BEAR_STEAK = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_BEAR_STEAK = createFood(HAMBURGER_FOOD);
    public static final Item GROUND_BEAR = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_GROUND_BEAR = createFood(HAMBURGER_FOOD);

    public static final Item BEE_STEAK = createFood(RARE_MEAT_FOOD);
    public static final Item COOKED_BEE_STEAK = createFood(COOKED_RARE_MEAT_FOOD);
    public static final Item CAMEL_STEAK = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_CAMEL_STEAK = createFood(HAMBURGER_FOOD);
    public static final Item CAT_STEAK = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_CAT_STEAK = createFood(HAMBURGER_FOOD);
    public static final Item EQUINE_STEAK = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_EQUINE_STEAK = createFood(HAMBURGER_FOOD);
    public static final Item LLAMA_STEAK = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_LLAMA_STEAK = createFood(HAMBURGER_FOOD);

    public static final Item GROUND_CAMEL = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_GROUND_CAMEL = createFood(GROUND_MEAT_FOOD);
    public static final Item GROUND_LLAMA = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_GROUND_LLAMA = createFood(GROUND_MEAT_FOOD);
    public static final Item GROUND_EQUINE = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_GROUND_EQUINE = createFood(GROUND_MEAT_FOOD);
    public static final Item CANINE_STEAK = createFood(GROUND_MEAT_FOOD);
    public static final Item COOKED_CANINE_STEAK = createFood(GROUND_MEAT_FOOD);

    private static Item createFood(FoodComponent foodComponent) {
        return new Item(new Item.Settings().food(foodComponent));
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

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bear_steak"), BEAR_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_bear_steak"), COOKED_BEAR_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "ground_bear"), GROUND_BEAR);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_ground_bear"), COOKED_GROUND_BEAR);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bee_steak"), BEE_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_bee_steak"), COOKED_BEE_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "camel_steak"), CAMEL_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_camel_steak"), COOKED_CAMEL_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cat_meat"), CAT_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_cat_meat"), COOKED_CAT_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "equine_steak"), EQUINE_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_equine_steak"), COOKED_EQUINE_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "llama_steak"), LLAMA_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_llama_steak"), COOKED_LLAMA_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "ground_camel"), GROUND_CAMEL);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_ground_camel"), COOKED_GROUND_CAMEL);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "ground_llama"), GROUND_LLAMA);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_ground_llama"), COOKED_GROUND_LLAMA);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "ground_equine"), GROUND_EQUINE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_ground_equine"), COOKED_GROUND_EQUINE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "canine_steak"), CANINE_STEAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cooked_canine_steak"), COOKED_CANINE_STEAK);



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

        ItemGrouper.GroupItem(BEAR_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_GLOW_SQUID_TENTACLE)});
        ItemGrouper.GroupItem(COOKED_BEAR_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, BEAR_STEAK)});
        ItemGrouper.GroupItem(GROUND_BEAR, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_BEAR_STEAK)});
        ItemGrouper.GroupItem(COOKED_GROUND_BEAR, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, GROUND_BEAR)});

        ItemGrouper.GroupItem(BEE_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_GROUND_BEAR)});
        ItemGrouper.GroupItem(COOKED_BEE_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, BEE_STEAK)});
        ItemGrouper.GroupItem(CAMEL_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_BEE_STEAK)});
        ItemGrouper.GroupItem(COOKED_CAMEL_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, CAMEL_STEAK)});
        ItemGrouper.GroupItem(CAT_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_CAMEL_STEAK)});
        ItemGrouper.GroupItem(COOKED_CAT_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, CAT_STEAK)});
        ItemGrouper.GroupItem(EQUINE_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_CAT_STEAK)});
        ItemGrouper.GroupItem(COOKED_EQUINE_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, EQUINE_STEAK)});
        ItemGrouper.GroupItem(LLAMA_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_EQUINE_STEAK)});
        ItemGrouper.GroupItem(COOKED_LLAMA_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, LLAMA_STEAK)});

        ItemGrouper.GroupItem(GROUND_CAMEL, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_LLAMA_STEAK)});
        ItemGrouper.GroupItem(COOKED_GROUND_CAMEL, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, GROUND_CAMEL)});
        ItemGrouper.GroupItem(GROUND_LLAMA, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_GROUND_CAMEL)});
        ItemGrouper.GroupItem(COOKED_GROUND_LLAMA, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, GROUND_LLAMA)});
        ItemGrouper.GroupItem(GROUND_EQUINE, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_GROUND_LLAMA)});
        ItemGrouper.GroupItem(COOKED_GROUND_EQUINE, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, GROUND_EQUINE)});

        ItemGrouper.GroupItem(CANINE_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, COOKED_GROUND_EQUINE)});
        ItemGrouper.GroupItem(COOKED_CANINE_STEAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FOOD_AND_DRINK, CANINE_STEAK)});



    }
}
