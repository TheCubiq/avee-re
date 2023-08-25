package com.daaw;
/* loaded from: classes.dex */
public final class gj7 extends ls7 implements yt7 {
    private static final gj7 zzb;
    private int zzd;

    static {
        gj7 gj7Var = new gj7();
        zzb = gj7Var;
        ls7.m16597C(gj7.class, gj7Var);
    }

    /* renamed from: M */
    public static fj7 m21556M() {
        return (fj7) zzb.m16592H();
    }

    /* renamed from: O */
    public static gj7 m21554O() {
        return zzb;
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
                    return new fj7(null);
                }
                return new gj7();
            }
            return ls7.m16573z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m21557L() {
        return this.zzd;
    }
}
