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
    private db8 zzh = ja8.m18667o();
    private db8 zzi = ja8.m18667o();
    private db8 zzj = ja8.m18667o();
    private String zzk = "";
    private db8 zzm = ja8.m18667o();
    private db8 zzn = ja8.m18667o();
    private String zzo = "";

    static {
        wd6 wd6Var = new wd6();
        zza = wd6Var;
        ja8.m18661v(wd6.class, wd6Var);
    }

    /* renamed from: H */
    public static tc6 m6149H() {
        return (tc6) zza.m18657z();
    }

    /* renamed from: J */
    public static wd6 m6147J() {
        return zza;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m6140Q(wd6 wd6Var, int i, qb6 qb6Var) {
        qb6Var.getClass();
        db8 db8Var = wd6Var.zzi;
        if (!db8Var.zzc()) {
            wd6Var.zzi = ja8.m18666p(db8Var);
        }
        wd6Var.zzi.set(i, qb6Var);
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
                    return new tc6(null);
                }
                return new wd6();
            }
            return ja8.m18664s(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", ii6.class, "zzi", qb6.class, "zzj", rn5.class, "zzk", "zzl", "zzm", rm7.class, "zzn", k96.class, "zzo"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m6153D() {
        return this.zzm.size();
    }

    /* renamed from: E */
    public final int m6152E() {
        return this.zzi.size();
    }

    /* renamed from: F */
    public final long m6151F() {
        return this.zze;
    }

    /* renamed from: G */
    public final qb6 m6150G(int i) {
        return (qb6) this.zzi.get(i);
    }

    /* renamed from: K */
    public final String m6146K() {
        return this.zzf;
    }

    /* renamed from: L */
    public final String m6145L() {
        return this.zzo;
    }

    /* renamed from: M */
    public final List m6144M() {
        return this.zzj;
    }

    /* renamed from: N */
    public final List m6143N() {
        return this.zzn;
    }

    /* renamed from: O */
    public final List m6142O() {
        return this.zzm;
    }

    /* renamed from: P */
    public final List m6141P() {
        return this.zzh;
    }

    /* renamed from: S */
    public final boolean m6138S() {
        return this.zzl;
    }

    /* renamed from: T */
    public final boolean m6137T() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: U */
    public final boolean m6136U() {
        return (this.zzd & 1) != 0;
    }
}
