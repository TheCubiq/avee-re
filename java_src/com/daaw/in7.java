package com.daaw;
/* loaded from: classes.dex */
public final class in7 extends ls7 implements yt7 {
    private static final in7 zzb;
    private int zzd;
    private us7 zze = ls7.w();

    static {
        in7 in7Var = new in7();
        zzb = in7Var;
        ls7.C(in7.class, in7Var);
    }

    public static fn7 L() {
        return (fn7) zzb.H();
    }

    public static /* synthetic */ void O(in7 in7Var, hn7 hn7Var) {
        hn7Var.getClass();
        us7 us7Var = in7Var.zze;
        if (!us7Var.zzc()) {
            in7Var.zze = ls7.x(us7Var);
        }
        in7Var.zze.add(hn7Var);
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
                    return new fn7(null);
                }
                return new in7();
            }
            return ls7.z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", hn7.class});
        }
        return (byte) 1;
    }
}
