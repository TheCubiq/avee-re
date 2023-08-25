package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class ka7 extends ja8 implements be8 {
    private static final ka7 zza;
    private ab8 zzd = ja8.m();
    private ab8 zze = ja8.m();
    private db8 zzf = ja8.o();
    private db8 zzg = ja8.o();

    static {
        ka7 ka7Var = new ka7();
        zza = ka7Var;
        ja8.v(ka7.class, ka7Var);
    }

    public static h97 I() {
        return (h97) zza.z();
    }

    public static ka7 K() {
        return zza;
    }

    public static /* synthetic */ void Q(ka7 ka7Var, Iterable iterable) {
        ab8 ab8Var = ka7Var.zzd;
        if (!ab8Var.zzc()) {
            ka7Var.zzd = ja8.n(ab8Var);
        }
        w48.f(iterable, ka7Var.zzd);
    }

    public static /* synthetic */ void S(ka7 ka7Var, Iterable iterable) {
        ab8 ab8Var = ka7Var.zze;
        if (!ab8Var.zzc()) {
            ka7Var.zze = ja8.n(ab8Var);
        }
        w48.f(iterable, ka7Var.zze);
    }

    public static /* synthetic */ void U(ka7 ka7Var, Iterable iterable) {
        ka7Var.a0();
        w48.f(iterable, ka7Var.zzf);
    }

    public static /* synthetic */ void W(ka7 ka7Var, int i) {
        ka7Var.a0();
        ka7Var.zzf.remove(i);
    }

    public static /* synthetic */ void X(ka7 ka7Var, Iterable iterable) {
        ka7Var.b0();
        w48.f(iterable, ka7Var.zzg);
    }

    public static /* synthetic */ void Z(ka7 ka7Var, int i) {
        ka7Var.b0();
        ka7Var.zzg.remove(i);
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
                    return new h97(null);
                }
                return new ka7();
            }
            return ja8.s(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", er6.class, "zzg", qc7.class});
        }
        return (byte) 1;
    }

    public final int D() {
        return this.zzf.size();
    }

    public final int E() {
        return this.zze.size();
    }

    public final int F() {
        return this.zzg.size();
    }

    public final int G() {
        return this.zzd.size();
    }

    public final er6 H(int i) {
        return (er6) this.zzf.get(i);
    }

    public final qc7 L(int i) {
        return (qc7) this.zzg.get(i);
    }

    public final List M() {
        return this.zzf;
    }

    public final List N() {
        return this.zze;
    }

    public final List O() {
        return this.zzg;
    }

    public final List P() {
        return this.zzd;
    }

    public final void a0() {
        db8 db8Var = this.zzf;
        if (db8Var.zzc()) {
            return;
        }
        this.zzf = ja8.p(db8Var);
    }

    public final void b0() {
        db8 db8Var = this.zzg;
        if (db8Var.zzc()) {
            return;
        }
        this.zzg = ja8.p(db8Var);
    }
}
