package com.daaw;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
/* loaded from: classes.dex */
public final class tq3 extends ee3 {

    /* renamed from: p */
    public final /* synthetic */ uq3 f27985p;

    public /* synthetic */ tq3(uq3 uq3Var, sq3 sq3Var) {
        this.f27985p = uq3Var;
    }

    @Override // com.daaw.fe3
    /* renamed from: e2 */
    public final void mo8857e2(sd3 sd3Var) {
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener;
        NativeCustomFormatAd m7804f;
        uq3 uq3Var = this.f27985p;
        onCustomFormatAdLoadedListener = uq3Var.f29448a;
        m7804f = uq3Var.m7804f(sd3Var);
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(m7804f);
    }
}
