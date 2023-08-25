package com.daaw;
/* loaded from: classes.dex */
public final class ln7 extends ls7 implements yt7 {
    private static final ln7 zzb;
    private int zzd;
    private on7 zze;

    static {
        ln7 ln7Var = new ln7();
        zzb = ln7Var;
        ls7.C(ln7.class, ln7Var);
    }

    public static kn7 M() {
        return (kn7) zzb.H();
    }

    public static ln7 O(yq7 yq7Var, vr7 vr7Var) {
        return (ln7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void R(ln7 ln7Var, on7 on7Var) {
        on7Var.getClass();
        ln7Var.zze = on7Var;
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
                    return new kn7(null);
                }
                return new ln7();
            }
            return ls7.z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }

    public final on7 P() {
        on7 on7Var = this.zze;
        return on7Var == null ? on7.M() : on7Var;
    }
}
