package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzayb extends zzbbo<zzayb, zza> implements zzbcw {
    private static volatile zzbdf<zzayb> zzakh;
    private static final zzayb zzdmj;
    private String zzdmh = "";
    private zzaxn zzdmi;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzayb, zza> implements zzbcw {
        private zza() {
            super(zzayb.zzdmj);
        }

        /* synthetic */ zza(zzayc zzaycVar) {
            this();
        }
    }

    static {
        zzayb zzaybVar = new zzayb();
        zzdmj = zzaybVar;
        zzbbo.zza(zzayb.class, zzaybVar);
    }

    private zzayb() {
    }

    public static zzayb zzaaj() {
        return zzdmj;
    }

    public static zzayb zzam(zzbah zzbahVar) throws zzbbu {
        return (zzayb) zzbbo.zza(zzdmj, zzbahVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzayb>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzayb> zzbdfVar;
        switch (zzayc.zzakf[i - 1]) {
            case 1:
                return new zzayb();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdmj, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzdmh", "zzdmi"});
            case 4:
                return zzdmj;
            case 5:
                zzbdf<zzayb> zzbdfVar2 = zzakh;
                zzbdf<zzayb> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzayb.class) {
                        zzbdf<zzayb> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdmj);
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

    public final String zzaah() {
        return this.zzdmh;
    }

    public final zzaxn zzaai() {
        zzaxn zzaxnVar = this.zzdmi;
        return zzaxnVar == null ? zzaxn.zzzc() : zzaxnVar;
    }
}
