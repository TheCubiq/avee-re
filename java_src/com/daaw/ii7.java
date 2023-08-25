package com.daaw;
/* loaded from: classes.dex */
public final class ii7 extends ls7 implements yt7 {
    private static final ii7 zzb;
    private int zzd;

    static {
        ii7 ii7Var = new ii7();
        zzb = ii7Var;
        ls7.m16597C(ii7.class, ii7Var);
    }

    /* renamed from: M */
    public static ei7 m19763M() {
        return (ei7) zzb.m16592H();
    }

    /* renamed from: O */
    public static ii7 m19761O() {
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
                    return new ei7(null);
                }
                return new ii7();
            }
            return ls7.m16573z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m19764L() {
        return this.zzd;
    }
}
