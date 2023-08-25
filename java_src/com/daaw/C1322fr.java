package com.daaw;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.daaw.cp0;
import com.daaw.ib0;
import com.daaw.jk0;
import com.daaw.lb0;
import com.daaw.pb0;
import com.daaw.vv0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
/* renamed from: com.daaw.fr */
/* loaded from: classes.dex */
public final class C1322fr implements pb0, jk0.InterfaceC1834a<vv0<nb0>> {

    /* renamed from: A */
    public lb0 f9803A;

    /* renamed from: B */
    public boolean f9804B;

    /* renamed from: p */
    public final fb0 f9806p;

    /* renamed from: q */
    public final vv0.InterfaceC3379a<nb0> f9807q;

    /* renamed from: r */
    public final int f9808r;

    /* renamed from: u */
    public cp0.C0975a f9811u;

    /* renamed from: v */
    public jk0 f9812v;

    /* renamed from: w */
    public Handler f9813w;

    /* renamed from: x */
    public pb0.InterfaceC2539d f9814x;

    /* renamed from: y */
    public ib0 f9815y;

    /* renamed from: z */
    public ib0.C1674a f9816z;

    /* renamed from: t */
    public final List<pb0.InterfaceC2536a> f9810t = new ArrayList();

    /* renamed from: s */
    public final IdentityHashMap<ib0.C1674a, RunnableC1323a> f9809s = new IdentityHashMap<>();

    /* renamed from: C */
    public long f9805C = -9223372036854775807L;

    /* renamed from: com.daaw.fr$a */
    /* loaded from: classes.dex */
    public final class RunnableC1323a implements jk0.InterfaceC1834a<vv0<nb0>>, Runnable {

        /* renamed from: p */
        public final ib0.C1674a f9817p;

        /* renamed from: q */
        public final jk0 f9818q = new jk0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: r */
        public final vv0<nb0> f9819r;

        /* renamed from: s */
        public lb0 f9820s;

        /* renamed from: t */
        public long f9821t;

        /* renamed from: u */
        public long f9822u;

        /* renamed from: v */
        public long f9823v;

        /* renamed from: w */
        public long f9824w;

        /* renamed from: x */
        public boolean f9825x;

        /* renamed from: y */
        public IOException f9826y;

        public RunnableC1323a(ib0.C1674a c1674a) {
            this.f9817p = c1674a;
            this.f9819r = new vv0<>(C1322fr.this.f9806p.mo22813a(4), iq1.m19491d(C1322fr.this.f9815y.f19774a, c1674a.f13429a), 4, C1322fr.this.f9807q);
        }

        /* renamed from: d */
        public final boolean m22371d() {
            this.f9824w = SystemClock.elapsedRealtime() + 60000;
            return C1322fr.this.f9816z == this.f9817p && !C1322fr.this.m22392F();
        }

        /* renamed from: e */
        public lb0 m22370e() {
            return this.f9820s;
        }

        /* renamed from: f */
        public boolean m22369f() {
            int i;
            if (this.f9820s == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, C1075dd.m24526b(this.f9820s.f17198p));
            lb0 lb0Var = this.f9820s;
            return lb0Var.f17194l || (i = lb0Var.f17185c) == 2 || i == 1 || this.f9821t + max > elapsedRealtime;
        }

        /* renamed from: g */
        public void m22368g() {
            this.f9824w = 0L;
            if (this.f9825x || this.f9818q.m18465g()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f9823v) {
                m22367h();
                return;
            }
            this.f9825x = true;
            C1322fr.this.f9813w.postDelayed(this, this.f9823v - elapsedRealtime);
        }

        /* renamed from: h */
        public final void m22367h() {
            long m18461k = this.f9818q.m18461k(this.f9819r, this, C1322fr.this.f9808r);
            cp0.C0975a c0975a = C1322fr.this.f9811u;
            vv0<nb0> vv0Var = this.f9819r;
            c0975a.m25153o(vv0Var.f30638a, vv0Var.f30639b, m18461k);
        }

