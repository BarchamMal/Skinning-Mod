package barch.tsm.Blocks;

import barch.tsm.Blocks.Infuser.EssenceItem;
import barch.tsm.Blocks.Infuser.InfuserBlock;
import barch.tsm.Blocks.Infuser.InfuserBlockEntity;
import barch.tsm.Blocks.Infuser.InfuserScreenHandler;
import barch.tsm.Glue.BlockBuilder;
import barch.tsm.Glue.ItemGrouped;
import barch.tsm.Glue.ItemGrouper;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

import static barch.tsm.TheSkinningMod.NAMESPACE;

public class InfuserRegister {

    public static final Item REALITY_ESSENCE_AIR = new EssenceItem("air",new Item.Settings());
    public static final Item REALITY_ESSENCE_DARKNESS = new EssenceItem("darkness",new Item.Settings());
    public static final Item REALITY_ESSENCE_DEATH = new EssenceItem("death",new Item.Settings());
    public static final Item REALITY_ESSENCE_EARTH = new EssenceItem("earth",new Item.Settings());
    public static final Item REALITY_ESSENCE_ELECTRICITY = new EssenceItem("electricity",new Item.Settings());
    public static final Item REALITY_ESSENCE_FIRE = new EssenceItem("fire",new Item.Settings());
    public static final Item REALITY_ESSENCE_FORCE = new EssenceItem("force",new Item.Settings());
    public static final Item REALITY_ESSENCE_ICE = new EssenceItem("ice",new Item.Settings());
    public static final Item REALITY_ESSENCE_LIFE = new EssenceItem("life",new Item.Settings());
    public static final Item REALITY_ESSENCE_LIGHT = new EssenceItem("light",new Item.Settings());
    public static final Item REALITY_ESSENCE_MAGIC = new EssenceItem("magic",new Item.Settings());
    public static final Item REALITY_ESSENCE_NATURE = new EssenceItem("nature",new Item.Settings());
    public static final Item REALITY_ESSENCE_VOID = new EssenceItem("void",new Item.Settings());
    public static final Item REALITY_ESSENCE_WATER = new EssenceItem("water",new Item.Settings());

    public static final BlockWithEntity INFUSER_BLOCK = new InfuserBlock(BlockBuilder.CloneBlock(Blocks.ENCHANTING_TABLE));

    public static final BlockEntityType<InfuserBlockEntity> INFUSER_BLOCK_ENTITY = BlockEntityType.Builder.create(InfuserBlockEntity::new, INFUSER_BLOCK).build();

    public static final ScreenHandlerType<InfuserScreenHandler> INFUSER_SCREEN_HANDLER = new ScreenHandlerType<>(InfuserScreenHandler::new, FeatureFlags.VANILLA_FEATURES);

    public static void Register() {

        Registry.register(Registries.BLOCK, new Identifier(NAMESPACE, "infuser"), INFUSER_BLOCK);

        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(NAMESPACE, "infuser"), INFUSER_BLOCK_ENTITY);

        Registry.register(Registries.SCREEN_HANDLER, new Identifier(NAMESPACE, "infuser"), INFUSER_SCREEN_HANDLER);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "infuser"), new BlockItem(INFUSER_BLOCK, new Item.Settings()));

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "reality_essence_air"), REALITY_ESSENCE_AIR);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "reality_essence_darkness"), REALITY_ESSENCE_DARKNESS);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "reality_essence_death"), REALITY_ESSENCE_DEATH);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "reality_essence_earth"), REALITY_ESSENCE_EARTH);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "reality_essence_electricity"), REALITY_ESSENCE_ELECTRICITY);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "reality_essence_fire"), REALITY_ESSENCE_FIRE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "reality_essence_force"), REALITY_ESSENCE_FORCE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "reality_essence_ice"), REALITY_ESSENCE_ICE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "reality_essence_life"), REALITY_ESSENCE_LIFE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "reality_essence_light"), REALITY_ESSENCE_LIGHT);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "reality_essence_magic"), REALITY_ESSENCE_MAGIC);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "reality_essence_nature"), REALITY_ESSENCE_NATURE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "reality_essence_void"), REALITY_ESSENCE_VOID);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "reality_essence_water"), REALITY_ESSENCE_WATER);



        ItemGrouper.GroupItem(INFUSER_BLOCK, new ItemGrouped[]{new ItemGrouped(ItemGroups.FUNCTIONAL, Items.ENCHANTING_TABLE)});

        ItemGrouper.GroupItem(REALITY_ESSENCE_AIR, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.PHANTOM_MEMBRANE)});
        ItemGrouper.GroupItem(REALITY_ESSENCE_DARKNESS, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, REALITY_ESSENCE_AIR)});
        ItemGrouper.GroupItem(REALITY_ESSENCE_DEATH, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, REALITY_ESSENCE_DARKNESS)});
        ItemGrouper.GroupItem(REALITY_ESSENCE_EARTH, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, REALITY_ESSENCE_DEATH)});
        ItemGrouper.GroupItem(REALITY_ESSENCE_ELECTRICITY, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, REALITY_ESSENCE_EARTH)});
        ItemGrouper.GroupItem(REALITY_ESSENCE_FIRE, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, REALITY_ESSENCE_ELECTRICITY)});
        ItemGrouper.GroupItem(REALITY_ESSENCE_FORCE, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, REALITY_ESSENCE_FIRE)});
        ItemGrouper.GroupItem(REALITY_ESSENCE_ICE, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, REALITY_ESSENCE_FORCE)});
        ItemGrouper.GroupItem(REALITY_ESSENCE_LIFE, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, REALITY_ESSENCE_ICE)});
        ItemGrouper.GroupItem(REALITY_ESSENCE_LIGHT, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, REALITY_ESSENCE_LIFE)});
        ItemGrouper.GroupItem(REALITY_ESSENCE_MAGIC, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, REALITY_ESSENCE_LIGHT)});
        ItemGrouper.GroupItem(REALITY_ESSENCE_NATURE, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, REALITY_ESSENCE_MAGIC)});
        ItemGrouper.GroupItem(REALITY_ESSENCE_VOID, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, REALITY_ESSENCE_NATURE)});
        ItemGrouper.GroupItem(REALITY_ESSENCE_WATER, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, REALITY_ESSENCE_VOID)});

    }

}
