package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzjc extends zzbfc<zzjc> {
    private Integer zzanu = null;
    private zziw zzapn = null;

    public zzjc() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzz */
    public final zzjc zza(zzbez zzbezVar) throws IOException {
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
        return zziwVar != null ? zzr + zzbfa.zzb(2, zziwVar) : zzr;
    }
}
