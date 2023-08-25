package com.daaw;
/* loaded from: classes.dex */
public final class j53 extends ls7 implements yt7 {
    private static final j53 zzb;
    private int zzd;
    private String zze = "";
    private us7 zzf = ls7.w();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        j53 j53Var = new j53();
        zzb = j53Var;
        ls7.C(j53.class, j53Var);
    }

    public static j53 M() {
        return zzb;
    }

    public static /* synthetic */ void N(j53 j53Var, String str) {
        str.getClass();
        j53Var.zzd |= 1;
        j53Var.zze = str;
    }

    @Override // com.daaw.ls7
    public final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                ps7 ps7Var = s53.a;
                return ls7.z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzd", "zze", "zzf", a53.class, "zzg", ps7Var, "zzh", ps7Var, "zzi", ps7Var});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new d53(null);
            } else {
                return new j53();
            }
        }
        return (byte) 1;
    }
}
