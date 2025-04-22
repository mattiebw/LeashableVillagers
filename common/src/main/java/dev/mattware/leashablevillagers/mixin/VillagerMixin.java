package dev.mattware.leashablevillagers.mixin;

import net.minecraft.world.entity.npc.AbstractVillager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractVillager.class)
public class VillagerMixin {
    @Inject(method = "canBeLeashed", at = @At("HEAD"), cancellable = true)
    private void beLeashed(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
