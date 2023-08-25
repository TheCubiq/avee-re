package com.daaw;
/* loaded from: classes.dex */
public final class pk7 extends ls7 implements yt7 {
    private static final pk7 zzb;
    private vm7 zzd;

    static {
        pk7 pk7Var = new pk7();
        zzb = pk7Var;
        ls7.C(pk7.class, pk7Var);
    }

    public static ok7 L() {
        return (ok7) zzb.H();
    }

    public static pk7 N() {
        return zzb;
    }

    public static /* synthetic */ void P(pk7 pk7Var, vm7 vm7Var) {
        vm7Var.getClass();
        pk7Var.zzd = vm7Var;
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
                    return new ok7(null);
                }
                return new pk7();
            }
            return ls7.z(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final vm7 O() {
        vm7 vm7Var = this.zzd;
        return vm7Var == null ? vm7.N() : vm7Var;
    }
}
