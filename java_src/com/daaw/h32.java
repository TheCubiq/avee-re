package com.daaw;

import com.google.android.gms.ads.internal.util.zzb;
/* loaded from: classes.dex */
public final class h32 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzb f11996p;

    public h32(zzb zzbVar) {
        this.f11996p = zzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11996p.f36265b = Thread.currentThread();
        this.f11996p.zza();
    }
}
