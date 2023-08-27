package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzjj;
/* loaded from: classes.dex */
final class zzaj implements Runnable {
    private final /* synthetic */ zzjj zzyh;
    private final /* synthetic */ zzah zzyi;
    private final /* synthetic */ int zzyj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaj(zzah zzahVar, zzjj zzjjVar, int i) {
        this.zzyi = zzahVar;
        this.zzyh = zzjjVar;
        this.zzyj = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.zzyi.mLock;
        synchronized (obj) {
            this.zzyi.zzb(this.zzyh, this.zzyj);
        }
    }
}
