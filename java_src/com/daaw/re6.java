package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* loaded from: classes.dex */
public final class re6 implements ey6 {

    /* renamed from: a */
    public final /* synthetic */ ve6 f25221a;

    public re6(ve6 ve6Var) {
        this.f25221a = ve6Var;
    }

    @Override // com.daaw.ey6
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        rk6 m7206e;
        ue6 ue6Var;
        k04.zzh("", (pk5) obj);
        zze.zza("Failed to get a cache key, reverting to legacy flow.");
        ve6 ve6Var = this.f25221a;
        m7206e = ve6Var.m7206e();
        ve6Var.f30190d = new ue6(null, m7206e, null);
        ue6Var = this.f25221a.f30190d;
        return ue6Var;
    }
}
