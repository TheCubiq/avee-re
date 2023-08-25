package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class bh3 {
    public boolean a = false;
    public boolean b = false;
    public float c = 0.0f;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public final synchronized float a() {
        return this.c;
    }

    public final synchronized void b(boolean z, float f) {
        this.b = z;
        this.c = f;
    }

    public final synchronized void c(boolean z) {
        this.a = z;
        this.d.set(true);
    }

    public final synchronized boolean d() {
        return this.b;
    }

    public final synchronized boolean e(boolean z) {
        if (this.d.get()) {
            return this.a;
        }
        return z;
    }
}
