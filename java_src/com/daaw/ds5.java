package com.daaw;
/* loaded from: classes2.dex */
public final class ds5 extends ja8 implements be8 {
    private static final ds5 zza;
    private int zzd;
    private q56 zze;
    private tx5 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        ds5 ds5Var = new ds5();
        zza = ds5Var;
        ja8.v(ds5.class, ds5Var);
    }

    public static ds5 E() {
        return zza;
    }

    public static /* synthetic */ void I(ds5 ds5Var, String str) {
        ds5Var.zzd |= 8;
        ds5Var.zzh = str;
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
                    return new ar5(null);
                }
                return new ds5();
            }
            return ja8.s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final tx5 F() {
        tx5 tx5Var = this.zzf;
        return tx5Var == null ? tx5.E() : tx5Var;
    }

    public final q56 G() {
        q56 q56Var = this.zze;
        return q56Var == null ? q56.F() : q56Var;
    }

    public final String H() {
        return this.zzh;
    }

    public final boolean J() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zzd & 4) != 0;
    }

    public final boolean L() {
        return (this.zzd & 2) != 0;
    }

    public final boolean M() {
        return (this.zzd & 8) != 0;
    }

    public final boolean N() {
        return (this.zzd & 1) != 0;
    }
}
