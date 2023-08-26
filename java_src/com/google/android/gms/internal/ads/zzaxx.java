package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzaxx extends zzbbo<zzaxx, zza> implements zzbcw {
    private static volatile zzbdf<zzaxx> zzakh;
    private static final zzaxx zzdme;
    private String zzdmd = "";

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzaxx, zza> implements zzbcw {
        private zza() {
            super(zzaxx.zzdme);
        }

        /* synthetic */ zza(zzaxy zzaxyVar) {
            this();
        }
    }

    static {
        zzaxx zzaxxVar = new zzaxx();
        zzdme = zzaxxVar;
        zzbbo.zza(zzaxx.class, zzaxxVar);
    }

    private zzaxx() {
    }

    public static zzaxx zzaac() {
        return zzdme;
    }

    public static zzaxx zzak(zzbah zzbahVar) throws zzbbu {
        return (zzaxx) zzbbo.zza(zzdme, zzbahVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzaxx>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzaxx> zzbdfVar;
        switch (zzaxy.zzakf[i - 1]) {
            case 1:
                return new zzaxx();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdme, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzdmd"});
            case 4:
                return zzdme;
            case 5:
                zzbdf<zzaxx> zzbdfVar2 = zzakh;
                zzbdf<zzaxx> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzaxx.class) {
                        zzbdf<zzaxx> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdme);
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

    public final String zzaab() {
        return this.zzdmd;
    }
}
