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
            new ItemCut[] {new ItemCut(Items.LEATHER, 32)},
            Items.AIR
    );
    public static final CarcaseItem SOFT_HIDE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(Items.LEATHER, 8)},
            Items.AIR
    );

    //                               COW
    // ================================================================>

    public static final CarcaseItem MEATLESS_COW_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(Items.BONE, 12)},
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_COW_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(Items.BEEF, 32), new ItemCut(RIB, 2), new ItemCut(TONGUE, 1), new ItemCut(LIVER, 1), new ItemCut(GROUND_BEEF, 32)},
            MEATLESS_COW_CARCASE
    );
    public static final CarcaseItem COW_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(COW_HIDE, 1)},
            SKINLESS_COW_CARCASE
    );

    //                             SHEEP
    // ================================================================>

    public static final CarcaseItem MEATLESS_SHEEP_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(Items.BONE, 8)},
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_SHEEP_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(Items.MUTTON, 24), new ItemCut(RIB, 2), new ItemCut(GROUND_MUTTON, 24)},
            MEATLESS_SHEEP_CARCASE
    );
    public static final CarcaseItem SHEEP_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(SOFT_HIDE, 1)},
            SKINLESS_SHEEP_CARCASE
    );

    //                             CHICKEN
    // ================================================================>

    public static final CarcaseItem MEATLESS_CHICKEN_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(Items.BONE, 2), new ItemCut(Items.BONE_MEAL, 3)},
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_CHICKEN_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(Items.CHICKEN, 1), new ItemCut(CHICKEN_LEG, 2), new ItemCut(CHICKEN_WING, 2)},
            MEATLESS_CHICKEN_CARCASE
    );
    public static final CarcaseItem CHICKEN_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(Items.FEATHER, 32)},
            SKINLESS_CHICKEN_CARCASE
    );

    //                               PIG
    // ================================================================>

    public static final CarcaseItem MEATLESS_PIG_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(Items.BONE, 8)},
            Items.AIR
    );
    public static final CarcaseItem SKINLESS_PIG_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(Items.PORKCHOP, 24), new ItemCut(RIB, 2), new ItemCut(GROUND_PORK, 24), new ItemCut(BACON, 8), new ItemCut(HAM, 4)},
            MEATLESS_PIG_CARCASE
    );
    public static final CarcaseItem PIG_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(SOFT_HIDE, 1)},
            SKINLESS_PIG_CARCASE
    );

    //                             SALMON
    // ================================================================>

    public static final CarcaseItem MEATLESS_SALMON_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(Items.BONE, 2), new ItemCut(Items.BONE_MEAL, 3)},
            Items.AIR
    );
    public static final CarcaseItem SCALED_SALMON_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(SALMON_STEAK, 8), new ItemCut(INTESTINE, 2)},
            MEATLESS_SALMON_CARCASE
    );
    public static final CarcaseItem SALMON_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(FISH_SCALES, 8)},
            SCALED_SALMON_CARCASE
    );

    //                                COD
    // ================================================================>

    public static final CarcaseItem MEATLESS_COD_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(Items.BONE, 2), new ItemCut(Items.BONE_MEAL, 3)},
            Items.AIR
    );
    public static final CarcaseItem SCALED_COD_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(COD_STEAK, 8), new ItemCut(INTESTINE, 2)},
            MEATLESS_COD_CARCASE
    );
    public static final CarcaseItem COD_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(FISH_SCALES, 8)},
            SCALED_COD_CARCASE
    );

    //                            TROPICAL FISH
    // ================================================================>

    public static final CarcaseItem MEATLESS_TROPICAL_FISH_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(Items.BONE, 2), new ItemCut(Items.BONE_MEAL, 3)},
            Items.AIR
    );
    public static final CarcaseItem SCALED_TROPICAL_FISH_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(TROPICAL_FISH_STEAK, 8), new ItemCut(INTESTINE, 2)},
            MEATLESS_TROPICAL_FISH_CARCASE
    );
    public static final CarcaseItem TROPICAL_FISH_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(COLORFUL_FISH_SCALES, 8)},
            SCALED_TROPICAL_FISH_CARCASE
    );

    //                             PUFFERFISH
    // ================================================================>

    public static final CarcaseItem MEATLESS_PUFFERFISH_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(Items.BONE, 2), new ItemCut(Items.BONE_MEAL, 3)},
            Items.AIR
    );
    public static final CarcaseItem SCALED_PUFFERFISH_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(PUFFERFISH_STEAK, 4),new ItemCut(POISONOUS_FISH_STEAK, 2), new ItemCut(INTESTINE, 2)},
            MEATLESS_PUFFERFISH_CARCASE
    );
    public static final CarcaseItem PUFFERFISH_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(PUFFERFISH_SPIKE, 16)},
            SCALED_PUFFERFISH_CARCASE
    );

    //                              TURTLE
    // ================================================================>

    public static final CarcaseItem TURTLE_SHELL = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(LARGE_SCUTE, 14)},
            Items.AIR
    );
    public static final CarcaseItem MEATLESS_TURTLE_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(Items.BONE, 12)},
            Items.AIR
    );
    public static final CarcaseItem SHELLESS_TURTLE_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(TURTLE_STEAK, 48), new ItemCut(INTESTINE, 14)},
            MEATLESS_TURTLE_CARCASE
    );
    public static final CarcaseItem TURTLE_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(TURTLE_SHELL, 1)},
            SHELLESS_TURTLE_CARCASE
    );

    //                             SQUIDS
    // ================================================================>

    public static final CarcaseItem SQUID_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(SQUID_TENTACLE, 10), new ItemCut(Items.INK_SAC, 4)},
            Items.AIR
    );
    public static final CarcaseItem GLOW_SQUID_CARCASE = new CarcaseItem(
            new FabricItemSettings(),
            new ItemCut[] {new ItemCut(GLOW_SQUID_TENTACLE, 10), new ItemCut(Items.GLOW_INK_SAC, 4)},
            Items.AIR
    );




    public static void onInitialize() {

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "cow_hide"), COW_HIDE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "soft_hide"), SOFT_HIDE);


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





        ItemGrouper.GroupItem(COW_HIDE, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.LEATHER)});
        ItemGrouper.GroupItem(SOFT_HIDE, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, COW_HIDE)});


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

    }

}