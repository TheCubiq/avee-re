package com.daaw;
/* loaded from: classes.dex */
public final class aj7 extends ls7 implements yt7 {
    private static final aj7 zzb;
    private int zzd;
    private gj7 zze;
    private yq7 zzf = yq7.q;

    static {
        aj7 aj7Var = new aj7();
        zzb = aj7Var;
        ls7.C(aj7.class, aj7Var);
    }

    public static zi7 M() {
        return (zi7) zzb.H();
    }

    public static aj7 O(yq7 yq7Var, vr7 vr7Var) {
        return (aj7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void S(aj7 aj7Var, gj7 gj7Var) {
        gj7Var.getClass();
        aj7Var.zze = gj7Var;
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
                    return new zi7(null);
                }
                return new aj7();
            }
            return ls7.z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }

    public final gj7 P() {
        gj7 gj7Var = this.zze;
        return gj7Var == null ? gj7.O() : gj7Var;
    }

    public final yq7 Q() {
        return this.zzf;
    }
}
