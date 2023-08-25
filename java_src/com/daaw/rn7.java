package com.daaw;
/* loaded from: classes.dex */
public final class rn7 extends ls7 implements yt7 {
    private static final rn7 zzb;
    private int zzd;
    private xn7 zze;

    static {
        rn7 rn7Var = new rn7();
        zzb = rn7Var;
        ls7.m16597C(rn7.class, rn7Var);
    }

    /* renamed from: M */
    public static qn7 m11140M() {
        return (qn7) zzb.m16592H();
    }

    /* renamed from: O */
    public static rn7 m11138O(yq7 yq7Var, vr7 vr7Var) {
        return (rn7) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    /* renamed from: R */
    public static /* synthetic */ void m11135R(rn7 rn7Var, xn7 xn7Var) {
        xn7Var.getClass();
        rn7Var.zze = xn7Var;
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
                    return new qn7(null);
                }
                return new rn7();
            }
            return ls7.m16573z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m11141L() {
        return this.zzd;
    }

    /* renamed from: P */
    public final xn7 m11137P() {
        xn7 xn7Var = this.zze;
        return xn7Var == null ? xn7.m4942N() : xn7Var;
    }
}
