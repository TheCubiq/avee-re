package com.daaw;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
/* loaded from: classes.dex */
public final class ff3 extends ee3 {
    public final /* synthetic */ gf3 p;

    public /* synthetic */ ff3(gf3 gf3Var, ef3 ef3Var) {
        this.p = gf3Var;
    }

    @Override // com.daaw.fe3
    public final void e2(sd3 sd3Var) {
        NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener;
        NativeCustomTemplateAd f;
        gf3 gf3Var = this.p;
        onCustomTemplateAdLoadedListener = gf3Var.a;
        f = gf3Var.f(sd3Var);
        onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded(f);
    }
}
