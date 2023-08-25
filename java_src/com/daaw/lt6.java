package com.daaw;
/* loaded from: classes.dex */
public final class lt6 extends ls7 implements yt7 {
    private static final lt6 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private et6 zzh;

    static {
        lt6 lt6Var = new lt6();
        zzb = lt6Var;
        ls7.C(lt6.class, lt6Var);
    }

    public static gt6 L() {
        return (gt6) zzb.H();
    }

    public static /* synthetic */ lt6 M() {
        return zzb;
    }

    public static /* synthetic */ void N(lt6 lt6Var, String str) {
        str.getClass();
        lt6Var.zzd |= 2;
        lt6Var.zzf = str;
    }

    public static /* synthetic */ void O(lt6 lt6Var, et6 et6Var) {
        et6Var.getClass();
        lt6Var.zzh = et6Var;
        lt6Var.zzd |= 8;
    }

    public static /* synthetic */ void P(lt6 lt6Var, int i) {
        lt6Var.zze = 1;
        lt6Var.zzd = 1 | lt6Var.zzd;
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
                    return new gt6(null);
                }
                return new lt6();
            }
            return ls7.z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", ht6.a, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
