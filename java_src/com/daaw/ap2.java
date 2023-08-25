package com.daaw;
/* loaded from: classes.dex */
public final class ap2 extends ls7 implements yt7 {
    private static final ap2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        ap2 ap2Var = new ap2();
        zzb = ap2Var;
        ls7.C(ap2.class, ap2Var);
    }

    public static zo2 O() {
        return (zo2) zzb.H();
    }

    public static ap2 Q() {
        return zzb;
    }

    public static ap2 R(yq7 yq7Var) {
        return (ap2) ls7.o(zzb, yq7Var);
    }

    public static ap2 S(yq7 yq7Var, vr7 vr7Var) {
        return (ap2) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void V(ap2 ap2Var, String str) {
        str.getClass();
        ap2Var.zzd |= 1;
        ap2Var.zze = str;
    }

    public static /* synthetic */ void W(ap2 ap2Var, long j) {
        ap2Var.zzd |= 16;
        ap2Var.zzi = j;
    }

    public static /* synthetic */ void X(ap2 ap2Var, String str) {
        str.getClass();
        ap2Var.zzd |= 2;
        ap2Var.zzf = str;
    }

    public static /* synthetic */ void Y(ap2 ap2Var, long j) {
        ap2Var.zzd |= 4;
        ap2Var.zzg = j;
    }

    public static /* synthetic */ void Z(ap2 ap2Var, long j) {
        ap2Var.zzd |= 8;
        ap2Var.zzh = j;
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
                    return new zo2(null);
                }
                return new ap2();
            }
            return ls7.z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final long L() {
        return this.zzh;
    }

    public final long M() {
        return this.zzg;
    }

    public final long N() {
        return this.zzi;
    }

    public final String T() {
        return this.zzf;
    }

    public final String U() {
        return this.zze;
    }
}
