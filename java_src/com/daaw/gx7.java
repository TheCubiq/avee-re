package com.daaw;
/* loaded from: classes.dex */
public final class gx7 extends ls7 implements yt7 {
    private static final gx7 zzb;
    private int zzd;
    private String zze = "";

    static {
        gx7 gx7Var = new gx7();
        zzb = gx7Var;
        ls7.C(gx7.class, gx7Var);
    }

    public static fx7 L() {
        return (fx7) zzb.H();
    }

    public static /* synthetic */ void N(gx7 gx7Var, String str) {
        gx7Var.zzd |= 1;
        gx7Var.zze = str;
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
                    return new fx7(null);
                }
                return new gx7();
            }
            return ls7.z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
