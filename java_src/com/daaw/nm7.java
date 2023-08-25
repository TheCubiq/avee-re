package com.daaw;
/* loaded from: classes.dex */
public final class nm7 extends ls7 implements yt7 {
    private static final nm7 zzb;
    private String zzd = "";
    private yq7 zze = yq7.q;
    private int zzf;

    static {
        nm7 nm7Var = new nm7();
        zzb = nm7Var;
        ls7.C(nm7.class, nm7Var);
    }

    public static km7 L() {
        return (km7) zzb.H();
    }

    public static nm7 O() {
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
                    return new km7(null);
                }
                return new nm7();
            }
            return ls7.z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final mm7 M() {
        mm7 a = mm7.a(this.zzf);
        return a == null ? mm7.UNRECOGNIZED : a;
    }

    public final yq7 P() {
        return this.zze;
    }

    public final String Q() {
        return this.zzd;
    }
}
