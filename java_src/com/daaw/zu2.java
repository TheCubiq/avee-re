package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
@TargetApi(21)
/* loaded from: classes.dex */
public final class zu2 implements wu2 {

    /* renamed from: a */
    public final int f35546a;

    /* renamed from: b */
    public MediaCodecInfo[] f35547b;

    public zu2(boolean z) {
        this.f35546a = z ? 1 : 0;
    }

    @Override // com.daaw.wu2
    /* renamed from: a */
    public final boolean mo1871a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: b */
    public final void m1870b() {
        if (this.f35547b == null) {
            this.f35547b = new MediaCodecList(this.f35546a).getCodecInfos();
        }
    }

    @Override // com.daaw.wu2
    public final int zza() {
        m1870b();
        return this.f35547b.length;
    }

    @Override // com.daaw.wu2
    public final MediaCodecInfo zzb(int i) {
        m1870b();
        return this.f35547b[i];
    }

    @Override // com.daaw.wu2
    public final boolean zzd() {
        return true;
    }
}
