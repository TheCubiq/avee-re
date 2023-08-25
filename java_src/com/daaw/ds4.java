package com.daaw;
/* loaded from: classes.dex */
public final class ds4 {
    public final xp4 a;
    public boolean b;

    public ds4(xp4 xp4Var) {
        this.a = xp4Var;
    }

    public final synchronized void a() {
        while (!this.b) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        boolean z;
        z = this.b;
        this.b = false;
        return z;
    }

    public final synchronized boolean d() {
        return this.b;
    }

    public final synchronized boolean e() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }
}
