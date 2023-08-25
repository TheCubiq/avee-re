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

    /* renamed from: D */
    public static final Logger f21068D = Logger.getLogger(o57.class.getName());
    @CheckForNull

    /* renamed from: A */
    public t17 f21069A;

    /* renamed from: B */
    public final boolean f21070B;

    /* renamed from: C */
    public final boolean f21071C;

    public o57(t17 t17Var, boolean z, boolean z2) {
        super(t17Var.size());
        this.f21069A = t17Var;
        this.f21070B = z;
        this.f21071C = z2;
    }

    /* renamed from: O */
    public static void m14548O(Throwable th) {
        f21068D.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* renamed from: P */
    public static boolean m14547P(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.daaw.u57
    /* renamed from: K */
    public final void mo8555K(Set set) {
        Objects.requireNonNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable mo4029a = mo4029a();
        mo4029a.getClass();
        m14547P(set, mo4029a);
    }

    /* renamed from: L */
    public final void m14551L(int i, Future future) {
        try {
            mo14546Q(i, s67.m10627p(future));
        } catch (Error e) {
            e = e;
            m14549N(e);
        } catch (RuntimeException e2) {
            e = e2;
            m14549N(e);
        } catch (ExecutionException e3) {
            m14549N(e3.getCause());
        }
    }

    /* renamed from: M */
    public final void m14542U(@CheckForNull t17 t17Var) {
        int m8561E = m8561E();
        int i = 0;
        sy6.m9700i(m8561E >= 0, "Less than 0 remaining futures");
        if (m8561E == 0) {
            if (t17Var != null) {
                c47 it = t17Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        m14551L(i, future);
                    }
                    i++;
                }
            }
            m8556J();
            mo14545R();
            mo14541V(2);
        }
    }

    /* renamed from: N */
    public final void m14549N(Throwable th) {
        Objects.requireNonNull(th);
        if (this.f21070B && !mo14485i(th) && m14547P(m8559G(), th)) {
            m14548O(th);
        } else if (th instanceof Error) {
            m14548O(th);
        }
    }

    /* renamed from: Q */
    public abstract void mo14546Q(int i, Object obj);

    /* renamed from: R */
    public abstract void mo14545R();

    /* renamed from: S */
    public final void m14544S() {
        t17 t17Var = this.f21069A;
        t17Var.getClass();
        if (t17Var.isEmpty()) {
            mo14545R();
        } else if (!this.f21070B) {
            final t17 t17Var2 = this.f21071C ? this.f21069A : null;
            Runnable runnable = new Runnable() { // from class: com.daaw.n57
                @Override // java.lang.Runnable
                public final void run() {
                    o57.this.m14542U(t17Var2);
                }
            };
            c47 it = this.f21069A.iterator();
            while (it.hasNext()) {
                ((f77) it.next()).mo6515f(runnable, g67.INSTANCE);
            }
        } else {
            c47 it2 = this.f21069A.iterator();
            final int i = 0;
            while (it2.hasNext()) {
                final f77 f77Var = (f77) it2.next();
                f77Var.mo6515f(new Runnable() { // from class: com.daaw.m57
                    @Override // java.lang.Runnable
                    public final void run() {
                        o57.this.m14543T(f77Var, i);
                    }
                }, g67.INSTANCE);
                i++;
            }
        }
    }

    /* renamed from: T */
    public final /* synthetic */ void m14543T(f77 f77Var, int i) {
        try {
            if (f77Var.isCancelled()) {
                this.f21069A = null;
                cancel(false);
            } else {
                m14551L(i, f77Var);
            }
        } finally {
            m14542U(null);
        }
    }

    /* renamed from: V */
    public void mo14541V(int i) {
        this.f21069A = null;
    }

    @Override // com.daaw.c57
    @CheckForNull
    /* renamed from: e */
    public final String mo7361e() {
        t17 t17Var = this.f21069A;
        return t17Var != null ? "futures=".concat(t17Var.toString()) : super.mo7361e();
    }

    @Override // com.daaw.c57
    /* renamed from: g */
    public final void mo7360g() {
        t17 t17Var = this.f21069A;
        mo14541V(1);
        if ((t17Var != null) && isCancelled()) {
            boolean m25599x = m25599x();
            c47 it = t17Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(m25599x);
            }
        }
    }
}
