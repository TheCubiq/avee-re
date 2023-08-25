package com.daaw;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class fq8 implements rp8 {

    /* renamed from: a */
    public final int f9801a;

    /* renamed from: b */
    public MediaCodecInfo[] f9802b;

    public fq8(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.f9801a = i;
    }

    @Override // com.daaw.rp8
    /* renamed from: a */
    public final boolean mo11079a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.daaw.rp8
    /* renamed from: b */
    public final boolean mo11078b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @EnsuresNonNull({"mediaCodecInfos"})
    /* renamed from: c */
    public final void m22398c() {
        if (this.f9802b == null) {
            this.f9802b = new MediaCodecList(this.f9801a).getCodecInfos();
        }
    }

    @Override // com.daaw.rp8
    public final int zza() {
        m22398c();
        return this.f9802b.length;
    }

    @Override // com.daaw.rp8
    public final MediaCodecInfo zzb(int i) {
        m22398c();
        return this.f9802b[i];
    }

    @Override // com.daaw.rp8
    public final boolean zze() {
        return true;
    }
}
