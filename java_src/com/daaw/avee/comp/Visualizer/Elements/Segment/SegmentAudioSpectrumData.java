package com.daaw.avee.comp.Visualizer.Elements.Segment;

import com.daaw.avee.Common.ISimpleListDouble;
import com.daaw.avee.Common.ISimpleListFloat;
import com.daaw.avee.Common.ISimpleListShort;
import com.daaw.avee.Common.SimpleListConstantShort;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Dsp.DspCurves;
import com.daaw.avee.comp.Visualizer.Dsp.DspWindows;
import com.daaw.avee.comp.Visualizer.Dsp.RangeBox;
import com.daaw.avee.comp.Visualizer.Dsp.SignalFilter1d;
import com.daaw.avee.comp.Visualizer.Elements.Base.FrameValuesAccumulator;
import com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable;
import com.daaw.avee.comp.Visualizer.Elements.Base.IFrameDataProvider;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider;
import com.daaw.avee.comp.playback.AudioFrameData;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import lomont.FFTBase;
import lomont.Lomont4FFT;
/* loaded from: classes.dex */
public class SegmentAudioSpectrumData implements ISegmentDataProvider, IFrameDataProvider {
    static final boolean debug = false;
    public static final String typeName = "Spectrum";
    FrameValuesAccumulator frameValuesAccumulator = new FrameValuesAccumulator();
    final AudioProcess audioProcess = new AudioProcess();
    final BlockingQueue<ProcessingData> processingQueue = new ArrayBlockingQueue(1);
    final BlockingQueue<float[]> processingResultQueue = new ArrayBlockingQueue(2);
    Thread audioProcessTh = null;

