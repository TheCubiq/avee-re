package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class e27 extends ja8 implements be8 {
    private static final e27 zza;
    private db8 zzd = ja8.o();

    static {
        e27 e27Var = new e27();
        zza = e27Var;
        ja8.v(e27.class, e27Var);
    }

    public static b17 D() {
        return (b17) zza.z();
    }

    public static /* synthetic */ void H(e27 e27Var, j47 j47Var) {
        j47Var.getClass();
        db8 db8Var = e27Var.zzd;
        if (!db8Var.zzc()) {
            e27Var.zzd = ja8.p(db8Var);
        }
        e27Var.zzd.add(j47Var);
    }

    @Override // com.daaw.ja8
    public final Object C(int i, Object obj, Object obj2) {
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
                    return new b17(null);
                }
                return new e27();
            }
            return ja8.s(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", j47.class});
        }
        return (byte) 1;
    }

    public final j47 F(int i) {
        return (j47) this.zzd.get(0);
    }

    public final List G() {
        return this.zzd;
    }
}
