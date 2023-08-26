package com.daaw.avee.comp.Visualizer.Elements.Particles;

import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.Vec3f;
import com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture;
import com.daaw.avee.comp.Visualizer.Graphic.VMatrix;
/* loaded from: classes.dex */
public class Particle implements IParticle {
    static boolean first = true;
    private static final float nearCameraFadeSpeed = 10.0f;
    public boolean animPaused;
    public long createdTime;
    public float currLifetime;
    public float currLifetime10;
    boolean dbg;
    public int frame;
    public float frameFloat;
    public float lifeTime;
    public boolean loop;
    private float sizeXFinal;
    public AtlasTexture sprite;
    public float textCoord;
    private static Vec3f tmpVec = new Vec3f(0.0f, 0.0f, 0.0f);
    private static Vec3f velVecY = new Vec3f(0.0f, 0.0f, 0.0f);
    private static Vec3f velVecX = new Vec3f(0.0f, 0.0f, 0.0f);
    private ParticleParameterStopp[] stopps = new ParticleParameterStopp[0];
    public Vec3f vel = new Vec3f(0.0f, 0.0f, 0.0f);
    public Vec3f finalVel = new Vec3f(0.0f, 0.0f, 0.0f);
    public Vec2f gravity = new Vec2f(0.0f, 0.0f);
    public Vec3f pos = new Vec3f(0.0f, 0.0f, 0.0f);
    private float rotation = 0.0f;
    boolean alive = false;
    boolean visible = false;
    ParticleParameterStopp currStopp = new ParticleParameterStopp();

