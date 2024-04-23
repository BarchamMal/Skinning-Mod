package barch.tsm.Carcases;

import barch.tsm.Glue.ItemGrouped;
import barch.tsm.Glue.ItemGrouper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.tsm.Foods.Meat.*;
import static barch.tsm.TheSkinningMod.CARCASES_GROUP;
import static barch.tsm.TheSkinningMod.NAMESPACE;
import static barch.tsm.Carcases.AnimalByproducts.*;

public class Carcases {

    //                              HIDE
// ================================================================>

    public static final CarcaseItem COW_HIDE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/cow_hide"),
            Items.AIR
    );
    public static final CarcaseItem SOFT_HIDE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/soft_hide"),
            Items.AIR
    );
    public static final CarcaseItem BEAR_HIDE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/bear_hide"),
            Items.AIR
    );
    public static final CarcaseItem WOOLLY_HIDE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/woolly_hide"),
            Items.AIR
    );

//                               COW
// ================================================================>

    public static final CarcaseItem MEATLESS_COW_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/meatless_cow_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_COW_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/skinless_cow_carcase"),
            MEATLESS_COW_CARCASE
    );
    public static final CarcaseItem COW_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/cow_carcase"),
            SKINLESS_COW_CARCASE
    );

//                             SHEEP
// ================================================================>

    public static final CarcaseItem MEATLESS_SHEEP_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/meatless_sheep_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_SHEEP_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/skinless_sheep_carcase"),
            MEATLESS_SHEEP_CARCASE
    );
    public static final CarcaseItem SHEEP_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/sheep_carcase"),
            SKINLESS_SHEEP_CARCASE
    );

//                             CHICKEN
// ================================================================>

    public static final CarcaseItem MEATLESS_CHICKEN_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/meatless_chicken_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_CHICKEN_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/skinless_chicken_carcase"),
            MEATLESS_CHICKEN_CARCASE
    );
    public static final CarcaseItem CHICKEN_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/chicken_carcase"),
            SKINLESS_CHICKEN_CARCASE
    );

//                               PIG
// ================================================================>

    public static final CarcaseItem MEATLESS_PIG_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/meatless_pig_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_PIG_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/skinless_pig_carcase"),
            MEATLESS_PIG_CARCASE
    );
    public static final CarcaseItem PIG_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/pig_carcase"),
            SKINLESS_PIG_CARCASE
    );

//                             SALMON
// ================================================================>

    public static final CarcaseItem MEATLESS_SALMON_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/meatless_salmon_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SCALED_SALMON_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/scaled_salmon_carcase"),
            MEATLESS_SALMON_CARCASE
    );
    public static final CarcaseItem SALMON_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/salmon_carcase"),
            SCALED_SALMON_CARCASE
    );

//                                COD
// ================================================================>

    public static final CarcaseItem MEATLESS_COD_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/meatless_cod_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SCALED_COD_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/scaled_cod_carcase"),
            MEATLESS_COD_CARCASE
    );
    public static final CarcaseItem COD_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/cod_carcase"),
            SCALED_COD_CARCASE
    );

//                            TROPICAL FISH
// ================================================================>

    public static final CarcaseItem MEATLESS_TROPICAL_FISH_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/meatless_tropical_fish_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SCALED_TROPICAL_FISH_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/scaled_tropical_fish_carcase"),
            MEATLESS_TROPICAL_FISH_CARCASE
    );
    public static final CarcaseItem TROPICAL_FISH_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/tropical_fish_carcase"),
            SCALED_TROPICAL_FISH_CARCASE
    );

//                             PUFFERFISH
// ================================================================>

    public static final CarcaseItem MEATLESS_PUFFERFISH_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/meatless_pufferfish_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SCALED_PUFFERFISH_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/scaled_pufferfish_carcase"),
            MEATLESS_PUFFERFISH_CARCASE
    );
    public static final CarcaseItem PUFFERFISH_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/pufferfish_carcase"),
            SCALED_PUFFERFISH_CARCASE
    );

