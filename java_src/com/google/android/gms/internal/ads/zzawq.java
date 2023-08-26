package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
public final class zzawq extends zzbbo<zzawq, zza> implements zzbcw {
    private static volatile zzbdf<zzawq> zzakh;
    private static final zzawq zzdjo;
    private zzaww zzdjl;
    private zzawm zzdjm;
    private int zzdjn;

    /* loaded from: classes2.dex */
    public static final class zza extends zzbbo.zza<zzawq, zza> implements zzbcw {
        private zza() {
            super(zzawq.zzdjo);
        }

        /* synthetic */ zza(zzawr zzawrVar) {
            this();
        }
    }

    static {
        zzawq zzawqVar = new zzawq();
        zzdjo = zzawqVar;
        zzbbo.zza(zzawq.class, zzawqVar);
    }

    private zzawq() {
    }

    public static zzawq zzxx() {
        return zzdjo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.ads.zzbdf<com.google.android.gms.internal.ads.zzawq>, com.google.android.gms.internal.ads.zzbbo$zzb] */
    @Override // com.google.android.gms.internal.ads.zzbbo
    public final Object zza(int i, Object obj, Object obj2) {
        zzbdf<zzawq> zzbdfVar;
        switch (zzawr.zzakf[i - 1]) {
            case 1:
                return new zzawq();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzdjo, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzdjl", "zzdjm", "zzdjn"});
            case 4:
                return zzdjo;
            case 5:
                zzbdf<zzawq> zzbdfVar2 = zzakh;
                zzbdf<zzawq> zzbdfVar3 = zzbdfVar2;
                if (zzbdfVar2 == null) {
                    synchronized (zzawq.class) {
                        zzbdf<zzawq> zzbdfVar4 = zzakh;
                        zzbdfVar = zzbdfVar4;
                        if (zzbdfVar4 == null) {
                            ?? zzbVar = new zzbbo.zzb(zzdjo);
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

    public final zzaww zzxu() {
        zzaww zzawwVar = this.zzdjl;
        return zzawwVar == null ? zzaww.zzyk() : zzawwVar;
    }

    public final zzawm zzxv() {
        zzawm zzawmVar = this.zzdjm;
        return zzawmVar == null ? zzawm.zzxq() : zzawmVar;
    }

    public final zzawk zzxw() {
        zzawk zzaq = zzawk.zzaq(this.zzdjn);
        return zzaq == null ? zzawk.UNRECOGNIZED : zzaq;
    }
}
