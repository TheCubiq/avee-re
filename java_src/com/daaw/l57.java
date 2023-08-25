package com.daaw;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class l57 extends i67 implements Runnable {
    public static final /* synthetic */ int y = 0;
    @CheckForNull
    public f77 w;
    @CheckForNull
    public Object x;

    public l57(f77 f77Var, Object obj) {
        Objects.requireNonNull(f77Var);
        this.w = f77Var;
        Objects.requireNonNull(obj);
        this.x = obj;
    }

    public abstract Object E(Object obj, Object obj2);

    public abstract void F(Object obj);

    @Override // com.daaw.c57
    @CheckForNull
    public final String e() {
        String str;
        f77 f77Var = this.w;
        Object obj = this.x;
        String e = super.e();
        if (f77Var != null) {
            str = "inputFuture=[" + f77Var.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (e != null) {
                return str.concat(e);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + "]";
    }

    @Override // com.daaw.c57
    public final void g() {
        v(this.w);
        this.w = null;
        this.x = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f77 f77Var = this.w;
        Object obj = this.x;
        if ((isCancelled() | (f77Var == null)) || (obj == null)) {
            return;
        }
        this.w = null;
        if (f77Var.isCancelled()) {
            w(f77Var);
            return;
        }
        try {
            try {
                Object E = E(obj, s67.p(f77Var));
                this.x = null;
                F(E);
            } catch (Throwable th) {
                try {
                    n77.a(th);
                    i(th);
                } finally {
                    this.x = null;
                }
            }
        } catch (Error e) {
            i(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            i(e2);
        } catch (ExecutionException e3) {
            i(e3.getCause());
        }
    }
}
