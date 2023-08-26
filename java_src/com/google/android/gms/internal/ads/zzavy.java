package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzavy extends zzbbo<zzavy, zza> implements zzbcw {
    private static volatile zzbdf<zzavy> zzakh;
    private static final zzavy zzdiw;
    private int zzdih;
    private zzbah zzdip = zzbah.zzdpq;
    private zzawc zzdiv;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzavy, zza> implements zzbcw {
        private zza() {
            super(zzavy.zzdiw);
        }

        /* synthetic */ zza(zzavz zzavzVar) {
            this();
        }

        public final zza zzan(int i) {
            zzadh();
            ((zzavy) this.zzdtx).setVersion(0);
            return this;
        }

        public final zza zzb(zzawc zzawcVar) {
            zzadh();
            ((zzavy) this.zzdtx).zza(zzawcVar);
            return this;
        }

        public final zza zzp(zzbah zzbahVar) {
            zzadh();
            ((zzavy) this.zzdtx).zzk(zzbahVar);
            return this;
        }
    }

    static {
        zzavy zzavyVar = new zzavy();
        zzdiw = zzavyVar;
        zzbbo.zza(zzavy.class, zzavyVar);
    }

    private zzavy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzdih = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzawc zzawcVar) {
        if (zzawcVar == null) {
            throw null;
        }
        this.zzdiv = zzawcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(zzbah zzbahVar) {
        if (zzbahVar == null) {
            throw null;
        }
        this.zzdip = zzbahVar;
    }

    public static zzavy zzo(zzbah zzbahVar) throws zzbbu {
        return (zzavy) zzbbo.zza(zzdiw, zzbahVar);
    }

    public static zza zzxf() {
        return (zza) ((zzbbo.zza) zzdiw.zza(zzbbo.zze.zzdue, (Object) null, (Object) null));
    }

    public final int getVersion() {
        return this.zzdih;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzavy>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzavy> zzbdfVar;
        switch (zzavz.zzakf[i - 1]) {
            case 1:
                return new zzavy();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdiw, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzdih", "zzdiv", "zzdip"});
            case 4:
                return zzdiw;
            case 5:
                zzbdf<zzavy> zzbdfVar2 = zzakh;
                zzbdf<zzavy> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzavy.class) {
                        zzbdf<zzavy> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdiw);
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

    public final zzawc zzxe() {
        zzawc zzawcVar = this.zzdiv;
        return zzawcVar == null ? zzawc.zzxi() : zzawcVar;
    }
}
