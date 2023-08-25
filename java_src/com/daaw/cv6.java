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
        ja8.v(cv6.class, cv6Var);
    }

    public static gu6 D() {
        return (gu6) zza.z();
    }

    public static /* synthetic */ void F(cv6 cv6Var, String str) {
        str.getClass();
        cv6Var.zzd |= 1;
        cv6Var.zze = str;
    }

    public static /* synthetic */ void G(cv6 cv6Var, long j) {
        cv6Var.zzd |= 2;
        cv6Var.zzf = j;
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
                    return new gu6(null);
                }
                return new cv6();
            }
            return ja8.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
