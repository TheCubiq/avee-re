package com.daaw;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class s67 extends u67 {
    /* renamed from: a */
    public static r67 m10642a(Iterable iterable) {
        return new r67(false, y17.m4263r(iterable), null);
    }

    @SafeVarargs
    /* renamed from: b */
    public static r67 m10641b(f77... f77VarArr) {
        return new r67(false, y17.m4261t(f77VarArr), null);
    }

    /* renamed from: c */
    public static r67 m10640c(Iterable iterable) {
        return new r67(true, y17.m4263r(iterable), null);
    }

    @SafeVarargs
    /* renamed from: d */
    public static r67 m10639d(f77... f77VarArr) {
        return new r67(true, y17.m4261t(f77VarArr), null);
    }

    /* renamed from: e */
    public static f77 m10638e(Iterable iterable) {
        return new x57(y17.m4263r(iterable), true);
    }

    /* renamed from: f */
    public static f77 m10637f(f77 f77Var, Class cls, ey6 ey6Var, Executor executor) {
        o47 o47Var = new o47(f77Var, cls, ey6Var);
        f77Var.mo6515f(o47Var, m77.m16186c(executor, o47Var));
        return o47Var;
    }

    /* renamed from: g */
    public static f77 m10636g(f77 f77Var, Class cls, w57 w57Var, Executor executor) {
        n47 n47Var = new n47(f77Var, cls, w57Var);
        f77Var.mo6515f(n47Var, m77.m16186c(executor, n47Var));
        return n47Var;
    }

    /* renamed from: h */
    public static f77 m10635h(Throwable th) {
        Objects.requireNonNull(th);
        return new v67(th);
    }

    /* renamed from: i */
    public static f77 m10634i(Object obj) {
        return obj == null ? w67.f30928q : new w67(obj);
    }

    /* renamed from: j */
    public static f77 m10633j() {
        return w67.f30928q;
    }

    /* renamed from: k */
    public static f77 m10632k(Callable callable, Executor executor) {
        v77 v77Var = new v77(callable);
        executor.execute(v77Var);
        return v77Var;
    }

    /* renamed from: l */
    public static f77 m10631l(v57 v57Var, Executor executor) {
        v77 v77Var = new v77(v57Var);
        executor.execute(v77Var);
        return v77Var;
    }

    /* renamed from: m */
    public static f77 m10630m(f77 f77Var, ey6 ey6Var, Executor executor) {
        int i = l57.f17074y;
        Objects.requireNonNull(ey6Var);
        k57 k57Var = new k57(f77Var, ey6Var);
        f77Var.mo6515f(k57Var, m77.m16186c(executor, k57Var));
        return k57Var;
    }

    /* renamed from: n */
    public static f77 m10629n(f77 f77Var, w57 w57Var, Executor executor) {
        int i = l57.f17074y;
        Objects.requireNonNull(executor);
        j57 j57Var = new j57(f77Var, w57Var);
        f77Var.mo6515f(j57Var, m77.m16186c(executor, j57Var));
        return j57Var;
    }

    /* renamed from: o */
    public static f77 m10628o(f77 f77Var, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return f77Var.isDone() ? f77Var : s77.m10592F(f77Var, j, timeUnit, scheduledExecutorService);
    }

    /* renamed from: p */
    public static Object m10627p(Future future) {
        if (future.isDone()) {
            return x77.m5484a(future);
        }
        throw new IllegalStateException(hz6.m20317b("Future was expected to be done: %s", future));
    }

    /* renamed from: q */
    public static Object m10626q(Future future) {
        try {
            return x77.m5484a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new h67((Error) cause);
            }
            throw new w77(cause);
        }
    }

    /* renamed from: r */
    public static void m10625r(f77 f77Var, o67 o67Var, Executor executor) {
        Objects.requireNonNull(o67Var);
        f77Var.mo6515f(new p67(f77Var, o67Var), executor);
    }
}
