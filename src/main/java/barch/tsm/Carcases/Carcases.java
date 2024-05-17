package barch.tsm.Carcases;

import barch.tsm.Glue.ItemGrouped;
import barch.tsm.Glue.ItemGrouper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.tsm.TheSkinningMod.CARCASES_GROUP;
import static barch.tsm.TheSkinningMod.NAMESPACE;

/**
 * The Carcases class contains static final fields representing various carcase items and methods for initializing and registering them.
 * <p>
 * Each carcase item is represented as a {@link CarcaseItem} object with specific settings and dependencies.
 * The class also provides a method {@link #onInitialize()} for registering all carcase items with the game registry.
 * </p>
 * <p>
 * The carcase items are organized into different categories such as HIDE and COW.
 * Each category contains specific carcase items associated with different animals or materials.
 * </p>
 *
 * @since 1.0.0
 * @see CarcaseItem
 */
public class Carcases {

    //                            HIDE
// ================================================================>

    public static final CarcaseItem COW_HIDE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/cow_hide"),
            Items.AIR
    );
    public static final CarcaseItem SOFT_HIDE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/soft_hide"),
            Items.AIR
    );
    public static final CarcaseItem BEAR_HIDE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/bear_hide"),
            Items.AIR
    );
    public static final CarcaseItem WOOLLY_HIDE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/woolly_hide"),
            Items.AIR
    );

//                               COW
// ================================================================>

    public static final CarcaseItem MEATLESS_COW_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_cow_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_COW_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/skinless_cow_carcase"),
            MEATLESS_COW_CARCASE
    );
    public static final CarcaseItem COW_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/cow_carcase"),
            SKINLESS_COW_CARCASE
    );

//                             SHEEP
// ================================================================>

    public static final CarcaseItem MEATLESS_SHEEP_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_sheep_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_SHEEP_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/skinless_sheep_carcase"),
            MEATLESS_SHEEP_CARCASE
    );
    public static final CarcaseItem SHEEP_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/sheep_carcase"),
            SKINLESS_SHEEP_CARCASE
    );

//                             CHICKEN
// ================================================================>

    public static final CarcaseItem MEATLESS_CHICKEN_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_chicken_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_CHICKEN_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/skinless_chicken_carcase"),
            MEATLESS_CHICKEN_CARCASE
    );
    public static final CarcaseItem CHICKEN_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/chicken_carcase"),
            SKINLESS_CHICKEN_CARCASE
    );

//                               PIG
// ================================================================>

    public static final CarcaseItem MEATLESS_PIG_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_pig_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_PIG_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/skinless_pig_carcase"),
            MEATLESS_PIG_CARCASE
    );
    public static final CarcaseItem PIG_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/pig_carcase"),
            SKINLESS_PIG_CARCASE
    );

//                             SALMON
// ================================================================>

    public static final CarcaseItem MEATLESS_SALMON_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_salmon_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SCALED_SALMON_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/scaled_salmon_carcase"),
            MEATLESS_SALMON_CARCASE
    );
    public static final CarcaseItem SALMON_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/salmon_carcase"),
            SCALED_SALMON_CARCASE
    );

//                                COD
// ================================================================>

    public static final CarcaseItem MEATLESS_COD_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_cod_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SCALED_COD_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/scaled_cod_carcase"),
            MEATLESS_COD_CARCASE
    );
    public static final CarcaseItem COD_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/cod_carcase"),
            SCALED_COD_CARCASE
    );

//                            TROPICAL FISH
// ================================================================>

    public static final CarcaseItem MEATLESS_TROPICAL_FISH_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_tropical_fish_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SCALED_TROPICAL_FISH_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/scaled_tropical_fish_carcase"),
            MEATLESS_TROPICAL_FISH_CARCASE
    );
    public static final CarcaseItem TROPICAL_FISH_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/tropical_fish_carcase"),
            SCALED_TROPICAL_FISH_CARCASE
    );

//                             PUFFERFISH
// ================================================================>

    public static final CarcaseItem MEATLESS_PUFFERFISH_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_pufferfish_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SCALED_PUFFERFISH_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/scaled_pufferfish_carcase"),
            MEATLESS_PUFFERFISH_CARCASE
    );
    public static final CarcaseItem PUFFERFISH_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/pufferfish_carcase"),
            SCALED_PUFFERFISH_CARCASE
    );

//                              TURTLE
// ================================================================>

    public static final CarcaseItem TURTLE_SHELL = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/turtle_shell"),
            Items.AIR
    );
    public static final CarcaseItem MEATLESS_TURTLE_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_turtle_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SHELLESS_TURTLE_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/shelless_turtle_carcase"),
            MEATLESS_TURTLE_CARCASE
    );
    public static final CarcaseItem TURTLE_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/turtle_carcase"),
            SHELLESS_TURTLE_CARCASE
    );

