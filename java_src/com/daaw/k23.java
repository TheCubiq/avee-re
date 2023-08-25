package com.daaw;

import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class k23 extends r23 {
    public final AppOpenAd.AppOpenAdLoadCallback p;
    public final String q;

    public k23(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.p = appOpenAdLoadCallback;
        this.q = str;
    }

    @Override // com.daaw.s23
    public final void i2(zze zzeVar) {
        if (this.p != null) {
            this.p.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.daaw.s23
    public final void r2(p23 p23Var) {
        if (this.p != null) {
            this.p.onAdLoaded(new l23(p23Var, this.q));
        }
    }

    @Override // com.daaw.s23
    public final void zzb(int i) {
    }
}
