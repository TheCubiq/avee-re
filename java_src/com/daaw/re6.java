package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* loaded from: classes.dex */
public final class re6 implements ey6 {
    public final /* synthetic */ ve6 a;

    public re6(ve6 ve6Var) {
        this.a = ve6Var;
    }

    @Override // com.daaw.ey6
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        rk6 e;
        ue6 ue6Var;
        k04.zzh("", (pk5) obj);
        zze.zza("Failed to get a cache key, reverting to legacy flow.");
        ve6 ve6Var = this.a;
        e = ve6Var.e();
        ve6Var.d = new ue6(null, e, null);
        ue6Var = this.a.d;
        return ue6Var;
    }
}
