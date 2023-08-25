package com.daaw;

import com.google.android.gms.ads.internal.util.zzb;
/* loaded from: classes.dex */
public final class h32 implements Runnable {
    public final /* synthetic */ zzb p;

    public h32(zzb zzbVar) {
        this.p = zzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.b = Thread.currentThread();
        this.p.zza();
    }
}
