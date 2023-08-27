package com.daaw.avee.comp.PcmProcess;

import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.playback.AudioFrameData;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import junit.framework.Assert;
import kotlin.UByte;
/* loaded from: classes.dex */
public class ExoVisualizerDataProvider {
    private static final int MAX_BUFFER_COUNT = 300;
    private boolean validBuffers;
    private long newestPresentationTimeUs = 0;
    private Lock lockBuffersList = new ReentrantLock();
    private LinkedList<BufferEntry> buffersList = new LinkedList<>();
    private volatile int doResetBuffers = 0;
    private boolean doClearBuffers = true;
    private int lastIndex = -1;
    private long lastBufferPresentationTimeUs = -1;
    private long lastREndUs = 0;
    byte[][] tmpBuff = (byte[][]) Array.newInstance(byte.class, 1, 0);

    public void release() {
    }

    public ByteBuffer clone(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer2 == null || byteBuffer2.capacity() != byteBuffer.capacity()) {
            byteBuffer2 = ByteBuffer.allocate(byteBuffer.capacity());
        }
        byteBuffer2.clear();
        byteBuffer.rewind();
        byteBuffer2.put(byteBuffer);
        byteBuffer.rewind();
        byteBuffer2.flip();
        return byteBuffer2;
    }

    public void onNewSourceTh() {
        this.doResetBuffers = 1;
    }

    public void onPcmData(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4) {
        boolean z;
        long max = Math.max(0L, j);
        if (i > 0 && this.lastIndex == i && this.lastBufferPresentationTimeUs == max) {
            return;
        }
        this.lastBufferPresentationTimeUs = max;
        this.lastIndex = i;
        this.newestPresentationTimeUs = max;
        try {
            z = this.lockBuffersList.tryLock(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z) {
            try {
                try {
                    if (this.doResetBuffers > 0) {
                        resetBuffers();
                        this.doResetBuffers = 0;
                    }
                    BufferEntry bufferEntry = null;
                    if (this.buffersList.size() > 0 && this.buffersList.size() >= MAX_BUFFER_COUNT) {
                        bufferEntry = this.buffersList.removeFirst();
                    }
                    if (bufferEntry == null) {
                        bufferEntry = new BufferEntry();
                    }
                    bufferEntry.finishInit(byteBuffer, max, i2, i3, i4, this.tmpBuff);
                    this.buffersList.addLast(bufferEntry);
                    this.validBuffers = true;
                } catch (Exception e) {
                    tlog.w("Exception: " + e.getMessage());
                    e.printStackTrace();
                }
                return;
            } finally {
                this.lockBuffersList.unlock();
            }
        }
        tlog.w("thread lock timeout 1");
    }

    private void addNewBufferEntry(BufferEntry bufferEntry) {
        this.buffersList.add(bufferEntry);
    }

    private void resetBuffers() {
        Iterator<BufferEntry> it = this.buffersList.iterator();
        while (it.hasNext()) {
            it.next().setToEmpty();
        }
    }

    public AudioFrameData getVisData(long j, AudioFrameData.Request request, AudioFrameData audioFrameData, boolean z) {
        float[] fArr;
        short[] sArr;
        boolean z2;
        long[] jArr;
        long j2 = j + (request.audioOffsetMs * 1000);
        if (!this.validBuffers) {
            audioFrameData.valid = false;
            return audioFrameData;
        }
        audioFrameData.capturedDataFully = false;
        audioFrameData.capturedDataPositionUs = j2;
        audioFrameData.newestAvailableBufferPositionUs = this.newestPresentationTimeUs;
        audioFrameData.availableBuffersStartPositionUs = Long.MAX_VALUE;
        audioFrameData.availableBuffersEndPositionUs = Long.MIN_VALUE;
        long[] jArr2 = new long[1];
        long[] jArr3 = new long[1];
        short[] sArr2 = new short[2];
        float[] fArr2 = {0.0f};
        try {
            z2 = this.lockBuffersList.tryLock(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            z2 = false;
        } catch (Exception e) {
            e = e;
            fArr = fArr2;
            sArr = sArr2;
            tlog.w("Exception: " + e.getMessage());
            audioFrameData.minPcmValue = sArr[0];
            audioFrameData.maxPcmValue = sArr[1];
            audioFrameData.rms = (float) Math.sqrt((1.0f / audioFrameData.getBufferSizeForCapture()) * fArr[0]);
            audioFrameData.valid = true;
            return audioFrameData;
        }
        if (z2) {
            try {
                if (z) {
                    try {
                        resetBuffers();
                        fArr = fArr2;
                        sArr = sArr2;
                    } catch (Throwable th) {
                        th = th;
                        this.lockBuffersList.unlock();
                        throw th;
                    }
                } else {
                    fArr = fArr2;
                    sArr = sArr2;
                    try {
                        BufferEntry findBufferByTime = findBufferByTime(0, j2, jArr2, null);
                        if (findBufferByTime != null) {
                            jArr = jArr3;
                            audioFrameData.init(findBufferByTime.sampleRate, request.audioChannelCount, request.samplesCount, UtilsVisualizerDataProvider.durationUsToFrames(request.samplesCountUs, findBufferByTime.sampleRate));
                        } else {
                            jArr = jArr3;
                        }
                        sArr[0] = audioFrameData.minPcmValue;
                        sArr[1] = audioFrameData.maxPcmValue;
                        BufferEntry bufferEntry = findBufferByTime;
                        int i = 0;
                        int i2 = 0;
                        while (bufferEntry != null) {
                            int durationUsToFrames = UtilsVisualizerDataProvider.durationUsToFrames(jArr2[0], bufferEntry.sampleRate);
                            if (i > 0 && durationUsToFrames != 0) {
                                tlog.w("t[" + i + "]; startFrameOffsetBuffer != 0; totalSamplesGot: " + i2 + " startFrameOffsetBuffer: " + durationUsToFrames + " startOffsetTime: " + jArr2[0]);
                            }
                            long[] jArr4 = jArr;
                            int bufferData3 = bufferEntry.getBufferData3(audioFrameData.pcmBuffer, audioFrameData.pcmBufferChannelCount, i2, durationUsToFrames, sArr, fArr, jArr4);
                            int i3 = i2 + bufferData3;
                            if (i3 >= audioFrameData.getBufferSizeForCapture()) {
                                this.lastREndUs = bufferEntry.bufferStartTime + UtilsVisualizerDataProvider.framesToDurationUs(durationUsToFrames + bufferData3, bufferEntry.sampleRate);
                                audioFrameData.capturedDataFully = true;
                            } else {
                                Assert.assertTrue(jArr4[0] != -1);
                                i++;
                                if (i < 9) {
                                    bufferEntry = findBufferByTime(i, jArr4[0], jArr2, bufferEntry);
                                    i2 = i3;
                                    jArr = jArr4;
                                }
                            }
                            i2 = i3;
                            break;
                        }
                        if (i2 >= audioFrameData.getBufferSizeForCapture()) {
                            audioFrameData.capturedDataFully = true;
                        } else if (audioFrameData.getBufferSizeForCapture() > 2) {
                            tlog.w("totalSamplesGot: " + i2 + " need: " + audioFrameData.getBufferSizeForCapture());
                        }
                        audioFrameData.captureSamplesCount = i2;
                        audioFrameData.capturedDataPositionEndUs = j2 + UtilsVisualizerDataProvider.framesToDurationUs(i2, audioFrameData.sampleRate);
                    } catch (Throwable th2) {
                        th = th2;
                        this.lockBuffersList.unlock();
                        throw th;
                    }
                }
                this.lockBuffersList.unlock();
            } catch (Exception e2) {
                e = e2;
                tlog.w("Exception: " + e.getMessage());
                audioFrameData.minPcmValue = sArr[0];
                audioFrameData.maxPcmValue = sArr[1];
                audioFrameData.rms = (float) Math.sqrt((1.0f / audioFrameData.getBufferSizeForCapture()) * fArr[0]);
                audioFrameData.valid = true;
                return audioFrameData;
            }
        } else {
            fArr = fArr2;
            sArr = sArr2;
        }
        audioFrameData.minPcmValue = sArr[0];
        audioFrameData.maxPcmValue = sArr[1];
        audioFrameData.rms = (float) Math.sqrt((1.0f / audioFrameData.getBufferSizeForCapture()) * fArr[0]);
        audioFrameData.valid = true;
        return audioFrameData;
    }

    private BufferEntry findBufferByTime(int i, long j, long[] jArr, BufferEntry bufferEntry) {
        Iterator<BufferEntry> it = this.buffersList.iterator();
        long j2 = Long.MAX_VALUE;
        BufferEntry bufferEntry2 = null;
        while (it.hasNext()) {
            BufferEntry next = it.next();
            if (bufferEntry != next && !next.isEmpty()) {
                long j3 = j - next.bufferStartTime;
                if (j3 >= -1 && j <= next.bufferPresentationTimeUs && j2 > j3) {
                    bufferEntry2 = next;
                    j2 = j3;
                }
            }
        }
        if (j2 < 0) {
            j2 = 0;
        }
        jArr[0] = j2;
        return bufferEntry2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[LOOP:2: B:25:0x006b->B:26:0x006d, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0034, B:26:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ByteBuffer resampleTo16BitPcm(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2) {
        int i2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        if (i == Integer.MIN_VALUE) {
            i3 /= 3;
        } else if (i != 3) {
            if (i == 1073741824) {
                i2 = i3 / 2;
                if (byteBuffer2 != null || byteBuffer2.capacity() < i2) {
                    byteBuffer2 = ByteBuffer.allocateDirect(i2);
                }
                byteBuffer2.position(0);
                byteBuffer2.limit(i2);
                if (i != Integer.MIN_VALUE) {
                    while (position < limit) {
                        byteBuffer2.put(byteBuffer.get(position + 1));
                        byteBuffer2.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else if (i == 3) {
                    while (position < limit) {
                        byteBuffer2.put((byte) 0);
                        byteBuffer2.put((byte) ((byteBuffer.get(position) & UByte.MAX_VALUE) - 128));
                        position++;
                    }
                } else if (i != 1073741824) {
                    throw new IllegalStateException();
                } else {
                    while (position < limit) {
                        byteBuffer2.put(byteBuffer.get(position + 2));
                        byteBuffer2.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer2.position(0);
                return byteBuffer2;
            }
            throw new IllegalStateException();
        }
        i2 = i3 * 2;
        if (byteBuffer2 != null) {
        }
        byteBuffer2 = ByteBuffer.allocateDirect(i2);
        byteBuffer2.position(0);
        byteBuffer2.limit(i2);
        if (i != Integer.MIN_VALUE) {
        }
        byteBuffer2.position(0);
        return byteBuffer2;
    }
}
