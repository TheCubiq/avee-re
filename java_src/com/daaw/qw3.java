package com.daaw;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class qw3 extends yv3 {
    public FullScreenContentCallback p;
    public OnUserEarnedRewardListener q;

    @Override // com.daaw.zv3
    public final void H0(tv3 tv3Var) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.q;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new gw3(tv3Var));
        }
    }

    public final void g3(FullScreenContentCallback fullScreenContentCallback) {
        this.p = fullScreenContentCallback;
    }

    public final void h3(OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.q = onUserEarnedRewardListener;
    }

    @Override // com.daaw.zv3
    public final void i(int i) {
    }

    @Override // com.daaw.zv3
    public final void z2(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.daaw.zv3
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.daaw.zv3
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.daaw.zv3
    public final void zzg() {
        FullScreenContentCallback fullScreenContentCallback = this.p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.daaw.zv3
    public final void zzj() {
        FullScreenContentCallback fullScreenContentCallback = this.p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
