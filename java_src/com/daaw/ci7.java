package com.daaw;
/* loaded from: classes.dex */
public final class ci7 extends ls7 implements yt7 {
    private static final ci7 zzb;
    private int zzd;
    private ii7 zze;

    static {
        ci7 ci7Var = new ci7();
        zzb = ci7Var;
        ls7.C(ci7.class, ci7Var);
    }

    public static bi7 M() {
        return (bi7) zzb.H();
    }

    public static ci7 O(yq7 yq7Var, vr7 vr7Var) {
        return (ci7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void R(ci7 ci7Var, ii7 ii7Var) {
        ii7Var.getClass();
        ci7Var.zze = ii7Var;
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
                    return new bi7(null);
                }
                return new ci7();
            }
            return ls7.z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }

    public final ii7 P() {
        ii7 ii7Var = this.zze;
        return ii7Var == null ? ii7.O() : ii7Var;
    }
}
