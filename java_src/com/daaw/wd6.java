package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class wd6 extends ja8 implements be8 {
    private static final wd6 zza;
    private int zzd;
    private long zze;
    private int zzg;
    private boolean zzl;
    private String zzf = "";
    private db8 zzh = ja8.o();
    private db8 zzi = ja8.o();
    private db8 zzj = ja8.o();
    private String zzk = "";
    private db8 zzm = ja8.o();
    private db8 zzn = ja8.o();
    private String zzo = "";

    static {
        wd6 wd6Var = new wd6();
        zza = wd6Var;
        ja8.v(wd6.class, wd6Var);
    }

    public static tc6 H() {
        return (tc6) zza.z();
    }

    public static wd6 J() {
        return zza;
    }

    public static /* synthetic */ void Q(wd6 wd6Var, int i, qb6 qb6Var) {
        qb6Var.getClass();
        db8 db8Var = wd6Var.zzi;
        if (!db8Var.zzc()) {
            wd6Var.zzi = ja8.p(db8Var);
        }
        wd6Var.zzi.set(i, qb6Var);
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
                    return new tc6(null);
                }
                return new wd6();
            }
            return ja8.s(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", ii6.class, "zzi", qb6.class, "zzj", rn5.class, "zzk", "zzl", "zzm", rm7.class, "zzn", k96.class, "zzo"});
        }
        return (byte) 1;
    }

    public final int D() {
        return this.zzm.size();
    }

    public final int E() {
        return this.zzi.size();
    }

    public final long F() {
        return this.zze;
    }

    public final qb6 G(int i) {
        return (qb6) this.zzi.get(i);
    }

    public final String K() {
        return this.zzf;
    }

    public final String L() {
        return this.zzo;
    }

    public final List M() {
        return this.zzj;
    }

    public final List N() {
        return this.zzn;
    }

    public final List O() {
        return this.zzm;
    }

    public final List P() {
        return this.zzh;
    }

    public final boolean S() {
        return this.zzl;
    }

    public final boolean T() {
        return (this.zzd & 2) != 0;
    }

    public final boolean U() {
        return (this.zzd & 1) != 0;
    }
}
