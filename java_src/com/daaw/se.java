package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class se extends kx1 {
    public ArrayList<kx1> k;
    public int l;

    public se(qj qjVar, int i) {
        super(qjVar);
        this.k = new ArrayList<>();
        this.f = i;
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a0, code lost:
        if (r1 != r7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c6, code lost:
        if (r1 != r7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c8, code lost:
        r13 = r13 + 1;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01cb, code lost:
        r9.e.d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x03eb, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    @Override // com.daaw.kx1, com.daaw.zs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.daaw.zs r26) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.se.a(com.daaw.zs):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
        b(r5.i, r1, -r0);
     */
    @Override // com.daaw.kx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r5 = this;
            java.util.ArrayList<com.daaw.kx1> r0 = r5.k
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.daaw.kx1 r1 = (com.daaw.kx1) r1
            r1.d()
            goto L6
        L16:
            java.util.ArrayList<com.daaw.kx1> r0 = r5.k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList<com.daaw.kx1> r2 = r5.k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.daaw.kx1 r2 = (com.daaw.kx1) r2
            com.daaw.qj r2 = r2.b
            java.util.ArrayList<com.daaw.kx1> r4 = r5.k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            com.daaw.kx1 r0 = (com.daaw.kx1) r0
            com.daaw.qj r0 = r0.b
            int r4 = r5.f
            if (r4 != 0) goto L70
            com.daaw.lj r1 = r2.B
            com.daaw.lj r0 = r0.D
            com.daaw.ft r2 = r5.i(r1, r3)
            int r1 = r1.b()
            com.daaw.qj r4 = r5.r()
            if (r4 == 0) goto L52
            com.daaw.lj r1 = r4.B
            int r1 = r1.b()
        L52:
            if (r2 == 0) goto L59
            com.daaw.ft r4 = r5.h
            r5.b(r4, r2, r1)
        L59:
            com.daaw.ft r1 = r5.i(r0, r3)
            int r0 = r0.b()
            com.daaw.qj r2 = r5.s()
            if (r2 == 0) goto L6d
            com.daaw.lj r0 = r2.D
            int r0 = r0.b()
        L6d:
            if (r1 == 0) goto Lab
            goto La5
        L70:
            com.daaw.lj r2 = r2.C
            com.daaw.lj r0 = r0.E
            com.daaw.ft r3 = r5.i(r2, r1)
            int r2 = r2.b()
            com.daaw.qj r4 = r5.r()
            if (r4 == 0) goto L88
            com.daaw.lj r2 = r4.C
            int r2 = r2.b()
        L88:
            if (r3 == 0) goto L8f
            com.daaw.ft r4 = r5.h
            r5.b(r4, r3, r2)
        L8f:
            com.daaw.ft r1 = r5.i(r0, r1)
            int r0 = r0.b()
            com.daaw.qj r2 = r5.s()
            if (r2 == 0) goto La3
            com.daaw.lj r0 = r2.E
            int r0 = r0.b()
        La3:
            if (r1 == 0) goto Lab
        La5:
            com.daaw.ft r2 = r5.i
            int r0 = -r0
            r5.b(r2, r1, r0)
        Lab:
            com.daaw.ft r0 = r5.h
            r0.a = r5
            com.daaw.ft r0 = r5.i
            r0.a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.se.d():void");
    }

    @Override // com.daaw.kx1
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).e();
        }
    }

    @Override // com.daaw.kx1
    public void f() {
        this.c = null;
        Iterator<kx1> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // com.daaw.kx1
    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            kx1 kx1Var = this.k.get(i);
            j = j + kx1Var.h.f + kx1Var.j() + kx1Var.i.f;
        }
        return j;
    }

    @Override // com.daaw.kx1
    public boolean m() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!this.k.get(i).m()) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        qj qjVar;
        qj qjVar2 = this.b;
        do {
            qjVar = qjVar2;
            qjVar2 = qjVar2.F(this.f);
        } while (qjVar2 != null);
        this.b = qjVar;
        this.k.add(qjVar.H(this.f));
        qj D = qjVar.D(this.f);
        while (D != null) {
            this.k.add(D.H(this.f));
            D = D.D(this.f);
        }
        Iterator<kx1> it = this.k.iterator();
        while (it.hasNext()) {
            kx1 next = it.next();
            int i = this.f;
            if (i == 0) {
                next.b.c = this;
            } else if (i == 1) {
                next.b.d = this;
            }
        }
        if ((this.f == 0 && ((rj) this.b.E()).W0()) && this.k.size() > 1) {
            ArrayList<kx1> arrayList = this.k;
            this.b = arrayList.get(arrayList.size() - 1).b;
        }
        this.l = this.f == 0 ? this.b.v() : this.b.J();
    }

    public final qj r() {
        for (int i = 0; i < this.k.size(); i++) {
            kx1 kx1Var = this.k.get(i);
            if (kx1Var.b.M() != 8) {
                return kx1Var.b;
            }
        }
        return null;
    }

    public final qj s() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            kx1 kx1Var = this.k.get(size);
            if (kx1Var.b.M() != 8) {
                return kx1Var.b;
            }
        }
        return null;
    }

    public String toString() {
        Iterator<kx1> it;
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        while (this.k.iterator().hasNext()) {
            sb2 = ((sb2 + "<") + it.next()) + "> ";
        }
        return sb2;
    }
}
