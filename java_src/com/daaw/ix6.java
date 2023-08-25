package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class ix6 extends ja8 implements be8 {
    private static final ix6 zza;
    private int zzd;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private db8 zzj = ja8.o();

    static {
        ix6 ix6Var = new ix6();
        zza = ix6Var;
        ja8.v(ix6.class, ix6Var);
    }

    public static fw6 H() {
        return (fw6) zza.z();
    }

    public static /* synthetic */ void M(ix6 ix6Var, String str) {
        str.getClass();
        ix6Var.zzd |= 1;
        ix6Var.zze = str;
    }

    public static /* synthetic */ void N(ix6 ix6Var, String str) {
        str.getClass();
        ix6Var.zzd |= 2;
        ix6Var.zzf = str;
    }

    public static /* synthetic */ void O(ix6 ix6Var) {
        ix6Var.zzd &= -3;
        ix6Var.zzf = zza.zzf;
    }

    public static /* synthetic */ void P(ix6 ix6Var, long j) {
        ix6Var.zzd |= 4;
        ix6Var.zzg = j;
    }

    public static /* synthetic */ void Q(ix6 ix6Var) {
        ix6Var.zzd &= -5;
        ix6Var.zzg = 0L;
    }

    public static /* synthetic */ void R(ix6 ix6Var, double d) {
        ix6Var.zzd |= 16;
        ix6Var.zzi = d;
    }

    public static /* synthetic */ void S(ix6 ix6Var) {
        ix6Var.zzd &= -17;
        ix6Var.zzi = 0.0d;
    }

    public static /* synthetic */ void T(ix6 ix6Var, ix6 ix6Var2) {
        ix6Var2.getClass();
        ix6Var.b0();
        ix6Var.zzj.add(ix6Var2);
    }

    public static /* synthetic */ void U(ix6 ix6Var, Iterable iterable) {
        ix6Var.b0();
        w48.f(iterable, ix6Var.zzj);
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
                    return new fw6(null);
                }
                return new ix6();
            }
            return ja8.s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", ix6.class});
        }
        return (byte) 1;
    }

    public final double D() {
        return this.zzi;
    }

    public final float E() {
        return this.zzh;
    }

    public final int F() {
        return this.zzj.size();
    }

    public final long G() {
        return this.zzg;
    }

    public final String J() {
        return this.zze;
    }

    public final String K() {
        return this.zzf;
    }

    public final List L() {
        return this.zzj;
    }

    public final boolean W() {
        return (this.zzd & 16) != 0;
    }

    public final boolean X() {
        return (this.zzd & 8) != 0;
    }

    public final boolean Y() {
        return (this.zzd & 4) != 0;
    }

    public final boolean Z() {
        return (this.zzd & 1) != 0;
    }

    public final boolean a0() {
        return (this.zzd & 2) != 0;
    }

    public final void b0() {
        db8 db8Var = this.zzj;
        if (db8Var.zzc()) {
            return;
        }
        this.zzj = ja8.p(db8Var);
    }
}
