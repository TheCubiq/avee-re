package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzio extends zzbfc<zzio> {
    private Integer zzaoa = null;
    private Integer zzaob = null;
    private Integer zzaoc = null;
    private Integer zzaod = null;
    private Integer zzaoe = null;
    private Integer zzaof = null;
    private Integer zzaog = null;
    private Integer zzaoh = null;
    private Integer zzaoi = null;
    private Integer zzaoj = null;
    private zzip zzaok = null;

    public zzio() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzq */
    public final zzio zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 8:
                    zzbezVar.getPosition();
                    this.zzaoa = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                    break;
                case 16:
                    int position = zzbezVar.getPosition();
                    try {
                        this.zzaob = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzbezVar.zzdc(position);
                        zza(zzbezVar, zzabk);
                        break;
                    }
                case 24:
                    this.zzaoc = Integer.valueOf(zzbezVar.zzacc());
                    break;
                case 32:
                    this.zzaod = Integer.valueOf(zzbezVar.zzacc());
                    break;
                case 40:
                    this.zzaoe = Integer.valueOf(zzbezVar.zzacc());
                    break;
                case 48:
                    this.zzaof = Integer.valueOf(zzbezVar.zzacc());
                    break;
                case 56:
                    this.zzaog = Integer.valueOf(zzbezVar.zzacc());
                    break;
                case 64:
                    this.zzaoh = Integer.valueOf(zzbezVar.zzacc());
                    break;
                case 72:
                    this.zzaoi = Integer.valueOf(zzbezVar.zzacc());
                    break;
                case 80:
                    this.zzaoj = Integer.valueOf(zzbezVar.zzacc());
                    break;
                case 90:
                    if (this.zzaok == null) {
                        this.zzaok = new zzip();
                    }
                    zzbezVar.zza(this.zzaok);
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
        Integer num = this.zzaoa;
        if (num != null) {
            zzbfaVar.zzm(1, num.intValue());
        }
        Integer num2 = this.zzaob;
        if (num2 != null) {
            zzbfaVar.zzm(2, num2.intValue());
        }
        Integer num3 = this.zzaoc;
        if (num3 != null) {
            zzbfaVar.zzm(3, num3.intValue());
        }
        Integer num4 = this.zzaod;
        if (num4 != null) {
            zzbfaVar.zzm(4, num4.intValue());
        }
        Integer num5 = this.zzaoe;
        if (num5 != null) {
            zzbfaVar.zzm(5, num5.intValue());
        }
        Integer num6 = this.zzaof;
        if (num6 != null) {
            zzbfaVar.zzm(6, num6.intValue());
        }
        Integer num7 = this.zzaog;
        if (num7 != null) {
            zzbfaVar.zzm(7, num7.intValue());
        }
        Integer num8 = this.zzaoh;
        if (num8 != null) {
            zzbfaVar.zzm(8, num8.intValue());
        }
        Integer num9 = this.zzaoi;
        if (num9 != null) {
            zzbfaVar.zzm(9, num9.intValue());
        }
        Integer num10 = this.zzaoj;
        if (num10 != null) {
            zzbfaVar.zzm(10, num10.intValue());
        }
        zzip zzipVar = this.zzaok;
        if (zzipVar != null) {
            zzbfaVar.zza(11, zzipVar);
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        Integer num = this.zzaoa;
        if (num != null) {
            zzr += zzbfa.zzq(1, num.intValue());
        }
        Integer num2 = this.zzaob;
        if (num2 != null) {
            zzr += zzbfa.zzq(2, num2.intValue());
        }
        Integer num3 = this.zzaoc;
        if (num3 != null) {
            zzr += zzbfa.zzq(3, num3.intValue());
        }
        Integer num4 = this.zzaod;
        if (num4 != null) {
            zzr += zzbfa.zzq(4, num4.intValue());
        }
        Integer num5 = this.zzaoe;
        if (num5 != null) {
            zzr += zzbfa.zzq(5, num5.intValue());
        }
        Integer num6 = this.zzaof;
        if (num6 != null) {
            zzr += zzbfa.zzq(6, num6.intValue());
        }
        Integer num7 = this.zzaog;
        if (num7 != null) {
            zzr += zzbfa.zzq(7, num7.intValue());
        }
        Integer num8 = this.zzaoh;
        if (num8 != null) {
            zzr += zzbfa.zzq(8, num8.intValue());
        }
        Integer num9 = this.zzaoi;
        if (num9 != null) {
            zzr += zzbfa.zzq(9, num9.intValue());
        }
        Integer num10 = this.zzaoj;
        if (num10 != null) {
            zzr += zzbfa.zzq(10, num10.intValue());
        }
        zzip zzipVar = this.zzaok;
        return zzipVar != null ? zzr + zzbfa.zzb(11, zzipVar) : zzr;
    }
}
