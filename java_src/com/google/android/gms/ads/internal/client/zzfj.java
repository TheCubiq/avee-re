package com.google.android.gms.ads.internal.client;

import com.daaw.nt0;
import com.daaw.re3;
import com.daaw.yd0;
import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;
/* loaded from: classes.dex */
public final class zzfj extends re3 {

    /* renamed from: p */
    public final ShouldDelayBannerRenderingListener f36187p;

    public zzfj(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
        this.f36187p = shouldDelayBannerRenderingListener;
    }

    @Override // com.daaw.se3
    public final boolean zzb(yd0 yd0Var) {
        return this.f36187p.shouldDelayBannerRendering((Runnable) nt0.m14831M(yd0Var));
    }
}
