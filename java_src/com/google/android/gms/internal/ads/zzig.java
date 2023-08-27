package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzig extends zzbfc<zzig> {
    public String zzamu = null;
    private zzis zzamv = null;
    private Integer zzamw = null;
    public zzit zzamx = null;
    private Integer zzamy = null;
    private Integer zzamz = null;
    private Integer zzana = null;
    private Integer zzanb = null;

    public zzig() {
        this.zzebk = null;
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzi */
    public final zzig zza(zzbez zzbezVar) throws IOException {
        zzbfi zzbfiVar;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            if (zzabk == 0) {
                return this;
            }
            if (zzabk != 10) {
                if (zzabk == 18) {
                    if (this.zzamv == null) {
                        this.zzamv = new zzis();
                    }
                    zzbfiVar = this.zzamv;
                } else if (zzabk == 24) {
                    this.zzamw = Integer.valueOf(zzbezVar.zzacc());
                } else if (zzabk == 34) {
                    if (this.zzamx == null) {
                        this.zzamx = new zzit();
                    }
                    zzbfiVar = this.zzamx;
                } else if (zzabk == 40) {
                    this.zzamy = Integer.valueOf(zzbezVar.zzacc());
                } else if (zzabk == 48) {
                    zzbezVar.getPosition();
                    this.zzamz = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                } else if (zzabk == 56) {
                    zzbezVar.getPosition();
                    this.zzana = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                } else if (zzabk == 64) {
                    int position = zzbezVar.getPosition();
                    try {
                        this.zzanb = Integer.valueOf(zzia.zzd(zzbezVar.zzacc()));
                    } catch (IllegalArgumentException unused) {
                        zzbezVar.zzdc(position);
                        zza(zzbezVar, zzabk);
                    }
                } else if (!super.zza(zzbezVar, zzabk)) {
                    return this;
                }
                zzbezVar.zza(zzbfiVar);
            } else {
                this.zzamu = zzbezVar.readString();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        String str = this.zzamu;
        if (str != null) {
            zzbfaVar.zzf(1, str);
        }
        zzis zzisVar = this.zzamv;
        if (zzisVar != null) {
            zzbfaVar.zza(2, zzisVar);
        }
        Integer num = this.zzamw;
        if (num != null) {
            zzbfaVar.zzm(3, num.intValue());
        }
        zzit zzitVar = this.zzamx;
        if (zzitVar != null) {
            zzbfaVar.zza(4, zzitVar);
        }
        Integer num2 = this.zzamy;
        if (num2 != null) {
            zzbfaVar.zzm(5, num2.intValue());
        }
        Integer num3 = this.zzamz;
        if (num3 != null) {
            zzbfaVar.zzm(6, num3.intValue());
        }
        Integer num4 = this.zzana;
        if (num4 != null) {
            zzbfaVar.zzm(7, num4.intValue());
        }
        Integer num5 = this.zzanb;
        if (num5 != null) {
            zzbfaVar.zzm(8, num5.intValue());
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        String str = this.zzamu;
        if (str != null) {
            zzr += zzbfa.zzg(1, str);
        }
        zzis zzisVar = this.zzamv;
        if (zzisVar != null) {
            zzr += zzbfa.zzb(2, zzisVar);
        }
        Integer num = this.zzamw;
        if (num != null) {
            zzr += zzbfa.zzq(3, num.intValue());
        }
        zzit zzitVar = this.zzamx;
        if (zzitVar != null) {
            zzr += zzbfa.zzb(4, zzitVar);
        }
        Integer num2 = this.zzamy;
        if (num2 != null) {
            zzr += zzbfa.zzq(5, num2.intValue());
        }
        Integer num3 = this.zzamz;
        if (num3 != null) {
            zzr += zzbfa.zzq(6, num3.intValue());
        }
        Integer num4 = this.zzana;
        if (num4 != null) {
            zzr += zzbfa.zzq(7, num4.intValue());
        }
        Integer num5 = this.zzanb;
        return num5 != null ? zzr + zzbfa.zzq(8, num5.intValue()) : zzr;
    }
}
