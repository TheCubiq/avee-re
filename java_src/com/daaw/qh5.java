package com.daaw;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
/* loaded from: classes.dex */
public final class qh5 extends AdListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ AdView b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xh5 d;

    public qh5(xh5 xh5Var, String str, AdView adView, String str2) {
        this.d = xh5Var;
        this.a = str;
        this.b = adView;
        this.c = str2;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String o3;
        xh5 xh5Var = this.d;
        o3 = xh5.o3(loadAdError);
        xh5Var.p3(o3, this.c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.d.k3(this.a, this.b, this.c);
    }
}
