package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzccb;
/* loaded from: classes.dex */
public final class co5 implements pt4, fs4, oq4 {
    public final nn6 p;
    public final on6 q;
    public final xz3 r;

    public co5(nn6 nn6Var, on6 on6Var, xz3 xz3Var) {
        this.p = nn6Var;
        this.q = on6Var;
        this.r = xz3Var;
    }

    @Override // com.daaw.pt4
    public final void F(fi6 fi6Var) {
        this.p.h(fi6Var, this.r);
    }

    @Override // com.daaw.oq4
    public final void b(zze zzeVar) {
        nn6 nn6Var = this.p;
        nn6Var.a("action", "ftl");
        nn6Var.a("ftl", String.valueOf(zzeVar.zza));
        nn6Var.a("ed", zzeVar.zzc);
        this.q.a(this.p);
    }

    @Override // com.daaw.pt4
    public final void e(zzccb zzccbVar) {
        this.p.i(zzccbVar.p);
    }

    @Override // com.daaw.fs4
    public final void zzn() {
        on6 on6Var = this.q;
        nn6 nn6Var = this.p;
        nn6Var.a("action", "loaded");
        on6Var.a(nn6Var);
    }
}
