package com.daaw;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class qa4 extends d96 {
    public final ma6 a;
    public final bb4 b;
    public final qa4 c = this;
    public final m08 d;
    public final m08 e;
    public final m08 f;
    public final m08 g;
    public final m08 h;
    public final m08 i;
    public final m08 j;
    public final m08 k;
    public final m08 l;
    public final m08 m;
    public final m08 n;

    public /* synthetic */ qa4(bb4 bb4Var, ma6 ma6Var, pa4 pa4Var) {
        m08 m08Var;
        m08 m08Var2;
        m08 m08Var3;
        this.b = bb4Var;
        this.a = ma6Var;
        ra6 ra6Var = new ra6(ma6Var);
        this.d = ra6Var;
        m08 b = vz7.b(fc5.a());
        this.e = b;
        m08 b2 = vz7.b(dc5.a());
        this.f = b2;
        m08 b3 = vz7.b(hc5.a());
        this.g = b3;
        m08 b4 = vz7.b(jc5.a());
        this.h = b4;
        zz7 b5 = a08.b(4);
        b5.b(ym6.GMS_SIGNALS, b);
        b5.b(ym6.BUILD_URL, b2);
        b5.b(ym6.HTTP, b3);
        b5.b(ym6.PRE_PROCESS, b4);
        a08 c = b5.c();
        this.i = c;
        m08Var = bb4Var.i;
        m08 b6 = vz7.b(new kc5(ra6Var, m08Var, wl6.a(), c));
        this.j = b6;
        g08 a = k08.a(0, 1);
        a.a(b6);
        k08 c2 = a.c();
        this.k = c2;
        hn6 hn6Var = new hn6(c2);
        this.l = hn6Var;
        wl6 a2 = wl6.a();
        m08Var2 = bb4Var.o;
        this.m = vz7.b(new gn6(a2, m08Var2, hn6Var));
        m08Var3 = bb4Var.I;
        this.n = vz7.b(new uo6(m08Var3));
    }

    @Override // com.daaw.d96
    public final l76 a() {
        e94 e94Var;
        m08 m08Var;
        m08 m08Var2;
        e94Var = this.b.b;
        Context a = e94Var.a();
        e08.b(a);
        ez3 ez3Var = new ez3();
        g77 g77Var = z04.a;
        e08.b(g77Var);
        ga6 ga6Var = new ga6(ez3Var, g77Var, qa6.a(this.a), null);
        e08.b(g77Var);
        m08Var = this.b.o;
        to6 to6Var = (to6) this.n.zzb();
        m08Var2 = this.b.Z;
        kd5 kd5Var = (kd5) m08Var2.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new j56(ga6Var, 0L, (ScheduledExecutorService) m08Var.zzb()));
        return new l76(a, g77Var, hashSet, to6Var, kd5Var);
    }

    @Override // com.daaw.d96
    public final en6 b() {
        return (en6) this.m.zzb();
    }
}
