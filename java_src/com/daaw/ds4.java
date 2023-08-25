package com.daaw;
/* loaded from: classes.dex */
public final class ds4 {

    /* renamed from: a */
    public final xp4 f7706a;

    /* renamed from: b */
    public boolean f7707b;

    public ds4(xp4 xp4Var) {
        this.f7706a = xp4Var;
    }

    /* renamed from: a */
    public final synchronized void m24010a() {
        while (!this.f7707b) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized void m24009b() {
        boolean z = false;
        while (!this.f7707b) {
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

    /* renamed from: c */
    public final synchronized boolean m24008c() {
        boolean z;
        z = this.f7707b;
        this.f7707b = false;
        return z;
    }

    /* renamed from: d */
    public final synchronized boolean m24007d() {
        return this.f7707b;
    }

    /* renamed from: e */
    public final synchronized boolean m24006e() {
        if (this.f7707b) {
            return false;
        }
        this.f7707b = true;
        notifyAll();
        return true;
    }
}
