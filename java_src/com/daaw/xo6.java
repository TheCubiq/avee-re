package com.daaw;
/* loaded from: classes2.dex */
public final class xo6 extends ja8 implements be8 {
    private static final xo6 zza;
    private int zzd;
    private int zze;
    private ka7 zzf;
    private ka7 zzg;
    private boolean zzh;

    static {
        xo6 xo6Var = new xo6();
        zza = xo6Var;
        ja8.v(xo6.class, xo6Var);
    }

    public static wn6 E() {
        return (wn6) zza.z();
    }

    public static /* synthetic */ void I(xo6 xo6Var, int i) {
        xo6Var.zzd |= 1;
        xo6Var.zze = i;
    }

    public static /* synthetic */ void J(xo6 xo6Var, ka7 ka7Var) {
        ka7Var.getClass();
        xo6Var.zzf = ka7Var;
        xo6Var.zzd |= 2;
    }

    public static /* synthetic */ void K(xo6 xo6Var, ka7 ka7Var) {
        xo6Var.zzg = ka7Var;
        xo6Var.zzd |= 4;
    }

    public static /* synthetic */ void L(xo6 xo6Var, boolean z) {
        xo6Var.zzd |= 8;
        xo6Var.zzh = z;
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
                    return new wn6(null);
                }
                return new xo6();
            }
            return ja8.s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int D() {
        return this.zze;
    }

    public final ka7 G() {
        ka7 ka7Var = this.zzf;
        return ka7Var == null ? ka7.K() : ka7Var;
    }

    public final ka7 H() {
        ka7 ka7Var = this.zzg;
        return ka7Var == null ? ka7.K() : ka7Var;
    }

    public final boolean M() {
        return this.zzh;
    }

    public final boolean N() {
        return (this.zzd & 1) != 0;
    }

    public final boolean O() {
        return (this.zzd & 8) != 0;
    }

    public final boolean P() {
        return (this.zzd & 4) != 0;
    }
}
