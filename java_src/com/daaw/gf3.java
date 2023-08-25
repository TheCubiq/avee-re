package com.daaw;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
/* loaded from: classes.dex */
public final class gf3 {
    public final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener a;
    public final NativeCustomTemplateAd.OnCustomClickListener b;
    public NativeCustomTemplateAd c;

    public gf3(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.a = onCustomTemplateAdLoadedListener;
        this.b = onCustomClickListener;
    }

    public final ce3 d() {
        if (this.b == null) {
            return null;
        }
        return new df3(this, null);
    }

    public final fe3 e() {
        return new ff3(this, null);
    }

    public final synchronized NativeCustomTemplateAd f(sd3 sd3Var) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.c;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        td3 td3Var = new td3(sd3Var);
        this.c = td3Var;
        return td3Var;
    }
}
