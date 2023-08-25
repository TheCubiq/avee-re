package com.daaw;
/* loaded from: classes.dex */
public final class gp6 extends ls7 implements yt7 {
    private static final gp6 zzb;
    private us7 zzd = ls7.w();

    static {
        gp6 gp6Var = new gp6();
        zzb = gp6Var;
        ls7.C(gp6.class, gp6Var);
    }

    public static dp6 M() {
        return (dp6) zzb.H();
    }

    public static /* synthetic */ gp6 N() {
        return zzb;
    }

    public static /* synthetic */ void O(gp6 gp6Var) {
        gp6Var.zzd = ls7.w();
    }

    public static /* synthetic */ void P(gp6 gp6Var, fp6 fp6Var) {
        fp6Var.getClass();
        us7 us7Var = gp6Var.zzd;
        if (!us7Var.zzc()) {
            gp6Var.zzd = ls7.x(us7Var);
        }
        gp6Var.zzd.add(fp6Var);
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
                    return new dp6(null);
                }
                return new gp6();
            }
            return ls7.z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", fp6.class});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzd.size();
    }
}
