package com.daaw;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class uo8 extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public long k;
    public boolean l;
    public IllegalStateException m;
    public final Object a = new Object();
    public final yo8 d = new yo8();
    public final yo8 e = new yo8();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public uo8(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public static /* synthetic */ void d(uo8 uo8Var) {
        synchronized (uo8Var.a) {
            if (uo8Var.l) {
                return;
            }
            long j = uo8Var.k - 1;
            uo8Var.k = j;
            if (j > 0) {
                return;
            }
            if (j >= 0) {
                uo8Var.i();
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException();
            synchronized (uo8Var.a) {
                uo8Var.m = illegalStateException;
            }
        }
    }

    public final int a() {
        synchronized (this.a) {
            int i = -1;
            if (l()) {
                return -1;
            }
            j();
            k();
            if (!this.d.d()) {
                i = this.d.a();
            }
            return i;
        }
    }

    public final int b(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            if (l()) {
                return -1;
            }
            j();
            k();
            if (this.e.d()) {
                return -1;
            }
            int a = this.e.a();
            if (a >= 0) {
                uo4.b(this.h);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (a == -2) {
                this.h = (MediaFormat) this.g.remove();
                a = -2;
            }
            return a;
        }
    }

    public final MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.a) {
            mediaFormat = this.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void e() {
        synchronized (this.a) {
            this.k++;
            Handler handler = this.c;
            int i = it5.a;
            handler.post(new Runnable() { // from class: com.daaw.to8
                @Override // java.lang.Runnable
                public final void run() {
                    uo8.d(uo8.this);
                }
            });
        }
    }

    public final void f(MediaCodec mediaCodec) {
        uo4.f(this.c == null);
        this.b.start();
        Handler handler = new Handler(this.b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.c = handler;
    }

    public final void g() {
        synchronized (this.a) {
            this.l = true;
            this.b.quit();
            i();
        }
    }

    public final void h(MediaFormat mediaFormat) {
        this.e.b(-2);
        this.g.add(mediaFormat);
    }

    public final void i() {
        if (!this.g.isEmpty()) {
            this.i = (MediaFormat) this.g.getLast();
        }
        this.d.c();
        this.e.c();
        this.f.clear();
        this.g.clear();
        this.j = null;
    }

    public final void j() {
        IllegalStateException illegalStateException = this.m;
        if (illegalStateException == null) {
            return;
        }
        this.m = null;
        throw illegalStateException;
    }

    public final void k() {
        MediaCodec.CodecException codecException = this.j;
        if (codecException == null) {
            return;
        }
        this.j = null;
        throw codecException;
    }

    public final boolean l() {
        return this.k > 0 || this.l;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            this.d.b(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            MediaFormat mediaFormat = this.i;
            if (mediaFormat != null) {
                h(mediaFormat);
                this.i = null;
            }
            this.e.b(i);
            this.f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            h(mediaFormat);
            this.i = null;
        }
    }
}
