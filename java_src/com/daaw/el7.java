package com.daaw;
/* loaded from: classes.dex */
public final class el7 extends ls7 implements yt7 {
    private static final el7 zzb;
    private int zzd;
    private int zze;
    private yq7 zzf = yq7.q;

    static {
        el7 el7Var = new el7();
        zzb = el7Var;
        ls7.C(el7.class, el7Var);
    }

    public static dl7 L() {
        return (dl7) zzb.H();
    }

    public static el7 N() {
        return zzb;
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
                    return new dl7(null);
                }
                return new el7();
            }
            return ls7.z(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final yq7 O() {
        return this.zzf;
    }

    public final int Q() {
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

    public final int R() {
        int b = il7.b(this.zze);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
