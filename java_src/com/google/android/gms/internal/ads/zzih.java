package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzih extends zzbfc<zzih> {
    private Integer zzanc = null;
    private zzit zzand = null;
    private String zzane = null;
    private String zzanf = null;

    public zzih() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzj */
    public final zzih zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 40) {
                int position = zzbezVar.getPosition();
                try {
                    int zzacc = zzbezVar.zzacc();
                    if (zzacc < 0 || zzacc > 2) {
                        StringBuilder sb = new StringBuilder(40);
                        sb.append(zzacc);
                        sb.append(" is not a valid enum Platform");
                        throw new IllegalArgumentException(sb.toString());
                        break;
                    }
                    this.zzanc = Integer.valueOf(zzacc);
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            } else if (zzabk == 50) {
                if (this.zzand == null) {
                    this.zzand = new zzit();
                }
                zzbezVar.zza(this.zzand);
            } else if (zzabk == 58) {
                this.zzane = zzbezVar.readString();
            } else if (zzabk == 66) {
                this.zzanf = zzbezVar.readString();
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        Integer num = this.zzanc;
        if (num != null) {
            zzbfaVar.zzm(5, num.intValue());
        }
        zzit zzitVar = this.zzand;
        if (zzitVar != null) {
            zzbfaVar.zza(6, zzitVar);
        }
        String str = this.zzane;
        if (str != null) {
            zzbfaVar.zzf(7, str);
        }
        String str2 = this.zzanf;
        if (str2 != null) {
            zzbfaVar.zzf(8, str2);
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        Integer num = this.zzanc;
        if (num != null) {
            zzr += zzbfa.zzq(5, num.intValue());
        }
        zzit zzitVar = this.zzand;
        if (zzitVar != null) {
            zzr += zzbfa.zzb(6, zzitVar);
        }
        String str = this.zzane;
        if (str != null) {
            zzr += zzbfa.zzg(7, str);
        }
        String str2 = this.zzanf;
        return str2 != null ? zzr + zzbfa.zzg(8, str2) : zzr;
    }
}
