package com.daaw;
/* loaded from: classes.dex */
public final class sk7 extends ls7 implements yt7 {
    private static final sk7 zzb;
    private vk7 zzd;

    static {
        sk7 sk7Var = new sk7();
        zzb = sk7Var;
        ls7.C(sk7.class, sk7Var);
    }

    public static rk7 L() {
        return (rk7) zzb.H();
    }

    public static sk7 N(yq7 yq7Var, vr7 vr7Var) {
        return (sk7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void P(sk7 sk7Var, vk7 vk7Var) {
        vk7Var.getClass();
        sk7Var.zzd = vk7Var;
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
                    return new rk7(null);
                }
                return new sk7();
            }
            return ls7.z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final vk7 O() {
        vk7 vk7Var = this.zzd;
        return vk7Var == null ? vk7.O() : vk7Var;
    }
}
