package com.daaw;

import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes2.dex */
public final class j92<T> implements c82<T> {
    public final Object a = new Object();
    public final int b;
    public final dw8 c;
    @GuardedBy("mLock")
    public int d;
    @GuardedBy("mLock")
    public int e;
    @GuardedBy("mLock")
    public int f;
    @GuardedBy("mLock")
    public Exception g;
    @GuardedBy("mLock")
    public boolean h;

    public j92(int i, dw8 dw8Var) {
        this.b = i;
        this.c = dw8Var;
    }

    @GuardedBy("mLock")
    public final void a() {
        if (this.d + this.e + this.f == this.b) {
            if (this.g == null) {
                if (this.h) {
                    this.c.s();
                    return;
                } else {
                    this.c.r(null);
                    return;
                }
            }
            dw8 dw8Var = this.c;
            int i = this.e;
            int i2 = this.b;
            dw8Var.q(new ExecutionException(i + " out of " + i2 + " underlying tasks failed", this.g));
        }
    }

    @Override // com.daaw.zt0
    public final void b() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            a();
        }
    }

    @Override // com.daaw.gu0
    public final void c(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            a();
        }
    }

    @Override // com.daaw.ku0
    public final void onSuccess(T t) {
        synchronized (this.a) {
            this.d++;
            a();
        }
    }
}
