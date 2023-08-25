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
    /* renamed from: a */
    public static <TResult> TResult m24308a(rj1<TResult> rj1Var) {
        ry0.m10832h();
        ry0.m10829k(rj1Var, "Task must not be null");
        if (rj1Var.mo11237m()) {
            return (TResult) m24301h(rj1Var);
        }
        f72 f72Var = new f72(null);
        m24300i(rj1Var, f72Var);
        f72Var.m22877a();
        return (TResult) m24301h(rj1Var);
    }

    /* renamed from: b */
    public static <TResult> TResult m24307b(rj1<TResult> rj1Var, long j, TimeUnit timeUnit) {
        ry0.m10832h();
        ry0.m10829k(rj1Var, "Task must not be null");
        ry0.m10829k(timeUnit, "TimeUnit must not be null");
        if (rj1Var.mo11237m()) {
            return (TResult) m24301h(rj1Var);
        }
        f72 f72Var = new f72(null);
        m24300i(rj1Var, f72Var);
        if (f72Var.m22876d(j, timeUnit)) {
            return (TResult) m24301h(rj1Var);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    /* renamed from: c */
    public static <TResult> rj1<TResult> m24306c(Executor executor, Callable<TResult> callable) {
        ry0.m10829k(executor, "Executor must not be null");
        ry0.m10829k(callable, "Callback must not be null");
        dw8 dw8Var = new dw8();
        executor.execute(new yz8(dw8Var, callable));
        return dw8Var;
    }

    /* renamed from: d */
    public static <TResult> rj1<TResult> m24305d(Exception exc) {
        dw8 dw8Var = new dw8();
        dw8Var.m23856q(exc);
        return dw8Var;
    }

    /* renamed from: e */
    public static <TResult> rj1<TResult> m24304e(TResult tresult) {
        dw8 dw8Var = new dw8();
        dw8Var.m23855r(tresult);
        return dw8Var;
    }

    /* renamed from: f */
    public static rj1<Void> m24303f(Collection<? extends rj1<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m24304e(null);
        }
        for (rj1<?> rj1Var : collection) {
            Objects.requireNonNull(rj1Var, "null tasks are not accepted");
        }
        dw8 dw8Var = new dw8();
        j92 j92Var = new j92(collection.size(), dw8Var);
        for (rj1<?> rj1Var2 : collection) {
            m24300i(rj1Var2, j92Var);
        }
        return dw8Var;
    }

    /* renamed from: g */
    public static rj1<Void> m24302g(rj1<?>... rj1VarArr) {
        return (rj1VarArr == null || rj1VarArr.length == 0) ? m24304e(null) : m24303f(Arrays.asList(rj1VarArr));
    }

    /* renamed from: h */
    public static Object m24301h(rj1 rj1Var) {
        if (rj1Var.mo11236n()) {
            return rj1Var.mo11239k();
        }
        if (rj1Var.mo11238l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(rj1Var.mo11240j());
    }

    /* renamed from: i */
    public static void m24300i(rj1 rj1Var, c82 c82Var) {
        Executor executor = yj1.f33728b;
        rj1Var.mo11245e(executor, c82Var);
        rj1Var.mo11246d(executor, c82Var);
        rj1Var.mo11249a(executor, c82Var);
    }
}
