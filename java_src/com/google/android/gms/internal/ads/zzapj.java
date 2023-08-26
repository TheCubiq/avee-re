package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final /* synthetic */ class zzapj implements Runnable {
    private final zzapg zzcyc;

    private zzapj(zzapg zzapgVar) {
        this.zzcyc = zzapgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzapg zzapgVar) {
        return new zzapj(zzapgVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzcyc.stop();
    }
}
