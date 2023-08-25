package com.daaw;
/* loaded from: classes.dex */
public final class rl7 extends ls7 implements yt7 {
    private static final rl7 zzb;
    private ul7 zzd;
    private int zze;
    private int zzf;

    static {
        rl7 rl7Var = new rl7();
        zzb = rl7Var;
        ls7.m16597C(rl7.class, rl7Var);
    }

    /* renamed from: M */
    public static nl7 m11191M() {
        return (nl7) zzb.m16592H();
    }

    /* renamed from: O */
    public static rl7 m11189O() {
        return zzb;
    }

    /* renamed from: P */
    public static rl7 m11188P(yq7 yq7Var, vr7 vr7Var) {
        return (rl7) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    /* renamed from: R */
    public static /* synthetic */ void m11186R(rl7 rl7Var, ul7 ul7Var) {
        ul7Var.getClass();
        rl7Var.zzd = ul7Var;
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
                    return new nl7(null);
                }
                return new rl7();
            }
            return ls7.m16573z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m11192L() {
        return this.zze;
    }

    /* renamed from: Q */
    public final ul7 m11187Q() {
        ul7 ul7Var = this.zzd;
        return ul7Var == null ? ul7.m8028O() : ul7Var;
    }
}