        /* renamed from: i */
        public void m22366i() {
            this.f9818q.mo16893a();
            IOException iOException = this.f9826y;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // com.daaw.jk0.InterfaceC1834a
        /* renamed from: j */
        public void mo11472k(vv0<nb0> vv0Var, long j, long j2, boolean z) {
            C1322fr.this.f9811u.m25162f(vv0Var.f30638a, 4, j, j2, vv0Var.m6738c());
        }

        @Override // com.daaw.jk0.InterfaceC1834a
        /* renamed from: l */
        public void mo11469o(vv0<nb0> vv0Var, long j, long j2) {
            nb0 m6737d = vv0Var.m6737d();
            if (!(m6737d instanceof lb0)) {
                this.f9826y = new tv0("Loaded playlist has unexpected type.");
                return;
            }
            m22362n((lb0) m6737d);
            C1322fr.this.f9811u.m25159i(vv0Var.f30638a, 4, j, j2, vv0Var.m6738c());
        }

        @Override // com.daaw.jk0.InterfaceC1834a
        /* renamed from: m */
        public int mo11468r(vv0<nb0> vv0Var, long j, long j2, IOException iOException) {
            boolean z = iOException instanceof tv0;
            C1322fr.this.f9811u.m25156l(vv0Var.f30638a, 4, j, j2, vv0Var.m6738c(), iOException, z);
            boolean m17769c = C1943kf.m17769c(iOException);
            boolean z2 = C1322fr.this.m22390H(this.f9817p, m17769c) || !m17769c;
            if (z) {
                return 3;
            }
            if (m17769c) {
                z2 |= m22371d();
            }
            return z2 ? 0 : 2;
        }

        /* renamed from: n */
        public final void m22362n(lb0 lb0Var) {
            lb0 lb0Var2 = this.f9820s;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f9821t = elapsedRealtime;
            lb0 m22395C = C1322fr.this.m22395C(lb0Var2, lb0Var);
            this.f9820s = m22395C;
            if (m22395C != lb0Var2) {
                this.f9826y = null;
                this.f9822u = elapsedRealtime;
                C1322fr.this.m22386L(this.f9817p, m22395C);
            } else if (!m22395C.f17194l) {
                lb0 lb0Var3 = this.f9820s;
                if (lb0Var.f17190h + lb0Var.f17197o.size() < lb0Var3.f17190h) {
                    this.f9826y = new pb0.C2537b(this.f9817p.f13429a);
                    C1322fr.this.m22390H(this.f9817p, false);
                } else {
                    double m24526b = C1075dd.m24526b(lb0Var3.f17192j);
                    Double.isNaN(m24526b);
                    if (elapsedRealtime - this.f9822u > m24526b * 3.5d) {
                        this.f9826y = new pb0.C2538c(this.f9817p.f13429a);
                        C1322fr.this.m22390H(this.f9817p, true);
                        m22371d();
                    }
                }
            }
            lb0 lb0Var4 = this.f9820s;
            long j = lb0Var4.f17192j;
            if (lb0Var4 == lb0Var2) {
                j /= 2;
            }
            this.f9823v = elapsedRealtime + C1075dd.m24526b(j);
            if (this.f9817p != C1322fr.this.f9816z || this.f9820s.f17194l) {
                return;
            }
            m22368g();
        }

        /* renamed from: p */
        public void m22361p() {
            this.f9818q.m18463i();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9825x = false;
            m22367h();
        }
    }

    public C1322fr(fb0 fb0Var, int i, vv0.InterfaceC3379a<nb0> interfaceC3379a) {
        this.f9806p = fb0Var;
        this.f9808r = i;
        this.f9807q = interfaceC3379a;
    }

    /* renamed from: B */
    public static lb0.C2025a m22396B(lb0 lb0Var, lb0 lb0Var2) {
        int i = (int) (lb0Var2.f17190h - lb0Var.f17190h);
        List<lb0.C2025a> list = lb0Var.f17197o;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* renamed from: A */
    public final void m22397A(List<ib0.C1674a> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ib0.C1674a c1674a = list.get(i);
            this.f9809s.put(c1674a, new RunnableC1323a(c1674a));
        }
    }

