package com.daaw;

import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class k23 extends r23 {

    /* renamed from: p */
    public final AppOpenAd.AppOpenAdLoadCallback f15611p;

    /* renamed from: q */
    public final String f15612q;

    public k23(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.f15611p = appOpenAdLoadCallback;
        this.f15612q = str;
    }

    @Override // com.daaw.s23
    /* renamed from: i2 */
    public final void mo10752i2(zze zzeVar) {
        if (this.f15611p != null) {
            this.f15611p.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.daaw.s23
    /* renamed from: r2 */
    public final void mo10751r2(p23 p23Var) {
        if (this.f15611p != null) {
            this.f15611p.onAdLoaded(new l23(p23Var, this.f15612q));
        }
    }

    @Override // com.daaw.s23
    public final void zzb(int i) {
    }
}
