package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class qc7 extends ja8 implements be8 {
    private static final qc7 zza;
    private int zzd;
    private int zze;
    private ab8 zzf = ja8.m18669m();

    static {
        qc7 qc7Var = new qc7();
        zza = qc7Var;
        ja8.m18661v(qc7.class, qc7Var);
    }

    /* renamed from: G */
    public static nb7 m12619G() {
        return (nb7) zza.m18657z();
    }

    /* renamed from: J */
    public static /* synthetic */ void m12616J(qc7 qc7Var, int i) {
        qc7Var.zzd |= 1;
        qc7Var.zze = i;
    }

    /* renamed from: K */
    public static /* synthetic */ void m12615K(qc7 qc7Var, Iterable iterable) {
        ab8 ab8Var = qc7Var.zzf;
        if (!ab8Var.zzc()) {
            qc7Var.zzf = ja8.m18668n(ab8Var);
        }
        w48.m6532f(iterable, qc7Var.zzf);
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
                    return new nb7(null);
                }
                return new qc7();
            }
            return ja8.m18664s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m12622D() {
        return this.zzf.size();
    }

    /* renamed from: E */
    public final int m12621E() {
        return this.zze;
    }

    /* renamed from: F */
    public final long m12620F(int i) {
        return this.zzf.mo25416a(i);
    }

    /* renamed from: I */
    public final List m12617I() {
        return this.zzf;
    }

    /* renamed from: L */
    public final boolean m12614L() {
        return (this.zzd & 1) != 0;
    }
}
