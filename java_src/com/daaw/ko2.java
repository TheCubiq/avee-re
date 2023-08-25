package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class ko2 extends no2 {
    public final View i;

    public ko2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, View view) {
        super(wm2Var, "JgNevmfyr8lZxnvZfq3r729JgtxbLk039SjEVr1jMI7eztR3nd0tOgO6sMz+FJz+", "ylslQbtrjnaBQeIQLiG5TQpHgACRff6HBxNL0ysPa0Q=", hi2Var, i, 57);
        this.i = view;
    }

    @Override // com.daaw.no2
    public final void a() {
        if (this.i != null) {
            Boolean bool = (Boolean) zzba.zzc().b(g93.U2);
            Boolean bool2 = (Boolean) zzba.zzc().b(g93.c9);
            bn2 bn2Var = new bn2((String) this.f.invoke(null, this.i, this.b.b().getResources().getDisplayMetrics(), bool, bool2));
            dj2 L = ej2.L();
            L.t(bn2Var.a.longValue());
            L.v(bn2Var.b.longValue());
            L.w(bn2Var.c.longValue());
            if (bool2.booleanValue()) {
                L.u(bn2Var.e.longValue());
            }
            if (bool.booleanValue()) {
                L.s(bn2Var.d.longValue());
            }
            this.e.Q((ej2) L.n());
        }
    }
}
