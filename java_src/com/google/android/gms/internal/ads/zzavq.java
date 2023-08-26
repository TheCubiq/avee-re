package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzavq extends zzbbo<zzavq, zza> implements zzbcw {
    private static volatile zzbdf<zzavq> zzakh;
    private static final zzavq zzdin;
    private zzavu zzdil;
    private zzaxe zzdim;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzavq, zza> implements zzbcw {
        private zza() {
            super(zzavq.zzdin);
        }

        /* synthetic */ zza(zzavr zzavrVar) {
            this();
        }
    }

    static {
        zzavq zzavqVar = new zzavq();
        zzdin = zzavqVar;
        zzbbo.zza(zzavq.class, zzavqVar);
    }

    private zzavq() {
    }

    public static zzavq zzj(zzbah zzbahVar) throws zzbbu {
        return (zzavq) zzbbo.zza(zzdin, zzbahVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzavq>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzavq> zzbdfVar;
        switch (zzavr.zzakf[i - 1]) {
            case 1:
                return new zzavq();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdin, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzdil", "zzdim"});
            case 4:
                return zzdin;
            case 5:
                zzbdf<zzavq> zzbdfVar2 = zzakh;
                zzbdf<zzavq> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzavq.class) {
                        zzbdf<zzavq> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdin);
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

    public final zzavu zzwr() {
        zzavu zzavuVar = this.zzdil;
        return zzavuVar == null ? zzavu.zzwz() : zzavuVar;
    }

    public final zzaxe zzws() {
        zzaxe zzaxeVar = this.zzdim;
        return zzaxeVar == null ? zzaxe.zzyq() : zzaxeVar;
    }
}
