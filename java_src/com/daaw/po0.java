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

    /* renamed from: a */
    public MediaMuxer f23091a;

    /* renamed from: b */
    public boolean f23092b;

    /* renamed from: d */
    public int f23094d;

    /* renamed from: e */
    public final Object f23095e = new Object();

    /* renamed from: c */
    public int f23093c = 0;

    public po0(File file, int i) {
        this.f23092b = false;
        this.f23091a = new MediaMuxer(file.getCanonicalPath(), 0);
        this.f23092b = false;
        this.f23094d = i;
    }

    /* renamed from: a */
    public int m13262a(MediaFormat mediaFormat, String str) {
        lz1.m16365a("#####  addTrack: " + str + " trackCount: " + this.f23093c);
        synchronized (this.f23095e) {
            if (this.f23092b) {
                throw new RuntimeException("format changed twice");
            }
            MediaMuxer mediaMuxer = this.f23091a;
            if (mediaMuxer == null) {
                return -1;
            }
            int addTrack = mediaMuxer.addTrack(mediaFormat);
            int i = this.f23093c + 1;
            this.f23093c = i;
            if (i == this.f23094d) {
                this.f23091a.start();
                this.f23092b = true;
                this.f23095e.notifyAll();
            }
            return addTrack;
        }
    }

    /* renamed from: b */
    public boolean m13261b() {
        boolean z;
        synchronized (this.f23095e) {
            int i = 0;
            while (true) {
                z = this.f23092b;
                if (z || i >= 5) {
                    break;
                }
                try {
                    this.f23095e.wait(1000L);
                } catch (InterruptedException unused) {
                }
                i++;
            }
        }
        return z;
    }

    /* renamed from: c */
    public void m13260c() {
        synchronized (this.f23095e) {
            MediaMuxer mediaMuxer = this.f23091a;
            if (mediaMuxer != null) {
                if (this.f23092b) {
                    try {
                        mediaMuxer.stop();
                    } catch (Exception e) {
                        lz1.m16363c("mMuxer stop exception: " + e.getMessage());
                    }
                }
                try {
                    this.f23091a.release();
                } catch (Exception e2) {
                    lz1.m16363c("mMuxer release exception: " + e2.getMessage());
                }
                this.f23091a = null;
            }
        }
    }

    /* renamed from: d */
    public void m13259d(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        synchronized (this.f23095e) {
            int i2 = 0;
            while (true) {
                z = this.f23092b;
                if (z || i2 >= 5) {
                    break;
                }
                try {
                    this.f23095e.wait(1000L);
                } catch (InterruptedException unused) {
                }
                i2++;
            }
            if (!z) {
                throw new RuntimeException("muxer hasn't started");
            }
            this.f23091a.writeSampleData(i, byteBuffer, bufferInfo);
        }
    }
}
