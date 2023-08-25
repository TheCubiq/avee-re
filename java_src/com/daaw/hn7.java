package com.daaw;
/* loaded from: classes.dex */
public final class hn7 extends ls7 implements yt7 {
    private static final hn7 zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        hn7 hn7Var = new hn7();
        zzb = hn7Var;
        ls7.C(hn7.class, hn7Var);
    }

    public static gn7 L() {
        return (gn7) zzb.H();
    }

    public static /* synthetic */ void N(hn7 hn7Var, String str) {
        str.getClass();
        hn7Var.zzd = str;
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
                    return new gn7(null);
                }
                return new hn7();
            }
            return ls7.z(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
