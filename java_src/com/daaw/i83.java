package com.daaw;
/* loaded from: classes.dex */
public final class i83 extends ls7 implements yt7 {
    private static final i83 zzb;
    private int zzd;
    private int zze = 1000;
    private w73 zzf;

    static {
        i83 i83Var = new i83();
        zzb = i83Var;
        ls7.C(i83.class, i83Var);
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
                    return new h83(null);
                }
                return new i83();
            }
            return ls7.z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", s53.a, "zzf"});
        }
        return (byte) 1;
    }
}
