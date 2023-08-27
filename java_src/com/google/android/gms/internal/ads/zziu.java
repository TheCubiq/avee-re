package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zziu extends zzbfc<zziu> {
    private static volatile zziu[] zzaow;
    private zziy zzaox = null;
    private zzja zzaoy = null;
    private zzjb zzaoz = null;
    private zzjc zzapa = null;
    private zziv zzapb = null;
    private zziz zzapc = null;
    private zzix zzapd = null;
    private Integer zzape = null;
    private Integer zzapf = null;
    private zzis zzapg = null;
    private Integer zzaph = null;
    private Integer zzapi = null;
    private Integer zzapj = null;
    private Integer zzapk = null;
    private Integer zzapl = null;
    private Long zzapm = null;

    public zziu() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    public static zziu[] zzhu() {
        if (zzaow == null) {
            synchronized (zzbfg.zzebs) {
                if (zzaow == null) {
                    zzaow = new zziu[0];
                }
            }
        }
        return zzaow;
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* synthetic */ zzbfi zza(zzbez zzbezVar) throws IOException {
        zzbfi zzbfiVar;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 42:
                    if (this.zzaox == null) {
                        this.zzaox = new zziy();
                    }
                    zzbfiVar = this.zzaox;
                    break;
                case 50:
                    if (this.zzaoy == null) {
                        this.zzaoy = new zzja();
                    }
                    zzbfiVar = this.zzaoy;
                    break;
                case 58:
                    if (this.zzaoz == null) {
                        this.zzaoz = new zzjb();
                    }
                    zzbfiVar = this.zzaoz;
                    break;
                case 66:
                    if (this.zzapa == null) {
                        this.zzapa = new zzjc();
                    }
                    zzbfiVar = this.zzapa;
                    break;
                case 74:
                    if (this.zzapb == null) {
                        this.zzapb = new zziv();
                    }
                    zzbfiVar = this.zzapb;
                    break;
                case 82:
                    if (this.zzapc == null) {
                        this.zzapc = new zziz();
                    }
                    zzbfiVar = this.zzapc;
                    break;
                case 90:
                    if (this.zzapd == null) {
                        this.zzapd = new zzix();
                    }
                    zzbfiVar = this.zzapd;
                    break;
                case 96:
                    this.zzape = Integer.valueOf(zzbezVar.zzacc());
                    continue;
                case 104:
                    this.zzapf = Integer.valueOf(zzbezVar.zzacc());
                    continue;
                case 114:
                    if (this.zzapg == null) {
                        this.zzapg = new zzis();
                    }
                    zzbfiVar = this.zzapg;
                    break;
                case 120:
                    this.zzaph = Integer.valueOf(zzbezVar.zzacc());
                    continue;
                case 128:
                    this.zzapi = Integer.valueOf(zzbezVar.zzacc());
                    continue;
                case 136:
                    this.zzapj = Integer.valueOf(zzbezVar.zzacc());
                    continue;
                case 144:
                    this.zzapk = Integer.valueOf(zzbezVar.zzacc());
                    continue;
                case 152:
                    this.zzapl = Integer.valueOf(zzbezVar.zzacc());
                    continue;
                case 160:
                    this.zzapm = Long.valueOf(zzbezVar.zzacd());
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

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        zziy zziyVar = this.zzaox;
        if (zziyVar != null) {
            zzbfaVar.zza(5, zziyVar);
        }
        zzja zzjaVar = this.zzaoy;
        if (zzjaVar != null) {
            zzbfaVar.zza(6, zzjaVar);
        }
        zzjb zzjbVar = this.zzaoz;
        if (zzjbVar != null) {
            zzbfaVar.zza(7, zzjbVar);
        }
        zzjc zzjcVar = this.zzapa;
        if (zzjcVar != null) {
            zzbfaVar.zza(8, zzjcVar);
        }
        zziv zzivVar = this.zzapb;
        if (zzivVar != null) {
            zzbfaVar.zza(9, zzivVar);
        }
        zziz zzizVar = this.zzapc;
        if (zzizVar != null) {
            zzbfaVar.zza(10, zzizVar);
        }
        zzix zzixVar = this.zzapd;
        if (zzixVar != null) {
            zzbfaVar.zza(11, zzixVar);
        }
        Integer num = this.zzape;
        if (num != null) {
            zzbfaVar.zzm(12, num.intValue());
        }
        Integer num2 = this.zzapf;
        if (num2 != null) {
            zzbfaVar.zzm(13, num2.intValue());
        }
        zzis zzisVar = this.zzapg;
        if (zzisVar != null) {
            zzbfaVar.zza(14, zzisVar);
        }
        Integer num3 = this.zzaph;
        if (num3 != null) {
            zzbfaVar.zzm(15, num3.intValue());
        }
        Integer num4 = this.zzapi;
        if (num4 != null) {
            zzbfaVar.zzm(16, num4.intValue());
        }
        Integer num5 = this.zzapj;
        if (num5 != null) {
            zzbfaVar.zzm(17, num5.intValue());
        }
        Integer num6 = this.zzapk;
        if (num6 != null) {
            zzbfaVar.zzm(18, num6.intValue());
        }
        Integer num7 = this.zzapl;
        if (num7 != null) {
            zzbfaVar.zzm(19, num7.intValue());
        }
        Long l = this.zzapm;
        if (l != null) {
            zzbfaVar.zza(20, l.longValue());
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        zziy zziyVar = this.zzaox;
        if (zziyVar != null) {
            zzr += zzbfa.zzb(5, zziyVar);
        }
        zzja zzjaVar = this.zzaoy;
        if (zzjaVar != null) {
            zzr += zzbfa.zzb(6, zzjaVar);
        }
        zzjb zzjbVar = this.zzaoz;
        if (zzjbVar != null) {
            zzr += zzbfa.zzb(7, zzjbVar);
        }
        zzjc zzjcVar = this.zzapa;
        if (zzjcVar != null) {
            zzr += zzbfa.zzb(8, zzjcVar);
        }
        zziv zzivVar = this.zzapb;
        if (zzivVar != null) {
            zzr += zzbfa.zzb(9, zzivVar);
        }
        zziz zzizVar = this.zzapc;
        if (zzizVar != null) {
            zzr += zzbfa.zzb(10, zzizVar);
        }
        zzix zzixVar = this.zzapd;
        if (zzixVar != null) {
            zzr += zzbfa.zzb(11, zzixVar);
        }
        Integer num = this.zzape;
        if (num != null) {
            zzr += zzbfa.zzq(12, num.intValue());
        }
        Integer num2 = this.zzapf;
        if (num2 != null) {
            zzr += zzbfa.zzq(13, num2.intValue());
        }
        zzis zzisVar = this.zzapg;
        if (zzisVar != null) {
            zzr += zzbfa.zzb(14, zzisVar);
        }
        Integer num3 = this.zzaph;
        if (num3 != null) {
            zzr += zzbfa.zzq(15, num3.intValue());
        }
        Integer num4 = this.zzapi;
        if (num4 != null) {
            zzr += zzbfa.zzq(16, num4.intValue());
        }
        Integer num5 = this.zzapj;
        if (num5 != null) {
            zzr += zzbfa.zzq(17, num5.intValue());
        }
        Integer num6 = this.zzapk;
        if (num6 != null) {
            zzr += zzbfa.zzq(18, num6.intValue());
        }
        Integer num7 = this.zzapl;
        if (num7 != null) {
            zzr += zzbfa.zzq(19, num7.intValue());
        }
        Long l = this.zzapm;
        return l != null ? zzr + zzbfa.zze(20, l.longValue()) : zzr;
    }
}
