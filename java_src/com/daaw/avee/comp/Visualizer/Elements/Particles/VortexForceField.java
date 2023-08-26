package com.daaw.avee.comp.Visualizer.Elements.Particles;

import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
/* loaded from: classes.dex */
public class VortexForceField implements IForceField {
    public static final String typeName = "Vortex";
    private float scale = 50.0f;
    private float speed = 50.0f;

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
    }

    public VortexForceField setScale(float f) {
        this.scale = f;
        return this;
    }

    public VortexForceField setSpeed(float f) {
        this.speed = f;
        return this;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.IForceField
    public float getVelocityAndFactor(float f, float f2, Vec2f vec2f) {
        vec2f.x = this.speed * f2;
        vec2f.y = (-f) * this.speed;
        return 1.0f / ((((f * f) + (f2 * f2)) / this.scale) + 1.0f);
    }
}