//                             SQUIDS
// ================================================================>

    public static final CarcaseItem SQUID_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/squid_carcase"),
            Items.AIR
    );
    public static final CarcaseItem GLOW_SQUID_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/glow_squid_carcase"),
            Items.AIR
    );
//                            POLAR BEAR
// ================================================================>

    public static final CarcaseItem MEATLESS_POLARBEAR_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_polarbear_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_POLARBEAR_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/skinless_polarbear_carcase"),
            MEATLESS_POLARBEAR_CARCASE
    );
    public static final CarcaseItem POLARBEAR_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/polarbear_carcase"),
            SKINLESS_POLARBEAR_CARCASE
    );

//                              PANDA
// ================================================================>

    public static final CarcaseItem MEATLESS_PANDA_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_panda_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_PANDA_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/skinless_panda_carcase"),
            MEATLESS_PANDA_CARCASE
    );
    public static final CarcaseItem PANDA_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/panda_carcase"),
            SKINLESS_PANDA_CARCASE
    );

//                               BEE
// ================================================================>

    public static final CarcaseItem BEE_EXOSKELETON = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/bee_exoskeleton"),
            Items.AIR
    );
    public static final CarcaseItem SHELLED_BEE_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/shelled_bee_carcase"),
            Items.AIR
    );
    public static final CarcaseItem BEE_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/bee_carcase"),
            SHELLED_BEE_CARCASE
    );

//                             EQUINE
// ================================================================>

    public static final CarcaseItem MEATLESS_EQUINE_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_equine_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_EQUINE_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/skinless_equine_carcase"),
            MEATLESS_EQUINE_CARCASE
    );
    public static final CarcaseItem HORSE_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/horse_carcase"),
            SKINLESS_EQUINE_CARCASE
    );
    public static final CarcaseItem DONKEY_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/donkey_carcase"),
            SKINLESS_EQUINE_CARCASE
    );
    public static final CarcaseItem MULE_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/mule_carcase"),
            SKINLESS_EQUINE_CARCASE
    );

//                              CAMEL
// ================================================================>

    public static final CarcaseItem MEATLESS_CAMEL_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_camel_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_CAMEL_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/skinless_camel_carcase"),
            MEATLESS_CAMEL_CARCASE
    );
    public static final CarcaseItem CAMEL_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/camel_carcase"),
            SKINLESS_CAMEL_CARCASE
    );

//                              LLAMA
// ================================================================>

    public static final CarcaseItem MEATLESS_LLAMA_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_llama_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_LLAMA_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/skinless_llama_carcase"),
            MEATLESS_LLAMA_CARCASE
    );
    public static final CarcaseItem LLAMA_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/llama_carcase"),
            SKINLESS_LLAMA_CARCASE
    );

//                               CAT
// ================================================================>

    public static final CarcaseItem MEATLESS_CAT_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_cat_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_CAT_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/skinless_cat_carcase"),
            MEATLESS_CAT_CARCASE
    );
    public static final CarcaseItem CAT_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/cat_carcase"),
            SKINLESS_CAT_CARCASE
    );

//                               FOX
// ================================================================>

    public static final CarcaseItem MEATLESS_FOX_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_fox_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_FOX_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/skinless_fox_carcase"),
            MEATLESS_FOX_CARCASE
    );
    public static final CarcaseItem FOX_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/fox_carcase"),
            SKINLESS_FOX_CARCASE
    );

//                                WOLF
// ================================================================>

    public static final CarcaseItem MEATLESS_WOLF_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_wolf_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_WOLF_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/skinless_wolf_carcase"),
            MEATLESS_WOLF_CARCASE
    );
    public static final CarcaseItem WOLF_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/wolf_carcase"),
            SKINLESS_WOLF_CARCASE
    );

//                             SKELETON
// ================================================================>

    public static final CarcaseItem WITHER_SKELETON_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/wither_skeleton_carcase"),
            Items.AIR
    );
    public static final CarcaseItem STRAY_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/stray_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKELETON_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/skeleton_carcase"),
            Items.AIR
    );
//                              SLIMES
// ================================================================>

    public static final CarcaseItem MAGMA_CUBE_CARCASE = new CarcaseItem(
            new Item.Settings().fireproof(),
            new Identifier(NAMESPACE, "carcases/magma_cube_carcase"),
            Items.AIR
    );

