package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzbft extends zzbfc<zzbft> {
    public Integer zzamf = null;
    public String mimeType = null;
    public byte[] zzedl = null;

    public zzbft() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzab */
    public final zzbft zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 8) {
                int position = zzbezVar.getPosition();
                try {
                    int zzabn = zzbezVar.zzabn();
                    if (zzabn < 0 || zzabn > 1) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append(zzabn);
                        sb.append(" is not a valid enum Type");
                        throw new IllegalArgumentException(sb.toString());
                        break;
                    }
                    this.zzamf = Integer.valueOf(zzabn);
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            } else if (zzabk == 18) {
                this.mimeType = zzbezVar.readString();
            } else if (zzabk == 26) {
                this.zzedl = zzbezVar.readBytes();
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        Integer num = this.zzamf;
        if (num != null) {
            zzbfaVar.zzm(1, num.intValue());
        }
        String str = this.mimeType;
        if (str != null) {
            zzbfaVar.zzf(2, str);
        }
        byte[] bArr = this.zzedl;
        if (bArr != null) {
            zzbfaVar.zza(3, bArr);
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        Integer num = this.zzamf;
        if (num != null) {
            zzr += zzbfa.zzq(1, num.intValue());
        }
        String str = this.mimeType;
        if (str != null) {
            zzr += zzbfa.zzg(2, str);
        }
        byte[] bArr = this.zzedl;
        return bArr != null ? zzr + zzbfa.zzb(3, bArr) : zzr;
    }
}
