package barch.tsm.Carcases;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.time.temporal.ValueRange;
import java.util.Iterator;

import static barch.tsm.Tags.KNIVES;

public class CarcaseItem extends Item {

    private ItemCut[] itemCuts;
    private Item giveBack;

    public CarcaseItem(Settings settings, ItemCut[] itemCuts, Item item) {
        super(settings);
        this.itemCuts = itemCuts;
        this.giveBack = item;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        super.use(world, user, hand);

        // I need this logic for if the player has a carcase in main hand and in offhand.
        ItemStack itemStack = this.getDefaultStack();
        itemStack.setCount(user.getStackInHand(hand).getCount());

        if (!(user.getMainHandStack().isIn(KNIVES))) {
            return TypedActionResult.fail(itemStack);
        }

        // I don't know how to do a for-loop for a number range.
        int count = 1;
        while (count <= user.getOffHandStack().getCount()) {

            for (ItemCut cut : itemCuts) {
                ItemStack stack = cut.getItem().getDefaultStack();
                stack.setCount(cut.getAmount());
                giveItem(stack, user);

            }
            count += 1;
        }

        user.swingHand(user.preferredHand);
        ItemStack stack = giveBack.getDefaultStack();
        stack.setCount(user.getOffHandStack().getCount());
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
