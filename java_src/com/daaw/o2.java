package com.daaw;

import android.view.Surface;
import com.daaw.bp0;
import com.daaw.bx0;
import com.daaw.cp0;
import com.daaw.ia;
import com.daaw.nl1;
import com.daaw.x2;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
/* loaded from: classes.dex */
public class o2 implements bx0.a, xp0, n7, rs1, cp0, ia.a, com.google.android.exoplayer2.drm.b {
    public final zf q;
    @MonotonicNonNull
    public bx0 t;
    public final CopyOnWriteArraySet<x2> p = new CopyOnWriteArraySet<>();
    public final b s = new b();
    public final nl1.c r = new nl1.c();

    /* loaded from: classes.dex */
    public static class a {
        public o2 a(bx0 bx0Var, zf zfVar) {
            return new o2(bx0Var, zfVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public c c;
        public c d;
        public boolean f;
        public final ArrayList<c> a = new ArrayList<>();
        public final nl1.b b = new nl1.b();
        public nl1 e = nl1.a;

        public c b() {
            return this.c;
        }

        public c c() {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList<c> arrayList = this.a;
            return arrayList.get(arrayList.size() - 1);
        }

        public c d() {
            if (this.a.isEmpty() || this.e.o() || this.f) {
                return null;
            }
            return this.a.get(0);
        }

        public c e() {
            return this.d;
        }

        public boolean f() {
            return this.f;
        }

        public void g(int i, bp0.a aVar) {
            this.a.add(new c(i, aVar));
            if (this.a.size() != 1 || this.e.o()) {
                return;
            }
            o();
        }

        public void h(int i, bp0.a aVar) {
            c cVar = new c(i, aVar);
            this.a.remove(cVar);
            if (cVar.equals(this.d)) {
                this.d = this.a.isEmpty() ? null : this.a.get(0);
            }
        }

        public void i(int i) {
            o();
        }

        public void j(int i, bp0.a aVar) {
            this.d = new c(i, aVar);
        }

        public void k() {
            this.f = false;
            o();
        }

        public void l() {
            this.f = true;
        }

        public void m(nl1 nl1Var) {
            for (int i = 0; i < this.a.size(); i++) {
                ArrayList<c> arrayList = this.a;
                arrayList.set(i, p(arrayList.get(i), nl1Var));
            }
            c cVar = this.d;
            if (cVar != null) {
                this.d = p(cVar, nl1Var);
            }
            this.e = nl1Var;
            o();
        }

        public bp0.a n(int i) {
            nl1 nl1Var = this.e;
            if (nl1Var != null) {
                int h = nl1Var.h();
                bp0.a aVar = null;
                for (int i2 = 0; i2 < this.a.size(); i2++) {
                    c cVar = this.a.get(i2);
                    int i3 = cVar.b.a;
                    if (i3 < h && this.e.f(i3, this.b).c == i) {
                        if (aVar != null) {
                            return null;
                        }
                        aVar = cVar.b;
                    }
                }
                return aVar;
            }
            return null;
        }

        public final void o() {
            if (this.a.isEmpty()) {
                return;
            }
            this.c = this.a.get(0);
        }

        public final c p(c cVar, nl1 nl1Var) {
            int b;
            return (nl1Var.o() || this.e.o() || (b = nl1Var.b(this.e.g(cVar.b.a, this.b, true).b)) == -1) ? cVar : new c(nl1Var.f(b, this.b).c, cVar.b.a(b));
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final int a;
        public final bp0.a b;

        public c(int i, bp0.a aVar) {
            this.a = i;
            this.b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b.equals(cVar.b);
        }

        public int hashCode() {
            return (this.a * 31) + this.b.hashCode();
        }
    }

    public o2(bx0 bx0Var, zf zfVar) {
        this.t = bx0Var;
        this.q = (zf) s6.e(zfVar);
    }

    @Override // com.daaw.bx0.a
    public final void A(qz qzVar) {
        x2.a L = L();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().y(L, qzVar);
        }
    }

    @Override // com.daaw.n7
    public final void B(int i, long j, long j2) {
        x2.a M = M();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().r(M, i, j, j2);
        }
    }

    @Override // com.daaw.cp0
    public final void C(int i, bp0.a aVar, cp0.c cVar) {
        x2.a H = H(i, aVar);
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().b(H, cVar);
        }
    }

