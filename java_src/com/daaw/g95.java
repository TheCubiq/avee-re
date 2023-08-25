package com.daaw;

import com.google.android.gms.internal.ads.zzcdd;
import javax.annotation.ParametersAreNonnullByDefault;
/* loaded from: classes.dex */
public final class g95 implements oh3 {
    public final vr4 p;
    public final zzcdd q;
    public final String r;
    public final String s;

    public g95(vr4 vr4Var, th6 th6Var) {
        this.p = vr4Var;
        this.q = th6Var.m;
        this.r = th6Var.k;
        this.s = th6Var.l;
    }

    @Override // com.daaw.oh3
    @ParametersAreNonnullByDefault
    public final void h0(zzcdd zzcddVar) {
        int i;
        String str;
        zzcdd zzcddVar2 = this.q;
        if (zzcddVar2 != null) {
            zzcddVar = zzcddVar2;
        }
        if (zzcddVar != null) {
            str = zzcddVar.p;
            i = zzcddVar.q;
        } else {
            i = 1;
            str = "";
        }
        this.p.C0(new zu3(str, i), this.r, this.s);
    }

    @Override // com.daaw.oh3
    public final void zzb() {
        this.p.zze();
    }

    @Override // com.daaw.oh3
    public final void zzc() {
        this.p.zzf();
    }
}
