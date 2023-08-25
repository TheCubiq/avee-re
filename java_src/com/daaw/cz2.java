package com.daaw;
/* loaded from: classes.dex */
public final class cz2 {
    public boolean a;

    public final synchronized void a() {
        while (!this.a) {
            wait();
        }
    }

    public final synchronized boolean b() {
        boolean z;
        z = this.a;
        this.a = false;
        return z;
    }

    public final synchronized boolean c() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }
}
