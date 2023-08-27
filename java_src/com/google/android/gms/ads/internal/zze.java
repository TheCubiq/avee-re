package com.google.android.gms.ads.internal;
/* loaded from: classes.dex */
final /* synthetic */ class zze implements Runnable {
    private final zzbl zzwj;

    private zze(zzbl zzblVar) {
        this.zzwj = zzblVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzbl zzblVar) {
        return new zze(zzblVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzwj.pause();
    }
}
