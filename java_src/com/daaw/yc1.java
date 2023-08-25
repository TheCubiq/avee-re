package com.daaw;
/* loaded from: classes.dex */
public class yc1 {

    /* renamed from: a */
    public boolean f33518a = false;

    /* renamed from: a */
    public synchronized void m3864a() {
        this.f33518a = true;
        notifyAll();
    }

    /* renamed from: b */
    public synchronized void m3863b() {
        while (!this.f33518a) {
            wait();
        }
    }
}
