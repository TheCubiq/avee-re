package com.daaw.avee.comp.PcmProcess;

import com.daaw.avee.Common.RandomAccessFileTh;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.playback.AudioFrameData;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class PcmBuffer {
    private static int lastBytesIgnoreCount = 5236;
    private String filePrefix;
    private long totalBufferTimeDurationUs;
    private ByteBuffer zeroBuf = ByteBuffer.allocate(20000);
    private final Object locker = new Object();
    private int lastIndex = -1;
    private long lastBufferPresentationTimeUs = -1;
    private int lastReadRafFillPos = 0;
    private BufferEntry readBufferEntryTmp = new BufferEntry();
    private byte[][] tmpBuff = (byte[][]) Array.newInstance(byte.class, 1, 0);
    private int bufferSampleRate = 44100;
    private int bufferChannelCount = 2;
    private int maxSizeInBytes = 0;
    private RandomAccessFileTh raf = null;
    private int rafFillPos = 0;
    private long currentBufferOffsetCorrection = 0;

    public PcmBuffer(String str, long j) {
        this.filePrefix = str;
        this.totalBufferTimeDurationUs = j;
    }

    public void dispose() {
        RandomAccessFileTh randomAccessFileTh = this.raf;
        if (randomAccessFileTh != null) {
            randomAccessFileTh.close();
        }
        this.raf = null;
    }

    private void createRaf(int i, int i2, int i3) {
        this.bufferSampleRate = i;
        this.bufferChannelCount = i2;
        this.maxSizeInBytes = UtilsVisualizerDataProvider.durationUsToBytes(this.totalBufferTimeDurationUs, i2, i3, i);
        int i4 = 0;
        this.rafFillPos = 0;
        RandomAccessFileTh randomAccessFileTh = this.raf;
        if (randomAccessFileTh != null) {
            randomAccessFileTh.close();
        }
        do {
            RandomAccessFileTh createTemp = RandomAccessFileTh.createTemp(this.filePrefix + i4, this.maxSizeInBytes + 5120);
            this.raf = createTemp;
            i4++;
            if (createTemp != null) {
                break;
            }
        } while (i4 < 3);
        this.currentBufferOffsetCorrection = 0L;
    }

    public void onNewSourceTh() {
        synchronized (this.locker) {
            this.rafFillPos = 0;
            this.currentBufferOffsetCorrection = 0L;
        }
    }

    public void onPcmData(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4) {
        long max = Math.max(0L, j);
        if (this.lastIndex == i && this.lastBufferPresentationTimeUs == max) {
            return;
        }
        this.lastBufferPresentationTimeUs = max;
        this.lastIndex = i;
        if (this.raf == null || this.bufferSampleRate != i2 || this.bufferChannelCount != i3) {
            tlog.w("createRaf");
            synchronized (this.locker) {
                createRaf(i2, i3, i4);
            }
        }
        if (this.raf == null) {
            return;
        }
        int limit = byteBuffer.limit() - byteBuffer.position();
        int durationUsToBytes = UtilsVisualizerDataProvider.durationUsToBytes(max, this.bufferChannelCount, i4, this.bufferSampleRate) - limit;
        if (durationUsToBytes < 0) {
            tlog.w("startByte: " + durationUsToBytes + "; TimeUs: " + max);
        }
        if (durationUsToBytes < 0) {
            durationUsToBytes = 0;
        }
        int position = byteBuffer.position();
        int limit2 = byteBuffer.limit();
        int durationUsToBytes2 = UtilsVisualizerDataProvider.durationUsToBytes(500000L, this.bufferChannelCount, i4, this.bufferSampleRate);
        synchronized (this.locker) {
            if (this.raf != null) {
                long j2 = durationUsToBytes - this.rafFillPos;
                if (Math.abs(j2) < durationUsToBytes2) {
                    durationUsToBytes = this.rafFillPos;
                } else if (j2 != 0) {
                    tlog.w("newDataFillDelta: " + j2);
                }
                this.rafFillPos = limit + durationUsToBytes;
                this.raf.writeData(durationUsToBytes, byteBuffer);
            }
        }
        byteBuffer.limit(limit2);
        byteBuffer.position(position);
    }

    public AudioFrameData getVisData(long j, AudioFrameData.Request request, AudioFrameData audioFrameData, int i) {
        boolean z;
        ByteBuffer readAsByteBufferNotThSafe;
        int i2;
        float[] fArr;
        audioFrameData.capturedDataFully = false;
        audioFrameData.capturedDataPositionUs = j;
        audioFrameData.newestAvailableBufferPositionUs = 0L;
        audioFrameData.availableBuffersStartPositionUs = Long.MAX_VALUE;
        audioFrameData.availableBuffersEndPositionUs = Long.MIN_VALUE;
        if (this.raf == null) {
            return audioFrameData;
        }
        audioFrameData.init(this.bufferSampleRate, request.audioChannelCount, request.samplesCount, UtilsVisualizerDataProvider.durationUsToFrames(request.samplesCountUs, this.bufferSampleRate));
        long j2 = j + (request.audioOffsetMs * 1000);
        int durationUsToBytes = UtilsVisualizerDataProvider.durationUsToBytes(j2, this.bufferChannelCount, i, this.bufferSampleRate);
        int framesToBytes = UtilsVisualizerDataProvider.framesToBytes(audioFrameData.getBufferSizeForCapture(), this.bufferChannelCount, i);
        int framesToBytes2 = UtilsVisualizerDataProvider.framesToBytes(audioFrameData.getBufferSizeForTimedResult(), this.bufferChannelCount, i);
        long j3 = durationUsToBytes - this.lastReadRafFillPos;
        if (Math.abs(j3) < i) {
            durationUsToBytes = this.lastReadRafFillPos;
        } else if (j3 != 0) {
            tlog.w("! readPosDelta: " + j3);
        }
        this.lastReadRafFillPos = framesToBytes2 + durationUsToBytes;
        int i3 = this.maxSizeInBytes;
        int i4 = durationUsToBytes + framesToBytes;
        int i5 = i3 - i4;
        int max = Math.max(0, i4 - i3);
        int max2 = Math.max(0, framesToBytes - max);
        int i6 = durationUsToBytes + max2;
        if (i6 > this.rafFillPos - 10) {
            z = i5 <= lastBytesIgnoreCount;
            StringBuilder sb = new StringBuilder();
            sb.append("need read to");
            sb.append(z ? "/ignore: " : ": ");
            sb.append(i6);
            sb.append("; raf filled to: ");
            sb.append(this.rafFillPos);
            sb.append("; maxBytes: ");
            sb.append(this.maxSizeInBytes);
            sb.append("; bytesTillEnd: ");
            sb.append(i5);
            tlog.w(sb.toString());
            if (!z) {
                return audioFrameData;
            }
        } else {
            z = false;
        }
        synchronized (this.locker) {
            try {
                try {
                    if (this.raf == null) {
                        return audioFrameData;
                    }
                    if (z) {
                        this.zeroBuf.position(0);
                        readAsByteBufferNotThSafe = this.zeroBuf;
                    } else {
                        readAsByteBufferNotThSafe = this.raf.readAsByteBufferNotThSafe(durationUsToBytes);
                    }
                    ByteBuffer byteBuffer = readAsByteBufferNotThSafe;
                    if (max2 > byteBuffer.remaining()) {
                        tlog.w("readSizeInBytes [" + max2 + "] > buf.remainingInBytes [" + byteBuffer.remaining() + "]");
                        i2 = byteBuffer.remaining();
                    } else {
                        i2 = max2;
                    }
                    this.readBufferEntryTmp.finishInit(byteBuffer, 0L, this.bufferSampleRate, this.bufferChannelCount, i2, i, this.tmpBuff);
                    short[] sArr = new short[2];
                    int bufferData3 = this.readBufferEntryTmp.getBufferData3(audioFrameData.pcmBuffer, audioFrameData.pcmBufferChannelCount, 0, 0, sArr, new float[1], new long[1]);
                    audioFrameData.capturedDataFully = max + bufferData3 >= audioFrameData.getBufferSizeForCapture();
                    audioFrameData.captureSamplesCount = bufferData3;
                    audioFrameData.capturedDataPositionEndUs = j2 + UtilsVisualizerDataProvider.framesToDurationUs(bufferData3, audioFrameData.sampleRate);
                    audioFrameData.minPcmValue = sArr[0];
                    audioFrameData.maxPcmValue = sArr[1];
                    audioFrameData.rms = (float) Math.sqrt((1.0f / audioFrameData.getBufferSizeForCapture()) * fArr[0]);
                    audioFrameData.valid = true;
                    return audioFrameData;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
