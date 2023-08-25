package com.daaw;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
/* loaded from: classes.dex */
public final class uh5 extends AdListener {

    /* renamed from: a */
    public final /* synthetic */ String f29081a;

    /* renamed from: b */
    public final /* synthetic */ xh5 f29082b;

    public uh5(xh5 xh5Var, String str) {
        this.f29082b = xh5Var;
        this.f29081a = str;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String m5097o3;
        xh5 xh5Var = this.f29082b;
        m5097o3 = xh5.m5097o3(loadAdError);
        xh5Var.m5096p3(m5097o3, this.f29081a);
    }
}