//                              TURTLE
// ================================================================>

    public static final CarcaseItem TURTLE_SHELL = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/turtle_shell"),
            Items.AIR
    );
    public static final CarcaseItem MEATLESS_TURTLE_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/meatless_turtle_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SHELLESS_TURTLE_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/shelless_turtle_carcase"),
            MEATLESS_TURTLE_CARCASE
    );
    public static final CarcaseItem TURTLE_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/turtle_carcase"),
            SHELLESS_TURTLE_CARCASE
    );

//                             SQUIDS
// ================================================================>

    public static final CarcaseItem SQUID_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/squid_carcase"),
            Items.AIR
    );
    public static final CarcaseItem GLOW_SQUID_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/glow_squid_carcase"),
            Items.AIR
    );
//                            POLAR BEAR
// ================================================================>

    public static final CarcaseItem MEATLESS_POLARBEAR_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/meatless_polarbear_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_POLARBEAR_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/skinless_polarbear_carcase"),
            MEATLESS_POLARBEAR_CARCASE
    );
    public static final CarcaseItem POLARBEAR_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/polarbear_carcase"),
            SKINLESS_POLARBEAR_CARCASE
    );

//                              PANDA
// ================================================================>

    public static final CarcaseItem MEATLESS_PANDA_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/meatless_panda_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_PANDA_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/skinless_panda_carcase"),
            MEATLESS_PANDA_CARCASE
    );
    public static final CarcaseItem PANDA_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/panda_carcase"),
            SKINLESS_PANDA_CARCASE
    );

//                               BEE
// ================================================================>

    public static final CarcaseItem BEE_EXOSKELETON = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/bee_exoskeleton"),
            Items.AIR
    );
    public static final CarcaseItem SHELLED_BEE_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/shelled_bee_carcase"),
            Items.AIR
    );
    public static final CarcaseItem BEE_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/bee_carcase"),
            SHELLED_BEE_CARCASE
    );

//                             EQUINE
// ================================================================>

    public static final CarcaseItem MEATLESS_EQUINE_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/meatless_equine_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_EQUINE_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/skinless_equine_carcase"),
            MEATLESS_EQUINE_CARCASE
    );
    public static final CarcaseItem HORSE_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/horse_carcase"),
            SKINLESS_EQUINE_CARCASE
    );
    public static final CarcaseItem DONKEY_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/donkey_carcase"),
            SKINLESS_EQUINE_CARCASE
    );
    public static final CarcaseItem MULE_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/mule_carcase"),
            SKINLESS_EQUINE_CARCASE
    );

//                              CAMEL
// ================================================================>

    public static final CarcaseItem MEATLESS_CAMEL_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/meatless_camel_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_CAMEL_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/skinless_camel_carcase"),
            MEATLESS_CAMEL_CARCASE
    );
    public static final CarcaseItem CAMEL_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/camel_carcase"),
            SKINLESS_CAMEL_CARCASE
    );

//                              LLAMA
// ================================================================>

    public static final CarcaseItem MEATLESS_LLAMA_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/meatless_llama_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_LLAMA_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/skinless_llama_carcase"),
            MEATLESS_LLAMA_CARCASE
    );
    public static final CarcaseItem LLAMA_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/llama_carcase"),
            SKINLESS_LLAMA_CARCASE
    );

