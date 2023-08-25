package com.daaw;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
/* loaded from: classes.dex */
public final class yu2 implements wu2 {
    public /* synthetic */ yu2(xu2 xu2Var) {
    }

    @Override // com.daaw.wu2
    /* renamed from: a */
    public final boolean mo1871a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    @Override // com.daaw.wu2
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.daaw.wu2
    public final MediaCodecInfo zzb(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.daaw.wu2
    public final boolean zzd() {
        return false;
    }
}