    /* renamed from: C */
    public final lb0 m22395C(lb0 lb0Var, lb0 lb0Var2) {
        return !lb0Var2.m17067f(lb0Var) ? lb0Var2.f17194l ? lb0Var.m17069d() : lb0Var : lb0Var2.m17070c(m22393E(lb0Var, lb0Var2), m22394D(lb0Var, lb0Var2));
    }

    /* renamed from: D */
    public final int m22394D(lb0 lb0Var, lb0 lb0Var2) {
        lb0.C2025a m22396B;
        if (lb0Var2.f17188f) {
            return lb0Var2.f17189g;
        }
        lb0 lb0Var3 = this.f9803A;
        int i = lb0Var3 != null ? lb0Var3.f17189g : 0;
        return (lb0Var == null || (m22396B = m22396B(lb0Var, lb0Var2)) == null) ? i : (lb0Var.f17189g + m22396B.f17202s) - lb0Var2.f17197o.get(0).f17202s;
    }

    /* renamed from: E */
    public final long m22393E(lb0 lb0Var, lb0 lb0Var2) {
        if (lb0Var2.f17195m) {
            return lb0Var2.f17187e;
        }
        lb0 lb0Var3 = this.f9803A;
        long j = lb0Var3 != null ? lb0Var3.f17187e : 0L;
        if (lb0Var == null) {
            return j;
        }
        int size = lb0Var.f17197o.size();
        lb0.C2025a m22396B = m22396B(lb0Var, lb0Var2);
        return m22396B != null ? lb0Var.f17187e + m22396B.f17203t : ((long) size) == lb0Var2.f17190h - lb0Var.f17190h ? lb0Var.m17068e() : j;
    }

    /* renamed from: F */
    public final boolean m22392F() {
        List<ib0.C1674a> list = this.f9815y.f13424c;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            RunnableC1323a runnableC1323a = this.f9809s.get(list.get(i));
            if (elapsedRealtime > runnableC1323a.f9824w) {
                this.f9816z = runnableC1323a.f9817p;
                runnableC1323a.m22368g();
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public final void m22391G(ib0.C1674a c1674a) {
        if (c1674a == this.f9816z || !this.f9815y.f13424c.contains(c1674a)) {
            return;
        }
        lb0 lb0Var = this.f9803A;
        if (lb0Var == null || !lb0Var.f17194l) {
            this.f9816z = c1674a;
            this.f9809s.get(c1674a).m22368g();
        }
    }

    /* renamed from: H */
    public final boolean m22390H(ib0.C1674a c1674a, boolean z) {
        int size = this.f9810t.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            z2 |= !this.f9810t.get(i).mo13495d(c1674a, z);
        }
        return z2;
    }

    @Override // com.daaw.jk0.InterfaceC1834a
    /* renamed from: I */
    public void mo11472k(vv0<nb0> vv0Var, long j, long j2, boolean z) {
        this.f9811u.m25162f(vv0Var.f30638a, 4, j, j2, vv0Var.m6738c());
    }

    @Override // com.daaw.jk0.InterfaceC1834a
    /* renamed from: J */
    public void mo11469o(vv0<nb0> vv0Var, long j, long j2) {
        nb0 m6737d = vv0Var.m6737d();
        boolean z = m6737d instanceof lb0;
        ib0 m19988d = z ? ib0.m19988d(m6737d.f19774a) : (ib0) m6737d;
        this.f9815y = m19988d;
        this.f9816z = m19988d.f13424c.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m19988d.f13424c);
        arrayList.addAll(m19988d.f13425d);
        arrayList.addAll(m19988d.f13426e);
        m22397A(arrayList);
        RunnableC1323a runnableC1323a = this.f9809s.get(this.f9816z);
        if (z) {
            runnableC1323a.m22362n((lb0) m6737d);
        } else {
            runnableC1323a.m22368g();
        }
        this.f9811u.m25159i(vv0Var.f30638a, 4, j, j2, vv0Var.m6738c());
    }

