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
/* loaded from: classes.dex */
public final class fr implements pb0, jk0.a<vv0<nb0>> {
    public lb0 A;
    public boolean B;
    public final fb0 p;
    public final vv0.a<nb0> q;
    public final int r;
    public cp0.a u;
    public jk0 v;
    public Handler w;
    public pb0.d x;
    public ib0 y;
    public ib0.a z;
    public final List<pb0.a> t = new ArrayList();
    public final IdentityHashMap<ib0.a, a> s = new IdentityHashMap<>();
    public long C = -9223372036854775807L;

    /* loaded from: classes.dex */
    public final class a implements jk0.a<vv0<nb0>>, Runnable {
        public final ib0.a p;
        public final jk0 q = new jk0("DefaultHlsPlaylistTracker:MediaPlaylist");
        public final vv0<nb0> r;
        public lb0 s;
        public long t;
        public long u;
        public long v;
        public long w;
        public boolean x;
        public IOException y;

        public a(ib0.a aVar) {
            this.p = aVar;
            this.r = new vv0<>(fr.this.p.a(4), iq1.d(fr.this.y.a, aVar.a), 4, fr.this.q);
        }

        public final boolean d() {
            this.w = SystemClock.elapsedRealtime() + 60000;
            return fr.this.z == this.p && !fr.this.F();
        }

        public lb0 e() {
            return this.s;
        }

        public boolean f() {
            int i;
            if (this.s == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, dd.b(this.s.p));
            lb0 lb0Var = this.s;
            return lb0Var.l || (i = lb0Var.c) == 2 || i == 1 || this.t + max > elapsedRealtime;
        }

        public void g() {
            this.w = 0L;
            if (this.x || this.q.g()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.v) {
                h();
                return;
            }
            this.x = true;
            fr.this.w.postDelayed(this, this.v - elapsedRealtime);
        }

        public final void h() {
            long k = this.q.k(this.r, this, fr.this.r);
            cp0.a aVar = fr.this.u;
            vv0<nb0> vv0Var = this.r;
            aVar.o(vv0Var.a, vv0Var.b, k);
        }

        public void i() {
            this.q.a();
            IOException iOException = this.y;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // com.daaw.jk0.a
        /* renamed from: j */
        public void k(vv0<nb0> vv0Var, long j, long j2, boolean z) {
            fr.this.u.f(vv0Var.a, 4, j, j2, vv0Var.c());
        }

        @Override // com.daaw.jk0.a
        /* renamed from: l */
        public void o(vv0<nb0> vv0Var, long j, long j2) {
            nb0 d = vv0Var.d();
            if (!(d instanceof lb0)) {
                this.y = new tv0("Loaded playlist has unexpected type.");
                return;
            }
            n((lb0) d);
            fr.this.u.i(vv0Var.a, 4, j, j2, vv0Var.c());
        }

        @Override // com.daaw.jk0.a
        /* renamed from: m */
        public int r(vv0<nb0> vv0Var, long j, long j2, IOException iOException) {
            boolean z = iOException instanceof tv0;
            fr.this.u.l(vv0Var.a, 4, j, j2, vv0Var.c(), iOException, z);
            boolean c = kf.c(iOException);
            boolean z2 = fr.this.H(this.p, c) || !c;
            if (z) {
                return 3;
            }
            if (c) {
                z2 |= d();
            }
            return z2 ? 0 : 2;
        }

        public final void n(lb0 lb0Var) {
            lb0 lb0Var2 = this.s;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.t = elapsedRealtime;
            lb0 C = fr.this.C(lb0Var2, lb0Var);
            this.s = C;
            if (C != lb0Var2) {
                this.y = null;
                this.u = elapsedRealtime;
                fr.this.L(this.p, C);
            } else if (!C.l) {
                lb0 lb0Var3 = this.s;
                if (lb0Var.h + lb0Var.o.size() < lb0Var3.h) {
                    this.y = new pb0.b(this.p.a);
                    fr.this.H(this.p, false);
                } else {
                    double b = dd.b(lb0Var3.j);
                    Double.isNaN(b);
                    if (elapsedRealtime - this.u > b * 3.5d) {
                        this.y = new pb0.c(this.p.a);
                        fr.this.H(this.p, true);
                        d();
                    }
                }
            }
            lb0 lb0Var4 = this.s;
            long j = lb0Var4.j;
            if (lb0Var4 == lb0Var2) {
                j /= 2;
            }
            this.v = elapsedRealtime + dd.b(j);
            if (this.p != fr.this.z || this.s.l) {
                return;
            }
            g();
        }

        public void p() {
            this.q.i();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.x = false;
            h();
        }
    }

    public fr(fb0 fb0Var, int i, vv0.a<nb0> aVar) {
        this.p = fb0Var;
        this.r = i;
        this.q = aVar;
    }

    public static lb0.a B(lb0 lb0Var, lb0 lb0Var2) {
        int i = (int) (lb0Var2.h - lb0Var.h);
        List<lb0.a> list = lb0Var.o;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public final void A(List<ib0.a> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ib0.a aVar = list.get(i);
            this.s.put(aVar, new a(aVar));
        }
    }

    public final lb0 C(lb0 lb0Var, lb0 lb0Var2) {
        return !lb0Var2.f(lb0Var) ? lb0Var2.l ? lb0Var.d() : lb0Var : lb0Var2.c(E(lb0Var, lb0Var2), D(lb0Var, lb0Var2));
    }

