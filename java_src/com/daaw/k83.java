package com.daaw;
/* loaded from: classes.dex */
public final class k83 extends ls7 implements yt7 {
    private static final k83 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        k83 k83Var = new k83();
        zzb = k83Var;
        ls7.C(k83.class, k83Var);
    }

    public static j83 L() {
        return (j83) zzb.H();
    }

    public static /* synthetic */ void N(k83 k83Var, boolean z) {
        k83Var.zzd |= 1;
        k83Var.zze = z;
    }

    public static /* synthetic */ void O(k83 k83Var, int i) {
        k83Var.zzd |= 2;
        k83Var.zzf = i;
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
                    return new j83(null);
                }
                return new k83();
            }
            return ls7.z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final boolean P() {
        return this.zze;
    }
}
