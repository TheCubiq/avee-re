package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzaxc extends zzbbo<zzaxc, zza> implements zzbcw {
    private static volatile zzbdf<zzaxc> zzakh;
    private static final zzaxc zzdkn;
    private int zzdih;
    private zzbah zzdip = zzbah.zzdpq;
    private zzaxg zzdkm;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzaxc, zza> implements zzbcw {
        private zza() {
            super(zzaxc.zzdkn);
        }

        /* synthetic */ zza(zzaxd zzaxdVar) {
            this();
        }

        public final zza zzaf(zzbah zzbahVar) {
            zzadh();
            ((zzaxc) this.zzdtx).zzk(zzbahVar);
            return this;
        }

        public final zza zzav(int i) {
            zzadh();
            ((zzaxc) this.zzdtx).setVersion(0);
            return this;
        }

        public final zza zzc(zzaxg zzaxgVar) {
            zzadh();
            ((zzaxc) this.zzdtx).zzb(zzaxgVar);
            return this;
        }
    }

    static {
        zzaxc zzaxcVar = new zzaxc();
        zzdkn = zzaxcVar;
        zzbbo.zza(zzaxc.class, zzaxcVar);
    }

    private zzaxc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzdih = i;
    }

    public static zzaxc zzae(zzbah zzbahVar) throws zzbbu {
        return (zzaxc) zzbbo.zza(zzdkn, zzbahVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzaxg zzaxgVar) {
        if (zzaxgVar == null) {
            throw null;
        }
        this.zzdkm = zzaxgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(zzbah zzbahVar) {
        if (zzbahVar == null) {
            throw null;
        }
        this.zzdip = zzbahVar;
    }

    public static zza zzyn() {
        return (zza) ((zzbbo.zza) zzdkn.zza(zzbbo.zze.zzdue, (Object) null, (Object) null));
    }

    public static zzaxc zzyo() {
        return zzdkn;
    }

    public final int getVersion() {
        return this.zzdih;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzaxc>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzaxc> zzbdfVar;
        switch (zzaxd.zzakf[i - 1]) {
            case 1:
                return new zzaxc();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdkn, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzdih", "zzdkm", "zzdip"});
            case 4:
                return zzdkn;
            case 5:
                zzbdf<zzaxc> zzbdfVar2 = zzakh;
                zzbdf<zzaxc> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzaxc.class) {
                        zzbdf<zzaxc> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdkn);
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

    public final zzaxg zzym() {
        zzaxg zzaxgVar = this.zzdkm;
        return zzaxgVar == null ? zzaxg.zzyu() : zzaxgVar;
    }
}
