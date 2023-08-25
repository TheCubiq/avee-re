package com.daaw;
/* loaded from: classes.dex */
public final class si2 extends ls7 implements yt7 {
    private static final si2 zzb;
    private int zzd;
    private long zze = -1;

    static {
        si2 si2Var = new si2();
        zzb = si2Var;
        ls7.C(si2.class, si2Var);
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
                    return new ri2(null);
                }
                return new si2();
            }
            return ls7.z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
