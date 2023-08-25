package com.daaw;
/* loaded from: classes2.dex */
public final class tx5 extends ja8 implements be8 {
    private static final tx5 zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        tx5 tx5Var = new tx5();
        zza = tx5Var;
        ja8.v(tx5.class, tx5Var);
    }

    public static tx5 E() {
        return zza;
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
                    return new gt5(null);
                }
                return new tx5();
            }
            return ja8.s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", mv5.a, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final String F() {
        return this.zzg;
    }

    public final String G() {
        return this.zzi;
    }

    public final String H() {
        return this.zzh;
    }

    public final boolean I() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zzd & 1) != 0;
    }

    public final boolean K() {
        return (this.zzd & 4) != 0;
    }

    public final boolean L() {
        return (this.zzd & 2) != 0;
    }

    public final boolean M() {
        return (this.zzd & 16) != 0;
    }

    public final boolean N() {
        return (this.zzd & 8) != 0;
    }

    public final int O() {
        int a = pw5.a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