    public final int D(lb0 lb0Var, lb0 lb0Var2) {
        lb0.a B;
        if (lb0Var2.f) {
            return lb0Var2.g;
        }
        lb0 lb0Var3 = this.A;
        int i = lb0Var3 != null ? lb0Var3.g : 0;
        return (lb0Var == null || (B = B(lb0Var, lb0Var2)) == null) ? i : (lb0Var.g + B.s) - lb0Var2.o.get(0).s;
    }

    public final long E(lb0 lb0Var, lb0 lb0Var2) {
        if (lb0Var2.m) {
            return lb0Var2.e;
        }
        lb0 lb0Var3 = this.A;
        long j = lb0Var3 != null ? lb0Var3.e : 0L;
        if (lb0Var == null) {
            return j;
        }
        int size = lb0Var.o.size();
        lb0.a B = B(lb0Var, lb0Var2);
        return B != null ? lb0Var.e + B.t : ((long) size) == lb0Var2.h - lb0Var.h ? lb0Var.e() : j;
    }

    public final boolean F() {
        List<ib0.a> list = this.y.c;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            a aVar = this.s.get(list.get(i));
            if (elapsedRealtime > aVar.w) {
                this.z = aVar.p;
                aVar.g();
                return true;
            }
        }
        return false;
    }

    public final void G(ib0.a aVar) {
        if (aVar == this.z || !this.y.c.contains(aVar)) {
            return;
        }
        lb0 lb0Var = this.A;
        if (lb0Var == null || !lb0Var.l) {
            this.z = aVar;
            this.s.get(aVar).g();
        }
    }

    public final boolean H(ib0.a aVar, boolean z) {
        int size = this.t.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            z2 |= !this.t.get(i).d(aVar, z);
        }
        return z2;
    }

    @Override // com.daaw.jk0.a
    /* renamed from: I */
    public void k(vv0<nb0> vv0Var, long j, long j2, boolean z) {
        this.u.f(vv0Var.a, 4, j, j2, vv0Var.c());
    }

    @Override // com.daaw.jk0.a
    /* renamed from: J */
    public void o(vv0<nb0> vv0Var, long j, long j2) {
        nb0 d = vv0Var.d();
        boolean z = d instanceof lb0;
        ib0 d2 = z ? ib0.d(d.a) : (ib0) d;
        this.y = d2;
        this.z = d2.c.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(d2.c);
        arrayList.addAll(d2.d);
        arrayList.addAll(d2.e);
        A(arrayList);
        a aVar = this.s.get(this.z);
        if (z) {
            aVar.n((lb0) d);
        } else {
            aVar.g();
        }
        this.u.i(vv0Var.a, 4, j, j2, vv0Var.c());
    }

    @Override // com.daaw.jk0.a
    /* renamed from: K */
    public int r(vv0<nb0> vv0Var, long j, long j2, IOException iOException) {
        boolean z = iOException instanceof tv0;
        this.u.l(vv0Var.a, 4, j, j2, vv0Var.c(), iOException, z);
        return z ? 3 : 0;
    }

    public final void L(ib0.a aVar, lb0 lb0Var) {
        if (aVar == this.z) {
            if (this.A == null) {
                this.B = !lb0Var.l;
                this.C = lb0Var.e;
            }
            this.A = lb0Var;
            this.x.d(lb0Var);
        }
        int size = this.t.size();
        for (int i = 0; i < size; i++) {
            this.t.get(i).h();
        }
    }

    @Override // com.daaw.pb0
    public void a() {
        this.z = null;
        this.A = null;
        this.y = null;
        this.C = -9223372036854775807L;
        this.v.i();
        this.v = null;
        for (a aVar : this.s.values()) {
            aVar.p();
        }
        this.w.removeCallbacksAndMessages(null);
        this.w = null;
        this.s.clear();
    }

    @Override // com.daaw.pb0
    public void b(Uri uri, cp0.a aVar, pb0.d dVar) {
        this.w = new Handler();
        this.u = aVar;
        this.x = dVar;
        vv0 vv0Var = new vv0(this.p.a(4), uri, 4, this.q);
        s6.f(this.v == null);
        jk0 jk0Var = new jk0("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.v = jk0Var;
        aVar.o(vv0Var.a, vv0Var.b, jk0Var.k(vv0Var, this, this.r));
    }

    @Override // com.daaw.pb0
    public void c(pb0.a aVar) {
        this.t.remove(aVar);
    }

    @Override // com.daaw.pb0
    public lb0 d(ib0.a aVar) {
        lb0 e = this.s.get(aVar).e();
        if (e != null) {
            G(aVar);
        }
        return e;
    }

    @Override // com.daaw.pb0
    public void e(ib0.a aVar) {
        this.s.get(aVar).g();
    }

    @Override // com.daaw.pb0
    public long f() {
        return this.C;
    }

    @Override // com.daaw.pb0
    public boolean g() {
        return this.B;
    }

    @Override // com.daaw.pb0
    public void h(ib0.a aVar) {
        this.s.get(aVar).i();
    }

    @Override // com.daaw.pb0
    public ib0 i() {
        return this.y;
    }

    @Override // com.daaw.pb0
    public void j() {
        jk0 jk0Var = this.v;
        if (jk0Var != null) {
            jk0Var.a();
        }
        ib0.a aVar = this.z;
        if (aVar != null) {
            h(aVar);
        }
    }

    @Override // com.daaw.pb0
    public void l(pb0.a aVar) {
        this.t.add(aVar);
    }

    @Override // com.daaw.pb0
    public boolean m(ib0.a aVar) {
        return this.s.get(aVar).f();
    }
}
