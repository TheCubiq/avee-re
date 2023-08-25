package com.daaw;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
/* loaded from: classes.dex */
public final class ph5 extends AppOpenAd.AppOpenAdLoadCallback {

    /* renamed from: a */
    public final /* synthetic */ String f22943a;

    /* renamed from: b */
    public final /* synthetic */ String f22944b;

    /* renamed from: c */
    public final /* synthetic */ xh5 f22945c;

    public ph5(xh5 xh5Var, String str, String str2) {
        this.f22945c = xh5Var;
        this.f22943a = str;
        this.f22944b = str2;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String m5097o3;
        xh5 xh5Var = this.f22945c;
        m5097o3 = xh5.m5097o3(loadAdError);
        xh5Var.m5096p3(m5097o3, this.f22944b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(AppOpenAd appOpenAd) {
        this.f22945c.m5101k3(this.f22943a, appOpenAd, this.f22944b);
    }
}
