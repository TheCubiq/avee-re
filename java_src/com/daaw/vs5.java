package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class vs5 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ ws5 f30555a;

    public vs5(ws5 ws5Var) {
        this.f30555a = ws5Var;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* synthetic */ void mo2151a(Object obj) {
        ((zi4) obj).mo2131b();
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        zj4 zj4Var;
        nq4 nq4Var;
        zj4Var = this.f30555a.f31486a;
        zze m18391a = zj4Var.mo2199d().m18391a(th);
        nq4Var = this.f30555a.f31489d;
        nq4Var.mo2194b(m18391a);
        nj6.m15145b(m18391a.zza, th, "DelayedBannerAd.onFailure");
    }
}
