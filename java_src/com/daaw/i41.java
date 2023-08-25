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

    /* renamed from: a */
    public final double f13233a;

    /* renamed from: b */
    public final double f13234b;

    /* renamed from: c */
    public final long f13235c;

    /* renamed from: d */
    public final int f13236d;

    /* renamed from: e */
    public final BlockingQueue<Runnable> f13237e;

    /* renamed from: f */
    public final ThreadPoolExecutor f13238f;

    /* renamed from: g */
    public final qn1<AbstractC2057lm> f13239g;

    /* renamed from: h */
    public final fu0 f13240h;

    /* renamed from: i */
    public int f13241i;

    /* renamed from: j */
    public long f13242j;

    /* renamed from: com.daaw.i41$b */
    /* loaded from: classes2.dex */
    public final class RunnableC1657b implements Runnable {

        /* renamed from: p */
        public final AbstractC3878zm f13243p;

        /* renamed from: q */
        public final tj1<AbstractC3878zm> f13244q;

        public RunnableC1657b(AbstractC3878zm abstractC3878zm, tj1<AbstractC3878zm> tj1Var) {
            this.f13243p = abstractC3878zm;
            this.f13244q = tj1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            i41.this.m20128p(this.f13243p, this.f13244q);
            i41.this.f13240h.m22263c();
            double m20137g = i41.this.m20137g();
            ml0 m15976f = ml0.m15976f();
            m15976f.m15980b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(m20137g / 1000.0d)) + " s for report: " + this.f13243p.mo2116d());
            i41.m20127q(m20137g);
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public i41(double d, double d2, long j, qn1<AbstractC2057lm> qn1Var, fu0 fu0Var) {
        this.f13233a = d;
        this.f13234b = d2;
        this.f13235c = j;
        this.f13239g = qn1Var;
        this.f13240h = fu0Var;
        int i = (int) d;
        this.f13236d = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f13237e = arrayBlockingQueue;
        this.f13238f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f13241i = 0;
        this.f13242j = 0L;
    }

    public i41(qn1<AbstractC2057lm> qn1Var, tb1 tb1Var, fu0 fu0Var) {
        this(tb1Var.f27204f, tb1Var.f27205g, tb1Var.f27206h * 1000, qn1Var, fu0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m20131m(CountDownLatch countDownLatch) {
        f30.m22949b(this.f13239g, cz0.HIGHEST);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m20130n(tj1 tj1Var, AbstractC3878zm abstractC3878zm, Exception exc) {
        if (exc != null) {
            tj1Var.m9079d(exc);
            return;
        }
        m20134j();
        tj1Var.m9078e(abstractC3878zm);
    }

    /* renamed from: q */
    public static void m20127q(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: g */
    public final double m20137g() {
        return Math.min(3600000.0d, (60000.0d / this.f13233a) * Math.pow(this.f13234b, m20136h()));
    }

    /* renamed from: h */
    public final int m20136h() {
        if (this.f13242j == 0) {
            this.f13242j = m20129o();
        }
        int m20129o = (int) ((m20129o() - this.f13242j) / this.f13235c);
        int min = m20132l() ? Math.min(100, this.f13241i + m20129o) : Math.max(0, this.f13241i - m20129o);
        if (this.f13241i != min) {
            this.f13241i = min;
            this.f13242j = m20129o();
        }
        return min;
    }

    /* renamed from: i */
    public tj1<AbstractC3878zm> m20135i(AbstractC3878zm abstractC3878zm, boolean z) {
        synchronized (this.f13237e) {
            tj1<AbstractC3878zm> tj1Var = new tj1<>();
            if (!z) {
                m20128p(abstractC3878zm, tj1Var);
                return tj1Var;
            }
            this.f13240h.m22264b();
            if (!m20133k()) {
                m20136h();
                ml0 m15976f = ml0.m15976f();
                m15976f.m15980b("Dropping report due to queue being full: " + abstractC3878zm.mo2116d());
                this.f13240h.m22265a();
                tj1Var.m9078e(abstractC3878zm);
                return tj1Var;
            }
            ml0 m15976f2 = ml0.m15976f();
            m15976f2.m15980b("Enqueueing report: " + abstractC3878zm.mo2116d());
            ml0 m15976f3 = ml0.m15976f();
            m15976f3.m15980b("Queue size: " + this.f13237e.size());
            this.f13238f.execute(new RunnableC1657b(abstractC3878zm, tj1Var));
            ml0 m15976f4 = ml0.m15976f();
            m15976f4.m15980b("Closing task for report: " + abstractC3878zm.mo2116d());
            tj1Var.m9078e(abstractC3878zm);
            return tj1Var;
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    /* renamed from: j */
    public void m20134j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: com.daaw.h41
            @Override // java.lang.Runnable
            public final void run() {
                i41.this.m20131m(countDownLatch);
            }
        }).start();
        yq1.m3443e(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    /* renamed from: k */
    public final boolean m20133k() {
        return this.f13237e.size() < this.f13236d;
    }

    /* renamed from: l */
    public final boolean m20132l() {
        return this.f13237e.size() == this.f13236d;
    }

    /* renamed from: o */
    public final long m20129o() {
        return System.currentTimeMillis();
    }

    /* renamed from: p */
    public final void m20128p(final AbstractC3878zm abstractC3878zm, final tj1<AbstractC3878zm> tj1Var) {
        ml0 m15976f = ml0.m15976f();
        m15976f.m15980b("Sending report through Google DataTransport: " + abstractC3878zm.mo2116d());
        this.f13239g.mo6999a(AbstractC3649xx.m4416d(abstractC3878zm.mo2118b()), new ao1() { // from class: com.daaw.g41
            @Override // com.daaw.ao1
            /* renamed from: a */
            public final void mo21970a(Exception exc) {
                i41.this.m20130n(tj1Var, abstractC3878zm, exc);
            }
        });
    }
}
