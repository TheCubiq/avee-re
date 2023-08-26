package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzil extends zzbfc<zzil> {
    private zzij zzanv = null;
    private zzir[] zzanw = zzir.zzhs();
    private Integer zzanu = null;
    private zzis zzant = null;

    public zzil() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzn */
    public final zzil zza(zzbez zzbezVar) throws IOException {
        zzbfi zzbfiVar;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk == 10) {
                if (this.zzanv == null) {
                    this.zzanv = new zzij();
                }
                zzbfiVar = this.zzanv;
            } else if (zzabk == 18) {
                int zzb = zzbfl.zzb(zzbezVar, 18);
                zzir[] zzirVarArr = this.zzanw;
                int length = zzirVarArr == null ? 0 : zzirVarArr.length;
                int i = zzb + length;
                zzir[] zzirVarArr2 = new zzir[i];
                if (length != 0) {
                    System.arraycopy(this.zzanw, 0, zzirVarArr2, 0, length);
                }
                while (length < i - 1) {
                    zzirVarArr2[length] = new zzir();
                    zzbezVar.zza(zzirVarArr2[length]);
                    zzbezVar.zzabk();
                    length++;
                }
                zzirVarArr2[length] = new zzir();
                zzbezVar.zza(zzirVarArr2[length]);
                this.zzanw = zzirVarArr2;
            } else if (zzabk == 24) {
                int position = zzbezVar.getPosition();
                try {
                    this.zzanu = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                } catch (IllegalArgumentException unused) {
                    zzbezVar.zzdc(position);
                    zza(zzbezVar, zzabk);
                }
            } else if (zzabk == 34) {
                if (this.zzant == null) {
                    this.zzant = new zzis();
                }
                zzbfiVar = this.zzant;
            } else if (!super.zza(zzbezVar, zzabk)) {
                return this;
            }
            zzbezVar.zza(zzbfiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        zzij zzijVar = this.zzanv;
        if (zzijVar != null) {
            zzbfaVar.zza(1, zzijVar);
        }
        zzir[] zzirVarArr = this.zzanw;
        if (zzirVarArr != null && zzirVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzir[] zzirVarArr2 = this.zzanw;
                if (i >= zzirVarArr2.length) {
                    break;
                }
                zzir zzirVar = zzirVarArr2[i];
                if (zzirVar != null) {
                    zzbfaVar.zza(2, zzirVar);
                }
                i++;
            }
        }
        Integer num = this.zzanu;
        if (num != null) {
            zzbfaVar.zzm(3, num.intValue());
        }
        zzis zzisVar = this.zzant;
        if (zzisVar != null) {
            zzbfaVar.zza(4, zzisVar);
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        zzij zzijVar = this.zzanv;
        if (zzijVar != null) {
            zzr += zzbfa.zzb(1, zzijVar);
        }
        zzir[] zzirVarArr = this.zzanw;
        if (zzirVarArr != null && zzirVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzir[] zzirVarArr2 = this.zzanw;
                if (i >= zzirVarArr2.length) {
                    break;
                }
                zzir zzirVar = zzirVarArr2[i];
                if (zzirVar != null) {
                    zzr += zzbfa.zzb(2, zzirVar);
                }
                i++;
            }
        }
        Integer num = this.zzanu;
        if (num != null) {
            zzr += zzbfa.zzq(3, num.intValue());
        }
        zzis zzisVar = this.zzant;
        return zzisVar != null ? zzr + zzbfa.zzb(4, zzisVar) : zzr;
    }
}
