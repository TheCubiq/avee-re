package com.daaw;
/* renamed from: com.daaw.bj */
/* loaded from: classes.dex */
public final class C0844bj {

    /* renamed from: a */
    public boolean f4846a;

    /* renamed from: a */
    public synchronized void m26135a() {
        while (!this.f4846a) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized boolean m26134b() {
        boolean z;
        z = this.f4846a;
        this.f4846a = false;
        return z;
    }

    /* renamed from: c */
    public synchronized boolean m26133c() {
        if (this.f4846a) {
            return false;
        }
        this.f4846a = true;
        notifyAll();
        return true;
    }
}
