package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzawm extends zzbbo<zzawm, zza> implements zzbcw {
    private static volatile zzbdf<zzawm> zzakh;
    private static final zzawm zzdji;
    private zzaxn zzdjh;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzawm, zza> implements zzbcw {
        private zza() {
            super(zzawm.zzdji);
        }

        /* synthetic */ zza(zzawn zzawnVar) {
            this();
        }
    }

    static {
        zzawm zzawmVar = new zzawm();
        zzdji = zzawmVar;
        zzbbo.zza(zzawm.class, zzawmVar);
    }

    private zzawm() {
    }

    public static zzawm zzxq() {
        return zzdji;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzawm>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzawm> zzbdfVar;
        switch (zzawn.zzakf[i - 1]) {
            case 1:
                return new zzawm();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdji, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0003\u0000\u0000\u0000\u0002\t", new Object[]{"zzdjh"});
            case 4:
                return zzdji;
            case 5:
                zzbdf<zzawm> zzbdfVar2 = zzakh;
                zzbdf<zzawm> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzawm.class) {
                        zzbdf<zzawm> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdji);
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

    public final zzaxn zzxp() {
        zzaxn zzaxnVar = this.zzdjh;
        return zzaxnVar == null ? zzaxn.zzzc() : zzaxnVar;
    }
}
