package com.daaw;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
/* loaded from: classes.dex */
public final class eq8 implements rp8 {
    public /* synthetic */ eq8(dq8 dq8Var) {
    }

    @Override // com.daaw.rp8
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.daaw.rp8
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.daaw.rp8
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.daaw.rp8
    public final MediaCodecInfo zzb(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.daaw.rp8
    public final boolean zze() {
        return false;
    }
}
