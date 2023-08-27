package com.daaw.avee.comp.Visualizer.Elements.Particles;

import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.Vec3f;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Graphic.GraphicsUtils;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import java.util.Random;
/* loaded from: classes.dex */
public class BasicParticleFactory extends AParticleFactoryBase {
    private float endSizeTmp;
    private final Random randomGenerator = new Random();
    protected String customImagePath = null;
    private float _lifetime = 1.5f;
    private float fadeInAndOutTime = 0.1f;
    private Vec2f gravity = new Vec2f(0.0f, 0.0f);
    private boolean velocityAngle = true;
    private float[] hslaColorFrom = {1.0f, 1.0f, 1.0f, 1.0f};
    private float[] hslaColorTo = {1.0f, 1.0f, 1.0f, 1.0f};
    private float sideSineWaveFreq = 0.0f;
    private float sideSineWaveFreqRandom = 0.0f;
    private float sideSineWaveMag = 0.0f;
    private float sideSineWaveMagRandom = 0.0f;
    private float sizeAspectRatio = 1.0f;
    private float startSize = 4.0f;
    private float fadeInSize = 4.0f;
    private float endSize = 4.0f;
    private float endSizeRandom = 0.0f;
    private float endSizeZFactor = 0.0f;
    float[] colorHslaTmp = new float[4];
    float[] colorF4Tmp = new float[4];
    private float particleAtTime1 = 0.1f;
    private float particleAtTime2 = 0.1f;
    private float particleAtTime1Inv = 0.1f;
    private float particleAtTime2Inv = 0.1f;

    public BasicParticleFactory() {
        setFadeInAndOutTime(0.1f);
    }

    public void setLifetime(float f) {
        this._lifetime = f;
    }

    public void setGravity(Vec2f vec2f) {
        this.gravity = vec2f;
    }

    public void setVelocityAngle(boolean z) {
        this.velocityAngle = z;
    }

    public void setSideSineWaveFreq(float f) {
        this.sideSineWaveFreq = f;
    }

    public void setSideSineWaveFreqRandom(float f) {
        this.sideSineWaveFreqRandom = f;
    }

    public void setSideSineWaveMagRandom(float f) {
        this.sideSineWaveMagRandom = f;
    }

    public void setSideSineWaveMag(float f) {
        this.sideSineWaveMag = f;
    }

    public void setStartSize(float f) {
        this.startSize = f;
    }

    public void setFadeInSize(float f) {
        this.fadeInSize = f;
    }

    public void setEndSize(float f) {
        this.endSize = f;
    }

    public void setEndSizeRandom(float f) {
        this.endSizeRandom = f;
    }

    public void setEndSizeZFactor(float f) {
        this.endSizeZFactor = f;
    }

    public void setColorFrom(int i) {
        GraphicsUtils.intColorToHlsa1(this.hslaColorFrom, i);
    }

    public void setColorTo(int i) {
        GraphicsUtils.intColorToHlsa1(this.hslaColorTo, i);
    }

