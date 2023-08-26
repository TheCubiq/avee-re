package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zziw extends zzbfc<zziw> {
    private Integer zzapp = null;

    public zziw() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzt */
    public final zziw zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 8) {
                int position = zzbezVar.getPosition();
                try {
                    int zzacc = zzbezVar.zzacc();
                    if (zzacc < 0 || zzacc > 3) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(zzacc);
                        sb.append(" is not a valid enum VideoErrorCode");
                        throw new IllegalArgumentException(sb.toString());
                        break;
                    }
                    this.zzapp = Integer.valueOf(zzacc);
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        Integer num = this.zzapp;
        if (num != null) {
            zzbfaVar.zzm(1, num.intValue());
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        Integer num = this.zzapp;
        return num != null ? zzr + zzbfa.zzq(1, num.intValue()) : zzr;
    }
}
