package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class xp5 extends ja8 implements be8 {
    private static final xp5 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private db8 zzg = ja8.m18667o();
    private boolean zzh;
    private tx5 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        xp5 xp5Var = new xp5();
        zza = xp5Var;
        ja8.m18661v(xp5.class, xp5Var);
    }

    /* renamed from: F */
    public static uo5 m4850F() {
        return (uo5) zza.m18657z();
    }

    /* renamed from: L */
    public static /* synthetic */ void m4844L(xp5 xp5Var, String str) {
        xp5Var.zzd |= 2;
        xp5Var.zzf = str;
    }

    /* renamed from: M */
    public static /* synthetic */ void m4843M(xp5 xp5Var, int i, ds5 ds5Var) {
        ds5Var.getClass();
        db8 db8Var = xp5Var.zzg;
        if (!db8Var.zzc()) {
            xp5Var.zzg = ja8.m18666p(db8Var);
        }
        xp5Var.zzg.set(i, ds5Var);
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
                    return new uo5(null);
                }
                return new xp5();
            }
            return ja8.m18664s(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", ds5.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m4852D() {
        return this.zzg.size();
    }

    /* renamed from: E */
    public final int m4851E() {
        return this.zze;
    }

    /* renamed from: H */
    public final ds5 m4848H(int i) {
        return (ds5) this.zzg.get(i);
    }

    /* renamed from: I */
    public final tx5 m4847I() {
        tx5 tx5Var = this.zzi;
        return tx5Var == null ? tx5.m8719E() : tx5Var;
    }

    /* renamed from: J */
    public final String m4846J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final List m4845K() {
        return this.zzg;
    }

    /* renamed from: N */
    public final boolean m4842N() {
        return this.zzj;
    }

    /* renamed from: O */
    public final boolean m4841O() {
        return this.zzk;
    }

    /* renamed from: P */
    public final boolean m4840P() {
        return this.zzl;
    }

    /* renamed from: Q */
    public final boolean m4839Q() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: R */
    public final boolean m4838R() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: S */
    public final boolean m4837S() {
        return (this.zzd & 64) != 0;
    }
}
