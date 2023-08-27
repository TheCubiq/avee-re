package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzja extends zzbfc<zzja> {
    private Integer zzanu = null;
    private zziw zzapn = null;
    private Integer zzape = null;
    private Integer zzapf = null;
    private Integer zzapr = null;
    private Long zzaps = null;

    public zzja() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzx */
    public final zzja zza(zzbez zzbezVar) throws IOException {
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
            } else if (zzabk == 18) {
                if (this.zzapn == null) {
                    this.zzapn = new zziw();
                }
                zzbezVar.zza(this.zzapn);
            } else if (zzabk == 24) {
                this.zzape = Integer.valueOf(zzbezVar.zzacc());
            } else if (zzabk == 32) {
                this.zzapf = Integer.valueOf(zzbezVar.zzacc());
            } else if (zzabk == 40) {
                this.zzapr = Integer.valueOf(zzbezVar.zzacc());
            } else if (zzabk == 48) {
                this.zzaps = Long.valueOf(zzbezVar.zzacd());
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
        zziw zziwVar = this.zzapn;
        if (zziwVar != null) {
            zzbfaVar.zza(2, zziwVar);
        }
        Integer num2 = this.zzape;
        if (num2 != null) {
            zzbfaVar.zzm(3, num2.intValue());
        }
        Integer num3 = this.zzapf;
        if (num3 != null) {
            zzbfaVar.zzm(4, num3.intValue());
        }
        Integer num4 = this.zzapr;
        if (num4 != null) {
            zzbfaVar.zzm(5, num4.intValue());
        }
        Long l = this.zzaps;
        if (l != null) {
            zzbfaVar.zza(6, l.longValue());
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
        zziw zziwVar = this.zzapn;
        if (zziwVar != null) {
            zzr += zzbfa.zzb(2, zziwVar);
        }
        Integer num2 = this.zzape;
        if (num2 != null) {
            zzr += zzbfa.zzq(3, num2.intValue());
        }
        Integer num3 = this.zzapf;
        if (num3 != null) {
            zzr += zzbfa.zzq(4, num3.intValue());
        }
        Integer num4 = this.zzapr;
        if (num4 != null) {
            zzr += zzbfa.zzq(5, num4.intValue());
        }
        Long l = this.zzaps;
        return l != null ? zzr + zzbfa.zze(6, l.longValue()) : zzr;
    }
}
