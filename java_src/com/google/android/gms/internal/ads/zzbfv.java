package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzbfv extends zzbfc<zzbfv> {
    public String zzedv = null;
    public Long zzedw = null;
    public Boolean zzedx = null;

    public zzbfv() {
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
            if (zzabk == 10) {
                this.zzedv = zzbezVar.readString();
            } else if (zzabk == 16) {
                this.zzedw = Long.valueOf(zzbezVar.zzabm());
            } else if (zzabk == 24) {
                this.zzedx = Boolean.valueOf(zzbezVar.zzabq());
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        String str = this.zzedv;
        if (str != null) {
            zzbfaVar.zzf(1, str);
        }
        Long l = this.zzedw;
        if (l != null) {
            zzbfaVar.zzi(2, l.longValue());
        }
        Boolean bool = this.zzedx;
        if (bool != null) {
            zzbfaVar.zzf(3, bool.booleanValue());
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        String str = this.zzedv;
        if (str != null) {
            zzr += zzbfa.zzg(1, str);
        }
        Long l = this.zzedw;
        if (l != null) {
            zzr += zzbfa.zzd(2, l.longValue());
        }
        Boolean bool = this.zzedx;
        if (bool != null) {
            bool.booleanValue();
            return zzr + zzbfa.zzcd(3) + 1;
        }
        return zzr;
    }
}
