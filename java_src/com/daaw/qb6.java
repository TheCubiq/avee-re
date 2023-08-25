package com.daaw;
/* loaded from: classes2.dex */
public final class qb6 extends ja8 implements be8 {
    private static final qb6 zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        qb6 qb6Var = new qb6();
        zza = qb6Var;
        ja8.m18661v(qb6.class, qb6Var);
    }

    /* renamed from: G */
    public static /* synthetic */ void m12636G(qb6 qb6Var, String str) {
        str.getClass();
        qb6Var.zzd |= 1;
        qb6Var.zze = str;
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
                    return new na6(null);
                }
                return new qb6();
            }
            return ja8.m18664s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m12639D() {
        return this.zzh;
    }

    /* renamed from: F */
    public final String m12637F() {
        return this.zze;
    }

    /* renamed from: H */
    public final boolean m12635H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean m12634I() {
        return this.zzg;
    }

    /* renamed from: J */
    public final boolean m12633J() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: K */
    public final boolean m12632K() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: L */
    public final boolean m12631L() {
        return (this.zzd & 8) != 0;
    }
}
