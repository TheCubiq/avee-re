package com.daaw;
/* loaded from: classes2.dex */
public final class tx5 extends ja8 implements be8 {
    private static final tx5 zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        tx5 tx5Var = new tx5();
        zza = tx5Var;
        ja8.m18661v(tx5.class, tx5Var);
    }

    /* renamed from: E */
    public static tx5 m8719E() {
        return zza;
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
                    return new gt5(null);
                }
                return new tx5();
            }
            return ja8.m18664s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", mv5.f19170a, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final String m8718F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final String m8717G() {
        return this.zzi;
    }

    /* renamed from: H */
    public final String m8716H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final boolean m8715I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final boolean m8714J() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: K */
    public final boolean m8713K() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: L */
    public final boolean m8712L() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: M */
    public final boolean m8711M() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: N */
    public final boolean m8710N() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: O */
    public final int m8709O() {
        int m12971a = pw5.m12971a(this.zze);
        if (m12971a == 0) {
            return 1;
        }
        return m12971a;
    }
}
