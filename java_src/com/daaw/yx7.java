package com.daaw;
/* loaded from: classes.dex */
public final class yx7 extends ls7 implements yt7 {
    private static final yx7 zzb;
    private int zzd;
    private xx7 zze;
    private yq7 zzg;
    private yq7 zzh;
    private int zzi;
    private yq7 zzj;
    private byte zzk = 2;
    private us7 zzf = ls7.m16576w();

    static {
        yx7 yx7Var = new yx7();
        zzb = yx7Var;
        ls7.m16597C(yx7.class, yx7Var);
    }

    public yx7() {
        yq7 yq7Var = yq7.f33966q;
        this.zzg = yq7Var;
        this.zzh = yq7Var;
        this.zzj = yq7Var;
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
                            this.zzk = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new vx7(null);
                }
                return new yx7();
            }
            return ls7.m16573z(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", qx7.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
