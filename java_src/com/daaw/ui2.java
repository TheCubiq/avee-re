package com.daaw;
/* loaded from: classes.dex */
public final class ui2 extends ls7 implements yt7 {
    private static final ui2 zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        ui2 ui2Var = new ui2();
        zzb = ui2Var;
        ls7.C(ui2.class, ui2Var);
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
                    return new ti2(null);
                }
                return new ui2();
            }
            return ls7.z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", mi2.a, "zzf"});
        }
        return (byte) 1;
    }
}
