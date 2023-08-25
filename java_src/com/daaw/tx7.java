package com.daaw;
/* loaded from: classes.dex */
public final class tx7 extends ls7 implements yt7 {
    private static final tx7 zzb;
    private int zzd;
    private yq7 zze;
    private yq7 zzf;
    private yq7 zzg;

    static {
        tx7 tx7Var = new tx7();
        zzb = tx7Var;
        ls7.m16597C(tx7.class, tx7Var);
    }

    public tx7() {
        yq7 yq7Var = yq7.f33966q;
        this.zze = yq7Var;
        this.zzf = yq7Var;
        this.zzg = yq7Var;
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
                    return new sx7(null);
                }
                return new tx7();
            }
            return ls7.m16573z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
