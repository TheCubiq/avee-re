package com.daaw;
/* loaded from: classes.dex */
public final class im7 extends ls7 implements yt7 {
    private static final im7 zzb;
    private int zzd;
    private cm7 zze;
    private yq7 zzf = yq7.f33966q;

    static {
        im7 im7Var = new im7();
        zzb = im7Var;
        ls7.m16597C(im7.class, im7Var);
    }

    /* renamed from: N */
    public static hm7 m19637N() {
        return (hm7) zzb.m16592H();
    }

    /* renamed from: P */
    public static im7 m19635P() {
        return zzb;
    }

    /* renamed from: Q */
    public static im7 m19634Q(yq7 yq7Var, vr7 vr7Var) {
        return (im7) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    /* renamed from: T */
    public static /* synthetic */ void m19631T(im7 im7Var, cm7 cm7Var) {
        cm7Var.getClass();
        im7Var.zze = cm7Var;
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
                    return new hm7(null);
                }
                return new im7();
            }
            return ls7.m16573z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m19639L() {
        return this.zzd;
    }

    /* renamed from: M */
    public final cm7 m19638M() {
        cm7 cm7Var = this.zze;
        return cm7Var == null ? cm7.m25238N() : cm7Var;
    }

    /* renamed from: R */
    public final yq7 m19633R() {
        return this.zzf;
    }

    /* renamed from: V */
    public final boolean m19629V() {
        return this.zze != null;
    }
}
