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
        ls7.m16597C(ej2.class, ej2Var);
    }

    /* renamed from: L */
    public static dj2 m23443L() {
        return (dj2) zzb.m16592H();
    }

    /* renamed from: N */
    public static /* synthetic */ void m23441N(ej2 ej2Var, long j) {
        ej2Var.zzd |= 1;
        ej2Var.zze = j;
    }

    /* renamed from: O */
    public static /* synthetic */ void m23440O(ej2 ej2Var, long j) {
        ej2Var.zzd |= 4;
        ej2Var.zzg = j;
    }

    /* renamed from: P */
    public static /* synthetic */ void m23439P(ej2 ej2Var, long j) {
        ej2Var.zzd |= 8;
        ej2Var.zzh = j;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m23438Q(ej2 ej2Var, long j) {
        ej2Var.zzd |= 16;
        ej2Var.zzi = j;
    }

    /* renamed from: R */
    public static /* synthetic */ void m23437R(ej2 ej2Var, long j) {
        ej2Var.zzd |= 32;
        ej2Var.zzj = j;
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
                    return new dj2(null);
                }
                return new ej2();
            }
            return ls7.m16573z(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
