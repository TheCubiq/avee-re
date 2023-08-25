package com.daaw;
/* loaded from: classes.dex */
public final class fm7 extends ls7 implements yt7 {
    private static final fm7 zzb;
    private int zzd;
    private im7 zze;
    private yq7 zzf = yq7.q;

    static {
        fm7 fm7Var = new fm7();
        zzb = fm7Var;
        ls7.C(fm7.class, fm7Var);
    }

    public static em7 M() {
        return (em7) zzb.H();
    }

    public static fm7 O(yq7 yq7Var, vr7 vr7Var) {
        return (fm7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void S(fm7 fm7Var, im7 im7Var) {
        im7Var.getClass();
        fm7Var.zze = im7Var;
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
                    return new em7(null);
                }
                return new fm7();
            }
            return ls7.z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }

    public final im7 P() {
        im7 im7Var = this.zze;
        return im7Var == null ? im7.P() : im7Var;
    }

    public final yq7 Q() {
        return this.zzf;
    }

    public final boolean U() {
        return this.zze != null;
    }
}
