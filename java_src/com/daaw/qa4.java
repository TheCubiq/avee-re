package com.daaw;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class qa4 extends d96 {

    /* renamed from: a */
    public final ma6 f23811a;

    /* renamed from: b */
    public final bb4 f23812b;

    /* renamed from: c */
    public final qa4 f23813c = this;

    /* renamed from: d */
    public final m08 f23814d;

    /* renamed from: e */
    public final m08 f23815e;

    /* renamed from: f */
    public final m08 f23816f;

    /* renamed from: g */
    public final m08 f23817g;

    /* renamed from: h */
    public final m08 f23818h;

    /* renamed from: i */
    public final m08 f23819i;

    /* renamed from: j */
    public final m08 f23820j;

    /* renamed from: k */
    public final m08 f23821k;

    /* renamed from: l */
    public final m08 f23822l;

    /* renamed from: m */
    public final m08 f23823m;

    /* renamed from: n */
    public final m08 f23824n;

    public /* synthetic */ qa4(bb4 bb4Var, ma6 ma6Var, pa4 pa4Var) {
        m08 m08Var;
        m08 m08Var2;
        m08 m08Var3;
        this.f23812b = bb4Var;
        this.f23811a = ma6Var;
        ra6 ra6Var = new ra6(ma6Var);
        this.f23814d = ra6Var;
        m08 m6638b = vz7.m6638b(fc5.m22802a());
        this.f23815e = m6638b;
        m08 m6638b2 = vz7.m6638b(dc5.m24528a());
        this.f23816f = m6638b2;
        m08 m6638b3 = vz7.m6638b(hc5.m20844a());
        this.f23817g = m6638b3;
        m08 m6638b4 = vz7.m6638b(jc5.m18605a());
        this.f23818h = m6638b4;
        zz7 m27754b = a08.m27754b(4);
        m27754b.m1751b(ym6.GMS_SIGNALS, m6638b);
        m27754b.m1751b(ym6.BUILD_URL, m6638b2);
        m27754b.m1751b(ym6.HTTP, m6638b3);
        m27754b.m1751b(ym6.PRE_PROCESS, m6638b4);
        a08 m1750c = m27754b.m1750c();
        this.f23819i = m1750c;
        m08Var = bb4Var.f4646i;
        m08 m6638b5 = vz7.m6638b(new kc5(ra6Var, m08Var, wl6.m6012a(), m1750c));
        this.f23820j = m6638b5;
        g08 m18087a = k08.m18087a(0, 1);
        m18087a.m22105a(m6638b5);
        k08 m22103c = m18087a.m22103c();
        this.f23821k = m22103c;
        hn6 hn6Var = new hn6(m22103c);
        this.f23822l = hn6Var;
        wl6 m6012a = wl6.m6012a();
        m08Var2 = bb4Var.f4658o;
        this.f23823m = vz7.m6638b(new gn6(m6012a, m08Var2, hn6Var));
        m08Var3 = bb4Var.f4612I;
        this.f23824n = vz7.m6638b(new uo6(m08Var3));
    }

    @Override // com.daaw.d96
    /* renamed from: a */
    public final l76 mo12651a() {
        e94 e94Var;
        m08 m08Var;
        m08 m08Var2;
        e94Var = this.f23812b.f4632b;
        Context m23653a = e94Var.m23653a();
        e08.m23801b(m23653a);
        ez3 ez3Var = new ez3();
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        ga6 ga6Var = new ga6(ez3Var, g77Var, qa6.m12649a(this.f23811a), null);
        e08.m23801b(g77Var);
        m08Var = this.f23812b.f4658o;
        to6 to6Var = (to6) this.f23824n.zzb();
        m08Var2 = this.f23812b.f4630Z;
        kd5 kd5Var = (kd5) m08Var2.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new j56(ga6Var, 0L, (ScheduledExecutorService) m08Var.zzb()));
        return new l76(m23653a, g77Var, hashSet, to6Var, kd5Var);
    }

    @Override // com.daaw.d96
    /* renamed from: b */
    public final en6 mo12650b() {
        return (en6) this.f23823m.zzb();
    }
}
