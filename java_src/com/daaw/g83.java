package com.daaw;
/* loaded from: classes.dex */
public final class g83 extends ls7 implements yt7 {
    private static final g83 zzb;
    private int zzd;
    private int zze = 1000;
    private w73 zzf;
    private i73 zzg;

    static {
        g83 g83Var = new g83();
        zzb = g83Var;
        ls7.m16597C(g83.class, g83Var);
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
                    return new f83(null);
                }
                return new g83();
            }
            return ls7.m16573z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", s53.f25879a, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
