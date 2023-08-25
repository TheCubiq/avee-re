package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class it6 extends ja8 implements be8 {
    private static final it6 zza;
    private int zzd;
    private db8 zze = ja8.o();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        it6 it6Var = new it6();
        zza = it6Var;
        ja8.v(it6.class, it6Var);
    }

    public static fs6 H() {
        return (fs6) zza.z();
    }

    public static /* synthetic */ void M(it6 it6Var, int i, ix6 ix6Var) {
        ix6Var.getClass();
        it6Var.X();
        it6Var.zze.set(i, ix6Var);
    }

    public static /* synthetic */ void N(it6 it6Var, ix6 ix6Var) {
        ix6Var.getClass();
        it6Var.X();
        it6Var.zze.add(ix6Var);
    }

    public static /* synthetic */ void O(it6 it6Var, Iterable iterable) {
        it6Var.X();
        w48.f(iterable, it6Var.zze);
    }

    public static /* synthetic */ void Q(it6 it6Var, int i) {
        it6Var.X();
        it6Var.zze.remove(i);
    }

    public static /* synthetic */ void R(it6 it6Var, String str) {
        str.getClass();
        it6Var.zzd |= 1;
        it6Var.zzf = str;
    }

    public static /* synthetic */ void S(it6 it6Var, long j) {
        it6Var.zzd |= 2;
        it6Var.zzg = j;
    }

    public static /* synthetic */ void T(it6 it6Var, long j) {
        it6Var.zzd |= 4;
        it6Var.zzh = j;
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
                    return new fs6(null);
                }
                return new it6();
            }
            return ja8.s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", ix6.class, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int D() {
        return this.zzi;
    }

    public final int E() {
        return this.zze.size();
    }

    public final long F() {
        return this.zzh;
    }

    public final long G() {
        return this.zzg;
    }

    public final ix6 J(int i) {
        return (ix6) this.zze.get(i);
    }

    public final String K() {
        return this.zzf;
    }

    public final List L() {
        return this.zze;
    }

    public final boolean U() {
        return (this.zzd & 8) != 0;
    }

    public final boolean V() {
        return (this.zzd & 4) != 0;
    }

    public final boolean W() {
        return (this.zzd & 2) != 0;
    }

    public final void X() {
        db8 db8Var = this.zze;
        if (db8Var.zzc()) {
            return;
        }
        this.zze = ja8.p(db8Var);
    }
}
