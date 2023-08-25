package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public class zy1 implements Runnable {
    public static final String I = ll0.f("WorkerWrapper");
    public ry1 A;
    public bt B;
    public uy1 C;
    public List<String> D;
    public String E;
    public volatile boolean H;
    public Context p;
    public String q;
    public List<r81> r;
    public WorkerParameters.a s;
    public qy1 t;
    public ListenableWorker u;
    public wj1 v;
    public androidx.work.a x;
    public i30 y;
    public WorkDatabase z;
    public ListenableWorker.a w = ListenableWorker.a.a();
    public sb1<Boolean> F = sb1.u();
    public fk0<ListenableWorker.a> G = null;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ fk0 p;
        public final /* synthetic */ sb1 q;

        public a(fk0 fk0Var, sb1 sb1Var) {
            this.p = fk0Var;
            this.q = sb1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.p.get();
                ll0.c().a(zy1.I, String.format("Starting work for %s", zy1.this.t.c), new Throwable[0]);
                zy1 zy1Var = zy1.this;
                zy1Var.G = zy1Var.u.startWork();
                this.q.s(zy1.this.G);
            } catch (Throwable th) {
                this.q.r(th);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ sb1 p;
        public final /* synthetic */ String q;

        public b(sb1 sb1Var, String str) {
            this.p = sb1Var;
            this.q = str;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.p.get();
                    if (aVar == null) {
                        ll0.c().b(zy1.I, String.format("%s returned a null result. Treating it as a failure.", zy1.this.t.c), new Throwable[0]);
                    } else {
                        ll0.c().a(zy1.I, String.format("%s returned a %s result.", zy1.this.t.c, aVar), new Throwable[0]);
                        zy1.this.w = aVar;
                    }
                } catch (InterruptedException e) {
                    e = e;
                    ll0.c().b(zy1.I, String.format("%s failed because it threw an exception/error", this.q), e);
                } catch (CancellationException e2) {
                    ll0.c().d(zy1.I, String.format("%s was cancelled", this.q), e2);
                } catch (ExecutionException e3) {
                    e = e3;
                    ll0.c().b(zy1.I, String.format("%s failed because it threw an exception/error", this.q), e);
                }
            } finally {
                zy1.this.f();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public Context a;
        public ListenableWorker b;
        public i30 c;
        public wj1 d;
        public androidx.work.a e;
        public WorkDatabase f;
        public String g;
        public List<r81> h;
        public WorkerParameters.a i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, wj1 wj1Var, i30 i30Var, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.d = wj1Var;
            this.c = i30Var;
            this.e = aVar;
            this.f = workDatabase;
            this.g = str;
        }

        public zy1 a() {
            return new zy1(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.i = aVar;
            }
            return this;
        }

        public c c(List<r81> list) {
            this.h = list;
            return this;
        }
    }

    public zy1(c cVar) {
        this.p = cVar.a;
        this.v = cVar.d;
        this.y = cVar.c;
        this.q = cVar.g;
        this.r = cVar.h;
        this.s = cVar.i;
        this.u = cVar.b;
        this.x = cVar.e;
        WorkDatabase workDatabase = cVar.f;
        this.z = workDatabase;
        this.A = workDatabase.B();
        this.B = this.z.t();
        this.C = this.z.C();
    }

    public final String a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.q);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    public fk0<Boolean> b() {
        return this.F;
    }

    public final void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            ll0.c().d(I, String.format("Worker result SUCCESS for %s", this.E), new Throwable[0]);
            if (!this.t.d()) {
                m();
                return;
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            ll0.c().d(I, String.format("Worker result RETRY for %s", this.E), new Throwable[0]);
            g();
            return;
        } else {
            ll0.c().d(I, String.format("Worker result FAILURE for %s", this.E), new Throwable[0]);
            if (!this.t.d()) {
                l();
                return;
            }
        }
        h();
    }

    public void d() {
        boolean z;
        this.H = true;
        n();
        fk0<ListenableWorker.a> fk0Var = this.G;
        if (fk0Var != null) {
            z = fk0Var.isDone();
            this.G.cancel(true);
        } else {
            z = false;
        }
        ListenableWorker listenableWorker = this.u;
        if (listenableWorker == null || z) {
            ll0.c().a(I, String.format("WorkSpec %s is already done. Not interrupting.", this.t), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
    }

    public final void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.A.l(str2) != yx1.CANCELLED) {
                this.A.k(yx1.FAILED, str2);
            }
            linkedList.addAll(this.B.a(str2));
        }
    }

    public void f() {
        if (!n()) {
            this.z.c();
            try {
                yx1 l = this.A.l(this.q);
                this.z.A().a(this.q);
                if (l == null) {
                    i(false);
                } else if (l == yx1.RUNNING) {
                    c(this.w);
                } else if (!l.a()) {
                    g();
                }
                this.z.r();
            } finally {
                this.z.g();
            }
        }
        List<r81> list = this.r;
        if (list != null) {
            for (r81 r81Var : list) {
                r81Var.d(this.q);
            }
            v81.b(this.x, this.z, this.r);
        }
    }

    public final void g() {
        this.z.c();
        try {
            this.A.k(yx1.ENQUEUED, this.q);
            this.A.s(this.q, System.currentTimeMillis());
            this.A.b(this.q, -1L);
            this.z.r();
        } finally {
            this.z.g();
            i(true);
        }
    }

    public final void h() {
        this.z.c();
        try {
            this.A.s(this.q, System.currentTimeMillis());
            this.A.k(yx1.ENQUEUED, this.q);
            this.A.n(this.q);
            this.A.b(this.q, -1L);
            this.z.r();
        } finally {
            this.z.g();
            i(false);
        }
    }

    public final void i(boolean z) {
        ListenableWorker listenableWorker;
        this.z.c();
        try {
            if (!this.z.B().i()) {
                hv0.a(this.p, RescheduleReceiver.class, false);
            }
            if (z) {
                this.A.k(yx1.ENQUEUED, this.q);
                this.A.b(this.q, -1L);
            }
            if (this.t != null && (listenableWorker = this.u) != null && listenableWorker.isRunInForeground()) {
                this.y.b(this.q);
            }
            this.z.r();
            this.z.g();
            this.F.q(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.z.g();
            throw th;
        }
    }

    public final void j() {
        yx1 l = this.A.l(this.q);
        if (l == yx1.RUNNING) {
            ll0.c().a(I, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.q), new Throwable[0]);
            i(true);
            return;
        }
        ll0.c().a(I, String.format("Status for %s is %s; not doing any work", this.q, l), new Throwable[0]);
        i(false);
    }

    public final void k() {
        androidx.work.b b2;
        if (n()) {
            return;
        }
        this.z.c();
        try {
            qy1 m = this.A.m(this.q);
            this.t = m;
            if (m == null) {
                ll0.c().b(I, String.format("Didn't find WorkSpec for id %s", this.q), new Throwable[0]);
                i(false);
                this.z.r();
            } else if (m.b != yx1.ENQUEUED) {
                j();
                this.z.r();
                ll0.c().a(I, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.t.c), new Throwable[0]);
            } else {
                if (m.d() || this.t.c()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    qy1 qy1Var = this.t;
                    if (!(qy1Var.n == 0) && currentTimeMillis < qy1Var.a()) {
                        ll0.c().a(I, String.format("Delaying execution for %s because it is being executed before schedule.", this.t.c), new Throwable[0]);
                        i(true);
                        this.z.r();
                        return;
                    }
                }
                this.z.r();
                this.z.g();
                if (this.t.d()) {
                    b2 = this.t.e;
                } else {
                    cg0 b3 = this.x.f().b(this.t.d);
                    if (b3 == null) {
                        ll0.c().b(I, String.format("Could not create Input Merger %s", this.t.d), new Throwable[0]);
                        l();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.t.e);
                    arrayList.addAll(this.A.p(this.q));
                    b2 = b3.b(arrayList);
                }
                WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.q), b2, this.D, this.s, this.t.k, this.x.e(), this.v, this.x.m(), new my1(this.z, this.v), new xx1(this.z, this.y, this.v));
                if (this.u == null) {
                    this.u = this.x.m().b(this.p, this.t.c, workerParameters);
                }
                ListenableWorker listenableWorker = this.u;
                if (listenableWorker == null) {
                    ll0.c().b(I, String.format("Could not create Worker %s", this.t.c), new Throwable[0]);
                    l();
                } else if (listenableWorker.isUsed()) {
                    ll0.c().b(I, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.t.c), new Throwable[0]);
                    l();
                } else {
                    this.u.setUsed();
                    if (!o()) {
                        j();
                    } else if (n()) {
                    } else {
                        sb1 u = sb1.u();
                        wx1 wx1Var = new wx1(this.p, this.t, this.u, workerParameters.b(), this.v);
                        this.v.a().execute(wx1Var);
                        fk0<Void> a2 = wx1Var.a();
                        a2.d(new a(a2, u), this.v.a());
                        u.d(new b(u, this.E), this.v.c());
                    }
                }
            }
        } finally {
            this.z.g();
        }
    }

    public void l() {
        this.z.c();
        try {
            e(this.q);
            this.A.g(this.q, ((ListenableWorker.a.C0031a) this.w).e());
            this.z.r();
        } finally {
            this.z.g();
            i(false);
        }
    }

    public final void m() {
        this.z.c();
        try {
            this.A.k(yx1.SUCCEEDED, this.q);
            this.A.g(this.q, ((ListenableWorker.a.c) this.w).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.B.a(this.q)) {
                if (this.A.l(str) == yx1.BLOCKED && this.B.b(str)) {
                    ll0.c().d(I, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.A.k(yx1.ENQUEUED, str);
                    this.A.s(str, currentTimeMillis);
                }
            }
            this.z.r();
        } finally {
            this.z.g();
            i(false);
        }
    }

    public final boolean n() {
        if (this.H) {
            ll0.c().a(I, String.format("Work interrupted for %s", this.E), new Throwable[0]);
            yx1 l = this.A.l(this.q);
            if (l == null) {
                i(false);
            } else {
                i(!l.a());
            }
            return true;
        }
        return false;
    }

    public final boolean o() {
        this.z.c();
        try {
            boolean z = true;
            if (this.A.l(this.q) == yx1.ENQUEUED) {
                this.A.k(yx1.RUNNING, this.q);
                this.A.r(this.q);
            } else {
                z = false;
            }
            this.z.r();
            return z;
        } finally {
            this.z.g();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> a2 = this.C.a(this.q);
        this.D = a2;
        this.E = a(a2);
        k();
    }
}
