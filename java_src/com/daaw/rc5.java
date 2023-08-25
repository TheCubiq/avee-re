package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzccb;
/* loaded from: classes.dex */
public final class rc5 implements pt4, fs4, oq4 {
    public final fd5 p;
    public final pd5 q;

    public rc5(fd5 fd5Var, pd5 pd5Var) {
        this.p = fd5Var;
        this.q = pd5Var;
    }

    @Override // com.daaw.pt4
    public final void F(fi6 fi6Var) {
        this.p.b(fi6Var);
    }

    @Override // com.daaw.oq4
    public final void b(zze zzeVar) {
        this.p.a().put("action", "ftl");
        this.p.a().put("ftl", String.valueOf(zzeVar.zza));
        this.p.a().put("ed", zzeVar.zzc);
        this.q.e(this.p.a());
    }

    @Override // com.daaw.pt4
    public final void e(zzccb zzccbVar) {
        this.p.c(zzccbVar.p);
    }

    @Override // com.daaw.fs4
    public final void zzn() {
        this.p.a().put("action", "loaded");
        this.q.e(this.p.a());
    }
}
