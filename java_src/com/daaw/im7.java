package com.daaw;
/* loaded from: classes.dex */
public final class im7 extends ls7 implements yt7 {
    private static final im7 zzb;
    private int zzd;
    private cm7 zze;
    private yq7 zzf = yq7.q;

    static {
        im7 im7Var = new im7();
        zzb = im7Var;
        ls7.C(im7.class, im7Var);
    }

    public static hm7 N() {
        return (hm7) zzb.H();
    }

    public static im7 P() {
        return zzb;
    }

    public static im7 Q(yq7 yq7Var, vr7 vr7Var) {
        return (im7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void T(im7 im7Var, cm7 cm7Var) {
        cm7Var.getClass();
        im7Var.zze = cm7Var;
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
                    return new hm7(null);
                }
                return new im7();
            }
            return ls7.z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }

    public final cm7 M() {
        cm7 cm7Var = this.zze;
        return cm7Var == null ? cm7.N() : cm7Var;
    }

    public final yq7 R() {
        return this.zzf;
    }

    public final boolean V() {
        return this.zze != null;
    }
}
