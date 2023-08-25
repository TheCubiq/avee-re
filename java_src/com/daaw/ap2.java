package com.daaw;
/* loaded from: classes.dex */
public final class ap2 extends ls7 implements yt7 {
    private static final ap2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        ap2 ap2Var = new ap2();
        zzb = ap2Var;
        ls7.m16597C(ap2.class, ap2Var);
    }

    /* renamed from: O */
    public static zo2 m27262O() {
        return (zo2) zzb.m16592H();
    }

    /* renamed from: Q */
    public static ap2 m27260Q() {
        return zzb;
    }

    /* renamed from: R */
    public static ap2 m27259R(yq7 yq7Var) {
        return (ap2) ls7.m16584o(zzb, yq7Var);
    }

    /* renamed from: S */
    public static ap2 m27258S(yq7 yq7Var, vr7 vr7Var) {
        return (ap2) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    /* renamed from: V */
    public static /* synthetic */ void m27255V(ap2 ap2Var, String str) {
        str.getClass();
        ap2Var.zzd |= 1;
        ap2Var.zze = str;
    }

    /* renamed from: W */
    public static /* synthetic */ void m27254W(ap2 ap2Var, long j) {
        ap2Var.zzd |= 16;
        ap2Var.zzi = j;
    }

    /* renamed from: X */
    public static /* synthetic */ void m27253X(ap2 ap2Var, String str) {
        str.getClass();
        ap2Var.zzd |= 2;
        ap2Var.zzf = str;
    }

    /* renamed from: Y */
    public static /* synthetic */ void m27252Y(ap2 ap2Var, long j) {
        ap2Var.zzd |= 4;
        ap2Var.zzg = j;
    }

    /* renamed from: Z */
    public static /* synthetic */ void m27251Z(ap2 ap2Var, long j) {
        ap2Var.zzd |= 8;
        ap2Var.zzh = j;
    }

    @Override // com.daaw.ls7
    /* renamed from: I */
    public final Object mo1768I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zo2(null);
                }
                return new ap2();
            }
            return ls7.m16573z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final long m27265L() {
        return this.zzh;
    }

    /* renamed from: M */
    public final long m27264M() {
        return this.zzg;
    }

    /* renamed from: N */
    public final long m27263N() {
        return this.zzi;
    }

    /* renamed from: T */
    public final String m27257T() {
        return this.zzf;
    }

    /* renamed from: U */
    public final String m27256U() {
        return this.zze;
    }
}
