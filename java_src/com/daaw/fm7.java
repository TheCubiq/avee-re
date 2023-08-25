package com.daaw;
/* loaded from: classes.dex */
public final class fm7 extends ls7 implements yt7 {
    private static final fm7 zzb;
    private int zzd;
    private im7 zze;
    private yq7 zzf = yq7.f33966q;

    static {
        fm7 fm7Var = new fm7();
        zzb = fm7Var;
        ls7.m16597C(fm7.class, fm7Var);
    }

    /* renamed from: M */
    public static em7 m22492M() {
        return (em7) zzb.m16592H();
    }

    /* renamed from: O */
    public static fm7 m22490O(yq7 yq7Var, vr7 vr7Var) {
        return (fm7) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    /* renamed from: S */
    public static /* synthetic */ void m22486S(fm7 fm7Var, im7 im7Var) {
        im7Var.getClass();
        fm7Var.zze = im7Var;
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
                    return new em7(null);
                }
                return new fm7();
            }
            return ls7.m16573z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m22493L() {
        return this.zzd;
    }

    /* renamed from: P */
    public final im7 m22489P() {
        im7 im7Var = this.zze;
        return im7Var == null ? im7.m19635P() : im7Var;
    }

    /* renamed from: Q */
    public final yq7 m22488Q() {
        return this.zzf;
    }

    /* renamed from: U */
    public final boolean m22484U() {
        return this.zze != null;
    }
}
