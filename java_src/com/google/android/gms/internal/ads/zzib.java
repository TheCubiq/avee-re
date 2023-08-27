package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzib extends zzbfc<zzib> {
    public Integer zzalt = null;
    private Integer zzalu = null;
    private zzid zzalv = null;
    public zzie zzalw = null;
    private zzic[] zzalx = zzic.zzhr();
    private zzif zzaly = null;
    private zzio zzalz = null;
    private zzin zzama = null;
    private zzik zzamb = null;
    private zzil zzamc = null;
    private zziu[] zzamd = zziu.zzhu();

    public zzib() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zze */
    public final zzib zza(zzbez zzbezVar) throws IOException {
        int position;
        zzbfi zzbfiVar;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 56:
                    position = zzbezVar.getPosition();
                    int zzacc = zzbezVar.zzacc();
                    if (zzacc >= 0 && zzacc <= 9) {
                        this.zzalt = Integer.valueOf(zzacc);
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder(43);
                        sb.append(zzacc);
                        sb.append(" is not a valid enum AdInitiater");
                        throw new IllegalArgumentException(sb.toString());
                        break;
                    }
                case 64:
                    position = zzbezVar.getPosition();
                    try {
                        this.zzalu = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzbezVar.zzdc(position);
                        zza(zzbezVar, zzabk);
                        break;
                    }
                case 74:
                    if (this.zzalv == null) {
                        this.zzalv = new zzid();
                    }
                    zzbfiVar = this.zzalv;
                    zzbezVar.zza(zzbfiVar);
                    break;
                case 82:
                    if (this.zzalw == null) {
                        this.zzalw = new zzie();
                    }
                    zzbfiVar = this.zzalw;
                    zzbezVar.zza(zzbfiVar);
                    break;
                case 90:
                    int zzb = zzbfl.zzb(zzbezVar, 90);
                    zzic[] zzicVarArr = this.zzalx;
                    int length = zzicVarArr == null ? 0 : zzicVarArr.length;
                    int i = zzb + length;
                    zzic[] zzicVarArr2 = new zzic[i];
                    if (length != 0) {
                        System.arraycopy(this.zzalx, 0, zzicVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        zzicVarArr2[length] = new zzic();
                        zzbezVar.zza(zzicVarArr2[length]);
                        zzbezVar.zzabk();
                        length++;
                    }
                    zzicVarArr2[length] = new zzic();
                    zzbezVar.zza(zzicVarArr2[length]);
                    this.zzalx = zzicVarArr2;
                    break;
                case 98:
                    if (this.zzaly == null) {
                        this.zzaly = new zzif();
                    }
                    zzbfiVar = this.zzaly;
                    zzbezVar.zza(zzbfiVar);
                    break;
                case 106:
                    if (this.zzalz == null) {
                        this.zzalz = new zzio();
                    }
                    zzbfiVar = this.zzalz;
                    zzbezVar.zza(zzbfiVar);
                    break;
                case 114:
                    if (this.zzama == null) {
                        this.zzama = new zzin();
                    }
                    zzbfiVar = this.zzama;
                    zzbezVar.zza(zzbfiVar);
                    break;
                case 122:
                    if (this.zzamb == null) {
                        this.zzamb = new zzik();
                    }
                    zzbfiVar = this.zzamb;
                    zzbezVar.zza(zzbfiVar);
                    break;
                case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                    if (this.zzamc == null) {
                        this.zzamc = new zzil();
                    }
                    zzbfiVar = this.zzamc;
                    zzbezVar.zza(zzbfiVar);
                    break;
                case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                    int zzb2 = zzbfl.zzb(zzbezVar, TsExtractor.TS_STREAM_TYPE_DTS);
                    zziu[] zziuVarArr = this.zzamd;
                    int length2 = zziuVarArr == null ? 0 : zziuVarArr.length;
                    int i2 = zzb2 + length2;
                    zziu[] zziuVarArr2 = new zziu[i2];
                    if (length2 != 0) {
                        System.arraycopy(this.zzamd, 0, zziuVarArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        zziuVarArr2[length2] = new zziu();
                        zzbezVar.zza(zziuVarArr2[length2]);
                        zzbezVar.zzabk();
                        length2++;
                    }
                    zziuVarArr2[length2] = new zziu();
                    zzbezVar.zza(zziuVarArr2[length2]);
                    this.zzamd = zziuVarArr2;
                    break;
                default:
                    if (super.zza(zzbezVar, zzabk)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        Integer num = this.zzalt;
        if (num != null) {
            zzbfaVar.zzm(7, num.intValue());
        }
        Integer num2 = this.zzalu;
        if (num2 != null) {
            zzbfaVar.zzm(8, num2.intValue());
        }
        zzid zzidVar = this.zzalv;
        if (zzidVar != null) {
            zzbfaVar.zza(9, zzidVar);
        }
        zzie zzieVar = this.zzalw;
        if (zzieVar != null) {
            zzbfaVar.zza(10, zzieVar);
        }
        zzic[] zzicVarArr = this.zzalx;
        int i = 0;
        if (zzicVarArr != null && zzicVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzic[] zzicVarArr2 = this.zzalx;
                if (i2 >= zzicVarArr2.length) {
                    break;
                }
                zzic zzicVar = zzicVarArr2[i2];
                if (zzicVar != null) {
                    zzbfaVar.zza(11, zzicVar);
                }
                i2++;
            }
        }
        zzif zzifVar = this.zzaly;
        if (zzifVar != null) {
            zzbfaVar.zza(12, zzifVar);
        }
        zzio zzioVar = this.zzalz;
        if (zzioVar != null) {
            zzbfaVar.zza(13, zzioVar);
        }
        zzin zzinVar = this.zzama;
        if (zzinVar != null) {
            zzbfaVar.zza(14, zzinVar);
        }
        zzik zzikVar = this.zzamb;
        if (zzikVar != null) {
            zzbfaVar.zza(15, zzikVar);
        }
        zzil zzilVar = this.zzamc;
        if (zzilVar != null) {
            zzbfaVar.zza(16, zzilVar);
        }
        zziu[] zziuVarArr = this.zzamd;
        if (zziuVarArr != null && zziuVarArr.length > 0) {
            while (true) {
                zziu[] zziuVarArr2 = this.zzamd;
                if (i >= zziuVarArr2.length) {
                    break;
                }
                zziu zziuVar = zziuVarArr2[i];
                if (zziuVar != null) {
                    zzbfaVar.zza(17, zziuVar);
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
        Integer num = this.zzalt;
        if (num != null) {
            zzr += zzbfa.zzq(7, num.intValue());
        }
        Integer num2 = this.zzalu;
        if (num2 != null) {
            zzr += zzbfa.zzq(8, num2.intValue());
        }
        zzid zzidVar = this.zzalv;
        if (zzidVar != null) {
            zzr += zzbfa.zzb(9, zzidVar);
        }
        zzie zzieVar = this.zzalw;
        if (zzieVar != null) {
            zzr += zzbfa.zzb(10, zzieVar);
        }
        zzic[] zzicVarArr = this.zzalx;
        int i = 0;
        if (zzicVarArr != null && zzicVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzic[] zzicVarArr2 = this.zzalx;
                if (i2 >= zzicVarArr2.length) {
                    break;
                }
                zzic zzicVar = zzicVarArr2[i2];
                if (zzicVar != null) {
                    zzr += zzbfa.zzb(11, zzicVar);
                }
                i2++;
            }
        }
        zzif zzifVar = this.zzaly;
        if (zzifVar != null) {
            zzr += zzbfa.zzb(12, zzifVar);
        }
        zzio zzioVar = this.zzalz;
        if (zzioVar != null) {
            zzr += zzbfa.zzb(13, zzioVar);
        }
        zzin zzinVar = this.zzama;
        if (zzinVar != null) {
            zzr += zzbfa.zzb(14, zzinVar);
        }
        zzik zzikVar = this.zzamb;
        if (zzikVar != null) {
            zzr += zzbfa.zzb(15, zzikVar);
        }
        zzil zzilVar = this.zzamc;
        if (zzilVar != null) {
            zzr += zzbfa.zzb(16, zzilVar);
        }
        zziu[] zziuVarArr = this.zzamd;
        if (zziuVarArr != null && zziuVarArr.length > 0) {
            while (true) {
                zziu[] zziuVarArr2 = this.zzamd;
                if (i >= zziuVarArr2.length) {
                    break;
                }
                zziu zziuVar = zziuVarArr2[i];
                if (zziuVar != null) {
                    zzr += zzbfa.zzb(17, zziuVar);
                }
                i++;
            }
        }
        return zzr;
    }
}
