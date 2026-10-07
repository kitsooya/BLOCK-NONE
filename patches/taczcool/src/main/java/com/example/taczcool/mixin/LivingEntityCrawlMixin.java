package com.example.taczcool.mixin;

import com.tacz.guns.entity.shooter.LivingEntityCrawl;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(LivingEntityCrawl.class)
public class LivingEntityCrawlMixin {

    @Redirect(
            method = "setCrawlPose",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/entity/LivingEntity;setPose(Lnet/minecraft/world/entity/Pose;)V"
            )
    )
    private void cancelCrawlPoseServer(LivingEntity entity, Pose pose) {
        // ничего не делаем — отменяем вызов setPose
    }

    @Redirect(
            method = "setCrawlPose",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/entity/player/Player;setForcedPose(Lnet/minecraft/world/entity/Pose;)V"
            )
    )
    private void cancelForcedPoseServer(Player player, Pose pose) {
        // ничего не делаем — отменяем вызов setForcedPose
    }
}