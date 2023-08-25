package com.daaw;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
/* loaded from: classes.dex */
public final class uq3 {

    /* renamed from: a */
    public final NativeCustomFormatAd.OnCustomFormatAdLoadedListener f29448a;

    /* renamed from: b */
    public final NativeCustomFormatAd.OnCustomClickListener f29449b;

    /* renamed from: c */
    public NativeCustomFormatAd f29450c;

    public uq3(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.f29448a = onCustomFormatAdLoadedListener;
        this.f29449b = onCustomClickListener;
    }

    /* renamed from: a */
    public final ce3 m7809a() {
        if (this.f29449b == null) {
            return null;
        }
        return new rq3(this, null);
    }

    /* renamed from: b */
    public final fe3 m7808b() {
        return new tq3(this, null);
    }

    /* renamed from: f */
    public final synchronized NativeCustomFormatAd m7804f(sd3 sd3Var) {
        NativeCustomFormatAd nativeCustomFormatAd = this.f29450c;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        vq3 vq3Var = new vq3(sd3Var);
        this.f29450c = vq3Var;
        return vq3Var;
    }
}
