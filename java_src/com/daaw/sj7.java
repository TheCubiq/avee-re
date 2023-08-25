package com.daaw;
/* loaded from: classes.dex */
public final class sj7 extends ls7 implements yt7 {
    private static final sj7 zzb;
    private int zzd;
    private yq7 zze = yq7.f33966q;

    static {
        sj7 sj7Var = new sj7();
        zzb = sj7Var;
        ls7.m16597C(sj7.class, sj7Var);
    }

    /* renamed from: M */
    public static rj7 m10280M() {
        return (rj7) zzb.m16592H();
    }

    /* renamed from: O */
    public static sj7 m10278O(yq7 yq7Var, vr7 vr7Var) {
        return (sj7) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    @Override // com.daaw.ls7
    /* renamed from: I */
    public final Object mo1768I(int i, Object obj, Object obj2) {
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
                    return new rj7(null);
                }
                return new sj7();
            }
            return ls7.m16573z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m10281L() {
        return this.zzd;
    }

    /* renamed from: P */
    public final yq7 m10277P() {
        return this.zze;
    }
}