    @Override // com.daaw.n7
    public final void D(fq fqVar) {
        x2.a L = L();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().s(L, 1, fqVar);
        }
    }

    @Override // com.daaw.cp0
    public final void E(int i, bp0.a aVar, cp0.b bVar, cp0.c cVar) {
        x2.a H = H(i, aVar);
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().A(H, bVar, cVar);
        }
    }

    @Override // com.daaw.cp0
    public final void F(int i, bp0.a aVar, cp0.b bVar, cp0.c cVar, IOException iOException, boolean z) {
        x2.a H = H(i, aVar);
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().q(H, bVar, cVar, iOException, z);
        }
    }

    public void G(x2 x2Var) {
        this.p.add(x2Var);
    }

    public x2.a H(int i, bp0.a aVar) {
        long a2;
        long j;
        s6.e(this.t);
        long b2 = this.q.b();
        nl1 n = this.t.n();
        long j2 = 0;
        if (i != this.t.g()) {
            if (i < n.n() && (aVar == null || !aVar.b())) {
                a2 = n.k(i, this.r).a();
                j = a2;
            }
            j = j2;
        } else if (aVar == null || !aVar.b()) {
            a2 = this.t.i();
            j = a2;
        } else {
            if (this.t.m() == aVar.b && this.t.e() == aVar.c) {
                j2 = this.t.o();
            }
            j = j2;
        }
        return new x2.a(b2, n, i, aVar, j, this.t.o(), this.t.j() - this.t.i());
    }

    public final x2.a I(c cVar) {
        if (cVar == null) {
            int g = ((bx0) s6.e(this.t)).g();
            return H(g, this.s.n(g));
        }
        return H(cVar.a, cVar.b);
    }

    public final x2.a J() {
        return I(this.s.b());
    }

    public final x2.a K() {
        return I(this.s.c());
    }

    public final x2.a L() {
        return I(this.s.d());
    }

    public final x2.a M() {
        return I(this.s.e());
    }

    public final void N() {
        if (this.s.f()) {
            return;
        }
        x2.a L = L();
        this.s.l();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().f(L);
        }
    }

    public final void O() {
        for (c cVar : new ArrayList(this.s.a)) {
            h(cVar.a, cVar.b);
        }
    }

    @Override // com.daaw.n7
    public final void a(int i) {
        x2.a M = M();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().e(M, i);
        }
    }

    @Override // com.daaw.rs1
    public final void b(int i, int i2, int i3, float f) {
        x2.a M = M();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().x(M, i, i2, i3, f);
        }
    }

    @Override // com.daaw.bx0.a
    public final void c(zw0 zw0Var) {
        x2.a L = L();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().t(L, zw0Var);
        }
    }

    @Override // com.daaw.bx0.a
    public final void d(boolean z) {
        x2.a L = L();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().j(L, z);
        }
    }

    @Override // com.daaw.bx0.a
    public final void e(int i) {
        this.s.i(i);
        x2.a L = L();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().h(L, i);
        }
    }

    @Override // com.daaw.rs1
    public final void f(String str, long j, long j2) {
        x2.a M = M();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().v(M, 2, str, j2);
        }
    }

    @Override // com.daaw.bx0.a
    public final void g() {
        if (this.s.f()) {
            this.s.k();
            x2.a L = L();
            Iterator<x2> it = this.p.iterator();
            while (it.hasNext()) {
                it.next().z(L);
            }
        }
    }

    @Override // com.daaw.cp0
    public final void h(int i, bp0.a aVar) {
        this.s.h(i, aVar);
        x2.a H = H(i, aVar);
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().B(H);
        }
    }

    @Override // com.daaw.rs1
    public final void i(Surface surface) {
        x2.a M = M();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().m(M, surface);
        }
    }

    @Override // com.daaw.n7
    public final void j(fq fqVar) {
        x2.a J = J();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().i(J, 1, fqVar);
        }
    }

    @Override // com.daaw.ia.a
    public final void k(int i, long j, long j2) {
        x2.a K = K();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().w(K, i, j, j2);
        }
    }

    @Override // com.daaw.cp0
    public final void l(int i, bp0.a aVar, cp0.b bVar, cp0.c cVar) {
        x2.a H = H(i, aVar);
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().d(H, bVar, cVar);
        }
    }

    @Override // com.daaw.bx0.a
    public final void m(TrackGroupArray trackGroupArray, um1 um1Var) {
        x2.a L = L();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().n(L, trackGroupArray, um1Var);
        }
    }

    @Override // com.daaw.n7
    public final void n(String str, long j, long j2) {
        x2.a M = M();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().v(M, 1, str, j2);
        }
    }

    @Override // com.daaw.cp0
    public final void o(int i, bp0.a aVar, cp0.c cVar) {
        x2.a H = H(i, aVar);
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().a(H, cVar);
        }
    }

    @Override // com.daaw.xp0
    public final void p(Metadata metadata) {
        x2.a L = L();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().l(L, metadata);
        }
    }

    @Override // com.daaw.rs1
    public final void q(int i, long j) {
        x2.a J = J();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().c(J, i, j);
        }
    }

    @Override // com.daaw.cp0
    public final void r(int i, bp0.a aVar) {
        this.s.g(i, aVar);
        x2.a H = H(i, aVar);
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().p(H);
        }
    }

    @Override // com.daaw.bx0.a
    public final void s(boolean z, int i) {
        x2.a L = L();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().g(L, z, i);
        }
    }

    @Override // com.daaw.cp0
    public final void t(int i, bp0.a aVar) {
        this.s.j(i, aVar);
        x2.a H = H(i, aVar);
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().u(H);
        }
    }

    @Override // com.daaw.rs1
    public final void u(fq fqVar) {
        x2.a J = J();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().i(J, 2, fqVar);
        }
    }

    @Override // com.daaw.bx0.a
    public final void v(nl1 nl1Var, Object obj, int i) {
        this.s.m(nl1Var);
        x2.a L = L();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().C(L, i);
        }
    }

    @Override // com.daaw.cp0
    public final void w(int i, bp0.a aVar, cp0.b bVar, cp0.c cVar) {
        x2.a H = H(i, aVar);
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().o(H, bVar, cVar);
        }
    }

    @Override // com.daaw.rs1
    public final void x(Format format) {
        x2.a M = M();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().k(M, 2, format);
        }
    }

    @Override // com.daaw.rs1
    public final void y(fq fqVar) {
        x2.a L = L();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().s(L, 2, fqVar);
        }
    }

    @Override // com.daaw.n7
    public final void z(Format format) {
        x2.a M = M();
        Iterator<x2> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().k(M, 1, format);
        }
    }
}
