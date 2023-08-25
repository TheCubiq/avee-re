package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class v77 extends i67 implements RunnableFuture {
    @CheckForNull

    /* renamed from: w */
    public volatile e77 f29995w;

    public v77(v57 v57Var) {
        this.f29995w = new t77(this, v57Var);
    }

    public v77(Callable callable) {
        this.f29995w = new u77(this, callable);
    }

    /* renamed from: E */
    public static v77 m7362E(Runnable runnable, Object obj) {
        return new v77(Executors.callable(runnable, obj));
    }

    @Override // com.daaw.c57
    @CheckForNull
    /* renamed from: e */
    public final String mo7361e() {
        e77 e77Var = this.f29995w;
        if (e77Var != null) {
            String obj = e77Var.toString();
            return "task=[" + obj + "]";
        }
        return super.mo7361e();
    }

    @Override // com.daaw.c57
    /* renamed from: g */
    public final void mo7360g() {
        e77 e77Var;
        if (m25599x() && (e77Var = this.f29995w) != null) {
            e77Var.m23672g();
        }
        this.f29995w = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        e77 e77Var = this.f29995w;
        if (e77Var != null) {
            e77Var.run();
        }
        this.f29995w = null;
    }
}
