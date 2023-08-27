package com.google.android.gms.ads.internal;
/* loaded from: classes.dex */
final /* synthetic */ class zzf implements Runnable {
    private final zzbl zzwj;

    private zzf(zzbl zzblVar) {
        this.zzwj = zzblVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzbl zzblVar) {
        return new zzf(zzblVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzwj.resume();
    }
}
