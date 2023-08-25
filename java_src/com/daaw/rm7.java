package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class rm7 extends ja8 implements be8 {
    private static final rm7 zza;
    private int zzd;
    private db8 zze = ja8.m18667o();
    private fi7 zzf;

    static {
        rm7 rm7Var = new rm7();
        zza = rm7Var;
        ja8.m18661v(rm7.class, rm7Var);
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
                    return new ol7(null);
                }
                return new rm7();
            }
            return ja8.m18664s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", gs7.class, "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final fi7 m11177D() {
        fi7 fi7Var = this.zzf;
        return fi7Var == null ? fi7.m22617F() : fi7Var;
    }

    /* renamed from: F */
    public final List m11175F() {
        return this.zze;
    }
}
