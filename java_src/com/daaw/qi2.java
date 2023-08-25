package com.daaw;
/* loaded from: classes.dex */
public final class qi2 extends ls7 implements yt7 {
    private static final qi2 zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        qi2 qi2Var = new qi2();
        zzb = qi2Var;
        ls7.m16597C(qi2.class, qi2Var);
    }

    @Override // com.daaw.ls7
    /* renamed from: I */
    public final Object mo1768I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                ps7 ps7Var = lj2.f17481a;
                return ls7.m16573z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"zzd", "zze", "zzf", ps7Var, "zzg", ps7Var});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new pi2(null);
            } else {
                return new qi2();
            }
        }
        return (byte) 1;
    }
}
