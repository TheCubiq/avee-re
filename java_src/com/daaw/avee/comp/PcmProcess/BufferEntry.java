package com.daaw.avee.comp.PcmProcess;

import android.util.Log;
import com.daaw.avee.Common.tlog;
import java.nio.ByteBuffer;
import kotlin.UByte;
/* loaded from: classes.dex */
public class BufferEntry {
    private short[] buffer = new short[0];
    public long bufferPresentationTimeUs;
    public long bufferStartTime;
    public int channelCount;
    int entryBufferSize;
    public int sampleRate;

    public BufferEntry() {
        setToEmpty();
        finishInit(0L);
    }

    public int getBufferData3(short[] sArr, int i, int i2, int i3, short[] sArr2, float[] fArr, long[] jArr) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.channelCount == 1) {
            if (i == 1) {
                i4 = i2;
                while (this.channelCount * i3 < this.entryBufferSize && (i10 = i4 * i) < sArr.length) {
                    sArr[i10] = this.buffer[i3];
                    if (sArr2[0] > sArr[i10]) {
                        sArr2[0] = sArr[i10];
                    }
                    if (sArr2[1] < sArr[i10]) {
                        sArr2[1] = sArr[i10];
                    }
                    fArr[0] = fArr[0] + (sArr[i10] * sArr[i10]);
                    i3++;
                    i4++;
                }
            } else {
                if (i == 2) {
                    i4 = i2;
                    while (this.channelCount * i3 < this.entryBufferSize && (i9 = (i8 = i4 * i) + 1) < sArr.length) {
                        short[] sArr3 = this.buffer;
                        sArr[i8] = sArr3[i3];
                        sArr[i9] = sArr3[i3];
                        if (sArr2[0] > sArr[i8]) {
                            sArr2[0] = sArr[i8];
                        }
                        if (sArr2[1] < sArr[i8]) {
                            sArr2[1] = sArr[i8];
                        }
                        fArr[0] = fArr[0] + (sArr[i8] * sArr[i8]);
                        i3++;
                        i4++;
                    }
                }
                i4 = i2;
            }
        } else if (i == 1) {
            i4 = i2;
            while (true) {
                int i11 = this.channelCount;
                if ((i3 * i11) + 1 >= this.entryBufferSize || (i7 = i4 * i) >= sArr.length) {
                    break;
                }
                short[] sArr4 = this.buffer;
                sArr[i7] = (short) ((sArr4[i3 * i11] + sArr4[(i11 * i3) + 1]) / 2);
                if (sArr2[0] > sArr[i7]) {
                    sArr2[0] = sArr[i7];
                }
                if (sArr2[1] < sArr[i7]) {
                    sArr2[1] = sArr[i7];
                }
                fArr[0] = fArr[0] + (sArr[i7] * sArr[i7]);
                i3++;
                i4++;
            }
        } else {
            if (i == 2) {
                i4 = i2;
                while (true) {
                    int i12 = this.channelCount;
                    if ((i3 * i12) + 1 >= this.entryBufferSize || (i6 = (i5 = i4 * i) + 1) >= sArr.length) {
                        break;
                    }
                    short[] sArr5 = this.buffer;
                    sArr[i5] = sArr5[i3 * i12];
                    sArr[i6] = sArr5[(i12 * i3) + 1];
                    if (sArr2[0] > sArr[i5]) {
                        sArr2[0] = sArr[i5];
                    }
                    if (sArr2[1] < sArr[i5]) {
                        sArr2[1] = sArr[i5];
                    }
                    fArr[0] = fArr[0] + (sArr[i5] * sArr[i5]);
                    i3++;
                    i4++;
                }
            }
            i4 = i2;
        }
        jArr[0] = i3 * this.channelCount >= this.entryBufferSize - 1 ? this.bufferPresentationTimeUs : -1L;
        return i4 - i2;
    }

    public void finishInit(ByteBuffer byteBuffer, long j, int i, int i2, int i3, byte[][] bArr) {
        finishInit(byteBuffer, j, i, i2, byteBuffer.limit() - byteBuffer.position(), i3, bArr);
    }

    public void finishInit(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4, byte[][] bArr) {
        byte[] bArr2 = bArr[0];
        this.bufferPresentationTimeUs = j;
        this.sampleRate = i;
        this.channelCount = i2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        long bytesToFrames = UtilsVisualizerDataProvider.bytesToFrames(i3, i2, i4);
        int i5 = ((int) bytesToFrames) * i2;
        this.entryBufferSize = i5;
        short[] sArr = this.buffer;
        if (sArr.length < i5 || sArr.length > i5 * 2) {
            this.buffer = new short[this.entryBufferSize];
        }
        if (bArr2.length < i3 || bArr2.length > i3 * 2) {
            bArr2 = new byte[i3];
        }
        byteBuffer.get(bArr2, 0, i3);
        if (i3 % i2 != 0) {
            tlog.w("tmpBuffDataLength mismatch");
        }
        int i6 = i4 / 8;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i3) {
            i7 += i6;
            try {
                this.buffer[i8] = (short) (((bArr2[i7 - 1] & UByte.MAX_VALUE) << 8) | (bArr2[i7 - 2] & UByte.MAX_VALUE));
                i8++;
            } catch (Exception e) {
                Log.e("BufferEntry", String.format("Oh, well: %d, %s", Integer.valueOf(i6), e.getLocalizedMessage()));
            }
        }
        byteBuffer.limit(limit);
        byteBuffer.position(position);
        finishInit(bytesToFrames);
        bArr[0] = bArr2;
    }

    public void finishInit(long j) {
        this.bufferStartTime = this.bufferPresentationTimeUs - UtilsVisualizerDataProvider.framesToDurationUs(j, this.sampleRate);
    }

    public void setToEmpty() {
        this.sampleRate = 1;
        this.channelCount = 1;
        this.entryBufferSize = 0;
        this.bufferPresentationTimeUs = Long.MIN_VALUE;
        this.bufferStartTime = Long.MIN_VALUE;
    }

    public boolean isEmpty() {
        return this.entryBufferSize < 1;
    }
}
