package com.daaw;
/* loaded from: classes.dex */
public final class s43 extends ls7 implements yt7 {
    private static final s43 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        s43 s43Var = new s43();
        zzb = s43Var;
        ls7.C(s43.class, s43Var);
    }

    public static r43 L() {
        return (r43) zzb.H();
    }

    public static s43 N() {
        return zzb;
    }

    public static /* synthetic */ void O(s43 s43Var, boolean z) {
        s43Var.zzd |= 1;
        s43Var.zze = z;
    }

    public static /* synthetic */ void P(s43 s43Var, int i) {
        s43Var.zzd |= 2;
        s43Var.zzf = i;
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
                    return new r43(null);
                }
                return new s43();
            }
            return ls7.z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
