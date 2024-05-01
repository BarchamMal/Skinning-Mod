package barch.tsm.Armor;

import barch.tsm.Glue.ItemGrouped;
import barch.tsm.Glue.ItemGrouper;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.tsm.TheSkinningMod.*;
import static net.minecraft.item.ItemGroups.INGREDIENTS;

public class ArmorItems {

    public static final Item SALVAGED_FISH_SCALES = new Item(new Item.Settings());
    public static final Item SALVAGED_COLORFUL_FISH_SCALES = new Item(new Item.Settings());
    public static final Item LARGE_FISH_SCALE = new Item(new Item.Settings());
    public static final Item LARGE_COLORFUL_FISH_SCALE = new Item(new Item.Settings());


    public static void onInitialize() {

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "salvaged_fish_scales"), SALVAGED_FISH_SCALES);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "salvaged_colorful_fish_scales"), SALVAGED_COLORFUL_FISH_SCALES);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "large_fish_scale"), LARGE_FISH_SCALE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "large_colorful_fish_scale"), LARGE_COLORFUL_FISH_SCALE);

        ItemGrouper.GroupItem(SALVAGED_FISH_SCALES, new ItemGrouped[]{new ItemGrouped(INGREDIENTS, Items.NETHERITE_INGOT)});
        ItemGrouper.GroupItem(SALVAGED_COLORFUL_FISH_SCALES, new ItemGrouped[]{new ItemGrouped(INGREDIENTS, SALVAGED_FISH_SCALES)});
        ItemGrouper.GroupItem(LARGE_FISH_SCALE, new ItemGrouped[]{new ItemGrouped(INGREDIENTS, SALVAGED_COLORFUL_FISH_SCALES)});
        ItemGrouper.GroupItem(LARGE_COLORFUL_FISH_SCALE, new ItemGrouped[]{new ItemGrouped(INGREDIENTS, LARGE_FISH_SCALE)});

    }

}
