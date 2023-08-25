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
        ls7.C(bl7.class, bl7Var);
    }

    public bl7() {
        yq7 yq7Var = yq7.q;
        this.zzf = yq7Var;
        this.zzg = yq7Var;
    }

    public static al7 N() {
        return (al7) zzb.H();
    }

    public static bl7 P() {
        return zzb;
    }

    public static bl7 Q(yq7 yq7Var, vr7 vr7Var) {
        return (bl7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void U(bl7 bl7Var, vk7 vk7Var) {
        vk7Var.getClass();
        bl7Var.zze = vk7Var;
    }

    @Override // com.daaw.ls7
    public final Object I(int i, Object obj, Object obj2) {
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
            return ls7.z(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }

    public final vk7 M() {
        vk7 vk7Var = this.zze;
        return vk7Var == null ? vk7.O() : vk7Var;
    }

    public final yq7 R() {
        return this.zzf;
    }

    public final yq7 S() {
        return this.zzg;
    }
}
