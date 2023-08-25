package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzccb;
import java.util.Map;
/* loaded from: classes.dex */
public final class mk5 implements ok5 {

    /* renamed from: a */
    public final Map f18945a;

    /* renamed from: b */
    public final g77 f18946b;

    /* renamed from: c */
    public final nt4 f18947c;

    public mk5(Map map, g77 g77Var, nt4 nt4Var) {
        this.f18945a = map;
        this.f18946b = g77Var;
        this.f18947c = nt4Var;
    }

    @Override // com.daaw.ok5
    /* renamed from: a */
    public final f77 mo14208a(final zzccb zzccbVar) {
        this.f18947c.mo5174e(zzccbVar);
        f77 m10635h = s67.m10635h(new gi5(3));
        for (String str : ((String) zzba.zzc().m23658b(g93.f10838t7)).split(",")) {
            final m08 m08Var = (m08) this.f18945a.get(str.trim());
            if (m08Var != null) {
                m10635h = s67.m10636g(m10635h, gi5.class, new w57() { // from class: com.daaw.kk5
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        m08 m08Var2 = m08.this;
                        gi5 gi5Var = (gi5) obj;
                        return ((ok5) m08Var2.zzb()).mo14208a(zzccbVar);
                    }
                }, this.f18946b);
            }
        }
        s67.m10625r(m10635h, new lk5(this), z04.f34310f);
        return m10635h;
    }
}
