package com.daaw;
/* loaded from: classes.dex */
public final class u43 extends ls7 implements yt7 {
    private static final u43 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        u43 u43Var = new u43();
        zzb = u43Var;
        ls7.m16597C(u43.class, u43Var);
    }

    /* renamed from: L */
    public static t43 m8586L() {
        return (t43) zzb.m16592H();
    }

    /* renamed from: N */
    public static /* synthetic */ void m8584N(u43 u43Var, boolean z) {
        u43Var.zzd |= 1;
        u43Var.zze = z;
    }

    /* renamed from: O */
    public static /* synthetic */ void m8583O(u43 u43Var, boolean z) {
        u43Var.zzd |= 2;
        u43Var.zzf = z;
    }

    /* renamed from: P */
    public static /* synthetic */ void m8582P(u43 u43Var, int i) {
        u43Var.zzd |= 4;
        u43Var.zzg = i;
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
                    return new t43(null);
                }
                return new u43();
            }
            return ls7.m16573z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
