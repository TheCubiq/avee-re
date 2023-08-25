package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class v77 extends i67 implements RunnableFuture {
    @CheckForNull
    public volatile e77 w;

    public v77(v57 v57Var) {
        this.w = new t77(this, v57Var);
    }

    public v77(Callable callable) {
        this.w = new u77(this, callable);
    }

    public static v77 E(Runnable runnable, Object obj) {
        return new v77(Executors.callable(runnable, obj));
    }

    @Override // com.daaw.c57
    @CheckForNull
    public final String e() {
        e77 e77Var = this.w;
        if (e77Var != null) {
            String obj = e77Var.toString();
            return "task=[" + obj + "]";
        }
        return super.e();
    }

    @Override // com.daaw.c57
    public final void g() {
        e77 e77Var;
        if (x() && (e77Var = this.w) != null) {
            e77Var.g();
        }
        this.w = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        e77 e77Var = this.w;
        if (e77Var != null) {
            e77Var.run();
        }
        this.w = null;
    }
}
