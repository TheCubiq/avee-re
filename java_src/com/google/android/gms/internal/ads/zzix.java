package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzix extends zzbfc<zzix> {
    private zzit zzapq = null;
    private Integer zzanu = null;
    private zziw zzapn = null;
    private zzis zzapo = null;

    public zzix() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzu */
    public final zzix zza(zzbez zzbezVar) throws IOException {
        zzbfi zzbfiVar;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 10) {
                if (this.zzapq == null) {
                    this.zzapq = new zzit();
                }
                zzbfiVar = this.zzapq;
            } else if (zzabk == 16) {
                int position = zzbezVar.getPosition();
                try {
                    this.zzanu = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            } else if (zzabk == 26) {
                if (this.zzapn == null) {
                    this.zzapn = new zziw();
                }
                zzbfiVar = this.zzapn;
            } else if (zzabk == 34) {
                if (this.zzapo == null) {
                    this.zzapo = new zzis();
                }
                zzbfiVar = this.zzapo;
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
            zzbezVar.zza(zzbfiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        zzit zzitVar = this.zzapq;
        if (zzitVar != null) {
            zzbfaVar.zza(1, zzitVar);
        }
        Integer num = this.zzanu;
        if (num != null) {
            zzbfaVar.zzm(2, num.intValue());
        }
        zziw zziwVar = this.zzapn;
        if (zziwVar != null) {
            zzbfaVar.zza(3, zziwVar);
        }
        zzis zzisVar = this.zzapo;
        if (zzisVar != null) {
            zzbfaVar.zza(4, zzisVar);
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        zzit zzitVar = this.zzapq;
        if (zzitVar != null) {
            zzr += zzbfa.zzb(1, zzitVar);
        }
        Integer num = this.zzanu;
        if (num != null) {
            zzr += zzbfa.zzq(2, num.intValue());
        }
        zziw zziwVar = this.zzapn;
        if (zziwVar != null) {
            zzr += zzbfa.zzb(3, zziwVar);
        }
        zzis zzisVar = this.zzapo;
        return zzisVar != null ? zzr + zzbfa.zzb(4, zzisVar) : zzr;
    }
}
