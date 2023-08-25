package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class rn5 extends ja8 implements be8 {
    private static final rn5 zza;
    private int zzd;
    private int zze;
    private db8 zzf = ja8.m18667o();
    private db8 zzg = ja8.m18667o();
    private boolean zzh;
    private boolean zzi;

    static {
        rn5 rn5Var = new rn5();
        zza = rn5Var;
        ja8.m18661v(rn5.class, rn5Var);
    }

    /* renamed from: L */
    public static /* synthetic */ void m11145L(rn5 rn5Var, int i, a06 a06Var) {
        a06Var.getClass();
        db8 db8Var = rn5Var.zzf;
        if (!db8Var.zzc()) {
            rn5Var.zzf = ja8.m18666p(db8Var);
        }
        rn5Var.zzf.set(i, a06Var);
    }

    /* renamed from: M */
    public static /* synthetic */ void m11144M(rn5 rn5Var, int i, xp5 xp5Var) {
        xp5Var.getClass();
        db8 db8Var = rn5Var.zzg;
        if (!db8Var.zzc()) {
            rn5Var.zzg = ja8.m18666p(db8Var);
        }
        rn5Var.zzg.set(i, xp5Var);
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
                    return new nm5(null);
                }
                return new rn5();
            }
            return ja8.m18664s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", a06.class, "zzg", xp5.class, "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m11153D() {
        return this.zze;
    }

    /* renamed from: E */
    public final int m11152E() {
        return this.zzg.size();
    }

    /* renamed from: F */
    public final int m11151F() {
        return this.zzf.size();
    }

    /* renamed from: H */
    public final xp5 m11149H(int i) {
        return (xp5) this.zzg.get(i);
    }

    /* renamed from: I */
    public final a06 m11148I(int i) {
        return (a06) this.zzf.get(i);
    }

    /* renamed from: J */
    public final List m11147J() {
        return this.zzg;
    }

    /* renamed from: K */
    public final List m11146K() {
        return this.zzf;
    }

    /* renamed from: N */
    public final boolean m11143N() {
        return (this.zzd & 1) != 0;
    }
}
