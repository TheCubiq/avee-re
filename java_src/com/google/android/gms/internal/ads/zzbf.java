package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzbf extends zzbfc<zzbf> {
    public Long zzgl = null;
    private String zzgt = null;
    private byte[] zzgu = null;

    public zzbf() {
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
                this.zzgl = Long.valueOf(zzbezVar.zzacd());
            } else if (zzabk == 26) {
                this.zzgt = zzbezVar.readString();
            } else if (zzabk == 34) {
                this.zzgu = zzbezVar.readBytes();
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        Long l = this.zzgl;
        if (l != null) {
            zzbfaVar.zzi(1, l.longValue());
        }
        String str = this.zzgt;
        if (str != null) {
            zzbfaVar.zzf(3, str);
        }
        byte[] bArr = this.zzgu;
        if (bArr != null) {
            zzbfaVar.zza(4, bArr);
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        Long l = this.zzgl;
        if (l != null) {
            zzr += zzbfa.zzd(1, l.longValue());
        }
        String str = this.zzgt;
        if (str != null) {
            zzr += zzbfa.zzg(3, str);
        }
        byte[] bArr = this.zzgu;
        return bArr != null ? zzr + zzbfa.zzb(4, bArr) : zzr;
    }
}
