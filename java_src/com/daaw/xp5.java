package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class xp5 extends ja8 implements be8 {
    private static final xp5 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private db8 zzg = ja8.o();
    private boolean zzh;
    private tx5 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        xp5 xp5Var = new xp5();
        zza = xp5Var;
        ja8.v(xp5.class, xp5Var);
    }

    public static uo5 F() {
        return (uo5) zza.z();
    }

    public static /* synthetic */ void L(xp5 xp5Var, String str) {
        xp5Var.zzd |= 2;
        xp5Var.zzf = str;
    }

    public static /* synthetic */ void M(xp5 xp5Var, int i, ds5 ds5Var) {
        ds5Var.getClass();
        db8 db8Var = xp5Var.zzg;
        if (!db8Var.zzc()) {
            xp5Var.zzg = ja8.p(db8Var);
        }
        xp5Var.zzg.set(i, ds5Var);
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
                    return new uo5(null);
                }
                return new xp5();
            }
            return ja8.s(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", ds5.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    public final int D() {
        return this.zzg.size();
    }

    public final int E() {
        return this.zze;
    }

    public final ds5 H(int i) {
        return (ds5) this.zzg.get(i);
    }

    public final tx5 I() {
        tx5 tx5Var = this.zzi;
        return tx5Var == null ? tx5.E() : tx5Var;
    }

    public final String J() {
        return this.zzf;
    }

    public final List K() {
        return this.zzg;
    }

    public final boolean N() {
        return this.zzj;
    }

    public final boolean O() {
        return this.zzk;
    }

    public final boolean P() {
        return this.zzl;
    }

    public final boolean Q() {
        return (this.zzd & 8) != 0;
    }

    public final boolean R() {
        return (this.zzd & 1) != 0;
    }

    public final boolean S() {
        return (this.zzd & 64) != 0;
    }
}
