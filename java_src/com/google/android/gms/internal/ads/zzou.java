package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzou implements Runnable {
    private final /* synthetic */ zzos zzbir;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzou(zzos zzosVar) {
        this.zzbir = zzosVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzoz zzozVar;
        zzoz zzozVar2;
        zzoz zzozVar3;
        zzozVar = this.zzbir.zzbij;
        if (zzozVar != null) {
            zzozVar2 = this.zzbir.zzbij;
            zzozVar2.zzkq();
            zzozVar3 = this.zzbir.zzbij;
            zzozVar3.zzkp();
        }
        zzos.zza(this.zzbir, null);
    }
}
