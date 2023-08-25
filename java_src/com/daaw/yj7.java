package com.daaw;
/* loaded from: classes.dex */
public final class yj7 extends ls7 implements yt7 {
    private static final yj7 zzb;
    private int zzd;
    private yq7 zze = yq7.q;

    static {
        yj7 yj7Var = new yj7();
        zzb = yj7Var;
        ls7.C(yj7.class, yj7Var);
    }

    public static xj7 M() {
        return (xj7) zzb.H();
    }

    public static yj7 O(yq7 yq7Var, vr7 vr7Var) {
        return (yj7) ls7.q(zzb, yq7Var, vr7Var);
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
                    return new xj7(null);
                }
                return new yj7();
            }
            return ls7.z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }

    public final yq7 P() {
        return this.zze;
    }
}
