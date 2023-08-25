package com.google.android.gms.ads.internal.util;

import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzbz {

    /* renamed from: a */
    public long f36286a;
    @GuardedBy("lock")

    /* renamed from: b */
    public long f36287b = Long.MIN_VALUE;

    /* renamed from: c */
    public final Object f36288c = new Object();

    public zzbz(long j) {
        this.f36286a = j;
    }

    public final void zza(long j) {
        synchronized (this.f36288c) {
            this.f36286a = j;
        }
    }

    public final boolean zzb() {
        synchronized (this.f36288c) {
            long mo15859b = com.google.android.gms.ads.internal.zzt.zzB().mo15859b();
            if (this.f36287b + this.f36286a > mo15859b) {
                return false;
            }
            this.f36287b = mo15859b;
            return true;
        }
    }
}
