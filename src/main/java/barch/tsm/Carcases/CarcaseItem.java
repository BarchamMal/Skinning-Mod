package barch.tsm.Carcases;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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

public class CarcaseItem extends Item {

    private Identifier lootTableId;
    private Item giveBack;

    public CarcaseItem(Settings settings, Identifier lootTableId, Item item) {
        super(settings);
        this.lootTableId = lootTableId;
        this.giveBack = item;
    }

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

        ServerWorld serverWorld = (ServerWorld) world;


        // Define loot context parameters
        LootContextParameterSet.Builder builder = (new LootContextParameterSet.Builder((ServerWorld)world))
                .add(LootContextParameters.THIS_ENTITY, user)
                .add(LootContextParameters.ORIGIN, user.getPos());

        // Get the loot table instance for the given identifier
        LootTable lootTable = world.getServer().getLootManager().getLootTable(lootTableId);

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

    public void giveItem(ItemStack itemStack, PlayerEntity player) {

        if (player.getAbilities().creativeMode) {
            player.getInventory().insertStack(itemStack);
        }

        if (!player.getInventory().insertStack(itemStack)) {
            player.dropItem(itemStack, false);
        }

    }
}
