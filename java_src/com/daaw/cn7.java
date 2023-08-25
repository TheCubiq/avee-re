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
        ls7.m16597C(cn7.class, cn7Var);
    }

    /* renamed from: N */
    public static bn7 m25203N() {
        return (bn7) zzb.m16592H();
    }

    /* renamed from: Q */
    public static /* synthetic */ void m25200Q(cn7 cn7Var, nm7 nm7Var) {
        nm7Var.getClass();
        cn7Var.zzd = nm7Var;
    }

    @Override // com.daaw.ls7
    /* renamed from: I */
    public final Object mo1768I(int i, Object obj, Object obj2) {
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
            return ls7.m16573z(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m25205L() {
        return this.zzf;
    }

    /* renamed from: M */
    public final nm7 m25204M() {
        nm7 nm7Var = this.zzd;
        return nm7Var == null ? nm7.m15031O() : nm7Var;
    }

    /* renamed from: P */
    public final zn7 m25201P() {
        zn7 m2096a = zn7.m2096a(this.zzg);
        return m2096a == null ? zn7.UNRECOGNIZED : m2096a;
    }

    /* renamed from: T */
    public final boolean m25197T() {
        return this.zzd != null;
    }

    /* renamed from: U */
    public final int m25196U() {
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
