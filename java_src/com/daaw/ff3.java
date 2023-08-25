package com.daaw;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
/* loaded from: classes.dex */
public final class ff3 extends ee3 {

    /* renamed from: p */
    public final /* synthetic */ gf3 f9541p;

    public /* synthetic */ ff3(gf3 gf3Var, ef3 ef3Var) {
        this.f9541p = gf3Var;
    }

    @Override // com.daaw.fe3
    /* renamed from: e2 */
    public final void mo8857e2(sd3 sd3Var) {
        NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener;
        NativeCustomTemplateAd m21719f;
        gf3 gf3Var = this.f9541p;
        onCustomTemplateAdLoadedListener = gf3Var.f11147a;
        m21719f = gf3Var.m21719f(sd3Var);
        onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded(m21719f);
    }
}
