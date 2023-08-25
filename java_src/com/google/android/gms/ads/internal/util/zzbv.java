package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.daaw.gv6;
import com.daaw.ry0;
/* loaded from: classes.dex */
public final class zzbv {
    public HandlerThread a = null;
    public Handler b = null;
    public int c = 0;
    public final Object d = new Object();

    public final Handler zza() {
        return this.b;
    }

    public final Looper zzb() {
        Looper looper;
        synchronized (this.d) {
            if (this.c != 0) {
                ry0.k(this.a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.a == null) {
                zze.zza("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.a = handlerThread;
                handlerThread.start();
                this.b = new gv6(this.a.getLooper());
                zze.zza("Looper thread started.");
            } else {
                zze.zza("Resuming the looper thread");
                this.d.notifyAll();
            }
            this.c++;
            looper = this.a.getLooper();
        }
        return looper;
    }
}
