package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzbfu extends zzbfc<zzbfu> {
    private static volatile zzbfu[] zzedm;
    public Integer zzedn = null;
    public String url = null;
    public zzbfp zzedo = null;
    private zzbfr zzedp = null;
    private Integer zzedq = null;
    private int[] zzedr = zzbfl.zzeby;
    private String zzeds = null;
    public Integer zzedt = null;
    public String[] zzedu = zzbfl.zzecd;

    public zzbfu() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzac */
    public final zzbfu zza(zzbez zzbezVar) throws IOException {
        zzbfi zzbfiVar;
        int zzabn;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 8:
                    this.zzedn = Integer.valueOf(zzbezVar.zzabn());
                    continue;
                case 18:
                    this.url = zzbezVar.readString();
                    continue;
                case 26:
                    if (this.zzedo == null) {
                        this.zzedo = new zzbfp();
                    }
                    zzbfiVar = this.zzedo;
                    break;
                case 34:
                    if (this.zzedp == null) {
                        this.zzedp = new zzbfr();
                    }
                    zzbfiVar = this.zzedp;
                    break;
                case 40:
                    this.zzedq = Integer.valueOf(zzbezVar.zzabn());
                    continue;
                case 48:
                    int zzb = zzbfl.zzb(zzbezVar, 48);
                    int[] iArr = this.zzedr;
                    int length = iArr == null ? 0 : iArr.length;
                    int i = zzb + length;
                    int[] iArr2 = new int[i];
                    if (length != 0) {
                        System.arraycopy(this.zzedr, 0, iArr2, 0, length);
                    }
                    while (length < i - 1) {
                        iArr2[length] = zzbezVar.zzabn();
                        zzbezVar.zzabk();
                        length++;
                    }
                    iArr2[length] = zzbezVar.zzabn();
                    this.zzedr = iArr2;
                    continue;
                case 50:
                    int zzbr = zzbezVar.zzbr(zzbezVar.zzacc());
                    int position = zzbezVar.getPosition();
                    int i2 = 0;
                    while (zzbezVar.zzagn() > 0) {
                        zzbezVar.zzabn();
                        i2++;
                    }
                    zzbezVar.zzdc(position);
                    int[] iArr3 = this.zzedr;
                    int length2 = iArr3 == null ? 0 : iArr3.length;
                    int i3 = i2 + length2;
                    int[] iArr4 = new int[i3];
                    if (length2 != 0) {
                        System.arraycopy(this.zzedr, 0, iArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        iArr4[length2] = zzbezVar.zzabn();
                        length2++;
                    }
                    this.zzedr = iArr4;
                    zzbezVar.zzbs(zzbr);
                    continue;
                case 58:
                    this.zzeds = zzbezVar.readString();
                    continue;
                case 64:
                    int position2 = zzbezVar.getPosition();
                    try {
                        zzabn = zzbezVar.zzabn();
                    } catch (IllegalArgumentException unused) {
                        zzbezVar.zzdc(position2);
                        zza(zzbezVar, zzabk);
                    }
                    if (zzabn < 0 || zzabn > 3) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(zzabn);
                        sb.append(" is not a valid enum AdResourceType");
                        throw new IllegalArgumentException(sb.toString());
                        break;
                    } else {
                        this.zzedt = Integer.valueOf(zzabn);
                        continue;
                    }
                    break;
                case 74:
                    int zzb2 = zzbfl.zzb(zzbezVar, 74);
                    String[] strArr = this.zzedu;
                    int length3 = strArr == null ? 0 : strArr.length;
                    int i4 = zzb2 + length3;
                    String[] strArr2 = new String[i4];
                    if (length3 != 0) {
                        System.arraycopy(this.zzedu, 0, strArr2, 0, length3);
                    }
                    while (length3 < i4 - 1) {
                        strArr2[length3] = zzbezVar.readString();
                        zzbezVar.zzabk();
                        length3++;
                    }
                    strArr2[length3] = zzbezVar.readString();
                    this.zzedu = strArr2;
                    continue;
                default:
                    if (super.zza(zzbezVar, zzabk)) {
                        continue;
                    } else {
                        return this;
                    }
            }
            zzbezVar.zza(zzbfiVar);
        }
    }

    public static zzbfu[] zzagu() {
        if (zzedm == null) {
            synchronized (zzbfg.zzebs) {
                if (zzedm == null) {
                    zzedm = new zzbfu[0];
                }
            }
        }
        return zzedm;
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        zzbfaVar.zzm(1, this.zzedn.intValue());
        String str = this.url;
        if (str != null) {
            zzbfaVar.zzf(2, str);
        }
        zzbfp zzbfpVar = this.zzedo;
        if (zzbfpVar != null) {
            zzbfaVar.zza(3, zzbfpVar);
        }
        zzbfr zzbfrVar = this.zzedp;
        if (zzbfrVar != null) {
            zzbfaVar.zza(4, zzbfrVar);
        }
        Integer num = this.zzedq;
        if (num != null) {
            zzbfaVar.zzm(5, num.intValue());
        }
        int[] iArr = this.zzedr;
        int i = 0;
        if (iArr != null && iArr.length > 0) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.zzedr;
                if (i2 >= iArr2.length) {
                    break;
                }
                zzbfaVar.zzm(6, iArr2[i2]);
                i2++;
            }
        }
        String str2 = this.zzeds;
        if (str2 != null) {
            zzbfaVar.zzf(7, str2);
        }
        Integer num2 = this.zzedt;
        if (num2 != null) {
            zzbfaVar.zzm(8, num2.intValue());
        }
        String[] strArr = this.zzedu;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.zzedu;
                if (i >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i];
                if (str3 != null) {
                    zzbfaVar.zzf(9, str3);
                }
                i++;
            }
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int[] iArr;
        int zzr = super.zzr() + zzbfa.zzq(1, this.zzedn.intValue());
        String str = this.url;
        if (str != null) {
            zzr += zzbfa.zzg(2, str);
        }
        zzbfp zzbfpVar = this.zzedo;
        if (zzbfpVar != null) {
            zzr += zzbfa.zzb(3, zzbfpVar);
        }
        zzbfr zzbfrVar = this.zzedp;
        if (zzbfrVar != null) {
            zzr += zzbfa.zzb(4, zzbfrVar);
        }
        Integer num = this.zzedq;
        if (num != null) {
            zzr += zzbfa.zzq(5, num.intValue());
        }
        int[] iArr2 = this.zzedr;
        int i = 0;
        if (iArr2 != null && iArr2.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                iArr = this.zzedr;
                if (i2 >= iArr.length) {
                    break;
                }
                i3 += zzbfa.zzce(iArr[i2]);
                i2++;
            }
            zzr = zzr + i3 + (iArr.length * 1);
        }
        String str2 = this.zzeds;
        if (str2 != null) {
            zzr += zzbfa.zzg(7, str2);
        }
        Integer num2 = this.zzedt;
        if (num2 != null) {
            zzr += zzbfa.zzq(8, num2.intValue());
        }
        String[] strArr = this.zzedu;
        if (strArr == null || strArr.length <= 0) {
            return zzr;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.zzedu;
            if (i >= strArr2.length) {
                return zzr + i4 + (i5 * 1);
            }
            String str3 = strArr2[i];
            if (str3 != null) {
                i5++;
                i4 += zzbfa.zzeo(str3);
            }
            i++;
        }
    }
}
