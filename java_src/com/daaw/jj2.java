package com.daaw;
/* loaded from: classes.dex */
public final class jj2 extends ls7 implements yt7 {
    private static final jj2 zzb;
    private int zzd;
    private yq7 zze;
    private yq7 zzf;
    private yq7 zzg;
    private yq7 zzh;

    static {
        jj2 jj2Var = new jj2();
        zzb = jj2Var;
        ls7.C(jj2.class, jj2Var);
    }

    public jj2() {
        yq7 yq7Var = yq7.q;
        this.zze = yq7Var;
        this.zzf = yq7Var;
        this.zzg = yq7Var;
        this.zzh = yq7Var;
    }

    public static ij2 L() {
        return (ij2) zzb.H();
    }

    public static jj2 N(byte[] bArr, vr7 vr7Var) {
        return (jj2) ls7.s(zzb, bArr, vr7Var);
    }

    public static /* synthetic */ void S(jj2 jj2Var, yq7 yq7Var) {
        jj2Var.zzd |= 1;
        jj2Var.zze = yq7Var;
    }

    public static /* synthetic */ void T(jj2 jj2Var, yq7 yq7Var) {
        jj2Var.zzd |= 2;
        jj2Var.zzf = yq7Var;
    }

    public static /* synthetic */ void U(jj2 jj2Var, yq7 yq7Var) {
        jj2Var.zzd |= 4;
        jj2Var.zzg = yq7Var;
    }

    public static /* synthetic */ void V(jj2 jj2Var, yq7 yq7Var) {
        jj2Var.zzd |= 8;
        jj2Var.zzh = yq7Var;
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
                    return new ij2(null);
                }
                return new jj2();
            }
            return ls7.z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final yq7 O() {
        return this.zze;
    }

    public final yq7 P() {
        return this.zzf;
    }

    public final yq7 Q() {
        return this.zzh;
    }

    public final yq7 R() {
        return this.zzg;
    }
}
