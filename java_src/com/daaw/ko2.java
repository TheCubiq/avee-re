package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class ko2 extends no2 {

    /* renamed from: i */
    public final View f16577i;

    public ko2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, View view) {
        super(wm2Var, "JgNevmfyr8lZxnvZfq3r729JgtxbLk039SjEVr1jMI7eztR3nd0tOgO6sMz+FJz+", "ylslQbtrjnaBQeIQLiG5TQpHgACRff6HBxNL0ysPa0Q=", hi2Var, i, 57);
        this.f16577i = view;
    }

    @Override // com.daaw.no2
    /* renamed from: a */
    public final void mo2099a() {
        if (this.f16577i != null) {
            Boolean bool = (Boolean) zzba.zzc().m23658b(g93.f10564U2);
            Boolean bool2 = (Boolean) zzba.zzc().m23658b(g93.f10653c9);
            bn2 bn2Var = new bn2((String) this.f20529f.invoke(null, this.f16577i, this.f20525b.m6004b().getResources().getDisplayMetrics(), bool, bool2));
            dj2 m23443L = ej2.m23443L();
            m23443L.m24348t(bn2Var.f4975a.longValue());
            m23443L.m24346v(bn2Var.f4976b.longValue());
            m23443L.m24345w(bn2Var.f4977c.longValue());
            if (bool2.booleanValue()) {
                m23443L.m24347u(bn2Var.f4979e.longValue());
            }
            if (bool.booleanValue()) {
                m23443L.m24349s(bn2Var.f4978d.longValue());
            }
            this.f20528e.m20775Q((ej2) m23443L.m22315n());
        }
    }
}
