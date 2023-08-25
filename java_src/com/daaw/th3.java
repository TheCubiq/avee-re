package com.daaw;

import com.google.android.gms.ads.p003h5.OnH5AdsEventListener;
/* loaded from: classes.dex */
public final class th3 extends vh3 {

    /* renamed from: p */
    public final OnH5AdsEventListener f27648p;

    public th3(OnH5AdsEventListener onH5AdsEventListener) {
        this.f27648p = onH5AdsEventListener;
    }

    @Override // com.daaw.zh3
    public final void zzb(String str) {
        this.f27648p.onH5AdsEvent(str);
    }
}
