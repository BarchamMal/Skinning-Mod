package barch.tsm;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import static barch.tsm.TheSkinningMod.NAMESPACE;

public class TsmRegistryKeys {


    public static final RegistryKey<DamageType> MORGUL_WEAPON_DAMAGE_TYPE = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, new Identifier(NAMESPACE, "morgul_weapon"));

    public static DamageSource of(World world, RegistryKey<DamageType> key) {
        return new DamageSource(world.getRegistryManager().get(RegistryKeys.DAMAGE_TYPE).entryOf(key));
    }
}
