package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzbb extends zzbfc<zzbb> {
    private static volatile zzbb[] zzfo;
    public Integer zzft;
    public Integer zzfx;
    public Long zzdo = null;
    public Long zzdp = null;
    public Long zzfp = null;
    public Long zzfq = null;
    public Long zzfr = null;
    public Long zzfs = null;
    public Long zzfu = null;
    public Long zzfv = null;
    public Long zzfw = null;
    public Long zzfy = null;
    public Long zzfz = null;
    public Long zzga = null;
    public Long zzgb = null;
    public Long zzgc = null;
    public Long zzgd = null;
    public Long zzge = null;
    public Long zzgf = null;
    private Long zzgg = null;
    private Long zzgh = null;

    public zzbb() {
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzc */
    public final zzbb zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 8:
                    this.zzdo = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 16:
                    this.zzdp = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 24:
                    this.zzfp = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 32:
                    this.zzfq = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 40:
                    this.zzfr = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 48:
                    this.zzfs = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 56:
                    zzbezVar.getPosition();
                    this.zzft = Integer.valueOf(zzaz.zzd(zzbezVar.zzacc()));
                    break;
                case 64:
                    this.zzfu = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 72:
                    this.zzfv = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 80:
                    this.zzfw = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 88:
                    int position = zzbezVar.getPosition();
                    try {
                        this.zzfx = Integer.valueOf(zzaz.zzd(zzbezVar.zzacc()));
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzbezVar.zzdc(position);
                        zza(zzbezVar, zzabk);
                        break;
                    }
                case 96:
                    this.zzfy = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 104:
                    this.zzfz = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 112:
                    this.zzga = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 120:
                    this.zzgb = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 128:
                    this.zzgc = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 136:
                    this.zzgd = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 144:
                    this.zzge = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 152:
                    this.zzgf = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 160:
                    this.zzgg = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 168:
                    this.zzgh = Long.valueOf(zzbezVar.zzacd());
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

    public static zzbb[] zzs() {
        if (zzfo == null) {
            synchronized (zzbfg.zzebs) {
                if (zzfo == null) {
                    zzfo = new zzbb[0];
                }
            }
        }
        return zzfo;
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        Long l = this.zzdo;
        if (l != null) {
            zzbfaVar.zzi(1, l.longValue());
        }
        Long l2 = this.zzdp;
        if (l2 != null) {
            zzbfaVar.zzi(2, l2.longValue());
        }
        Long l3 = this.zzfp;
        if (l3 != null) {
            zzbfaVar.zzi(3, l3.longValue());
        }
        Long l4 = this.zzfq;
        if (l4 != null) {
            zzbfaVar.zzi(4, l4.longValue());
        }
        Long l5 = this.zzfr;
        if (l5 != null) {
            zzbfaVar.zzi(5, l5.longValue());
        }
        Long l6 = this.zzfs;
        if (l6 != null) {
            zzbfaVar.zzi(6, l6.longValue());
        }
        Integer num = this.zzft;
        if (num != null) {
            zzbfaVar.zzm(7, num.intValue());
        }
        Long l7 = this.zzfu;
        if (l7 != null) {
            zzbfaVar.zzi(8, l7.longValue());
        }
        Long l8 = this.zzfv;
        if (l8 != null) {
            zzbfaVar.zzi(9, l8.longValue());
        }
        Long l9 = this.zzfw;
        if (l9 != null) {
            zzbfaVar.zzi(10, l9.longValue());
        }
        Integer num2 = this.zzfx;
        if (num2 != null) {
            zzbfaVar.zzm(11, num2.intValue());
        }
        Long l10 = this.zzfy;
        if (l10 != null) {
            zzbfaVar.zzi(12, l10.longValue());
        }
        Long l11 = this.zzfz;
        if (l11 != null) {
            zzbfaVar.zzi(13, l11.longValue());
        }
        Long l12 = this.zzga;
        if (l12 != null) {
            zzbfaVar.zzi(14, l12.longValue());
        }
        Long l13 = this.zzgb;
        if (l13 != null) {
            zzbfaVar.zzi(15, l13.longValue());
        }
        Long l14 = this.zzgc;
        if (l14 != null) {
            zzbfaVar.zzi(16, l14.longValue());
        }
        Long l15 = this.zzgd;
        if (l15 != null) {
            zzbfaVar.zzi(17, l15.longValue());
        }
        Long l16 = this.zzge;
        if (l16 != null) {
            zzbfaVar.zzi(18, l16.longValue());
        }
        Long l17 = this.zzgf;
        if (l17 != null) {
            zzbfaVar.zzi(19, l17.longValue());
        }
        Long l18 = this.zzgg;
        if (l18 != null) {
            zzbfaVar.zzi(20, l18.longValue());
        }
        Long l19 = this.zzgh;
        if (l19 != null) {
            zzbfaVar.zzi(21, l19.longValue());
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        Long l = this.zzdo;
        if (l != null) {
            zzr += zzbfa.zzd(1, l.longValue());
        }
        Long l2 = this.zzdp;
        if (l2 != null) {
            zzr += zzbfa.zzd(2, l2.longValue());
        }
        Long l3 = this.zzfp;
        if (l3 != null) {
            zzr += zzbfa.zzd(3, l3.longValue());
        }
        Long l4 = this.zzfq;
        if (l4 != null) {
            zzr += zzbfa.zzd(4, l4.longValue());
        }
        Long l5 = this.zzfr;
        if (l5 != null) {
            zzr += zzbfa.zzd(5, l5.longValue());
        }
        Long l6 = this.zzfs;
        if (l6 != null) {
            zzr += zzbfa.zzd(6, l6.longValue());
        }
        Integer num = this.zzft;
        if (num != null) {
            zzr += zzbfa.zzq(7, num.intValue());
        }
        Long l7 = this.zzfu;
        if (l7 != null) {
            zzr += zzbfa.zzd(8, l7.longValue());
        }
        Long l8 = this.zzfv;
        if (l8 != null) {
            zzr += zzbfa.zzd(9, l8.longValue());
        }
        Long l9 = this.zzfw;
        if (l9 != null) {
            zzr += zzbfa.zzd(10, l9.longValue());
        }
        Integer num2 = this.zzfx;
        if (num2 != null) {
            zzr += zzbfa.zzq(11, num2.intValue());
        }
        Long l10 = this.zzfy;
        if (l10 != null) {
            zzr += zzbfa.zzd(12, l10.longValue());
        }
        Long l11 = this.zzfz;
        if (l11 != null) {
            zzr += zzbfa.zzd(13, l11.longValue());
        }
        Long l12 = this.zzga;
        if (l12 != null) {
            zzr += zzbfa.zzd(14, l12.longValue());
        }
        Long l13 = this.zzgb;
        if (l13 != null) {
            zzr += zzbfa.zzd(15, l13.longValue());
        }
        Long l14 = this.zzgc;
        if (l14 != null) {
            zzr += zzbfa.zzd(16, l14.longValue());
        }
        Long l15 = this.zzgd;
        if (l15 != null) {
            zzr += zzbfa.zzd(17, l15.longValue());
        }
        Long l16 = this.zzge;
        if (l16 != null) {
            zzr += zzbfa.zzd(18, l16.longValue());
        }
        Long l17 = this.zzgf;
        if (l17 != null) {
            zzr += zzbfa.zzd(19, l17.longValue());
        }
        Long l18 = this.zzgg;
        if (l18 != null) {
            zzr += zzbfa.zzd(20, l18.longValue());
        }
        Long l19 = this.zzgh;
        return l19 != null ? zzr + zzbfa.zzd(21, l19.longValue()) : zzr;
    }
}
