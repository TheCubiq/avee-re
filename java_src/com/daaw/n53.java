package com.daaw;
/* loaded from: classes.dex */
public final class n53 extends ls7 implements yt7 {
    private static final n53 zzb;
    private int zzd;
    private i73 zzf;
    private int zzg;
    private k73 zzh;
    private int zzi;
    private String zze = "";
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        n53 n53Var = new n53();
        zzb = n53Var;
        ls7.C(n53.class, n53Var);
    }

    public static n53 M() {
        return zzb;
    }

    public static /* synthetic */ void N(n53 n53Var, String str) {
        n53Var.zzd |= 1;
        n53Var.zze = str;
    }

    public static /* synthetic */ void O(n53 n53Var, k73 k73Var) {
        k73Var.getClass();
        n53Var.zzh = k73Var;
        n53Var.zzd |= 8;
    }

    @Override // com.daaw.ls7
    public final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                ps7 ps7Var = s53.a;
                return ls7.z(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", ps7Var, "zzk", ps7Var, "zzl", ps7Var});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new m53(null);
            } else {
                return new n53();
            }
        }
        return (byte) 1;
    }
}
