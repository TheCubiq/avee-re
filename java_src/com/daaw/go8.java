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

    /* renamed from: a */
    public final MediaCodec f11547a;

    /* renamed from: b */
    public final uo8 f11548b;

    /* renamed from: c */
    public final so8 f11549c;

    /* renamed from: d */
    public boolean f11550d;

    /* renamed from: e */
    public int f11551e = 0;

    public /* synthetic */ go8(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, fo8 fo8Var) {
        this.f11547a = mediaCodec;
        this.f11548b = new uo8(handlerThread);
        this.f11549c = new so8(mediaCodec, handlerThread2);
    }

    /* renamed from: i */
    public static /* synthetic */ String m21371i(int i) {
        return m21368l(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* renamed from: j */
    public static /* synthetic */ String m21370j(int i) {
        return m21368l(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* renamed from: k */
    public static /* synthetic */ void m21369k(go8 go8Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        go8Var.f11548b.m7861f(go8Var.f11547a);
        int i2 = it5.f13991a;
        Trace.beginSection("configureCodec");
        go8Var.f11547a.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        go8Var.f11549c.m10101f();
        Trace.beginSection("startCodec");
        go8Var.f11547a.start();
        Trace.endSection();
        go8Var.f11551e = 1;
    }

    /* renamed from: l */
    public static String m21368l(int i, String str) {
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
    /* renamed from: a */
    public final void mo18333a(int i, long j) {
        this.f11547a.releaseOutputBuffer(i, j);
    }

    @Override // com.daaw.bp8
    /* renamed from: b */
    public final void mo18332b(int i, int i2, int i3, long j, int i4) {
        this.f11549c.m10104c(i, 0, i3, j, i4);
    }

    @Override // com.daaw.bp8
    /* renamed from: c */
    public final ByteBuffer mo18331c(int i) {
        return this.f11547a.getOutputBuffer(i);
    }

    @Override // com.daaw.bp8
    /* renamed from: d */
    public final void mo18330d(int i, int i2, d77 d77Var, long j, int i3) {
        this.f11549c.m10103d(i, 0, d77Var, j, 0);
    }

    @Override // com.daaw.bp8
    /* renamed from: e */
    public final void mo18329e(Surface surface) {
        this.f11547a.setOutputSurface(surface);
    }

    @Override // com.daaw.bp8
    /* renamed from: f */
    public final void mo18328f(int i) {
        this.f11547a.setVideoScalingMode(i);
    }

    @Override // com.daaw.bp8
    /* renamed from: g */
    public final void mo18327g(int i, boolean z) {
        this.f11547a.releaseOutputBuffer(i, z);
    }

    @Override // com.daaw.bp8
    /* renamed from: h */
    public final int mo18326h(MediaCodec.BufferInfo bufferInfo) {
        return this.f11548b.m7865b(bufferInfo);
    }

    @Override // com.daaw.bp8
    /* renamed from: o */
    public final void mo18325o(Bundle bundle) {
        this.f11547a.setParameters(bundle);
    }

    @Override // com.daaw.bp8
    public final int zza() {
        return this.f11548b.m7866a();
    }

    @Override // com.daaw.bp8
    public final MediaFormat zzc() {
        return this.f11548b.m7864c();
    }

    @Override // com.daaw.bp8
    public final ByteBuffer zzf(int i) {
        return this.f11547a.getInputBuffer(i);
    }

    @Override // com.daaw.bp8
    public final void zzi() {
        this.f11549c.m10105b();
        this.f11547a.flush();
        this.f11548b.m7862e();
        this.f11547a.start();
    }

    @Override // com.daaw.bp8
    public final void zzl() {
        try {
            if (this.f11551e == 1) {
                this.f11549c.m10102e();
                this.f11548b.m7860g();
            }
            this.f11551e = 2;
            if (this.f11550d) {
                return;
            }
            this.f11547a.release();
            this.f11550d = true;
        } catch (Throwable th) {
            if (!this.f11550d) {
                this.f11547a.release();
                this.f11550d = true;
            }
            throw th;
        }
    }

    @Override // com.daaw.bp8
    public final boolean zzr() {
        return false;
    }
}
