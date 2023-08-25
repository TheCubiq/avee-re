package com.daaw;

import android.content.Context;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class hb5 implements wz7 {

    /* renamed from: a */
    public final m08 f12359a;

    /* renamed from: b */
    public final m08 f12360b;

    /* renamed from: c */
    public final m08 f12361c;

    /* renamed from: d */
    public final m08 f12362d;

    /* renamed from: e */
    public final m08 f12363e;

    public hb5(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5) {
        this.f12359a = m08Var;
        this.f12360b = m08Var2;
        this.f12361c = m08Var3;
        this.f12362d = m08Var4;
        this.f12363e = m08Var5;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context m20923a = ((h94) this.f12359a).m20923a();
        final String zzb = ((yi5) this.f12360b).zzb();
        zzchu m8405a = ((u94) this.f12361c).m8405a();
        final k43 k43Var = (k43) this.f12362d.zzb();
        final String str = (String) this.f12363e.zzb();
        x33 x33Var = new x33(new g43(m20923a));
        j73 m17997L = k73.m17997L();
        m17997L.m18765s(m8405a.f36994q);
        m17997L.m18763u(m8405a.f36995r);
        m17997L.m18764t(true != m8405a.f36996s ? 2 : 0);
        final k73 k73Var = (k73) m17997L.m22315n();
        x33Var.m5590b(new w33() { // from class: com.daaw.gb5
            @Override // com.daaw.w33
            /* renamed from: a */
            public final void mo2497a(u53 u53Var) {
                k43 k43Var2 = k43.this;
                String str2 = zzb;
                k73 k73Var2 = k73Var;
                String str3 = str;
                l43 l43Var = (l43) u53Var.m8575s().m16587k();
                l43Var.m17158s(k43Var2);
                u53Var.m8571w(l43Var);
                m53 m53Var = (m53) u53Var.m8574t().m16587k();
                m53Var.m16202s(str2);
                m53Var.m16201t(k73Var2);
                u53Var.m8569y(m53Var);
                u53Var.m8568z(str3);
            }
        });
        return x33Var;
    }
}
