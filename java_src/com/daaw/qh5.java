package com.daaw;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
/* loaded from: classes.dex */
public final class qh5 extends AdListener {

    /* renamed from: a */
    public final /* synthetic */ String f23956a;

    /* renamed from: b */
    public final /* synthetic */ AdView f23957b;

    /* renamed from: c */
    public final /* synthetic */ String f23958c;

    /* renamed from: d */
    public final /* synthetic */ xh5 f23959d;

    public qh5(xh5 xh5Var, String str, AdView adView, String str2) {
        this.f23959d = xh5Var;
        this.f23956a = str;
        this.f23957b = adView;
        this.f23958c = str2;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String m5097o3;
        xh5 xh5Var = this.f23959d;
        m5097o3 = xh5.m5097o3(loadAdError);
        xh5Var.m5096p3(m5097o3, this.f23958c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f23959d.m5101k3(this.f23956a, this.f23957b, this.f23958c);
    }
}
