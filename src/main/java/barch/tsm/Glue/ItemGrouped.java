package barch.tsm.Glue;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

/**
 * The ItemGrouped class represents an item or block grouped with a specific {@link ItemGroup}.
 * <p>
 * This class provides constructors and methods to associate items or blocks with their respective item groups.
 * </p>
 *
 * @since 1.0.0
 */
public class ItemGrouped {

    // Fields
    // ---------------------------------------------------------------

    /** The registry key of the item group. */
    public RegistryKey<ItemGroup> group = null;

    /** The item associated with the group. */
    public Item item = null;

    /** The block associated with the group. */
    public Block block = null;

    // Constructors
    // ---------------------------------------------------------------

    /**
     * Constructs an ItemGrouped instance with the specified item and item group.
     *
     * @param group The registry key of the item group.
     * @param item  The item associated with the item group.
     */
    public ItemGrouped(RegistryKey<ItemGroup> group, Item item) {
        this.group = group;
        this.item = item;
    }

    /**
     * Constructs an ItemGrouped instance with the specified block and item group.
     *
     * @param group The registry key of the item group.
     * @param block The block associated with the item group.
     */
    public ItemGrouped(RegistryKey<ItemGroup> group, Block block) {
        this.group = group;
        this.block = block;
    }    // Methods
    // ---------------------------------------------------------------

    /**
     * Returns the item associated with the item group.
     *
     * @return The item associated with the item group, or the block's item form if no item is specified.
     */
    public Item getItem() {
        if (this.item != null) {
            return this.item;
        }
        return block.asItem();
    }

}
