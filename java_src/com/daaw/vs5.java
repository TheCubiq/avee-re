package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class vs5 implements o67 {
    public final /* synthetic */ ws5 a;

    public vs5(ws5 ws5Var) {
        this.a = ws5Var;
    }

    @Override // com.daaw.o67
    public final /* synthetic */ void a(Object obj) {
        ((zi4) obj).b();
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        zj4 zj4Var;
        nq4 nq4Var;
        zj4Var = this.a.a;
        zze a = zj4Var.d().a(th);
        nq4Var = this.a.d;
        nq4Var.b(a);
        nj6.b(a.zza, th, "DelayedBannerAd.onFailure");
    }
}
