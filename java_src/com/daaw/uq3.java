package com.daaw;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
/* loaded from: classes.dex */
public final class uq3 {
    public final NativeCustomFormatAd.OnCustomFormatAdLoadedListener a;
    public final NativeCustomFormatAd.OnCustomClickListener b;
    public NativeCustomFormatAd c;

    public uq3(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.a = onCustomFormatAdLoadedListener;
        this.b = onCustomClickListener;
    }

    public final ce3 a() {
        if (this.b == null) {
            return null;
        }
        return new rq3(this, null);
    }

    public final fe3 b() {
        return new tq3(this, null);
    }

    public final synchronized NativeCustomFormatAd f(sd3 sd3Var) {
        NativeCustomFormatAd nativeCustomFormatAd = this.c;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        vq3 vq3Var = new vq3(sd3Var);
        this.c = vq3Var;
        return vq3Var;
    }
}
