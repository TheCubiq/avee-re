package com.daaw;
/* loaded from: classes.dex */
public final class rl7 extends ls7 implements yt7 {
    private static final rl7 zzb;
    private ul7 zzd;
    private int zze;
    private int zzf;

    static {
        rl7 rl7Var = new rl7();
        zzb = rl7Var;
        ls7.C(rl7.class, rl7Var);
    }

    public static nl7 M() {
        return (nl7) zzb.H();
    }

    public static rl7 O() {
        return zzb;
    }

    public static rl7 P(yq7 yq7Var, vr7 vr7Var) {
        return (rl7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void R(rl7 rl7Var, ul7 ul7Var) {
        ul7Var.getClass();
        rl7Var.zzd = ul7Var;
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
                    return new nl7(null);
                }
                return new rl7();
            }
            return ls7.z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zze;
    }

    public final ul7 Q() {
        ul7 ul7Var = this.zzd;
        return ul7Var == null ? ul7.O() : ul7Var;
    }
}
