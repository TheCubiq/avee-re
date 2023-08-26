package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzbfo extends zzbfc<zzbfo> {
    private static volatile zzbfo[] zzecw;
    public byte[] zzecx = null;
    public byte[] zzecy = null;

    public zzbfo() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    public static zzbfo[] zzagt() {
        if (zzecw == null) {
            synchronized (zzbfg.zzebs) {
                if (zzecw == null) {
                    zzecw = new zzbfo[0];
                }
            }
        }
        return zzecw;
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* synthetic */ zzbfi zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 10) {
                this.zzecx = zzbezVar.readBytes();
            } else if (zzabk == 18) {
                this.zzecy = zzbezVar.readBytes();
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        zzbfaVar.zza(1, this.zzecx);
        byte[] bArr = this.zzecy;
        if (bArr != null) {
            zzbfaVar.zza(2, bArr);
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr() + zzbfa.zzb(1, this.zzecx);
        byte[] bArr = this.zzecy;
        return bArr != null ? zzr + zzbfa.zzb(2, bArr) : zzr;
    }
}
