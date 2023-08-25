package com.daaw;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class p47 extends i67 implements Runnable {
    @CheckForNull

    /* renamed from: w */
    public f77 f22612w;
    @CheckForNull

    /* renamed from: x */
    public Class f22613x;
    @CheckForNull

    /* renamed from: y */
    public Object f22614y;

    public p47(f77 f77Var, Class cls, Object obj) {
        Objects.requireNonNull(f77Var);
        this.f22612w = f77Var;
        this.f22613x = cls;
        Objects.requireNonNull(obj);
        this.f22614y = obj;
    }

    /* renamed from: E */
    public abstract Object mo13633E(Object obj, Throwable th);

    /* renamed from: F */
    public abstract void mo13632F(Object obj);

    @Override // com.daaw.c57
    @CheckForNull
    /* renamed from: e */
    public final String mo7361e() {
        String str;
        f77 f77Var = this.f22612w;
        Class cls = this.f22613x;
        Object obj = this.f22614y;
        String mo7361e = super.mo7361e();
        if (f77Var != null) {
            str = "inputFuture=[" + f77Var.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (mo7361e != null) {
                return str.concat(mo7361e);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.daaw.c57
    /* renamed from: g */
    public final void mo7360g() {
        m25601v(this.f22612w);
        this.f22612w = null;
        this.f22613x = null;
        this.f22614y = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable e;
        Object obj;
        f77 f77Var = this.f22612w;
        Class cls = this.f22613x;
        Object obj2 = this.f22614y;
        if (((obj2 == null) || ((f77Var == null) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f22612w = null;
        try {
            e = f77Var instanceof y77 ? ((y77) f77Var).mo4029a() : null;
        } catch (Error e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(f77Var.getClass()) + " threw " + String.valueOf(e4.getClass()) + " without a cause");
            }
            e = cause;
        }
        if (e == null) {
            obj = s67.m10627p(f77Var);
            if (e != null) {
                mo14486h(obj);
                return;
            } else if (!cls.isInstance(e)) {
                m25600w(f77Var);
                return;
            } else {
                try {
                    Object mo13633E = mo13633E(obj2, e);
                    this.f22613x = null;
                    this.f22614y = null;
                    mo13632F(mo13633E);
                    return;
                } catch (Throwable th) {
                    try {
                        n77.m15480a(th);
                        mo14485i(th);
                        return;
                    } finally {
                        this.f22613x = null;
                        this.f22614y = null;
                    }
                }
            }
        }
        obj = null;
        if (e != null) {
        }
    }
}
