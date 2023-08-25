package com.daaw;
/* loaded from: classes.dex */
public final class el7 extends ls7 implements yt7 {
    private static final el7 zzb;
    private int zzd;
    private int zze;
    private yq7 zzf = yq7.f33966q;

    static {
        el7 el7Var = new el7();
        zzb = el7Var;
        ls7.m16597C(el7.class, el7Var);
    }

    /* renamed from: L */
    public static dl7 m23390L() {
        return (dl7) zzb.m16592H();
    }

    /* renamed from: N */
    public static el7 m23388N() {
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
                    return new dl7(null);
                }
                return new el7();
            }
            return ls7.m16573z(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: O */
    public final yq7 m23387O() {
        return this.zzf;
    }

    /* renamed from: Q */
    public final int m23385Q() {
        int i = this.zzd;
        int i2 = 5;
        if (i == 0) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 4;
        } else if (i != 3) {
            i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* renamed from: R */
    public final int m23384R() {
        int m19656b = il7.m19656b(this.zze);
        if (m19656b == 0) {
            return 1;
        }
        return m19656b;
    }
}
