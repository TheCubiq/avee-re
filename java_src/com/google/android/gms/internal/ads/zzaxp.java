package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzaxp extends zzbbo<zzaxp, zza> implements zzbcw {
    private static volatile zzbdf<zzaxp> zzakh;
    private static final zzaxp zzdlp;
    private int zzdlm;
    private boolean zzdln;
    private String zzdll = "";
    private String zzdks = "";
    private String zzdlo = "";

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzaxp, zza> implements zzbcw {
        private zza() {
            super(zzaxp.zzdlp);
        }

        /* synthetic */ zza(zzaxq zzaxqVar) {
            this();
        }

        public final zza zzao(boolean z) {
            zzadh();
            ((zzaxp) this.zzdtx).zzan(true);
            return this;
        }

        public final zza zzaz(int i) {
            zzadh();
            ((zzaxp) this.zzdtx).zzay(0);
            return this;
        }

        public final zza zzee(String str) {
            zzadh();
            ((zzaxp) this.zzdtx).zzec(str);
            return this;
        }

        public final zza zzef(String str) {
            zzadh();
            ((zzaxp) this.zzdtx).zzea(str);
            return this;
        }

        public final zza zzeg(String str) {
            zzadh();
            ((zzaxp) this.zzdtx).zzed(str);
            return this;
        }
    }

    static {
        zzaxp zzaxpVar = new zzaxp();
        zzdlp = zzaxpVar;
        zzbbo.zza(zzaxp.class, zzaxpVar);
    }

    private zzaxp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzan(boolean z) {
        this.zzdln = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzay(int i) {
        this.zzdlm = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzea(String str) {
        if (str == null) {
            throw null;
        }
        this.zzdks = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzec(String str) {
        if (str == null) {
            throw null;
        }
        this.zzdll = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzed(String str) {
        if (str == null) {
            throw null;
        }
        this.zzdlo = str;
    }

    public static zza zzzi() {
        return (zza) ((zzbbo.zza) zzdlp.zza(zzbbo.zze.zzdue, (Object) null, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzaxp>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzaxp> zzbdfVar;
        switch (zzaxq.zzakf[i - 1]) {
            case 1:
                return new zzaxp();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdlp, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzdll", "zzdks", "zzdlm", "zzdln", "zzdlo"});
            case 4:
                return zzdlp;
            case 5:
                zzbdf<zzaxp> zzbdfVar2 = zzakh;
                zzbdf<zzaxp> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzaxp.class) {
                        zzbdf<zzaxp> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdlp);
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

    public final String zzze() {
        return this.zzdll;
    }

    public final int zzzf() {
        return this.zzdlm;
    }

    public final boolean zzzg() {
        return this.zzdln;
    }

    public final String zzzh() {
        return this.zzdlo;
    }
}
