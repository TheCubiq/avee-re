package com.daaw;
/* loaded from: classes.dex */
public final class o63 extends ls7 implements yt7 {
    private static final o63 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        o63 o63Var = new o63();
        zzb = o63Var;
        ls7.C(o63.class, o63Var);
    }

    public static c63 L() {
        return (c63) zzb.H();
    }

    public static o63 N() {
        return zzb;
    }

    public static /* synthetic */ void S(o63 o63Var, int i) {
        o63Var.zze = i - 1;
        o63Var.zzd |= 1;
    }

    public static /* synthetic */ void T(o63 o63Var, int i) {
        o63Var.zzf = i - 1;
        o63Var.zzd |= 2;
    }

    @Override // com.daaw.ls7
    public final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new c63(null);
                }
                return new o63();
            }
            return ls7.z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", h63.a, "zzf", e63.a});
        }
        return (byte) 1;
    }

    public final boolean O() {
        return (this.zzd & 2) != 0;
    }

    public final boolean P() {
        return (this.zzd & 1) != 0;
    }

    public final int Q() {
        int a = f63.a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final int R() {
        int a = i63.a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
