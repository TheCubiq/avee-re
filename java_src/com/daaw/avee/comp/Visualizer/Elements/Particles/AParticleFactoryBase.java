package com.daaw.avee.comp.Visualizer.Elements.Particles;

import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
/* loaded from: classes.dex */
public abstract class AParticleFactoryBase implements IParticleFactory {
    protected float speedTmp;
    protected float speedA = 1.0f;
    protected float speedRandom = 0.0f;
    float trailLengthMin = 0.0f;
    float trailLength = 0.0f;

    public void setSpeed(float f) {
        this.speedA = f;
    }

    public void setSpeedRandom(float f) {
        this.speedRandom = f;
    }

    public void setTrailLength(float f) {
        this.trailLength = f;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.IParticleFactory
    public float getTrailLength() {
        return this.trailLength;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        this.speedA = customPropertiesList.getPropertyFloat("Speed", 100.0f);
        this.speedRandom = customPropertiesList.getPropertyFloat("speedRandom", 60.0f);
        this.trailLength = customPropertiesList.getPropertyFloat("trailLength", 0.0f);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
        customPropertiesList.putPropertyFloatAsRange("Speed", this.speedA, "behaviour", -300.0f, 300.0f);
        customPropertiesList.putPropertyFloatAsRange("speedRandom", this.speedRandom, "behaviour", -300.0f, 300.0f);
        customPropertiesList.putPropertyFloatAsRange("trailLength", this.trailLength, "appearance", 0.0f, 1.0f);
    }
}
