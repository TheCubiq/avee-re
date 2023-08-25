package com.daaw;
/* loaded from: classes2.dex */
public final class ds5 extends ja8 implements be8 {
    private static final ds5 zza;
    private int zzd;
    private q56 zze;
    private tx5 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        ds5 ds5Var = new ds5();
        zza = ds5Var;
        ja8.m18661v(ds5.class, ds5Var);
    }

    /* renamed from: E */
    public static ds5 m24004E() {
        return zza;
    }

    /* renamed from: I */
    public static /* synthetic */ void m24000I(ds5 ds5Var, String str) {
        ds5Var.zzd |= 8;
        ds5Var.zzh = str;
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
                    return new ar5(null);
                }
                return new ds5();
            }
            return ja8.m18664s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final tx5 m24003F() {
        tx5 tx5Var = this.zzf;
        return tx5Var == null ? tx5.m8719E() : tx5Var;
    }

    /* renamed from: G */
    public final q56 m24002G() {
        q56 q56Var = this.zze;
        return q56Var == null ? q56.m12765F() : q56Var;
    }

    /* renamed from: H */
    public final String m24001H() {
        return this.zzh;
    }

    /* renamed from: J */
    public final boolean m23999J() {
        return this.zzg;
    }

    /* renamed from: K */
    public final boolean m23998K() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: L */
    public final boolean m23997L() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: M */
    public final boolean m23996M() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: N */
    public final boolean m23995N() {
        return (this.zzd & 1) != 0;
    }
}
