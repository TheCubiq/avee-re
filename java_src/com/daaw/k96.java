package com.daaw;
/* loaded from: classes2.dex */
public final class k96 extends ja8 implements be8 {
    private static final k96 zza;
    private int zzd;
    private String zze = "";
    private db8 zzf = ja8.m18667o();
    private boolean zzg;

    static {
        k96 k96Var = new k96();
        zza = k96Var;
        ja8.m18661v(k96.class, k96Var);
    }

    @Override // com.daaw.ja8
    /* renamed from: C */
    public final Object mo4853C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new h86(null);
                }
                return new k96();
            }
            return ja8.m18664s(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", cg6.class, "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: E */
    public final String m17936E() {
        return this.zze;
    }
}
