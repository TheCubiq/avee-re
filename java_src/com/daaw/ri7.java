package com.daaw;
/* loaded from: classes.dex */
public final class ri7 extends ls7 implements yt7 {
    private static final ri7 zzb;
    private int zzd;
    private xi7 zze;
    private yq7 zzf = yq7.q;

    static {
        ri7 ri7Var = new ri7();
        zzb = ri7Var;
        ls7.C(ri7.class, ri7Var);
    }

    public static qi7 M() {
        return (qi7) zzb.H();
    }

    public static ri7 O() {
        return zzb;
    }

    public static ri7 P(yq7 yq7Var, vr7 vr7Var) {
        return (ri7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void T(ri7 ri7Var, xi7 xi7Var) {
        xi7Var.getClass();
        ri7Var.zze = xi7Var;
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
                    return new qi7(null);
                }
                return new ri7();
            }
            return ls7.z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }

    public final xi7 Q() {
        xi7 xi7Var = this.zze;
        return xi7Var == null ? xi7.O() : xi7Var;
    }

    public final yq7 R() {
        return this.zzf;
    }
}
