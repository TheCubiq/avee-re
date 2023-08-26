package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzay extends zzbfc<zzay> {
    public String zzcx;
    private String zzcy;
    private String zzcz;
    private String zzda;
    private String zzdb;

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* synthetic */ zzbfi zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 10) {
                this.zzcx = zzbezVar.readString();
            } else if (zzabk == 18) {
                this.zzcy = zzbezVar.readString();
            } else if (zzabk == 26) {
                this.zzcz = zzbezVar.readString();
            } else if (zzabk == 34) {
                this.zzda = zzbezVar.readString();
            } else if (zzabk == 42) {
                this.zzdb = zzbezVar.readString();
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        String str = this.zzcx;
        if (str != null) {
            zzbfaVar.zzf(1, str);
        }
        String str2 = this.zzcy;
        if (str2 != null) {
            zzbfaVar.zzf(2, str2);
        }
        String str3 = this.zzcz;
        if (str3 != null) {
            zzbfaVar.zzf(3, str3);
        }
        String str4 = this.zzda;
        if (str4 != null) {
            zzbfaVar.zzf(4, str4);
        }
        String str5 = this.zzdb;
        if (str5 != null) {
            zzbfaVar.zzf(5, str5);
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        String str = this.zzcx;
        if (str != null) {
            zzr += zzbfa.zzg(1, str);
        }
        String str2 = this.zzcy;
        if (str2 != null) {
            zzr += zzbfa.zzg(2, str2);
        }
        String str3 = this.zzcz;
        if (str3 != null) {
            zzr += zzbfa.zzg(3, str3);
        }
        String str4 = this.zzda;
        if (str4 != null) {
            zzr += zzbfa.zzg(4, str4);
        }
        String str5 = this.zzdb;
        return str5 != null ? zzr + zzbfa.zzg(5, str5) : zzr;
    }
}
