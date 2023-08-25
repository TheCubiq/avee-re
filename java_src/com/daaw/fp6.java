package com.daaw;
/* loaded from: classes.dex */
public final class fp6 extends ls7 implements yt7 {
    private static final fp6 zzb;
    private bp6 zzd;

    static {
        fp6 fp6Var = new fp6();
        zzb = fp6Var;
        ls7.C(fp6.class, fp6Var);
    }

    public static ep6 L() {
        return (ep6) zzb.H();
    }

    public static /* synthetic */ fp6 M() {
        return zzb;
    }

    public static /* synthetic */ void N(fp6 fp6Var, bp6 bp6Var) {
        bp6Var.getClass();
        fp6Var.zzd = bp6Var;
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
                    return new ep6(null);
                }
                return new fp6();
            }
            return ls7.z(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
