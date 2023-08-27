package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzaw extends zzbfc<zzaw> {
    public String zzco = null;
    public Long zzcp = null;
    private String stackTrace = null;
    private String zzcq = null;
    private String zzcr = null;
    private Long zzcs = null;
    private Long zzct = null;
    private String zzcu = null;
    private Long zzcv = null;
    private String zzcw = null;

    public zzaw() {
        this.zzebt = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbfi
    public final /* synthetic */ zzbfi zza(zzbez zzbezVar) throws IOException {
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 10:
                    this.zzco = zzbezVar.readString();
                    break;
                case 16:
                    this.zzcp = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 26:
                    this.stackTrace = zzbezVar.readString();
                    break;
                case 34:
                    this.zzcq = zzbezVar.readString();
                    break;
                case 42:
                    this.zzcr = zzbezVar.readString();
                    break;
                case 48:
                    this.zzcs = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 56:
                    this.zzct = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 66:
                    this.zzcu = zzbezVar.readString();
                    break;
                case 72:
                    this.zzcv = Long.valueOf(zzbezVar.zzacd());
                    break;
                case 82:
                    this.zzcw = zzbezVar.readString();
                    break;
                default:
                    if (super.zza(zzbezVar, zzabk)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        String str = this.zzco;
        if (str != null) {
            zzbfaVar.zzf(1, str);
        }
        Long l = this.zzcp;
        if (l != null) {
            zzbfaVar.zzi(2, l.longValue());
        }
        String str2 = this.stackTrace;
        if (str2 != null) {
            zzbfaVar.zzf(3, str2);
        }
        String str3 = this.zzcq;
        if (str3 != null) {
            zzbfaVar.zzf(4, str3);
        }
        String str4 = this.zzcr;
        if (str4 != null) {
            zzbfaVar.zzf(5, str4);
        }
        Long l2 = this.zzcs;
        if (l2 != null) {
            zzbfaVar.zzi(6, l2.longValue());
        }
        Long l3 = this.zzct;
        if (l3 != null) {
            zzbfaVar.zzi(7, l3.longValue());
        }
        String str5 = this.zzcu;
        if (str5 != null) {
            zzbfaVar.zzf(8, str5);
        }
        Long l4 = this.zzcv;
        if (l4 != null) {
            zzbfaVar.zzi(9, l4.longValue());
        }
        String str6 = this.zzcw;
        if (str6 != null) {
            zzbfaVar.zzf(10, str6);
        }
        super.zza(zzbfaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final int zzr() {
        int zzr = super.zzr();
        String str = this.zzco;
        if (str != null) {
            zzr += zzbfa.zzg(1, str);
        }
        Long l = this.zzcp;
        if (l != null) {
            zzr += zzbfa.zzd(2, l.longValue());
        }
        String str2 = this.stackTrace;
        if (str2 != null) {
            zzr += zzbfa.zzg(3, str2);
        }
        String str3 = this.zzcq;
        if (str3 != null) {
            zzr += zzbfa.zzg(4, str3);
        }
        String str4 = this.zzcr;
        if (str4 != null) {
            zzr += zzbfa.zzg(5, str4);
        }
        Long l2 = this.zzcs;
        if (l2 != null) {
            zzr += zzbfa.zzd(6, l2.longValue());
        }
        Long l3 = this.zzct;
        if (l3 != null) {
            zzr += zzbfa.zzd(7, l3.longValue());
        }
        String str5 = this.zzcu;
        if (str5 != null) {
            zzr += zzbfa.zzg(8, str5);
        }
        Long l4 = this.zzcv;
        if (l4 != null) {
            zzr += zzbfa.zzd(9, l4.longValue());
        }
        String str6 = this.zzcw;
        return str6 != null ? zzr + zzbfa.zzg(10, str6) : zzr;
    }
}
