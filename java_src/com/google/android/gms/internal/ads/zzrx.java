package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAppInstallAd;
@zzadh
/* loaded from: classes2.dex */
public final class zzrx extends zzqx {
    private final NativeAppInstallAd.OnAppInstallAdLoadedListener zzblb;

    public zzrx(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.zzblb = onAppInstallAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzqw
    public final void zza(zzqk zzqkVar) {
        this.zzblb.onAppInstallAdLoaded(new zzqn(zzqkVar));
    }
}
