package com.daaw;
/* loaded from: classes.dex */
public final class jy7 extends ls7 implements yt7 {
    private static final jy7 zzb;
    private int zzd;
    private int zze;
    private ux7 zzg;
    private yx7 zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private qs7 zzj = ls7.t();
    private String zzk = "";
    private us7 zzm = ls7.w();

    static {
        jy7 jy7Var = new jy7();
        zzb = jy7Var;
        ls7.C(jy7.class, jy7Var);
    }

    public static iy7 M() {
        return (iy7) zzb.H();
    }

    public static /* synthetic */ void P(jy7 jy7Var, int i) {
        jy7Var.zzd |= 1;
        jy7Var.zze = i;
    }

    public static /* synthetic */ void Q(jy7 jy7Var, String str) {
        str.getClass();
        jy7Var.zzd |= 2;
        jy7Var.zzf = str;
    }

    public static /* synthetic */ void R(jy7 jy7Var, ux7 ux7Var) {
        ux7Var.getClass();
        jy7Var.zzg = ux7Var;
        jy7Var.zzd |= 4;
    }

    public static /* synthetic */ void S(jy7 jy7Var, String str) {
        str.getClass();
        us7 us7Var = jy7Var.zzm;
        if (!us7Var.zzc()) {
            jy7Var.zzm = ls7.x(us7Var);
        }
        jy7Var.zzm.add(str);
    }

    public static /* synthetic */ void T(jy7 jy7Var, int i) {
        jy7Var.zzl = i - 1;
        jy7Var.zzd |= 64;
    }

    @Override // com.daaw.ls7
    public final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            this.zzn = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new iy7(null);
                }
                return new jy7();
            }
            return ls7.z(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", gy7.a, "zzm"});
        }
        return Byte.valueOf(this.zzn);
    }

    public final int L() {
        return this.zzm.size();
    }

    public final String O() {
        return this.zzf;
    }
}
