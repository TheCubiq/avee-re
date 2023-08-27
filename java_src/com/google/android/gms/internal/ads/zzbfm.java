package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzbfm extends zzbfc<zzbfm> {
    public Integer zzamf = null;
    private Integer zzecg = null;
    public String url = null;
    public String zzech = null;
    private String zzeci = null;
    public zzbfn zzecj = null;
    public zzbfu[] zzeck = zzbfu.zzagu();
    public String zzecl = null;
    public zzbft zzecm = null;
    private Boolean zzecn = null;
    private String[] zzeco = zzbfl.zzecd;
    private String zzecp = null;
    private Boolean zzecq = null;
    private Boolean zzecr = null;
    private byte[] zzecs = null;
    public zzbfv zzect = null;
    public String[] zzecu = zzbfl.zzecd;
    public String[] zzecv = zzbfl.zzecd;

    public zzbfm() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c2, code lost:
        r5 = new java.lang.StringBuilder(39);
        r5.append(r2);
        r5.append(" is not a valid enum Verdict");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzaa */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzbfm zza(zzbez zzbezVar) throws IOException {
        int zzabn;
        int zzabn2;
        zzbfi zzbfiVar;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 10:
                    this.url = zzbezVar.readString();
                    continue;
                case 18:
                    this.zzech = zzbezVar.readString();
                    continue;
                case 26:
                    this.zzeci = zzbezVar.readString();
                    continue;
                case 34:
                    int zzb = zzbfl.zzb(zzbezVar, 34);
                    zzbfu[] zzbfuVarArr = this.zzeck;
                    int length = zzbfuVarArr == null ? 0 : zzbfuVarArr.length;
                    int i = zzb + length;
                    zzbfu[] zzbfuVarArr2 = new zzbfu[i];
                    if (length != 0) {
                        System.arraycopy(this.zzeck, 0, zzbfuVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        zzbfuVarArr2[length] = new zzbfu();
                        zzbezVar.zza(zzbfuVarArr2[length]);
                        zzbezVar.zzabk();
                        length++;
                    }
                    zzbfuVarArr2[length] = new zzbfu();
                    zzbezVar.zza(zzbfuVarArr2[length]);
                    this.zzeck = zzbfuVarArr2;
                    continue;
                case 40:
                    this.zzecn = Boolean.valueOf(zzbezVar.zzabq());
                    continue;
                case 50:
                    int zzb2 = zzbfl.zzb(zzbezVar, 50);
                    String[] strArr = this.zzeco;
                    int length2 = strArr == null ? 0 : strArr.length;
                    int i2 = zzb2 + length2;
                    String[] strArr2 = new String[i2];
                    if (length2 != 0) {
                        System.arraycopy(this.zzeco, 0, strArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        strArr2[length2] = zzbezVar.readString();
                        zzbezVar.zzabk();
                        length2++;
                    }
                    strArr2[length2] = zzbezVar.readString();
                    this.zzeco = strArr2;
                    continue;
                case 58:
                    this.zzecp = zzbezVar.readString();
                    continue;
                case 64:
                    this.zzecq = Boolean.valueOf(zzbezVar.zzabq());
                    continue;
                case 72:
                    this.zzecr = Boolean.valueOf(zzbezVar.zzabq());
                    continue;
                case 80:
                    zzbezVar.getPosition();
                    zzabn = zzbezVar.zzabn();
                    if (zzabn >= 0 && zzabn <= 9) {
                        this.zzamf = Integer.valueOf(zzabn);
                        continue;
                    }
                    break;
                case 88:
                    try {
                        zzabn2 = zzbezVar.zzabn();
                    } catch (IllegalArgumentException unused) {
                        zzbezVar.zzdc(zzbezVar.getPosition());
                        zza(zzbezVar, zzabk);
                    }
                    if (zzabn2 >= 0 && zzabn2 <= 4) {
                        this.zzecg = Integer.valueOf(zzabn2);
                        continue;
                    }
                    break;
                case 98:
                    if (this.zzecj == null) {
                        this.zzecj = new zzbfn();
                    }
                    zzbfiVar = this.zzecj;
                    break;
                case 106:
                    this.zzecl = zzbezVar.readString();
                    continue;
                case 114:
                    if (this.zzecm == null) {
                        this.zzecm = new zzbft();
                    }
                    zzbfiVar = this.zzecm;
                    break;
                case 122:
                    this.zzecs = zzbezVar.readBytes();
                    continue;
                case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                    if (this.zzect == null) {
                        this.zzect = new zzbfv();
                    }
                    zzbfiVar = this.zzect;
                    break;
                case 162:
                    int zzb3 = zzbfl.zzb(zzbezVar, 162);
                    String[] strArr3 = this.zzecu;
                    int length3 = strArr3 == null ? 0 : strArr3.length;
                    int i3 = zzb3 + length3;
                    String[] strArr4 = new String[i3];
                    if (length3 != 0) {
                        System.arraycopy(this.zzecu, 0, strArr4, 0, length3);
                    }
                    while (length3 < i3 - 1) {
                        strArr4[length3] = zzbezVar.readString();
                        zzbezVar.zzabk();
                        length3++;
                    }
                    strArr4[length3] = zzbezVar.readString();
                    this.zzecu = strArr4;
                    continue;
                case 170:
                    int zzb4 = zzbfl.zzb(zzbezVar, 170);
                    String[] strArr5 = this.zzecv;
                    int length4 = strArr5 == null ? 0 : strArr5.length;
                    int i4 = zzb4 + length4;
                    String[] strArr6 = new String[i4];
                    if (length4 != 0) {
                        System.arraycopy(this.zzecv, 0, strArr6, 0, length4);
                    }
                    while (length4 < i4 - 1) {
                        strArr6[length4] = zzbezVar.readString();
                        zzbezVar.zzabk();
                        length4++;
                    }
                    strArr6[length4] = zzbezVar.readString();
                    this.zzecv = strArr6;
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
        StringBuilder sb = new StringBuilder(42);
        sb.append(zzabn);
        sb.append(" is not a valid enum ReportType");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        String str = this.url;
        if (str != null) {
            zzbfaVar.zzf(1, str);
        }
        String str2 = this.zzech;
        if (str2 != null) {
            zzbfaVar.zzf(2, str2);
        }
        String str3 = this.zzeci;
        if (str3 != null) {
            zzbfaVar.zzf(3, str3);
        }
        zzbfu[] zzbfuVarArr = this.zzeck;
        int i = 0;
        if (zzbfuVarArr != null && zzbfuVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzbfu[] zzbfuVarArr2 = this.zzeck;
                if (i2 >= zzbfuVarArr2.length) {
                    break;
                }
                zzbfu zzbfuVar = zzbfuVarArr2[i2];
                if (zzbfuVar != null) {
                    zzbfaVar.zza(4, zzbfuVar);
                }
                i2++;
            }
        }
        Boolean bool = this.zzecn;
        if (bool != null) {
            zzbfaVar.zzf(5, bool.booleanValue());
        }
        String[] strArr = this.zzeco;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.zzeco;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str4 = strArr2[i3];
                if (str4 != null) {
                    zzbfaVar.zzf(6, str4);
                }
                i3++;
            }
        }
        String str5 = this.zzecp;
        if (str5 != null) {
            zzbfaVar.zzf(7, str5);
        }
        Boolean bool2 = this.zzecq;
        if (bool2 != null) {
            zzbfaVar.zzf(8, bool2.booleanValue());
        }
        Boolean bool3 = this.zzecr;
        if (bool3 != null) {
            zzbfaVar.zzf(9, bool3.booleanValue());
        }
        Integer num = this.zzamf;
        if (num != null) {
            zzbfaVar.zzm(10, num.intValue());
        }
        Integer num2 = this.zzecg;
        if (num2 != null) {
            zzbfaVar.zzm(11, num2.intValue());
        }
        zzbfn zzbfnVar = this.zzecj;
        if (zzbfnVar != null) {
            zzbfaVar.zza(12, zzbfnVar);
        }
        String str6 = this.zzecl;
        if (str6 != null) {
            zzbfaVar.zzf(13, str6);
        }
        zzbft zzbftVar = this.zzecm;
        if (zzbftVar != null) {
            zzbfaVar.zza(14, zzbftVar);
        }
        byte[] bArr = this.zzecs;
        if (bArr != null) {
            zzbfaVar.zza(15, bArr);
        }
        zzbfv zzbfvVar = this.zzect;
        if (zzbfvVar != null) {
            zzbfaVar.zza(17, zzbfvVar);
        }
        String[] strArr3 = this.zzecu;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr4 = this.zzecu;
                if (i4 >= strArr4.length) {
                    break;
                }
                String str7 = strArr4[i4];
                if (str7 != null) {
                    zzbfaVar.zzf(20, str7);
                }
                i4++;
            }
        }
        String[] strArr5 = this.zzecv;
        if (strArr5 != null && strArr5.length > 0) {
            while (true) {
                String[] strArr6 = this.zzecv;
                if (i >= strArr6.length) {
                    break;
                }
                String str8 = strArr6[i];
                if (str8 != null) {
                    zzbfaVar.zzf(21, str8);
                }
                i++;
            }
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        String str = this.url;
        if (str != null) {
            zzr += zzbfa.zzg(1, str);
        }
        String str2 = this.zzech;
        if (str2 != null) {
            zzr += zzbfa.zzg(2, str2);
        }
        String str3 = this.zzeci;
        if (str3 != null) {
            zzr += zzbfa.zzg(3, str3);
        }
        zzbfu[] zzbfuVarArr = this.zzeck;
        int i = 0;
        if (zzbfuVarArr != null && zzbfuVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzbfu[] zzbfuVarArr2 = this.zzeck;
                if (i2 >= zzbfuVarArr2.length) {
                    break;
                }
                zzbfu zzbfuVar = zzbfuVarArr2[i2];
                if (zzbfuVar != null) {
                    zzr += zzbfa.zzb(4, zzbfuVar);
                }
                i2++;
            }
        }
        Boolean bool = this.zzecn;
        if (bool != null) {
            bool.booleanValue();
            zzr += zzbfa.zzcd(5) + 1;
        }
        String[] strArr = this.zzeco;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.zzeco;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str4 = strArr2[i3];
                if (str4 != null) {
                    i5++;
                    i4 += zzbfa.zzeo(str4);
                }
                i3++;
            }
            zzr = zzr + i4 + (i5 * 1);
        }
        String str5 = this.zzecp;
        if (str5 != null) {
            zzr += zzbfa.zzg(7, str5);
        }
        Boolean bool2 = this.zzecq;
        if (bool2 != null) {
            bool2.booleanValue();
            zzr += zzbfa.zzcd(8) + 1;
        }
        Boolean bool3 = this.zzecr;
        if (bool3 != null) {
            bool3.booleanValue();
            zzr += zzbfa.zzcd(9) + 1;
        }
        Integer num = this.zzamf;
        if (num != null) {
            zzr += zzbfa.zzq(10, num.intValue());
        }
        Integer num2 = this.zzecg;
        if (num2 != null) {
            zzr += zzbfa.zzq(11, num2.intValue());
        }
        zzbfn zzbfnVar = this.zzecj;
        if (zzbfnVar != null) {
            zzr += zzbfa.zzb(12, zzbfnVar);
        }
        String str6 = this.zzecl;
        if (str6 != null) {
            zzr += zzbfa.zzg(13, str6);
        }
        zzbft zzbftVar = this.zzecm;
        if (zzbftVar != null) {
            zzr += zzbfa.zzb(14, zzbftVar);
        }
        byte[] bArr = this.zzecs;
        if (bArr != null) {
            zzr += zzbfa.zzb(15, bArr);
        }
        zzbfv zzbfvVar = this.zzect;
        if (zzbfvVar != null) {
            zzr += zzbfa.zzb(17, zzbfvVar);
        }
        String[] strArr3 = this.zzecu;
        if (strArr3 != null && strArr3.length > 0) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr4 = this.zzecu;
                if (i6 >= strArr4.length) {
                    break;
                }
                String str7 = strArr4[i6];
                if (str7 != null) {
                    i8++;
                    i7 += zzbfa.zzeo(str7);
                }
                i6++;
            }
            zzr = zzr + i7 + (i8 * 2);
        }
        String[] strArr5 = this.zzecv;
        if (strArr5 == null || strArr5.length <= 0) {
            return zzr;
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            String[] strArr6 = this.zzecv;
            if (i >= strArr6.length) {
                return zzr + i9 + (i10 * 2);
            }
            String str8 = strArr6[i];
            if (str8 != null) {
                i10++;
                i9 += zzbfa.zzeo(str8);
            }
            i++;
        }
    }
}
