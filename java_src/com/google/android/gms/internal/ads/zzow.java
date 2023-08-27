package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzow implements Runnable {
    private final /* synthetic */ zzov zzbis;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzow(zzov zzovVar) {
        this.zzbis = zzovVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzoz zzozVar;
        zzoz zzozVar2;
        zzoz zzozVar3;
        zzoz zzozVar4;
        zzozVar = this.zzbis.zzbij;
        if (zzozVar != null) {
            zzozVar2 = this.zzbis.zzbij;
            zzozVar2.zzkq();
            zzozVar3 = this.zzbis.zzbij;
            zzozVar3.zzkp();
            zzozVar4 = this.zzbis.zzbij;
            zzozVar4.zzcs();
        }
        zzov.zza(this.zzbis, null);
    }
}
