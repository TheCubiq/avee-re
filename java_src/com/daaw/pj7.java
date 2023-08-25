package com.daaw;
/* loaded from: classes.dex */
public final class pj7 extends ls7 implements yt7 {
    private static final pj7 zzb;
    private int zzd;
    private int zze;

    static {
        pj7 pj7Var = new pj7();
        zzb = pj7Var;
        ls7.C(pj7.class, pj7Var);
    }

    public static oj7 M() {
        return (oj7) zzb.H();
    }

    public static pj7 O(yq7 yq7Var, vr7 vr7Var) {
        return (pj7) ls7.q(zzb, yq7Var, vr7Var);
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
                    return new oj7(null);
                }
                return new pj7();
            }
            return ls7.z(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }
}
