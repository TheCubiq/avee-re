package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzbfs extends zzbfc<zzbfs> {
    private Integer zzedj = null;
    private byte[] zzedk = null;
    private byte[] zzedg = null;

    public zzbfs() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* synthetic */ zzbfi zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 8) {
                this.zzedj = Integer.valueOf(zzbezVar.zzabn());
            } else if (zzabk == 18) {
                this.zzedk = zzbezVar.readBytes();
            } else if (zzabk == 26) {
                this.zzedg = zzbezVar.readBytes();
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        Integer num = this.zzedj;
        if (num != null) {
            zzbfaVar.zzm(1, num.intValue());
        }
        byte[] bArr = this.zzedk;
        if (bArr != null) {
            zzbfaVar.zza(2, bArr);
        }
        byte[] bArr2 = this.zzedg;
        if (bArr2 != null) {
            zzbfaVar.zza(3, bArr2);
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        Integer num = this.zzedj;
        if (num != null) {
            zzr += zzbfa.zzq(1, num.intValue());
        }
        byte[] bArr = this.zzedk;
        if (bArr != null) {
            zzr += zzbfa.zzb(2, bArr);
        }
        byte[] bArr2 = this.zzedg;
        return bArr2 != null ? zzr + zzbfa.zzb(3, bArr2) : zzr;
    }
}
