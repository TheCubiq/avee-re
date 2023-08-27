package com.daaw.avee.comp.Visualizer.Dsp;

import com.daaw.avee.Common.ISimpleListDouble;
import com.daaw.avee.Common.ISimpleListShort;
/* loaded from: classes.dex */
public class SignalFilter1d {
    private int radius;
    private float strength;
    private int[] softnessIndexes = new int[0];
    private float[] softnessWeight = new float[0];
    private float softnessDivider = 1.0f;

    public int getRadius() {
        int[] iArr = this.softnessIndexes;
        if (iArr == null || iArr.length < 2) {
            return 0;
        }
        return (iArr.length - 1) / 2;
    }

    public float getStrength() {
        return this.strength;
    }

    public float getSofted(int i, float[] fArr) {
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            int[] iArr = this.softnessIndexes;
            if (i2 < iArr.length) {
                f += fArr[((iArr[i2] + i) + fArr.length) % fArr.length] * this.softnessWeight[i2];
                i2++;
            } else {
                return f / this.softnessDivider;
            }
        }
    }

    public float getSofted(int i, ISimpleListShort iSimpleListShort) {
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            int[] iArr = this.softnessIndexes;
            if (i2 < iArr.length) {
                f += iSimpleListShort.get(((iArr[i2] + i) + iSimpleListShort.size()) % iSimpleListShort.size()) * this.softnessWeight[i2];
                i2++;
            } else {
                return f / this.softnessDivider;
            }
        }
    }

    public double getSofted(int i, ISimpleListDouble iSimpleListDouble) {
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            int[] iArr = this.softnessIndexes;
            if (i2 < iArr.length) {
                double d = f;
                double d2 = iSimpleListDouble.get(((iArr[i2] + i) + (iSimpleListDouble.size() * 100)) % iSimpleListDouble.size());
                double d3 = this.softnessWeight[i2];
                Double.isNaN(d3);
                Double.isNaN(d);
                f = (float) (d + (d2 * d3));
                i2++;
            } else {
                return f / this.softnessDivider;
            }
        }
    }

    public double getSoftedClamped(int i, ISimpleListDouble iSimpleListDouble) {
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            int[] iArr = this.softnessIndexes;
            if (i2 < iArr.length) {
                int i3 = iArr[i2] + i;
                if (i3 >= 0 && i3 < iSimpleListDouble.size()) {
                    double d = f;
                    double d2 = iSimpleListDouble.get(i3);
                    double d3 = this.softnessWeight[i2];
                    Double.isNaN(d3);
                    Double.isNaN(d);
                    f = (float) (d + (d2 * d3));
                }
                i2++;
            } else {
                return f / this.softnessDivider;
            }
        }
    }

    public void setSoftness(int i) {
        int i2 = 0;
        if (i < 1) {
            this.softnessIndexes = new int[]{0};
            this.softnessWeight = new float[]{1.0f};
            this.softnessDivider = 1.0f;
            return;
        }
        int[] iArr = new int[i + 1 + i];
        this.softnessIndexes = iArr;
        this.softnessWeight = new float[iArr.length];
        this.softnessDivider = iArr.length;
        while (true) {
            int[] iArr2 = this.softnessIndexes;
            if (i2 >= iArr2.length) {
                return;
            }
            int i3 = i2 - i;
            iArr2[i2] = i3;
            this.softnessWeight[i2] = DspWindows.hammingWindow(((iArr2.length + 2) / 2) + i3, iArr2.length + 2);
            i2++;
        }
    }

    public SignalFilter1d createHighPass(int i, float f) {
        this.strength = f;
        this.radius = i;
        int i2 = 0;
        if (i < 1) {
            this.softnessIndexes = new int[]{0};
            this.softnessWeight = new float[]{1.0f};
            this.softnessDivider = 1.0f;
            return this;
        }
        int[] iArr = new int[i + 1 + i];
        this.softnessIndexes = iArr;
        this.softnessWeight = new float[iArr.length];
        this.softnessDivider = 0.0f;
        while (true) {
            int[] iArr2 = this.softnessIndexes;
            if (i2 < iArr2.length) {
                iArr2[i2] = i2 - i;
                this.softnessWeight[i2] = -f;
                this.softnessDivider += f;
                i2++;
            } else {
                float length = (iArr2.length - 1) * 1.0f;
                this.softnessWeight[i] = length;
                this.softnessDivider += length;
                return this;
            }
        }
    }
}
