package com.daaw;
/* loaded from: classes.dex */
public final class xn7 extends ls7 implements yt7 {
    private static final xn7 zzb;
    private String zzd = "";
    private vm7 zze;

    static {
        xn7 xn7Var = new xn7();
        zzb = xn7Var;
        ls7.m16597C(xn7.class, xn7Var);
    }

    /* renamed from: N */
    public static xn7 m4942N() {
        return zzb;
    }

    /* renamed from: O */
    public static xn7 m4941O(yq7 yq7Var, vr7 vr7Var) {
        return (xn7) ls7.m16582q(zzb, yq7Var, vr7Var);
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
                    return new tn7(null);
                }
                return new xn7();
            }
            return ls7.m16573z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final vm7 m4944L() {
        vm7 vm7Var = this.zze;
        return vm7Var == null ? vm7.m7026N() : vm7Var;
    }

    /* renamed from: P */
    public final String m4940P() {
        return this.zzd;
    }

    /* renamed from: Q */
    public final boolean m4939Q() {
        return this.zze != null;
    }
}
