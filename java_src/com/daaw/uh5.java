package com.daaw;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
/* loaded from: classes.dex */
public final class uh5 extends AdListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ xh5 b;

    public uh5(xh5 xh5Var, String str) {
        this.b = xh5Var;
        this.a = str;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String o3;
        xh5 xh5Var = this.b;
        o3 = xh5.o3(loadAdError);
        xh5Var.p3(o3, this.a);
    }
}
