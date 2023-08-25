package com.daaw;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
/* loaded from: classes.dex */
public final class eo3 extends ln3 {

    /* renamed from: p */
    public final MediationInterscrollerAd f8624p;

    public eo3(MediationInterscrollerAd mediationInterscrollerAd) {
        this.f8624p = mediationInterscrollerAd;
    }

    @Override // com.daaw.mn3
    public final yd0 zze() {
        return nt0.m14830g3(this.f8624p.getView());
    }

    @Override // com.daaw.mn3
    public final boolean zzf() {
        return this.f8624p.shouldDelegateInterscrollerEffect();
    }
}
