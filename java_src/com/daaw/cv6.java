package com.daaw;
/* loaded from: classes2.dex */
public final class cv6 extends ja8 implements be8 {
    private static final cv6 zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        cv6 cv6Var = new cv6();
        zza = cv6Var;
        ja8.m18661v(cv6.class, cv6Var);
    }

    /* renamed from: D */
    public static gu6 m24965D() {
        return (gu6) zza.m18657z();
    }

    /* renamed from: F */
    public static /* synthetic */ void m24963F(cv6 cv6Var, String str) {
        str.getClass();
        cv6Var.zzd |= 1;
        cv6Var.zze = str;
    }

    /* renamed from: G */
    public static /* synthetic */ void m24962G(cv6 cv6Var, long j) {
        cv6Var.zzd |= 2;
        cv6Var.zzf = j;
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
                    return new gu6(null);
                }
                return new cv6();
            }
            return ja8.m18664s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
