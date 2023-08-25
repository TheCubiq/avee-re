package com.daaw;
/* loaded from: classes.dex */
public final class ll7 extends ls7 implements yt7 {
    private static final ll7 zzb;
    private int zzd;
    private ul7 zze;
    private yq7 zzf = yq7.f33966q;

    static {
        ll7 ll7Var = new ll7();
        zzb = ll7Var;
        ls7.m16597C(ll7.class, ll7Var);
    }

    /* renamed from: M */
    public static kl7 m16857M() {
        return (kl7) zzb.m16592H();
    }

    /* renamed from: O */
    public static ll7 m16855O() {
        return zzb;
    }

    /* renamed from: P */
    public static ll7 m16854P(yq7 yq7Var, vr7 vr7Var) {
        return (ll7) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    /* renamed from: T */
    public static /* synthetic */ void m16850T(ll7 ll7Var, ul7 ul7Var) {
        ul7Var.getClass();
        ll7Var.zze = ul7Var;
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
                    return new kl7(null);
                }
                return new ll7();
            }
            return ls7.m16573z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m16858L() {
        return this.zzd;
    }

    /* renamed from: Q */
    public final ul7 m16853Q() {
        ul7 ul7Var = this.zze;
        return ul7Var == null ? ul7.m8028O() : ul7Var;
    }

    /* renamed from: R */
    public final yq7 m16852R() {
        return this.zzf;
    }
}
