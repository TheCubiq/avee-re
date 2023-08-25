package com.daaw;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class hs {
    public static final String d = ll0.f("DelayedWorkTracker");
    public final h80 a;
    public final m61 b;
    public final Map<String, Runnable> c = new HashMap();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ qy1 p;

        public a(qy1 qy1Var) {
            this.p = qy1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            ll0.c().a(hs.d, String.format("Scheduling work %s", this.p.a), new Throwable[0]);
            hs.this.a.e(this.p);
        }
    }

    public hs(h80 h80Var, m61 m61Var) {
        this.a = h80Var;
        this.b = m61Var;
    }

    public void a(qy1 qy1Var) {
        Runnable remove = this.c.remove(qy1Var.a);
        if (remove != null) {
            this.b.b(remove);
        }
        a aVar = new a(qy1Var);
        this.c.put(qy1Var.a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.b.a(qy1Var.a() - currentTimeMillis, aVar);
    }

    public void b(String str) {
        Runnable remove = this.c.remove(str);
        if (remove != null) {
            this.b.b(remove);
        }
    }
}
