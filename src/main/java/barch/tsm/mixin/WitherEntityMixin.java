package barch.tsm.mixin;


import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.entity.boss.WitherEntity;

@Mixin(WitherEntity.class)
public class WitherEntityMixin extends HostileEntity {

    protected WitherEntityMixin(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "dropEquipment", at = @At("HEAD"), cancellable = true)
    private void onDropEquipment(DamageSource source, int lootingMultiplier, boolean allowDrops, CallbackInfo ci) {
        ci.cancel();
        super.dropEquipment(source, lootingMultiplier, allowDrops);
    }
}
