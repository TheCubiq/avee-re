package com.daaw;
/* loaded from: classes.dex */
public final class ly7 extends ls7 implements yt7 {
    private static final ly7 zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        ly7 ly7Var = new ly7();
        zzb = ly7Var;
        ls7.m16597C(ly7.class, ly7Var);
    }

    /* renamed from: L */
    public static ky7 m16371L() {
        return (ky7) zzb.m16592H();
    }

    /* renamed from: N */
    public static /* synthetic */ void m16369N(ly7 ly7Var, String str) {
        ly7Var.zzd |= 1;
        ly7Var.zze = str;
    }

    /* renamed from: O */
    public static /* synthetic */ void m16368O(ly7 ly7Var, long j) {
        ly7Var.zzd |= 2;
        ly7Var.zzf = j;
    }

    /* renamed from: P */
    public static /* synthetic */ void m16367P(ly7 ly7Var, boolean z) {
        ly7Var.zzd |= 4;
        ly7Var.zzg = z;
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
                    return new ky7(null);
                }
                return new ly7();
            }
            return ls7.m16573z(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", my7.f19302a, "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
