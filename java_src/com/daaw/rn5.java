package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class rn5 extends ja8 implements be8 {
    private static final rn5 zza;
    private int zzd;
    private int zze;
    private db8 zzf = ja8.o();
    private db8 zzg = ja8.o();
    private boolean zzh;
    private boolean zzi;

    static {
        rn5 rn5Var = new rn5();
        zza = rn5Var;
        ja8.v(rn5.class, rn5Var);
    }

    public static /* synthetic */ void L(rn5 rn5Var, int i, a06 a06Var) {
        a06Var.getClass();
        db8 db8Var = rn5Var.zzf;
        if (!db8Var.zzc()) {
            rn5Var.zzf = ja8.p(db8Var);
        }
        rn5Var.zzf.set(i, a06Var);
    }

    public static /* synthetic */ void M(rn5 rn5Var, int i, xp5 xp5Var) {
        xp5Var.getClass();
        db8 db8Var = rn5Var.zzg;
        if (!db8Var.zzc()) {
            rn5Var.zzg = ja8.p(db8Var);
        }
        rn5Var.zzg.set(i, xp5Var);
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
                    return new nm5(null);
                }
                return new rn5();
            }
            return ja8.s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", a06.class, "zzg", xp5.class, "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int D() {
        return this.zze;
    }

    public final int E() {
        return this.zzg.size();
    }

    public final int F() {
        return this.zzf.size();
    }

    public final xp5 H(int i) {
        return (xp5) this.zzg.get(i);
    }

    public final a06 I(int i) {
        return (a06) this.zzf.get(i);
    }

    public final List J() {
        return this.zzg;
    }

    public final List K() {
        return this.zzf;
    }

    public final boolean N() {
        return (this.zzd & 1) != 0;
    }
}
