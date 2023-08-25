package com.daaw;

import android.content.Context;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class hb5 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;
    public final m08 e;

    public hb5(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
        this.e = m08Var5;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context a = ((h94) this.a).a();
        final String zzb = ((yi5) this.b).zzb();
        zzchu a2 = ((u94) this.c).a();
        final k43 k43Var = (k43) this.d.zzb();
        final String str = (String) this.e.zzb();
        x33 x33Var = new x33(new g43(a));
        j73 L = k73.L();
        L.s(a2.q);
        L.u(a2.r);
        L.t(true != a2.s ? 2 : 0);
        final k73 k73Var = (k73) L.n();
        x33Var.b(new w33() { // from class: com.daaw.gb5
            @Override // com.daaw.w33
            public final void a(u53 u53Var) {
                k43 k43Var2 = k43.this;
                String str2 = zzb;
                k73 k73Var2 = k73Var;
                String str3 = str;
                l43 l43Var = (l43) u53Var.s().k();
                l43Var.s(k43Var2);
                u53Var.w(l43Var);
                m53 m53Var = (m53) u53Var.t().k();
                m53Var.s(str2);
                m53Var.t(k73Var2);
                u53Var.y(m53Var);
                u53Var.z(str3);
            }
        });
        return x33Var;
    }
}
