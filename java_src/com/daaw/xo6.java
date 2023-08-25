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
        ja8.m18661v(xo6.class, xo6Var);
    }

    /* renamed from: E */
    public static wn6 m4873E() {
        return (wn6) zza.m18657z();
    }

    /* renamed from: I */
    public static /* synthetic */ void m4869I(xo6 xo6Var, int i) {
        xo6Var.zzd |= 1;
        xo6Var.zze = i;
    }

    /* renamed from: J */
    public static /* synthetic */ void m4868J(xo6 xo6Var, ka7 ka7Var) {
        ka7Var.getClass();
        xo6Var.zzf = ka7Var;
        xo6Var.zzd |= 2;
    }

    /* renamed from: K */
    public static /* synthetic */ void m4867K(xo6 xo6Var, ka7 ka7Var) {
        xo6Var.zzg = ka7Var;
        xo6Var.zzd |= 4;
    }

    /* renamed from: L */
    public static /* synthetic */ void m4866L(xo6 xo6Var, boolean z) {
        xo6Var.zzd |= 8;
        xo6Var.zzh = z;
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
                    return new wn6(null);
                }
                return new xo6();
            }
            return ja8.m18664s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m4874D() {
        return this.zze;
    }

    /* renamed from: G */
    public final ka7 m4871G() {
        ka7 ka7Var = this.zzf;
        return ka7Var == null ? ka7.m17869K() : ka7Var;
    }

    /* renamed from: H */
    public final ka7 m4870H() {
        ka7 ka7Var = this.zzg;
        return ka7Var == null ? ka7.m17869K() : ka7Var;
    }

    /* renamed from: M */
    public final boolean m4865M() {
        return this.zzh;
    }

    /* renamed from: N */
    public final boolean m4864N() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: O */
    public final boolean m4863O() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: P */
    public final boolean m4862P() {
        return (this.zzd & 4) != 0;
    }
}
