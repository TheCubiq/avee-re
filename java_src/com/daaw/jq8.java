package com.daaw;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class jq8 implements bp8 {

    /* renamed from: a */
    public final MediaCodec f15343a;

    /* renamed from: b */
    public ByteBuffer[] f15344b;

    /* renamed from: c */
    public ByteBuffer[] f15345c;

    public /* synthetic */ jq8(MediaCodec mediaCodec, iq8 iq8Var) {
        this.f15343a = mediaCodec;
        if (it5.f13991a < 21) {
            this.f15344b = mediaCodec.getInputBuffers();
            this.f15345c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.daaw.bp8
    /* renamed from: a */
    public final void mo18333a(int i, long j) {
        this.f15343a.releaseOutputBuffer(i, j);
    }

    @Override // com.daaw.bp8
    /* renamed from: b */
    public final void mo18332b(int i, int i2, int i3, long j, int i4) {
        this.f15343a.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.daaw.bp8
    /* renamed from: c */
    public final ByteBuffer mo18331c(int i) {
        return it5.f13991a >= 21 ? this.f15343a.getOutputBuffer(i) : ((ByteBuffer[]) it5.m19391h(this.f15345c))[i];
    }

    @Override // com.daaw.bp8
    /* renamed from: d */
    public final void mo18330d(int i, int i2, d77 d77Var, long j, int i3) {
        this.f15343a.queueSecureInputBuffer(i, 0, d77Var.m24610a(), j, 0);
    }

    @Override // com.daaw.bp8
    /* renamed from: e */
    public final void mo18329e(Surface surface) {
        this.f15343a.setOutputSurface(surface);
    }

    @Override // com.daaw.bp8
    /* renamed from: f */
    public final void mo18328f(int i) {
        this.f15343a.setVideoScalingMode(i);
    }

    @Override // com.daaw.bp8
    /* renamed from: g */
    public final void mo18327g(int i, boolean z) {
        this.f15343a.releaseOutputBuffer(i, z);
    }

    @Override // com.daaw.bp8
    /* renamed from: h */
    public final int mo18326h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f15343a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                if (it5.f13991a < 21) {
                    this.f15345c = this.f15343a.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.daaw.bp8
    /* renamed from: o */
    public final void mo18325o(Bundle bundle) {
        this.f15343a.setParameters(bundle);
    }

    @Override // com.daaw.bp8
    public final int zza() {
        return this.f15343a.dequeueInputBuffer(0L);
    }

    @Override // com.daaw.bp8
    public final MediaFormat zzc() {
        return this.f15343a.getOutputFormat();
    }

    @Override // com.daaw.bp8
    public final ByteBuffer zzf(int i) {
        return it5.f13991a >= 21 ? this.f15343a.getInputBuffer(i) : ((ByteBuffer[]) it5.m19391h(this.f15344b))[i];
    }

    @Override // com.daaw.bp8
    public final void zzi() {
        this.f15343a.flush();
    }

    @Override // com.daaw.bp8
    public final void zzl() {
        this.f15344b = null;
        this.f15345c = null;
        this.f15343a.release();
    }

    @Override // com.daaw.bp8
    public final boolean zzr() {
        return false;
    }
}