    public void setColorTo(float f, float f2, float f3, float f4) {
        float[] fArr = this.hslaColorTo;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    public void setColorBoth(int i) {
        setColorFrom(i);
        setColorTo(i);
    }

    public void setFadeInAndOutTime(float f) {
        float min = Math.min(Math.max(0.0f, f), 0.5f);
        this.fadeInAndOutTime = min;
        this.particleAtTime1 = min;
        float f2 = 1.0f - min;
        this.particleAtTime2 = f2;
        this.particleAtTime1Inv = 1.0f - min;
        this.particleAtTime2Inv = 1.0f - f2;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.AParticleFactoryBase, com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        super.onApplyCustomization(customPropertiesList);
        this.hslaColorFrom = customPropertiesList.getPropertyArray4f("ColorFrom", new float[]{1.0f, 1.0f, 1.0f, 1.0f});
        this.hslaColorTo = customPropertiesList.getPropertyArray4f("ColorTo", new float[]{0.0f, 0.0f, 0.5f, 0.5f});
        this._lifetime = customPropertiesList.getPropertyFloat("lifetime", 8.0f);
        setFadeInAndOutTime(customPropertiesList.getPropertyFloat("fadeInAndOutTime", 0.1f));
        this.gravity = customPropertiesList.getPropertyVec2f("gravity", new Vec2f(0.0f, 0.0f));
        this.velocityAngle = customPropertiesList.getPropertyBool("velocityAngle", true);
        this.sizeAspectRatio = customPropertiesList.getPropertyFloat("sizeAspectRatio", 1.0f);
        this.startSize = customPropertiesList.getPropertyFloat("startSize", 0.0f);
        this.fadeInSize = customPropertiesList.getPropertyFloat("fadeInSize", 4.0f);
        this.endSize = customPropertiesList.getPropertyFloat("endSize", 4.0f);
        this.endSizeRandom = customPropertiesList.getPropertyFloat("endSizeRandom", 10.0f);
        this.endSizeZFactor = customPropertiesList.getPropertyFloat("endSizeZFactor", 0.0f);
        this.sideSineWaveFreq = customPropertiesList.getPropertyFloat("sideSineWaveFreq", 0.0f);
        this.sideSineWaveFreqRandom = customPropertiesList.getPropertyFloat("sideSineWaveFreqRandom", 0.0f);
        this.sideSineWaveMag = customPropertiesList.getPropertyFloat("sideSineWaveMag", 0.0f);
        this.sideSineWaveMagRandom = customPropertiesList.getPropertyFloat("sideSineWaveMagRandom", 0.0f);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.AParticleFactoryBase, com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
        super.onReadCustomization(customPropertiesList);
        customPropertiesList.putPropertyArray4fAsCHSLA("ColorFrom", this.hslaColorFrom, "appearance");
        customPropertiesList.putPropertyArray4fAsCHSLA("ColorTo", this.hslaColorTo, "appearance");
        customPropertiesList.putPropertyFloatAsRange("lifetime", this._lifetime, "behaviour", 0.1f, 10.0f);
        customPropertiesList.putPropertyFloatAsRange("fadeInAndOutTime", this.fadeInAndOutTime, "appearance", 0.0f, 0.5f);
        customPropertiesList.putPropertyVec2fAsRange("gravity", this.gravity, "behaviour", -300.0f, 300.0f);
        customPropertiesList.putPropertyBool("velocityAngle", this.velocityAngle, "appearance");
        customPropertiesList.putPropertyFloatAsRange("sizeAspectRatio", this.sizeAspectRatio, "appearance", 0.1f, 10.0f);
        customPropertiesList.putPropertyFloatAsRange("startSize", this.startSize, "appearance", 0.0f, 20.0f);
        customPropertiesList.putPropertyFloatAsRange("fadeInSize", this.fadeInSize, "appearance", 0.0f, 20.0f);
        customPropertiesList.putPropertyFloatAsRange("endSize", this.endSize, "appearance", 0.0f, 20.0f);
        customPropertiesList.putPropertyFloatAsRange("endSizeRandom", this.endSizeRandom, "appearance", 0.0f, 20.0f);
        customPropertiesList.putPropertyFloatAsRange("endSizeZFactor", this.endSizeZFactor, "appearance", 0.0f, 40.0f);
        customPropertiesList.putPropertyFloatAsRange("sideSineWaveFreq", this.sideSineWaveFreq, "waveBehaviour", 0.0f, 10.0f);
        customPropertiesList.putPropertyFloatAsRange("sideSineWaveFreqRandom", this.sideSineWaveFreqRandom, "waveBehaviour", -10.0f, 10.0f);
        customPropertiesList.putPropertyFloatAsRange("sideSineWaveMag", this.sideSineWaveMag, "waveBehaviour", 0.0f, 10.0f);
        customPropertiesList.putPropertyFloatAsRange("sideSineWaveMagRandom", this.sideSineWaveMagRandom, "waveBehaviour", -10.0f, 10.0f);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.IParticleFactory
    public IParticle allocateParticle() {
        return new Particle();
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.IParticleFactory
    public boolean emitParticleMaybe(RenderState renderState, IParticle iParticle, Vec3f vec3f, Vec3f vec3f2) {
        Particle particle = (Particle) iParticle;
        float nextFloat = this.randomGenerator.nextFloat();
        float f = 1.0f - nextFloat;
        Vec3f vec3f3 = new Vec3f(vec3f2.x * 0.2f, vec3f2.y * 0.2f, vec3f2.z * 0.02f);
        vec3f3.normalize();
        float f2 = this.endSizeRandom * nextFloat;
        this.endSizeTmp = this.endSize + (this.endSizeZFactor * vec3f3.z);
        this.speedTmp = this.speedA + (this.speedRandom * nextFloat);
        particle.allocateStopps(4);
        particle.getStopp(0).sideSineWaveFreq = this.sideSineWaveFreq + (this.sideSineWaveFreqRandom * f);
        particle.getStopp(0).sideSineWaveMag = this.sideSineWaveMag + (this.sideSineWaveMagRandom * nextFloat);
        particle.getStopp(1).sideSineWaveFreq = this.sideSineWaveFreq + (this.sideSineWaveFreqRandom * f);
        particle.getStopp(1).sideSineWaveMag = this.sideSineWaveMag + (this.sideSineWaveMagRandom * nextFloat);
        particle.getStopp(2).sideSineWaveFreq = this.sideSineWaveFreq + (this.sideSineWaveFreqRandom * f);
        particle.getStopp(2).sideSineWaveMag = this.sideSineWaveMag + (this.sideSineWaveMagRandom * nextFloat);
        particle.getStopp(3).sideSineWaveFreq = this.sideSineWaveFreq + (this.sideSineWaveFreqRandom * f);
        particle.getStopp(3).sideSineWaveMag = this.sideSineWaveMag + (this.sideSineWaveMagRandom * nextFloat);
        particle.getStopp(0).atTime = 0.0f;
        particle.getStopp(1).atTime = this.particleAtTime1;
        particle.getStopp(2).atTime = this.particleAtTime2;
        particle.getStopp(3).atTime = 1.0f;
        particle.getStopp(0).velocityAngle = this.velocityAngle;
        particle.getStopp(1).velocityAngle = this.velocityAngle;
        particle.getStopp(2).velocityAngle = this.velocityAngle;
        particle.getStopp(3).velocityAngle = this.velocityAngle;
        ParticleParameterStopp stopp = particle.getStopp(0);
        ParticleParameterStopp stopp2 = particle.getStopp(0);
        float f3 = this.startSize + f2;
        stopp2.sizeY = f3;
        stopp.sizeX = f3;
        ParticleParameterStopp stopp3 = particle.getStopp(1);
        ParticleParameterStopp stopp4 = particle.getStopp(1);
        float f4 = ((this.fadeInSize + f2) * this.particleAtTime1Inv) + (this.endSizeTmp * this.particleAtTime1);
        stopp4.sizeY = f4;
        stopp3.sizeX = f4;
        ParticleParameterStopp stopp5 = particle.getStopp(2);
        ParticleParameterStopp stopp6 = particle.getStopp(2);
        float f5 = ((this.fadeInSize + f2) * this.particleAtTime2Inv) + (this.endSizeTmp * this.particleAtTime2);
        stopp6.sizeY = f5;
        stopp5.sizeX = f5;
        ParticleParameterStopp stopp7 = particle.getStopp(3);
        ParticleParameterStopp stopp8 = particle.getStopp(3);
        float f6 = this.endSizeTmp + f2;
        stopp8.sizeY = f6;
        stopp7.sizeX = f6;
        particle.getStopp(0).sizeX = particle.getStopp(0).sizeY * this.sizeAspectRatio;
        particle.getStopp(1).sizeX = particle.getStopp(1).sizeY * this.sizeAspectRatio;
        particle.getStopp(2).sizeX = particle.getStopp(2).sizeY * this.sizeAspectRatio;
        particle.getStopp(3).sizeX = particle.getStopp(3).sizeY * this.sizeAspectRatio;
        Utils.lerpHsla(this.hslaColorFrom, this.hslaColorTo, this.colorHslaTmp, nextFloat);
        GraphicsUtils.hlsa1ColorToF4Color(this.colorHslaTmp, this.colorF4Tmp);
        particle.getStopp(0).setColorArgb(0);
        particle.getStopp(1).setColorArgb(this.colorF4Tmp);
        particle.getStopp(2).setColorArgb(this.colorF4Tmp);
        particle.getStopp(3).setColorArgb(0);
        particle.pos.x = vec3f.x;
        particle.pos.y = vec3f.y;
        particle.pos.z = vec3f.z;
        particle.vel.x = vec3f3.x * this.speedTmp;
        particle.vel.y = vec3f3.y * this.speedTmp;
        particle.vel.z = vec3f3.z * this.speedTmp;
        particle.gravity = this.gravity;
        particle.createdTime = Utils.tickCount();
        particle.frameFloat = 0.0f;
        particle.currLifetime = 0.0f;
        particle.currLifetime10 = 0.0f;
        particle.lifeTime = this._lifetime;
        particle.loop = false;
        particle.animPaused = false;
        particle.sprite = null;
        particle.setAlive(true);
        return true;
    }
}
