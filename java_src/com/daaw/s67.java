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
    public static r67 a(Iterable iterable) {
        return new r67(false, y17.r(iterable), null);
    }

    @SafeVarargs
    public static r67 b(f77... f77VarArr) {
        return new r67(false, y17.t(f77VarArr), null);
    }

    public static r67 c(Iterable iterable) {
        return new r67(true, y17.r(iterable), null);
    }

    @SafeVarargs
    public static r67 d(f77... f77VarArr) {
        return new r67(true, y17.t(f77VarArr), null);
    }

    public static f77 e(Iterable iterable) {
        return new x57(y17.r(iterable), true);
    }

    public static f77 f(f77 f77Var, Class cls, ey6 ey6Var, Executor executor) {
        o47 o47Var = new o47(f77Var, cls, ey6Var);
        f77Var.f(o47Var, m77.c(executor, o47Var));
        return o47Var;
    }

    public static f77 g(f77 f77Var, Class cls, w57 w57Var, Executor executor) {
        n47 n47Var = new n47(f77Var, cls, w57Var);
        f77Var.f(n47Var, m77.c(executor, n47Var));
        return n47Var;
    }

    public static f77 h(Throwable th) {
        Objects.requireNonNull(th);
        return new v67(th);
    }

    public static f77 i(Object obj) {
        return obj == null ? w67.q : new w67(obj);
    }

    public static f77 j() {
        return w67.q;
    }

    public static f77 k(Callable callable, Executor executor) {
        v77 v77Var = new v77(callable);
        executor.execute(v77Var);
        return v77Var;
    }

    public static f77 l(v57 v57Var, Executor executor) {
        v77 v77Var = new v77(v57Var);
        executor.execute(v77Var);
        return v77Var;
    }

    public static f77 m(f77 f77Var, ey6 ey6Var, Executor executor) {
        int i = l57.y;
        Objects.requireNonNull(ey6Var);
        k57 k57Var = new k57(f77Var, ey6Var);
        f77Var.f(k57Var, m77.c(executor, k57Var));
        return k57Var;
    }

    public static f77 n(f77 f77Var, w57 w57Var, Executor executor) {
        int i = l57.y;
        Objects.requireNonNull(executor);
        j57 j57Var = new j57(f77Var, w57Var);
        f77Var.f(j57Var, m77.c(executor, j57Var));
        return j57Var;
    }

    public static f77 o(f77 f77Var, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return f77Var.isDone() ? f77Var : s77.F(f77Var, j, timeUnit, scheduledExecutorService);
    }

    public static Object p(Future future) {
        if (future.isDone()) {
            return x77.a(future);
        }
        throw new IllegalStateException(hz6.b("Future was expected to be done: %s", future));
    }

    public static Object q(Future future) {
        try {
            return x77.a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new h67((Error) cause);
            }
            throw new w77(cause);
        }
    }

    public static void r(f77 f77Var, o67 o67Var, Executor executor) {
        Objects.requireNonNull(o67Var);
        f77Var.f(new p67(f77Var, o67Var), executor);
    }
}
