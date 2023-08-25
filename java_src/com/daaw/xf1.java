package com.daaw;

import androidx.work.impl.WorkDatabase;
/* loaded from: classes.dex */
public class xf1 implements Runnable {

    /* renamed from: s */
    public static final String f32653s = ll0.m16883f("StopWorkRunnable");

    /* renamed from: p */
    public final ey1 f32654p;

    /* renamed from: q */
    public final String f32655q;

    /* renamed from: r */
    public final boolean f32656r;

    public xf1(ey1 ey1Var, String str, boolean z) {
        this.f32654p = ey1Var;
        this.f32655q = str;
        this.f32656r = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m18147o;
        WorkDatabase m23000o = this.f32654p.m23000o();
        jz0 m23002m = this.f32654p.m23002m();
        ry1 mo27951B = m23000o.mo27951B();
        m23000o.m26481c();
        try {
            boolean m18154h = m23002m.m18154h(this.f32655q);
            if (this.f32656r) {
                m18147o = this.f32654p.m23002m().m18148n(this.f32655q);
            } else {
                if (!m18154h && mo27951B.mo9720l(this.f32655q) == yx1.RUNNING) {
                    mo27951B.mo9721k(yx1.ENQUEUED, this.f32655q);
                }
                m18147o = this.f32654p.m23002m().m18147o(this.f32655q);
            }
            ll0.m16885c().mo16882a(f32653s, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f32655q, Boolean.valueOf(m18147o)), new Throwable[0]);
            m23000o.m26466r();
        } finally {
            m23000o.m26477g();
        }
    }
}
