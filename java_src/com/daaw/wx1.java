package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
/* loaded from: classes.dex */
public class wx1 implements Runnable {

    /* renamed from: v */
    public static final String f31628v = ll0.m16883f("WorkForegroundRunnable");

    /* renamed from: p */
    public final sb1<Void> f31629p = sb1.m10470u();

    /* renamed from: q */
    public final Context f31630q;

    /* renamed from: r */
    public final qy1 f31631r;

    /* renamed from: s */
    public final ListenableWorker f31632s;

    /* renamed from: t */
    public final j30 f31633t;

    /* renamed from: u */
    public final wj1 f31634u;

    /* renamed from: com.daaw.wx1$a */
    /* loaded from: classes.dex */
    public class RunnableC3479a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ sb1 f31635p;

        public RunnableC3479a(sb1 sb1Var) {
            this.f31635p = sb1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31635p.mo10471s(wx1.this.f31632s.getForegroundInfoAsync());
        }
    }

    /* renamed from: com.daaw.wx1$b */
    /* loaded from: classes.dex */
    public class RunnableC3480b implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ sb1 f31637p;

        public RunnableC3480b(sb1 sb1Var) {
            this.f31637p = sb1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                g30 g30Var = (g30) this.f31637p.get();
                if (g30Var == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", wx1.this.f31631r.f24626c));
                }
                ll0.m16885c().mo16882a(wx1.f31628v, String.format("Updating notification for %s", wx1.this.f31631r.f24626c), new Throwable[0]);
                wx1.this.f31632s.setRunInForeground(true);
                wx1 wx1Var = wx1.this;
                wx1Var.f31629p.mo10471s(wx1Var.f31633t.mo4415a(wx1Var.f31630q, wx1Var.f31632s.getId(), g30Var));
            } catch (Throwable th) {
                wx1.this.f31629p.mo10472r(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public wx1(Context context, qy1 qy1Var, ListenableWorker listenableWorker, j30 j30Var, wj1 wj1Var) {
        this.f31630q = context;
        this.f31631r = qy1Var;
        this.f31632s = listenableWorker;
        this.f31633t = j30Var;
        this.f31634u = wj1Var;
    }

    /* renamed from: a */
    public fk0<Void> m5733a() {
        return this.f31629p;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f31631r.f24640q || C3523xc.m5291b()) {
            this.f31629p.mo10473q(null);
            return;
        }
        sb1 m10470u = sb1.m10470u();
        this.f31634u.mo6052a().execute(new RunnableC3479a(m10470u));
        m10470u.mo14694d(new RunnableC3480b(m10470u), this.f31634u.mo6052a());
    }
}
