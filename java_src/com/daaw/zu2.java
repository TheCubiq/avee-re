package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
@TargetApi(21)
/* loaded from: classes.dex */
public final class zu2 implements wu2 {
    public final int a;
    public MediaCodecInfo[] b;

    public zu2(boolean z) {
        this.a = z ? 1 : 0;
    }

    @Override // com.daaw.wu2
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public final void b() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
    }

    @Override // com.daaw.wu2
    public final int zza() {
        b();
        return this.b.length;
    }

    @Override // com.daaw.wu2
    public final MediaCodecInfo zzb(int i) {
        b();
        return this.b[i];
    }

    @Override // com.daaw.wu2
    public final boolean zzd() {
        return true;
    }
}
