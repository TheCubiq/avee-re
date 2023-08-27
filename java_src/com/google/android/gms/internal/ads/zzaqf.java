package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzaqf implements Runnable {
    private final /* synthetic */ zzaqe zzdax;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqf(zzaqe zzaqeVar) {
        this.zzdax = zzaqeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzbv.zzff().zzb(this.zzdax);
    }
}
