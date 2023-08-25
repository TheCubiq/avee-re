package com.daaw;

import java.util.HashMap;
import java.util.Map;
/* renamed from: com.daaw.hs */
/* loaded from: classes.dex */
public class C1608hs {

    /* renamed from: d */
    public static final String f12895d = ll0.m16883f("DelayedWorkTracker");

    /* renamed from: a */
    public final h80 f12896a;

    /* renamed from: b */
    public final m61 f12897b;

    /* renamed from: c */
    public final Map<String, Runnable> f12898c = new HashMap();

    /* renamed from: com.daaw.hs$a */
    /* loaded from: classes.dex */
    public class RunnableC1609a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ qy1 f12899p;

        public RunnableC1609a(qy1 qy1Var) {
            this.f12899p = qy1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            ll0.m16885c().mo16882a(C1608hs.f12895d, String.format("Scheduling work %s", this.f12899p.f24624a), new Throwable[0]);
            C1608hs.this.f12896a.mo9087e(this.f12899p);
        }
    }

    public C1608hs(h80 h80Var, m61 m61Var) {
        this.f12896a = h80Var;
        this.f12897b = m61Var;
    }

    /* renamed from: a */
    public void m20444a(qy1 qy1Var) {
        Runnable remove = this.f12898c.remove(qy1Var.f24624a);
        if (remove != null) {
            this.f12897b.mo13204b(remove);
        }
        RunnableC1609a runnableC1609a = new RunnableC1609a(qy1Var);
        this.f12898c.put(qy1Var.f24624a, runnableC1609a);
        long currentTimeMillis = System.currentTimeMillis();
        this.f12897b.mo13205a(qy1Var.m11938a() - currentTimeMillis, runnableC1609a);
    }

    /* renamed from: b */
    public void m20443b(String str) {
        Runnable remove = this.f12898c.remove(str);
        if (remove != null) {
            this.f12897b.mo13204b(remove);
        }
    }
}
