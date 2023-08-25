package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
/* loaded from: classes.dex */
public final class d35 implements q03 {

    /* renamed from: p */
    public final /* synthetic */ String f6455p;

    /* renamed from: q */
    public final /* synthetic */ e35 f6456q;

    public d35(e35 e35Var, String str) {
        this.f6456q = e35Var;
        this.f6455p = str;
    }

    @Override // com.daaw.q03
    /* renamed from: e0 */
    public final void mo6420e0(p03 p03Var) {
        Map map;
        k55 k55Var;
        k55 k55Var2;
        k55 k55Var3;
        k55 k55Var4;
        Map map2;
        k55 k55Var5;
        k55 k55Var6;
        k55 k55Var7;
        if (!((Boolean) zzba.zzc().m23658b(g93.f10898z1)).booleanValue()) {
            if (p03Var.f22185j) {
                map = this.f6456q.f8082D;
                map.put(this.f6455p, Boolean.TRUE);
                e35 e35Var = this.f6456q;
                k55Var = e35Var.f8096t;
                View zzf = k55Var.zzf();
                k55Var2 = this.f6456q.f8096t;
                Map zzl = k55Var2.zzl();
                k55Var3 = this.f6456q.f8096t;
                e35Var.m23755X(zzf, zzl, k55Var3.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (p03Var.f22185j) {
                e35 e35Var2 = this.f6456q;
                k55Var4 = e35Var2.f8096t;
                if (k55Var4 == null) {
                    return;
                }
                map2 = e35Var2.f8082D;
                map2.put(this.f6455p, Boolean.TRUE);
                e35 e35Var3 = this.f6456q;
                k55Var5 = e35Var3.f8096t;
                View zzf2 = k55Var5.zzf();
                k55Var6 = this.f6456q.f8096t;
                Map zzl2 = k55Var6.zzl();
                k55Var7 = this.f6456q.f8096t;
                e35Var3.m23755X(zzf2, zzl2, k55Var7.zzm(), true);
            }
        }
    }
}
