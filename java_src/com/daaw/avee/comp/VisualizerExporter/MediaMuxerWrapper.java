package com.daaw.avee.comp.VisualizerExporter;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.daaw.avee.Common.tlog;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class MediaMuxerWrapper {
    private int expectedTrackCount;
    private MediaMuxer mMuxer;
    private boolean mMuxerStarted;
    final Object muxerLock = new Object();
    private int trackCount = 0;

    public MediaMuxerWrapper(File file, int i) throws IOException {
        this.mMuxerStarted = false;
        this.mMuxer = new MediaMuxer(file.getCanonicalPath(), 0);
        this.mMuxerStarted = false;
        this.expectedTrackCount = i;
    }

    public boolean isMuxerStarted() {
        boolean z;
        synchronized (this.muxerLock) {
            for (int i = 0; !this.mMuxerStarted && i < 5; i++) {
                try {
                    this.muxerLock.wait(1000L);
                } catch (InterruptedException unused) {
                }
            }
            z = this.mMuxerStarted;
        }
        return z;
    }

    public void release() {
        synchronized (this.muxerLock) {
            if (this.mMuxer != null) {
                if (this.mMuxerStarted) {
                    try {
                        this.mMuxer.stop();
                    } catch (Exception e) {
                        tlog.w("mMuxer stop exception: " + e.getMessage());
                    }
                }
                try {
                    this.mMuxer.release();
                } catch (Exception e2) {
                    tlog.w("mMuxer release exception: " + e2.getMessage());
                }
                this.mMuxer = null;
            }
        }
    }

    public int addTrack(MediaFormat mediaFormat, String str) {
        tlog.d("#####  addTrack: " + str + " trackCount: " + this.trackCount);
        synchronized (this.muxerLock) {
            if (this.mMuxerStarted) {
                throw new RuntimeException("format changed twice");
            }
            if (this.mMuxer == null) {
                return -1;
            }
            int addTrack = this.mMuxer.addTrack(mediaFormat);
            int i = this.trackCount + 1;
            this.trackCount = i;
            if (i == this.expectedTrackCount) {
                this.mMuxer.start();
                this.mMuxerStarted = true;
                this.muxerLock.notifyAll();
            }
            return addTrack;
        }
    }

    public void writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.muxerLock) {
            for (int i2 = 0; !this.mMuxerStarted && i2 < 5; i2++) {
                try {
                    this.muxerLock.wait(1000L);
                } catch (InterruptedException unused) {
                }
            }
            if (!this.mMuxerStarted) {
                throw new RuntimeException("muxer hasn't started");
            }
            this.mMuxer.writeSampleData(i, byteBuffer, bufferInfo);
        }
    }
}
