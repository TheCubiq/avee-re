package com.daaw;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class l57 extends i67 implements Runnable {

    /* renamed from: y */
    public static final /* synthetic */ int f17074y = 0;
    @CheckForNull

    /* renamed from: w */
    public f77 f17075w;
    @CheckForNull

    /* renamed from: x */
    public Object f17076x;

    public l57(f77 f77Var, Object obj) {
        Objects.requireNonNull(f77Var);
        this.f17075w = f77Var;
        Objects.requireNonNull(obj);
        this.f17076x = obj;
    }

    /* renamed from: E */
    public abstract Object mo17133E(Object obj, Object obj2);

    /* renamed from: F */
    public abstract void mo17132F(Object obj);

    @Override // com.daaw.c57
    @CheckForNull
    /* renamed from: e */
    public final String mo7361e() {
        String str;
        f77 f77Var = this.f17075w;
        Object obj = this.f17076x;
        String mo7361e = super.mo7361e();
        if (f77Var != null) {
            str = "inputFuture=[" + f77Var.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (mo7361e != null) {
                return str.concat(mo7361e);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + "]";
    }

    @Override // com.daaw.c57
    /* renamed from: g */
    public final void mo7360g() {
        m25601v(this.f17075w);
        this.f17075w = null;
        this.f17076x = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f77 f77Var = this.f17075w;
        Object obj = this.f17076x;
        if ((isCancelled() | (f77Var == null)) || (obj == null)) {
            return;
        }
        this.f17075w = null;
        if (f77Var.isCancelled()) {
            m25600w(f77Var);
            return;
        }
        try {
            try {
                Object mo17133E = mo17133E(obj, s67.m10627p(f77Var));
                this.f17076x = null;
                mo17132F(mo17133E);
            } catch (Throwable th) {
                try {
                    n77.m15480a(th);
                    mo14485i(th);
                } finally {
                    this.f17076x = null;
                }
            }
        } catch (Error e) {
            mo14485i(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            mo14485i(e2);
        } catch (ExecutionException e3) {
            mo14485i(e3.getCause());
        }
    }
}
