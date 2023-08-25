package com.daaw;
/* loaded from: classes.dex */
public final class rn7 extends ls7 implements yt7 {
    private static final rn7 zzb;
    private int zzd;
    private xn7 zze;

    static {
        rn7 rn7Var = new rn7();
        zzb = rn7Var;
        ls7.C(rn7.class, rn7Var);
    }

    public static qn7 M() {
        return (qn7) zzb.H();
    }

    public static rn7 O(yq7 yq7Var, vr7 vr7Var) {
        return (rn7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void R(rn7 rn7Var, xn7 xn7Var) {
        xn7Var.getClass();
        rn7Var.zze = xn7Var;
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
                    return new qn7(null);
                }
                return new rn7();
            }
            return ls7.z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }

    public final xn7 P() {
        xn7 xn7Var = this.zze;
        return xn7Var == null ? xn7.N() : xn7Var;
    }
}
