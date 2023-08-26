package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzaws extends zzbbo<zzaws, zza> implements zzbcw {
    private static volatile zzbdf<zzaws> zzakh;
    private static final zzaws zzdjq;
    private int zzdih;
    private zzbah zzdip = zzbah.zzdpq;
    private zzawu zzdjp;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzaws, zza> implements zzbcw {
        private zza() {
            super(zzaws.zzdjq);
        }

        /* synthetic */ zza(zzawt zzawtVar) {
            this();
        }

        public final zza zzar(int i) {
            zzadh();
            ((zzaws) this.zzdtx).setVersion(0);
            return this;
        }

        public final zza zzb(zzawu zzawuVar) {
            zzadh();
            ((zzaws) this.zzdtx).zza(zzawuVar);
            return this;
        }

        public final zza zzy(zzbah zzbahVar) {
            zzadh();
            ((zzaws) this.zzdtx).zzk(zzbahVar);
            return this;
        }
    }

    static {
        zzaws zzawsVar = new zzaws();
        zzdjq = zzawsVar;
        zzbbo.zza(zzaws.class, zzawsVar);
    }

    private zzaws() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzdih = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzawu zzawuVar) {
        if (zzawuVar == null) {
            throw null;
        }
        this.zzdjp = zzawuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(zzbah zzbahVar) {
        if (zzbahVar == null) {
            throw null;
        }
        this.zzdip = zzbahVar;
    }

    public static zzaws zzx(zzbah zzbahVar) throws zzbbu {
        return (zzaws) zzbbo.zza(zzdjq, zzbahVar);
    }

    public static zza zzya() {
        return (zza) ((zzbbo.zza) zzdjq.zza(zzbbo.zze.zzdue, (Object) null, (Object) null));
    }

    public final int getVersion() {
        return this.zzdih;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzaws>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzaws> zzbdfVar;
        switch (zzawt.zzakf[i - 1]) {
            case 1:
                return new zzaws();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdjq, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzdih", "zzdjp", "zzdip"});
            case 4:
                return zzdjq;
            case 5:
                zzbdf<zzaws> zzbdfVar2 = zzakh;
                zzbdf<zzaws> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzaws.class) {
                        zzbdf<zzaws> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdjq);
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

    public final zzbah zzwv() {
        return this.zzdip;
    }

    public final zzawu zzxz() {
        zzawu zzawuVar = this.zzdjp;
        return zzawuVar == null ? zzawu.zzyf() : zzawuVar;
    }
}
