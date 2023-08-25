package com.daaw;
/* loaded from: classes.dex */
public class yc1 {
    public boolean a = false;

    public synchronized void a() {
        this.a = true;
        notifyAll();
    }

    public synchronized void b() {
        while (!this.a) {
            wait();
        }
    }
}
