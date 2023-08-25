package com.daaw;
/* loaded from: classes.dex */
public final class zh7 extends ls7 implements yt7 {
    private static final zh7 zzb;
    private int zzd;
    private yq7 zze = yq7.q;
    private ii7 zzf;

    static {
        zh7 zh7Var = new zh7();
        zzb = zh7Var;
        ls7.C(zh7.class, zh7Var);
    }

    public static yh7 M() {
        return (yh7) zzb.H();
    }

    public static zh7 O(yq7 yq7Var, vr7 vr7Var) {
        return (zh7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void T(zh7 zh7Var, ii7 ii7Var) {
        ii7Var.getClass();
        zh7Var.zzf = ii7Var;
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
                    return new yh7(null);
                }
                return new zh7();
            }
            return ls7.z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }

    public final ii7 P() {
        ii7 ii7Var = this.zzf;
        return ii7Var == null ? ii7.O() : ii7Var;
    }

    public final yq7 Q() {
        return this.zze;
    }
}
