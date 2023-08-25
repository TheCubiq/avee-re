package com.daaw;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class o57 extends u57 {
    public static final Logger D = Logger.getLogger(o57.class.getName());
    @CheckForNull
    public t17 A;
    public final boolean B;
    public final boolean C;

    public o57(t17 t17Var, boolean z, boolean z2) {
        super(t17Var.size());
        this.A = t17Var;
        this.B = z;
        this.C = z2;
    }

    public static void O(Throwable th) {
        D.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    public static boolean P(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.daaw.u57
    public final void K(Set set) {
        Objects.requireNonNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable a = a();
        a.getClass();
        P(set, a);
    }

    public final void L(int i, Future future) {
        try {
            Q(i, s67.p(future));
        } catch (Error e) {
            e = e;
            N(e);
        } catch (RuntimeException e2) {
            e = e2;
            N(e);
        } catch (ExecutionException e3) {
            N(e3.getCause());
        }
    }

    /* renamed from: M */
    public final void U(@CheckForNull t17 t17Var) {
        int E = E();
        int i = 0;
        sy6.i(E >= 0, "Less than 0 remaining futures");
        if (E == 0) {
            if (t17Var != null) {
                c47 it = t17Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        L(i, future);
                    }
                    i++;
                }
            }
            J();
            R();
            V(2);
        }
    }

    public final void N(Throwable th) {
        Objects.requireNonNull(th);
        if (this.B && !i(th) && P(G(), th)) {
            O(th);
        } else if (th instanceof Error) {
            O(th);
        }
    }

    public abstract void Q(int i, Object obj);

    public abstract void R();

    public final void S() {
        t17 t17Var = this.A;
        t17Var.getClass();
        if (t17Var.isEmpty()) {
            R();
        } else if (!this.B) {
            final t17 t17Var2 = this.C ? this.A : null;
            Runnable runnable = new Runnable() { // from class: com.daaw.n57
                @Override // java.lang.Runnable
                public final void run() {
                    o57.this.U(t17Var2);
                }
            };
            c47 it = this.A.iterator();
            while (it.hasNext()) {
                ((f77) it.next()).f(runnable, g67.INSTANCE);
            }
        } else {
            c47 it2 = this.A.iterator();
            final int i = 0;
            while (it2.hasNext()) {
                final f77 f77Var = (f77) it2.next();
                f77Var.f(new Runnable() { // from class: com.daaw.m57
                    @Override // java.lang.Runnable
                    public final void run() {
                        o57.this.T(f77Var, i);
                    }
                }, g67.INSTANCE);
                i++;
            }
        }
    }

    public final /* synthetic */ void T(f77 f77Var, int i) {
        try {
            if (f77Var.isCancelled()) {
                this.A = null;
                cancel(false);
            } else {
                L(i, f77Var);
            }
        } finally {
            U(null);
        }
    }

    public void V(int i) {
        this.A = null;
    }

    @Override // com.daaw.c57
    @CheckForNull
    public final String e() {
        t17 t17Var = this.A;
        return t17Var != null ? "futures=".concat(t17Var.toString()) : super.e();
    }

    @Override // com.daaw.c57
    public final void g() {
        t17 t17Var = this.A;
        V(1);
        if ((t17Var != null) && isCancelled()) {
            boolean x = x();
            c47 it = t17Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(x);
            }
        }
    }
}
