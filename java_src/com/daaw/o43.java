package com.daaw;
/* loaded from: classes.dex */
public final class o43 extends ls7 implements yt7 {
    private static final o43 zzb;
    private int zzd;
    private int zze;
    private s43 zzf;
    private u43 zzg;

    static {
        o43 o43Var = new o43();
        zzb = o43Var;
        ls7.C(o43.class, o43Var);
    }

    public static n43 L() {
        return (n43) zzb.H();
    }

    public static /* synthetic */ void N(o43 o43Var, s43 s43Var) {
        s43Var.getClass();
        o43Var.zzf = s43Var;
        o43Var.zzd |= 2;
    }

    public static /* synthetic */ void O(o43 o43Var, u43 u43Var) {
        u43Var.getClass();
        o43Var.zzg = u43Var;
        o43Var.zzd |= 4;
    }

    public static /* synthetic */ void P(o43 o43Var, int i) {
        o43Var.zze = 1;
        o43Var.zzd = 1 | o43Var.zzd;
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
                    return new n43(null);
                }
                return new o43();
            }
            return ls7.z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", q43.a, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
