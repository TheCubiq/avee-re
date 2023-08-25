package com.daaw;
/* loaded from: classes.dex */
public final class ll7 extends ls7 implements yt7 {
    private static final ll7 zzb;
    private int zzd;
    private ul7 zze;
    private yq7 zzf = yq7.q;

    static {
        ll7 ll7Var = new ll7();
        zzb = ll7Var;
        ls7.C(ll7.class, ll7Var);
    }

    public static kl7 M() {
        return (kl7) zzb.H();
    }

    public static ll7 O() {
        return zzb;
    }

    public static ll7 P(yq7 yq7Var, vr7 vr7Var) {
        return (ll7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void T(ll7 ll7Var, ul7 ul7Var) {
        ul7Var.getClass();
        ll7Var.zze = ul7Var;
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
                    return new kl7(null);
                }
                return new ll7();
            }
            return ls7.z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }

    public final ul7 Q() {
        ul7 ul7Var = this.zze;
        return ul7Var == null ? ul7.O() : ul7Var;
    }

    public final yq7 R() {
        return this.zzf;
    }
}
