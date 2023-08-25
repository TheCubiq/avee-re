package com.daaw;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class uo8 extends MediaCodec.Callback {

    /* renamed from: b */
    public final HandlerThread f29390b;

    /* renamed from: c */
    public Handler f29391c;

    /* renamed from: h */
    public MediaFormat f29396h;

    /* renamed from: i */
    public MediaFormat f29397i;

    /* renamed from: j */
    public MediaCodec.CodecException f29398j;

    /* renamed from: k */
    public long f29399k;

    /* renamed from: l */
    public boolean f29400l;

    /* renamed from: m */
    public IllegalStateException f29401m;

    /* renamed from: a */
    public final Object f29389a = new Object();

    /* renamed from: d */
    public final yo8 f29392d = new yo8();

    /* renamed from: e */
    public final yo8 f29393e = new yo8();

    /* renamed from: f */
    public final ArrayDeque f29394f = new ArrayDeque();

    /* renamed from: g */
    public final ArrayDeque f29395g = new ArrayDeque();

    public uo8(HandlerThread handlerThread) {
        this.f29390b = handlerThread;
    }

    /* renamed from: d */
    public static /* synthetic */ void m7863d(uo8 uo8Var) {
        synchronized (uo8Var.f29389a) {
            if (uo8Var.f29400l) {
                return;
            }
            long j = uo8Var.f29399k - 1;
            uo8Var.f29399k = j;
            if (j > 0) {
                return;
            }
            if (j >= 0) {
                uo8Var.m7858i();
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException();
            synchronized (uo8Var.f29389a) {
                uo8Var.f29401m = illegalStateException;
            }
        }
    }

    /* renamed from: a */
    public final int m7866a() {
        synchronized (this.f29389a) {
            int i = -1;
            if (m7855l()) {
                return -1;
            }
            m7857j();
            m7856k();
            if (!this.f29392d.m3471d()) {
                i = this.f29392d.m3474a();
            }
            return i;
        }
    }

    /* renamed from: b */
    public final int m7865b(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f29389a) {
            if (m7855l()) {
                return -1;
            }
            m7857j();
            m7856k();
            if (this.f29393e.m3471d()) {
                return -1;
            }
            int m3474a = this.f29393e.m3474a();
            if (m3474a >= 0) {
                uo4.m7876b(this.f29396h);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f29394f.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (m3474a == -2) {
                this.f29396h = (MediaFormat) this.f29395g.remove();
                m3474a = -2;
            }
            return m3474a;
        }
    }

    /* renamed from: c */
    public final MediaFormat m7864c() {
        MediaFormat mediaFormat;
        synchronized (this.f29389a) {
            mediaFormat = this.f29396h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: e */
    public final void m7862e() {
        synchronized (this.f29389a) {
            this.f29399k++;
            Handler handler = this.f29391c;
            int i = it5.f13991a;
            handler.post(new Runnable() { // from class: com.daaw.to8
                @Override // java.lang.Runnable
                public final void run() {
                    uo8.m7863d(uo8.this);
                }
            });
        }
    }

    /* renamed from: f */
    public final void m7861f(MediaCodec mediaCodec) {
        uo4.m7872f(this.f29391c == null);
        this.f29390b.start();
        Handler handler = new Handler(this.f29390b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f29391c = handler;
    }

    /* renamed from: g */
    public final void m7860g() {
        synchronized (this.f29389a) {
            this.f29400l = true;
            this.f29390b.quit();
            m7858i();
        }
    }

    /* renamed from: h */
    public final void m7859h(MediaFormat mediaFormat) {
        this.f29393e.m3473b(-2);
        this.f29395g.add(mediaFormat);
    }

    /* renamed from: i */
    public final void m7858i() {
        if (!this.f29395g.isEmpty()) {
            this.f29397i = (MediaFormat) this.f29395g.getLast();
        }
        this.f29392d.m3472c();
        this.f29393e.m3472c();
        this.f29394f.clear();
        this.f29395g.clear();
        this.f29398j = null;
    }

    /* renamed from: j */
    public final void m7857j() {
        IllegalStateException illegalStateException = this.f29401m;
        if (illegalStateException == null) {
            return;
        }
        this.f29401m = null;
        throw illegalStateException;
    }

    /* renamed from: k */
    public final void m7856k() {
        MediaCodec.CodecException codecException = this.f29398j;
        if (codecException == null) {
            return;
        }
        this.f29398j = null;
        throw codecException;
    }

    /* renamed from: l */
    public final boolean m7855l() {
        return this.f29399k > 0 || this.f29400l;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f29389a) {
            this.f29398j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f29389a) {
            this.f29392d.m3473b(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f29389a) {
            MediaFormat mediaFormat = this.f29397i;
            if (mediaFormat != null) {
                m7859h(mediaFormat);
                this.f29397i = null;
            }
            this.f29393e.m3473b(i);
            this.f29394f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f29389a) {
            m7859h(mediaFormat);
            this.f29397i = null;
        }
    }
}
