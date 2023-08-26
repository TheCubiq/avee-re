package com.daaw.avee.comp.Visualizer.Elements.Segment;

import com.daaw.avee.Common.ISimpleListFloat;
import com.daaw.avee.Common.ISimpleListShort;
import com.daaw.avee.Common.SimpleListConstantShort;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Dsp.DspWindows;
import com.daaw.avee.comp.Visualizer.Elements.Base.IFrameDataProvider;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider;
import com.daaw.avee.comp.playback.AudioFrameData;
/* loaded from: classes.dex */
public class SegmentAudioWaveformData implements ISegmentDataProvider, IFrameDataProvider {
    public static final String typeName = "Waveform";
    private float[] barVals2 = new float[2];
    private float rms = 0.0f;
    private float beat = 0.0f;
    private float[] pcmRangeTmp = new float[2];
    private int sampleInCountPower = 11;
    private int sampleOutCountPower = 8;
    private final float rangeTarget = 300.0f;
    private final float rangeSmoothAttackFactor = 0.9f;
    private final float rangeSmoothDecayFactor = 0.01f;
    private float rangeHiSmooth = 1000.0f;
    private float rangeLoSmooth = 0.0f;
    private float rangeSmoothMul = 1.0f;
    ISimpleListFloat barValsList = new ISimpleListFloat() { // from class: com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentAudioWaveformData.1
        @Override // com.daaw.avee.Common.ISimpleListFloat
        public int size() {
            return SegmentAudioWaveformData.this.barVals2.length;
        }

        @Override // com.daaw.avee.Common.ISimpleListFloat
        public float get(int i) {
            return SegmentAudioWaveformData.this.barVals2[i];
        }
    };

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.IFrameDataProvider
    public float getPeakBarIndex() {
        return 0.0f;
    }

    public void setSampleInCountPower(int i) {
        this.sampleInCountPower = i;
    }

    public void setSampleOutCountPower(int i) {
        this.sampleOutCountPower = i;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentDataProvider
    public void process(IRenderState iRenderState, InternalVisualizationDataProvider internalVisualizationDataProvider) {
        ISimpleListShort simpleListConstantShort;
        int i;
        int min = Math.min(Math.max(1 << this.sampleInCountPower, 32), 16384);
        int min2 = Math.min(Math.max(1 << this.sampleOutCountPower, 8), 512);
        AudioFrameData onRequestSoundVisualizationData = internalVisualizationDataProvider.onRequestSoundVisualizationData(min);
        int i2 = 4;
        int i3 = 0;
        if (onRequestSoundVisualizationData != null) {
            simpleListConstantShort = onRequestSoundVisualizationData.pcmAsMonoForFft_DoubleDataRate();
            i = simpleListConstantShort.size();
            int i4 = onRequestSoundVisualizationData.sampleRate;
            float[] fArr = this.pcmRangeTmp;
            fArr[0] = 0.0f;
            fArr[1] = onRequestSoundVisualizationData.maxPcmValue;
            this.rms = onRequestSoundVisualizationData.rms;
        } else {
            simpleListConstantShort = new SimpleListConstantShort((short) 0, 4);
            float[] fArr2 = this.pcmRangeTmp;
            fArr2[0] = 0.0f;
            fArr2[1] = 1000.0f;
            this.rms = 0.0f;
            i = 4;
        }
        if (i < 4) {
            simpleListConstantShort = new SimpleListConstantShort((short) 0, 4);
        } else {
            i2 = i;
        }
        if (this.barVals2.length != min2) {
            this.barVals2 = new float[min2];
        }
        updateRange(this.pcmRangeTmp);
        float length = i2 / this.barVals2.length;
        int i5 = 0;
        while (true) {
            float[] fArr3 = this.barVals2;
            if (i5 >= fArr3.length) {
                break;
            }
            fArr3[i5] = fArr3[i5] * 0.4f * 1.0f;
            i5++;
        }
        this.beat = 0.0f;
        if (length <= 1.0f) {
            while (i3 < this.barVals2.length) {
                int floor = (int) Math.floor(i3 * length);
                float kaiserWindow = simpleListConstantShort.get(floor) * DspWindows.kaiserWindow(floor, i2, 0.8f) * 0.00390625f;
                float f = this.rangeSmoothMul;
                float f2 = kaiserWindow * f * 100.0f;
                this.beat = Math.max(this.beat, f * f2);
                float[] fArr4 = this.barVals2;
                fArr4[i3] = fArr4[i3] + f2;
                fArr4[i3] = fArr4[i3] * 0.5f;
                i3++;
            }
            return;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            float kaiserWindow2 = simpleListConstantShort.get(i6) * DspWindows.kaiserWindow(i6, i2, 0.8f) * 0.00390625f;
            float f3 = this.rangeSmoothMul;
            float f4 = kaiserWindow2 * f3 * 100.0f;
            this.beat = Math.max(this.beat, f3 * f4);
            int floor2 = (int) Math.floor(i6 / length);
            float[] fArr5 = this.barVals2;
            if (floor2 < fArr5.length) {
                fArr5[floor2] = fArr5[floor2] + f4;
            }
        }
        while (true) {
            float[] fArr6 = this.barVals2;
            if (i3 >= fArr6.length) {
                return;
            }
            fArr6[i3] = fArr6[i3] / length;
            i3++;
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentDataProvider
    public float[] getFrameValues(int i, int i2) {
        return this.barVals2;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Segment.ISegmentDataProvider
    public ISimpleListFloat createFrameValuesAccessorList(int i, int i2, int i3, ISimpleListFloat iSimpleListFloat) {
        return this.barValsList;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.IFrameDataProvider
    public float getRms() {
        return this.beat;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        setSampleInCountPower(customPropertiesList.getPropertyInt("inputSize", 11));
        setSampleOutCountPower(customPropertiesList.getPropertyInt("sampleOutCountPower", 8));
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ICustomizable
    public void onReadCustomization(CustomPropertiesList customPropertiesList) {
        customPropertiesList.putPropertyIntAsRange("inputSize", this.sampleInCountPower, "Performance", 5, 13);
        customPropertiesList.putPropertyIntAsRange("sampleOutCountPower", this.sampleOutCountPower, typeName, 3, 9);
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
}
