package com.daaw.avee.comp.Visualizer.Elements.Particles;

import com.daaw.avee.Common.Interpolate;
import com.daaw.avee.comp.Visualizer.Graphic.GraphicsUtils;
/* loaded from: classes.dex */
public class ParticleParameterStopp {
    public float atTime;
    public float rot;
    public float sizeX;
    public float sizeY;
    private final float[] colorRgba = new float[4];
    public float sideSineWaveFreq = 4.0f;
    public float sideSineWaveMag = 0.0f;
    public boolean velocityAngle = true;

    public void setColorArgb(int i) {
        GraphicsUtils.intColorToF4Color(this.colorRgba, i);
    }

    public void setColorArgb(float[] fArr) {
        float[] fArr2 = this.colorRgba;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
    }

    public float[] getColor() {
        return this.colorRgba;
    }

    public static void Interpolate(ParticleParameterStopp particleParameterStopp, ParticleParameterStopp particleParameterStopp2, ParticleParameterStopp particleParameterStopp3, float f) {
        particleParameterStopp.atTime = 0.0f;
        double d = f;
        particleParameterStopp.sizeX = Interpolate.Lerp(particleParameterStopp2.sizeX, particleParameterStopp3.sizeX, d);
        particleParameterStopp.sizeY = Interpolate.Lerp(particleParameterStopp2.sizeY, particleParameterStopp3.sizeY, d);
        particleParameterStopp.rot = Interpolate.Lerp(particleParameterStopp2.rot, particleParameterStopp3.rot, d);
        GraphicsUtils.LerpColorF4(particleParameterStopp.colorRgba, particleParameterStopp2.colorRgba, particleParameterStopp3.colorRgba, f);
        particleParameterStopp.sideSineWaveFreq = Interpolate.Lerp(particleParameterStopp2.sideSineWaveFreq, particleParameterStopp3.sideSineWaveFreq, d);
        particleParameterStopp.sideSineWaveMag = Interpolate.Lerp(particleParameterStopp2.sideSineWaveMag, particleParameterStopp3.sideSineWaveMag, d);
        if (f < 0.5f) {
            particleParameterStopp.velocityAngle = particleParameterStopp2.velocityAngle;
        } else {
            particleParameterStopp.velocityAngle = particleParameterStopp3.velocityAngle;
        }
    }
}
