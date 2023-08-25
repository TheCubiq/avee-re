package com.daaw;

import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class cj2 extends ls7 implements yt7 {
    private static final cj2 zzb;
    private int zzd;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        cj2 cj2Var = new cj2();
        zzb = cj2Var;
        ls7.m16597C(cj2.class, cj2Var);
    }

    /* renamed from: L */
    public static bj2 m25355L() {
        return (bj2) zzb.m16592H();
    }

    /* renamed from: N */
    public static /* synthetic */ void m25353N(cj2 cj2Var, long j) {
        cj2Var.zzd |= 1;
        cj2Var.zze = j;
    }

    /* renamed from: O */
    public static /* synthetic */ void m25352O(cj2 cj2Var, long j) {
        cj2Var.zzd |= 2;
        cj2Var.zzf = j;
    }

    /* renamed from: P */
    public static /* synthetic */ void m25351P(cj2 cj2Var, long j) {
        cj2Var.zzd |= 4;
        cj2Var.zzg = j;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m25350Q(cj2 cj2Var, long j) {
        cj2Var.zzd |= 8;
        cj2Var.zzh = j;
    }

    /* renamed from: R */
    public static /* synthetic */ void m25349R(cj2 cj2Var) {
        cj2Var.zzd &= -9;
        cj2Var.zzh = -1L;
    }

    /* renamed from: S */
    public static /* synthetic */ void m25348S(cj2 cj2Var, long j) {
        cj2Var.zzd |= 16;
        cj2Var.zzi = j;
    }

    /* renamed from: T */
    public static /* synthetic */ void m25347T(cj2 cj2Var, long j) {
        cj2Var.zzd |= 32;
        cj2Var.zzj = j;
    }

    /* renamed from: U */
    public static /* synthetic */ void m25346U(cj2 cj2Var, long j) {
        cj2Var.zzd |= 128;
        cj2Var.zzl = j;
    }

    /* renamed from: V */
    public static /* synthetic */ void m25345V(cj2 cj2Var, long j) {
        cj2Var.zzd |= 256;
        cj2Var.zzm = j;
    }

    /* renamed from: W */
    public static /* synthetic */ void m25344W(cj2 cj2Var, long j) {
        cj2Var.zzd |= 512;
        cj2Var.zzn = j;
    }

    /* renamed from: X */
    public static /* synthetic */ void m25343X(cj2 cj2Var, long j) {
        cj2Var.zzd |= 2048;
        cj2Var.zzp = j;
    }

    /* renamed from: Y */
    public static /* synthetic */ void m25342Y(cj2 cj2Var, long j) {
        cj2Var.zzd |= 4096;
        cj2Var.zzq = j;
    }

    /* renamed from: Z */
    public static /* synthetic */ void m25341Z(cj2 cj2Var, long j) {
        cj2Var.zzd |= 8192;
        cj2Var.zzr = j;
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m25340a0(cj2 cj2Var, long j) {
        cj2Var.zzd |= 16384;
        cj2Var.zzs = j;
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m25339b0(cj2 cj2Var, long j) {
        cj2Var.zzd |= 32768;
        cj2Var.zzt = j;
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m25338c0(cj2 cj2Var, long j) {
        cj2Var.zzd |= 65536;
        cj2Var.zzu = j;
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m25337d0(cj2 cj2Var, long j) {
        cj2Var.zzd |= 131072;
        cj2Var.zzv = j;
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m25336e0(cj2 cj2Var, long j) {
        cj2Var.zzd |= 262144;
        cj2Var.zzw = j;
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m25335f0(cj2 cj2Var, int i) {
        cj2Var.zzk = i - 1;
        cj2Var.zzd |= 64;
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m25334g0(cj2 cj2Var, int i) {
        cj2Var.zzo = i - 1;
        cj2Var.zzd |= NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
    }

    @Override // com.daaw.ls7
    /* renamed from: I */
    public final Object mo1768I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                ps7 ps7Var = lj2.f17481a;
                return ls7.m16573z(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", ps7Var, "zzl", "zzm", "zzn", "zzo", ps7Var, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new bj2(null);
            } else {
                return new cj2();
            }
        }
        return (byte) 1;
    }
}
