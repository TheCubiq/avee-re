package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzaxn extends zzbbo<zzaxn, zza> implements zzbcw {
    private static volatile zzbdf<zzaxn> zzakh;
    private static final zzaxn zzdlk;
    private String zzdks = "";
    private zzbah zzdkt = zzbah.zzdpq;
    private int zzdlj;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzaxn, zza> implements zzbcw {
        private zza() {
            super(zzaxn.zzdlk);
        }

        /* synthetic */ zza(zzaxo zzaxoVar) {
            this();
        }
    }

    static {
        zzaxn zzaxnVar = new zzaxn();
        zzdlk = zzaxnVar;
        zzbbo.zza(zzaxn.class, zzaxnVar);
    }

    private zzaxn() {
    }

    public static zzaxn zzzc() {
        return zzdlk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzaxn>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzaxn> zzbdfVar;
        switch (zzaxo.zzakf[i - 1]) {
            case 1:
                return new zzaxn();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdlk, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzdks", "zzdkt", "zzdlj"});
            case 4:
                return zzdlk;
            case 5:
                zzbdf<zzaxn> zzbdfVar2 = zzakh;
                zzbdf<zzaxn> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzaxn.class) {
                        zzbdf<zzaxn> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdlk);
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

    public final String zzyw() {
        return this.zzdks;
    }

    public final zzbah zzyx() {
        return this.zzdkt;
    }
}
