package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzor implements Runnable {
    private final /* synthetic */ zzoq zzbin;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzor(zzoq zzoqVar) {
        this.zzbin = zzoqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzoz zzozVar;
        zzoz zzozVar2;
        zzoz zzozVar3;
        zzoz zzozVar4;
        zzozVar = this.zzbin.zzbij;
        if (zzozVar != null) {
            zzozVar2 = this.zzbin.zzbij;
            zzozVar2.zzkq();
            zzozVar3 = this.zzbin.zzbij;
            zzozVar3.zzkp();
            zzozVar4 = this.zzbin.zzbij;
            zzozVar4.zzcs();
        }
        zzoq.zza(this.zzbin, null);
    }
}