    public void setSampleInCountPower(int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class AudioProcess implements ICustomizable {
        private float hiFreq;
        private float loFreq;
        private int sampleInCountPower = 10;
        private int dataCount = 1024;
        private double[] fftMag = new double[1];
        private float[] fftMagSlide = new float[1];
        private float[] fftMagSmooth = new float[1];
        private float[] pcmRangeTmp = new float[2];
        private int starBar = 0;
        private int endBar = 0;
        private float freqShift = 0.0f;
        private int barsCount = 64;
        private float[] barSmoothValues = new float[1];
        private float[] barValues = new float[1];
        private float[] barFreq = new float[1];
        private float[] barFreqNext = new float[1];
        private float[] beatBarValue = new float[1];
        private float beatBarValueSmooth = 0.0f;
        private boolean mirrorSampleValues = false;
        private int repeatSamples = 1;
        private float smoothFactor = 0.8f;
        private float smoothFactor2 = 1.0f;
        private final float rangeTarget = 300.0f;
        private final float rangeSmoothAttackFactor = 0.9f;
        private final float rangeSmoothDecayFactor = 0.01f;
        private float beatSmoothFactor = 0.4f;
        private int rmsTargetBar = 4;
        private float windowedRms = 0.0f;
        private float rangeHiSmooth = 1000.0f;
        private float rangeLoSmooth = 0.0f;
        private float rangeSmoothMul = 1.0f;
        private float steadySmooth = 0.0f;
        private int[] fftSoftnessIndexes = new int[0];
        private float[] fftSoftnessWeight = new float[0];
        private float fftSoftnessDivider = 1.0f;
        private int fftSoftnessWidth = 2;
        private float freqLinfactor = 0.0f;
        private float aweightFft = 0.2f;
        private float outputMultiplier = 1.0f;
        private boolean frequencyBinSliding = true;
        float[] fftWindowMultipliers = new float[0];
        private float peakBarSmoothFactor = 0.5f;
        private float peakBarIndex01 = 0.0f;
        private float peakBarIndex01Smooth = 0.0f;
        RangeBox beatRange = new RangeBox(0.5f);
        SignalFilter1d fftFilter = new SignalFilter1d().createHighPass(1, 1.0f);
        double[] fftResultDouble = new double[0];
        int fftTransformInitializeSize = 0;
        FFTBase fftTransform = new Lomont4FFT();
        ISimpleListDouble fftResultAccess = new ISimpleListDouble() { // from class: com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentAudioSpectrumData.AudioProcess.1
            @Override // com.daaw.avee.Common.ISimpleListDouble
            public int size() {
                return AudioProcess.this.fftResultDouble.length / 2;
            }

            @Override // com.daaw.avee.Common.ISimpleListDouble
            public double get(int i) {
                int i2 = i * 2;
                int i3 = i2 + 1;
                return Math.sqrt((AudioProcess.this.fftResultDouble[i2] * AudioProcess.this.fftResultDouble[i2]) + (AudioProcess.this.fftResultDouble[i3] * AudioProcess.this.fftResultDouble[i3]));
            }
        };

        public AudioProcess() {
            setSampleOutCount(64, 0.06f, 0);
            setFftSoftness(1);
            setSampleInCountPower(11);
            setBeatRangeCorners(0.0f, 0.2f, 0.7f, 35.0f);
            setFftFilter(1, 1.0f);
        }

        private void setSampleInCountPower(int i) {
            this.sampleInCountPower = i;
            this.dataCount = Math.min(Math.max(1 << i, 32), 8192);
        }

        private void setSampleOutCount(int i, float f, int i2) {
            setSampleOutCount(i, 20.0f, 18000.0f, false, 1, f, i2, i2, 0.0f);
        }

        private void setSampleOutCount(int i, boolean z, int i2) {
            setSampleOutCount(i, 20.0f, 18000.0f, z, i2, 0.06f, 0, 0, 0.0f);
        }

        private void setSampleOutCount(int i, float f, float f2, boolean z, int i2, float f3) {
            setSampleOutCount(i, f, f2, z, i2, f3, 0, 0, 0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void setSampleOutCount(int i, float f, float f2, boolean z, int i2, float f3, int i3, int i4, float f4) {
            this.loFreq = Math.max(f, 0.1f);
            this.hiFreq = f2;
            this.barsCount = Math.max(1, Math.min(i, 10000));
            this.mirrorSampleValues = z;
            this.repeatSamples = Math.max(i2, 1);
            this.freqLinfactor = f3;
            this.barFreq = new float[this.barsCount];
            this.barFreqNext = new float[this.barsCount];
            this.starBar = i3;
            this.endBar = i4;
            this.freqShift = f4;
            updateBandsFreq(this.barsCount, this.loFreq, f2, z, f3, i3, i4, f4);
            setBeatBart(6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void setSmoothFactor(float f) {
            this.smoothFactor = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void setSmoothFactor2(float f) {
            this.smoothFactor2 = f;
        }

        public synchronized void setBeatBart(int i) {
            this.rmsTargetBar = i;
        }

        public synchronized void setDataMode(int i) {
        }

        public synchronized void setSmooth(float f) {
            this.smoothFactor = Math.max(f, 0.01f);
        }

        public synchronized void setSmooth2(float f) {
            this.smoothFactor2 = Math.max(f, 0.01f);
        }

        public synchronized void setSteadySmooth(float f) {
            this.steadySmooth = Math.max(f, 0.01f);
        }

        public synchronized void setFftSoftness(int i) {
            if (i < 1) {
                i = 1;
            }
            int[] iArr = new int[i + 1 + i];
            this.fftSoftnessIndexes = iArr;
            this.fftSoftnessWeight = new float[iArr.length];
            this.fftSoftnessDivider = iArr.length;
            for (int i2 = 0; i2 < this.fftSoftnessIndexes.length; i2++) {
                int i3 = i2 - i;
                this.fftSoftnessIndexes[i2] = i3;
                this.fftSoftnessWeight[i2] = DspWindows.hammingWindow(((this.fftSoftnessIndexes.length + 2) / 2) + i3, this.fftSoftnessIndexes.length + 2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void setFftFilter(int i, float f) {
            this.fftFilter.createHighPass(i, f);
        }

        public synchronized void setFrequencyBinSliding(boolean z) {
            this.frequencyBinSliding = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void setBeatSmooth(float f) {
            this.beatSmoothFactor = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void setBeatRangeCorners(float f, float f2, float f3, float f4) {
            this.beatRange.setCorners(f, f2, f3, f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized float[] processTh(float f, InternalVisualizationDataProvider internalVisualizationDataProvider) {
            ISimpleListShort simpleListConstantShort;
            int i;
            int i2;
            boolean z;
            int i3;
            int onRequestOverrideAudioFrameSamplesInCount = internalVisualizationDataProvider.onRequestOverrideAudioFrameSamplesInCount();
            if (onRequestOverrideAudioFrameSamplesInCount <= 0) {
                onRequestOverrideAudioFrameSamplesInCount = this.dataCount;
            }
            AudioFrameData onRequestSoundVisualizationData = internalVisualizationDataProvider.onRequestSoundVisualizationData(onRequestOverrideAudioFrameSamplesInCount);
            int i4 = 4;
            if (onRequestSoundVisualizationData != null) {
                simpleListConstantShort = onRequestSoundVisualizationData.pcmAsMonoForFft_DoubleDataRate();
                i = simpleListConstantShort.size();
                boolean IsDoubleDataRate = onRequestSoundVisualizationData.IsDoubleDataRate();
                i2 = onRequestSoundVisualizationData.sampleRate;
                this.pcmRangeTmp[0] = 0.0f;
                this.pcmRangeTmp[1] = onRequestSoundVisualizationData.maxPcmValue;
                z = IsDoubleDataRate;
            } else {
                simpleListConstantShort = new SimpleListConstantShort((short) 0, 4);
                this.pcmRangeTmp[0] = 0.0f;
                this.pcmRangeTmp[1] = 1000.0f;
                i = 4;
                i2 = 44100;
                z = false;
            }
            if (i < 4) {
                simpleListConstantShort = new SimpleListConstantShort((short) 0, 4);
                i3 = 44100;
            } else {
                i4 = i;
                i3 = i2;
            }
            if (this.barValues.length != this.barsCount) {
                this.barValues = new float[this.barsCount];
            }
            if (this.barSmoothValues.length != this.barValues.length) {
                this.barSmoothValues = new float[this.barValues.length];
                for (int i5 = 0; i5 < this.barSmoothValues.length; i5++) {
                    this.barSmoothValues[i5] = 0.0f;
                }
            }
            if (i4 != this.fftWindowMultipliers.length) {
                this.fftWindowMultipliers = new float[i4];
                for (int i6 = 0; i6 < i4; i6++) {
                    this.fftWindowMultipliers[i6] = DspWindows.hannWindow(i6, i4) * 0.00390625f;
                }
            }
            updateRange(this.pcmRangeTmp);
            if (this.fftResultDouble.length != i4) {
                this.fftResultDouble = new double[i4];
            }
            float f2 = 0.0f;
            for (int i7 = 0; i7 < this.fftResultDouble.length; i7++) {
                float f3 = simpleListConstantShort.get(i7) * this.fftWindowMultipliers[i7] * this.rangeSmoothMul;
                f2 += f3 * f3;
                this.fftResultDouble[i7] = f3;
            }
            if (this.fftTransformInitializeSize != i4) {
                this.fftTransformInitializeSize = i4;
                this.fftTransform.Initialize(i4);
            }
            this.fftTransform.RealFFT(this.fftResultDouble, true);
            if (i4 > 0) {
                f2 = (float) Math.sqrt(f2 / i4);
            }
            this.windowedRms = f2;
            fillBarValues2(this.barValues, this.outputMultiplier, this.mirrorSampleValues, this.fftResultAccess, i3, new float[2], this.beatBarValue, z);
            this.beatRange.reset(this.barSmoothValues.length);
            Assert.assertEquals(this.barValues.length, this.barSmoothValues.length);
            this.peakBarIndex01 = 0.0f;
            float f4 = -10000.0f;
            for (int i8 = 0; i8 < this.barValues.length; i8++) {
                if (this.barValues[i8] > f4) {
                    f4 = this.barValues[i8];
                    this.peakBarIndex01 = i8;
                }
                float f5 = this.barValues[i8] - this.barSmoothValues[i8];
                float[] fArr = this.barSmoothValues;
                fArr[i8] = fArr[i8] + (f5 * 20.0f * f * this.smoothFactor);
                this.barSmoothValues[i8] = Math.max(this.barSmoothValues[i8], 0.0f);
                this.beatRange.addValue(i8, this.barSmoothValues[i8]);
            }
            this.beatBarValue[0] = this.beatRange.getValueNormal();
            this.beatBarValueSmooth = (this.beatBarValueSmooth * (1.0f - this.beatSmoothFactor)) + (this.beatBarValue[0] * this.beatSmoothFactor);
            float length = this.peakBarIndex01 / this.barValues.length;
            this.peakBarIndex01 = length;
            this.peakBarIndex01Smooth = (this.peakBarIndex01Smooth * (1.0f - this.peakBarSmoothFactor)) + (length * this.peakBarSmoothFactor);
            return this.barSmoothValues;
        }

        private void updateRange(float[] fArr) {
            this.rangeLoSmooth = (this.rangeLoSmooth * 0.100000024f) + (fArr[0] * 0.9f);
            float f = fArr[1];
            float f2 = this.rangeHiSmooth;
            if (f > f2) {
                this.rangeHiSmooth = (f2 * 0.100000024f) + (fArr[1] * 0.9f);
            } else {
                this.rangeHiSmooth = (f2 * 0.99f) + (fArr[1] * 0.01f);
            }
            float f3 = this.rangeHiSmooth - this.rangeLoSmooth;
            this.rangeSmoothMul = f3;
            if (f3 < 1.0f) {
                this.rangeSmoothMul = 1.0f;
            }
            this.rangeSmoothMul = 300.0f / this.rangeSmoothMul;
        }

        private void fillBarValues2(float[] fArr, float f, boolean z, ISimpleListDouble iSimpleListDouble, int i, float[] fArr2, float[] fArr3, boolean z2) {
            int size;
            int i2 = 0;
            if (fArr.length < 4) {
                while (i2 < fArr.length) {
                    fArr[i2] = 0.0f;
                    i2++;
                }
                return;
            }
            fArr2[0] = 9999990.0f;
            fArr2[1] = -9999990.0f;
            if (this.fftMag.length != iSimpleListDouble.size()) {
                this.fftMag = new double[iSimpleListDouble.size()];
                this.fftMagSlide = new float[iSimpleListDouble.size()];
                int i3 = 0;
                while (true) {
                    float[] fArr4 = this.fftMagSlide;
                    if (i3 >= fArr4.length) {
                        break;
                    }
                    fArr4[i3] = 0.0f;
                    i3++;
                }
            }
            for (int i4 = 0; i4 < this.fftMag.length; i4++) {
                float max = Math.max((float) this.fftFilter.getSoftedClamped(i4, iSimpleListDouble), 0.0f);
                if (this.aweightFft > 0.0f) {
                    float myAWeight1000 = (float) DspCurves.myAWeight1000(DspCurves.freqd(i4, this.fftMag.length, i));
                    float f2 = this.aweightFft;
                    max *= (1.0f - f2) + (f2 * myAWeight1000 * myAWeight1000 * myAWeight1000);
                }
                double[] dArr = this.fftMag;
                double d = dArr[i4];
                float f3 = this.smoothFactor2;
                double d2 = 1.0f - f3;
                Double.isNaN(d2);
                double d3 = max * f3;
                Double.isNaN(d3);
                dArr[i4] = (d * d2) + d3;
            }
            if (z2) {
                size = iSimpleListDouble.size() * 2;
            } else {
                size = iSimpleListDouble.size();
            }
            float f4 = i / size;
            fArr[0] = 0.0f;
            while (i2 < fArr.length) {
                float abs = ((Math.abs(this.barFreq[i2] - this.barFreqNext[i2]) / 50.0f) * 0.3f) + 0.7f;
                int i5 = (int) (this.barFreqNext[i2] / f4);
                fArr[i2] = 0.0f;
                int min = Math.min((int) (this.barFreq[i2] / f4), this.fftMag.length);
                for (int i6 = i5; i6 < min; i6++) {
                    fArr[i2] = fArr[i2] + (((float) this.fftMag[i6]) / (min - i5));
                }
                fArr[i2] = fArr[i2] * abs * f;
                i2++;
            }
        }

        private float getMag2b(float f, float f2, int i, int i2, double[] dArr, float f3, int i3) {
            int max = Math.max(i2 - i, 1);
            int i4 = max / 2;
            float f4 = 0.0f;
            for (int i5 = 0; i5 < max; i5++) {
                double d = f4;
                double d2 = dArr[((i5 + i) + dArr.length) % dArr.length];
                double d3 = 1.0f;
                Double.isNaN(d3);
                Double.isNaN(d3);
                Double.isNaN(d);
                f4 = (float) (d + (d2 * d3 * d3));
            }
            return f4 / (f2 - f);
        }

        private float getMag2c(float f, float f2, int i, double[] dArr, float f3) {
            if (f < 1.0E-7f) {
                return 0.0f;
            }
            int length = ((i + 0) + dArr.length) % dArr.length;
            double d = 0.0f;
            double d2 = dArr[length];
            double min = 1.0f - Math.min(Math.abs((f - ((length + 0.0f) * f3)) / ((f - f2) + 1.0E-9f)), 1.0f);
            Double.isNaN(min);
            Double.isNaN(d);
            return (float) (d + (d2 * min));
        }

        private float getMag2(float f, float f2, int i, double[] dArr, float f3) {
            float f4 = 0.0f;
            int i2 = 0;
            while (true) {
                int[] iArr = this.fftSoftnessIndexes;
                if (i2 < iArr.length) {
                    int length = ((iArr[i2] + i) + dArr.length) % dArr.length;
                    float f5 = length;
                    float f6 = this.fftMagSlide[length];
                    float min = 1.0f - Math.min(Math.abs((f - ((((f5 - 0.5f) * f3) * (1.0f - f6)) + (((f5 + 0.5f) * f3) * f6))) / ((f - f2) * 1.0f)), 1.0f);
                    double d = f4;
                    double d2 = dArr[length];
                    double d3 = min;
                    Double.isNaN(d3);
                    double d4 = d2 * d3;
                    double d5 = this.fftSoftnessWeight[i2];
                    Double.isNaN(d5);
                    Double.isNaN(d);
                    f4 = (float) (d + (d4 * d5));
                    i2++;
                } else {
                    return f4 / this.fftSoftnessDivider;
                }
            }
        }

        private float getMag2_3(float f, float f2, int i, double[] dArr, float f3) {
            int length = ((this.fftSoftnessIndexes[0] + i) + dArr.length) % dArr.length;
            float f4 = length;
            float f5 = this.fftMagSlide[length];
            float f6 = (f - f2) * 1.0f;
            double d = 0.0f;
            double d2 = dArr[length];
            double min = 1.0f - Math.min(Math.abs((f - ((((f4 - 0.5f) * f3) * (1.0f - f5)) + (((f4 + 0.5f) * f3) * f5))) / f6), 1.0f);
            Double.isNaN(min);
            double d3 = this.fftSoftnessWeight[0];
            Double.isNaN(d3);
            Double.isNaN(d);
            int length2 = ((this.fftSoftnessIndexes[1] + i) + dArr.length) % dArr.length;
            float f7 = length2;
            float f8 = this.fftMagSlide[length2];
            double d4 = (float) (d + (d2 * min * d3));
            double d5 = dArr[length2];
            double min2 = 1.0f - Math.min(Math.abs((f - ((((f7 - 0.5f) * f3) * (1.0f - f8)) + (((f7 + 0.5f) * f3) * f8))) / f6), 1.0f);
            Double.isNaN(min2);
            double d6 = d5 * min2;
            double d7 = this.fftSoftnessWeight[1];
            Double.isNaN(d7);
            Double.isNaN(d4);
            int length3 = ((this.fftSoftnessIndexes[2] + i) + dArr.length) % dArr.length;
            float f9 = length3;
            float f10 = this.fftMagSlide[length3];
            float min3 = 1.0f - Math.min(Math.abs((f - ((((f9 - 0.5f) * f3) * (1.0f - f10)) + (((f9 + 0.5f) * f3) * f10))) / f6), 1.0f);
            double d8 = (float) (d4 + (d6 * d7));
            double d9 = dArr[length3];
            double d10 = min3;
            Double.isNaN(d10);
            double d11 = d9 * d10;
            double d12 = this.fftSoftnessWeight[2];
            Double.isNaN(d12);
            Double.isNaN(d8);
            return ((float) (d8 + (d11 * d12))) / this.fftSoftnessDivider;
        }

        private float getFftSlidingFreq2(int i, double[] dArr) {
            if (i == 0) {
                return dArr[i + 1] > dArr[i] ? 1.0f : 5.0f;
            } else if (i >= dArr.length - 1) {
                return 0.5f;
            } else {
                return dArr[i + 1] > dArr[i + (-1)] ? 1.0f : 0.0f;
            }
        }

        private float getFftSlidingFreq3(int i, double[] dArr) {
            if (i == 0) {
                return dArr[i + 1] > dArr[i] ? 1.0f : 5.0f;
            } else if (i >= dArr.length - 1) {
                return 0.5f;
            } else {
                return dArr[i] > dArr[i + (-1)] ? 1.0f : 0.0f;
            }
        }

        private void updateBandsFreq(int i, float f, float f2, boolean z, float f3, int i2, int i3, float f4) {
            int max = Math.max(0, i2);
            int max2 = Math.max(0, i3);
            boolean z2 = z && i > 1;
            int i4 = z2 ? i / 2 : i;
            int i5 = ((z2 ? i / 2 : i) - max) - max2;
            int max3 = Math.max(i5 / this.repeatSamples, 1);
            for (int i6 = 0; i6 < i; i6++) {
                this.barFreq[i6] = 0.0f;
            }
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            float f5 = Float.MAX_VALUE;
            float f6 = 0.0f;
            while (i9 < i5) {
                int i10 = ((i9 - ((int) (i5 * f4))) + i5) % max3;
                int i11 = i9 + max;
                int i12 = i5;
                int i13 = max;
                int i14 = i7;
                int i15 = i8;
                int i16 = i9;
                this.barFreq[i11] = (float) logspace(f, f2, i10, max3);
                float[] fArr = this.barFreq;
                fArr[i11] = (fArr[i11] * (1.0f - f3)) + ((f + ((f2 - f) * i10 * (1.0f / max3))) * f3);
                if (f5 > fArr[i11]) {
                    f5 = fArr[i11];
                    i7 = i11;
                } else {
                    i7 = i14;
                }
                float[] fArr2 = this.barFreq;
                if (f6 < fArr2[i11]) {
                    f6 = fArr2[i11];
                    i8 = i11;
                } else {
                    i8 = i15;
                }
                i9 = i16 + 1;
                i5 = i12;
                max = i13;
            }
            int i17 = max;
            int i18 = i5;
            int i19 = i7;
            int i20 = i8;
            int i21 = 0;
            while (i21 < i) {
                int i22 = i17;
                float f7 = (i21 <= i22 || i21 == i19) ? this.barFreq[i21] : this.barFreq[((i21 - 1) + i) % i];
                float f8 = (i21 >= (i18 - max2) - 1 || i21 == i20) ? this.barFreq[i21] : this.barFreq[(i21 + 1) % i];
                this.barFreqNext[i21] = Math.min(f7, f8);
                if (f7 < 0.0f) {
                    if (f8 < 0.0f) {
                        this.barFreqNext[i21] = 0.0f;
                    } else {
                        this.barFreqNext[i21] = f8;
                    }
                } else if (f7 < 0.0f) {
                    this.barFreqNext[i21] = 0.0f;
                } else {
                    this.barFreqNext[i21] = f7;
                }
                i21++;
                i17 = i22;
            }
            for (int i23 = 0; i23 < i; i23++) {
                float[] fArr3 = this.barFreq;
                if (fArr3[i23] < 0.0f) {
                    fArr3[i23] = 0.0f;
                }
                float[] fArr4 = this.barFreqNext;
                if (fArr4[i23] < 0.0f) {
                    fArr4[i23] = 0.0f;
                }
            }
            int i24 = i - 1;
            int i25 = 1;
            for (int i26 = i24; i26 >= i4; i26--) {
                float[] fArr5 = this.barFreq;
                fArr5[i26] = fArr5[i25];
                float[] fArr6 = this.barFreqNext;
                fArr6[i26] = fArr6[i25];
                i25 = Math.min(i25 + 1, i24);
            }
        }

        static double logspace(double d, double d2, int i, int i2) {
            double d3 = i;
            double d4 = i2 - 1;
            Double.isNaN(d3);
            Double.isNaN(d4);
            return d * Math.pow(d2 / d, d3 / d4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void setAweightFft(float f) {
            this.aweightFft = f;
        }

        private synchronized void setOutputMultiplier(float f) {
            this.outputMultiplier = f;
        }

        @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
        public synchronized void onApplyCustomization(CustomPropertiesList customPropertiesList) {
            setSampleInCountPower(customPropertiesList.getPropertyInt("fftSize", 11));
            setSampleOutCount(customPropertiesList.getPropertyInt("sampleOutCount", 128), customPropertiesList.getPropertyFloat("lowerHz", 20.0f), customPropertiesList.getPropertyFloat("higherHz", 18000.0f), customPropertiesList.getPropertyBool("mirrorSamples", false), customPropertiesList.getPropertyInt("repeatSamples", 1), customPropertiesList.getPropertyFloat("hzLinearFactor", 0.06f), customPropertiesList.getPropertyInt("starAndEndGap", 0), customPropertiesList.getPropertyInt("starAndEndGap", 0), customPropertiesList.getPropertyFloat("freqShift", 0.0f));
            setSmoothFactor(customPropertiesList.getPropertyFloat("smooth", 0.8f));
            setSmoothFactor2(customPropertiesList.getPropertyFloat("preSmooth", 1.0f));
            setFftFilter(customPropertiesList.getPropertyInt("filterRadius", 1), customPropertiesList.getPropertyFloat("filterStrength", 1.0f));
            setBeatSmooth(customPropertiesList.getPropertyFloat("beatSmooth", 0.4f));
            setBeatRangeCorners(customPropertiesList.getPropertyFloat("beatRangeBarFirst", 0.0f), customPropertiesList.getPropertyFloat("beatRangeBarLast", 0.2f), customPropertiesList.getPropertyFloat("beatRangeValueLower", 0.7f), customPropertiesList.getPropertyFloat("beatRangeValueHigher", 35.0f));
            setAweightFft(customPropertiesList.getPropertyFloat("aWeight", 0.2f));
            setOutputMultiplier(customPropertiesList.getPropertyFloat("outputMultiplier", 1.0f));
        }

        @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
        public synchronized void onReadCustomization(CustomPropertiesList customPropertiesList) {
            customPropertiesList.putPropertyIntAsRange("fftSize", this.sampleInCountPower, "Performance", 7, 13);
            customPropertiesList.putPropertyIntAsRange("sampleOutCount", this.barsCount, "1_spectrum", 0, 512);
            customPropertiesList.putPropertyFloatAsRange("lowerHz", this.loFreq, "1_spectrumHz", 0.0f, 300.0f);
            customPropertiesList.putPropertyFloatAsRange("higherHz", this.hiFreq, "1_spectrumHz", 300.0f, 18000.0f);
            customPropertiesList.putPropertyFloatAsRange("hzLinearFactor", this.freqLinfactor, "1_spectrumHz", 0.0f, 1.0f);
            customPropertiesList.putPropertyFloatAsRange("freqShift", this.freqShift, "1_spectrumHz", 0.0f, 1.0f);
            customPropertiesList.putPropertyBool("mirrorSamples", this.mirrorSampleValues, "1_spectrum");
            customPropertiesList.putPropertyIntAsRange("repeatSamples", this.repeatSamples, "1_spectrum", 1, 6);
            customPropertiesList.putPropertyIntAsRange("starAndEndGap", this.starBar, "1_spectrum", 0, 30);
            customPropertiesList.putPropertyFloatAsRange("smooth", this.smoothFactor, "1_spectrum", 0.1f, 1.0f);
            customPropertiesList.putPropertyFloatAsRange("preSmooth", this.smoothFactor2, "1_spectrum", 0.1f, 1.0f);
            customPropertiesList.putPropertyIntAsRange("filterRadius", this.fftFilter.getRadius(), "1_spectrum", 0, 20);
            customPropertiesList.putPropertyFloatAsRange("filterStrength", this.fftFilter.getStrength(), "1_spectrum", 0.1f, 2.0f);
            customPropertiesList.putPropertyFloatAsRange("beatSmooth", this.beatSmoothFactor, "beat", 0.1f, 1.0f);
            customPropertiesList.putPropertyFloatAsRange("beatRangeBarFirst", this.beatRange.getX0(), "beat", 0.0f, 1.0f);
            customPropertiesList.putPropertyFloatAsRange("beatRangeBarLast", this.beatRange.getX1(), "beat", 0.0f, 1.0f);
            customPropertiesList.putPropertyFloatAsRange("beatRangeValueLower", this.beatRange.getY0(), "beat", 0.0f, 50.0f);
            customPropertiesList.putPropertyFloatAsRange("beatRangeValueHigher", this.beatRange.getY1(), "beat", 0.0f, 100.0f);
            customPropertiesList.putPropertyFloatAsRange("aWeight", this.aweightFft, "1_spectrum", 0.0f, 1.0f);
            customPropertiesList.putPropertyFloatAsRange("outputMultiplier", this.outputMultiplier, "1_spectrum", 0.1f, 3.0f);
        }

        public synchronized float getBeatBarValueSmooth() {
            return this.beatBarValueSmooth;
        }

        public synchronized float getPeakBarIndexSmooth() {
            return this.peakBarIndex01Smooth;
        }
    }

    /* loaded from: classes.dex */
    private static class ProcessingData {
        private float frameTimeF;
        private InternalVisualizationDataProvider visualisationData;

        public ProcessingData(float f, InternalVisualizationDataProvider internalVisualizationDataProvider) {
            this.frameTimeF = f;
            this.visualisationData = internalVisualizationDataProvider;
        }
    }

    private void MaybeStartAudioProcessThread() {
        Thread thread = this.audioProcessTh;
        if (thread == null || !thread.isAlive()) {
            tlog.d("Starting audioProcessTh");
            Thread thread2 = new Thread(new Runnable() { // from class: com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentAudioSpectrumData.1
                @Override // java.lang.Runnable
                public void run() {
                    ProcessingData poll;
                    while (true) {
                        try {
                            poll = SegmentAudioSpectrumData.this.processingQueue.poll(10000L, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException unused) {
                        }
                        if (poll == null) {
                            return;
                        }
                        SegmentAudioSpectrumData.this.processingResultQueue.add(SegmentAudioSpectrumData.this.audioProcess.processTh(poll.frameTimeF, poll.visualisationData));
                    }
                }
            });
            this.audioProcessTh = thread2;
            thread2.start();
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentDataProvider
    public void process(IRenderState iRenderState, InternalVisualizationDataProvider internalVisualizationDataProvider) {
        if (!iRenderState.getMultiThread()) {
            this.frameValuesAccumulator.addFrame(this.audioProcess.processTh(iRenderState.getFrameTimeF(), internalVisualizationDataProvider));
            return;
        }
        MaybeStartAudioProcessThread();
        try {
            float[] poll = this.processingResultQueue.poll(100L, TimeUnit.MILLISECONDS);
            if (poll != null) {
                this.frameValuesAccumulator.addFrame(poll);
            }
        } catch (InterruptedException unused) {
        }
        this.processingQueue.offer(new ProcessingData(iRenderState.getFrameTimeF(), internalVisualizationDataProvider));
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentDataProvider
    public float[] getFrameValues(int i, int i2) {
        return this.frameValuesAccumulator.getFrameValues(i, i2);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentDataProvider
    public ISimpleListFloat createFrameValuesAccessorList(int i, int i2, int i3, ISimpleListFloat iSimpleListFloat) {
        return this.frameValuesAccumulator.createFrameValuesAccessorList(i, i2, i3, iSimpleListFloat);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.IFrameDataProvider
    public float getRms() {
        return this.audioProcess.getBeatBarValueSmooth();
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.IFrameDataProvider
    public float getPeakBarIndex() {
        return this.audioProcess.getPeakBarIndexSmooth();
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        this.audioProcess.onApplyCustomization(customPropertiesList);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
        this.audioProcess.onReadCustomization(customPropertiesList);
    }

    public void setSampleOutCount(int i, float f, int i2) {
        setSampleOutCount(i, 20.0f, 18000.0f, false, 1, f, i2, i2, 0.0f);
    }

    public void setSampleOutCount(int i, boolean z, int i2) {
        setSampleOutCount(i, 20.0f, 18000.0f, z, i2, 0.06f, 0, 0, 0.0f);
    }

    public void setSampleOutCount(int i, float f, float f2, boolean z, int i2, float f3) {
        setSampleOutCount(i, f, f2, z, i2, f3, 0, 0, 0.0f);
    }

    public void setSampleOutCount(int i, float f, float f2, boolean z, int i2, float f3, int i3, int i4, float f4) {
        this.audioProcess.setSampleOutCount(i, f, f2, z, i2, f3, i3, i4, f4);
    }

    public void setSmoothFactor(float f) {
        this.audioProcess.setSmoothFactor(f);
    }

    public void setSmoothFactor2(float f) {
        this.audioProcess.setSmoothFactor2(f);
    }

    public void setBeatBart(int i) {
        this.audioProcess.setBeatBart(i);
    }

    public void setDataMode(int i) {
        this.audioProcess.setDataMode(i);
    }

    public void setSmooth(float f) {
        this.audioProcess.setSmooth(f);
    }

    public void setSmooth2(float f) {
        this.audioProcess.setSmooth2(f);
    }

    public void setSteadySmooth(float f) {
        this.audioProcess.setSteadySmooth(f);
    }

    public void setFftSoftness(int i) {
        this.audioProcess.setFftSoftness(i);
    }

    public void setFftFilter(int i, float f) {
        this.audioProcess.setFftFilter(i, f);
    }

    public void setFrequencyBinSliding(boolean z) {
        this.audioProcess.setFrequencyBinSliding(z);
    }

    public void setBeatSmooth(float f) {
        this.audioProcess.setBeatSmooth(f);
    }

    public void setBeatRangeCorners(float f, float f2, float f3, float f4) {
        this.audioProcess.setBeatRangeCorners(f, f2, f3, f4);
    }

    public void setAweightFft(float f) {
        this.audioProcess.setAweightFft(f);
    }
}
