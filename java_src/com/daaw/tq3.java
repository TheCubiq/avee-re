package com.daaw;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
/* loaded from: classes.dex */
public final class tq3 extends ee3 {
    public final /* synthetic */ uq3 p;

    public /* synthetic */ tq3(uq3 uq3Var, sq3 sq3Var) {
        this.p = uq3Var;
    }

    @Override // com.daaw.fe3
    public final void e2(sd3 sd3Var) {
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener;
        NativeCustomFormatAd f;
        uq3 uq3Var = this.p;
        onCustomFormatAdLoadedListener = uq3Var.a;
        f = uq3Var.f(sd3Var);
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(f);
    }
}
