package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.daaw.gv6;
import com.daaw.ry0;
/* loaded from: classes.dex */
public final class zzbv {

    /* renamed from: a */
    public HandlerThread f36278a = null;

    /* renamed from: b */
    public Handler f36279b = null;

    /* renamed from: c */
    public int f36280c = 0;

    /* renamed from: d */
    public final Object f36281d = new Object();

    public final Handler zza() {
        return this.f36279b;
    }

    public final Looper zzb() {
        Looper looper;
        synchronized (this.f36281d) {
            if (this.f36280c != 0) {
                ry0.m10829k(this.f36278a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f36278a == null) {
                zze.zza("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f36278a = handlerThread;
                handlerThread.start();
                this.f36279b = new gv6(this.f36278a.getLooper());
                zze.zza("Looper thread started.");
            } else {
                zze.zza("Resuming the looper thread");
                this.f36281d.notifyAll();
            }
            this.f36280c++;
            looper = this.f36278a.getLooper();
        }
        return looper;
    }
}