//                             PIGLIN
// ================================================================>

    public static final CarcaseItem PIGLIN_CARCASE = new CarcaseItem(
            new Item.Settings().fireproof(),
            new Identifier(NAMESPACE, "carcases/piglin_carcase"),
            SKELETON_CARCASE
    );
    public static final CarcaseItem ZOMBIFIED_PIGLIN_CARCASE = new CarcaseItem(
            new Item.Settings().fireproof(),
            new Identifier(NAMESPACE, "carcases/zombified_piglin_carcase"),
            SKELETON_CARCASE
    );

//                             GHAST
// ================================================================>

    public static final CarcaseItem GHAST_CARCASE = new CarcaseItem(
            new Item.Settings().fireproof(),
            new Identifier(NAMESPACE, "carcases/ghast_carcase"),
            Items.AIR
    );

//                             HOGLIN
// ================================================================>
    public static final CarcaseItem MEATLESS_HOGLIN_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_hoglin_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_HOGLIN_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/skinless_hoglin_carcase"),
            MEATLESS_HOGLIN_CARCASE
    );
    public static final CarcaseItem ZOGLIN_CARCASE = new CarcaseItem(
            new Item.Settings().fireproof(),
            new Identifier(NAMESPACE, "carcases/zoglin_carcase"),
            MEATLESS_HOGLIN_CARCASE
    );
    public static final CarcaseItem HOGLIN_CARCASE = new CarcaseItem(
            new Item.Settings().fireproof(),
            new Identifier(NAMESPACE, "carcases/hoglin_carcase"),
            SKINLESS_HOGLIN_CARCASE
    );

//                             STRIDER
// ================================================================>
    public static final CarcaseItem MEATLESS_STRIDER_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_strider_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_STRIDER_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/skinless_strider_carcase"),
            MEATLESS_STRIDER_CARCASE
    );
    public static final CarcaseItem STRIDER_CARCASE = new CarcaseItem(
            new Item.Settings().fireproof(),
            new Identifier(NAMESPACE, "carcases/strider_carcase"),
            SKINLESS_STRIDER_CARCASE
    );
//                             WITHER
// ================================================================>

    public static final CarcaseItem WITHER_CARCASE = new CarcaseItem(
            new Item.Settings().fireproof(),
            new Identifier(NAMESPACE, "carcases/wither_carcase"),
            Items.AIR
    );
//                             BLAZE
// ================================================================>

    public static final CarcaseItem BLAZE_CARCASE = new CarcaseItem(
            new Item.Settings().fireproof(),
            new Identifier(NAMESPACE, "carcases/blaze_carcase"),
            Items.AIR
    );
//                             AXOLOTL
// ================================================================>

    public static final CarcaseItem AXOLOTL_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/axolotl_carcase"),
            Items.AIR
    );
//                              FROG
// ================================================================>

    public static final CarcaseItem FROG_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/frog_carcase"),
            Items.AIR
    );
//                             DOLPHIN
// ================================================================>

    public static final CarcaseItem MEATLESS_DOLPHIN_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_dolphin_carcase"),
            Items.AIR
    );
    public static final CarcaseItem DOLPHIN_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/dolphin_carcase"),
            MEATLESS_DOLPHIN_CARCASE
    );
//                             GUARDIAN
// ================================================================>

    public static final CarcaseItem MEATLESS_GUARDIAN_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_guardian_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SCALED_GUARDIAN_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/scaled_guardian_carcase"),
            MEATLESS_GUARDIAN_CARCASE
    );
    public static final CarcaseItem GUARDIAN_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/guardian_carcase"),
            SCALED_GUARDIAN_CARCASE
    );
