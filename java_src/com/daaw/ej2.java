package com.daaw;
/* loaded from: classes.dex */
public final class ej2 extends ls7 implements yt7 {
    private static final ej2 zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        ej2 ej2Var = new ej2();
        zzb = ej2Var;
        ls7.C(ej2.class, ej2Var);
    }

    public static dj2 L() {
        return (dj2) zzb.H();
    }

    public static /* synthetic */ void N(ej2 ej2Var, long j) {
        ej2Var.zzd |= 1;
        ej2Var.zze = j;
    }

    public static /* synthetic */ void O(ej2 ej2Var, long j) {
        ej2Var.zzd |= 4;
        ej2Var.zzg = j;
    }

    public static /* synthetic */ void P(ej2 ej2Var, long j) {
        ej2Var.zzd |= 8;
        ej2Var.zzh = j;
    }

    public static /* synthetic */ void Q(ej2 ej2Var, long j) {
        ej2Var.zzd |= 16;
        ej2Var.zzi = j;
    }

    public static /* synthetic */ void R(ej2 ej2Var, long j) {
        ej2Var.zzd |= 32;
        ej2Var.zzj = j;
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
                    return new dj2(null);
                }
                return new ej2();
            }
            return ls7.z(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
