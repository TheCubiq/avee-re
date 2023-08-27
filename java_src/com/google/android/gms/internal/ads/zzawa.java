package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzawa extends zzbbo<zzawa, zza> implements zzbcw {
    private static volatile zzbdf<zzawa> zzakh;
    private static final zzawa zzdix;
    private int zzdir;
    private zzawc zzdiv;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzawa, zza> implements zzbcw {
        private zza() {
            super(zzawa.zzdix);
        }

        /* synthetic */ zza(zzawb zzawbVar) {
            this();
        }
    }

    static {
        zzawa zzawaVar = new zzawa();
        zzdix = zzawaVar;
        zzbbo.zza(zzawa.class, zzawaVar);
    }

    private zzawa() {
    }

    public static zzawa zzq(zzbah zzbahVar) throws zzbbu {
        return (zzawa) zzbbo.zza(zzdix, zzbahVar);
    }

    public final int getKeySize() {
        return this.zzdir;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzawa>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzawa> zzbdfVar;
        switch (zzawb.zzakf[i - 1]) {
            case 1:
                return new zzawa();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdix, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzdiv", "zzdir"});
            case 4:
                return zzdix;
            case 5:
                zzbdf<zzawa> zzbdfVar2 = zzakh;
                zzbdf<zzawa> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzawa.class) {
                        zzbdf<zzawa> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdix);
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

    public final zzawc zzxe() {
        zzawc zzawcVar = this.zzdiv;
        return zzawcVar == null ? zzawc.zzxi() : zzawcVar;
    }
}
