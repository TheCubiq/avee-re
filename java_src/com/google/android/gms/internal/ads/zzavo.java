package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzavo extends zzbbo<zzavo, zza> implements zzbcw {
    private static volatile zzbdf<zzavo> zzakh;
    private static final zzavo zzdik;
    private int zzdih;
    private zzavs zzdii;
    private zzaxc zzdij;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzavo, zza> implements zzbcw {
        private zza() {
            super(zzavo.zzdik);
        }

        /* synthetic */ zza(zzavp zzavpVar) {
            this();
        }

        public final zza zzal(int i) {
            zzadh();
            ((zzavo) this.zzdtx).setVersion(i);
            return this;
        }

        public final zza zzb(zzavs zzavsVar) {
            zzadh();
            ((zzavo) this.zzdtx).zza(zzavsVar);
            return this;
        }

        public final zza zzb(zzaxc zzaxcVar) {
            zzadh();
            ((zzavo) this.zzdtx).zza(zzaxcVar);
            return this;
        }
    }

    static {
        zzavo zzavoVar = new zzavo();
        zzdik = zzavoVar;
        zzbbo.zza(zzavo.class, zzavoVar);
    }

    private zzavo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzdih = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzavs zzavsVar) {
        if (zzavsVar == null) {
            throw null;
        }
        this.zzdii = zzavsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzaxc zzaxcVar) {
        if (zzaxcVar == null) {
            throw null;
        }
        this.zzdij = zzaxcVar;
    }

    public static zzavo zzi(zzbah zzbahVar) throws zzbbu {
        return (zzavo) zzbbo.zza(zzdik, zzbahVar);
    }

    public static zza zzwp() {
        return (zza) ((zzbbo.zza) zzdik.zza(zzbbo.zze.zzdue, (Object) null, (Object) null));
    }

    public final int getVersion() {
        return this.zzdih;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzavo>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzavo> zzbdfVar;
        switch (zzavp.zzakf[i - 1]) {
            case 1:
                return new zzavo();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdik, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzdih", "zzdii", "zzdij"});
            case 4:
                return zzdik;
            case 5:
                zzbdf<zzavo> zzbdfVar2 = zzakh;
                zzbdf<zzavo> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzavo.class) {
                        zzbdf<zzavo> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdik);
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

    public final zzavs zzwn() {
        zzavs zzavsVar = this.zzdii;
        return zzavsVar == null ? zzavs.zzwx() : zzavsVar;
    }

    public final zzaxc zzwo() {
        zzaxc zzaxcVar = this.zzdij;
        return zzaxcVar == null ? zzaxc.zzyo() : zzaxcVar;
    }
}
