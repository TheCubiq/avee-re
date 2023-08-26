package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzik extends zzbfc<zzik> {
    private Integer zzanu = null;
    private int[] zzans = zzbfl.zzeby;

    public zzik() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzm */
    public final zzik zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 8) {
                int position = zzbezVar.getPosition();
                try {
                    this.zzanu = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            } else if (zzabk == 16) {
                int zzb = zzbfl.zzb(zzbezVar, 16);
                int[] iArr = this.zzans;
                int length = iArr == null ? 0 : iArr.length;
                int i = zzb + length;
                int[] iArr2 = new int[i];
                if (length != 0) {
                    System.arraycopy(this.zzans, 0, iArr2, 0, length);
                }
                while (length < i - 1) {
                    iArr2[length] = zzbezVar.zzacc();
                    zzbezVar.zzabk();
                    length++;
                }
                iArr2[length] = zzbezVar.zzacc();
                this.zzans = iArr2;
            } else if (zzabk == 18) {
                int zzbr = zzbezVar.zzbr(zzbezVar.zzacc());
                int position2 = zzbezVar.getPosition();
                int i2 = 0;
                while (zzbezVar.zzagn() > 0) {
                    zzbezVar.zzacc();
                    i2++;
                }
                zzbezVar.zzdc(position2);
                int[] iArr3 = this.zzans;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i3 = i2 + length2;
                int[] iArr4 = new int[i3];
                if (length2 != 0) {
                    System.arraycopy(this.zzans, 0, iArr4, 0, length2);
                }
                while (length2 < i3) {
                    iArr4[length2] = zzbezVar.zzacc();
                    length2++;
                }
                this.zzans = iArr4;
                zzbezVar.zzbs(zzbr);
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        Integer num = this.zzanu;
        if (num != null) {
            zzbfaVar.zzm(1, num.intValue());
        }
        int[] iArr = this.zzans;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.zzans;
                if (i >= iArr2.length) {
                    break;
                }
                zzbfaVar.zzm(2, iArr2[i]);
                i++;
            }
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        Integer num = this.zzanu;
        if (num != null) {
            zzr += zzbfa.zzq(1, num.intValue());
        }
        int[] iArr = this.zzans;
        if (iArr == null || iArr.length <= 0) {
            return zzr;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.zzans;
            if (i >= iArr2.length) {
                return zzr + i2 + (iArr2.length * 1);
            }
            i2 += zzbfa.zzce(iArr2[i]);
            i++;
        }
    }
}
