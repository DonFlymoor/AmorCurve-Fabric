package io.github.akashiikun.armorcurve.mixin;

import net.minecraft.entity.attribute.EntityAttributeInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(EntityAttributeInstance.class)
public interface AttributeUpdater {

    @Invoker("onUpdate")
    public void invokeUpdateAttribute();
}