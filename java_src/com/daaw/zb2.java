package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zb2 implements ac2 {
    public final List a;
    public final m42[] b;
    public boolean c;
    public int d;
    public int e;
    public long f = -9223372036854775807L;

    public zb2(List list) {
        this.a = list;
        this.b = new m42[list.size()];
    }

    @Override // com.daaw.ac2
    public final void a(ik5 ik5Var) {
        m42[] m42VarArr;
        if (this.c) {
            if (this.d != 2 || d(ik5Var, 32)) {
                if (this.d != 1 || d(ik5Var, 0)) {
                    int k = ik5Var.k();
                    int i = ik5Var.i();
                    for (m42 m42Var : this.b) {
                        ik5Var.f(k);
                        m42Var.c(ik5Var, i);
                    }
                    this.e += i;
                }
            }
        }
    }

    @Override // com.daaw.ac2
    public final void b(m09 m09Var, td2 td2Var) {
        for (int i = 0; i < this.b.length; i++) {
            qd2 qd2Var = (qd2) this.a.get(i);
            td2Var.c();
            m42 n = m09Var.n(td2Var.a(), 3);
            b72 b72Var = new b72();
            b72Var.h(td2Var.b());
            b72Var.s("application/dvbsubs");
            b72Var.i(Collections.singletonList(qd2Var.b));
            b72Var.k(qd2Var.a);
            n.f(b72Var.y());
            this.b[i] = n;
        }
    }

    @Override // com.daaw.ac2
    public final void c(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.f = j;
        }
        this.e = 0;
        this.d = 2;
    }

    public final boolean d(ik5 ik5Var, int i) {
        if (ik5Var.i() == 0) {
            return false;
        }
        if (ik5Var.s() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    @Override // com.daaw.ac2
    public final void zzc() {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                for (m42 m42Var : this.b) {
                    m42Var.b(this.f, 1, this.e, 0, null);
                }
            }
            this.c = false;
        }
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.c = false;
        this.f = -9223372036854775807L;
    }
}
