package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
/* loaded from: classes.dex */
public class wx1 implements Runnable {
    public static final String v = ll0.f("WorkForegroundRunnable");
    public final sb1<Void> p = sb1.u();
    public final Context q;
    public final qy1 r;
    public final ListenableWorker s;
    public final j30 t;
    public final wj1 u;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ sb1 p;

        public a(sb1 sb1Var) {
            this.p = sb1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.p.s(wx1.this.s.getForegroundInfoAsync());
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ sb1 p;

        public b(sb1 sb1Var) {
            this.p = sb1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                g30 g30Var = (g30) this.p.get();
                if (g30Var == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", wx1.this.r.c));
                }
                ll0.c().a(wx1.v, String.format("Updating notification for %s", wx1.this.r.c), new Throwable[0]);
                wx1.this.s.setRunInForeground(true);
                wx1 wx1Var = wx1.this;
                wx1Var.p.s(wx1Var.t.a(wx1Var.q, wx1Var.s.getId(), g30Var));
            } catch (Throwable th) {
                wx1.this.p.r(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public wx1(Context context, qy1 qy1Var, ListenableWorker listenableWorker, j30 j30Var, wj1 wj1Var) {
        this.q = context;
        this.r = qy1Var;
        this.s = listenableWorker;
        this.t = j30Var;
        this.u = wj1Var;
    }

    public fk0<Void> a() {
        return this.p;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.r.q || xc.b()) {
            this.p.q(null);
            return;
        }
        sb1 u = sb1.u();
        this.u.a().execute(new a(u));
        u.d(new b(u), this.u.a());
    }
}
