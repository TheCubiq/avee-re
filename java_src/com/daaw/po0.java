package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.io.File;
import java.nio.ByteBuffer;
@TargetApi(18)
/* loaded from: classes.dex */
public class po0 {
    public MediaMuxer a;
    public boolean b;
    public int d;
    public final Object e = new Object();
    public int c = 0;

    public po0(File file, int i) {
        this.b = false;
        this.a = new MediaMuxer(file.getCanonicalPath(), 0);
        this.b = false;
        this.d = i;
    }

    public int a(MediaFormat mediaFormat, String str) {
        lz1.a("#####  addTrack: " + str + " trackCount: " + this.c);
        synchronized (this.e) {
            if (this.b) {
                throw new RuntimeException("format changed twice");
            }
            MediaMuxer mediaMuxer = this.a;
            if (mediaMuxer == null) {
                return -1;
            }
            int addTrack = mediaMuxer.addTrack(mediaFormat);
            int i = this.c + 1;
            this.c = i;
            if (i == this.d) {
                this.a.start();
                this.b = true;
                this.e.notifyAll();
            }
            return addTrack;
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.e) {
            int i = 0;
            while (true) {
                z = this.b;
                if (z || i >= 5) {
                    break;
                }
                try {
                    this.e.wait(1000L);
                } catch (InterruptedException unused) {
                }
                i++;
            }
        }
        return z;
    }

    public void c() {
        synchronized (this.e) {
            MediaMuxer mediaMuxer = this.a;
            if (mediaMuxer != null) {
                if (this.b) {
                    try {
                        mediaMuxer.stop();
                    } catch (Exception e) {
                        lz1.c("mMuxer stop exception: " + e.getMessage());
                    }
                }
                try {
                    this.a.release();
                } catch (Exception e2) {
                    lz1.c("mMuxer release exception: " + e2.getMessage());
                }
                this.a = null;
            }
        }
    }

    public void d(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        synchronized (this.e) {
            int i2 = 0;
            while (true) {
                z = this.b;
                if (z || i2 >= 5) {
                    break;
                }
                try {
                    this.e.wait(1000L);
                } catch (InterruptedException unused) {
                }
                i2++;
            }
            if (!z) {
                throw new RuntimeException("muxer hasn't started");
            }
            this.a.writeSampleData(i, byteBuffer, bufferInfo);
        }
    }
}
