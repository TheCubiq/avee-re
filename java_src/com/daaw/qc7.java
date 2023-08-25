package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class qc7 extends ja8 implements be8 {
    private static final qc7 zza;
    private int zzd;
    private int zze;
    private ab8 zzf = ja8.m();

    static {
        qc7 qc7Var = new qc7();
        zza = qc7Var;
        ja8.v(qc7.class, qc7Var);
    }

    public static nb7 G() {
        return (nb7) zza.z();
    }

    public static /* synthetic */ void J(qc7 qc7Var, int i) {
        qc7Var.zzd |= 1;
        qc7Var.zze = i;
    }

    public static /* synthetic */ void K(qc7 qc7Var, Iterable iterable) {
        ab8 ab8Var = qc7Var.zzf;
        if (!ab8Var.zzc()) {
            qc7Var.zzf = ja8.n(ab8Var);
        }
        w48.f(iterable, qc7Var.zzf);
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
                    return new nb7(null);
                }
                return new qc7();
            }
            return ja8.s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int D() {
        return this.zzf.size();
    }

    public final int E() {
        return this.zze;
    }

    public final long F(int i) {
        return this.zzf.a(i);
    }

    public final List I() {
        return this.zzf;
    }

    public final boolean L() {
        return (this.zzd & 1) != 0;
    }
}
