package com.daaw;
/* loaded from: classes2.dex */
public final class we7 extends ja8 implements be8 {
    private static final we7 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        we7 we7Var = new we7();
        zza = we7Var;
        ja8.v(we7.class, we7Var);
    }

    public static td7 G() {
        return (td7) zza.z();
    }

    public static /* synthetic */ void K(we7 we7Var, long j) {
        we7Var.zzd |= 1;
        we7Var.zze = j;
    }

    public static /* synthetic */ void L(we7 we7Var, String str) {
        str.getClass();
        we7Var.zzd |= 2;
        we7Var.zzf = str;
    }

    public static /* synthetic */ void M(we7 we7Var, String str) {
        str.getClass();
        we7Var.zzd |= 4;
        we7Var.zzg = str;
    }

    public static /* synthetic */ void N(we7 we7Var) {
        we7Var.zzd &= -5;
        we7Var.zzg = zza.zzg;
    }

    public static /* synthetic */ void O(we7 we7Var, long j) {
        we7Var.zzd |= 8;
        we7Var.zzh = j;
    }

    public static /* synthetic */ void P(we7 we7Var) {
        we7Var.zzd &= -9;
        we7Var.zzh = 0L;
    }

    public static /* synthetic */ void Q(we7 we7Var, double d) {
        we7Var.zzd |= 32;
        we7Var.zzj = d;
    }

    public static /* synthetic */ void R(we7 we7Var) {
        we7Var.zzd &= -33;
        we7Var.zzj = 0.0d;
    }

    @Override // com.daaw.ja8
    public final Object C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new td7(null);
                }
                return new we7();
            }
            return ja8.s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final double D() {
        return this.zzj;
    }

    public final long E() {
        return this.zzh;
    }

    public final long F() {
        return this.zze;
    }

    public final String I() {
        return this.zzf;
    }

    public final String J() {
        return this.zzg;
    }

    public final boolean S() {
        return (this.zzd & 32) != 0;
    }

    public final boolean T() {
        return (this.zzd & 8) != 0;
    }

    public final boolean U() {
        return (this.zzd & 1) != 0;
    }

    public final boolean V() {
        return (this.zzd & 4) != 0;
    }
}
