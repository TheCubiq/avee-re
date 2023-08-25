package com.daaw;
/* loaded from: classes.dex */
public final class zl7 extends ls7 implements yt7 {
    private static final zl7 zzb;
    private cm7 zzd;

    static {
        zl7 zl7Var = new zl7();
        zzb = zl7Var;
        ls7.m16597C(zl7.class, zl7Var);
    }

    /* renamed from: L */
    public static yl7 m2124L() {
        return (yl7) zzb.m16592H();
    }

    /* renamed from: N */
    public static zl7 m2122N(yq7 yq7Var, vr7 vr7Var) {
        return (zl7) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    /* renamed from: P */
    public static /* synthetic */ void m2120P(zl7 zl7Var, cm7 cm7Var) {
        cm7Var.getClass();
        zl7Var.zzd = cm7Var;
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
                    return new yl7(null);
                }
                return new zl7();
            }
            return ls7.m16573z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    /* renamed from: O */
    public final cm7 m2121O() {
        cm7 cm7Var = this.zzd;
        return cm7Var == null ? cm7.m25238N() : cm7Var;
    }
}
