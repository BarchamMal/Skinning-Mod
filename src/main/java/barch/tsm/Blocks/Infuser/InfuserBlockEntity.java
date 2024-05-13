package barch.tsm.Blocks.Infuser;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.LockableContainerBlockEntity;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Predicate;

import static barch.tsm.Blocks.InfuserRegister.INFUSER_BLOCK_ENTITY;
import static barch.tsm.TheSkinningMod.LOGGER;

public class InfuserBlockEntity extends LockableContainerBlockEntity implements SidedInventory {


    // Creating a HashMap instance
    public static Map<Item, Integer> lapisValues = Map.of(
            Items.LAPIS_BLOCK, 9,
            Items.LAPIS_LAZULI, 1
    );

    private static final int[] INGREDIENTS_SLOT_IDS = new int[]{0,1,2,3};
    private static final int FUEL_SLOT_ID = 4;
    private static final int OUTPUT_SLOT_ID = 5;
    private static final int[] TOP_SLOTS = new int[]{0,1,2,3};
    private static final int[] BOTTOM_SLOTS = new int[]{5};
    private static final int[] SIDE_SLOTS = new int[]{4};
    public static final int MAX_FUEL_USES = 36;
    public static final int INFUSE_TIME_PROPERTY_INDEX = 0;
    public static final int FUEL_PROPERTY_INDEX = 1;
    public static final int PROPERTY_COUNT = 2;
    private DefaultedList<ItemStack> inventory;
    int infuseTime;
    private boolean[] slotsEmptyLastTick;
    private Item itemInfusing;
    int fuel;
    protected final PropertyDelegate propertyDelegate;
    public InfuserBlockEntity(BlockPos pos, BlockState state) {
        super(INFUSER_BLOCK_ENTITY, pos, state);
        this.inventory = DefaultedList.ofSize(6, ItemStack.EMPTY);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                int var10000;
                switch (index) {
                    case 0:
                        var10000 = InfuserBlockEntity.this.infuseTime;
                        break;
                    case 1:
                        var10000 = InfuserBlockEntity.this.fuel;
                        break;
                    default:
                        var10000 = 0;
                }

                return var10000;
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0:
                        InfuserBlockEntity.this.infuseTime = value;
                        break;
                    case 1:
                        InfuserBlockEntity.this.fuel = value;
                }

            }

            public int size() {
                return 2;
            }
        };
    }

    protected Text getContainerName() {
        return Text.translatable("container.infuser");
    }

    public int size() {
        return this.inventory.size();
    }

    protected DefaultedList<ItemStack> getHeldStacks() {
        return this.inventory;
    }

    protected void setHeldStacks(DefaultedList<ItemStack> inventory) {
        this.inventory = inventory;
    }

    public static void tick(World world, BlockPos pos, BlockState state, InfuserBlockEntity blockEntity) {
        // handle crafting
        ItemStack[] stacks = new ItemStack[] {blockEntity.inventory.get(0), blockEntity.inventory.get(1), blockEntity.inventory.get(2), blockEntity.inventory.get(3)};
        if (canCraft(stacks) && blockEntity.fuel > 0 && blockEntity.inventory.get(OUTPUT_SLOT_ID).isOf(Items.AIR)) {
            if (blockEntity.infuseTime < 0) {blockEntity.infuseTime = 0;}
            if (blockEntity.infuseTime > 200) {
                blockEntity.infuseTime = 0;
                blockEntity.fuel -= 1;
                blockEntity.inventory.set(OUTPUT_SLOT_ID, craftingOutput(stacks));
                for (int slotIndex : INGREDIENTS_SLOT_IDS) {
                    ItemStack stack = blockEntity.inventory.get(slotIndex);
                    if (!stack.isEmpty()) {
                        stack.decrement(1);
                    }
                }
                world.playSound(pos.getX(), pos.getY(), pos.getZ(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 1.0f, 1.0f, true);

            } else {
                blockEntity.infuseTime += 1;
            }
        } else if (blockEntity.infuseTime > 0) {
            blockEntity.infuseTime -=1;
        }


        // handle fuel
        DefaultedList<ItemStack> inventory1 = blockEntity.inventory;
        ItemStack itemStack = inventory1.get(FUEL_SLOT_ID);
        if (blockEntity.fuel < MAX_FUEL_USES && !itemStack.isOf(Items.AIR) && (blockEntity.fuel + lapisValues.get(itemStack.getItem()) <= 36)) {
            inventory1.set(FUEL_SLOT_ID, itemStack);
            blockEntity.fuel += lapisValues.get(itemStack.getItem());
            itemStack.decrement(1);
        }


    }

    private boolean[] getSlotsEmpty() {
        boolean[] bls = new boolean[3];

        for(int i = 0; i < 3; ++i) {
            if (!((ItemStack)this.inventory.get(i)).isEmpty()) {
                bls[i] = true;
            }
        }

        return bls;
    }

    private static boolean canCraft(ItemStack[] stacks) {

        boolean bl = false;

        for (ItemStack itemStack : stacks) {
            if (InfuserEnchantmentRegistry.isElement(itemStack.getItem())) {
                bl = true;
            }
        }

        for (ItemStack itemStack : stacks) {
            if (!(InfuserEnchantmentRegistry.isEnchantmentItem(itemStack.getItem()) || InfuserEnchantmentRegistry.isElement(itemStack.getItem()))) {
                bl = false;
            }
        }
        return bl;
    }

    private static ItemStack craftingOutput(ItemStack[] stacks) {
        Random random = Random.create();

        // Initialize maps to store enchantment items and their counts, and element items
        // and their counts
        Map<Item, Integer> enchantmentItems = new HashMap<>();
        ArrayList<Item> elementItems = new ArrayList<>();

        // Create a list of items obtained from the item stacks list
        ArrayList<Item> items = new ArrayList<>();
        for (ItemStack itemStack : stacks) {
            items.add(itemStack.getItem());
        }

        // Iterate through the input ItemStacks to populate the maps
        for (ItemStack stack : stacks) {
            Item item = stack.getItem(); // Get the item to be added to the dictionaries
            if (InfuserEnchantmentRegistry.isEnchantmentItem(item) &&
                    items.stream().anyMatch(Predicate.isEqual(
                            InfuserEnchantmentRegistry.getItemFromElement(
                                    InfuserEnchantmentRegistry.getElementFromEnchantment(
                                            InfuserEnchantmentRegistry.EnchantmentItemRegistry.get(item)))))) {
                // If it's an enchantment item and there's an element associated with it, add it to enchantmentItems
                enchantmentItems.put(item, enchantmentItems.getOrDefault(item, 0) + 1);
            } else if (InfuserEnchantmentRegistry.isElement(item)) {
                // If it's an element item, add it to elementItems
                elementItems.add(item);
            }
        }

        // Determine the main enchantment item and whether enchantment item or element item takes precedence
        Item mainEnchantmentItem = null;
        boolean enchantmentItemTakesPrecedence = false;

        if (!enchantmentItems.isEmpty()) {
            for (Item item : enchantmentItems.keySet()) {
                mainEnchantmentItem = item;
                // Randomly determine if the enchantment item takes precedence based on its count
                int rand = random.nextInt(9) + 1;
                LOGGER.info("Random number = " + rand);
                LOGGER.info("The amount of enchantment items is " + enchantmentItems.get(item));
                if (rand <= enchantmentItems.get(item)) {
                    enchantmentItemTakesPrecedence = true;
                    break;
                }
            }
        }

        // Pick a main element item randomly
        Item mainElementItem = null;
        if (!elementItems.isEmpty()) {
            mainElementItem = elementItems.get(random.nextInt(elementItems.size()));
        }

        // Initialize variables for the main enchantment and its level
        Enchantment mainEnchantment = null;
        int mainEnchantmentLevel = 0;

        LOGGER.info("Does the enchantment take precedence? " + enchantmentItemTakesPrecedence);
        if (enchantmentItemTakesPrecedence) {
            // Determine the main enchantment and its level based on the main enchantment item and main element item
            mainElementItem = InfuserEnchantmentRegistry.getItemFromElement(
                    InfuserEnchantmentRegistry.getElementFromEnchantment(
                            InfuserEnchantmentRegistry.EnchantmentItemRegistry.get(mainEnchantmentItem)));
            mainEnchantment = InfuserEnchantmentRegistry.EnchantmentItemRegistry.get(mainEnchantmentItem);
            for (Item item : elementItems) {
                if (item.getDefaultStack().isOf(
                        InfuserEnchantmentRegistry.getItemFromElement(
                                InfuserEnchantmentRegistry.getElementFromEnchantment(mainEnchantment)))) {
                    mainEnchantmentLevel += 1;
                }
            }
            mainEnchantmentLevel = Math.min(mainEnchantmentLevel, mainEnchantment.getMaxLevel());
        } else {
            if (mainElementItem != null) {
                List<Enchantment> possibleEnchantments = InfuserEnchantmentRegistry.EnchantmentRegistry.get(
                        InfuserEnchantmentRegistry.getElement(mainElementItem));
                if (possibleEnchantments != null && !possibleEnchantments.isEmpty()) {
                    mainEnchantment = possibleEnchantments.get(random.nextInt(possibleEnchantments.size()));
                    for (Item item : elementItems) {
                        if (item.getDefaultStack().isOf(mainElementItem)) {
                            mainEnchantmentLevel += 1;
                        }
                    }
                    mainEnchantmentLevel = Math.min(mainEnchantmentLevel, mainEnchantment.getMaxLevel());
                }
            }
        }

        // Create the resulting ItemStack
        ItemStack result = InfuserEnchantmentRegistry.getEnchantmentItem(mainEnchantment).getDefaultStack();

        // Apply the main enchantment and its level to the resulting ItemStack
        if (mainEnchantment != null) {
            ItemEnchantmentsComponent.Builder enchantmentBuilder = new ItemEnchantmentsComponent.Builder(
                    ItemEnchantmentsComponent.DEFAULT);
            enchantmentBuilder.set(mainEnchantment, mainEnchantmentLevel);
            ComponentMap componentMap = ComponentMap.builder()
                    .add(DataComponentTypes.STORED_ENCHANTMENTS, enchantmentBuilder.build())
                    .add(DataComponentTypes.ENCHANTMENTS, enchantmentBuilder.build())
                    .build();
            result.applyComponentsFrom(componentMap);
        }

        return result;
    }


    protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.readNbt(nbt, registryLookup);
        this.inventory = DefaultedList.ofSize(this.size(), ItemStack.EMPTY);
        Inventories.readNbt(nbt, this.inventory, registryLookup);
        this.infuseTime = nbt.getShort("InfuseTime");
        this.fuel = nbt.getByte("Fuel");
    }

    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.writeNbt(nbt, registryLookup);
        nbt.putShort("InfuseTime", (short)this.infuseTime);
        Inventories.writeNbt(nbt, this.inventory, registryLookup);
        nbt.putByte("Fuel", (byte)this.fuel);
    }

    public boolean isValid(int slot, ItemStack stack) {
        if (slot == FUEL_SLOT_ID) {
            return stack.isOf(Items.LAPIS_LAZULI) || stack.isOf(Items.LAPIS_BLOCK);
        } else if (slot == OUTPUT_SLOT_ID) {
            return false;
        } else {
            return true;
        }
    }

    public int[] getAvailableSlots(Direction side) {
        if (side == Direction.UP) {
            return TOP_SLOTS;
        } else if (side == Direction.DOWN) {
            return BOTTOM_SLOTS;
        } else {
            return SIDE_SLOTS;
        }
    }

    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
        return this.isValid(slot, stack);
    }

    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
        return slot == OUTPUT_SLOT_ID;
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new InfuserScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }

}
