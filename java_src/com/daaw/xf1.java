package com.daaw;

import androidx.work.impl.WorkDatabase;
/* loaded from: classes.dex */
public class xf1 implements Runnable {
    public static final String s = ll0.f("StopWorkRunnable");
    public final ey1 p;
    public final String q;
    public final boolean r;

    public xf1(ey1 ey1Var, String str, boolean z) {
        this.p = ey1Var;
        this.q = str;
        this.r = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean o;
        WorkDatabase o2 = this.p.o();
        jz0 m = this.p.m();
        ry1 B = o2.B();
        o2.c();
        try {
            boolean h = m.h(this.q);
            if (this.r) {
                o = this.p.m().n(this.q);
            } else {
                if (!h && B.l(this.q) == yx1.RUNNING) {
                    B.k(yx1.ENQUEUED, this.q);
                }
                o = this.p.m().o(this.q);
            }
            ll0.c().a(s, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.q, Boolean.valueOf(o)), new Throwable[0]);
            o2.r();
        } finally {
            o2.g();
        }
    }
}
