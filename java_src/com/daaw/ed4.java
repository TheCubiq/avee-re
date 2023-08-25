package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
/* loaded from: classes.dex */
public final class ed4 implements tf6 {
    public final bb4 a;
    public final ed4 b = this;
    public final m08 c;
    public final m08 d;
    public final m08 e;
    public final m08 f;
    public final m08 g;
    public final m08 h;
    public final m08 i;

    public /* synthetic */ ed4(bb4 bb4Var, Context context, String str, zzq zzqVar, dd4 dd4Var) {
        m08 m08Var;
        m08 m08Var2;
        m08 m08Var3;
        m08 m08Var4;
        m08 m08Var5;
        this.a = bb4Var;
        wz7 a = xz7.a(context);
        this.c = a;
        wz7 a2 = xz7.a(zzqVar);
        this.d = a2;
        wz7 a3 = xz7.a(str);
        this.e = a3;
        m08Var = bb4Var.p;
        m08 b = vz7.b(new bz5(m08Var));
        this.f = b;
        m08Var2 = bb4Var.E0;
        m08 b2 = vz7.b(new ug6(m08Var2));
        this.g = b2;
        m08Var3 = bb4Var.q;
        m08Var4 = bb4Var.U;
        m08 b3 = vz7.b(new rf6(a, m08Var3, m08Var4, b, b2, ti6.a()));
        this.h = b3;
        m08Var5 = bb4Var.j;
        this.i = vz7.b(new jz5(a, a2, a3, b3, b, b2, m08Var5));
    }

    @Override // com.daaw.tf6
    public final iz5 zza() {
        return (iz5) this.i.zzb();
    }
}
