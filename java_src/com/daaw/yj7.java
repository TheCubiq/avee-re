package com.daaw;
/* loaded from: classes.dex */
public final class yj7 extends ls7 implements yt7 {
    private static final yj7 zzb;
    private int zzd;
    private yq7 zze = yq7.f33966q;

    static {
        yj7 yj7Var = new yj7();
        zzb = yj7Var;
        ls7.m16597C(yj7.class, yj7Var);
    }

    /* renamed from: M */
    public static xj7 m3641M() {
        return (xj7) zzb.m16592H();
    }

    /* renamed from: O */
    public static yj7 m3639O(yq7 yq7Var, vr7 vr7Var) {
        return (yj7) ls7.m16582q(zzb, yq7Var, vr7Var);
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
                    return new xj7(null);
                }
                return new yj7();
            }
            return ls7.m16573z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m3642L() {
        return this.zzd;
    }

    /* renamed from: P */
    public final yq7 m3638P() {
        return this.zze;
    }
}
