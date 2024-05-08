package barch.tsm.Armor;

import barch.tsm.Glue.ItemGrouped;
import barch.tsm.Glue.ItemGrouper;
import net.minecraft.item.ArmorItem;
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

    public static final Item GLUE = new Item(new Item.Settings());
    public static final Item STRAP = new Item(new Item.Settings());
    public static final Item CHISEL = new Item(new Item.Settings());
    public static final Item EMPTY_UPGRADE_KIT = new Item(new Item.Settings());

    public static final UpgradeKitItem IRON_UPGRADE_KIT = new UpgradeKitItem(
        new Item.Settings(),
        "minecraft:leather",
        new Item[] {
            Items.IRON_BOOTS,
            Items.IRON_LEGGINGS,
            Items.IRON_CHESTPLATE,
            Items.IRON_HELMET
        }
    );
    public static final UpgradeKitItem GOLD_UPGRADE_KIT = new UpgradeKitItem(
            new Item.Settings(),
            "minecraft:leather",
            new Item[] {
                    Items.GOLDEN_BOOTS,
                    Items.GOLDEN_LEGGINGS,
                    Items.GOLDEN_CHESTPLATE,
                    Items.GOLDEN_HELMET
            }
    );
    public static final UpgradeKitItem DIAMOND_UPGRADE_KIT = new UpgradeKitItem(
            new Item.Settings(),
            "minecraft:iron",
            new Item[] {
                    Items.DIAMOND_BOOTS,
                    Items.DIAMOND_LEGGINGS,
                    Items.DIAMOND_CHESTPLATE,
                    Items.DIAMOND_HELMET
            }
    );


    public static void onInitialize() {

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "salvaged_fish_scales"), SALVAGED_FISH_SCALES);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "salvaged_colorful_fish_scales"), SALVAGED_COLORFUL_FISH_SCALES);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "large_fish_scale"), LARGE_FISH_SCALE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "large_colorful_fish_scale"), LARGE_COLORFUL_FISH_SCALE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "glue"), GLUE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "strap"), STRAP);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "chisel"), CHISEL);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "empty_upgrade_kit"), EMPTY_UPGRADE_KIT);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "iron_upgrade_kit"), IRON_UPGRADE_KIT);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "gold_upgrade_kit"), GOLD_UPGRADE_KIT);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "diamond_upgrade_kit"), DIAMOND_UPGRADE_KIT);

        ItemGrouper.GroupItem(SALVAGED_FISH_SCALES, new ItemGrouped[]{new ItemGrouped(INGREDIENTS, Items.NETHERITE_INGOT)});
        ItemGrouper.GroupItem(SALVAGED_COLORFUL_FISH_SCALES, new ItemGrouped[]{new ItemGrouped(INGREDIENTS, SALVAGED_FISH_SCALES)});
        ItemGrouper.GroupItem(LARGE_FISH_SCALE, new ItemGrouped[]{new ItemGrouped(INGREDIENTS, SALVAGED_COLORFUL_FISH_SCALES)});
        ItemGrouper.GroupItem(LARGE_COLORFUL_FISH_SCALE, new ItemGrouped[]{new ItemGrouped(INGREDIENTS, LARGE_FISH_SCALE)});

        ItemGrouper.GroupItem(GLUE, new ItemGrouped[]{new ItemGrouped(INGREDIENTS, LARGE_COLORFUL_FISH_SCALE)});
        ItemGrouper.GroupItem(STRAP, new ItemGrouped[]{new ItemGrouped(INGREDIENTS, GLUE)});
        ItemGrouper.GroupItem(CHISEL, new ItemGrouped[]{new ItemGrouped(INGREDIENTS, STRAP)});

        ItemGrouper.GroupItem(EMPTY_UPGRADE_KIT, new ItemGrouped[]{new ItemGrouped(INGREDIENTS, CHISEL)});
        ItemGrouper.GroupItem(IRON_UPGRADE_KIT, new ItemGrouped[]{new ItemGrouped(INGREDIENTS, EMPTY_UPGRADE_KIT)});
        ItemGrouper.GroupItem(GOLD_UPGRADE_KIT, new ItemGrouped[]{new ItemGrouped(INGREDIENTS, IRON_UPGRADE_KIT)});
        ItemGrouper.GroupItem(DIAMOND_UPGRADE_KIT, new ItemGrouped[]{new ItemGrouped(INGREDIENTS, GOLD_UPGRADE_KIT)});

    }

}
