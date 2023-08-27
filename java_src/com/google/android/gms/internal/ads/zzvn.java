package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final /* synthetic */ class zzvn implements Runnable {
    private final zzuu zzbqh;

    private zzvn(zzuu zzuuVar) {
        this.zzbqh = zzuuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzuu zzuuVar) {
        return new zzvn(zzuuVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbqh.destroy();
    }
}
