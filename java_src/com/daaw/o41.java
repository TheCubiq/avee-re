package com.daaw;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class o41<T, R> implements x50<R>, Runnable {

    /* renamed from: A */
    public static final C2406a f21022A = new C2406a();

    /* renamed from: p */
    public final Handler f21023p;

    /* renamed from: q */
    public final int f21024q;

    /* renamed from: r */
    public final int f21025r;

    /* renamed from: s */
    public final boolean f21026s;

    /* renamed from: t */
    public final C2406a f21027t;

    /* renamed from: u */
    public R f21028u;

    /* renamed from: v */
    public l41 f21029v;

    /* renamed from: w */
    public boolean f21030w;

    /* renamed from: x */
    public Exception f21031x;

    /* renamed from: y */
    public boolean f21032y;

    /* renamed from: z */
    public boolean f21033z;

    /* renamed from: com.daaw.o41$a */
    /* loaded from: classes.dex */
    public static class C2406a {
        /* renamed from: a */
        public void m14565a(Object obj) {
            obj.notifyAll();
        }

        /* renamed from: b */
        public void m14564b(Object obj, long j) {
            obj.wait(j);
        }
    }

    public o41(Handler handler, int i, int i2) {
        this(handler, i, i2, true, f21022A);
    }

    public o41(Handler handler, int i, int i2, boolean z, C2406a c2406a) {
        this.f21023p = handler;
        this.f21024q = i;
        this.f21025r = i2;
        this.f21026s = z;
        this.f21027t = c2406a;
    }

    @Override // com.daaw.qj0
    /* renamed from: a */
    public void mo3969a() {
    }

    @Override // com.daaw.pj1
    /* renamed from: b */
    public void mo3968b(l41 l41Var) {
        this.f21029v = l41Var;
    }

    @Override // com.daaw.pj1
    /* renamed from: c */
    public synchronized void mo5506c(R r, f70<? super R> f70Var) {
        this.f21032y = true;
        this.f21028u = r;
        this.f21027t.m14565a(this);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z) {
        if (this.f21030w) {
            return true;
        }
        boolean z2 = !isDone();
        if (z2) {
            this.f21030w = true;
            if (z) {
                m14567l();
            }
            this.f21027t.m14565a(this);
        }
        return z2;
    }

    @Override // com.daaw.pj1
    /* renamed from: e */
    public void mo13330e(sd1 sd1Var) {
        sd1Var.mo10453f(this.f21024q, this.f21025r);
    }

    @Override // com.daaw.pj1
    /* renamed from: g */
    public synchronized void mo3967g(Exception exc, Drawable drawable) {
        this.f21033z = true;
        this.f21031x = exc;
        this.f21027t.m14565a(this);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        try {
            return m14566m(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public R get(long j, TimeUnit timeUnit) {
        return m14566m(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // com.daaw.qj0
    /* renamed from: h */
    public void mo3966h() {
    }

    @Override // com.daaw.pj1
    /* renamed from: i */
    public void mo3965i(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f21030w;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.f21030w) {
            z = this.f21032y;
        }
        return z;
    }

    @Override // com.daaw.pj1
    /* renamed from: j */
    public l41 mo3964j() {
        return this.f21029v;
    }

    @Override // com.daaw.pj1
    /* renamed from: k */
    public void mo3963k(Drawable drawable) {
    }

    /* renamed from: l */
    public void m14567l() {
        this.f21023p.post(this);
    }

    /* renamed from: m */
    public final synchronized R m14566m(Long l) {
        if (this.f21026s) {
            tq1.m8870a();
        }
        if (this.f21030w) {
            throw new CancellationException();
        }
        if (this.f21033z) {
            throw new ExecutionException(this.f21031x);
        }
        if (this.f21032y) {
            return this.f21028u;
        }
        if (l == null) {
            this.f21027t.m14564b(this, 0L);
        } else if (l.longValue() > 0) {
            this.f21027t.m14564b(this, l.longValue());
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f21033z) {
            throw new ExecutionException(this.f21031x);
        }
        if (this.f21030w) {
            throw new CancellationException();
        }
        if (this.f21032y) {
            return this.f21028u;
        }
        throw new TimeoutException();
    }

    @Override // com.daaw.qj0
    public void onDestroy() {
    }

    @Override // java.lang.Runnable
    public void run() {
        l41 l41Var = this.f21029v;
        if (l41Var != null) {
            l41Var.clear();
            cancel(false);
        }
    }
}
