package com.daaw;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes2.dex */
public final class dw8<TResult> extends rj1<TResult> {
    public final Object a = new Object();
    public final sp8 b = new sp8();
    @GuardedBy("mLock")
    public boolean c;
    public volatile boolean d;
    @GuardedBy("mLock")
    public Object e;
    @GuardedBy("mLock")
    public Exception f;

    @Override // com.daaw.rj1
    public final rj1<TResult> a(Executor executor, zt0 zt0Var) {
        this.b.a(new ru7(executor, zt0Var));
        y();
        return this;
    }

    @Override // com.daaw.rj1
    public final rj1<TResult> b(cu0<TResult> cu0Var) {
        this.b.a(new k68(yj1.a, cu0Var));
        y();
        return this;
    }

    @Override // com.daaw.rj1
    public final rj1<TResult> c(Executor executor, cu0<TResult> cu0Var) {
        this.b.a(new k68(executor, cu0Var));
        y();
        return this;
    }

    @Override // com.daaw.rj1
    public final rj1<TResult> d(Executor executor, gu0 gu0Var) {
        this.b.a(new xc8(executor, gu0Var));
        y();
        return this;
    }

    @Override // com.daaw.rj1
    public final rj1<TResult> e(Executor executor, ku0<? super TResult> ku0Var) {
        this.b.a(new nh8(executor, ku0Var));
        y();
        return this;
    }

    @Override // com.daaw.rj1
    public final <TContinuationResult> rj1<TContinuationResult> f(hl<TResult, TContinuationResult> hlVar) {
        return g(yj1.a, hlVar);
    }

    @Override // com.daaw.rj1
    public final <TContinuationResult> rj1<TContinuationResult> g(Executor executor, hl<TResult, TContinuationResult> hlVar) {
        dw8 dw8Var = new dw8();
        this.b.a(new wk4(executor, hlVar, dw8Var));
        y();
        return dw8Var;
    }

    @Override // com.daaw.rj1
    public final <TContinuationResult> rj1<TContinuationResult> h(hl<TResult, rj1<TContinuationResult>> hlVar) {
        return i(yj1.a, hlVar);
    }

    @Override // com.daaw.rj1
    public final <TContinuationResult> rj1<TContinuationResult> i(Executor executor, hl<TResult, rj1<TContinuationResult>> hlVar) {
        dw8 dw8Var = new dw8();
        this.b.a(new d86(executor, hlVar, dw8Var));
        y();
        return dw8Var;
    }

    @Override // com.daaw.rj1
    public final Exception j() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.daaw.rj1
    public final TResult k() {
        TResult tresult;
        synchronized (this.a) {
            v();
            w();
            Exception exc = this.f;
            if (exc != null) {
                throw new n61(exc);
            }
            tresult = (TResult) this.e;
        }
        return tresult;
    }

    @Override // com.daaw.rj1
    public final boolean l() {
        return this.d;
    }

    @Override // com.daaw.rj1
    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.daaw.rj1
    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && !this.d && this.f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.daaw.rj1
    public final <TContinuationResult> rj1<TContinuationResult> o(ai1<TResult, TContinuationResult> ai1Var) {
        Executor executor = yj1.a;
        dw8 dw8Var = new dw8();
        this.b.a(new im8(executor, ai1Var, dw8Var));
        y();
        return dw8Var;
    }

    @Override // com.daaw.rj1
    public final <TContinuationResult> rj1<TContinuationResult> p(Executor executor, ai1<TResult, TContinuationResult> ai1Var) {
        dw8 dw8Var = new dw8();
        this.b.a(new im8(executor, ai1Var, dw8Var));
        y();
        return dw8Var;
    }

    public final void q(Exception exc) {
        ry0.k(exc, "Exception must not be null");
        synchronized (this.a) {
            x();
            this.c = true;
            this.f = exc;
        }
        this.b.b(this);
    }

    public final void r(Object obj) {
        synchronized (this.a) {
            x();
            this.c = true;
            this.e = obj;
        }
        this.b.b(this);
    }

    public final boolean s() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            this.b.b(this);
            return true;
        }
    }

    public final boolean t(Exception exc) {
        ry0.k(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f = exc;
            this.b.b(this);
            return true;
        }
    }

    public final boolean u(Object obj) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = obj;
            this.b.b(this);
            return true;
        }
    }

    @GuardedBy("mLock")
    public final void v() {
        ry0.n(this.c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    public final void w() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @GuardedBy("mLock")
    public final void x() {
        if (this.c) {
            throw fv.a(this);
        }
    }

    public final void y() {
        synchronized (this.a) {
            if (this.c) {
                this.b.b(this);
            }
        }
    }
}
