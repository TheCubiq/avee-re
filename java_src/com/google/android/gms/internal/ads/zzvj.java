package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final /* synthetic */ class zzvj implements Runnable {
    private final zzuu zzbqh;

    private zzvj(zzuu zzuuVar) {
        this.zzbqh = zzuuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzuu zzuuVar) {
        return new zzvj(zzuuVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbqh.destroy();
    }
}
