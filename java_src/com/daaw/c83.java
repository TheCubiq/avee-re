package com.daaw;
/* loaded from: classes.dex */
public final class c83 extends ls7 implements yt7 {
    private static final c83 zzb;
    private int zzd;
    private int zze = 1000;
    private w73 zzf;
    private i73 zzg;

    static {
        c83 c83Var = new c83();
        zzb = c83Var;
        ls7.C(c83.class, c83Var);
    }

    @Override // com.daaw.ls7
    public final Object I(int i, Object obj, Object obj2) {
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
                    return new b83(null);
                }
                return new c83();
            }
            return ls7.z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", s53.a, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
