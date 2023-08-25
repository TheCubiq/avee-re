package com.daaw;
/* loaded from: classes2.dex */
public final class er6 extends ja8 implements be8 {
    private static final er6 zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        er6 er6Var = new er6();
        zza = er6Var;
        ja8.v(er6.class, er6Var);
    }

    public static aq6 F() {
        return (aq6) zza.z();
    }

    public static /* synthetic */ void H(er6 er6Var, int i) {
        er6Var.zzd |= 1;
        er6Var.zze = i;
    }

    public static /* synthetic */ void I(er6 er6Var, long j) {
        er6Var.zzd |= 2;
        er6Var.zzf = j;
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
                    return new aq6(null);
                }
                return new er6();
            }
            return ja8.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int D() {
        return this.zze;
    }

    public final long E() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zzd & 2) != 0;
    }

    public final boolean K() {
        return (this.zzd & 1) != 0;
    }
}
