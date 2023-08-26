package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzid extends zzbfc<zzid> {
    private String zzacp = null;
    private zzic[] zzamh = zzic.zzhr();
    private Integer zzami = null;

    public zzid() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzg */
    public final zzid zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 10) {
                this.zzacp = zzbezVar.readString();
            } else if (zzabk == 18) {
                int zzb = zzbfl.zzb(zzbezVar, 18);
                zzic[] zzicVarArr = this.zzamh;
                int length = zzicVarArr == null ? 0 : zzicVarArr.length;
                int i = zzb + length;
                zzic[] zzicVarArr2 = new zzic[i];
                if (length != 0) {
                    System.arraycopy(this.zzamh, 0, zzicVarArr2, 0, length);
                }
                while (length < i - 1) {
                    zzicVarArr2[length] = new zzic();
                    zzbezVar.zza(zzicVarArr2[length]);
                    zzbezVar.zzabk();
                    length++;
                }
                zzicVarArr2[length] = new zzic();
                zzbezVar.zza(zzicVarArr2[length]);
                this.zzamh = zzicVarArr2;
            } else if (zzabk == 24) {
                int position = zzbezVar.getPosition();
                try {
                    this.zzami = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
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
        String str = this.zzacp;
        if (str != null) {
            zzbfaVar.zzf(1, str);
        }
        zzic[] zzicVarArr = this.zzamh;
        if (zzicVarArr != null && zzicVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzic[] zzicVarArr2 = this.zzamh;
                if (i >= zzicVarArr2.length) {
                    break;
                }
                zzic zzicVar = zzicVarArr2[i];
                if (zzicVar != null) {
                    zzbfaVar.zza(2, zzicVar);
                }
                i++;
            }
        }
        Integer num = this.zzami;
        if (num != null) {
            zzbfaVar.zzm(3, num.intValue());
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        String str = this.zzacp;
        if (str != null) {
            zzr += zzbfa.zzg(1, str);
        }
        zzic[] zzicVarArr = this.zzamh;
        if (zzicVarArr != null && zzicVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzic[] zzicVarArr2 = this.zzamh;
                if (i >= zzicVarArr2.length) {
                    break;
                }
                zzic zzicVar = zzicVarArr2[i];
                if (zzicVar != null) {
                    zzr += zzbfa.zzb(2, zzicVar);
                }
                i++;
            }
        }
        Integer num = this.zzami;
        return num != null ? zzr + zzbfa.zzq(3, num.intValue()) : zzr;
    }
}
