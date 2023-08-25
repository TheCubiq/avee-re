package com.daaw;
/* loaded from: classes.dex */
public final class oj2 extends ls7 implements yt7 {
    private static final oj2 zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private yq7 zzg = yq7.f33966q;

    static {
        oj2 oj2Var = new oj2();
        zzb = oj2Var;
        ls7.m16597C(oj2.class, oj2Var);
    }

    /* renamed from: N */
    public static oj2 m14252N() {
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
                    return new nj2(null);
                }
                return new oj2();
            }
            return ls7.m16573z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final long m14254L() {
        return this.zze;
    }

    /* renamed from: O */
    public final boolean m14251O() {
        return (this.zzd & 1) != 0;
    }
}
