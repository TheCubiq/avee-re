package com.daaw;
/* loaded from: classes.dex */
public final class qh2 extends ls7 implements yt7 {
    private static final qh2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        qh2 qh2Var = new qh2();
        zzb = qh2Var;
        ls7.m16597C(qh2.class, qh2Var);
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
                    return new ph2(null);
                }
                return new qh2();
            }
            return ls7.m16573z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
