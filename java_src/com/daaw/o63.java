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
        ls7.m16597C(o63.class, o63Var);
    }

    /* renamed from: L */
    public static c63 m14529L() {
        return (c63) zzb.m16592H();
    }

    /* renamed from: N */
    public static o63 m14527N() {
        return zzb;
    }

    /* renamed from: S */
    public static /* synthetic */ void m14522S(o63 o63Var, int i) {
        o63Var.zze = i - 1;
        o63Var.zzd |= 1;
    }

    /* renamed from: T */
    public static /* synthetic */ void m14521T(o63 o63Var, int i) {
        o63Var.zzf = i - 1;
        o63Var.zzd |= 2;
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
                    return new c63(null);
                }
                return new o63();
            }
            return ls7.m16573z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", h63.f12096a, "zzf", e63.f8195a});
        }
        return (byte) 1;
    }

    /* renamed from: O */
    public final boolean m14526O() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: P */
    public final boolean m14525P() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: Q */
    public final int m14524Q() {
        int m22885a = f63.m22885a(this.zzf);
        if (m22885a == 0) {
            return 1;
        }
        return m22885a;
    }

    /* renamed from: R */
    public final int m14523R() {
        int m20048a = i63.m20048a(this.zze);
        if (m20048a == 0) {
            return 1;
        }
        return m20048a;
    }
}
