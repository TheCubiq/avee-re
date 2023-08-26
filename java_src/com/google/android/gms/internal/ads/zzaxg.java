package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzaxg extends zzbbo<zzaxg, zza> implements zzbcw {
    private static volatile zzbdf<zzaxg> zzakh;
    private static final zzaxg zzdkr;
    private int zzdkp;
    private int zzdkq;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzaxg, zza> implements zzbcw {
        private zza() {
            super(zzaxg.zzdkr);
        }

        /* synthetic */ zza(zzaxh zzaxhVar) {
            this();
        }
    }

    static {
        zzaxg zzaxgVar = new zzaxg();
        zzdkr = zzaxgVar;
        zzbbo.zza(zzaxg.class, zzaxgVar);
    }

    private zzaxg() {
    }

    public static zzaxg zzyu() {
        return zzdkr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzaxg>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzaxg> zzbdfVar;
        switch (zzaxh.zzakf[i - 1]) {
            case 1:
                return new zzaxg();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdkr, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzdkp", "zzdkq"});
            case 4:
                return zzdkr;
            case 5:
                zzbdf<zzaxg> zzbdfVar2 = zzakh;
                zzbdf<zzaxg> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzaxg.class) {
                        zzbdf<zzaxg> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdkr);
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

    public final zzaxa zzys() {
        zzaxa zzau = zzaxa.zzau(this.zzdkp);
        return zzau == null ? zzaxa.UNRECOGNIZED : zzau;
    }

    public final int zzyt() {
        return this.zzdkq;
    }
}
