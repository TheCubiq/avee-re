package com.daaw;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class fq8 implements rp8 {
    public final int a;
    public MediaCodecInfo[] b;

    public fq8(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.a = i;
    }

    @Override // com.daaw.rp8
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.daaw.rp8
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @EnsuresNonNull({"mediaCodecInfos"})
    public final void c() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
    }

    @Override // com.daaw.rp8
    public final int zza() {
        c();
        return this.b.length;
    }

    @Override // com.daaw.rp8
    public final MediaCodecInfo zzb(int i) {
        c();
        return this.b[i];
    }

    @Override // com.daaw.rp8
    public final boolean zze() {
        return true;
    }
}
