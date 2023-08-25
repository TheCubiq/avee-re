package com.daaw;
/* loaded from: classes.dex */
public final class sj2 extends ls7 implements yt7 {
    private static final sj2 zzb;
    private int zzd;
    private us7 zze = ls7.m16576w();
    private yq7 zzf = yq7.f33966q;
    private int zzg = 1;
    private int zzh = 1;

    static {
        sj2 sj2Var = new sj2();
        zzb = sj2Var;
        ls7.m16597C(sj2.class, sj2Var);
    }

    /* renamed from: L */
    public static rj2 m10293L() {
        return (rj2) zzb.m16592H();
    }

    /* renamed from: N */
    public static /* synthetic */ void m10291N(sj2 sj2Var, yq7 yq7Var) {
        us7 us7Var = sj2Var.zze;
        if (!us7Var.zzc()) {
            sj2Var.zze = ls7.m16575x(us7Var);
        }
        sj2Var.zze.add(yq7Var);
    }

    /* renamed from: O */
    public static /* synthetic */ void m10290O(sj2 sj2Var, yq7 yq7Var) {
        sj2Var.zzd |= 1;
        sj2Var.zzf = yq7Var;
    }

    /* renamed from: P */
    public static /* synthetic */ void m10289P(sj2 sj2Var, int i) {
        sj2Var.zzh = i - 1;
        sj2Var.zzd |= 4;
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
                    return new rj2(null);
                }
                return new sj2();
            }
            return ls7.m16573z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", mj2.f18895a, "zzh", kj2.f16413a});
        }
        return (byte) 1;
    }
}
