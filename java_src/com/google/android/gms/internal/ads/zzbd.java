package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzbd extends zzbfc<zzbd> {
    private Long zzgl = null;
    private Integer zzgm = null;
    private Boolean zzgn = null;
    private int[] zzgo = zzbfl.zzeby;
    private Long zzgp = null;

    public zzbd() {
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
            } else if (zzabk == 16) {
                this.zzgm = Integer.valueOf(zzbezVar.zzacc());
            } else if (zzabk == 24) {
                this.zzgn = Boolean.valueOf(zzbezVar.zzabq());
            } else if (zzabk == 32) {
                int zzb = zzbfl.zzb(zzbezVar, 32);
                int[] iArr = this.zzgo;
                int length = iArr == null ? 0 : iArr.length;
                int i = zzb + length;
                int[] iArr2 = new int[i];
                if (length != 0) {
                    System.arraycopy(this.zzgo, 0, iArr2, 0, length);
                }
                while (length < i - 1) {
                    iArr2[length] = zzbezVar.zzacc();
                    zzbezVar.zzabk();
                    length++;
                }
                iArr2[length] = zzbezVar.zzacc();
                this.zzgo = iArr2;
            } else if (zzabk == 34) {
                int zzbr = zzbezVar.zzbr(zzbezVar.zzacc());
                int position = zzbezVar.getPosition();
                int i2 = 0;
                while (zzbezVar.zzagn() > 0) {
                    zzbezVar.zzacc();
                    i2++;
                }
                zzbezVar.zzdc(position);
                int[] iArr3 = this.zzgo;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i3 = i2 + length2;
                int[] iArr4 = new int[i3];
                if (length2 != 0) {
                    System.arraycopy(this.zzgo, 0, iArr4, 0, length2);
                }
                while (length2 < i3) {
                    iArr4[length2] = zzbezVar.zzacc();
                    length2++;
                }
                this.zzgo = iArr4;
                zzbezVar.zzbs(zzbr);
            } else if (zzabk == 40) {
                this.zzgp = Long.valueOf(zzbezVar.zzacd());
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
        Integer num = this.zzgm;
        if (num != null) {
            zzbfaVar.zzm(2, num.intValue());
        }
        Boolean bool = this.zzgn;
        if (bool != null) {
            zzbfaVar.zzf(3, bool.booleanValue());
        }
        int[] iArr = this.zzgo;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.zzgo;
                if (i >= iArr2.length) {
                    break;
                }
                zzbfaVar.zzm(4, iArr2[i]);
                i++;
            }
        }
        Long l2 = this.zzgp;
        if (l2 != null) {
            zzbfaVar.zza(5, l2.longValue());
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int[] iArr;
        int zzr = super.zzr();
        Long l = this.zzgl;
        if (l != null) {
            zzr += zzbfa.zzd(1, l.longValue());
        }
        Integer num = this.zzgm;
        if (num != null) {
            zzr += zzbfa.zzq(2, num.intValue());
        }
        Boolean bool = this.zzgn;
        if (bool != null) {
            bool.booleanValue();
            zzr += zzbfa.zzcd(3) + 1;
        }
        int[] iArr2 = this.zzgo;
        if (iArr2 != null && iArr2.length > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                iArr = this.zzgo;
                if (i >= iArr.length) {
                    break;
                }
                i2 += zzbfa.zzce(iArr[i]);
                i++;
            }
            zzr = zzr + i2 + (iArr.length * 1);
        }
        Long l2 = this.zzgp;
        return l2 != null ? zzr + zzbfa.zze(5, l2.longValue()) : zzr;
    }
}