//                          ELDER GUARDIAN
// ================================================================>

    public static final CarcaseItem MEATLESS_ELDER_GUARDIAN_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/meatless_elder_guardian_carcase"),
            Items.AIR
    );
    public static final CarcaseItem SCALED_ELDER_GUARDIAN_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/scaled_elder_guardian_carcase"),
            MEATLESS_ELDER_GUARDIAN_CARCASE
    );
    public static final CarcaseItem ELDER_GUARDIAN_CARCASE = new CarcaseItem(
            new Item.Settings(),
            new Identifier(NAMESPACE, "carcases/elder_guardian_carcase"),
            SCALED_ELDER_GUARDIAN_CARCASE
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

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_fox_carcase"), MEATLESS_FOX_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "skinless_fox_carcase"), SKINLESS_FOX_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "fox_carcase"), FOX_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_wolf_carcase"), MEATLESS_WOLF_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "skinless_wolf_carcase"), SKINLESS_WOLF_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "wolf_carcase"), WOLF_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "magma_cube_carcase"), MAGMA_CUBE_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "piglin_carcase"), PIGLIN_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "zombified_piglin_carcase"), ZOMBIFIED_PIGLIN_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "ghast_carcase"), GHAST_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "wither_skeleton_carcase"), WITHER_SKELETON_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "stray_carcase"), STRAY_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "skeleton_carcase"), SKELETON_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "hoglin_carcase"), HOGLIN_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "skinless_hoglin_carcase"), SKINLESS_HOGLIN_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_hoglin_carcase"), MEATLESS_HOGLIN_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "zoglin_carcase"), ZOGLIN_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "strider_carcase"), STRIDER_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "skinless_strider_carcase"), SKINLESS_STRIDER_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_strider_carcase"), MEATLESS_STRIDER_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "wither_carcase"), WITHER_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "blaze_carcase"), BLAZE_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "axolotl_carcase"), AXOLOTL_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "frog_carcase"), FROG_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "dolphin_carcase"), DOLPHIN_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_dolphin_carcase"), MEATLESS_DOLPHIN_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "guardian_carcase"), GUARDIAN_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "scaled_guardian_carcase"), SCALED_GUARDIAN_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_guardian_carcase"), MEATLESS_GUARDIAN_CARCASE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "elder_guardian_carcase"), ELDER_GUARDIAN_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "scaled_elder_guardian_carcase"), SCALED_ELDER_GUARDIAN_CARCASE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "meatless_elder_guardian_carcase"), MEATLESS_ELDER_GUARDIAN_CARCASE);



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

        ItemGrouper.GroupItem(FOX_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_CAT_CARCASE)});
        ItemGrouper.GroupItem(SKINLESS_FOX_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, FOX_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_FOX_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SKINLESS_FOX_CARCASE)});

        ItemGrouper.GroupItem(WOLF_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_FOX_CARCASE)});
        ItemGrouper.GroupItem(SKINLESS_WOLF_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, WOLF_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_WOLF_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SKINLESS_WOLF_CARCASE)});

        ItemGrouper.GroupItem(MAGMA_CUBE_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_WOLF_CARCASE)});

        ItemGrouper.GroupItem(PIGLIN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MAGMA_CUBE_CARCASE)});
        ItemGrouper.GroupItem(ZOMBIFIED_PIGLIN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, PIGLIN_CARCASE)});

        ItemGrouper.GroupItem(GHAST_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, ZOMBIFIED_PIGLIN_CARCASE)});

        ItemGrouper.GroupItem(WITHER_SKELETON_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, GHAST_CARCASE)});
        ItemGrouper.GroupItem(STRAY_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, WITHER_SKELETON_CARCASE)});
        ItemGrouper.GroupItem(SKELETON_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, STRAY_CARCASE)});

        ItemGrouper.GroupItem(HOGLIN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SKELETON_CARCASE)});
        ItemGrouper.GroupItem(SKINLESS_HOGLIN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, HOGLIN_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_HOGLIN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SKINLESS_HOGLIN_CARCASE)});
        ItemGrouper.GroupItem(ZOGLIN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_HOGLIN_CARCASE)});

        ItemGrouper.GroupItem(STRIDER_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, ZOGLIN_CARCASE)});
        ItemGrouper.GroupItem(SKINLESS_STRIDER_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, STRIDER_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_STRIDER_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SKINLESS_STRIDER_CARCASE)});

        ItemGrouper.GroupItem(WITHER_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_STRIDER_CARCASE)});

        ItemGrouper.GroupItem(BLAZE_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, WITHER_CARCASE)});

        ItemGrouper.GroupItem(AXOLOTL_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, BLAZE_CARCASE)});

        ItemGrouper.GroupItem(FROG_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, AXOLOTL_CARCASE)});

        ItemGrouper.GroupItem(DOLPHIN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, FROG_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_DOLPHIN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, DOLPHIN_CARCASE)});

        ItemGrouper.GroupItem(GUARDIAN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_DOLPHIN_CARCASE)});
        ItemGrouper.GroupItem(SCALED_GUARDIAN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, GUARDIAN_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_GUARDIAN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SCALED_GUARDIAN_CARCASE)});

        ItemGrouper.GroupItem(ELDER_GUARDIAN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, MEATLESS_GUARDIAN_CARCASE)});
        ItemGrouper.GroupItem(SCALED_ELDER_GUARDIAN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, ELDER_GUARDIAN_CARCASE)});
        ItemGrouper.GroupItem(MEATLESS_ELDER_GUARDIAN_CARCASE, new ItemGrouped[]{new ItemGrouped(CARCASES_GROUP, SCALED_ELDER_GUARDIAN_CARCASE)});



    }

}