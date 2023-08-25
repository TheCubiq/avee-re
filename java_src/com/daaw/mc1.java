package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public abstract class mc1 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final b61 b;
    public volatile ni1 c;

    public mc1(b61 b61Var) {
        this.b = b61Var;
    }

    public ni1 a() {
        b();
        return e(this.a.compareAndSet(false, true));
    }

    public void b() {
        this.b.a();
    }

    public final ni1 c() {
        return this.b.d(d());
    }

    public abstract String d();

    public final ni1 e(boolean z) {
        if (z) {
            if (this.c == null) {
                this.c = c();
            }
            return this.c;
        }
        return c();
    }

    public void f(ni1 ni1Var) {
        if (ni1Var == this.c) {
            this.a.set(false);
        }
    }
}
