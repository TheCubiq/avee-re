package com.daaw;
/* loaded from: classes2.dex */
public final class e87 extends ja8 implements be8 {
    private static final e87 zza;
    private int zzd;
    private int zze = 1;
    private db8 zzf = ja8.o();

    static {
        e87 e87Var = new e87();
        zza = e87Var;
        ja8.v(e87.class, e87Var);
    }

    public static y57 D() {
        return (y57) zza.z();
    }

    public static /* synthetic */ void F(e87 e87Var, cv6 cv6Var) {
        cv6Var.getClass();
        db8 db8Var = e87Var.zzf;
        if (!db8Var.zzc()) {
            e87Var.zzf = ja8.p(db8Var);
        }
        e87Var.zzf.add(cv6Var);
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
                    return new y57(null);
                }
                return new e87();
            }
            return ja8.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", b77.a, "zzf", cv6.class});
        }
        return (byte) 1;
    }
}
