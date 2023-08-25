package com.daaw;
/* loaded from: classes.dex */
public final class k73 extends ls7 implements yt7 {
    private static final k73 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        k73 k73Var = new k73();
        zzb = k73Var;
        ls7.C(k73.class, k73Var);
    }

    public static j73 L() {
        return (j73) zzb.H();
    }

    public static /* synthetic */ void N(k73 k73Var, int i) {
        k73Var.zzd |= 1;
        k73Var.zze = i;
    }

    public static /* synthetic */ void O(k73 k73Var, int i) {
        k73Var.zzd |= 2;
        k73Var.zzf = i;
    }

    public static /* synthetic */ void P(k73 k73Var, int i) {
        k73Var.zzd |= 4;
        k73Var.zzg = i;
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
                    return new j73(null);
                }
                return new k73();
            }
            return ls7.z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
