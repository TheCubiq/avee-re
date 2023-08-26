package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzaji;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzk implements Runnable {
    private final /* synthetic */ zzaji zzwg;
    private final /* synthetic */ zzi zzwm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzk(zzi zziVar, zzaji zzajiVar) {
        this.zzwm = zziVar;
        this.zzwg = zzajiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzwm.zzb(new zzajh(this.zzwg, null, null, null, null, null, null, null));
    }
}
