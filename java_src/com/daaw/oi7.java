package com.daaw;
/* loaded from: classes.dex */
public final class oi7 extends ls7 implements yt7 {
    private static final oi7 zzb;
    private ui7 zzd;
    private rl7 zze;

    static {
        oi7 oi7Var = new oi7();
        zzb = oi7Var;
        ls7.C(oi7.class, oi7Var);
    }

    public static ni7 L() {
        return (ni7) zzb.H();
    }

    public static oi7 N(yq7 yq7Var, vr7 vr7Var) {
        return (oi7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void Q(oi7 oi7Var, ui7 ui7Var) {
        ui7Var.getClass();
        oi7Var.zzd = ui7Var;
    }

    public static /* synthetic */ void R(oi7 oi7Var, rl7 rl7Var) {
        rl7Var.getClass();
        oi7Var.zze = rl7Var;
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
                    return new ni7(null);
                }
                return new oi7();
            }
            return ls7.z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final ui7 O() {
        ui7 ui7Var = this.zzd;
        return ui7Var == null ? ui7.O() : ui7Var;
    }

    public final rl7 P() {
        rl7 rl7Var = this.zze;
        return rl7Var == null ? rl7.O() : rl7Var;
    }
}
