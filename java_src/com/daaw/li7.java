package com.daaw;
/* loaded from: classes.dex */
public final class li7 extends ls7 implements yt7 {
    private static final li7 zzb;
    private int zzd;
    private ri7 zze;
    private ll7 zzf;

    static {
        li7 li7Var = new li7();
        zzb = li7Var;
        ls7.C(li7.class, li7Var);
    }

    public static ki7 M() {
        return (ki7) zzb.H();
    }

    public static li7 O(yq7 yq7Var, vr7 vr7Var) {
        return (li7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void S(li7 li7Var, ri7 ri7Var) {
        ri7Var.getClass();
        li7Var.zze = ri7Var;
    }

    public static /* synthetic */ void T(li7 li7Var, ll7 ll7Var) {
        ll7Var.getClass();
        li7Var.zzf = ll7Var;
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
                    return new ki7(null);
                }
                return new li7();
            }
            return ls7.z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd;
    }

    public final ri7 P() {
        ri7 ri7Var = this.zze;
        return ri7Var == null ? ri7.O() : ri7Var;
    }

    public final ll7 Q() {
        ll7 ll7Var = this.zzf;
        return ll7Var == null ? ll7.O() : ll7Var;
    }
}
