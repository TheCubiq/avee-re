package com.daaw;
/* loaded from: classes.dex */
public final class bk7 extends ls7 implements yt7 {
    private static final bk7 zzb;
    private int zzd;
    private int zze;

    static {
        bk7 bk7Var = new bk7();
        zzb = bk7Var;
        ls7.C(bk7.class, bk7Var);
    }

    public static ak7 M() {
        return (ak7) zzb.H();
    }

    public static bk7 O(yq7 yq7Var, vr7 vr7Var) {
        return (bk7) ls7.q(zzb, yq7Var, vr7Var);
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
                    return new ak7(null);
                }
                return new bk7();
            }
            return ls7.z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }
}
