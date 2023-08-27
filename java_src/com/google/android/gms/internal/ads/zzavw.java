package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzavw extends zzbbo<zzavw, zza> implements zzbcw {
    private static volatile zzbdf<zzavw> zzakh;
    private static final zzavw zzdiu;
    private int zzdit;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzavw, zza> implements zzbcw {
        private zza() {
            super(zzavw.zzdiu);
        }

        /* synthetic */ zza(zzavx zzavxVar) {
            this();
        }
    }

    static {
        zzavw zzavwVar = new zzavw();
        zzdiu = zzavwVar;
        zzbbo.zza(zzavw.class, zzavwVar);
    }

    private zzavw() {
    }

    public static zzavw zzxc() {
        return zzdiu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.zzbbo$zzb, com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzavw>] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzavw> zzbdfVar;
        switch (zzavx.zzakf[i - 1]) {
            case 1:
                return new zzavw();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdiu, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzdit"});
            case 4:
                return zzdiu;
            case 5:
                zzbdf<zzavw> zzbdfVar2 = zzakh;
                zzbdf<zzavw> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzavw.class) {
                        zzbdf<zzavw> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdiu);
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

    public final int zzxb() {
        return this.zzdit;
    }
}
