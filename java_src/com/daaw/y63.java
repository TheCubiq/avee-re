package com.daaw;
/* loaded from: classes.dex */
public final class y63 extends ls7 implements yt7 {
    private static final y63 zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private us7 zze = ls7.m16576w();
    private String zzi = "";
    private String zzj = "";

    static {
        y63 y63Var = new y63();
        zzb = y63Var;
        ls7.m16597C(y63.class, y63Var);
    }

    /* renamed from: L */
    public static u63 m4082L() {
        return (u63) zzb.m16592H();
    }

    /* renamed from: N */
    public static /* synthetic */ void m4080N(y63 y63Var, Iterable iterable) {
        us7 us7Var = y63Var.zze;
        if (!us7Var.zzc()) {
            y63Var.zze = ls7.m16575x(us7Var);
        }
        hq7.m20483g(iterable, y63Var.zze);
    }

    /* renamed from: O */
    public static /* synthetic */ void m4079O(y63 y63Var, int i) {
        y63Var.zzd |= 1;
        y63Var.zzf = i;
    }

    /* renamed from: P */
    public static /* synthetic */ void m4078P(y63 y63Var, int i) {
        y63Var.zzd |= 2;
        y63Var.zzg = i;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m4077Q(y63 y63Var, long j) {
        y63Var.zzd |= 4;
        y63Var.zzh = j;
    }

    /* renamed from: R */
    public static /* synthetic */ void m4076R(y63 y63Var, String str) {
        str.getClass();
        y63Var.zzd |= 8;
        y63Var.zzi = str;
    }

    /* renamed from: S */
    public static /* synthetic */ void m4075S(y63 y63Var, String str) {
        str.getClass();
        y63Var.zzd |= 16;
        y63Var.zzj = str;
    }

    /* renamed from: T */
    public static /* synthetic */ void m4074T(y63 y63Var, long j) {
        y63Var.zzd |= 32;
        y63Var.zzk = j;
    }

    /* renamed from: U */
    public static /* synthetic */ void m4073U(y63 y63Var, int i) {
        y63Var.zzd |= 64;
        y63Var.zzl = i;
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
                    return new u63(null);
                }
                return new y63();
            }
            return ls7.m16573z(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", t63.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
