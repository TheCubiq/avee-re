package com.daaw;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class qw3 extends yv3 {

    /* renamed from: p */
    public FullScreenContentCallback f24539p;

    /* renamed from: q */
    public OnUserEarnedRewardListener f24540q;

    @Override // com.daaw.zv3
    /* renamed from: H0 */
    public final void mo1841H0(tv3 tv3Var) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.f24540q;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new gw3(tv3Var));
        }
    }

    /* renamed from: g3 */
    public final void m12015g3(FullScreenContentCallback fullScreenContentCallback) {
        this.f24539p = fullScreenContentCallback;
    }

    /* renamed from: h3 */
    public final void m12014h3(OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f24540q = onUserEarnedRewardListener;
    }

    @Override // com.daaw.zv3
    /* renamed from: i */
    public final void mo1840i(int i) {
    }

    @Override // com.daaw.zv3
    /* renamed from: z2 */
    public final void mo1839z2(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.f24539p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.daaw.zv3
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f24539p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.daaw.zv3
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f24539p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.daaw.zv3
    public final void zzg() {
        FullScreenContentCallback fullScreenContentCallback = this.f24539p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.daaw.zv3
    public final void zzj() {
        FullScreenContentCallback fullScreenContentCallback = this.f24539p;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
