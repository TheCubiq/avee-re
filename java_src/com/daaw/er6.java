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
        ja8.m18661v(er6.class, er6Var);
    }

    /* renamed from: F */
    public static aq6 m23240F() {
        return (aq6) zza.m18657z();
    }

    /* renamed from: H */
    public static /* synthetic */ void m23238H(er6 er6Var, int i) {
        er6Var.zzd |= 1;
        er6Var.zze = i;
    }

    /* renamed from: I */
    public static /* synthetic */ void m23237I(er6 er6Var, long j) {
        er6Var.zzd |= 2;
        er6Var.zzf = j;
    }

    @Override // com.daaw.ja8
    /* renamed from: C */
    public final Object mo4853C(int i, Object obj, Object obj2) {
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
            return ja8.m18664s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m23242D() {
        return this.zze;
    }

    /* renamed from: E */
    public final long m23241E() {
        return this.zzf;
    }

    /* renamed from: J */
    public final boolean m23236J() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: K */
    public final boolean m23235K() {
        return (this.zzd & 1) != 0;
    }
}
