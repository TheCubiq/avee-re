package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzif extends zzbfc<zzif> {
    private Integer zzamo = null;
    private zzis zzamp = null;
    private zzis zzamq = null;
    private zzis zzamr = null;
    private zzis[] zzams = zzis.zzht();
    private Integer zzamt = null;

    public zzif() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* synthetic */ zzbfi zza(zzbez zzbezVar) throws IOException {
        zzbfi zzbfiVar;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk != 8) {
                if (zzabk == 18) {
                    if (this.zzamp == null) {
                        this.zzamp = new zzis();
                    }
                    zzbfiVar = this.zzamp;
                } else if (zzabk == 26) {
                    if (this.zzamq == null) {
                        this.zzamq = new zzis();
                    }
                    zzbfiVar = this.zzamq;
                } else if (zzabk == 34) {
                    if (this.zzamr == null) {
                        this.zzamr = new zzis();
                    }
                    zzbfiVar = this.zzamr;
                } else if (zzabk == 42) {
                    int zzb = zzbfl.zzb(zzbezVar, 42);
                    zzis[] zzisVarArr = this.zzams;
                    int length = zzisVarArr == null ? 0 : zzisVarArr.length;
                    int i = zzb + length;
                    zzis[] zzisVarArr2 = new zzis[i];
                    if (length != 0) {
                        System.arraycopy(this.zzams, 0, zzisVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        zzisVarArr2[length] = new zzis();
                        zzbezVar.zza(zzisVarArr2[length]);
                        zzbezVar.zzabk();
                        length++;
                    }
                    zzisVarArr2[length] = new zzis();
                    zzbezVar.zza(zzisVarArr2[length]);
                    this.zzams = zzisVarArr2;
                } else if (zzabk == 48) {
                    this.zzamt = Integer.valueOf(zzbezVar.zzacc());
                } else if (!super.zza(zzbezVar, zzabk)) {
                    return this;
                }
                zzbezVar.zza(zzbfiVar);
            } else {
                this.zzamo = Integer.valueOf(zzbezVar.zzacc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        Integer num = this.zzamo;
        if (num != null) {
            zzbfaVar.zzm(1, num.intValue());
        }
        zzis zzisVar = this.zzamp;
        if (zzisVar != null) {
            zzbfaVar.zza(2, zzisVar);
        }
        zzis zzisVar2 = this.zzamq;
        if (zzisVar2 != null) {
            zzbfaVar.zza(3, zzisVar2);
        }
        zzis zzisVar3 = this.zzamr;
        if (zzisVar3 != null) {
            zzbfaVar.zza(4, zzisVar3);
        }
        zzis[] zzisVarArr = this.zzams;
        if (zzisVarArr != null && zzisVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzis[] zzisVarArr2 = this.zzams;
                if (i >= zzisVarArr2.length) {
                    break;
                }
                zzis zzisVar4 = zzisVarArr2[i];
                if (zzisVar4 != null) {
                    zzbfaVar.zza(5, zzisVar4);
                }
                i++;
            }
        }
        Integer num2 = this.zzamt;
        if (num2 != null) {
            zzbfaVar.zzm(6, num2.intValue());
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        Integer num = this.zzamo;
        if (num != null) {
            zzr += zzbfa.zzq(1, num.intValue());
        }
        zzis zzisVar = this.zzamp;
        if (zzisVar != null) {
            zzr += zzbfa.zzb(2, zzisVar);
        }
        zzis zzisVar2 = this.zzamq;
        if (zzisVar2 != null) {
            zzr += zzbfa.zzb(3, zzisVar2);
        }
        zzis zzisVar3 = this.zzamr;
        if (zzisVar3 != null) {
            zzr += zzbfa.zzb(4, zzisVar3);
        }
        zzis[] zzisVarArr = this.zzams;
        if (zzisVarArr != null && zzisVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzis[] zzisVarArr2 = this.zzams;
                if (i >= zzisVarArr2.length) {
                    break;
                }
                zzis zzisVar4 = zzisVarArr2[i];
                if (zzisVar4 != null) {
                    zzr += zzbfa.zzb(5, zzisVar4);
                }
                i++;
            }
        }
        Integer num2 = this.zzamt;
        return num2 != null ? zzr + zzbfa.zzq(6, num2.intValue()) : zzr;
    }
}
