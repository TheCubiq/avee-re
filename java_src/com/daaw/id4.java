package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class id4 implements nh6 {
    public final bb4 a;
    public final id4 b = this;
    public final m08 c;
    public final m08 d;
    public final m08 e;
    public final m08 f;
    public final m08 g;
    public final m08 h;
    public final m08 i;
    public final m08 j;

    public /* synthetic */ id4(bb4 bb4Var, Context context, String str, hd4 hd4Var) {
        m08 m08Var;
        m08 m08Var2;
        m08 m08Var3;
        m08 m08Var4;
        m08 m08Var5;
        m08 m08Var6;
        this.a = bb4Var;
        wz7 a = xz7.a(context);
        this.c = a;
        m08Var = bb4Var.E0;
        m08Var2 = bb4Var.F0;
        hf6 hf6Var = new hf6(a, m08Var, m08Var2);
        this.d = hf6Var;
        m08Var3 = bb4Var.E0;
        m08 b = vz7.b(new ug6(m08Var3));
        this.e = b;
        m08 b2 = vz7.b(oi6.a());
        this.f = b2;
        m08Var4 = bb4Var.q;
        m08Var5 = bb4Var.U;
        m08 b3 = vz7.b(new eh6(a, m08Var4, m08Var5, hf6Var, b, ti6.a(), b2));
        this.g = b3;
        this.h = vz7.b(new rh6(b3, b, b2));
        wz7 b4 = xz7.b(str);
        this.i = b4;
        m08Var6 = bb4Var.j;
        this.j = vz7.b(new lh6(b4, b3, a, b, b2, m08Var6));
    }

    @Override // com.daaw.nh6
    public final kh6 zza() {
        return (kh6) this.j.zzb();
    }

    @Override // com.daaw.nh6
    public final qh6 zzb() {
        return (qh6) this.h.zzb();
    }
}
