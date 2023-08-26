package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdc implements Runnable {
    private final /* synthetic */ zzcz zzsl;
    private final /* synthetic */ int zzsm;
    private final /* synthetic */ boolean zzsn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdc(zzcz zzczVar, int i, boolean z) {
        this.zzsl = zzczVar;
        this.zzsm = i;
        this.zzsn = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zza;
        zzba zzb = this.zzsl.zzb(this.zzsm, this.zzsn);
        this.zzsl.zzsb = zzb;
        zza = zzcz.zza(this.zzsm, zzb);
        if (zza) {
            this.zzsl.zza(this.zzsm + 1, this.zzsn);
        }
    }
}
