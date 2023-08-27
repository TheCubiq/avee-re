package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzaxz extends zzbbo<zzaxz, zza> implements zzbcw {
    private static volatile zzbdf<zzaxz> zzakh;
    private static final zzaxz zzdmg;
    private int zzdih;
    private zzayb zzdmf;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzaxz, zza> implements zzbcw {
        private zza() {
            super(zzaxz.zzdmg);
        }

        /* synthetic */ zza(zzaya zzayaVar) {
            this();
        }

        public final zza zzb(zzayb zzaybVar) {
            zzadh();
            ((zzaxz) this.zzdtx).zza(zzaybVar);
            return this;
        }

        public final zza zzbf(int i) {
            zzadh();
            ((zzaxz) this.zzdtx).setVersion(0);
            return this;
        }
    }

    static {
        zzaxz zzaxzVar = new zzaxz();
        zzdmg = zzaxzVar;
        zzbbo.zza(zzaxz.class, zzaxzVar);
    }

    private zzaxz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzdih = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzayb zzaybVar) {
        if (zzaybVar == null) {
            throw null;
        }
        this.zzdmf = zzaybVar;
    }

    public static zza zzaaf() {
        return (zza) ((zzbbo.zza) zzdmg.zza(zzbbo.zze.zzdue, (Object) null, (Object) null));
    }

    public static zzaxz zzal(zzbah zzbahVar) throws zzbbu {
        return (zzaxz) zzbbo.zza(zzdmg, zzbahVar);
    }

    public final int getVersion() {
        return this.zzdih;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbbo$zzb, com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzaxz>] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzaxz> zzbdfVar;
        switch (zzaya.zzakf[i - 1]) {
            case 1:
                return new zzaxz();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdmg, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzdih", "zzdmf"});
            case 4:
                return zzdmg;
            case 5:
                zzbdf<zzaxz> zzbdfVar2 = zzakh;
                zzbdf<zzaxz> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzaxz.class) {
                        zzbdf<zzaxz> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdmg);
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

    public final zzayb zzaae() {
        zzayb zzaybVar = this.zzdmf;
        return zzaybVar == null ? zzayb.zzaaj() : zzaybVar;
    }
}
