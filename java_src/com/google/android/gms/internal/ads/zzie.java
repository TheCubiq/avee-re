package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzie extends zzbfc<zzie> {
    private String zzamj = null;
    private zzic[] zzamk = zzic.zzhr();
    private Integer zzaml = null;
    private Integer zzamm = null;
    private Integer zzamn = null;

    public zzie() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzh */
    public final zzie zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 10) {
                this.zzamj = zzbezVar.readString();
            } else if (zzabk == 18) {
                int zzb = zzbfl.zzb(zzbezVar, 18);
                zzic[] zzicVarArr = this.zzamk;
                int length = zzicVarArr == null ? 0 : zzicVarArr.length;
                int i = zzb + length;
                zzic[] zzicVarArr2 = new zzic[i];
                if (length != 0) {
                    System.arraycopy(this.zzamk, 0, zzicVarArr2, 0, length);
                }
                while (length < i - 1) {
                    zzicVarArr2[length] = new zzic();
                    zzbezVar.zza(zzicVarArr2[length]);
                    zzbezVar.zzabk();
                    length++;
                }
                zzicVarArr2[length] = new zzic();
                zzbezVar.zza(zzicVarArr2[length]);
                this.zzamk = zzicVarArr2;
            } else if (zzabk == 24) {
                zzbezVar.getPosition();
                this.zzaml = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
            } else if (zzabk == 32) {
                zzbezVar.getPosition();
                this.zzamm = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
            } else if (zzabk == 40) {
                int position = zzbezVar.getPosition();
                try {
                    this.zzamn = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
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
        String str = this.zzamj;
        if (str != null) {
            zzbfaVar.zzf(1, str);
        }
        zzic[] zzicVarArr = this.zzamk;
        if (zzicVarArr != null && zzicVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzic[] zzicVarArr2 = this.zzamk;
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
        Integer num = this.zzaml;
        if (num != null) {
            zzbfaVar.zzm(3, num.intValue());
        }
        Integer num2 = this.zzamm;
        if (num2 != null) {
            zzbfaVar.zzm(4, num2.intValue());
        }
        Integer num3 = this.zzamn;
        if (num3 != null) {
            zzbfaVar.zzm(5, num3.intValue());
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        String str = this.zzamj;
        if (str != null) {
            zzr += zzbfa.zzg(1, str);
        }
        zzic[] zzicVarArr = this.zzamk;
        if (zzicVarArr != null && zzicVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzic[] zzicVarArr2 = this.zzamk;
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
        Integer num = this.zzaml;
        if (num != null) {
            zzr += zzbfa.zzq(3, num.intValue());
        }
        Integer num2 = this.zzamm;
        if (num2 != null) {
            zzr += zzbfa.zzq(4, num2.intValue());
        }
        Integer num3 = this.zzamn;
        return num3 != null ? zzr + zzbfa.zzq(5, num3.intValue()) : zzr;
    }
}
