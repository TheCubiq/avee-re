package com.daaw;
/* loaded from: classes.dex */
public final class hk7 extends ls7 implements yt7 {
    private static final hk7 zzb;

    static {
        hk7 hk7Var = new hk7();
        zzb = hk7Var;
        ls7.C(hk7.class, hk7Var);
    }

    public static hk7 M() {
        return zzb;
    }

    public static hk7 N(yq7 yq7Var, vr7 vr7Var) {
        return (hk7) ls7.q(zzb, yq7Var, vr7Var);
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
                    return new gk7(null);
                }
                return new hk7();
            }
            return ls7.z(zzb, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
