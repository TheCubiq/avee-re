package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzop implements Runnable {
    private final /* synthetic */ zzoo zzbik;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzop(zzoo zzooVar) {
        this.zzbik = zzooVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzoz zzozVar;
        zzoz zzozVar2;
        zzoz zzozVar3;
        zzoz zzozVar4;
        zzozVar = this.zzbik.zzbij;
        if (zzozVar != null) {
            zzozVar2 = this.zzbik.zzbij;
            zzozVar2.zzkq();
            zzozVar3 = this.zzbik.zzbij;
            zzozVar3.zzkp();
            zzozVar4 = this.zzbik.zzbij;
            zzozVar4.zzcs();
        }
        zzoo.zza(this.zzbik, null);
    }
}
