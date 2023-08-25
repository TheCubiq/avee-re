package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class lk7 extends ja8 implements be8 {
    private static final lk7 zza;
    private int zzd;
    private String zze = "";
    private db8 zzf = ja8.m18667o();

    static {
        lk7 lk7Var = new lk7();
        zza = lk7Var;
        ja8.m18661v(lk7.class, lk7Var);
    }

    @Override // com.daaw.ja8
    /* renamed from: C */
    public final Object mo4853C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new ij7(null);
                }
                return new lk7();
            }
            return ja8.m18664s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", gs7.class});
        }
        return (byte) 1;
    }

    /* renamed from: E */
    public final String m16890E() {
        return this.zze;
    }

    /* renamed from: F */
    public final List m16889F() {
        return this.zzf;
    }
}
