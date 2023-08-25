package com.daaw;
/* loaded from: classes.dex */
public final class ux7 extends ls7 implements yt7 {
    private static final ux7 zzb;
    private int zzd;
    private tx7 zze;
    private yq7 zzg;
    private yq7 zzh;
    private int zzi;
    private byte zzj = 2;
    private us7 zzf = ls7.w();

    static {
        ux7 ux7Var = new ux7();
        zzb = ux7Var;
        ls7.C(ux7.class, ux7Var);
    }

    public ux7() {
        yq7 yq7Var = yq7.q;
        this.zzg = yq7Var;
        this.zzh = yq7Var;
    }

    public static rx7 L() {
        return (rx7) zzb.H();
    }

    public static /* synthetic */ void N(ux7 ux7Var, qx7 qx7Var) {
        qx7Var.getClass();
        us7 us7Var = ux7Var.zzf;
        if (!us7Var.zzc()) {
            ux7Var.zzf = ls7.x(us7Var);
        }
        ux7Var.zzf.add(qx7Var);
    }

    @Override // com.daaw.ls7
    public final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            this.zzj = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new rx7(null);
                }
                return new ux7();
            }
            return ls7.z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", qx7.class, "zzg", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
