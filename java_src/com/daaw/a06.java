package com.daaw;
/* loaded from: classes2.dex */
public final class a06 extends ja8 implements be8 {
    private static final a06 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private ds5 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        a06 a06Var = new a06();
        zza = a06Var;
        ja8.m18661v(a06.class, a06Var);
    }

    /* renamed from: F */
    public static wy5 m27763F() {
        return (wy5) zza.m18657z();
    }

    /* renamed from: I */
    public static /* synthetic */ void m27760I(a06 a06Var, String str) {
        a06Var.zzd |= 2;
        a06Var.zzf = str;
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
                    return new wy5(null);
                }
                return new a06();
            }
            return ja8.m18664s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m27765D() {
        return this.zze;
    }

    /* renamed from: E */
    public final ds5 m27764E() {
        ds5 ds5Var = this.zzg;
        return ds5Var == null ? ds5.m24004E() : ds5Var;
    }

    /* renamed from: H */
    public final String m27761H() {
        return this.zzf;
    }

    /* renamed from: J */
    public final boolean m27759J() {
        return this.zzh;
    }

    /* renamed from: K */
    public final boolean m27758K() {
        return this.zzi;
    }

    /* renamed from: L */
    public final boolean m27757L() {
        return this.zzj;
    }

    /* renamed from: M */
    public final boolean m27756M() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: N */
    public final boolean m27755N() {
        return (this.zzd & 32) != 0;
    }
}
