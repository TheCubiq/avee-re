package com.daaw.avee.comp.EqualizerUI;

import com.daaw.avee.Common.Utils;
/* loaded from: classes.dex */
public class Equalization {
    static double hiFreq = 22050.0d;
    static double loFreq = 20.0d;

    public static void getEqBandsPresetsConvert(EQPreset eQPreset, EQPreset eQPreset2) {
        int length = eQPreset2.points.length;
        float[] fArr = new float[length];
        int length2 = eQPreset2.points.length;
        float[] fArr2 = new float[length2];
        for (int i = 0; i < length2; i++) {
            fArr2[i] = eQPreset2.points[i].freq;
        }
        PointCurve pointCurve = new PointCurve();
        eqCurveToPointCurve(eQPreset, pointCurve);
        pointCurveToEqBands(pointCurve, fArr, fArr2);
        for (int i2 = 0; i2 < length; i2++) {
            eQPreset2.points[i2].value = fArr[i2];
        }
    }

    public static void getEqBandsBassTrebleControl(EQPreset eQPreset, EQPreset eQPreset2, EQPreset eQPreset3, float f, float f2, float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[fArr.length];
        float[] fArr4 = new float[fArr.length];
        float[] fArr5 = new float[fArr.length];
        PointCurve pointCurve = new PointCurve();
        eqCurveToPointCurve(eQPreset, pointCurve);
        pointCurveToEqBands(pointCurve, fArr3, fArr2);
        eqCurveToPointCurve(eQPreset2, pointCurve);
        pointCurveToEqBands(pointCurve, fArr4, fArr2);
        eqCurveToPointCurve(eQPreset3, pointCurve);
        pointCurveToEqBands(pointCurve, fArr5, fArr2);
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = fArr3[i] + (fArr4[i] * f) + (fArr5[i] * f2);
            fArr[i] = Utils.ensureRange(fArr[i], -1.0f, 1.0f);
        }
    }

    static void eqCurveToPointCurve(EQPreset eQPreset, PointCurve pointCurve) {
        pointCurve.clear();
        if (eQPreset.points.length > 0) {
            float log10 = (float) Math.log10(loFreq);
            float log102 = ((float) Math.log10(hiFreq)) - log10;
            for (int i = 0; i < eQPreset.points.length; i++) {
                float log103 = (float) Math.log10(eQPreset.points[i].freq);
                if (log103 >= log10) {
                    float f = (log103 - log10) / log102;
                    if (f <= 1.0f) {
                        pointCurve.insert(f, eQPreset.points[i].value);
                    } else {
                        pointCurve.insert(f, eQPreset.points[i].value);
                        return;
                    }
                } else {
                    pointCurve.insert(0.0f, eQPreset.points[i].value);
                }
            }
        }
    }

    static void pointCurveToEqBands(PointCurve pointCurve, float[] fArr, float[] fArr2) {
        float log10 = (float) Math.log10(loFreq);
        float log102 = ((float) Math.log10(hiFreq)) - log10;
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = pointCurve.getValue(((double) fArr2[i]) == loFreq ? 0.0f : (((float) Math.log10(fArr2[i])) - log10) / log102);
        }
    }
}
