package com.daaw;
/* loaded from: classes.dex */
public final class ul7 extends ls7 implements yt7 {
    private static final ul7 zzb;
    private int zzd;
    private int zze;

    static {
        ul7 ul7Var = new ul7();
        zzb = ul7Var;
        ls7.C(ul7.class, ul7Var);
    }

    public static tl7 M() {
        return (tl7) zzb.H();
    }

    public static ul7 O() {
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
                    return new tl7(null);
                }
                return new ul7();
            }
            return ls7.z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zze;
    }

    public final int Q() {
        int b = il7.b(this.zzd);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
