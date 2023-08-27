package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzaxt extends zzbbo<zzaxt, zza> implements zzbcw {
    private static volatile zzbdf<zzaxt> zzakh;
    private static final zzaxt zzdlz;
    private int zzdlq;
    private int zzdlr;
    private zzbbt<zzb> zzdly = zzadd();

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzaxt, zza> implements zzbcw {
        private zza() {
            super(zzaxt.zzdlz);
        }

        /* synthetic */ zza(zzaxu zzaxuVar) {
            this();
        }

        public final zza zzb(zzb zzbVar) {
            zzadh();
            ((zzaxt) this.zzdtx).zza(zzbVar);
            return this;
        }

        public final zza zzbb(int i) {
            zzadh();
            ((zzaxt) this.zzdtx).zzba(i);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzb extends zzbbo<zzb, zza> implements zzbcw {
        private static volatile zzbdf<zzb> zzakh;
        private static final zzb zzdma;
        private String zzdks = "";
        private int zzdlj;
        private int zzdlv;
        private int zzdlw;

        /* loaded from: classes2.dex */
        public static final class zza extends zzbbo.zza<zzb, zza> implements zzbcw {
            private zza() {
                super(zzb.zzdma);
            }

            /* synthetic */ zza(zzaxu zzaxuVar) {
                this();
            }

            public final zza zzb(zzaxl zzaxlVar) {
                zzadh();
                ((zzb) this.zzdtx).zza(zzaxlVar);
                return this;
            }

            public final zza zzb(zzayd zzaydVar) {
                zzadh();
                ((zzb) this.zzdtx).zza(zzaydVar);
                return this;
            }

            public final zza zzbd(int i) {
                zzadh();
                ((zzb) this.zzdtx).zzbc(i);
                return this;
            }

            public final zza zzeh(String str) {
                zzadh();
                ((zzb) this.zzdtx).zzea(str);
                return this;
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzdma = zzbVar;
            zzbbo.zza(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzaxl zzaxlVar) {
            if (zzaxlVar == null) {
                throw null;
            }
            this.zzdlv = zzaxlVar.zzhq();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzayd zzaydVar) {
            if (zzaydVar == null) {
                throw null;
            }
            this.zzdlj = zzaydVar.zzhq();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbc(int i) {
            this.zzdlw = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzea(String str) {
            if (str == null) {
                throw null;
            }
            this.zzdks = str;
        }

        public static zza zzzw() {
            return (zza) ((zzbbo.zza) zzdma.zza(zzbbo.zze.zzdue, (Object) null, (Object) null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzaxt$zzb>, com.google.android.gms.internal.ads.zzbbo$zzb] */
        @Override // com.google.android.gms.internal.ads.zzbbo
        public final Object zza(int i, Object obj, Object obj2) {
            zzbdf<zzb> zzbdfVar;
            switch (zzaxu.zzakf[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzdma, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzdks", "zzdlv", "zzdlw", "zzdlj"});
                case 4:
                    return zzdma;
                case 5:
                    zzbdf<zzb> zzbdfVar2 = zzakh;
                    zzbdf<zzb> zzbdfVar3 = zzbdfVar2;
                    if (zzbdfVar2 == null) {
                        synchronized (zzb.class) {
                            zzbdf<zzb> zzbdfVar4 = zzakh;
                            zzbdfVar = zzbdfVar4;
                            if (zzbdfVar4 == null) {
                                ?? zzbVar = new zzbbo.zzb(zzdma);
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
    }

    static {
        zzaxt zzaxtVar = new zzaxt();
        zzdlz = zzaxtVar;
        zzbbo.zza(zzaxt.class, zzaxtVar);
    }

    private zzaxt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzb zzbVar) {
        if (zzbVar == null) {
            throw null;
        }
        if (!this.zzdly.zzaay()) {
            zzbbt<zzb> zzbbtVar = this.zzdly;
            int size = zzbbtVar.size();
            this.zzdly = zzbbtVar.zzbm(size == 0 ? 10 : size << 1);
        }
        this.zzdly.add(zzbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzba(int i) {
        this.zzdlr = i;
    }

    public static zza zzzu() {
        return (zza) ((zzbbo.zza) zzdlz.zza(zzbbo.zze.zzdue, (Object) null, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzaxt>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzaxt> zzbdfVar;
        switch (zzaxu.zzakf[i - 1]) {
            case 1:
                return new zzaxt();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdlz, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzdlq", "zzdlr", "zzdly", zzb.class});
            case 4:
                return zzdlz;
            case 5:
                zzbdf<zzaxt> zzbdfVar2 = zzakh;
                zzbdf<zzaxt> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzaxt.class) {
                        zzbdf<zzaxt> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdlz);
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
}
