package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class fi7 extends ja8 implements be8 {
    private static final fi7 zza;
    private db8 zzd = ja8.m18667o();

    static {
        fi7 fi7Var = new fi7();
        zza = fi7Var;
        ja8.m18661v(fi7.class, fi7Var);
    }

    /* renamed from: F */
    public static fi7 m22617F() {
        return zza;
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
                    return new ch7(null);
                }
                return new fi7();
            }
            return ja8.m18664s(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", lk7.class});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m22619D() {
        return this.zzd.size();
    }

    /* renamed from: G */
    public final List m22616G() {
        return this.zzd;
    }
}
