package com.daaw.avee.comp.Visualizer.Dsp.PhaseSpectrum;

import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.Graphic.VFrameBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public class PhaseSpectrum {
    public int binCount;
    BarBin[] bins = new BarBin[0];
    public int sampleRate;

    public void onRender(RenderState renderState, VFrameBuffer vFrameBuffer) {
    }

    /* loaded from: classes.dex */
    class BarBin {
        public double[] binData;
        public double complexX;
        public double complexY;
        int i;
        int resolution;
        double resolutionD;
        double sineMagnitude;
        public int size;
        public double[] vecxTable;
        public double[] vecyTable;
        double weight;
        final double pi2 = 6.283185307179586d;
        double magnitude = 0.0d;

        public BarBin(double d, int i) {
            this.resolution = i;
            this.resolutionD = i;
            double d2 = i;
            Double.isNaN(d2);
            int round = (int) Math.round(d * d2);
            this.size = round;
            this.binData = new double[round];
            this.vecxTable = new double[round];
            this.vecyTable = new double[round];
            int i2 = 0;
            while (true) {
                int i3 = this.size;
                if (i2 < i3) {
                    double d3 = i2;
                    double d4 = i3;
                    double d5 = this.resolutionD;
                    Double.isNaN(d4);
                    Double.isNaN(d3);
                    double d6 = (d3 / (d4 / d5)) * 6.283185307179586d;
                    double cos = Math.cos(d6);
                    double sin = Math.sin(d6);
                    double sqrt = Math.sqrt((cos * cos) + (sin * sin));
                    this.vecxTable[i2] = cos / sqrt;
                    this.vecyTable[i2] = sin / sqrt;
                    i2++;
                } else {
                    CalcWeights();
                    return;
                }
            }
        }

        void CalcWeights() {
            if (this.size == 0) {
                this.sineMagnitude = 1.0d;
                this.weight = 1.0d;
                return;
            }
            Reset();
            int i = 0;
            while (true) {
                int i2 = this.size;
                if (i < i2) {
                    AddData(i, this.vecxTable[i] * 0.009999999776482582d);
                    i++;
                } else {
                    this.weight = 1.0d;
                    Finialize(1.0d, i2);
                    double d = this.magnitude;
                    this.sineMagnitude = d;
                    this.weight = d;
                    return;
                }
            }
        }

        public void Reset() {
            this.complexX = 0.0d;
            this.complexY = 0.0d;
            Arrays.fill(this.binData, 0.0d);
        }

        public void AddData(int i, double d) {
            this.complexX += this.vecxTable[i] * d;
            this.complexY += this.vecyTable[i] * d;
        }

        public double Finialize(double d, int i) {
            double d2 = this.complexX;
            double d3 = i;
            Double.isNaN(d3);
            double d4 = d2 / d3;
            this.complexX = d4;
            double d5 = this.complexY;
            Double.isNaN(d3);
            double d6 = d5 / d3;
            this.complexY = d6;
            double sqrt = Math.sqrt((d4 * d4) + (d6 * d6));
            this.magnitude = sqrt;
            double d7 = sqrt * 800.0d;
            this.magnitude = d7;
            return d7;
        }

        public double GetMagnitude() {
            return this.magnitude;
        }
    }

    public void Initialize(float[] fArr, int i) {
        if (this.bins.length != fArr.length) {
            this.bins = new BarBin[fArr.length];
        }
        this.binCount = this.bins.length;
        int round = Math.round(this.sampleRate / 400.0f);
        this.sampleRate = i;
        for (int i2 = 0; i2 < this.bins.length; i2++) {
            double d = fArr[i2] < 1.0f ? 0.0d : this.sampleRate / fArr[i2];
            BarBin[] barBinArr = this.bins;
            double d2 = round;
            Double.isNaN(d2);
            barBinArr[i2] = new BarBin(d, Math.max((int) Math.round(d2 / d), 1));
        }
    }

    public void CalcBarSampleOpCountPerPart(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        for (int i2 = 0; i2 < this.binCount; i2++) {
            i += this.bins[i2].size;
        }
        int i3 = i / length;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < this.binCount; i6++) {
            i4 += this.bins[i6].size;
            int i7 = i5 + 1;
            if (i4 > i3 * i7) {
                iArr[i5] = i6;
                if (i7 == length) {
                    break;
                }
                i5 = i7;
            }
        }
        iArr[length - 1] = this.binCount;
    }

    public void Process(double[] dArr, int i, int i2, double[] dArr2, double d, double d2) {
        int length = dArr.length;
        while (i < i2) {
            this.bins[i].Reset();
            if (this.bins[i].size > 0) {
                for (int i3 = 0; i3 < length; i3++) {
                    double d3 = dArr[i3];
                    BarBin[] barBinArr = this.bins;
                    barBinArr[i].AddData(i3 % barBinArr[i].size, d3);
                }
                dArr2[i] = this.bins[i].Finialize(1.0d, length);
            } else {
                dArr2[i] = this.bins[i].Finialize(1.0d, 1);
            }
            i++;
        }
    }

    public int GetBinCount() {
        return this.bins.length;
    }

    public double GetBinMagnitude(int i) {
        return this.bins[i].GetMagnitude();
    }

    public void GetBinMagnitudes(double[] dArr) {
        int length = this.bins.length;
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = this.bins[i % length].GetMagnitude();
        }
    }
}
