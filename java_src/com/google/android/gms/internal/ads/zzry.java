package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeContentAd;
@zzadh
/* loaded from: classes2.dex */
public final class zzry extends zzra {
    private final NativeContentAd.OnContentAdLoadedListener zzblc;

    public zzry(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
        this.zzblc = onContentAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final void zza(zzqo zzqoVar) {
        this.zzblc.onContentAdLoaded(new zzqr(zzqoVar));
    }
}
