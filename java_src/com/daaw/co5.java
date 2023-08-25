package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzccb;
/* loaded from: classes.dex */
public final class co5 implements pt4, fs4, oq4 {

    /* renamed from: p */
    public final nn6 f6012p;

    /* renamed from: q */
    public final on6 f6013q;

    /* renamed from: r */
    public final xz3 f6014r;

    public co5(nn6 nn6Var, on6 on6Var, xz3 xz3Var) {
        this.f6012p = nn6Var;
        this.f6013q = on6Var;
        this.f6014r = xz3Var;
    }

    @Override // com.daaw.pt4
    /* renamed from: F */
    public final void mo5181F(fi6 fi6Var) {
        this.f6012p.m14947h(fi6Var, this.f6014r);
    }

    @Override // com.daaw.oq4
    /* renamed from: b */
    public final void mo2194b(zze zzeVar) {
        nn6 nn6Var = this.f6012p;
        nn6Var.m14954a("action", "ftl");
        nn6Var.m14954a("ftl", String.valueOf(zzeVar.zza));
        nn6Var.m14954a("ed", zzeVar.zzc);
        this.f6013q.mo7889a(this.f6012p);
    }

    @Override // com.daaw.pt4
    /* renamed from: e */
    public final void mo5174e(zzccb zzccbVar) {
        this.f6012p.m14946i(zzccbVar.f36964p);
    }

    @Override // com.daaw.fs4
    public final void zzn() {
        on6 on6Var = this.f6013q;
        nn6 nn6Var = this.f6012p;
        nn6Var.m14954a("action", "loaded");
        on6Var.mo7889a(nn6Var);
    }
}
