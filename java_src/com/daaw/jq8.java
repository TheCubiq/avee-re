package com.daaw;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class jq8 implements bp8 {
    public final MediaCodec a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;

    public /* synthetic */ jq8(MediaCodec mediaCodec, iq8 iq8Var) {
        this.a = mediaCodec;
        if (it5.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.daaw.bp8
    public final void a(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // com.daaw.bp8
    public final void b(int i, int i2, int i3, long j, int i4) {
        this.a.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.daaw.bp8
    public final ByteBuffer c(int i) {
        return it5.a >= 21 ? this.a.getOutputBuffer(i) : ((ByteBuffer[]) it5.h(this.c))[i];
    }

    @Override // com.daaw.bp8
    public final void d(int i, int i2, d77 d77Var, long j, int i3) {
        this.a.queueSecureInputBuffer(i, 0, d77Var.a(), j, 0);
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
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                if (it5.a < 21) {
                    this.c = this.a.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.daaw.bp8
    public final void o(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // com.daaw.bp8
    public final int zza() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // com.daaw.bp8
    public final MediaFormat zzc() {
        return this.a.getOutputFormat();
    }

    @Override // com.daaw.bp8
    public final ByteBuffer zzf(int i) {
        return it5.a >= 21 ? this.a.getInputBuffer(i) : ((ByteBuffer[]) it5.h(this.b))[i];
    }

    @Override // com.daaw.bp8
    public final void zzi() {
        this.a.flush();
    }

    @Override // com.daaw.bp8
    public final void zzl() {
        this.b = null;
        this.c = null;
        this.a.release();
    }

    @Override // com.daaw.bp8
    public final boolean zzr() {
        return false;
    }
}
