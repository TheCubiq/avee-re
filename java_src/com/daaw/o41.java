package com.daaw;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class o41<T, R> implements x50<R>, Runnable {
    public static final a A = new a();
    public final Handler p;
    public final int q;
    public final int r;
    public final boolean s;
    public final a t;
    public R u;
    public l41 v;
    public boolean w;
    public Exception x;
    public boolean y;
    public boolean z;

    /* loaded from: classes.dex */
    public static class a {
        public void a(Object obj) {
            obj.notifyAll();
        }

        public void b(Object obj, long j) {
            obj.wait(j);
        }
    }

    public o41(Handler handler, int i, int i2) {
        this(handler, i, i2, true, A);
    }

    public o41(Handler handler, int i, int i2, boolean z, a aVar) {
        this.p = handler;
        this.q = i;
        this.r = i2;
        this.s = z;
        this.t = aVar;
    }

    @Override // com.daaw.qj0
    public void a() {
    }

    @Override // com.daaw.pj1
    public void b(l41 l41Var) {
        this.v = l41Var;
    }

    @Override // com.daaw.pj1
    public synchronized void c(R r, f70<? super R> f70Var) {
        this.y = true;
        this.u = r;
        this.t.a(this);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z) {
        if (this.w) {
            return true;
        }
        boolean z2 = !isDone();
        if (z2) {
            this.w = true;
            if (z) {
                l();
            }
            this.t.a(this);
        }
        return z2;
    }

    @Override // com.daaw.pj1
    public void e(sd1 sd1Var) {
        sd1Var.f(this.q, this.r);
    }

    @Override // com.daaw.pj1
    public synchronized void g(Exception exc, Drawable drawable) {
        this.z = true;
        this.x = exc;
        this.t.a(this);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        try {
            return m(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public R get(long j, TimeUnit timeUnit) {
        return m(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // com.daaw.qj0
    public void h() {
    }

    @Override // com.daaw.pj1
    public void i(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.w;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.w) {
            z = this.y;
        }
        return z;
    }

    @Override // com.daaw.pj1
    public l41 j() {
        return this.v;
    }

    @Override // com.daaw.pj1
    public void k(Drawable drawable) {
    }

    public void l() {
        this.p.post(this);
    }

    public final synchronized R m(Long l) {
        if (this.s) {
            tq1.a();
        }
        if (this.w) {
            throw new CancellationException();
        }
        if (this.z) {
            throw new ExecutionException(this.x);
        }
        if (this.y) {
            return this.u;
        }
        if (l == null) {
            this.t.b(this, 0L);
        } else if (l.longValue() > 0) {
            this.t.b(this, l.longValue());
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.z) {
            throw new ExecutionException(this.x);
        }
        if (this.w) {
            throw new CancellationException();
        }
        if (this.y) {
            return this.u;
        }
        throw new TimeoutException();
    }

    @Override // com.daaw.qj0
    public void onDestroy() {
    }

    @Override // java.lang.Runnable
    public void run() {
        l41 l41Var = this.v;
        if (l41Var != null) {
            l41Var.clear();
            cancel(false);
        }
    }
}
