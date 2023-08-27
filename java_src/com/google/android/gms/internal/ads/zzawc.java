package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzawc extends zzbbo<zzawc, zza> implements zzbcw {
    private static volatile zzbdf<zzawc> zzakh;
    private static final zzawc zzdiy;
    private int zzdit;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzawc, zza> implements zzbcw {
        private zza() {
            super(zzawc.zzdiy);
        }

        /* synthetic */ zza(zzawd zzawdVar) {
            this();
        }
    }

    static {
        zzawc zzawcVar = new zzawc();
        zzdiy = zzawcVar;
        zzbbo.zza(zzawc.class, zzawcVar);
    }

    private zzawc() {
    }

    public static zzawc zzxi() {
        return zzdiy;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzawc>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzawc> zzbdfVar;
        switch (zzawd.zzakf[i - 1]) {
            case 1:
                return new zzawc();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdiy, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzdit"});
            case 4:
                return zzdiy;
            case 5:
                zzbdf<zzawc> zzbdfVar2 = zzakh;
                zzbdf<zzawc> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzawc.class) {
                        zzbdf<zzawc> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdiy);
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
