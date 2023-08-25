package com.daaw;

import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes2.dex */
public final class j92<T> implements c82<T> {

    /* renamed from: a */
    public final Object f14539a = new Object();

    /* renamed from: b */
    public final int f14540b;

    /* renamed from: c */
    public final dw8 f14541c;
    @GuardedBy("mLock")

    /* renamed from: d */
    public int f14542d;
    @GuardedBy("mLock")

    /* renamed from: e */
    public int f14543e;
    @GuardedBy("mLock")

    /* renamed from: f */
    public int f14544f;
    @GuardedBy("mLock")

    /* renamed from: g */
    public Exception f14545g;
    @GuardedBy("mLock")

    /* renamed from: h */
    public boolean f14546h;

    public j92(int i, dw8 dw8Var) {
        this.f14540b = i;
        this.f14541c = dw8Var;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void m18714a() {
        if (this.f14542d + this.f14543e + this.f14544f == this.f14540b) {
            if (this.f14545g == null) {
                if (this.f14546h) {
                    this.f14541c.m23854s();
                    return;
                } else {
                    this.f14541c.m23855r(null);
                    return;
                }
            }
            dw8 dw8Var = this.f14541c;
            int i = this.f14543e;
            int i2 = this.f14540b;
            dw8Var.m23856q(new ExecutionException(i + " out of " + i2 + " underlying tasks failed", this.f14545g));
        }
    }

    @Override // com.daaw.zt0
    /* renamed from: b */
    public final void mo1920b() {
        synchronized (this.f14539a) {
            this.f14544f++;
            this.f14546h = true;
            m18714a();
        }
    }

    @Override // com.daaw.gu0
    /* renamed from: c */
    public final void mo5820c(Exception exc) {
        synchronized (this.f14539a) {
            this.f14543e++;
            this.f14545g = exc;
            m18714a();
        }
    }

    @Override // com.daaw.ku0
    public final void onSuccess(T t) {
        synchronized (this.f14539a) {
            this.f14542d++;
            m18714a();
        }
    }
}
