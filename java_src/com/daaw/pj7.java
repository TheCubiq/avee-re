package com.daaw;
/* loaded from: classes.dex */
public final class pj7 extends ls7 implements yt7 {
    private static final pj7 zzb;
    private int zzd;
    private int zze;

    static {
        pj7 pj7Var = new pj7();
        zzb = pj7Var;
        ls7.m16597C(pj7.class, pj7Var);
    }

    /* renamed from: M */
    public static oj7 m13325M() {
        return (oj7) zzb.m16592H();
    }

    /* renamed from: O */
    public static pj7 m13323O(yq7 yq7Var, vr7 vr7Var) {
        return (pj7) ls7.m16582q(zzb, yq7Var, vr7Var);
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
                    return new oj7(null);
                }
                return new pj7();
            }
            return ls7.m16573z(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m13326L() {
        return this.zzd;
    }
}
