package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class id4 implements nh6 {

    /* renamed from: a */
    public final bb4 f13517a;

    /* renamed from: b */
    public final id4 f13518b = this;

    /* renamed from: c */
    public final m08 f13519c;

    /* renamed from: d */
    public final m08 f13520d;

    /* renamed from: e */
    public final m08 f13521e;

    /* renamed from: f */
    public final m08 f13522f;

    /* renamed from: g */
    public final m08 f13523g;

    /* renamed from: h */
    public final m08 f13524h;

    /* renamed from: i */
    public final m08 f13525i;

    /* renamed from: j */
    public final m08 f13526j;

    public /* synthetic */ id4(bb4 bb4Var, Context context, String str, hd4 hd4Var) {
        m08 m08Var;
        m08 m08Var2;
        m08 m08Var3;
        m08 m08Var4;
        m08 m08Var5;
        m08 m08Var6;
        this.f13517a = bb4Var;
        wz7 m4374a = xz7.m4374a(context);
        this.f13519c = m4374a;
        m08Var = bb4Var.f4605E0;
        m08Var2 = bb4Var.f4607F0;
        hf6 hf6Var = new hf6(m4374a, m08Var, m08Var2);
        this.f13520d = hf6Var;
        m08Var3 = bb4Var.f4605E0;
        m08 m6638b = vz7.m6638b(new ug6(m08Var3));
        this.f13521e = m6638b;
        m08 m6638b2 = vz7.m6638b(oi6.m14266a());
        this.f13522f = m6638b2;
        m08Var4 = bb4Var.f4662q;
        m08Var5 = bb4Var.f4625U;
        m08 m6638b3 = vz7.m6638b(new eh6(m4374a, m08Var4, m08Var5, hf6Var, m6638b, ti6.m9085a(), m6638b2));
        this.f13523g = m6638b3;
        this.f13524h = vz7.m6638b(new rh6(m6638b3, m6638b, m6638b2));
        wz7 m4373b = xz7.m4373b(str);
        this.f13525i = m4373b;
        m08Var6 = bb4Var.f4648j;
        this.f13526j = vz7.m6638b(new lh6(m4373b, m6638b3, m4374a, m6638b, m6638b2, m08Var6));
    }

    @Override // com.daaw.nh6
    public final kh6 zza() {
        return (kh6) this.f13526j.zzb();
    }

    @Override // com.daaw.nh6
    public final qh6 zzb() {
        return (qh6) this.f13524h.zzb();
    }
}
