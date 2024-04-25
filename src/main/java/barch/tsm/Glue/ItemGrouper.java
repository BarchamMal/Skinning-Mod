package barch.tsm.Glue;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import static barch.tsm.TheSkinningMod.TSM_GROUP;
/**
 * The ItemGrouper class provides methods for grouping items and blocks into item groups.
 * <p>
 * This class contains static methods for grouping items and blocks into specified item groups.
 * </p>
 *
 * @since 1.0.0
 * @see Item
 * @see Block
 */
public class ItemGrouper {

    // Methods
    // ---------------------------------------------------------------

    /**
     * Groups the specified item into the specified item groups.
     *
     * @param item   The item to group.
     * @param groups An array of {@link ItemGrouped} objects representing the item groups to add the item to.
     */
    public static void GroupItem(Item item, ItemGrouped[] groups) {

        ItemGroupEvents.modifyEntriesEvent(TSM_GROUP).register(content -> {
            content.add(item);
        });

        for (ItemGrouped group: groups) {

            ItemGroupEvents.modifyEntriesEvent(group.group).register(content -> {
                content.addAfter(group.getItem(), item);
            });
        }

    }

    /**
     * Groups the specified block into the specified item groups.
     *
     * @param item  The block to group.
     * @param groups An array of {@link ItemGrouped} objects representing the item groups to add the block to.
     */
    public static void GroupItem(Block item, ItemGrouped[] groups) {

        ItemGroupEvents.modifyEntriesEvent(TSM_GROUP).register(content -> {
            content.add(item);
        });

        for (ItemGrouped group: groups) {

            ItemGroupEvents.modifyEntriesEvent(group.group).register(content -> {
                content.addAfter(group.getItem(), item);
            });
        }

    }

}
