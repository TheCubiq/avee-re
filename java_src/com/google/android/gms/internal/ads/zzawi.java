package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzawi extends zzbbo<zzawi, zza> implements zzbcw {
    private static volatile zzbdf<zzawi> zzakh;
    private static final zzawi zzdjb;
    private int zzdih;
    private zzbah zzdip = zzbah.zzdpq;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzawi, zza> implements zzbcw {
        private zza() {
            super(zzawi.zzdjb);
        }

        /* synthetic */ zza(zzawj zzawjVar) {
            this();
        }

        public final zza zzap(int i) {
            zzadh();
            ((zzawi) this.zzdtx).setVersion(0);
            return this;
        }

        public final zza zzv(zzbah zzbahVar) {
            zzadh();
            ((zzawi) this.zzdtx).zzk(zzbahVar);
            return this;
        }
    }

    static {
        zzawi zzawiVar = new zzawi();
        zzdjb = zzawiVar;
        zzbbo.zza(zzawi.class, zzawiVar);
    }

    private zzawi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzdih = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(zzbah zzbahVar) {
        if (zzbahVar == null) {
            throw null;
        }
        this.zzdip = zzbahVar;
    }

    public static zzawi zzu(zzbah zzbahVar) throws zzbbu {
        return (zzawi) zzbbo.zza(zzdjb, zzbahVar);
    }

    public static zza zzxn() {
        return (zza) ((zzbbo.zza) zzdjb.zza(zzbbo.zze.zzdue, (Object) null, (Object) null));
    }

    public final int getVersion() {
        return this.zzdih;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbbo$zzb, com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzawi>] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzawi> zzbdfVar;
        switch (zzawj.zzakf[i - 1]) {
            case 1:
                return new zzawi();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdjb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzdih", "zzdip"});
            case 4:
                return zzdjb;
            case 5:
                zzbdf<zzawi> zzbdfVar2 = zzakh;
                zzbdf<zzawi> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzawi.class) {
                        zzbdf<zzawi> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdjb);
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

    public final zzbah zzwv() {
        return this.zzdip;
    }
}
