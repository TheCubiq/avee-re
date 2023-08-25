package com.daaw;
/* loaded from: classes2.dex */
public final class ii6 extends ja8 implements be8 {
    private static final ii6 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        ii6 ii6Var = new ii6();
        zza = ii6Var;
        ja8.v(ii6.class, ii6Var);
    }

    @Override // com.daaw.ja8
    public final Object C(int i, Object obj, Object obj2) {
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
                    return new fh6(null);
                }
                return new ii6();
            }
            return ja8.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final String E() {
        return this.zze;
    }

    public final String F() {
        return this.zzf;
    }
}
