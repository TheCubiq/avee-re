package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzajp {
    private final Object mLock;
    private volatile int zzcpx;
    private volatile long zzcpy;

    private zzajp() {
        this.mLock = new Object();
        this.zzcpx = zzajq.zzcpz;
        this.zzcpy = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzajp(zzajo zzajoVar) {
        this();
    }

    private final void zzd(int i, int i2) {
        zzqk();
        long currentTimeMillis = com.google.android.gms.ads.internal.zzbv.zzer().currentTimeMillis();
        synchronized (this.mLock) {
            if (this.zzcpx != i) {
                return;
            }
            this.zzcpx = i2;
            if (this.zzcpx == zzajq.zzcqb) {
                this.zzcpy = currentTimeMillis;
            }
        }
    }

    private final void zzqk() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzbv.zzer().currentTimeMillis();
        synchronized (this.mLock) {
            if (this.zzcpx == zzajq.zzcqb) {
                if (this.zzcpy + ((Long) zzkb.zzik().zzd(zznk.zzbfn)).longValue() <= currentTimeMillis) {
                    this.zzcpx = zzajq.zzcpz;
                }
            }
        }
    }

    public final void zzaa(boolean z) {
        int i;
        int i2;
        if (z) {
            i = zzajq.zzcpz;
            i2 = zzajq.zzcqa;
        } else {
            i = zzajq.zzcqa;
            i2 = zzajq.zzcpz;
        }
        zzd(i, i2);
    }

    public final boolean zzqa() {
        zzqk();
        return this.zzcpx == zzajq.zzcqa;
    }

    public final boolean zzqb() {
        zzqk();
        return this.zzcpx == zzajq.zzcqb;
    }

    public final void zzqc() {
        zzd(zzajq.zzcqa, zzajq.zzcqb);
    }
}
