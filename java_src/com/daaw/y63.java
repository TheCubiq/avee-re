package com.daaw;
/* loaded from: classes.dex */
public final class y63 extends ls7 implements yt7 {
    private static final y63 zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private us7 zze = ls7.w();
    private String zzi = "";
    private String zzj = "";

    static {
        y63 y63Var = new y63();
        zzb = y63Var;
        ls7.C(y63.class, y63Var);
    }

    public static u63 L() {
        return (u63) zzb.H();
    }

    public static /* synthetic */ void N(y63 y63Var, Iterable iterable) {
        us7 us7Var = y63Var.zze;
        if (!us7Var.zzc()) {
            y63Var.zze = ls7.x(us7Var);
        }
        hq7.g(iterable, y63Var.zze);
    }

    public static /* synthetic */ void O(y63 y63Var, int i) {
        y63Var.zzd |= 1;
        y63Var.zzf = i;
    }

    public static /* synthetic */ void P(y63 y63Var, int i) {
        y63Var.zzd |= 2;
        y63Var.zzg = i;
    }

    public static /* synthetic */ void Q(y63 y63Var, long j) {
        y63Var.zzd |= 4;
        y63Var.zzh = j;
    }

    public static /* synthetic */ void R(y63 y63Var, String str) {
        str.getClass();
        y63Var.zzd |= 8;
        y63Var.zzi = str;
    }

    public static /* synthetic */ void S(y63 y63Var, String str) {
        str.getClass();
        y63Var.zzd |= 16;
        y63Var.zzj = str;
    }

    public static /* synthetic */ void T(y63 y63Var, long j) {
        y63Var.zzd |= 32;
        y63Var.zzk = j;
    }

    public static /* synthetic */ void U(y63 y63Var, int i) {
        y63Var.zzd |= 64;
        y63Var.zzl = i;
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
                    return new u63(null);
                }
                return new y63();
            }
            return ls7.z(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", t63.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
