package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class it6 extends ja8 implements be8 {
    private static final it6 zza;
    private int zzd;
    private db8 zze = ja8.m18667o();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        it6 it6Var = new it6();
        zza = it6Var;
        ja8.m18661v(it6.class, it6Var);
    }

    /* renamed from: H */
    public static fs6 m19365H() {
        return (fs6) zza.m18657z();
    }

    /* renamed from: M */
    public static /* synthetic */ void m19360M(it6 it6Var, int i, ix6 ix6Var) {
        ix6Var.getClass();
        it6Var.m19349X();
        it6Var.zze.set(i, ix6Var);
    }

    /* renamed from: N */
    public static /* synthetic */ void m19359N(it6 it6Var, ix6 ix6Var) {
        ix6Var.getClass();
        it6Var.m19349X();
        it6Var.zze.add(ix6Var);
    }

    /* renamed from: O */
    public static /* synthetic */ void m19358O(it6 it6Var, Iterable iterable) {
        it6Var.m19349X();
        w48.m6532f(iterable, it6Var.zze);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m19356Q(it6 it6Var, int i) {
        it6Var.m19349X();
        it6Var.zze.remove(i);
    }

    /* renamed from: R */
    public static /* synthetic */ void m19355R(it6 it6Var, String str) {
        str.getClass();
        it6Var.zzd |= 1;
        it6Var.zzf = str;
    }

    /* renamed from: S */
    public static /* synthetic */ void m19354S(it6 it6Var, long j) {
        it6Var.zzd |= 2;
        it6Var.zzg = j;
    }

    /* renamed from: T */
    public static /* synthetic */ void m19353T(it6 it6Var, long j) {
        it6Var.zzd |= 4;
        it6Var.zzh = j;
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
                    return new fs6(null);
                }
                return new it6();
            }
            return ja8.m18664s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", ix6.class, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m19369D() {
        return this.zzi;
    }

    /* renamed from: E */
    public final int m19368E() {
        return this.zze.size();
    }

    /* renamed from: F */
    public final long m19367F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final long m19366G() {
        return this.zzg;
    }

    /* renamed from: J */
    public final ix6 m19363J(int i) {
        return (ix6) this.zze.get(i);
    }

    /* renamed from: K */
    public final String m19362K() {
        return this.zzf;
    }

    /* renamed from: L */
    public final List m19361L() {
        return this.zze;
    }

    /* renamed from: U */
    public final boolean m19352U() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: V */
    public final boolean m19351V() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: W */
    public final boolean m19350W() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: X */
    public final void m19349X() {
        db8 db8Var = this.zze;
        if (db8Var.zzc()) {
            return;
        }
        this.zze = ja8.m18666p(db8Var);
    }
}
