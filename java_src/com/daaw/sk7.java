package com.daaw;
/* loaded from: classes.dex */
public final class sk7 extends ls7 implements yt7 {
    private static final sk7 zzb;
    private vk7 zzd;

    static {
        sk7 sk7Var = new sk7();
        zzb = sk7Var;
        ls7.m16597C(sk7.class, sk7Var);
    }

    /* renamed from: L */
    public static rk7 m10225L() {
        return (rk7) zzb.m16592H();
    }

    /* renamed from: N */
    public static sk7 m10223N(yq7 yq7Var, vr7 vr7Var) {
        return (sk7) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    /* renamed from: P */
    public static /* synthetic */ void m10221P(sk7 sk7Var, vk7 vk7Var) {
        vk7Var.getClass();
        sk7Var.zzd = vk7Var;
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
                    return new rk7(null);
                }
                return new sk7();
            }
            return ls7.m16573z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    /* renamed from: O */
    public final vk7 m10222O() {
        vk7 vk7Var = this.zzd;
        return vk7Var == null ? vk7.m7072O() : vk7Var;
    }
}
