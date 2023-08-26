package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzaxr extends zzbbo<zzaxr, zza> implements zzbcw {
    private static volatile zzbdf<zzaxr> zzakh;
    private static final zzaxr zzdlt;
    private int zzdlq;
    private int zzdlr;
    private zzbbt<zzb> zzdls = zzadd();

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzaxr, zza> implements zzbcw {
        private zza() {
            super(zzaxr.zzdlt);
        }

        /* synthetic */ zza(zzaxs zzaxsVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzb extends zzbbo<zzb, zza> implements zzbcw {
        private static volatile zzbdf<zzb> zzakh;
        private static final zzb zzdlx;
        private int zzdlj;
        private zzaxi zzdlu;
        private int zzdlv;
        private int zzdlw;

        /* loaded from: classes2.dex */
        public static final class zza extends zzbbo.zza<zzb, zza> implements zzbcw {
            private zza() {
                super(zzb.zzdlx);
            }

            /* synthetic */ zza(zzaxs zzaxsVar) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzdlx = zzbVar;
            zzbbo.zza(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzaxr$zzb>, com.google.android.gms.internal.ads.zzbbo$zzb] */
        @Override // com.google.android.gms.internal.ads.zzbbo
        public final Object zza(int i, Object obj, Object obj2) {
            zzbdf<zzb> zzbdfVar;
            switch (zzaxs.zzakf[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzdlx, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzdlu", "zzdlv", "zzdlw", "zzdlj"});
                case 4:
                    return zzdlx;
                case 5:
                    zzbdf<zzb> zzbdfVar2 = zzakh;
                    zzbdf<zzb> zzbdfVar3 = zzbdfVar2;
                    if (zzbdfVar2 == null) {
                        synchronized (zzb.class) {
                            zzbdf<zzb> zzbdfVar4 = zzakh;
                            zzbdfVar = zzbdfVar4;
                            if (zzbdfVar4 == null) {
                                ?? zzbVar = new zzbbo.zzb(zzdlx);
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

        public final boolean zzzo() {
            return this.zzdlu != null;
        }

        public final zzaxi zzzp() {
            zzaxi zzaxiVar = this.zzdlu;
            return zzaxiVar == null ? zzaxi.zzza() : zzaxiVar;
        }

        public final zzaxl zzzq() {
            zzaxl zzax = zzaxl.zzax(this.zzdlv);
            return zzax == null ? zzaxl.UNRECOGNIZED : zzax;
        }

        public final int zzzr() {
            return this.zzdlw;
        }

        public final zzayd zzzs() {
            zzayd zzbg = zzayd.zzbg(this.zzdlj);
            return zzbg == null ? zzayd.UNRECOGNIZED : zzbg;
        }
    }

    static {
        zzaxr zzaxrVar = new zzaxr();
        zzdlt = zzaxrVar;
        zzbbo.zza(zzaxr.class, zzaxrVar);
    }

    private zzaxr() {
    }

    public static zzaxr zzj(byte[] bArr) throws zzbbu {
        return (zzaxr) zzbbo.zzb(zzdlt, bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzaxr>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzaxr> zzbdfVar;
        switch (zzaxs.zzakf[i - 1]) {
            case 1:
                return new zzaxr();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdlt, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzdlq", "zzdlr", "zzdls", zzb.class});
            case 4:
                return zzdlt;
            case 5:
                zzbdf<zzaxr> zzbdfVar2 = zzakh;
                zzbdf<zzaxr> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzaxr.class) {
                        zzbdf<zzaxr> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdlt);
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

    public final int zzzk() {
        return this.zzdlr;
    }

    public final List<zzb> zzzl() {
        return this.zzdls;
    }

    public final int zzzm() {
        return this.zzdls.size();
    }
}
