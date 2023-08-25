package com.daaw;
/* loaded from: classes.dex */
public final class oj2 extends ls7 implements yt7 {
    private static final oj2 zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private yq7 zzg = yq7.q;

    static {
        oj2 oj2Var = new oj2();
        zzb = oj2Var;
        ls7.C(oj2.class, oj2Var);
    }

    public static oj2 N() {
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
                    return new nj2(null);
                }
                return new oj2();
            }
            return ls7.z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final long L() {
        return this.zze;
    }

    public final boolean O() {
        return (this.zzd & 1) != 0;
    }
}
