package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzaji;
/* loaded from: classes.dex */
final class zzbd implements Runnable {
    private final /* synthetic */ zzbc zzaaf;
    private final /* synthetic */ zzaji zzwg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbd(zzbc zzbcVar, zzaji zzajiVar) {
        this.zzaaf = zzbcVar;
        this.zzwg = zzajiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaaf.zzb(new zzajh(this.zzwg, null, null, null, null, null, null, null));
    }
}
