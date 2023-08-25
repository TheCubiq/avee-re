package com.daaw;
/* loaded from: classes.dex */
public final class et6 extends ls7 implements yt7 {
    private static final rs7 zzb = new bt6();
    private static final et6 zzd;
    private int zze;
    private qs7 zzf = ls7.t();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        et6 et6Var = new et6();
        zzd = et6Var;
        ls7.C(et6.class, et6Var);
    }

    public static dt6 L() {
        return (dt6) zzd.H();
    }

    public static /* synthetic */ void N(et6 et6Var, String str) {
        str.getClass();
        et6Var.zze |= 1;
        et6Var.zzg = str;
    }

    public static /* synthetic */ void O(et6 et6Var, int i) {
        qs7 qs7Var = et6Var.zzf;
        if (!qs7Var.zzc()) {
            et6Var.zzf = ls7.u(qs7Var);
        }
        et6Var.zzf.i(2);
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
                        return zzd;
                    }
                    return new dt6(null);
                }
                return new et6();
            }
            return ls7.z(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", ct6.a, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
