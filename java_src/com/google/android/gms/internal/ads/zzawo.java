package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzawo extends zzbbo<zzawo, zza> implements zzbcw {
    private static volatile zzbdf<zzawo> zzakh;
    private static final zzawo zzdjk;
    private zzawq zzdjj;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzawo, zza> implements zzbcw {
        private zza() {
            super(zzawo.zzdjk);
        }

        /* synthetic */ zza(zzawp zzawpVar) {
            this();
        }
    }

    static {
        zzawo zzawoVar = new zzawo();
        zzdjk = zzawoVar;
        zzbbo.zza(zzawo.class, zzawoVar);
    }

    private zzawo() {
    }

    public static zzawo zzw(zzbah zzbahVar) throws zzbbu {
        return (zzawo) zzbbo.zza(zzdjk, zzbahVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzawo>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzawo> zzbdfVar;
        switch (zzawp.zzakf[i - 1]) {
            case 1:
                return new zzawo();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdjk, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0000\u0000\u0001\t", new Object[]{"zzdjj"});
            case 4:
                return zzdjk;
            case 5:
                zzbdf<zzawo> zzbdfVar2 = zzakh;
                zzbdf<zzawo> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzawo.class) {
                        zzbdf<zzawo> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdjk);
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

    public final zzawq zzxs() {
        zzawq zzawqVar = this.zzdjj;
        return zzawqVar == null ? zzawq.zzxx() : zzawqVar;
    }
}
