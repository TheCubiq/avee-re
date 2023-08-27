package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzayf extends zzbbo<zzayf, zza> implements zzbcw {
    private static volatile zzbdf<zzayf> zzakh;
    private static final zzayf zzdmt;
    private int zzdlq;
    private String zzdmr = "";
    private zzbbt<zzaxp> zzdms = zzadd();

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzayf, zza> implements zzbcw {
        private zza() {
            super(zzayf.zzdmt);
        }

        /* synthetic */ zza(zzayg zzaygVar) {
            this();
        }

        public final zza zzb(zzaxp zzaxpVar) {
            zzadh();
            ((zzayf) this.zzdtx).zza(zzaxpVar);
            return this;
        }

        public final zza zzej(String str) {
            zzadh();
            ((zzayf) this.zzdtx).zzei(str);
            return this;
        }
    }

    static {
        zzayf zzayfVar = new zzayf();
        zzdmt = zzayfVar;
        zzbbo.zza(zzayf.class, zzayfVar);
    }

    private zzayf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzaxp zzaxpVar) {
        if (zzaxpVar == null) {
            throw null;
        }
        if (!this.zzdms.zzaay()) {
            zzbbt<zzaxp> zzbbtVar = this.zzdms;
            int size = zzbbtVar.size();
            this.zzdms = zzbbtVar.zzbm(size == 0 ? 10 : size << 1);
        }
        this.zzdms.add(zzaxpVar);
    }

    public static zza zzaam() {
        return (zza) ((zzbbo.zza) zzdmt.zza(zzbbo.zze.zzdue, (Object) null, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzei(String str) {
        if (str == null) {
            throw null;
        }
        this.zzdmr = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzayf>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzayf> zzbdfVar;
        switch (zzayg.zzakf[i - 1]) {
            case 1:
                return new zzayf();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdmt, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzdlq", "zzdmr", "zzdms", zzaxp.class});
            case 4:
                return zzdmt;
            case 5:
                zzbdf<zzayf> zzbdfVar2 = zzakh;
                zzbdf<zzayf> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzayf.class) {
                        zzbdf<zzayf> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdmt);
                            zzakh = zzbVar;
                            zzbdfVar = zzbVar;
                        }
                    }
                    zzbdfVar3 = zzbdfVar;
                }
                return zzbdfVar3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final List<zzaxp> zzaal() {
        return this.zzdms;
    }
}
