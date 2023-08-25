package com.daaw;
/* loaded from: classes.dex */
public final class aj2 extends ls7 implements yt7 {
    private static final aj2 zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;

    static {
        aj2 aj2Var = new aj2();
        zzb = aj2Var;
        ls7.m16597C(aj2.class, aj2Var);
    }

    @Override // com.daaw.ls7
    /* renamed from: I */
    public final Object mo1768I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new vi2(null);
                }
                return new aj2();
            }
            return ls7.m16573z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", "zzf", lj2.f17481a});
        }
        return (byte) 1;
    }
}
