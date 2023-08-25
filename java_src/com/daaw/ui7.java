package com.daaw;
/* loaded from: classes.dex */
public final class ui7 extends ls7 implements yt7 {
    private static final ui7 zzb;
    private xi7 zzd;
    private int zze;

    static {
        ui7 ui7Var = new ui7();
        zzb = ui7Var;
        ls7.C(ui7.class, ui7Var);
    }

    public static ti7 M() {
        return (ti7) zzb.H();
    }

    public static ui7 O() {
        return zzb;
    }

    public static ui7 P(yq7 yq7Var, vr7 vr7Var) {
        return (ui7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void R(ui7 ui7Var, xi7 xi7Var) {
        xi7Var.getClass();
        ui7Var.zzd = xi7Var;
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
                    return new ti7(null);
                }
                return new ui7();
            }
            return ls7.z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zze;
    }

    public final xi7 Q() {
        xi7 xi7Var = this.zzd;
        return xi7Var == null ? xi7.O() : xi7Var;
    }
}
