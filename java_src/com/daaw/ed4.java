package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
/* loaded from: classes.dex */
public final class ed4 implements tf6 {

    /* renamed from: a */
    public final bb4 f8378a;

    /* renamed from: b */
    public final ed4 f8379b = this;

    /* renamed from: c */
    public final m08 f8380c;

    /* renamed from: d */
    public final m08 f8381d;

    /* renamed from: e */
    public final m08 f8382e;

    /* renamed from: f */
    public final m08 f8383f;

    /* renamed from: g */
    public final m08 f8384g;

    /* renamed from: h */
    public final m08 f8385h;

    /* renamed from: i */
    public final m08 f8386i;

    public /* synthetic */ ed4(bb4 bb4Var, Context context, String str, zzq zzqVar, dd4 dd4Var) {
        m08 m08Var;
        m08 m08Var2;
        m08 m08Var3;
        m08 m08Var4;
        m08 m08Var5;
        this.f8378a = bb4Var;
        wz7 m4374a = xz7.m4374a(context);
        this.f8380c = m4374a;
        wz7 m4374a2 = xz7.m4374a(zzqVar);
        this.f8381d = m4374a2;
        wz7 m4374a3 = xz7.m4374a(str);
        this.f8382e = m4374a3;
        m08Var = bb4Var.f4660p;
        m08 m6638b = vz7.m6638b(new bz5(m08Var));
        this.f8383f = m6638b;
        m08Var2 = bb4Var.f4605E0;
        m08 m6638b2 = vz7.m6638b(new ug6(m08Var2));
        this.f8384g = m6638b2;
        m08Var3 = bb4Var.f4662q;
        m08Var4 = bb4Var.f4625U;
        m08 m6638b3 = vz7.m6638b(new rf6(m4374a, m08Var3, m08Var4, m6638b, m6638b2, ti6.m9085a()));
        this.f8385h = m6638b3;
        m08Var5 = bb4Var.f4648j;
        this.f8386i = vz7.m6638b(new jz5(m4374a, m4374a2, m4374a3, m6638b3, m6638b, m6638b2, m08Var5));
    }

    @Override // com.daaw.tf6
    public final iz5 zza() {
        return (iz5) this.f8386i.zzb();
    }
}
