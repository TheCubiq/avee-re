package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class bs5 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;
    public final m08 e;
    public final m08 f;

    public bs5(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
        this.e = m08Var5;
        this.f = m08Var6;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final as5 zzb() {
        return new as5((zj4) this.a.zzb(), (Context) this.b.zzb(), (Executor) this.c.zzb(), (ia5) this.d.zzb(), ((cq4) this.e).a(), (ey6) this.f.zzb());
    }
}
