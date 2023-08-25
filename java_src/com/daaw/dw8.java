package com.daaw;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes2.dex */
public final class dw8<TResult> extends rj1<TResult> {

    /* renamed from: a */
    public final Object f7943a = new Object();

    /* renamed from: b */
    public final sp8 f7944b = new sp8();
    @GuardedBy("mLock")

    /* renamed from: c */
    public boolean f7945c;

    /* renamed from: d */
    public volatile boolean f7946d;
    @GuardedBy("mLock")

    /* renamed from: e */
    public Object f7947e;
    @GuardedBy("mLock")

    /* renamed from: f */
    public Exception f7948f;

    @Override // com.daaw.rj1
    /* renamed from: a */
    public final rj1<TResult> mo11249a(Executor executor, zt0 zt0Var) {
        this.f7944b.m10055a(new ru7(executor, zt0Var));
        m23848y();
        return this;
    }

    @Override // com.daaw.rj1
    /* renamed from: b */
    public final rj1<TResult> mo11248b(cu0<TResult> cu0Var) {
        this.f7944b.m10055a(new k68(yj1.f33727a, cu0Var));
        m23848y();
        return this;
    }

    @Override // com.daaw.rj1
    /* renamed from: c */
    public final rj1<TResult> mo11247c(Executor executor, cu0<TResult> cu0Var) {
        this.f7944b.m10055a(new k68(executor, cu0Var));
        m23848y();
        return this;
    }

    @Override // com.daaw.rj1
    /* renamed from: d */
    public final rj1<TResult> mo11246d(Executor executor, gu0 gu0Var) {
        this.f7944b.m10055a(new xc8(executor, gu0Var));
        m23848y();
        return this;
    }

    @Override // com.daaw.rj1
    /* renamed from: e */
    public final rj1<TResult> mo11245e(Executor executor, ku0<? super TResult> ku0Var) {
        this.f7944b.m10055a(new nh8(executor, ku0Var));
        m23848y();
        return this;
    }

    @Override // com.daaw.rj1
    /* renamed from: f */
    public final <TContinuationResult> rj1<TContinuationResult> mo11244f(InterfaceC1587hl<TResult, TContinuationResult> interfaceC1587hl) {
        return mo11243g(yj1.f33727a, interfaceC1587hl);
    }

    @Override // com.daaw.rj1
    /* renamed from: g */
    public final <TContinuationResult> rj1<TContinuationResult> mo11243g(Executor executor, InterfaceC1587hl<TResult, TContinuationResult> interfaceC1587hl) {
        dw8 dw8Var = new dw8();
        this.f7944b.m10055a(new wk4(executor, interfaceC1587hl, dw8Var));
        m23848y();
        return dw8Var;
    }

    @Override // com.daaw.rj1
    /* renamed from: h */
    public final <TContinuationResult> rj1<TContinuationResult> mo11242h(InterfaceC1587hl<TResult, rj1<TContinuationResult>> interfaceC1587hl) {
        return mo11241i(yj1.f33727a, interfaceC1587hl);
    }

    @Override // com.daaw.rj1
    /* renamed from: i */
    public final <TContinuationResult> rj1<TContinuationResult> mo11241i(Executor executor, InterfaceC1587hl<TResult, rj1<TContinuationResult>> interfaceC1587hl) {
        dw8 dw8Var = new dw8();
        this.f7944b.m10055a(new d86(executor, interfaceC1587hl, dw8Var));
        m23848y();
        return dw8Var;
    }

    @Override // com.daaw.rj1
    /* renamed from: j */
    public final Exception mo11240j() {
        Exception exc;
        synchronized (this.f7943a) {
            exc = this.f7948f;
        }
        return exc;
    }

    @Override // com.daaw.rj1
    /* renamed from: k */
    public final TResult mo11239k() {
        TResult tresult;
        synchronized (this.f7943a) {
            m23851v();
            m23850w();
            Exception exc = this.f7948f;
            if (exc != null) {
                throw new n61(exc);
            }
            tresult = (TResult) this.f7947e;
        }
        return tresult;
    }

    @Override // com.daaw.rj1
    /* renamed from: l */
    public final boolean mo11238l() {
        return this.f7946d;
    }

    @Override // com.daaw.rj1
    /* renamed from: m */
    public final boolean mo11237m() {
        boolean z;
        synchronized (this.f7943a) {
            z = this.f7945c;
        }
        return z;
    }

    @Override // com.daaw.rj1
    /* renamed from: n */
    public final boolean mo11236n() {
        boolean z;
        synchronized (this.f7943a) {
            z = false;
            if (this.f7945c && !this.f7946d && this.f7948f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.daaw.rj1
    /* renamed from: o */
    public final <TContinuationResult> rj1<TContinuationResult> mo11235o(ai1<TResult, TContinuationResult> ai1Var) {
        Executor executor = yj1.f33727a;
        dw8 dw8Var = new dw8();
        this.f7944b.m10055a(new im8(executor, ai1Var, dw8Var));
        m23848y();
        return dw8Var;
    }

    @Override // com.daaw.rj1
    /* renamed from: p */
    public final <TContinuationResult> rj1<TContinuationResult> mo11234p(Executor executor, ai1<TResult, TContinuationResult> ai1Var) {
        dw8 dw8Var = new dw8();
        this.f7944b.m10055a(new im8(executor, ai1Var, dw8Var));
        m23848y();
        return dw8Var;
    }

    /* renamed from: q */
    public final void m23856q(Exception exc) {
        ry0.m10829k(exc, "Exception must not be null");
        synchronized (this.f7943a) {
            m23849x();
            this.f7945c = true;
            this.f7948f = exc;
        }
        this.f7944b.m10054b(this);
    }

    /* renamed from: r */
    public final void m23855r(Object obj) {
        synchronized (this.f7943a) {
            m23849x();
            this.f7945c = true;
            this.f7947e = obj;
        }
        this.f7944b.m10054b(this);
    }

    /* renamed from: s */
    public final boolean m23854s() {
        synchronized (this.f7943a) {
            if (this.f7945c) {
                return false;
            }
            this.f7945c = true;
            this.f7946d = true;
            this.f7944b.m10054b(this);
            return true;
        }
    }

    /* renamed from: t */
    public final boolean m23853t(Exception exc) {
        ry0.m10829k(exc, "Exception must not be null");
        synchronized (this.f7943a) {
            if (this.f7945c) {
                return false;
            }
            this.f7945c = true;
            this.f7948f = exc;
            this.f7944b.m10054b(this);
            return true;
        }
    }

    /* renamed from: u */
    public final boolean m23852u(Object obj) {
        synchronized (this.f7943a) {
            if (this.f7945c) {
                return false;
            }
            this.f7945c = true;
            this.f7947e = obj;
            this.f7944b.m10054b(this);
            return true;
        }
    }

    @GuardedBy("mLock")
    /* renamed from: v */
    public final void m23851v() {
        ry0.m10826n(this.f7945c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    /* renamed from: w */
    public final void m23850w() {
        if (this.f7946d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @GuardedBy("mLock")
    /* renamed from: x */
    public final void m23849x() {
        if (this.f7945c) {
            throw C1332fv.m22253a(this);
        }
    }

    /* renamed from: y */
    public final void m23848y() {
        synchronized (this.f7943a) {
            if (this.f7945c) {
                this.f7944b.m10054b(this);
            }
        }
    }
}
