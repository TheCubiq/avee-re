package com.daaw;
/* loaded from: classes2.dex */
public final class a06 extends ja8 implements be8 {
    private static final a06 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private ds5 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        a06 a06Var = new a06();
        zza = a06Var;
        ja8.v(a06.class, a06Var);
    }

    public static wy5 F() {
        return (wy5) zza.z();
    }

    public static /* synthetic */ void I(a06 a06Var, String str) {
        a06Var.zzd |= 2;
        a06Var.zzf = str;
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
                    return new wy5(null);
                }
                return new a06();
            }
            return ja8.s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final int D() {
        return this.zze;
    }

    public final ds5 E() {
        ds5 ds5Var = this.zzg;
        return ds5Var == null ? ds5.E() : ds5Var;
    }

    public final String H() {
        return this.zzf;
    }

    public final boolean J() {
        return this.zzh;
    }

    public final boolean K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzj;
    }

    public final boolean M() {
        return (this.zzd & 1) != 0;
    }

    public final boolean N() {
        return (this.zzd & 32) != 0;
    }
}
