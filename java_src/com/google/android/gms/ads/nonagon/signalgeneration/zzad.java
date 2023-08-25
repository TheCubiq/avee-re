package com.google.android.gms.ads.nonagon.signalgeneration;

import com.daaw.b94;
import com.daaw.e08;
import com.daaw.g77;
import com.daaw.h94;
import com.daaw.m08;
import com.daaw.op6;
import com.daaw.pd5;
import com.daaw.pj6;
import com.daaw.sl2;
import com.daaw.u94;
import com.daaw.wz7;
import com.daaw.z04;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class zzad implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;
    public final m08 e;
    public final m08 f;
    public final m08 g;
    public final m08 h;
    public final m08 i;

    public zzad(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4, m08 m08Var5, m08 m08Var6, m08 m08Var7, m08 m08Var8, m08 m08Var9) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
        this.e = m08Var5;
        this.f = m08Var6;
        this.g = m08Var7;
        this.h = m08Var8;
        this.i = m08Var9;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.a;
        e08.b(g77Var);
        return new zzac((b94) this.a.zzb(), ((h94) this.b).a(), (sl2) this.c.zzb(), (pj6) this.d.zzb(), g77Var, (ScheduledExecutorService) this.f.zzb(), (pd5) this.g.zzb(), (op6) this.h.zzb(), ((u94) this.i).a());
    }
}
