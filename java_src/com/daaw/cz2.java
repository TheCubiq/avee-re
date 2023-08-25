package com.daaw;
/* loaded from: classes.dex */
public final class cz2 {

    /* renamed from: a */
    public boolean f6310a;

    /* renamed from: a */
    public final synchronized void m24860a() {
        while (!this.f6310a) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized boolean m24859b() {
        boolean z;
        z = this.f6310a;
        this.f6310a = false;
        return z;
    }

    /* renamed from: c */
    public final synchronized boolean m24858c() {
        if (this.f6310a) {
            return false;
        }
        this.f6310a = true;
        notifyAll();
        return true;
    }
}
