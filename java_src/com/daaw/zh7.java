package com.daaw;
/* loaded from: classes.dex */
public final class zh7 extends ls7 implements yt7 {
    private static final zh7 zzb;
    private int zzd;
    private yq7 zze = yq7.f33966q;
    private ii7 zzf;

    static {
        zh7 zh7Var = new zh7();
        zzb = zh7Var;
        ls7.m16597C(zh7.class, zh7Var);
    }

    /* renamed from: M */
    public static yh7 m2293M() {
        return (yh7) zzb.m16592H();
    }

    /* renamed from: O */
    public static zh7 m2291O(yq7 yq7Var, vr7 vr7Var) {
        return (zh7) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    /* renamed from: T */
    public static /* synthetic */ void m2286T(zh7 zh7Var, ii7 ii7Var) {
        ii7Var.getClass();
        zh7Var.zzf = ii7Var;
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
                    return new yh7(null);
                }
                return new zh7();
            }
            return ls7.m16573z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m2294L() {
        return this.zzd;
    }

    /* renamed from: P */
    public final ii7 m2290P() {
        ii7 ii7Var = this.zzf;
        return ii7Var == null ? ii7.m19761O() : ii7Var;
    }

    /* renamed from: Q */
    public final yq7 m2289Q() {
        return this.zze;
    }
}
