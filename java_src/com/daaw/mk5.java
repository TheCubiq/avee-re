package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzccb;
import java.util.Map;
/* loaded from: classes.dex */
public final class mk5 implements ok5 {
    public final Map a;
    public final g77 b;
    public final nt4 c;

    public mk5(Map map, g77 g77Var, nt4 nt4Var) {
        this.a = map;
        this.b = g77Var;
        this.c = nt4Var;
    }

    @Override // com.daaw.ok5
    public final f77 a(final zzccb zzccbVar) {
        this.c.e(zzccbVar);
        f77 h = s67.h(new gi5(3));
        for (String str : ((String) zzba.zzc().b(g93.t7)).split(",")) {
            final m08 m08Var = (m08) this.a.get(str.trim());
            if (m08Var != null) {
                h = s67.g(h, gi5.class, new w57() { // from class: com.daaw.kk5
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        m08 m08Var2 = m08.this;
                        gi5 gi5Var = (gi5) obj;
                        return ((ok5) m08Var2.zzb()).a(zzccbVar);
                    }
                }, this.b);
            }
        }
        s67.r(h, new lk5(this), z04.f);
        return h;
    }
}
