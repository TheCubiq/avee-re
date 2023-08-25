package com.daaw;
/* loaded from: classes.dex */
public final class cn7 extends ls7 implements yt7 {
    private static final cn7 zzb;
    private nm7 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        cn7 cn7Var = new cn7();
        zzb = cn7Var;
        ls7.C(cn7.class, cn7Var);
    }

    public static bn7 N() {
        return (bn7) zzb.H();
    }

    public static /* synthetic */ void Q(cn7 cn7Var, nm7 nm7Var) {
        nm7Var.getClass();
        cn7Var.zzd = nm7Var;
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
                    return new bn7(null);
                }
                return new cn7();
            }
            return ls7.z(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzf;
    }

    public final nm7 M() {
        nm7 nm7Var = this.zzd;
        return nm7Var == null ? nm7.O() : nm7Var;
    }

    public final zn7 P() {
        zn7 a = zn7.a(this.zzg);
        return a == null ? zn7.UNRECOGNIZED : a;
    }

    public final boolean T() {
        return this.zzd != null;
    }

    public final int U() {
        int i = this.zze;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
