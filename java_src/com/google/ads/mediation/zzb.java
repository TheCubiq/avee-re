package com.google.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
/* loaded from: classes.dex */
final class zzb extends com.google.android.gms.ads.reward.zza {
    private final /* synthetic */ AbstractAdViewAdapter zzhd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.zzhd = abstractAdViewAdapter;
    }

    @Override // com.google.android.gms.ads.reward.zza
    public final void zzt() {
        InterstitialAd interstitialAd;
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        InterstitialAd interstitialAd2;
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener2;
        interstitialAd = this.zzhd.zzha;
        if (interstitialAd != null) {
            mediationRewardedVideoAdListener = this.zzhd.zzhb;
            if (mediationRewardedVideoAdListener != null) {
                interstitialAd2 = this.zzhd.zzha;
                Bundle zzba = interstitialAd2.zzba();
                mediationRewardedVideoAdListener2 = this.zzhd.zzhb;
                mediationRewardedVideoAdListener2.zzc(zzba);
            }
        }
    }
}
