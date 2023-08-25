package com.daaw;

import com.google.android.gms.internal.ads.zzcdd;
import javax.annotation.ParametersAreNonnullByDefault;
/* loaded from: classes.dex */
public final class g95 implements oh3 {

    /* renamed from: p */
    public final vr4 f10908p;

    /* renamed from: q */
    public final zzcdd f10909q;

    /* renamed from: r */
    public final String f10910r;

    /* renamed from: s */
    public final String f10911s;

    public g95(vr4 vr4Var, th6 th6Var) {
        this.f10908p = vr4Var;
        this.f10909q = th6Var.f27704m;
        this.f10910r = th6Var.f27700k;
        this.f10911s = th6Var.f27702l;
    }

    @Override // com.daaw.oh3
    @ParametersAreNonnullByDefault
    /* renamed from: h0 */
    public final void mo14271h0(zzcdd zzcddVar) {
        int i;
        String str;
        zzcdd zzcddVar2 = this.f10909q;
        if (zzcddVar2 != null) {
            zzcddVar = zzcddVar2;
        }
        if (zzcddVar != null) {
            str = zzcddVar.f36977p;
            i = zzcddVar.f36978q;
        } else {
            i = 1;
            str = "";
        }
        this.f10908p.m6836C0(new zu3(str, i), this.f10910r, this.f10911s);
    }

    @Override // com.daaw.oh3
    public final void zzb() {
        this.f10908p.zze();
    }

    @Override // com.daaw.oh3
    public final void zzc() {
        this.f10908p.zzf();
    }
}
