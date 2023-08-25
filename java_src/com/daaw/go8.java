package com.daaw;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class go8 implements bp8 {
    public final MediaCodec a;
    public final uo8 b;
    public final so8 c;
    public boolean d;
    public int e = 0;

    public /* synthetic */ go8(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, fo8 fo8Var) {
        this.a = mediaCodec;
        this.b = new uo8(handlerThread);
        this.c = new so8(mediaCodec, handlerThread2);
    }

    public static /* synthetic */ String i(int i) {
        return l(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static /* synthetic */ String j(int i) {
        return l(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static /* synthetic */ void k(go8 go8Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        go8Var.b.f(go8Var.a);
        int i2 = it5.a;
        Trace.beginSection("configureCodec");
        go8Var.a.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        go8Var.c.f();
        Trace.beginSection("startCodec");
        go8Var.a.start();
        Trace.endSection();
        go8Var.e = 1;
    }

    public static String l(int i, String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            str2 = "Audio";
        } else if (i == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.daaw.bp8
    public final void a(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // com.daaw.bp8
    public final void b(int i, int i2, int i3, long j, int i4) {
        this.c.c(i, 0, i3, j, i4);
    }

    @Override // com.daaw.bp8
    public final ByteBuffer c(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // com.daaw.bp8
    public final void d(int i, int i2, d77 d77Var, long j, int i3) {
        this.c.d(i, 0, d77Var, j, 0);
    }

    @Override // com.daaw.bp8
    public final void e(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // com.daaw.bp8
    public final void f(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // com.daaw.bp8
    public final void g(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // com.daaw.bp8
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        return this.b.b(bufferInfo);
    }

    @Override // com.daaw.bp8
    public final void o(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // com.daaw.bp8
    public final int zza() {
        return this.b.a();
    }

    @Override // com.daaw.bp8
    public final MediaFormat zzc() {
        return this.b.c();
    }

    @Override // com.daaw.bp8
    public final ByteBuffer zzf(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // com.daaw.bp8
    public final void zzi() {
        this.c.b();
        this.a.flush();
        this.b.e();
        this.a.start();
    }

    @Override // com.daaw.bp8
    public final void zzl() {
        try {
            if (this.e == 1) {
                this.c.e();
                this.b.g();
            }
            this.e = 2;
            if (this.d) {
                return;
            }
            this.a.release();
            this.d = true;
        } catch (Throwable th) {
            if (!this.d) {
                this.a.release();
                this.d = true;
            }
            throw th;
        }
    }

    @Override // com.daaw.bp8
    public final boolean zzr() {
        return false;
    }
}
