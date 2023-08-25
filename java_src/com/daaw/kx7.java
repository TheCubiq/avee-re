package com.daaw;
/* loaded from: classes.dex */
public final class kx7 extends ls7 implements yt7 {
    private static final kx7 zzb;
    private int zzd;
    private jx7 zzf;
    private long zzg;
    private String zze = "";
    private String zzh = "";

    static {
        kx7 kx7Var = new kx7();
        zzb = kx7Var;
        ls7.m16597C(kx7.class, kx7Var);
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
                    return new hx7(null);
                }
                return new kx7();
            }
            return ls7.m16573z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
