package com.daaw;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;
/* loaded from: classes.dex */
public final class th3 extends vh3 {
    public final OnH5AdsEventListener p;

    public th3(OnH5AdsEventListener onH5AdsEventListener) {
        this.p = onH5AdsEventListener;
    }

    @Override // com.daaw.zh3
    public final void zzb(String str) {
        this.p.onH5AdsEvent(str);
    }
}
