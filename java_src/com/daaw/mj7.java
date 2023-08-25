package com.daaw;
/* loaded from: classes.dex */
public final class mj7 extends ls7 implements yt7 {
    private static final mj7 zzb;
    private int zzd;
    private yq7 zze = yq7.q;

    static {
        mj7 mj7Var = new mj7();
        zzb = mj7Var;
        ls7.C(mj7.class, mj7Var);
    }

    public static lj7 M() {
        return (lj7) zzb.H();
    }

    public static mj7 O(yq7 yq7Var, vr7 vr7Var) {
        return (mj7) ls7.q(zzb, yq7Var, vr7Var);
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
                    return new lj7(null);
                }
                return new mj7();
            }
            return ls7.z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
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
