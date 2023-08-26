package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzic extends zzbfc<zzic> {
    private static volatile zzic[] zzame;
    private Integer zzamf = null;
    private zziq zzamg = null;

    public zzic() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzf */
    public final zzic zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 8) {
                int position = zzbezVar.getPosition();
                try {
                    int zzacc = zzbezVar.zzacc();
                    if (zzacc < 0 || zzacc > 10) {
                        StringBuilder sb = new StringBuilder(44);
                        sb.append(zzacc);
                        sb.append(" is not a valid enum AdFormatType");
                        throw new IllegalArgumentException(sb.toString());
                        break;
                    }
                    this.zzamf = Integer.valueOf(zzacc);
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            } else if (zzabk == 18) {
                if (this.zzamg == null) {
                    this.zzamg = new zziq();
                }
                zzbezVar.zza(this.zzamg);
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    public static zzic[] zzhr() {
        if (zzame == null) {
            synchronized (zzbfg.zzebs) {
                if (zzame == null) {
                    zzame = new zzic[0];
                }
            }
        }
        return zzame;
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        Integer num = this.zzamf;
        if (num != null) {
            zzbfaVar.zzm(1, num.intValue());
        }
        zziq zziqVar = this.zzamg;
        if (zziqVar != null) {
            zzbfaVar.zza(2, zziqVar);
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        Integer num = this.zzamf;
        if (num != null) {
            zzr += zzbfa.zzq(1, num.intValue());
        }
        zziq zziqVar = this.zzamg;
        return zziqVar != null ? zzr + zzbfa.zzb(2, zziqVar) : zzr;
    }
}
