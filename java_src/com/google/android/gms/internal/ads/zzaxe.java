package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzaxe extends zzbbo<zzaxe, zza> implements zzbcw {
    private static volatile zzbdf<zzaxe> zzakh;
    private static final zzaxe zzdko;
    private int zzdir;
    private zzaxg zzdkm;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzaxe, zza> implements zzbcw {
        private zza() {
            super(zzaxe.zzdko);
        }

        /* synthetic */ zza(zzaxf zzaxfVar) {
            this();
        }
    }

    static {
        zzaxe zzaxeVar = new zzaxe();
        zzdko = zzaxeVar;
        zzbbo.zza(zzaxe.class, zzaxeVar);
    }

    private zzaxe() {
    }

    public static zzaxe zzag(zzbah zzbahVar) throws zzbbu {
        return (zzaxe) zzbbo.zza(zzdko, zzbahVar);
    }

    public static zzaxe zzyq() {
        return zzdko;
    }

    public final int getKeySize() {
        return this.zzdir;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzaxe>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzaxe> zzbdfVar;
        switch (zzaxf.zzakf[i - 1]) {
            case 1:
                return new zzaxe();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdko, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzdkm", "zzdir"});
            case 4:
                return zzdko;
            case 5:
                zzbdf<zzaxe> zzbdfVar2 = zzakh;
                zzbdf<zzaxe> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzaxe.class) {
                        zzbdf<zzaxe> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdko);
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

    public final zzaxg zzym() {
        zzaxg zzaxgVar = this.zzdkm;
        return zzaxgVar == null ? zzaxg.zzyu() : zzaxgVar;
    }
}
