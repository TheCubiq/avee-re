package com.daaw.avee.Common;
/* loaded from: classes.dex */
public class Signal {
    private boolean signalled = false;

    public synchronized void setSignal() {
        this.signalled = true;
        notifyAll();
    }

    public synchronized void waitForSignal() throws InterruptedException {
        while (!this.signalled) {
            wait();
        }
    }
}