    @Override // com.daaw.jk0.InterfaceC1834a
    /* renamed from: K */
    public int mo11468r(vv0<nb0> vv0Var, long j, long j2, IOException iOException) {
        boolean z = iOException instanceof tv0;
        this.f9811u.m25156l(vv0Var.f30638a, 4, j, j2, vv0Var.m6738c(), iOException, z);
        return z ? 3 : 0;
    }

    /* renamed from: L */
    public final void m22386L(ib0.C1674a c1674a, lb0 lb0Var) {
        if (c1674a == this.f9816z) {
            if (this.f9803A == null) {
                this.f9804B = !lb0Var.f17194l;
                this.f9805C = lb0Var.f17187e;
            }
            this.f9803A = lb0Var;
            this.f9814x.mo13493d(lb0Var);
        }
        int size = this.f9810t.size();
        for (int i = 0; i < size; i++) {
            this.f9810t.get(i).mo13494h();
        }
    }

    @Override // com.daaw.pb0
    /* renamed from: a */
    public void mo13507a() {
        this.f9816z = null;
        this.f9803A = null;
        this.f9815y = null;
        this.f9805C = -9223372036854775807L;
        this.f9812v.m18463i();
        this.f9812v = null;
        for (RunnableC1323a runnableC1323a : this.f9809s.values()) {
            runnableC1323a.m22361p();
        }
        this.f9813w.removeCallbacksAndMessages(null);
        this.f9813w = null;
        this.f9809s.clear();
    }

    @Override // com.daaw.pb0
    /* renamed from: b */
    public void mo13506b(Uri uri, cp0.C0975a c0975a, pb0.InterfaceC2539d interfaceC2539d) {
        this.f9813w = new Handler();
        this.f9811u = c0975a;
        this.f9814x = interfaceC2539d;
        vv0 vv0Var = new vv0(this.f9806p.mo22813a(4), uri, 4, this.f9807q);
        C2914s6.m10685f(this.f9812v == null);
        jk0 jk0Var = new jk0("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f9812v = jk0Var;
        c0975a.m25153o(vv0Var.f30638a, vv0Var.f30639b, jk0Var.m18461k(vv0Var, this, this.f9808r));
    }

    @Override // com.daaw.pb0
    /* renamed from: c */
    public void mo13505c(pb0.InterfaceC2536a interfaceC2536a) {
        this.f9810t.remove(interfaceC2536a);
    }

    @Override // com.daaw.pb0
    /* renamed from: d */
    public lb0 mo13504d(ib0.C1674a c1674a) {
        lb0 m22370e = this.f9809s.get(c1674a).m22370e();
        if (m22370e != null) {
            m22391G(c1674a);
        }
        return m22370e;
    }

    @Override // com.daaw.pb0
    /* renamed from: e */
    public void mo13503e(ib0.C1674a c1674a) {
        this.f9809s.get(c1674a).m22368g();
    }

    @Override // com.daaw.pb0
    /* renamed from: f */
    public long mo13502f() {
        return this.f9805C;
    }

    @Override // com.daaw.pb0
    /* renamed from: g */
    public boolean mo13501g() {
        return this.f9804B;
    }

    @Override // com.daaw.pb0
    /* renamed from: h */
    public void mo13500h(ib0.C1674a c1674a) {
        this.f9809s.get(c1674a).m22366i();
    }

    @Override // com.daaw.pb0
    /* renamed from: i */
    public ib0 mo13499i() {
        return this.f9815y;
    }

    @Override // com.daaw.pb0
    /* renamed from: j */
    public void mo13498j() {
        jk0 jk0Var = this.f9812v;
        if (jk0Var != null) {
            jk0Var.mo16893a();
        }
        ib0.C1674a c1674a = this.f9816z;
        if (c1674a != null) {
            mo13500h(c1674a);
        }
    }

    @Override // com.daaw.pb0
    /* renamed from: l */
    public void mo13497l(pb0.InterfaceC2536a interfaceC2536a) {
        this.f9810t.add(interfaceC2536a);
    }

    @Override // com.daaw.pb0
    /* renamed from: m */
    public boolean mo13496m(ib0.C1674a c1674a) {
        return this.f9809s.get(c1674a).m22369f();
    }
}
