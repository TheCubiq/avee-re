package com.daaw;
/* loaded from: classes.dex */
public final class bl7 extends ls7 implements yt7 {
    private static final bl7 zzb;
    private int zzd;
    private vk7 zze;
    private yq7 zzf;
    private yq7 zzg;

    static {
        bl7 bl7Var = new bl7();
        zzb = bl7Var;
        ls7.m16597C(bl7.class, bl7Var);
    }

    public bl7() {
        yq7 yq7Var = yq7.f33966q;
        this.zzf = yq7Var;
        this.zzg = yq7Var;
    }

    /* renamed from: N */
    public static al7 m26063N() {
        return (al7) zzb.m16592H();
    }

    /* renamed from: P */
    public static bl7 m26061P() {
        return zzb;
    }

    /* renamed from: Q */
    public static bl7 m26060Q(yq7 yq7Var, vr7 vr7Var) {
        return (bl7) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    /* renamed from: U */
    public static /* synthetic */ void m26056U(bl7 bl7Var, vk7 vk7Var) {
        vk7Var.getClass();
        bl7Var.zze = vk7Var;
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
                    return new al7(null);
                }
                return new bl7();
            }
            return ls7.m16573z(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m26065L() {
        return this.zzd;
    }

    /* renamed from: M */
    public final vk7 m26064M() {
        vk7 vk7Var = this.zze;
        return vk7Var == null ? vk7.m7072O() : vk7Var;
    }

    /* renamed from: R */
    public final yq7 m26059R() {
        return this.zzf;
    }

    /* renamed from: S */
    public final yq7 m26058S() {
        return this.zzg;
    }
}
