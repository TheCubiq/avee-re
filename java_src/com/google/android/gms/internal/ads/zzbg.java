package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzbg extends zzbfc<zzbg> {
    public Integer zzfe;
    private Integer zzff;
    public byte[][] zzgv = zzbfl.zzece;
    public byte[] zzgq = null;

    public zzbg() {
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzd */
    public final zzbg zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 10) {
                int zzb = zzbfl.zzb(zzbezVar, 10);
                byte[][] bArr = this.zzgv;
                int length = bArr == null ? 0 : bArr.length;
                int i = zzb + length;
                byte[][] bArr2 = new byte[i];
                if (length != 0) {
                    System.arraycopy(this.zzgv, 0, bArr2, 0, length);
                }
                while (length < i - 1) {
                    bArr2[length] = zzbezVar.readBytes();
                    zzbezVar.zzabk();
                    length++;
                }
                bArr2[length] = zzbezVar.readBytes();
                this.zzgv = bArr2;
            } else if (zzabk == 18) {
                this.zzgq = zzbezVar.readBytes();
            } else if (zzabk == 24) {
                zzbezVar.getPosition();
                this.zzff = Integer.valueOf(zzaz.zze(zzbezVar.zzacc()));
            } else if (zzabk == 32) {
                int position = zzbezVar.getPosition();
                try {
                    this.zzfe = Integer.valueOf(zzaz.zzf(zzbezVar.zzacc()));
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        byte[][] bArr = this.zzgv;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.zzgv;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    zzbfaVar.zza(1, bArr3);
                }
                i++;
            }
        }
        byte[] bArr4 = this.zzgq;
        if (bArr4 != null) {
            zzbfaVar.zza(2, bArr4);
        }
        Integer num = this.zzff;
        if (num != null) {
            zzbfaVar.zzm(3, num.intValue());
        }
        Integer num2 = this.zzfe;
        if (num2 != null) {
            zzbfaVar.zzm(4, num2.intValue());
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        byte[][] bArr = this.zzgv;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.zzgv;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += zzbfa.zzv(bArr3);
                }
                i++;
            }
            zzr = zzr + i2 + (i3 * 1);
        }
        byte[] bArr4 = this.zzgq;
        if (bArr4 != null) {
            zzr += zzbfa.zzb(2, bArr4);
        }
        Integer num = this.zzff;
        if (num != null) {
            zzr += zzbfa.zzq(3, num.intValue());
        }
        Integer num2 = this.zzfe;
        return num2 != null ? zzr + zzbfa.zzq(4, num2.intValue()) : zzr;
    }
}
