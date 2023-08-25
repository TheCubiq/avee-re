package com.daaw;
/* loaded from: classes.dex */
public final class ii7 extends ls7 implements yt7 {
    private static final ii7 zzb;
    private int zzd;

    static {
        ii7 ii7Var = new ii7();
        zzb = ii7Var;
        ls7.C(ii7.class, ii7Var);
    }

    public static ei7 M() {
        return (ei7) zzb.H();
    }

    public static ii7 O() {
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
                    return new ei7(null);
                }
                return new ii7();
            }
            return ls7.z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }
}
