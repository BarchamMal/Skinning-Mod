package barch.tsm.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SheepEntity.class)
public abstract class SheepEntityMixin extends AnimalEntity {


    protected SheepEntityMixin(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "createSheepAttributes", at = @At("RETURN"), cancellable = true)
    private static void injected(CallbackInfoReturnable<DefaultAttributeContainer.Builder> cir) {
        cir.setReturnValue(MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 16)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.23)
                .add(EntityAttributes.GENERIC_ARMOR, 10)
                .add(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, 10));
    }
}
