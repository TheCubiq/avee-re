package com.daaw;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class m23 extends v23 {
    public FullScreenContentCallback p;

    public final void g3(FullScreenContentCallback fullScreenContentCallback) {
        this.p = fullScreenContentCallback;
    }

    @Override // com.daaw.w23
    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.daaw.w23
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.daaw.w23
    public final void zzd(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.daaw.w23
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.daaw.w23
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
