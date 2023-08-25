package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zb2 implements ac2 {

    /* renamed from: a */
    public final List f34701a;

    /* renamed from: b */
    public final m42[] f34702b;

    /* renamed from: c */
    public boolean f34703c;

    /* renamed from: d */
    public int f34704d;

    /* renamed from: e */
    public int f34705e;

    /* renamed from: f */
    public long f34706f = -9223372036854775807L;

    public zb2(List list) {
        this.f34701a = list;
        this.f34702b = new m42[list.size()];
    }

    @Override // com.daaw.ac2
    /* renamed from: a */
    public final void mo2553a(ik5 ik5Var) {
        m42[] m42VarArr;
        if (this.f34703c) {
            if (this.f34704d != 2 || m2550d(ik5Var, 32)) {
                if (this.f34704d != 1 || m2550d(ik5Var, 0)) {
                    int m19711k = ik5Var.m19711k();
                    int m19713i = ik5Var.m19713i();
                    for (m42 m42Var : this.f34702b) {
                        ik5Var.m19716f(m19711k);
                        m42Var.mo16221c(ik5Var, m19713i);
                    }
                    this.f34705e += m19713i;
                }
            }
        }
    }

    @Override // com.daaw.ac2
    /* renamed from: b */
    public final void mo2552b(m09 m09Var, td2 td2Var) {
        for (int i = 0; i < this.f34702b.length; i++) {
            qd2 qd2Var = (qd2) this.f34701a.get(i);
            td2Var.m9282c();
            m42 mo3292n = m09Var.mo3292n(td2Var.m9284a(), 3);
            b72 b72Var = new b72();
            b72Var.m26384h(td2Var.m9283b());
            b72Var.m26372s("application/dvbsubs");
            b72Var.m26382i(Collections.singletonList(qd2Var.f23869b));
            b72Var.m26380k(qd2Var.f23868a);
            mo3292n.mo16218f(b72Var.m26366y());
            this.f34702b[i] = mo3292n;
        }
    }

    @Override // com.daaw.ac2
    /* renamed from: c */
    public final void mo2551c(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f34703c = true;
        if (j != -9223372036854775807L) {
            this.f34706f = j;
        }
        this.f34705e = 0;
        this.f34704d = 2;
    }

    /* renamed from: d */
    public final boolean m2550d(ik5 ik5Var, int i) {
        if (ik5Var.m19713i() == 0) {
            return false;
        }
        if (ik5Var.m19703s() != i) {
            this.f34703c = false;
        }
        this.f34704d--;
        return this.f34703c;
    }

    @Override // com.daaw.ac2
    public final void zzc() {
        if (this.f34703c) {
            if (this.f34706f != -9223372036854775807L) {
                for (m42 m42Var : this.f34702b) {
                    m42Var.mo16222b(this.f34706f, 1, this.f34705e, 0, null);
                }
            }
            this.f34703c = false;
        }
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.f34703c = false;
        this.f34706f = -9223372036854775807L;
    }
}
