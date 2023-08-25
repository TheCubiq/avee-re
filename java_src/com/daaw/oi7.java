package com.daaw;
/* loaded from: classes.dex */
public final class oi7 extends ls7 implements yt7 {
    private static final oi7 zzb;
    private ui7 zzd;
    private rl7 zze;

    static {
        oi7 oi7Var = new oi7();
        zzb = oi7Var;
        ls7.m16597C(oi7.class, oi7Var);
    }

    /* renamed from: L */
    public static ni7 m14265L() {
        return (ni7) zzb.m16592H();
    }

    /* renamed from: N */
    public static oi7 m14263N(yq7 yq7Var, vr7 vr7Var) {
        return (oi7) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m14260Q(oi7 oi7Var, ui7 ui7Var) {
        ui7Var.getClass();
        oi7Var.zzd = ui7Var;
    }

    /* renamed from: R */
    public static /* synthetic */ void m14259R(oi7 oi7Var, rl7 rl7Var) {
        rl7Var.getClass();
        oi7Var.zze = rl7Var;
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
                    return new ni7(null);
                }
                return new oi7();
            }
            return ls7.m16573z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    /* renamed from: O */
    public final ui7 m14262O() {
        ui7 ui7Var = this.zzd;
        return ui7Var == null ? ui7.m8107O() : ui7Var;
    }

    /* renamed from: P */
    public final rl7 m14261P() {
        rl7 rl7Var = this.zze;
        return rl7Var == null ? rl7.m11189O() : rl7Var;
    }
}
