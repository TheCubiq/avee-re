package com.daaw;
/* loaded from: classes.dex */
public final class ul7 extends ls7 implements yt7 {
    private static final ul7 zzb;
    private int zzd;
    private int zze;

    static {
        ul7 ul7Var = new ul7();
        zzb = ul7Var;
        ls7.m16597C(ul7.class, ul7Var);
    }

    /* renamed from: M */
    public static tl7 m8030M() {
        return (tl7) zzb.m16592H();
    }

    /* renamed from: O */
    public static ul7 m8028O() {
        return zzb;
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
                    return new tl7(null);
                }
                return new ul7();
            }
            return ls7.m16573z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m8031L() {
        return this.zze;
    }

    /* renamed from: Q */
    public final int m8026Q() {
        int m19656b = il7.m19656b(this.zzd);
        if (m19656b == 0) {
            return 1;
        }
        return m19656b;
    }
}
