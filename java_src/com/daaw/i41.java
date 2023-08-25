package com.daaw;

import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class i41 {
    public final double a;
    public final double b;
    public final long c;
    public final int d;
    public final BlockingQueue<Runnable> e;
    public final ThreadPoolExecutor f;
    public final qn1<lm> g;
    public final fu0 h;
    public int i;
    public long j;

    /* loaded from: classes2.dex */
    public final class b implements Runnable {
        public final zm p;
        public final tj1<zm> q;

        public b(zm zmVar, tj1<zm> tj1Var) {
            this.p = zmVar;
            this.q = tj1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            i41.this.p(this.p, this.q);
            i41.this.h.c();
            double g = i41.this.g();
            ml0 f = ml0.f();
            f.b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(g / 1000.0d)) + " s for report: " + this.p.d());
            i41.q(g);
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public i41(double d, double d2, long j, qn1<lm> qn1Var, fu0 fu0Var) {
        this.a = d;
        this.b = d2;
        this.c = j;
        this.g = qn1Var;
        this.h = fu0Var;
        int i = (int) d;
        this.d = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.e = arrayBlockingQueue;
        this.f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.i = 0;
        this.j = 0L;
    }

    public i41(qn1<lm> qn1Var, tb1 tb1Var, fu0 fu0Var) {
        this(tb1Var.f, tb1Var.g, tb1Var.h * 1000, qn1Var, fu0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        f30.b(this.g, cz0.HIGHEST);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(tj1 tj1Var, zm zmVar, Exception exc) {
        if (exc != null) {
            tj1Var.d(exc);
            return;
        }
        j();
        tj1Var.e(zmVar);
    }

    public static void q(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    public final double g() {
        return Math.min(3600000.0d, (60000.0d / this.a) * Math.pow(this.b, h()));
    }

    public final int h() {
        if (this.j == 0) {
            this.j = o();
        }
        int o = (int) ((o() - this.j) / this.c);
        int min = l() ? Math.min(100, this.i + o) : Math.max(0, this.i - o);
        if (this.i != min) {
            this.i = min;
            this.j = o();
        }
        return min;
    }

    public tj1<zm> i(zm zmVar, boolean z) {
        synchronized (this.e) {
            tj1<zm> tj1Var = new tj1<>();
            if (!z) {
                p(zmVar, tj1Var);
                return tj1Var;
            }
            this.h.b();
            if (!k()) {
                h();
                ml0 f = ml0.f();
                f.b("Dropping report due to queue being full: " + zmVar.d());
                this.h.a();
                tj1Var.e(zmVar);
                return tj1Var;
            }
            ml0 f2 = ml0.f();
            f2.b("Enqueueing report: " + zmVar.d());
            ml0 f3 = ml0.f();
            f3.b("Queue size: " + this.e.size());
            this.f.execute(new b(zmVar, tj1Var));
            ml0 f4 = ml0.f();
            f4.b("Closing task for report: " + zmVar.d());
            tj1Var.e(zmVar);
            return tj1Var;
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: com.daaw.h41
            @Override // java.lang.Runnable
            public final void run() {
                i41.this.m(countDownLatch);
            }
        }).start();
        yq1.e(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    public final boolean k() {
        return this.e.size() < this.d;
    }

    public final boolean l() {
        return this.e.size() == this.d;
    }

    public final long o() {
        return System.currentTimeMillis();
    }

    public final void p(final zm zmVar, final tj1<zm> tj1Var) {
        ml0 f = ml0.f();
        f.b("Sending report through Google DataTransport: " + zmVar.d());
        this.g.a(xx.d(zmVar.b()), new ao1() { // from class: com.daaw.g41
            @Override // com.daaw.ao1
            public final void a(Exception exc) {
                i41.this.n(tj1Var, zmVar, exc);
            }
        });
    }
}
