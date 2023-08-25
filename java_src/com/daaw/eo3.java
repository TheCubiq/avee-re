package com.daaw;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
/* loaded from: classes.dex */
public final class eo3 extends ln3 {
    public final MediationInterscrollerAd p;

    public eo3(MediationInterscrollerAd mediationInterscrollerAd) {
        this.p = mediationInterscrollerAd;
    }

    @Override // com.daaw.mn3
    public final yd0 zze() {
        return nt0.g3(this.p.getView());
    }

    @Override // com.daaw.mn3
    public final boolean zzf() {
        return this.p.shouldDelegateInterscrollerEffect();
    }
}
