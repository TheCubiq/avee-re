package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzjj;
/* loaded from: classes.dex */
final class zzai implements Runnable {
    private final /* synthetic */ zzjj zzyh;
    private final /* synthetic */ zzah zzyi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzai(zzah zzahVar, zzjj zzjjVar) {
        this.zzyi = zzahVar;
        this.zzyh = zzjjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean zzde;
        obj = this.zzyi.mLock;
        synchronized (obj) {
            zzde = this.zzyi.zzde();
            if (zzde) {
                this.zzyi.zze(this.zzyh);
            } else {
                this.zzyi.zzb(this.zzyh, 1);
            }
        }
    }
}
