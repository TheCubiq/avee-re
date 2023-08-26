package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzbe extends zzbfc<zzbe> {
    public byte[] data = null;
    public byte[] zzgq = null;
    public byte[] zzgr = null;
    public byte[] zzgs = null;

    public zzbe() {
        this.zzebt = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* synthetic */ zzbfi zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 10) {
                this.data = zzbezVar.readBytes();
            } else if (zzabk == 18) {
                this.zzgq = zzbezVar.readBytes();
            } else if (zzabk == 26) {
                this.zzgr = zzbezVar.readBytes();
            } else if (zzabk == 34) {
                this.zzgs = zzbezVar.readBytes();
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        byte[] bArr = this.data;
        if (bArr != null) {
            zzbfaVar.zza(1, bArr);
        }
        byte[] bArr2 = this.zzgq;
        if (bArr2 != null) {
            zzbfaVar.zza(2, bArr2);
        }
        byte[] bArr3 = this.zzgr;
        if (bArr3 != null) {
            zzbfaVar.zza(3, bArr3);
        }
        byte[] bArr4 = this.zzgs;
        if (bArr4 != null) {
            zzbfaVar.zza(4, bArr4);
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        byte[] bArr = this.data;
        if (bArr != null) {
            zzr += zzbfa.zzb(1, bArr);
        }
        byte[] bArr2 = this.zzgq;
        if (bArr2 != null) {
            zzr += zzbfa.zzb(2, bArr2);
        }
        byte[] bArr3 = this.zzgr;
        if (bArr3 != null) {
            zzr += zzbfa.zzb(3, bArr3);
        }
        byte[] bArr4 = this.zzgs;
        return bArr4 != null ? zzr + zzbfa.zzb(4, bArr4) : zzr;
    }
}
