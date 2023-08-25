package com.daaw;
/* loaded from: classes.dex */
public final class qx7 extends ls7 implements yt7 {
    private static final qx7 zzb;
    private int zzd;
    private yq7 zze;
    private yq7 zzf;
    private byte zzg = 2;

    static {
        qx7 qx7Var = new qx7();
        zzb = qx7Var;
        ls7.C(qx7.class, qx7Var);
    }

    public qx7() {
        yq7 yq7Var = yq7.q;
        this.zze = yq7Var;
        this.zzf = yq7Var;
    }

    public static px7 L() {
        return (px7) zzb.H();
    }

    public static /* synthetic */ void N(qx7 qx7Var, yq7 yq7Var) {
        qx7Var.zzd |= 1;
        qx7Var.zze = yq7Var;
    }

    public static /* synthetic */ void O(qx7 qx7Var, yq7 yq7Var) {
        qx7Var.zzd |= 2;
        qx7Var.zzf = yq7Var;
    }

    @Override // com.daaw.ls7
    public final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            this.zzg = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new px7(null);
                }
                return new qx7();
            }
            return ls7.z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}
