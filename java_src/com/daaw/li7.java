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
        ls7.m16597C(li7.class, li7Var);
    }

    /* renamed from: M */
    public static ki7 m16939M() {
        return (ki7) zzb.m16592H();
    }

    /* renamed from: O */
    public static li7 m16937O(yq7 yq7Var, vr7 vr7Var) {
        return (li7) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    /* renamed from: S */
    public static /* synthetic */ void m16933S(li7 li7Var, ri7 ri7Var) {
        ri7Var.getClass();
        li7Var.zze = ri7Var;
    }

    /* renamed from: T */
    public static /* synthetic */ void m16932T(li7 li7Var, ll7 ll7Var) {
        ll7Var.getClass();
        li7Var.zzf = ll7Var;
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
                    return new ki7(null);
                }
                return new li7();
            }
            return ls7.m16573z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m16940L() {
        return this.zzd;
    }

    /* renamed from: P */
    public final ri7 m16936P() {
        ri7 ri7Var = this.zze;
        return ri7Var == null ? ri7.m11281O() : ri7Var;
    }

    /* renamed from: Q */
    public final ll7 m16935Q() {
        ll7 ll7Var = this.zzf;
        return ll7Var == null ? ll7.m16855O() : ll7Var;
    }
}
