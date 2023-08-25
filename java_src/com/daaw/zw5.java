package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
/* loaded from: classes.dex */
public final class zw5 implements zzf {
    public final /* synthetic */ e14 a;
    public final /* synthetic */ fi6 b;
    public final /* synthetic */ th6 c;
    public final /* synthetic */ fx5 d;
    public final /* synthetic */ ax5 e;

    public zw5(ax5 ax5Var, e14 e14Var, fi6 fi6Var, th6 th6Var, fx5 fx5Var) {
        this.e = ax5Var;
        this.a = e14Var;
        this.b = fi6Var;
        this.c = th6Var;
        this.d = fx5Var;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        jx5 jx5Var;
        e14 e14Var = this.a;
        jx5Var = this.e.d;
        e14Var.b(jx5Var.a(this.b, this.c, view, this.d));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
