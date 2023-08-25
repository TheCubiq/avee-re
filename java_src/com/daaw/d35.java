package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
/* loaded from: classes.dex */
public final class d35 implements q03 {
    public final /* synthetic */ String p;
    public final /* synthetic */ e35 q;

    public d35(e35 e35Var, String str) {
        this.q = e35Var;
        this.p = str;
    }

    @Override // com.daaw.q03
    public final void e0(p03 p03Var) {
        Map map;
        k55 k55Var;
        k55 k55Var2;
        k55 k55Var3;
        k55 k55Var4;
        Map map2;
        k55 k55Var5;
        k55 k55Var6;
        k55 k55Var7;
        if (!((Boolean) zzba.zzc().b(g93.z1)).booleanValue()) {
            if (p03Var.j) {
                map = this.q.D;
                map.put(this.p, Boolean.TRUE);
                e35 e35Var = this.q;
                k55Var = e35Var.t;
                View zzf = k55Var.zzf();
                k55Var2 = this.q.t;
                Map zzl = k55Var2.zzl();
                k55Var3 = this.q.t;
                e35Var.X(zzf, zzl, k55Var3.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (p03Var.j) {
                e35 e35Var2 = this.q;
                k55Var4 = e35Var2.t;
                if (k55Var4 == null) {
                    return;
                }
                map2 = e35Var2.D;
                map2.put(this.p, Boolean.TRUE);
                e35 e35Var3 = this.q;
                k55Var5 = e35Var3.t;
                View zzf2 = k55Var5.zzf();
                k55Var6 = this.q.t;
                Map zzl2 = k55Var6.zzl();
                k55Var7 = this.q.t;
                e35Var3.X(zzf2, zzl2, k55Var7.zzm(), true);
            }
        }
    }
}
