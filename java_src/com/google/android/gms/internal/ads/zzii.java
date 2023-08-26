package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzii extends zzbfc<zzii> {
    private Integer zzang = null;
    public String zzanh = null;
    private Integer zzani = null;
    private Integer zzanj = null;
    private zzit zzank = null;
    public long[] zzanl = zzbfl.zzebz;
    public zzig zzanm = null;
    private zzih zzann = null;
    private zzim zzano = null;
    public zzib zzanp = null;

    public zzii() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzk */
    public final zzii zza(zzbez zzbezVar) throws IOException {
        zzbfi zzbfiVar;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 72:
                    this.zzang = Integer.valueOf(zzbezVar.zzacc());
                    continue;
                case 82:
                    this.zzanh = zzbezVar.readString();
                    continue;
                case 88:
                    this.zzani = Integer.valueOf(zzbezVar.zzacc());
                    continue;
                case 96:
                    int position = zzbezVar.getPosition();
                    try {
                        this.zzanj = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                        continue;
                    } catch (IllegalArgumentException unused) {
                        zzbezVar.zzdc(position);
                        zza(zzbezVar, zzabk);
                    }
                case 106:
                    if (this.zzank == null) {
                        this.zzank = new zzit();
                    }
                    zzbfiVar = this.zzank;
                    break;
                case 112:
                    int zzb = zzbfl.zzb(zzbezVar, 112);
                    long[] jArr = this.zzanl;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = zzb + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(this.zzanl, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = zzbezVar.zzacd();
                        zzbezVar.zzabk();
                        length++;
                    }
                    jArr2[length] = zzbezVar.zzacd();
                    this.zzanl = jArr2;
                    continue;
                case 114:
                    int zzbr = zzbezVar.zzbr(zzbezVar.zzacc());
                    int position2 = zzbezVar.getPosition();
                    int i2 = 0;
                    while (zzbezVar.zzagn() > 0) {
                        zzbezVar.zzacd();
                        i2++;
                    }
                    zzbezVar.zzdc(position2);
                    long[] jArr3 = this.zzanl;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(this.zzanl, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = zzbezVar.zzacd();
                        length2++;
                    }
                    this.zzanl = jArr4;
                    zzbezVar.zzbs(zzbr);
                    continue;
                case 122:
                    if (this.zzanm == null) {
                        this.zzanm = new zzig();
                    }
                    zzbfiVar = this.zzanm;
                    break;
                case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                    if (this.zzann == null) {
                        this.zzann = new zzih();
                    }
                    zzbfiVar = this.zzann;
                    break;
                case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                    if (this.zzano == null) {
                        this.zzano = new zzim();
                    }
                    zzbfiVar = this.zzano;
                    break;
                case 146:
                    if (this.zzanp == null) {
                        this.zzanp = new zzib();
                    }
                    zzbfiVar = this.zzanp;
                    break;
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

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        Integer num = this.zzang;
        if (num != null) {
            zzbfaVar.zzm(9, num.intValue());
        }
        String str = this.zzanh;
        if (str != null) {
            zzbfaVar.zzf(10, str);
        }
        Integer num2 = this.zzani;
        int i = 0;
        if (num2 != null) {
            int intValue = num2.intValue();
            zzbfaVar.zzl(11, 0);
            zzbfaVar.zzde(intValue);
        }
        Integer num3 = this.zzanj;
        if (num3 != null) {
            zzbfaVar.zzm(12, num3.intValue());
        }
        zzit zzitVar = this.zzank;
        if (zzitVar != null) {
            zzbfaVar.zza(13, zzitVar);
        }
        long[] jArr = this.zzanl;
        if (jArr != null && jArr.length > 0) {
            while (true) {
                long[] jArr2 = this.zzanl;
                if (i >= jArr2.length) {
                    break;
                }
                zzbfaVar.zza(14, jArr2[i]);
                i++;
            }
        }
        zzig zzigVar = this.zzanm;
        if (zzigVar != null) {
            zzbfaVar.zza(15, zzigVar);
        }
        zzih zzihVar = this.zzann;
        if (zzihVar != null) {
            zzbfaVar.zza(16, zzihVar);
        }
        zzim zzimVar = this.zzano;
        if (zzimVar != null) {
            zzbfaVar.zza(17, zzimVar);
        }
        zzib zzibVar = this.zzanp;
        if (zzibVar != null) {
            zzbfaVar.zza(18, zzibVar);
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        long[] jArr;
        int zzr = super.zzr();
        Integer num = this.zzang;
        if (num != null) {
            zzr += zzbfa.zzq(9, num.intValue());
        }
        String str = this.zzanh;
        if (str != null) {
            zzr += zzbfa.zzg(10, str);
        }
        Integer num2 = this.zzani;
        if (num2 != null) {
            zzr += zzbfa.zzcd(11) + zzbfa.zzcl(num2.intValue());
        }
        Integer num3 = this.zzanj;
        if (num3 != null) {
            zzr += zzbfa.zzq(12, num3.intValue());
        }
        zzit zzitVar = this.zzank;
        if (zzitVar != null) {
            zzr += zzbfa.zzb(13, zzitVar);
        }
        long[] jArr2 = this.zzanl;
        if (jArr2 != null && jArr2.length > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                jArr = this.zzanl;
                if (i >= jArr.length) {
                    break;
                }
                i2 += zzbfa.zzy(jArr[i]);
                i++;
            }
            zzr = zzr + i2 + (jArr.length * 1);
        }
        zzig zzigVar = this.zzanm;
        if (zzigVar != null) {
            zzr += zzbfa.zzb(15, zzigVar);
        }
        zzih zzihVar = this.zzann;
        if (zzihVar != null) {
            zzr += zzbfa.zzb(16, zzihVar);
        }
        zzim zzimVar = this.zzano;
        if (zzimVar != null) {
            zzr += zzbfa.zzb(17, zzimVar);
        }
        zzib zzibVar = this.zzanp;
        return zzibVar != null ? zzr + zzbfa.zzb(18, zzibVar) : zzr;
    }
}
