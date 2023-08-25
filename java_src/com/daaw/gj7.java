package com.daaw;
/* loaded from: classes.dex */
public final class gj7 extends ls7 implements yt7 {
    private static final gj7 zzb;
    private int zzd;

    static {
        gj7 gj7Var = new gj7();
        zzb = gj7Var;
        ls7.C(gj7.class, gj7Var);
    }

    public static fj7 M() {
        return (fj7) zzb.H();
    }

    public static gj7 O() {
        return zzb;
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
                    return new fj7(null);
                }
                return new gj7();
            }
            return ls7.z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }
}
