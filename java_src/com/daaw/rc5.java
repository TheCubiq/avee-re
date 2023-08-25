package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzccb;
/* loaded from: classes.dex */
public final class rc5 implements pt4, fs4, oq4 {

    /* renamed from: p */
    public final fd5 f25140p;

    /* renamed from: q */
    public final pd5 f25141q;

    public rc5(fd5 fd5Var, pd5 pd5Var) {
        this.f25140p = fd5Var;
        this.f25141q = pd5Var;
    }

    @Override // com.daaw.pt4
    /* renamed from: F */
    public final void mo5181F(fi6 fi6Var) {
        this.f25140p.m22772b(fi6Var);
    }

    @Override // com.daaw.oq4
    /* renamed from: b */
    public final void mo2194b(zze zzeVar) {
        this.f25140p.m22773a().put("action", "ftl");
        this.f25140p.m22773a().put("ftl", String.valueOf(zzeVar.zza));
        this.f25140p.m22773a().put("ed", zzeVar.zzc);
        this.f25141q.m11390e(this.f25140p.m22773a());
    }

    @Override // com.daaw.pt4
    /* renamed from: e */
    public final void mo5174e(zzccb zzccbVar) {
        this.f25140p.m22771c(zzccbVar.f36964p);
    }

    @Override // com.daaw.fs4
    public final void zzn() {
        this.f25140p.m22773a().put("action", "loaded");
        this.f25141q.m11390e(this.f25140p.m22773a());
    }
}
