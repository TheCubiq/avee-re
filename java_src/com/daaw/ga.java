package com.daaw;

import android.os.Process;
/* loaded from: classes2.dex */
public abstract class ga implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
