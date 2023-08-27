package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzpq implements Runnable {
    private final /* synthetic */ zzpd zzbki;
    private final /* synthetic */ zzpp zzbkj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpq(zzpp zzppVar, zzpd zzpdVar) {
        this.zzbkj = zzppVar;
        this.zzbki = zzpdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbkj.zza(this.zzbki);
    }
}
