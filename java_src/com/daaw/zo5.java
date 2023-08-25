package com.daaw;
/* loaded from: classes.dex */
public final class zo5 {
    public long a = 0;
    public int b = 0;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public final Object f = new Object();
    public final Object g = new Object();
    public final Object h = new Object();
    public final Object i = new Object();
    public final Object j = new Object();

    public final int a() {
        int i;
        synchronized (this.g) {
            i = this.b;
        }
        return i;
    }

    public final synchronized long b() {
        long j;
        synchronized (this.j) {
            j = this.e;
        }
        return j;
    }

    public final synchronized long c() {
        long j;
        synchronized (this.i) {
            j = this.d;
        }
        return j;
    }

    public final synchronized long d() {
        long j;
        synchronized (this.f) {
            j = this.a;
        }
        return j;
    }

    public final long e() {
        long j;
        synchronized (this.h) {
            j = this.c;
        }
        return j;
    }

    public final synchronized void f(long j) {
        synchronized (this.j) {
            this.e = j;
        }
    }

    public final synchronized void g(long j) {
        synchronized (this.i) {
            this.d = j;
        }
    }

    public final synchronized void h(long j) {
        synchronized (this.f) {
            this.a = j;
        }
    }

    public final void i(int i) {
        synchronized (this.g) {
            this.b = i;
        }
    }

    public final void j(long j) {
        synchronized (this.h) {
            this.c = j;
        }
    }
}
