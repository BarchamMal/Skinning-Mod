package barch.tsm.Carcases;

import barch.tsm.Glue.ItemGrouped;
import barch.tsm.Glue.ItemGrouper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.tsm.TheSkinningMod.*;

public class AnimalByproducts {

    public static final Item FISH_SCALES = new Item(new FabricItemSettings());
    public static final Item INTESTINE = new Item(new FabricItemSettings());
    public static final Item COLORFUL_FISH_SCALES = new Item(new FabricItemSettings());
    public static final Item PUFFERFISH_SPIKE = new Item(new FabricItemSettings());
    public static final Item LARGE_SCUTE = new Item(new FabricItemSettings());

    public static void onInitialize() {

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "fish_scales"), FISH_SCALES);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "intestine"), INTESTINE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "colorful_fish_scales"), COLORFUL_FISH_SCALES);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "pufferfish_spike"), PUFFERFISH_SPIKE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "large_scute"), LARGE_SCUTE);


        ItemGrouper.GroupItem(FISH_SCALES, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, Items.AIR)});
        ItemGrouper.GroupItem(INTESTINE, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, FISH_SCALES)});
        ItemGrouper.GroupItem(COLORFUL_FISH_SCALES, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, INTESTINE)});
        ItemGrouper.GroupItem(PUFFERFISH_SPIKE, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, COLORFUL_FISH_SCALES)});
        ItemGrouper.GroupItem(LARGE_SCUTE, new ItemGrouped[]{new ItemGrouped(BYPRODUCTS_GROUP, PUFFERFISH_SPIKE)});

    }

}
