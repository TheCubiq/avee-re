package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C0507a;
import androidx.work.C0511b;
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

    /* renamed from: I */
    public static final String f35642I = ll0.m16883f("WorkerWrapper");

    /* renamed from: A */
    public ry1 f35643A;

    /* renamed from: B */
    public InterfaceC0885bt f35644B;

    /* renamed from: C */
    public uy1 f35645C;

    /* renamed from: D */
    public List<String> f35646D;

    /* renamed from: E */
    public String f35647E;

    /* renamed from: H */
    public volatile boolean f35650H;

    /* renamed from: p */
    public Context f35651p;

    /* renamed from: q */
    public String f35652q;

    /* renamed from: r */
    public List<r81> f35653r;

    /* renamed from: s */
    public WorkerParameters.C0506a f35654s;

    /* renamed from: t */
    public qy1 f35655t;

    /* renamed from: u */
    public ListenableWorker f35656u;

    /* renamed from: v */
    public wj1 f35657v;

    /* renamed from: x */
    public C0507a f35659x;

    /* renamed from: y */
    public i30 f35660y;

    /* renamed from: z */
    public WorkDatabase f35661z;

    /* renamed from: w */
    public ListenableWorker.AbstractC0501a f35658w = ListenableWorker.AbstractC0501a.m28006a();

    /* renamed from: F */
    public sb1<Boolean> f35648F = sb1.m10470u();

    /* renamed from: G */
    public fk0<ListenableWorker.AbstractC0501a> f35649G = null;

    /* renamed from: com.daaw.zy1$a */
    /* loaded from: classes.dex */
    public class RunnableC3916a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ fk0 f35662p;

        /* renamed from: q */
        public final /* synthetic */ sb1 f35663q;

        public RunnableC3916a(fk0 fk0Var, sb1 sb1Var) {
            this.f35662p = fk0Var;
            this.f35663q = sb1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f35662p.get();
                ll0.m16885c().mo16882a(zy1.f35642I, String.format("Starting work for %s", zy1.this.f35655t.f24626c), new Throwable[0]);
                zy1 zy1Var = zy1.this;
                zy1Var.f35649G = zy1Var.f35656u.startWork();
                this.f35663q.mo10471s(zy1.this.f35649G);
            } catch (Throwable th) {
                this.f35663q.mo10472r(th);
            }
        }
    }

    /* renamed from: com.daaw.zy1$b */
    /* loaded from: classes.dex */
    public class RunnableC3917b implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ sb1 f35665p;

        /* renamed from: q */
        public final /* synthetic */ String f35666q;

        public RunnableC3917b(sb1 sb1Var, String str) {
            this.f35665p = sb1Var;
            this.f35666q = str;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.AbstractC0501a abstractC0501a = (ListenableWorker.AbstractC0501a) this.f35665p.get();
                    if (abstractC0501a == null) {
                        ll0.m16885c().mo16881b(zy1.f35642I, String.format("%s returned a null result. Treating it as a failure.", zy1.this.f35655t.f24626c), new Throwable[0]);
                    } else {
                        ll0.m16885c().mo16882a(zy1.f35642I, String.format("%s returned a %s result.", zy1.this.f35655t.f24626c, abstractC0501a), new Throwable[0]);
                        zy1.this.f35658w = abstractC0501a;
                    }
                } catch (InterruptedException e) {
                    e = e;
                    ll0.m16885c().mo16881b(zy1.f35642I, String.format("%s failed because it threw an exception/error", this.f35666q), e);
                } catch (CancellationException e2) {
                    ll0.m16885c().mo16880d(zy1.f35642I, String.format("%s was cancelled", this.f35666q), e2);
                } catch (ExecutionException e3) {
                    e = e3;
                    ll0.m16885c().mo16881b(zy1.f35642I, String.format("%s failed because it threw an exception/error", this.f35666q), e);
                }
            } finally {
                zy1.this.m1785f();
            }
        }
    }

    /* renamed from: com.daaw.zy1$c */
    /* loaded from: classes.dex */
    public static class C3918c {

        /* renamed from: a */
        public Context f35668a;

        /* renamed from: b */
        public ListenableWorker f35669b;

        /* renamed from: c */
        public i30 f35670c;

        /* renamed from: d */
        public wj1 f35671d;

        /* renamed from: e */
        public C0507a f35672e;

        /* renamed from: f */
        public WorkDatabase f35673f;

        /* renamed from: g */
        public String f35674g;

        /* renamed from: h */
        public List<r81> f35675h;

        /* renamed from: i */
        public WorkerParameters.C0506a f35676i = new WorkerParameters.C0506a();

        public C3918c(Context context, C0507a c0507a, wj1 wj1Var, i30 i30Var, WorkDatabase workDatabase, String str) {
            this.f35668a = context.getApplicationContext();
            this.f35671d = wj1Var;
            this.f35670c = i30Var;
            this.f35672e = c0507a;
            this.f35673f = workDatabase;
            this.f35674g = str;
        }

        /* renamed from: a */
        public zy1 m1775a() {
            return new zy1(this);
        }

        /* renamed from: b */
        public C3918c m1774b(WorkerParameters.C0506a c0506a) {
            if (c0506a != null) {
                this.f35676i = c0506a;
            }
            return this;
        }

        /* renamed from: c */
        public C3918c m1773c(List<r81> list) {
            this.f35675h = list;
            return this;
        }
    }

    public zy1(C3918c c3918c) {
        this.f35651p = c3918c.f35668a;
        this.f35657v = c3918c.f35671d;
        this.f35660y = c3918c.f35670c;
        this.f35652q = c3918c.f35674g;
        this.f35653r = c3918c.f35675h;
        this.f35654s = c3918c.f35676i;
        this.f35656u = c3918c.f35669b;
        this.f35659x = c3918c.f35672e;
        WorkDatabase workDatabase = c3918c.f35673f;
        this.f35661z = workDatabase;
        this.f35643A = workDatabase.mo27951B();
        this.f35644B = this.f35661z.mo27938t();
        this.f35645C = this.f35661z.mo27950C();
    }

    /* renamed from: a */
    public final String m1790a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f35652q);
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

    /* renamed from: b */
    public fk0<Boolean> m1789b() {
        return this.f35648F;
    }

    /* renamed from: c */
    public final void m1788c(ListenableWorker.AbstractC0501a abstractC0501a) {
        if (abstractC0501a instanceof ListenableWorker.AbstractC0501a.C0504c) {
            ll0.m16885c().mo16880d(f35642I, String.format("Worker result SUCCESS for %s", this.f35647E), new Throwable[0]);
            if (!this.f35655t.m11935d()) {
                m1778m();
                return;
            }
        } else if (abstractC0501a instanceof ListenableWorker.AbstractC0501a.C0503b) {
            ll0.m16885c().mo16880d(f35642I, String.format("Worker result RETRY for %s", this.f35647E), new Throwable[0]);
            m1784g();
            return;
        } else {
            ll0.m16885c().mo16880d(f35642I, String.format("Worker result FAILURE for %s", this.f35647E), new Throwable[0]);
            if (!this.f35655t.m11935d()) {
                m1779l();
                return;
            }
        }
        m1783h();
    }

    /* renamed from: d */
    public void m1787d() {
        boolean z;
        this.f35650H = true;
        m1777n();
        fk0<ListenableWorker.AbstractC0501a> fk0Var = this.f35649G;
        if (fk0Var != null) {
            z = fk0Var.isDone();
            this.f35649G.cancel(true);
        } else {
            z = false;
        }
        ListenableWorker listenableWorker = this.f35656u;
        if (listenableWorker == null || z) {
            ll0.m16885c().mo16882a(f35642I, String.format("WorkSpec %s is already done. Not interrupting.", this.f35655t), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
    }

    /* renamed from: e */
    public final void m1786e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f35643A.mo9720l(str2) != yx1.CANCELLED) {
                this.f35643A.mo9721k(yx1.FAILED, str2);
            }
            linkedList.addAll(this.f35644B.mo24984a(str2));
        }
    }

    /* renamed from: f */
    public void m1785f() {
        if (!m1777n()) {
            this.f35661z.m26481c();
            try {
                yx1 mo9720l = this.f35643A.mo9720l(this.f35652q);
                this.f35661z.mo27952A().mo16378a(this.f35652q);
                if (mo9720l == null) {
                    m1782i(false);
                } else if (mo9720l == yx1.RUNNING) {
                    m1788c(this.f35658w);
                } else if (!mo9720l.m3106a()) {
                    m1784g();
                }
                this.f35661z.m26466r();
            } finally {
                this.f35661z.m26477g();
            }
        }
        List<r81> list = this.f35653r;
        if (list != null) {
            for (r81 r81Var : list) {
                r81Var.mo9088d(this.f35652q);
            }
            v81.m7346b(this.f35659x, this.f35661z, this.f35653r);
        }
    }

    /* renamed from: g */
    public final void m1784g() {
        this.f35661z.m26481c();
        try {
            this.f35643A.mo9721k(yx1.ENQUEUED, this.f35652q);
            this.f35643A.mo9713s(this.f35652q, System.currentTimeMillis());
            this.f35643A.mo9730b(this.f35652q, -1L);
            this.f35661z.m26466r();
        } finally {
            this.f35661z.m26477g();
            m1782i(true);
        }
    }

    /* renamed from: h */
    public final void m1783h() {
        this.f35661z.m26481c();
        try {
            this.f35643A.mo9713s(this.f35652q, System.currentTimeMillis());
            this.f35643A.mo9721k(yx1.ENQUEUED, this.f35652q);
            this.f35643A.mo9718n(this.f35652q);
            this.f35643A.mo9730b(this.f35652q, -1L);
            this.f35661z.m26466r();
        } finally {
            this.f35661z.m26477g();
            m1782i(false);
        }
    }

    /* renamed from: i */
    public final void m1782i(boolean z) {
        ListenableWorker listenableWorker;
        this.f35661z.m26481c();
        try {
            if (!this.f35661z.mo27951B().mo9723i()) {
                hv0.m20390a(this.f35651p, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f35643A.mo9721k(yx1.ENQUEUED, this.f35652q);
                this.f35643A.mo9730b(this.f35652q, -1L);
            }
            if (this.f35655t != null && (listenableWorker = this.f35656u) != null && listenableWorker.isRunInForeground()) {
                this.f35660y.mo18159b(this.f35652q);
            }
            this.f35661z.m26466r();
            this.f35661z.m26477g();
            this.f35648F.mo10473q(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f35661z.m26477g();
            throw th;
        }
    }

    /* renamed from: j */
    public final void m1781j() {
        yx1 mo9720l = this.f35643A.mo9720l(this.f35652q);
        if (mo9720l == yx1.RUNNING) {
            ll0.m16885c().mo16882a(f35642I, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f35652q), new Throwable[0]);
            m1782i(true);
            return;
        }
        ll0.m16885c().mo16882a(f35642I, String.format("Status for %s is %s; not doing any work", this.f35652q, mo9720l), new Throwable[0]);
        m1782i(false);
    }

    /* renamed from: k */
    public final void m1780k() {
        C0511b mo25393b;
        if (m1777n()) {
            return;
        }
        this.f35661z.m26481c();
        try {
            qy1 mo9719m = this.f35643A.mo9719m(this.f35652q);
            this.f35655t = mo9719m;
            if (mo9719m == null) {
                ll0.m16885c().mo16881b(f35642I, String.format("Didn't find WorkSpec for id %s", this.f35652q), new Throwable[0]);
                m1782i(false);
                this.f35661z.m26466r();
            } else if (mo9719m.f24625b != yx1.ENQUEUED) {
                m1781j();
                this.f35661z.m26466r();
                ll0.m16885c().mo16882a(f35642I, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f35655t.f24626c), new Throwable[0]);
            } else {
                if (mo9719m.m11935d() || this.f35655t.m11936c()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    qy1 qy1Var = this.f35655t;
                    if (!(qy1Var.f24637n == 0) && currentTimeMillis < qy1Var.m11938a()) {
                        ll0.m16885c().mo16882a(f35642I, String.format("Delaying execution for %s because it is being executed before schedule.", this.f35655t.f24626c), new Throwable[0]);
                        m1782i(true);
                        this.f35661z.m26466r();
                        return;
                    }
                }
                this.f35661z.m26466r();
                this.f35661z.m26477g();
                if (this.f35655t.m11935d()) {
                    mo25393b = this.f35655t.f24628e;
                } else {
                    cg0 m24421b = this.f35659x.m27982f().m24421b(this.f35655t.f24627d);
                    if (m24421b == null) {
                        ll0.m16885c().mo16881b(f35642I, String.format("Could not create Input Merger %s", this.f35655t.f24627d), new Throwable[0]);
                        m1779l();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f35655t.f24628e);
                    arrayList.addAll(this.f35643A.mo9716p(this.f35652q));
                    mo25393b = m24421b.mo25393b(arrayList);
                }
                WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f35652q), mo25393b, this.f35646D, this.f35654s, this.f35655t.f24634k, this.f35659x.m27983e(), this.f35657v, this.f35659x.m27975m(), new my1(this.f35661z, this.f35657v), new xx1(this.f35661z, this.f35660y, this.f35657v));
                if (this.f35656u == null) {
                    this.f35656u = this.f35659x.m27975m().m3079b(this.f35651p, this.f35655t.f24626c, workerParameters);
                }
                ListenableWorker listenableWorker = this.f35656u;
                if (listenableWorker == null) {
                    ll0.m16885c().mo16881b(f35642I, String.format("Could not create Worker %s", this.f35655t.f24626c), new Throwable[0]);
                    m1779l();
                } else if (listenableWorker.isUsed()) {
                    ll0.m16885c().mo16881b(f35642I, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f35655t.f24626c), new Throwable[0]);
                    m1779l();
                } else {
                    this.f35656u.setUsed();
                    if (!m1776o()) {
                        m1781j();
                    } else if (m1777n()) {
                    } else {
                        sb1 m10470u = sb1.m10470u();
                        wx1 wx1Var = new wx1(this.f35651p, this.f35655t, this.f35656u, workerParameters.m27998b(), this.f35657v);
                        this.f35657v.mo6052a().execute(wx1Var);
                        fk0<Void> m5733a = wx1Var.m5733a();
                        m5733a.mo14694d(new RunnableC3916a(m5733a, m10470u), this.f35657v.mo6052a());
                        m10470u.mo14694d(new RunnableC3917b(m10470u, this.f35647E), this.f35657v.mo6050c());
                    }
                }
            }
        } finally {
            this.f35661z.m26477g();
        }
    }

    /* renamed from: l */
    public void m1779l() {
        this.f35661z.m26481c();
        try {
            m1786e(this.f35652q);
            this.f35643A.mo9725g(this.f35652q, ((ListenableWorker.AbstractC0501a.C0502a) this.f35658w).m28002e());
            this.f35661z.m26466r();
        } finally {
            this.f35661z.m26477g();
            m1782i(false);
        }
    }

    /* renamed from: m */
    public final void m1778m() {
        this.f35661z.m26481c();
        try {
            this.f35643A.mo9721k(yx1.SUCCEEDED, this.f35652q);
            this.f35643A.mo9725g(this.f35652q, ((ListenableWorker.AbstractC0501a.C0504c) this.f35658w).m28001e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f35644B.mo24984a(this.f35652q)) {
                if (this.f35643A.mo9720l(str) == yx1.BLOCKED && this.f35644B.mo24983b(str)) {
                    ll0.m16885c().mo16880d(f35642I, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f35643A.mo9721k(yx1.ENQUEUED, str);
                    this.f35643A.mo9713s(str, currentTimeMillis);
                }
            }
            this.f35661z.m26466r();
        } finally {
            this.f35661z.m26477g();
            m1782i(false);
        }
    }

    /* renamed from: n */
    public final boolean m1777n() {
        if (this.f35650H) {
            ll0.m16885c().mo16882a(f35642I, String.format("Work interrupted for %s", this.f35647E), new Throwable[0]);
            yx1 mo9720l = this.f35643A.mo9720l(this.f35652q);
            if (mo9720l == null) {
                m1782i(false);
            } else {
                m1782i(!mo9720l.m3106a());
            }
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m1776o() {
        this.f35661z.m26481c();
        try {
            boolean z = true;
            if (this.f35643A.mo9720l(this.f35652q) == yx1.ENQUEUED) {
                this.f35643A.mo9721k(yx1.RUNNING, this.f35652q);
                this.f35643A.mo9714r(this.f35652q);
            } else {
                z = false;
            }
            this.f35661z.m26466r();
            return z;
        } finally {
            this.f35661z.m26477g();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> mo6670a = this.f35645C.mo6670a(this.f35652q);
        this.f35646D = mo6670a;
        this.f35647E = m1790a(mo6670a);
        m1780k();
    }
}
