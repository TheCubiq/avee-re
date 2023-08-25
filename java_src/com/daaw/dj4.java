package com.daaw;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class dj4 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;
    public final m08 e;
    public final m08 f;
    public final m08 g;
    public final m08 h;
    public final m08 i;
    public final m08 j;

    public dj4(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6, m08 m08Var7, m08 m08Var8, m08 m08Var9, m08 m08Var10) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
        this.e = m08Var5;
        this.f = m08Var6;
        this.g = m08Var7;
        this.h = m08Var8;
        this.i = m08Var9;
        this.j = m08Var10;
    }

    public static cj4 b(yl4 yl4Var, Context context, uh6 uh6Var, View view, a74 a74Var, xl4 xl4Var, u35 u35Var, xy4 xy4Var, qz7 qz7Var, Executor executor) {
        return new cj4(yl4Var, context, uh6Var, view, a74Var, xl4Var, u35Var, xy4Var, qz7Var, executor);
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final cj4 zzb() {
        return new cj4(((eo4) this.a).zzb(), (Context) this.b.zzb(), ((jj4) this.c).a(), ((ij4) this.d).a(), ((xj4) this.e).a(), ((kj4) this.f).a(), ((o15) this.g).a(), (xy4) this.h.zzb(), vz7.a(this.i), (Executor) this.j.zzb());
    }
}
