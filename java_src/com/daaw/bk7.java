package com.daaw;
/* loaded from: classes.dex */
public final class bk7 extends ls7 implements yt7 {
    private static final bk7 zzb;
    private int zzd;
    private int zze;

    static {
        bk7 bk7Var = new bk7();
        zzb = bk7Var;
        ls7.m16597C(bk7.class, bk7Var);
    }

    /* renamed from: M */
    public static ak7 m26084M() {
        return (ak7) zzb.m16592H();
    }

    /* renamed from: O */
    public static bk7 m26082O(yq7 yq7Var, vr7 vr7Var) {
        return (bk7) ls7.m16582q(zzb, yq7Var, vr7Var);
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
                    return new ak7(null);
                }
                return new bk7();
            }
            return ls7.m16573z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m26085L() {
        return this.zzd;
    }
}
