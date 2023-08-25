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
        ja8.m18661v(we7.class, we7Var);
    }

    /* renamed from: G */
    public static td7 m6125G() {
        return (td7) zza.m18657z();
    }

    /* renamed from: K */
    public static /* synthetic */ void m6121K(we7 we7Var, long j) {
        we7Var.zzd |= 1;
        we7Var.zze = j;
    }

    /* renamed from: L */
    public static /* synthetic */ void m6120L(we7 we7Var, String str) {
        str.getClass();
        we7Var.zzd |= 2;
        we7Var.zzf = str;
    }

    /* renamed from: M */
    public static /* synthetic */ void m6119M(we7 we7Var, String str) {
        str.getClass();
        we7Var.zzd |= 4;
        we7Var.zzg = str;
    }

    /* renamed from: N */
    public static /* synthetic */ void m6118N(we7 we7Var) {
        we7Var.zzd &= -5;
        we7Var.zzg = zza.zzg;
    }

    /* renamed from: O */
    public static /* synthetic */ void m6117O(we7 we7Var, long j) {
        we7Var.zzd |= 8;
        we7Var.zzh = j;
    }

    /* renamed from: P */
    public static /* synthetic */ void m6116P(we7 we7Var) {
        we7Var.zzd &= -9;
        we7Var.zzh = 0L;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m6115Q(we7 we7Var, double d) {
        we7Var.zzd |= 32;
        we7Var.zzj = d;
    }

    /* renamed from: R */
    public static /* synthetic */ void m6114R(we7 we7Var) {
        we7Var.zzd &= -33;
        we7Var.zzj = 0.0d;
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
                    return new td7(null);
                }
                return new we7();
            }
            return ja8.m18664s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final double m6128D() {
        return this.zzj;
    }

    /* renamed from: E */
    public final long m6127E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final long m6126F() {
        return this.zze;
    }

    /* renamed from: I */
    public final String m6123I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final String m6122J() {
        return this.zzg;
    }

    /* renamed from: S */
    public final boolean m6113S() {
        return (this.zzd & 32) != 0;
    }

    /* renamed from: T */
    public final boolean m6112T() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: U */
    public final boolean m6111U() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: V */
    public final boolean m6110V() {
        return (this.zzd & 4) != 0;
    }
}
