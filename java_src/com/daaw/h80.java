package com.daaw;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class h80 implements r81, rx1, yy {
    public static final String x = ll0.f("GreedyScheduler");
    public final Context p;
    public final ey1 q;
    public final sx1 r;
    public hs t;
    public boolean u;
    public Boolean w;
    public final Set<qy1> s = new HashSet();
    public final Object v = new Object();

    public h80(Context context, androidx.work.a aVar, wj1 wj1Var, ey1 ey1Var) {
        this.p = context;
        this.q = ey1Var;
        this.r = new sx1(context, wj1Var, this);
        this.t = new hs(this, aVar.k());
    }

    @Override // com.daaw.r81
    public boolean a() {
        return false;
    }

    @Override // com.daaw.rx1
    public void b(List<String> list) {
        for (String str : list) {
            ll0.c().a(x, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.q.x(str);
        }
    }

    @Override // com.daaw.yy
    public void c(String str, boolean z) {
        i(str);
    }

    @Override // com.daaw.r81
    public void d(String str) {
        if (this.w == null) {
            g();
        }
        if (!this.w.booleanValue()) {
            ll0.c().d(x, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        ll0.c().a(x, String.format("Cancelling work ID %s", str), new Throwable[0]);
        hs hsVar = this.t;
        if (hsVar != null) {
            hsVar.b(str);
        }
        this.q.x(str);
    }

    @Override // com.daaw.r81
    public void e(qy1... qy1VarArr) {
        if (this.w == null) {
            g();
        }
        if (!this.w.booleanValue()) {
            ll0.c().d(x, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (qy1 qy1Var : qy1VarArr) {
            long a = qy1Var.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (qy1Var.b == yx1.ENQUEUED) {
                if (currentTimeMillis < a) {
                    hs hsVar = this.t;
                    if (hsVar != null) {
                        hsVar.a(qy1Var);
                    }
                } else if (qy1Var.b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && qy1Var.j.h()) {
                        ll0.c().a(x, String.format("Ignoring WorkSpec %s, Requires device idle.", qy1Var), new Throwable[0]);
                    } else if (i < 24 || !qy1Var.j.e()) {
                        hashSet.add(qy1Var);
                        hashSet2.add(qy1Var.a);
                    } else {
                        ll0.c().a(x, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", qy1Var), new Throwable[0]);
                    }
                } else {
                    ll0.c().a(x, String.format("Starting work for %s", qy1Var.a), new Throwable[0]);
                    this.q.u(qy1Var.a);
                }
            }
        }
        synchronized (this.v) {
            if (!hashSet.isEmpty()) {
                ll0.c().a(x, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.s.addAll(hashSet);
                this.r.d(this.s);
            }
        }
    }

    @Override // com.daaw.rx1
    public void f(List<String> list) {
        for (String str : list) {
            ll0.c().a(x, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.q.u(str);
        }
    }

    public final void g() {
        this.w = Boolean.valueOf(iz0.b(this.p, this.q.i()));
    }

    public final void h() {
        if (this.u) {
            return;
        }
        this.q.m().d(this);
        this.u = true;
    }

    public final void i(String str) {
        synchronized (this.v) {
            Iterator<qy1> it = this.s.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                qy1 next = it.next();
                if (next.a.equals(str)) {
                    ll0.c().a(x, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.s.remove(next);
                    this.r.d(this.s);
                    break;
                }
            }
        }
    }
}
