package com.daaw;
/* loaded from: classes.dex */
public final class io7 extends ls7 implements yt7 {
    private static final io7 zzb;
    private int zzd;

    static {
        io7 io7Var = new io7();
        zzb = io7Var;
        ls7.m16597C(io7.class, io7Var);
    }

    /* renamed from: M */
    public static io7 m19547M() {
        return zzb;
    }

    /* renamed from: N */
    public static io7 m19546N(yq7 yq7Var, vr7 vr7Var) {
        return (io7) ls7.m16582q(zzb, yq7Var, vr7Var);
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
                    return new ho7(null);
                }
                return new io7();
            }
            return ls7.m16573z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
