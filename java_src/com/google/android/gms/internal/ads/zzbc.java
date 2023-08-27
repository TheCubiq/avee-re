package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzbc extends zzbfc<zzbc> {
    private Long zzeq = null;
    private Long zzer = null;
    public Long zzgi = null;
    public Long zzgj = null;
    public Long zzgk = null;

    public zzbc() {
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
                this.zzeq = Long.valueOf(zzbezVar.zzacd());
            } else if (zzabk == 16) {
                this.zzer = Long.valueOf(zzbezVar.zzacd());
            } else if (zzabk == 24) {
                this.zzgi = Long.valueOf(zzbezVar.zzacd());
            } else if (zzabk == 32) {
                this.zzgj = Long.valueOf(zzbezVar.zzacd());
            } else if (zzabk == 40) {
                this.zzgk = Long.valueOf(zzbezVar.zzacd());
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        Long l = this.zzeq;
        if (l != null) {
            zzbfaVar.zzi(1, l.longValue());
        }
        Long l2 = this.zzer;
        if (l2 != null) {
            zzbfaVar.zzi(2, l2.longValue());
        }
        Long l3 = this.zzgi;
        if (l3 != null) {
            zzbfaVar.zzi(3, l3.longValue());
        }
        Long l4 = this.zzgj;
        if (l4 != null) {
            zzbfaVar.zzi(4, l4.longValue());
        }
        Long l5 = this.zzgk;
        if (l5 != null) {
            zzbfaVar.zzi(5, l5.longValue());
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        Long l = this.zzeq;
        if (l != null) {
            zzr += zzbfa.zzd(1, l.longValue());
        }
        Long l2 = this.zzer;
        if (l2 != null) {
            zzr += zzbfa.zzd(2, l2.longValue());
        }
        Long l3 = this.zzgi;
        if (l3 != null) {
            zzr += zzbfa.zzd(3, l3.longValue());
        }
        Long l4 = this.zzgj;
        if (l4 != null) {
            zzr += zzbfa.zzd(4, l4.longValue());
        }
        Long l5 = this.zzgk;
        return l5 != null ? zzr + zzbfa.zzd(5, l5.longValue()) : zzr;
    }
}
