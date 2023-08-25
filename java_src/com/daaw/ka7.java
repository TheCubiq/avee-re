package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class ka7 extends ja8 implements be8 {
    private static final ka7 zza;
    private ab8 zzd = ja8.m18669m();
    private ab8 zze = ja8.m18669m();
    private db8 zzf = ja8.m18667o();
    private db8 zzg = ja8.m18667o();

    static {
        ka7 ka7Var = new ka7();
        zza = ka7Var;
        ja8.m18661v(ka7.class, ka7Var);
    }

    /* renamed from: I */
    public static h97 m17871I() {
        return (h97) zza.m18657z();
    }

    /* renamed from: K */
    public static ka7 m17869K() {
        return zza;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m17863Q(ka7 ka7Var, Iterable iterable) {
        ab8 ab8Var = ka7Var.zzd;
        if (!ab8Var.zzc()) {
            ka7Var.zzd = ja8.m18668n(ab8Var);
        }
        w48.m6532f(iterable, ka7Var.zzd);
    }

    /* renamed from: S */
    public static /* synthetic */ void m17861S(ka7 ka7Var, Iterable iterable) {
        ab8 ab8Var = ka7Var.zze;
        if (!ab8Var.zzc()) {
            ka7Var.zze = ja8.m18668n(ab8Var);
        }
        w48.m6532f(iterable, ka7Var.zze);
    }

    /* renamed from: U */
    public static /* synthetic */ void m17859U(ka7 ka7Var, Iterable iterable) {
        ka7Var.m17853a0();
        w48.m6532f(iterable, ka7Var.zzf);
    }

    /* renamed from: W */
    public static /* synthetic */ void m17857W(ka7 ka7Var, int i) {
        ka7Var.m17853a0();
        ka7Var.zzf.remove(i);
    }

    /* renamed from: X */
    public static /* synthetic */ void m17856X(ka7 ka7Var, Iterable iterable) {
        ka7Var.m17852b0();
        w48.m6532f(iterable, ka7Var.zzg);
    }

    /* renamed from: Z */
    public static /* synthetic */ void m17854Z(ka7 ka7Var, int i) {
        ka7Var.m17852b0();
        ka7Var.zzg.remove(i);
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
                    return new h97(null);
                }
                return new ka7();
            }
            return ja8.m18664s(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", er6.class, "zzg", qc7.class});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m17876D() {
        return this.zzf.size();
    }

    /* renamed from: E */
    public final int m17875E() {
        return this.zze.size();
    }

    /* renamed from: F */
    public final int m17874F() {
        return this.zzg.size();
    }

    /* renamed from: G */
    public final int m17873G() {
        return this.zzd.size();
    }

    /* renamed from: H */
    public final er6 m17872H(int i) {
        return (er6) this.zzf.get(i);
    }

    /* renamed from: L */
    public final qc7 m17868L(int i) {
        return (qc7) this.zzg.get(i);
    }

    /* renamed from: M */
    public final List m17867M() {
        return this.zzf;
    }

    /* renamed from: N */
    public final List m17866N() {
        return this.zze;
    }

    /* renamed from: O */
    public final List m17865O() {
        return this.zzg;
    }

    /* renamed from: P */
    public final List m17864P() {
        return this.zzd;
    }

    /* renamed from: a0 */
    public final void m17853a0() {
        db8 db8Var = this.zzf;
        if (db8Var.zzc()) {
            return;
        }
        this.zzf = ja8.m18666p(db8Var);
    }

    /* renamed from: b0 */
    public final void m17852b0() {
        db8 db8Var = this.zzg;
        if (db8Var.zzc()) {
            return;
        }
        this.zzg = ja8.m18666p(db8Var);
    }
}
