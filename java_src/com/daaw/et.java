package com.daaw;

import com.daaw.gb;
import com.daaw.qj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class et {
    public rj a;
    public rj d;
    public boolean b = true;
    public boolean c = true;
    public ArrayList<kx1> e = new ArrayList<>();
    public ArrayList<l61> f = new ArrayList<>();
    public gb.b g = null;
    public gb.a h = new gb.a();
    public ArrayList<l61> i = new ArrayList<>();

    public et(rj rjVar) {
        this.a = rjVar;
        this.d = rjVar;
    }

    public final void a(ft ftVar, int i, int i2, ft ftVar2, ArrayList<l61> arrayList, l61 l61Var) {
        kx1 kx1Var = ftVar.d;
        if (kx1Var.c == null) {
            rj rjVar = this.a;
            if (kx1Var == rjVar.e || kx1Var == rjVar.f) {
                return;
            }
            if (l61Var == null) {
                l61Var = new l61(kx1Var, i2);
                arrayList.add(l61Var);
            }
            kx1Var.c = l61Var;
            l61Var.a(kx1Var);
            for (zs zsVar : kx1Var.h.k) {
                if (zsVar instanceof ft) {
                    a((ft) zsVar, i, 0, ftVar2, arrayList, l61Var);
                }
            }
            for (zs zsVar2 : kx1Var.i.k) {
                if (zsVar2 instanceof ft) {
                    a((ft) zsVar2, i, 1, ftVar2, arrayList, l61Var);
                }
            }
            if (i == 1 && (kx1Var instanceof ms1)) {
                for (zs zsVar3 : ((ms1) kx1Var).k.k) {
                    if (zsVar3 instanceof ft) {
                        a((ft) zsVar3, i, 2, ftVar2, arrayList, l61Var);
                    }
                }
            }
            for (ft ftVar3 : kx1Var.h.l) {
                if (ftVar3 == ftVar2) {
                    l61Var.b = true;
                }
                a(ftVar3, i, 0, ftVar2, arrayList, l61Var);
            }
            for (ft ftVar4 : kx1Var.i.l) {
                if (ftVar4 == ftVar2) {
                    l61Var.b = true;
                }
                a(ftVar4, i, 1, ftVar2, arrayList, l61Var);
            }
            if (i == 1 && (kx1Var instanceof ms1)) {
                for (ft ftVar5 : ((ms1) kx1Var).k.l) {
                    a(ftVar5, i, 2, ftVar2, arrayList, l61Var);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
        if (r2.m == 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(com.daaw.rj r17) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.et.b(com.daaw.rj):boolean");
    }

    public void c() {
        d(this.e);
        this.i.clear();
        l61.h = 0;
        i(this.a.e, 0, this.i);
        i(this.a.f, 1, this.i);
        this.b = false;
    }

    public void d(ArrayList<kx1> arrayList) {
        kx1 l80Var;
        arrayList.clear();
        this.d.e.f();
        this.d.f.f();
        arrayList.add(this.d.e);
        arrayList.add(this.d.f);
        Iterator<qj> it = this.d.w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            qj next = it.next();
            if (next instanceof k80) {
                l80Var = new l80(next);
            } else {
                if (next.T()) {
                    if (next.c == null) {
                        next.c = new se(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.c);
                } else {
                    arrayList.add(next.e);
                }
                if (next.V()) {
                    if (next.d == null) {
                        next.d = new se(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.d);
                } else {
                    arrayList.add(next.f);
                }
                if (next instanceof bb0) {
                    l80Var = new ab0(next);
                }
            }
            arrayList.add(l80Var);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<kx1> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<kx1> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            kx1 next2 = it3.next();
            if (next2.b != this.d) {
                next2.d();
            }
        }
    }

    public final int e(rj rjVar, int i) {
        int size = this.i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.i.get(i2).b(rjVar, i));
        }
        return (int) j;
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.b || this.c) {
            Iterator<qj> it = this.a.w0.iterator();
            while (it.hasNext()) {
                qj next = it.next();
                next.a = false;
                next.e.r();
                next.f.q();
            }
            rj rjVar = this.a;
            rjVar.a = false;
            rjVar.e.r();
            this.a.f.q();
            this.c = false;
        }
        if (b(this.d)) {
            return false;
        }
        this.a.C0(0);
        this.a.D0(0);
        qj.b q = this.a.q(0);
        qj.b q2 = this.a.q(1);
        if (this.b) {
            c();
        }
        int O = this.a.O();
        int P = this.a.P();
        this.a.e.h.d(O);
        this.a.f.h.d(P);
        m();
        qj.b bVar = qj.b.WRAP_CONTENT;
        if (q == bVar || q2 == bVar) {
            if (z4) {
                Iterator<kx1> it2 = this.e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && q == qj.b.WRAP_CONTENT) {
                this.a.i0(qj.b.FIXED);
                rj rjVar2 = this.a;
                rjVar2.B0(e(rjVar2, 0));
                rj rjVar3 = this.a;
                rjVar3.e.e.d(rjVar3.N());
            }
            if (z4 && q2 == qj.b.WRAP_CONTENT) {
                this.a.x0(qj.b.FIXED);
                rj rjVar4 = this.a;
                rjVar4.e0(e(rjVar4, 1));
                rj rjVar5 = this.a;
                rjVar5.f.e.d(rjVar5.t());
            }
        }
        rj rjVar6 = this.a;
        qj.b[] bVarArr = rjVar6.M;
        qj.b bVar2 = bVarArr[0];
        qj.b bVar3 = qj.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == qj.b.MATCH_PARENT) {
            int N = rjVar6.N() + O;
            this.a.e.i.d(N);
            this.a.e.e.d(N - O);
            m();
            rj rjVar7 = this.a;
            qj.b[] bVarArr2 = rjVar7.M;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == qj.b.MATCH_PARENT) {
                int t = rjVar7.t() + P;
                this.a.f.i.d(t);
                this.a.f.e.d(t - P);
            }
            m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<kx1> it3 = this.e.iterator();
        while (it3.hasNext()) {
            kx1 next2 = it3.next();
            if (next2.b != this.a || next2.g) {
                next2.e();
            }
        }
        Iterator<kx1> it4 = this.e.iterator();
        while (it4.hasNext()) {
            kx1 next3 = it4.next();
            if (z2 || next3.b != this.a) {
                if (!next3.h.j || ((!next3.i.j && !(next3 instanceof l80)) || (!next3.e.j && !(next3 instanceof se) && !(next3 instanceof l80)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.a.i0(q);
        this.a.x0(q2);
        return z3;
    }

    public boolean g(boolean z) {
        if (this.b) {
            Iterator<qj> it = this.a.w0.iterator();
            while (it.hasNext()) {
                qj next = it.next();
                next.a = false;
                sb0 sb0Var = next.e;
                sb0Var.e.j = false;
                sb0Var.g = false;
                sb0Var.r();
                ms1 ms1Var = next.f;
                ms1Var.e.j = false;
                ms1Var.g = false;
                ms1Var.q();
            }
            rj rjVar = this.a;
            rjVar.a = false;
            sb0 sb0Var2 = rjVar.e;
            sb0Var2.e.j = false;
            sb0Var2.g = false;
            sb0Var2.r();
            ms1 ms1Var2 = this.a.f;
            ms1Var2.e.j = false;
            ms1Var2.g = false;
            ms1Var2.q();
            c();
        }
        if (b(this.d)) {
            return false;
        }
        this.a.C0(0);
        this.a.D0(0);
        this.a.e.h.d(0);
        this.a.f.h.d(0);
        return true;
    }

    public boolean h(boolean z, int i) {
        boolean z2;
        qj.b bVar;
        pt ptVar;
        int t;
        boolean z3 = true;
        boolean z4 = z & true;
        qj.b q = this.a.q(0);
        qj.b q2 = this.a.q(1);
        int O = this.a.O();
        int P = this.a.P();
        if (z4 && (q == (bVar = qj.b.WRAP_CONTENT) || q2 == bVar)) {
            Iterator<kx1> it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                kx1 next = it.next();
                if (next.f == i && !next.m()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && q == qj.b.WRAP_CONTENT) {
                    this.a.i0(qj.b.FIXED);
                    rj rjVar = this.a;
                    rjVar.B0(e(rjVar, 0));
                    rj rjVar2 = this.a;
                    ptVar = rjVar2.e.e;
                    t = rjVar2.N();
                    ptVar.d(t);
                }
            } else if (z4 && q2 == qj.b.WRAP_CONTENT) {
                this.a.x0(qj.b.FIXED);
                rj rjVar3 = this.a;
                rjVar3.e0(e(rjVar3, 1));
                rj rjVar4 = this.a;
                ptVar = rjVar4.f.e;
                t = rjVar4.t();
                ptVar.d(t);
            }
        }
        rj rjVar5 = this.a;
        if (i == 0) {
            qj.b[] bVarArr = rjVar5.M;
            if (bVarArr[0] == qj.b.FIXED || bVarArr[0] == qj.b.MATCH_PARENT) {
                int N = rjVar5.N() + O;
                this.a.e.i.d(N);
                this.a.e.e.d(N - O);
                z2 = true;
            }
            z2 = false;
        } else {
            qj.b[] bVarArr2 = rjVar5.M;
            if (bVarArr2[1] == qj.b.FIXED || bVarArr2[1] == qj.b.MATCH_PARENT) {
                int t2 = rjVar5.t() + P;
                this.a.f.i.d(t2);
                this.a.f.e.d(t2 - P);
                z2 = true;
            }
            z2 = false;
        }
        m();
        Iterator<kx1> it2 = this.e.iterator();
        while (it2.hasNext()) {
            kx1 next2 = it2.next();
            if (next2.f == i && (next2.b != this.a || next2.g)) {
                next2.e();
            }
        }
        Iterator<kx1> it3 = this.e.iterator();
        while (it3.hasNext()) {
            kx1 next3 = it3.next();
            if (next3.f == i && (z2 || next3.b != this.a)) {
                if (!next3.h.j || !next3.i.j || (!(next3 instanceof se) && !next3.e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.a.i0(q);
        this.a.x0(q2);
        return z3;
    }

    public final void i(kx1 kx1Var, int i, ArrayList<l61> arrayList) {
        for (zs zsVar : kx1Var.h.k) {
            if (zsVar instanceof ft) {
                a((ft) zsVar, i, 0, kx1Var.i, arrayList, null);
            } else if (zsVar instanceof kx1) {
                a(((kx1) zsVar).h, i, 0, kx1Var.i, arrayList, null);
            }
        }
        for (zs zsVar2 : kx1Var.i.k) {
            if (zsVar2 instanceof ft) {
                a((ft) zsVar2, i, 1, kx1Var.h, arrayList, null);
            } else if (zsVar2 instanceof kx1) {
                a(((kx1) zsVar2).i, i, 1, kx1Var.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (zs zsVar3 : ((ms1) kx1Var).k.k) {
                if (zsVar3 instanceof ft) {
                    a((ft) zsVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    public void j() {
        this.b = true;
    }

    public void k() {
        this.c = true;
    }

    public final void l(qj qjVar, qj.b bVar, int i, qj.b bVar2, int i2) {
        gb.a aVar = this.h;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.g.b(qjVar, aVar);
        qjVar.B0(this.h.e);
        qjVar.e0(this.h.f);
        qjVar.d0(this.h.h);
        qjVar.Y(this.h.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m() {
        /*
            r12 = this;
            com.daaw.rj r0 = r12.a
            java.util.ArrayList<com.daaw.qj> r0 = r0.w0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r0.next()
            com.daaw.qj r1 = (com.daaw.qj) r1
            boolean r2 = r1.a
            if (r2 == 0) goto L19
            goto L8
        L19:
            com.daaw.qj$b[] r2 = r1.M
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.l
            int r4 = r1.m
            com.daaw.qj$b r6 = com.daaw.qj.b.WRAP_CONTENT
            if (r8 == r6) goto L32
            com.daaw.qj$b r5 = com.daaw.qj.b.MATCH_CONSTRAINT
            if (r8 != r5) goto L30
            if (r2 != r9) goto L30
            goto L32
        L30:
            r2 = 0
            goto L33
        L32:
            r2 = 1
        L33:
            if (r10 == r6) goto L3b
            com.daaw.qj$b r5 = com.daaw.qj.b.MATCH_CONSTRAINT
            if (r10 != r5) goto L3c
            if (r4 != r9) goto L3c
        L3b:
            r3 = 1
        L3c:
            com.daaw.sb0 r4 = r1.e
            com.daaw.pt r4 = r4.e
            boolean r5 = r4.j
            com.daaw.ms1 r7 = r1.f
            com.daaw.pt r7 = r7.e
            boolean r11 = r7.j
            if (r5 == 0) goto L5b
            if (r11 == 0) goto L5b
            com.daaw.qj$b r6 = com.daaw.qj.b.FIXED
            int r5 = r4.g
            int r7 = r7.g
            r2 = r12
            r3 = r1
            r4 = r6
            r2.l(r3, r4, r5, r6, r7)
        L58:
            r1.a = r9
            goto Lae
        L5b:
            if (r5 == 0) goto L87
            if (r3 == 0) goto L87
            com.daaw.qj$b r5 = com.daaw.qj.b.FIXED
            int r8 = r4.g
            int r7 = r7.g
            r2 = r12
            r3 = r1
            r4 = r5
            r5 = r8
            r2.l(r3, r4, r5, r6, r7)
            com.daaw.qj$b r2 = com.daaw.qj.b.MATCH_CONSTRAINT
            if (r10 != r2) goto L7b
            com.daaw.ms1 r2 = r1.f
            com.daaw.pt r2 = r2.e
            int r3 = r1.t()
        L78:
            r2.m = r3
            goto Lae
        L7b:
            com.daaw.ms1 r2 = r1.f
            com.daaw.pt r2 = r2.e
            int r3 = r1.t()
        L83:
            r2.d(r3)
            goto L58
        L87:
            if (r11 == 0) goto Lae
            if (r2 == 0) goto Lae
            int r5 = r4.g
            com.daaw.qj$b r10 = com.daaw.qj.b.FIXED
            int r7 = r7.g
            r2 = r12
            r3 = r1
            r4 = r6
            r6 = r10
            r2.l(r3, r4, r5, r6, r7)
            com.daaw.qj$b r2 = com.daaw.qj.b.MATCH_CONSTRAINT
            if (r8 != r2) goto La5
            com.daaw.sb0 r2 = r1.e
            com.daaw.pt r2 = r2.e
            int r3 = r1.N()
            goto L78
        La5:
            com.daaw.sb0 r2 = r1.e
            com.daaw.pt r2 = r2.e
            int r3 = r1.N()
            goto L83
        Lae:
            boolean r2 = r1.a
            if (r2 == 0) goto L8
            com.daaw.ms1 r2 = r1.f
            com.daaw.pt r2 = r2.l
            if (r2 == 0) goto L8
            int r1 = r1.l()
            r2.d(r1)
            goto L8
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.et.m():void");
    }

    public void n(gb.b bVar) {
        this.g = bVar;
    }
}
