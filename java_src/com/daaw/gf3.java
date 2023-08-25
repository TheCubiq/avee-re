package com.daaw;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
/* loaded from: classes.dex */
public final class gf3 {

    /* renamed from: a */
    public final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener f11147a;

    /* renamed from: b */
    public final NativeCustomTemplateAd.OnCustomClickListener f11148b;

    /* renamed from: c */
    public NativeCustomTemplateAd f11149c;

    public gf3(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.f11147a = onCustomTemplateAdLoadedListener;
        this.f11148b = onCustomClickListener;
    }

    /* renamed from: d */
    public final ce3 m21721d() {
        if (this.f11148b == null) {
            return null;
        }
        return new df3(this, null);
    }

    /* renamed from: e */
    public final fe3 m21720e() {
        return new ff3(this, null);
    }

    /* renamed from: f */
    public final synchronized NativeCustomTemplateAd m21719f(sd3 sd3Var) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.f11149c;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        td3 td3Var = new td3(sd3Var);
        this.f11149c = td3Var;
        return td3Var;
    }
}
