package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzajh;
/* loaded from: classes.dex */
final class zzr implements Runnable {
    private final /* synthetic */ zzq zzwt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzr(zzq zzqVar) {
        this.zzwt = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzajh zzajhVar;
        zzq zzqVar = this.zzwt;
        zzajhVar = zzqVar.zzwr;
        zzqVar.zzb(zzajhVar);
    }
}
