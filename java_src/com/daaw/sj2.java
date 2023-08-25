package com.daaw;
/* loaded from: classes.dex */
public final class sj2 extends ls7 implements yt7 {
    private static final sj2 zzb;
    private int zzd;
    private us7 zze = ls7.w();
    private yq7 zzf = yq7.q;
    private int zzg = 1;
    private int zzh = 1;

    static {
        sj2 sj2Var = new sj2();
        zzb = sj2Var;
        ls7.C(sj2.class, sj2Var);
    }

    public static rj2 L() {
        return (rj2) zzb.H();
    }

    public static /* synthetic */ void N(sj2 sj2Var, yq7 yq7Var) {
        us7 us7Var = sj2Var.zze;
        if (!us7Var.zzc()) {
            sj2Var.zze = ls7.x(us7Var);
        }
        sj2Var.zze.add(yq7Var);
    }

    public static /* synthetic */ void O(sj2 sj2Var, yq7 yq7Var) {
        sj2Var.zzd |= 1;
        sj2Var.zzf = yq7Var;
    }

    public static /* synthetic */ void P(sj2 sj2Var, int i) {
        sj2Var.zzh = i - 1;
        sj2Var.zzd |= 4;
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
                    return new rj2(null);
                }
                return new sj2();
            }
            return ls7.z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", mj2.a, "zzh", kj2.a});
        }
        return (byte) 1;
    }
}
