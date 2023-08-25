package com.daaw;
/* loaded from: classes.dex */
public final class xo2 extends ls7 implements yt7 {
    private static final xo2 zzb;
    private int zzd;
    private ap2 zze;
    private yq7 zzf;
    private yq7 zzg;

    static {
        xo2 xo2Var = new xo2();
        zzb = xo2Var;
        ls7.C(xo2.class, xo2Var);
    }

    public xo2() {
        yq7 yq7Var = yq7.q;
        this.zzf = yq7Var;
        this.zzg = yq7Var;
    }

    public static xo2 M(yq7 yq7Var, vr7 vr7Var) {
        return (xo2) ls7.q(zzb, yq7Var, vr7Var);
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
                    return new wo2(null);
                }
                return new xo2();
            }
            return ls7.z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final ap2 N() {
        ap2 ap2Var = this.zze;
        return ap2Var == null ? ap2.Q() : ap2Var;
    }

    public final yq7 O() {
        return this.zzg;
    }

    public final yq7 P() {
        return this.zzf;
    }
}
