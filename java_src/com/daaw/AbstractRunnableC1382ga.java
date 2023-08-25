package com.daaw;

import android.os.Process;
/* renamed from: com.daaw.ga */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC1382ga implements Runnable {
    /* renamed from: a */
    public abstract void mo21874a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        mo21874a();
    }
}
