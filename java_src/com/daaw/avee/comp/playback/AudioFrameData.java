package com.daaw.avee.comp.playback;

import com.daaw.avee.Common.ISimpleListShort;
import junit.framework.Assert;
import kotlin.jvm.internal.ShortCompanionObject;
/* loaded from: classes.dex */
public class AudioFrameData {
    public long availableBuffersEndPositionUs;
    public long availableBuffersStartPositionUs;
    private int buffSize;
    private int buffSizeForCapture;
    private int buffSizeForTime;
    public int captureSamplesCount;
    public long capturedDataPositionEndUs;
    public long capturedDataPositionUs;
    public long exoDataTimePositionUs;
    public boolean exoDataUse;
    public short maxPcmValue;
    public short minPcmValue;
    public long newestAvailableBufferPositionUs;
    public int pcmBufferChannelCount;
    public int sampleRate;
    public boolean valid;
    public boolean capturedDataFully = false;
    public boolean doubleDataRate = true;
    public short[] pcmBuffer = new short[2];
    public float rms = 0.0f;

    /* loaded from: classes.dex */
    public static class Request {
        public int audioChannelCount;
        public int audioOffsetMs;
        public int samplesCount;
        public long samplesCountUs;
    }

    /* loaded from: classes.dex */
    public static class Request2 extends Request {
        public boolean clearBuffers = false;
        public long overridePositionUs;
        public boolean snoopMode;
        public boolean useGlobalSession;
    }

    public AudioFrameData() {
        this.valid = false;
        this.valid = false;
        init(44100, 1, 2, 0);
    }

    public void initAsUseExoData(long j) {
        this.exoDataUse = true;
        this.exoDataTimePositionUs = j;
    }

    public void init(int i, int i2, int i3, int i4) {
        init(i, i2, i3, i4, true);
    }

    public void init(int i, int i2, int i3, int i4, boolean z) {
        Assert.assertTrue(i2 > 0);
        int max = Math.max(1, i2);
        this.doubleDataRate = z;
        this.exoDataUse = false;
        this.sampleRate = i;
        this.pcmBufferChannelCount = max;
        this.buffSize = i3;
        this.buffSizeForTime = i4;
        int max2 = Math.max(i3, i4);
        this.buffSizeForCapture = max2;
        int i5 = max2 * max;
        if (this.pcmBuffer.length != i5) {
            this.pcmBuffer = new short[i5];
        }
        this.minPcmValue = ShortCompanionObject.MAX_VALUE;
        this.maxPcmValue = (short) 0;
    }

    public boolean IsDoubleDataRate() {
        return this.doubleDataRate;
    }

    public int getBufferSizeForCapture() {
        return this.buffSizeForCapture;
    }

    public int getBufferSizeForFftResult() {
        return this.buffSize;
    }

    public int getBufferSizeForTimedResult() {
        return this.buffSizeForTime;
    }

    public int getPcmFrameAsMono(int i) {
        return this.pcmBuffer[i * this.pcmBufferChannelCount];
    }

    public ISimpleListShort pcmAsMonoForFft() {
        return pcmAsMono(this.buffSize, this.pcmBufferChannelCount, this.pcmBuffer);
    }

    public ISimpleListShort pcmAsMonoForFft_DoubleDataRate() {
        return pcmAsMonoD(this.buffSize, this.pcmBufferChannelCount, this.pcmBuffer);
    }

    public ISimpleListShort pcmAsDesiredChannelCount(int i, int i2) {
        return pcmAsDesiredChannelCount(i, i2, this.pcmBufferChannelCount, this.pcmBuffer);
    }

    public static ISimpleListShort pcmAsDesiredChannelCount(int i, int i2, int i3, short[] sArr) {
        if (i == 1) {
            return pcmAsMono(i2, i3, sArr);
        }
        return pcmAsStereo(i2, i3, sArr);
    }

    public static ISimpleListShort pcmAsMono(final int i, final int i2, final short[] sArr) {
        if (i2 == 1) {
            final int min = Math.min(i, sArr.length);
            return new ISimpleListShort() { // from class: com.daaw.avee.comp.playback.AudioFrameData.1
                @Override // com.daaw.avee.Common.ISimpleListShort
                public int size() {
                    return min;
                }

                @Override // com.daaw.avee.Common.ISimpleListShort
                public short get(int i3) {
                    return sArr[i3];
                }
            };
        }
        return new ISimpleListShort() { // from class: com.daaw.avee.comp.playback.AudioFrameData.2
            @Override // com.daaw.avee.Common.ISimpleListShort
            public int size() {
                return i;
            }

            @Override // com.daaw.avee.Common.ISimpleListShort
            public short get(int i3) {
                short[] sArr2 = sArr;
                int i4 = i2;
                return (short) ((sArr2[i3 * i4] + sArr2[(i3 * i4) + 1]) / 2);
            }
        };
    }

    public static ISimpleListShort pcmAsStereo(final int i, int i2, final short[] sArr) {
        if (i2 == 1) {
            return new ISimpleListShort() { // from class: com.daaw.avee.comp.playback.AudioFrameData.3
                @Override // com.daaw.avee.Common.ISimpleListShort
                public int size() {
                    return i * 2;
                }

                @Override // com.daaw.avee.Common.ISimpleListShort
                public short get(int i3) {
                    return sArr[i3 / 2];
                }
            };
        }
        return new ISimpleListShort() { // from class: com.daaw.avee.comp.playback.AudioFrameData.4
            @Override // com.daaw.avee.Common.ISimpleListShort
            public int size() {
                return i * 2;
            }

            @Override // com.daaw.avee.Common.ISimpleListShort
            public short get(int i3) {
                return sArr[i3];
            }
        };
    }

    public static ISimpleListShort pcmAsMonoD(int i, final int i2, final short[] sArr) {
        if (i2 == 1) {
            final int max = Math.max(0, Math.min(i, sArr.length)) / 2;
            return new ISimpleListShort() { // from class: com.daaw.avee.comp.playback.AudioFrameData.5
                @Override // com.daaw.avee.Common.ISimpleListShort
                public int size() {
                    return max;
                }

                @Override // com.daaw.avee.Common.ISimpleListShort
                public short get(int i3) {
                    short[] sArr2 = sArr;
                    int i4 = i3 * 2;
                    return (short) ((sArr2[i4] + sArr2[i4 + 1]) / 2);
                }
            };
        }
        final int max2 = Math.max(0, i) / 2;
        return new ISimpleListShort() { // from class: com.daaw.avee.comp.playback.AudioFrameData.6
            @Override // com.daaw.avee.Common.ISimpleListShort
            public int size() {
                return max2;
            }

            @Override // com.daaw.avee.Common.ISimpleListShort
            public short get(int i3) {
                int i4 = i3 * 2;
                short[] sArr2 = sArr;
                int i5 = i2;
                return (short) ((((sArr2[i4 * i5] + sArr2[(i4 * i5) + 1]) + sArr2[(i4 * i5) + 2]) + sArr2[(i4 * i5) + 3]) / 4);
            }
        };
    }
}
