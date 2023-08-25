package com.daaw;
/* loaded from: classes.dex */
public final class mj7 extends ls7 implements yt7 {
    private static final mj7 zzb;
    private int zzd;
    private yq7 zze = yq7.f33966q;

    static {
        mj7 mj7Var = new mj7();
        zzb = mj7Var;
        ls7.m16597C(mj7.class, mj7Var);
    }

    /* renamed from: M */
    public static lj7 m16010M() {
        return (lj7) zzb.m16592H();
    }

    /* renamed from: O */
    public static mj7 m16008O(yq7 yq7Var, vr7 vr7Var) {
        return (mj7) ls7.m16582q(zzb, yq7Var, vr7Var);
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
                    return new lj7(null);
                }
                return new mj7();
            }
            return ls7.m16573z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m16011L() {
        return this.zzd;
    }

    /* renamed from: P */
    public final yq7 m16007P() {
        return this.zze;
    }
}
