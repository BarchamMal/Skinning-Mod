package barch.tsm.Carcases;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.loot.context.LootContextTypes;
import java.util.List;

import static barch.tsm.Tags.KNIVES;

/**
 * The CarcaseItem class represents an item that can be used to obtain loot drops from a specified loot table.
 * <p>
 * This class extends {@link Item} and overrides the {@link #use(World, PlayerEntity, Hand)} method to define custom behavior
 * when the item is used by a player.
 * </p>
 * <p>
 * When a player uses this item, loot is generated from the specified loot table and added to the player's inventory.
 * The number of loot drops generated depends on the count of the carcase item in the player's hand.
 * </p>
 *
 * @since 1.0.0
 * @see Item
 */
public class CarcaseItem extends Item {

    // Fields
    // ---------------------------------------------------------------

    private Identifier lootTableId;
    private Item giveBack;

    // Constructor
    // ---------------------------------------------------------------

    /**
     * Constructs a new CarcaseItem with the specified settings, loot table identifier, and item to give back.
     *
     * @param settings    The settings for the item.
     * @param lootTableId The identifier of the loot table to use for generating loot drops.
     * @param giveBack    The item to give back to the player after generating loot drops.
     */
    public CarcaseItem(Settings settings, Identifier lootTableId, Item giveBack) {
        super(settings);
        this.lootTableId = lootTableId;
        this.giveBack = giveBack;
    }

    // Methods
    // ---------------------------------------------------------------

    /**
     * Handles the logic when the player uses the carcase item.
     *
     * @param world The world in which the player uses the item.
     * @param user  The player who uses the item.
     * @param hand  The hand in which the player holds the item.
     * @return A {@link TypedActionResult} representing the result of using the item.
     */
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        if (!(world instanceof ServerWorld)) {
            return TypedActionResult.fail(user.getStackInHand(hand));
        }

        super.use(world, user, hand);

        // Logic for if the player has a carcase in main hand and in offhand.
        ItemStack itemStack = this.getDefaultStack();
        itemStack.setCount(user.getStackInHand(hand).getCount());

        if (!(user.getMainHandStack().isIn(KNIVES))) {
            return TypedActionResult.fail(itemStack);
        }

        // Define loot context parameters
        LootContextParameterSet.Builder builder = (new LootContextParameterSet.Builder((ServerWorld)world))
                .add(LootContextParameters.THIS_ENTITY, user)
                .add(LootContextParameters.ORIGIN, user.getPos());

        // Get the loot table instance for the given identifier
        RegistryKey<LootTable> lootTableKey = RegistryKey.of(RegistryKeys.LOOT_TABLE, lootTableId);
        LootTable lootTable = world.getServer().getReloadableRegistries().getLootTable(lootTableKey);

        // Get the number of carcase items in the stack
        int itemCount = user.getStackInHand(hand).getCount();

        // Generate loot for each carcase item in the stack
        for (int i = 0; i < itemCount; i++) {
            // Build loot context parameter set for each item in the stack
            LootContextParameterSet lootContextParameterSet = builder.build(LootContextTypes.GIFT);

            // Generate loot
            List<ItemStack> lootDrops = lootTable.generateLoot(lootContextParameterSet);

            // Attempt to place items in the player's inventory
            for (ItemStack drop : lootDrops) {
                giveItem(drop, user);
            }
        }

        // Create a new stack based on the giveBack item variable
        ItemStack stack = giveBack.getDefaultStack();
        stack.setCount(itemCount);

        // Swing the user's hand
        user.swingHand(user.preferredHand);

        return TypedActionResult.consume(stack);
    }

    /**
     * Gives an item stack to the specified player, either by adding it to their inventory or dropping it on the ground.
     *
     * @param itemStack The item stack to give to the player.
     * @param player    The player to receive the item stack.
     */
    public void giveItem(ItemStack itemStack, PlayerEntity player) {

        if (player.getAbilities().creativeMode) {
            player.getInventory().insertStack(itemStack);
        }

        if (!player.getInventory().insertStack(itemStack)) {
            player.dropItem(itemStack, false);
        }

    }
}
