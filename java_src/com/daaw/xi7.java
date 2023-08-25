package com.daaw;
/* loaded from: classes.dex */
public final class xi7 extends ls7 implements yt7 {
    private static final xi7 zzb;
    private int zzd;

    static {
        xi7 xi7Var = new xi7();
        zzb = xi7Var;
        ls7.m16597C(xi7.class, xi7Var);
    }

    /* renamed from: M */
    public static wi7 m5060M() {
        return (wi7) zzb.m16592H();
    }

    /* renamed from: O */
    public static xi7 m5058O() {
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
                    return new wi7(null);
                }
                return new xi7();
            }
            return ls7.m16573z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m5061L() {
        return this.zzd;
    }
}
