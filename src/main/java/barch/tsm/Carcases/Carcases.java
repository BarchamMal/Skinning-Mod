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

    }

}