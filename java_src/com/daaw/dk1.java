package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes2.dex */
public final class dk1 {
    public static <TResult> TResult a(rj1<TResult> rj1Var) {
        ry0.h();
        ry0.k(rj1Var, "Task must not be null");
        if (rj1Var.m()) {
            return (TResult) h(rj1Var);
        }
        f72 f72Var = new f72(null);
        i(rj1Var, f72Var);
        f72Var.a();
        return (TResult) h(rj1Var);
    }

    public static <TResult> TResult b(rj1<TResult> rj1Var, long j, TimeUnit timeUnit) {
        ry0.h();
        ry0.k(rj1Var, "Task must not be null");
        ry0.k(timeUnit, "TimeUnit must not be null");
        if (rj1Var.m()) {
            return (TResult) h(rj1Var);
        }
        f72 f72Var = new f72(null);
        i(rj1Var, f72Var);
        if (f72Var.d(j, timeUnit)) {
            return (TResult) h(rj1Var);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> rj1<TResult> c(Executor executor, Callable<TResult> callable) {
        ry0.k(executor, "Executor must not be null");
        ry0.k(callable, "Callback must not be null");
        dw8 dw8Var = new dw8();
        executor.execute(new yz8(dw8Var, callable));
        return dw8Var;
    }

    public static <TResult> rj1<TResult> d(Exception exc) {
        dw8 dw8Var = new dw8();
        dw8Var.q(exc);
        return dw8Var;
    }

    public static <TResult> rj1<TResult> e(TResult tresult) {
        dw8 dw8Var = new dw8();
        dw8Var.r(tresult);
        return dw8Var;
    }

    public static rj1<Void> f(Collection<? extends rj1<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return e(null);
        }
        for (rj1<?> rj1Var : collection) {
            Objects.requireNonNull(rj1Var, "null tasks are not accepted");
        }
        dw8 dw8Var = new dw8();
        j92 j92Var = new j92(collection.size(), dw8Var);
        for (rj1<?> rj1Var2 : collection) {
            i(rj1Var2, j92Var);
        }
        return dw8Var;
    }

    public static rj1<Void> g(rj1<?>... rj1VarArr) {
        return (rj1VarArr == null || rj1VarArr.length == 0) ? e(null) : f(Arrays.asList(rj1VarArr));
    }

    public static Object h(rj1 rj1Var) {
        if (rj1Var.n()) {
            return rj1Var.k();
        }
        if (rj1Var.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(rj1Var.j());
    }

    public static void i(rj1 rj1Var, c82 c82Var) {
        Executor executor = yj1.b;
        rj1Var.e(executor, c82Var);
        rj1Var.d(executor, c82Var);
        rj1Var.a(executor, c82Var);
    }
}
