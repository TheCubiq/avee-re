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
    private db8 zzj = ja8.m18667o();

    static {
        ix6 ix6Var = new ix6();
        zza = ix6Var;
        ja8.m18661v(ix6.class, ix6Var);
    }

    /* renamed from: H */
    public static fw6 m19288H() {
        return (fw6) zza.m18657z();
    }

    /* renamed from: M */
    public static /* synthetic */ void m19283M(ix6 ix6Var, String str) {
        str.getClass();
        ix6Var.zzd |= 1;
        ix6Var.zze = str;
    }

    /* renamed from: N */
    public static /* synthetic */ void m19282N(ix6 ix6Var, String str) {
        str.getClass();
        ix6Var.zzd |= 2;
        ix6Var.zzf = str;
    }

    /* renamed from: O */
    public static /* synthetic */ void m19281O(ix6 ix6Var) {
        ix6Var.zzd &= -3;
        ix6Var.zzf = zza.zzf;
    }

    /* renamed from: P */
    public static /* synthetic */ void m19280P(ix6 ix6Var, long j) {
        ix6Var.zzd |= 4;
        ix6Var.zzg = j;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m19279Q(ix6 ix6Var) {
        ix6Var.zzd &= -5;
        ix6Var.zzg = 0L;
    }

    /* renamed from: R */
    public static /* synthetic */ void m19278R(ix6 ix6Var, double d) {
        ix6Var.zzd |= 16;
        ix6Var.zzi = d;
    }

    /* renamed from: S */
    public static /* synthetic */ void m19277S(ix6 ix6Var) {
        ix6Var.zzd &= -17;
        ix6Var.zzi = 0.0d;
    }

    /* renamed from: T */
    public static /* synthetic */ void m19276T(ix6 ix6Var, ix6 ix6Var2) {
        ix6Var2.getClass();
        ix6Var.m19268b0();
        ix6Var.zzj.add(ix6Var2);
    }

    /* renamed from: U */
    public static /* synthetic */ void m19275U(ix6 ix6Var, Iterable iterable) {
        ix6Var.m19268b0();
        w48.m6532f(iterable, ix6Var.zzj);
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
                    return new fw6(null);
                }
                return new ix6();
            }
            return ja8.m18664s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", ix6.class});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final double m19292D() {
        return this.zzi;
    }

    /* renamed from: E */
    public final float m19291E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final int m19290F() {
        return this.zzj.size();
    }

    /* renamed from: G */
    public final long m19289G() {
        return this.zzg;
    }

    /* renamed from: J */
    public final String m19286J() {
        return this.zze;
    }

    /* renamed from: K */
    public final String m19285K() {
        return this.zzf;
    }

    /* renamed from: L */
    public final List m19284L() {
        return this.zzj;
    }

    /* renamed from: W */
    public final boolean m19273W() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: X */
    public final boolean m19272X() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: Y */
    public final boolean m19271Y() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: Z */
    public final boolean m19270Z() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: a0 */
    public final boolean m19269a0() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: b0 */
    public final void m19268b0() {
        db8 db8Var = this.zzj;
        if (db8Var.zzc()) {
            return;
        }
        this.zzj = ja8.m18666p(db8Var);
    }
}
