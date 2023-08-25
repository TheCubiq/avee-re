package com.daaw;
/* loaded from: classes.dex */
public final class xi7 extends ls7 implements yt7 {
    private static final xi7 zzb;
    private int zzd;

    static {
        xi7 xi7Var = new xi7();
        zzb = xi7Var;
        ls7.C(xi7.class, xi7Var);
    }

    public static wi7 M() {
        return (wi7) zzb.H();
    }

    public static xi7 O() {
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
                    return new wi7(null);
                }
                return new xi7();
            }
            return ls7.z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }
}
