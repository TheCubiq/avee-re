package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzit extends zzbfc<zzit> {
    public Integer zzaot = null;
    public Integer zzaou = null;
    public Integer zzaov = null;

    public zzit() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* synthetic */ zzbfi zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 8) {
                this.zzaot = Integer.valueOf(zzbezVar.zzacc());
            } else if (zzabk == 16) {
                this.zzaou = Integer.valueOf(zzbezVar.zzacc());
            } else if (zzabk == 24) {
                this.zzaov = Integer.valueOf(zzbezVar.zzacc());
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        Integer num = this.zzaot;
        if (num != null) {
            zzbfaVar.zzm(1, num.intValue());
        }
        Integer num2 = this.zzaou;
        if (num2 != null) {
            zzbfaVar.zzm(2, num2.intValue());
        }
        Integer num3 = this.zzaov;
        if (num3 != null) {
            zzbfaVar.zzm(3, num3.intValue());
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        Integer num = this.zzaot;
        if (num != null) {
            zzr += zzbfa.zzq(1, num.intValue());
        }
        Integer num2 = this.zzaou;
        if (num2 != null) {
            zzr += zzbfa.zzq(2, num2.intValue());
        }
        Integer num3 = this.zzaov;
        return num3 != null ? zzr + zzbfa.zzq(3, num3.intValue()) : zzr;
    }
}
