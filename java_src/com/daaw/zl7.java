package com.daaw;
/* loaded from: classes.dex */
public final class zl7 extends ls7 implements yt7 {
    private static final zl7 zzb;
    private cm7 zzd;

    static {
        zl7 zl7Var = new zl7();
        zzb = zl7Var;
        ls7.C(zl7.class, zl7Var);
    }

    public static yl7 L() {
        return (yl7) zzb.H();
    }

    public static zl7 N(yq7 yq7Var, vr7 vr7Var) {
        return (zl7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void P(zl7 zl7Var, cm7 cm7Var) {
        cm7Var.getClass();
        zl7Var.zzd = cm7Var;
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
                    return new yl7(null);
                }
                return new zl7();
            }
            return ls7.z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final cm7 O() {
        cm7 cm7Var = this.zzd;
        return cm7Var == null ? cm7.N() : cm7Var;
    }
}
