package com.daaw;
/* loaded from: classes.dex */
public final class ai2 extends ls7 implements yt7 {
    private static final ai2 zzb;
    private int zzd;
    private ci2 zze;
    private fi2 zzf;

    static {
        ai2 ai2Var = new ai2();
        zzb = ai2Var;
        ls7.m16597C(ai2.class, ai2Var);
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
                    return new zh2(null);
                }
                return new ai2();
            }
            return ls7.m16573z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
