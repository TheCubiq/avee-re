package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class bh3 {

    /* renamed from: a */
    public boolean f4797a = false;

    /* renamed from: b */
    public boolean f4798b = false;

    /* renamed from: c */
    public float f4799c = 0.0f;

    /* renamed from: d */
    public final AtomicBoolean f4800d = new AtomicBoolean(false);

    /* renamed from: a */
    public final synchronized float m26172a() {
        return this.f4799c;
    }

    /* renamed from: b */
    public final synchronized void m26171b(boolean z, float f) {
        this.f4798b = z;
        this.f4799c = f;
    }

    /* renamed from: c */
    public final synchronized void m26170c(boolean z) {
        this.f4797a = z;
        this.f4800d.set(true);
    }

    /* renamed from: d */
    public final synchronized boolean m26169d() {
        return this.f4798b;
    }

    /* renamed from: e */
    public final synchronized boolean m26168e(boolean z) {
        if (this.f4800d.get()) {
            return this.f4797a;
        }
        return z;
    }
}
