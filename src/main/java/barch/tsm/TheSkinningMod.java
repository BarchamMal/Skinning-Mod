package barch.tsm;

import barch.tsm.Carcases.AnimalByproducts;
import barch.tsm.Carcases.Carcases;
import barch.tsm.Foods.Meat;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static barch.tsm.Carcases.AnimalByproducts.FISH_SCALES;
import static barch.tsm.Carcases.Carcases.COW_HIDE;
import static barch.tsm.Carcases.Carcases.MEATLESS_COW_CARCASE;

public class TheSkinningMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final String NAMESPACE = "tsm";

    public static final Logger LOGGER = LoggerFactory.getLogger(NAMESPACE);

	public static final RegistryKey<ItemGroup> TSM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(NAMESPACE, "tsm"));
	public static final RegistryKey<ItemGroup> CARCASES_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(NAMESPACE, "carcases"));
	public static final RegistryKey<ItemGroup> BYPRODUCTS_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(NAMESPACE, "byproducts"));



	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		Registry.register(Registries.ITEM_GROUP, BYPRODUCTS_GROUP, FabricItemGroup.builder()
				.icon(() -> new ItemStack(FISH_SCALES))
				.displayName(Text.translatable("itemGroup."+NAMESPACE+".animal_byproducts"))
				.build());
				
		Registry.register(Registries.ITEM_GROUP, TSM_GROUP, FabricItemGroup.builder()
				.icon(() -> new ItemStack(COW_HIDE))
				.displayName(Text.translatable("itemGroup."+NAMESPACE+".tsm"))
				.build());

		Registry.register(Registries.ITEM_GROUP, CARCASES_GROUP, FabricItemGroup.builder()
				.icon(() -> new ItemStack(MEATLESS_COW_CARCASE))
				.displayName(Text.translatable("itemGroup."+NAMESPACE+".carcases"))
				.build());



		Carcases.onInitialize();
		AnimalByproducts.onInitialize();
		Meat.registerAll();


	}
}