//                               CAT
// ================================================================>

    public static final CarcaseItem MEATLESS_CAT_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/meatless_cat_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_CAT_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/skinless_cat_carcase"),
            MEATLESS_CAT_CARCASE
    );
    public static final CarcaseItem CAT_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new Identifier(NAMESPACE, "carcases/cat_carcase"),
            SKINLESS_CAT_CARCASE
    );








    public static void onInitialize() {

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cow_hide"), COW_HIDE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "soft_hide"), SOFT_HIDE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bear_hide"), BEAR_HIDE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "woolly_hide"), WOOLLY_HIDE);


        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_cow_carcase"), MEATLESS_COW_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "skinless_cow_carcase"), SKINLESS_COW_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cow_carcase"), COW_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_sheep_carcase"), MEATLESS_SHEEP_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "skinless_sheep_carcase"), SKINLESS_SHEEP_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "sheep_carcase"), SHEEP_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_pig_carcase"), MEATLESS_PIG_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "skinless_pig_carcase"), SKINLESS_PIG_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "pig_carcase"), PIG_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_chicken_carcase"), MEATLESS_CHICKEN_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "skinless_chicken_carcase"), SKINLESS_CHICKEN_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "chicken_carcase"), CHICKEN_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_salmon_carcase"), MEATLESS_SALMON_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "scaled_salmon_carcase"), SCALED_SALMON_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "salmon_carcase"), SALMON_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_cod_carcase"), MEATLESS_COD_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "scaled_cod_carcase"), SCALED_COD_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cod_carcase"), COD_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_tropical_fish_carcase"), MEATLESS_TROPICAL_FISH_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "scaled_tropical_fish_carcase"), SCALED_TROPICAL_FISH_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "tropical_fish_carcase"), TROPICAL_FISH_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_pufferfish_carcase"), MEATLESS_PUFFERFISH_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "scaled_pufferfish_carcase"), SCALED_PUFFERFISH_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "pufferfish_carcase"), PUFFERFISH_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "turtle_shell"), TURTLE_SHELL);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_turtle_carcase"), MEATLESS_TURTLE_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "shelless_turtle_carcase"), SHELLESS_TURTLE_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "turtle_carcase"), TURTLE_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "squid_carcase"), SQUID_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "glow_squid_carcase"), GLOW_SQUID_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_polarbear_carcase"), MEATLESS_POLARBEAR_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "skinless_polarbear_carcase"), SKINLESS_POLARBEAR_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "polarbear_carcase"), POLARBEAR_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_panda_carcase"), MEATLESS_PANDA_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "skinless_panda_carcase"), SKINLESS_PANDA_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "panda_carcase"), PANDA_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bee_exoskeleton"), BEE_EXOSKELETON);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "shelled_bee_carcase"), SHELLED_BEE_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bee_carcase"), BEE_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_equine_carcase"), MEATLESS_EQUINE_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "skinless_equine_carcase"), SKINLESS_EQUINE_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "horse_carcase"), HORSE_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "donkey_carcase"), DONKEY_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "mule_carcase"), MULE_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_camel_carcase"), MEATLESS_CAMEL_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "skinless_camel_carcase"), SKINLESS_CAMEL_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "camel_carcase"), CAMEL_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_llama_carcase"), MEATLESS_LLAMA_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "skinless_llama_carcase"), SKINLESS_LLAMA_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "llama_carcase"), LLAMA_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_cat_carcase"), MEATLESS_CAT_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "skinless_cat_carcase"), SKINLESS_CAT_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cat_carcase"), CAT_CARCASE);


        ItemGrouper.GroupItem(COW_HIDE, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.LEATHER)});
        ItemGrouper.GroupItem(SOFT_HIDE, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, COW_HIDE)});
        ItemGrouper.GroupItem(BEAR_HIDE, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, SOFT_HIDE)});
        ItemGrouper.GroupItem(WOOLLY_HIDE, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, BEAR_HIDE)});


        ItemGrouper.GroupItem(COW_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, Items.AIR)});
        ItemGrouper.GroupItem(SKINLESS_COW_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, COW_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_COW_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SKINLESS_COW_CARCASE)});

        ItemGrouper.GroupItem(SHEEP_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_COW_CARCASE)});
        ItemGrouper.GroupItem(SKINLESS_SHEEP_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SHEEP_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_SHEEP_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SKINLESS_SHEEP_CARCASE)});

        ItemGrouper.GroupItem(CHICKEN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_SHEEP_CARCASE)});
        ItemGrouper.GroupItem(SKINLESS_CHICKEN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, CHICKEN_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_CHICKEN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SKINLESS_CHICKEN_CARCASE)});

        ItemGrouper.GroupItem(PIG_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_CHICKEN_CARCASE)});
        ItemGrouper.GroupItem(SKINLESS_PIG_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, PIG_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_PIG_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SKINLESS_PIG_CARCASE)});

        ItemGrouper.GroupItem(PIG_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_CHICKEN_CARCASE)});
        ItemGrouper.GroupItem(SKINLESS_PIG_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, PIG_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_PIG_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SKINLESS_PIG_CARCASE)});

        ItemGrouper.GroupItem(SALMON_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_PIG_CARCASE)});
        ItemGrouper.GroupItem(SCALED_SALMON_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SALMON_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_SALMON_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SCALED_SALMON_CARCASE)});

        ItemGrouper.GroupItem(COD_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_SALMON_CARCASE)});
        ItemGrouper.GroupItem(SCALED_COD_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, COD_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_COD_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SCALED_COD_CARCASE)});

        ItemGrouper.GroupItem(TROPICAL_FISH_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_COD_CARCASE)});
        ItemGrouper.GroupItem(SCALED_TROPICAL_FISH_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, TROPICAL_FISH_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_TROPICAL_FISH_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SCALED_TROPICAL_FISH_CARCASE)});

        ItemGrouper.GroupItem(PUFFERFISH_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_TROPICAL_FISH_CARCASE)});
        ItemGrouper.GroupItem(SCALED_PUFFERFISH_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, PUFFERFISH_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_PUFFERFISH_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SCALED_PUFFERFISH_CARCASE)});

        ItemGrouper.GroupItem(TURTLE_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_PUFFERFISH_CARCASE)});
        ItemGrouper.GroupItem(SHELLESS_TURTLE_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, TURTLE_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_TURTLE_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SHELLESS_TURTLE_CARCASE)});
        ItemGrouper.GroupItem(TURTLE_SHELL, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_TURTLE_CARCASE)});

        ItemGrouper.GroupItem(SQUID_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, TURTLE_SHELL)});
        ItemGrouper.GroupItem(GLOW_SQUID_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SQUID_CARCASE)});

        ItemGrouper.GroupItem(POLARBEAR_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, GLOW_SQUID_CARCASE)});
        ItemGrouper.GroupItem(SKINLESS_POLARBEAR_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, POLARBEAR_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_POLARBEAR_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SKINLESS_POLARBEAR_CARCASE)});

        ItemGrouper.GroupItem(PANDA_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_POLARBEAR_CARCASE)});
        ItemGrouper.GroupItem(SKINLESS_PANDA_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, PANDA_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_PANDA_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SKINLESS_PANDA_CARCASE)});

        ItemGrouper.GroupItem(BEE_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_PANDA_CARCASE)});
        ItemGrouper.GroupItem(BEE_EXOSKELETON, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, BEE_CARCASE)});
        ItemGrouper.GroupItem(SHELLED_BEE_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, BEE_EXOSKELETON)});

        ItemGrouper.GroupItem(HORSE_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SHELLED_BEE_CARCASE)});
        ItemGrouper.GroupItem(DONKEY_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, HORSE_CARCASE)});
        ItemGrouper.GroupItem(MULE_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, DONKEY_CARCASE)});
        ItemGrouper.GroupItem(SKINLESS_EQUINE_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MULE_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_EQUINE_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_EQUINE_CARCASE)});

        ItemGrouper.GroupItem(CAMEL_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_EQUINE_CARCASE)});
        ItemGrouper.GroupItem(SKINLESS_CAMEL_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, CAMEL_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_CAMEL_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SKINLESS_CAMEL_CARCASE)});

        ItemGrouper.GroupItem(LLAMA_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_CAMEL_CARCASE)});
        ItemGrouper.GroupItem(SKINLESS_LLAMA_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, LLAMA_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_LLAMA_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SKINLESS_LLAMA_CARCASE)});

        ItemGrouper.GroupItem(CAT_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_LLAMA_CARCASE)});
        ItemGrouper.GroupItem(SKINLESS_CAT_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, CAT_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_CAT_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SKINLESS_CAT_CARCASE)});


    }

}