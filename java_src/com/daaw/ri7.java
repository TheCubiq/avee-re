package com.daaw;
/* loaded from: classes.dex */
public final class ri7 extends ls7 implements yt7 {
    private static final ri7 zzb;
    private int zzd;
    private xi7 zze;
    private yq7 zzf = yq7.f33966q;

    static {
        ri7 ri7Var = new ri7();
        zzb = ri7Var;
        ls7.m16597C(ri7.class, ri7Var);
    }

    /* renamed from: M */
    public static qi7 m11283M() {
        return (qi7) zzb.m16592H();
    }

    /* renamed from: O */
    public static ri7 m11281O() {
        return zzb;
    }

    /* renamed from: P */
    public static ri7 m11280P(yq7 yq7Var, vr7 vr7Var) {
        return (ri7) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    /* renamed from: T */
    public static /* synthetic */ void m11276T(ri7 ri7Var, xi7 xi7Var) {
        xi7Var.getClass();
        ri7Var.zze = xi7Var;
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
                    return new qi7(null);
                }
                return new ri7();
            }
            return ls7.m16573z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m11284L() {
        return this.zzd;
    }

    /* renamed from: Q */
    public final xi7 m11279Q() {
        xi7 xi7Var = this.zze;
        return xi7Var == null ? xi7.m5058O() : xi7Var;
    }

    /* renamed from: R */
    public final yq7 m11278R() {
        return this.zzf;
    }
}
