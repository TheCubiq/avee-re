package com.daaw;
/* loaded from: classes.dex */
public final class u43 extends ls7 implements yt7 {
    private static final u43 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        u43 u43Var = new u43();
        zzb = u43Var;
        ls7.C(u43.class, u43Var);
    }

    public static t43 L() {
        return (t43) zzb.H();
    }

    public static /* synthetic */ void N(u43 u43Var, boolean z) {
        u43Var.zzd |= 1;
        u43Var.zze = z;
    }

    public static /* synthetic */ void O(u43 u43Var, boolean z) {
        u43Var.zzd |= 2;
        u43Var.zzf = z;
    }

    public static /* synthetic */ void P(u43 u43Var, int i) {
        u43Var.zzd |= 4;
        u43Var.zzg = i;
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
                    return new t43(null);
                }
                return new u43();
            }
            return ls7.z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
