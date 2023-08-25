package com.daaw;
/* loaded from: classes.dex */
public final class vj7 extends ls7 implements yt7 {
    private static final vj7 zzb;
    private int zzd;
    private int zze;

    static {
        vj7 vj7Var = new vj7();
        zzb = vj7Var;
        ls7.C(vj7.class, vj7Var);
    }

    public static uj7 M() {
        return (uj7) zzb.H();
    }

    public static vj7 O(yq7 yq7Var, vr7 vr7Var) {
        return (vj7) ls7.q(zzb, yq7Var, vr7Var);
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
                    return new uj7(null);
                }
                return new vj7();
            }
            return ls7.z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }
}
