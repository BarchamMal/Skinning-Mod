package barch.tsm.Carcases;

import barch.tsm.Glue.ItemGrouped;
import barch.tsm.Glue.ItemGrouper;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.tsm.TheSkinningMod.*;

public class AnimalByproducts {

    public static final Item FISH_SCALES = new Item(new Item.Settings());
    public static final Item INTESTINE = new Item(new Item.Settings());
    public static final Item COLORFUL_FISH_SCALES = new Item(new Item.Settings());
    public static final Item PUFFERFISH_SPIKE = new Item(new Item.Settings());
    public static final Item LARGE_SCUTE = new Item(new Item.Settings());
    public static final Item FUR = new Item(new Item.Settings());
    public static final Item ECTOPLASM = new Item(new Item.Settings());
    public static final Item WITHER_BONE = new Item(new Item.Settings());
    public static final Item WHITE_SCUTE = new Item(new Item.Settings());
    public static final Item GUARDIAN_SPIKE = new Item(new Item.Settings());
    public static final Item ELDER_GUARDIAN_SPIKE = new Item(new Item.Settings());

    public static final Item STINGER = new Item(new Item.Settings());

    public static void onInitialize() {

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "fish_scales"), FISH_SCALES);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "intestine"), INTESTINE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "colorful_fish_scales"), COLORFUL_FISH_SCALES);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "pufferfish_spike"), PUFFERFISH_SPIKE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "large_scute"), LARGE_SCUTE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "fur"), FUR);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "ectoplasm"), ECTOPLASM);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "wither_bone"), WITHER_BONE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "white_scute"), WHITE_SCUTE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "guardian_spike"), GUARDIAN_SPIKE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "elder_guardian_spike"), ELDER_GUARDIAN_SPIKE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "stinger"), STINGER);

        ItemGrouper.GroupItem(FISH_SCALES, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, Items.AIR)});
        ItemGrouper.GroupItem(INTESTINE, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, FISH_SCALES)});
        ItemGrouper.GroupItem(COLORFUL_FISH_SCALES, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, INTESTINE)});
        ItemGrouper.GroupItem(PUFFERFISH_SPIKE, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, COLORFUL_FISH_SCALES)});
        ItemGrouper.GroupItem(LARGE_SCUTE, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, PUFFERFISH_SPIKE)});
        ItemGrouper.GroupItem(FUR, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, LARGE_SCUTE)});
        ItemGrouper.GroupItem(ECTOPLASM, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, FUR)});
        ItemGrouper.GroupItem(WITHER_BONE, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, ECTOPLASM)});
        ItemGrouper.GroupItem(WHITE_SCUTE, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, WITHER_BONE)});
        ItemGrouper.GroupItem(GUARDIAN_SPIKE, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, WHITE_SCUTE)});
        ItemGrouper.GroupItem(ELDER_GUARDIAN_SPIKE, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, GUARDIAN_SPIKE)});
        ItemGrouper.GroupItem(STINGER, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, ELDER_GUARDIAN_SPIKE)});

    }

}
