package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzaxi extends zzbbo<zzaxi, zza> implements zzbcw {
    private static volatile zzbdf<zzaxi> zzakh;
    private static final zzaxi zzdkv;
    private String zzdks = "";
    private zzbah zzdkt = zzbah.zzdpq;
    private int zzdku;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzaxi, zza> implements zzbcw {
        private zza() {
            super(zzaxi.zzdkv);
        }

        /* synthetic */ zza(zzaxj zzaxjVar) {
            this();
        }

        public final zza zzai(zzbah zzbahVar) {
            zzadh();
            ((zzaxi) this.zzdtx).zzah(zzbahVar);
            return this;
        }

        public final zza zzb(zzb zzbVar) {
            zzadh();
            ((zzaxi) this.zzdtx).zza(zzbVar);
            return this;
        }

        public final zza zzeb(String str) {
            zzadh();
            ((zzaxi) this.zzdtx).zzea(str);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public enum zzb implements zzbbr {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private static final zzbbs<zzb> zzall = new zzaxk();
        private final int value;

        zzb(int i) {
            this.value = i;
        }

        public static zzb zzaw(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return REMOTE;
                        }
                        return ASYMMETRIC_PUBLIC;
                    }
                    return ASYMMETRIC_PRIVATE;
                }
                return SYMMETRIC;
            }
            return UNKNOWN_KEYMATERIAL;
        }

        @Override // com.google.android.gms.internal.ads.zzbbr
        public final int zzhq() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        zzaxi zzaxiVar = new zzaxi();
        zzdkv = zzaxiVar;
        zzbbo.zza(zzaxi.class, zzaxiVar);
    }

    private zzaxi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzb zzbVar) {
        if (zzbVar == null) {
            throw null;
        }
        this.zzdku = zzbVar.zzhq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzah(zzbah zzbahVar) {
        if (zzbahVar == null) {
            throw null;
        }
        this.zzdkt = zzbahVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzea(String str) {
        if (str == null) {
            throw null;
        }
        this.zzdks = str;
    }

    public static zza zzyz() {
        return (zza) ((zzbbo.zza) zzdkv.zza(zzbbo.zze.zzdue, (Object) null, (Object) null));
    }

    public static zzaxi zzza() {
        return zzdkv;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbbo$zzb, com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzaxi>] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    protected final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzaxi> zzbdfVar;
        switch (zzaxj.zzakf[i - 1]) {
            case 1:
                return new zzaxi();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdkv, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzdks", "zzdkt", "zzdku"});
            case 4:
                return zzdkv;
            case 5:
                zzbdf<zzaxi> zzbdfVar2 = zzakh;
                zzbdf<zzaxi> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzaxi.class) {
                        zzbdf<zzaxi> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdkv);
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

    public final zzb zzyy() {
        zzb zzaw = zzb.zzaw(this.zzdku);
        return zzaw == null ? zzb.UNRECOGNIZED : zzaw;
    }
}
