package barch.tsm;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

import static barch.tsm.TheSkinningMod.NAMESPACE;

public class Tags {

    public static final TagKey<Item> KNIVES = ofItem(NAMESPACE,"knives");
    public static final TagKey<Item> DISABLE_SHIELDS = ofItem("c","disable_shields");

    public static final TagKey<Block> MACE_MINEABLE = ofBlock(NAMESPACE, "mineable/mace");


    private static TagKey<Biome> ofBiome(String namespace, String path) {
        return TagKey.of(RegistryKeys.BIOME, new Identifier(namespace, path));
    }
    private static TagKey<Block> ofBlock(String namespace, String path) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(namespace, path));
    }
    private static TagKey<Item> ofItem(String namespace, String path) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(namespace, path));
    }

}
