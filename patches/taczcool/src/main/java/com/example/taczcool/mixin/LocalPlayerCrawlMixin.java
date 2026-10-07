package com.example.taczcool.mixin;

import com.tacz.guns.client.gameplay.LocalPlayerCrawl;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.Pose;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(LocalPlayerCrawl.class)
public class LocalPlayerCrawlMixin {

    @Redirect(
            method = "setCrawlPose",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/player/LocalPlayer;setForcedPose(Lnet/minecraft/world/entity/Pose;)V"
            )
    )
    private void cancelCrawlPose(LocalPlayer player, Pose pose) {
        // ничего не делаем — отменяем вызов setForcedPose
        // ParCool сам управляет позой игрока
    }
}