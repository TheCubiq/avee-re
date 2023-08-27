package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzavs extends zzbbo<zzavs, zza> implements zzbcw {
    private static volatile zzbdf<zzavs> zzakh;
    private static final zzavs zzdiq;
    private int zzdih;
    private zzavw zzdio;
    private zzbah zzdip = zzbah.zzdpq;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzavs, zza> implements zzbcw {
        private zza() {
            super(zzavs.zzdiq);
        }

        /* synthetic */ zza(zzavt zzavtVar) {
            this();
        }

        public final zza zzam(int i) {
            zzadh();
            ((zzavs) this.zzdtx).setVersion(0);
            return this;
        }

        public final zza zzc(zzavw zzavwVar) {
            zzadh();
            ((zzavs) this.zzdtx).zzb(zzavwVar);
            return this;
        }

        public final zza zzm(zzbah zzbahVar) {
            zzadh();
            ((zzavs) this.zzdtx).zzk(zzbahVar);
            return this;
        }
    }

    static {
        zzavs zzavsVar = new zzavs();
        zzdiq = zzavsVar;
        zzbbo.zza(zzavs.class, zzavsVar);
    }

    private zzavs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzdih = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzavw zzavwVar) {
        if (zzavwVar == null) {
            throw null;
        }
        this.zzdio = zzavwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(zzbah zzbahVar) {
        if (zzbahVar == null) {
            throw null;
        }
        this.zzdip = zzbahVar;
    }

    public static zzavs zzl(zzbah zzbahVar) throws zzbbu {
        return (zzavs) zzbbo.zza(zzdiq, zzbahVar);
    }

    public static zza zzww() {
        return (zza) ((zzbbo.zza) zzdiq.zza(zzbbo.zze.zzdue, (Object) null, (Object) null));
    }

    public static zzavs zzwx() {
        return zzdiq;
    }

    public final int getVersion() {
        return this.zzdih;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzavs>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzavs> zzbdfVar;
        switch (zzavt.zzakf[i - 1]) {
            case 1:
                return new zzavs();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdiq, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzdih", "zzdio", "zzdip"});
            case 4:
                return zzdiq;
            case 5:
                zzbdf<zzavs> zzbdfVar2 = zzakh;
                zzbdf<zzavs> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzavs.class) {
                        zzbdf<zzavs> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdiq);
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

    public final zzavw zzwu() {
        zzavw zzavwVar = this.zzdio;
        return zzavwVar == null ? zzavw.zzxc() : zzavwVar;
    }

    public final zzbah zzwv() {
        return this.zzdip;
    }
}
