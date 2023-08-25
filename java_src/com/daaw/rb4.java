package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class rb4 implements dc6 {
    public final bb4 a;
    public final rb4 b = this;
    public final m08 c;
    public final m08 d;
    public final m08 e;
    public final m08 f;
    public final m08 g;
    public final m08 h;
    public final m08 i;
    public final m08 j;
    public final m08 k;

    public /* synthetic */ rb4(bb4 bb4Var, Context context, String str, qb4 qb4Var) {
        m08 m08Var;
        m08 m08Var2;
        m08 m08Var3;
        m08 m08Var4;
        m08 m08Var5;
        m08 m08Var6;
        m08 m08Var7;
        m08 m08Var8;
        m08 m08Var9;
        m08 m08Var10;
        m08 m08Var11;
        m08 m08Var12;
        m08 m08Var13;
        m08 m08Var14;
        m08 m08Var15;
        this.a = bb4Var;
        wz7 a = xz7.a(context);
        this.c = a;
        wz7 a2 = xz7.a(str);
        this.d = a2;
        m08Var = bb4Var.E0;
        m08Var2 = bb4Var.F0;
        gf6 gf6Var = new gf6(a, m08Var, m08Var2);
        this.e = gf6Var;
        m08Var3 = bb4Var.E0;
        m08 b = vz7.b(new ed6(m08Var3));
        this.f = b;
        m08Var4 = bb4Var.q;
        m08Var5 = bb4Var.U;
        ti6 a3 = ti6.a();
        m08Var6 = bb4Var.j;
        m08 b2 = vz7.b(new vb6(a, m08Var4, m08Var5, gf6Var, b, a3, m08Var6));
        this.g = b2;
        m08Var7 = bb4Var.U;
        m08Var8 = bb4Var.j;
        this.h = vz7.b(new bc6(m08Var7, a, a2, b2, b, m08Var8));
        m08Var9 = bb4Var.E0;
        m08Var10 = bb4Var.F0;
        ff6 ff6Var = new ff6(a, m08Var9, m08Var10);
        this.i = ff6Var;
        m08Var11 = bb4Var.q;
        m08Var12 = bb4Var.U;
        ti6 a4 = ti6.a();
        m08Var13 = bb4Var.j;
        m08 b3 = vz7.b(new gd6(a, m08Var11, m08Var12, ff6Var, b, a4, m08Var13));
        this.j = b3;
        m08Var14 = bb4Var.U;
        m08Var15 = bb4Var.j;
        this.k = vz7.b(new md6(m08Var14, a, a2, b3, b, m08Var15));
    }

    @Override // com.daaw.dc6
    public final ac6 zza() {
        return (ac6) this.h.zzb();
    }

    @Override // com.daaw.dc6
    public final ld6 zzb() {
        return (ld6) this.k.zzb();
    }
}