    public Particle() {
        this.dbg = false;
        if (first) {
            this.dbg = true;
            first = false;
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.IParticle
    public Vec3f getPosition() {
        return this.pos;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.IParticle
    public float getSizeX() {
        return this.sizeXFinal;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.IParticle
    public float getSizeY() {
        return this.currStopp.sizeY;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.IParticle
    public float getRot() {
        return this.rotation;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.IParticle
    public float[] getColorArgb() {
        return this.currStopp.getColor();
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.IParticle
    public AtlasTexture getTextureFrame() {
        return this.sprite;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.IParticle
    public boolean getAlive() {
        return this.alive;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.IParticle
    public void setAlive(boolean z) {
        this.alive = z;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.IParticle
    public boolean getVisible() {
        return this.visible;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.IParticle
    public void setVisible(boolean z) {
        this.visible = z;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.IParticle
    public boolean update(float f, float f2, Vec2f vec2f, Vec2f vec2f2, float f3, float f4, Vec2f vec2f3, float f5, float f6, Vec2f vec2f4, VMatrix vMatrix, float f7) {
        float length;
        float f8;
        if (this.alive) {
            float f9 = this.currLifetime + f;
            this.currLifetime = f9;
            float f10 = f9 / this.lifeTime;
            this.currLifetime10 = f10;
            if (f10 > 1.0f || this.stopps == null) {
                this.alive = false;
                return false;
            }
            float f11 = 0.0f;
            if (vec2f4 != null) {
                this.currLifetime10 = Math.max(this.currLifetime10, 1.0f - (Math.max((-this.pos.z) - f7, 0.0f) / (nearCameraFadeSpeed * f7)));
            }
            int i = 0;
            while (true) {
                ParticleParameterStopp[] particleParameterStoppArr = this.stopps;
                if (i >= particleParameterStoppArr.length || particleParameterStoppArr[i].atTime >= this.currLifetime10) {
                    break;
                }
                i++;
            }
            int i2 = i - 1;
            if (i2 < 0) {
                i2 = 0;
            }
            ParticleParameterStopp[] particleParameterStoppArr2 = this.stopps;
            if (i2 >= particleParameterStoppArr2.length - 1) {
                i2 = particleParameterStoppArr2.length - 2;
            }
            int i3 = i2 + 1;
            int i4 = i2 >= 0 ? i2 : 0;
            float f12 = (this.currLifetime10 - this.stopps[i4].atTime) / (this.stopps[i3].atTime - this.stopps[i4].atTime);
            float f13 = f12 <= 1.0f ? f12 : 1.0f;
            ParticleParameterStopp particleParameterStopp = this.currStopp;
            ParticleParameterStopp[] particleParameterStoppArr3 = this.stopps;
            ParticleParameterStopp.Interpolate(particleParameterStopp, particleParameterStoppArr3[i4], particleParameterStoppArr3[i3], f13);
            this.currStopp.sizeX *= f3;
            this.currStopp.sizeY *= f3;
            this.vel.x += (this.vel.x - vec2f3.x) * f5;
            this.vel.y += (this.vel.y - vec2f3.y) * f5;
            this.vel.z += 0.0f;
            float sin = ((float) Math.sin(this.currStopp.sideSineWaveFreq + (this.currLifetime * this.currStopp.sideSineWaveFreq))) * this.currStopp.sideSineWaveMag;
            float cos = ((float) Math.cos(this.currStopp.sideSineWaveFreq + (this.currLifetime * this.currStopp.sideSineWaveFreq))) * this.currStopp.sideSineWaveMag;
            velVecY.x = -this.vel.y;
            velVecY.y = this.vel.z;
            velVecY.z = this.vel.x;
            velVecX.x = -this.vel.z;
            velVecX.y = this.vel.x;
            velVecX.z = this.vel.y;
            if (vec2f4 != null) {
                this.finalVel.x = this.vel.x + (velVecX.x * sin) + (velVecY.x * cos);
                this.finalVel.y = this.vel.y + (velVecX.y * sin) + (velVecY.y * cos);
                this.finalVel.z = this.vel.z + (velVecX.z * sin) + (velVecY.z * cos);
            } else {
                this.finalVel.x = this.vel.x + (this.vel.y * sin);
                this.finalVel.y = this.vel.y + ((-this.vel.x) * sin);
                this.finalVel.z = this.vel.z;
            }
            this.pos.x += this.finalVel.x * f * f4 * f2;
            this.pos.y += this.finalVel.y * f * f4 * f2;
            this.pos.z += this.finalVel.z * f * f4 * f2;
            this.vel.x += this.gravity.x * f * f2;
            this.vel.y += this.gravity.y * f * f2;
            if (this.currStopp.velocityAngle) {
                if (vec2f4 != null) {
                    tmpVec.x = vec2f4.x - this.pos.x;
                    tmpVec.y = vec2f4.y - this.pos.y;
                    tmpVec.z = 0.0f;
                    this.rotation = tmpVec.getAngle2d();
                    length = Math.min(Math.abs(((float) Math.atan(Vec2f.length(vec2f4.x - this.pos.x, vec2f4.y - this.pos.y) / this.pos.z)) - ((float) Math.atan(Vec2f.length(vec2f4.x - (this.pos.x - this.finalVel.x), vec2f4.y - (this.pos.y - this.finalVel.y)) / (this.pos.z - this.finalVel.z)))), 0.3f);
                    f8 = 100.05f;
                } else {
                    this.rotation = this.finalVel.getAngle2d();
                    length = this.finalVel.length();
                    f8 = 0.05f;
                }
                f11 = length * f8;
            } else {
                this.rotation = this.currStopp.rot;
            }
            this.sizeXFinal = this.currStopp.sizeX + (f11 * f4 * f6);
            return true;
        }
        return false;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Particles.IParticle
    public void updateVisible(float f) {
        AtlasTexture atlasTexture = this.sprite;
        int framesCount = atlasTexture != null ? atlasTexture.getFramesCount() : 1;
        if (!this.animPaused) {
            this.frame = (int) (framesCount * this.currLifetime10);
        }
        if (!this.loop && this.frame >= framesCount) {
            this.frame = framesCount - 1;
        }
        this.frame %= framesCount;
        if (this.animPaused) {
            return;
        }
        this.textCoord = this.currLifetime10 * 1.0f;
    }

    public void allocateStopps(int i) {
        if (this.stopps.length == i) {
            return;
        }
        this.stopps = new ParticleParameterStopp[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.stopps[i2] = new ParticleParameterStopp();
        }
    }

    public int getStoppsCount() {
        return this.stopps.length;
    }

    public ParticleParameterStopp getStopp(int i) {
        return this.stopps[i];
    }
}
