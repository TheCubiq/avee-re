package com.google.android.gms.internal.ads;
@zzadh
/* loaded from: classes2.dex */
public final class zzamj {
    private long zzctx;
    private long zzcty = Long.MIN_VALUE;
    private Object mLock = new Object();

    public zzamj(long j) {
        this.zzctx = j;
    }

    public final boolean tryAcquire() {
        synchronized (this.mLock) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzbv.zzer().elapsedRealtime();
            if (this.zzcty + this.zzctx > elapsedRealtime) {
                return false;
            }
            this.zzcty = elapsedRealtime;
            return true;
        }
    }
}
