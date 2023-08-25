package com.daaw;
/* loaded from: classes.dex */
public final class yk7 extends ls7 implements yt7 {
    private static final yk7 zzb;
    private int zzd;
    private bl7 zze;
    private yq7 zzf = yq7.q;

    static {
        yk7 yk7Var = new yk7();
        zzb = yk7Var;
        ls7.C(yk7.class, yk7Var);
    }

    public static xk7 M() {
        return (xk7) zzb.H();
    }

    public static yk7 O(yq7 yq7Var, vr7 vr7Var) {
        return (yk7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void S(yk7 yk7Var, bl7 bl7Var) {
        bl7Var.getClass();
        yk7Var.zze = bl7Var;
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
                    return new xk7(null);
                }
                return new yk7();
            }
            return ls7.z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }

    public final bl7 P() {
        bl7 bl7Var = this.zze;
        return bl7Var == null ? bl7.P() : bl7Var;
    }

    public final yq7 Q() {
        return this.zzf;
    }
}
