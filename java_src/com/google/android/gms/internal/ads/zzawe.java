package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzawe extends zzbbo<zzawe, zza> implements zzbcw {
    private static volatile zzbdf<zzawe> zzakh;
    private static final zzawe zzdiz;
    private int zzdih;
    private zzbah zzdip = zzbah.zzdpq;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzawe, zza> implements zzbcw {
        private zza() {
            super(zzawe.zzdiz);
        }

        /* synthetic */ zza(zzawf zzawfVar) {
            this();
        }

        public final zza zzao(int i) {
            zzadh();
            ((zzawe) this.zzdtx).setVersion(0);
            return this;
        }

        public final zza zzs(zzbah zzbahVar) {
            zzadh();
            ((zzawe) this.zzdtx).zzk(zzbahVar);
            return this;
        }
    }

    static {
        zzawe zzaweVar = new zzawe();
        zzdiz = zzaweVar;
        zzbbo.zza(zzawe.class, zzaweVar);
    }

    private zzawe() {
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

    public static zzawe zzr(zzbah zzbahVar) throws zzbbu {
        return (zzawe) zzbbo.zza(zzdiz, zzbahVar);
    }

    public static zza zzxk() {
        return (zza) ((zzbbo.zza) zzdiz.zza(zzbbo.zze.zzdue, (Object) null, (Object) null));
    }

    public final int getVersion() {
        return this.zzdih;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzawe>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzawe> zzbdfVar;
        switch (zzawf.zzakf[i - 1]) {
            case 1:
                return new zzawe();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdiz, "\u0000\u0002\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzdih", "zzdip"});
            case 4:
                return zzdiz;
            case 5:
                zzbdf<zzawe> zzbdfVar2 = zzakh;
                zzbdf<zzawe> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzawe.class) {
                        zzbdf<zzawe> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdiz);
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
