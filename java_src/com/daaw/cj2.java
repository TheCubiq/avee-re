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
        ls7.C(cj2.class, cj2Var);
    }

    public static bj2 L() {
        return (bj2) zzb.H();
    }

    public static /* synthetic */ void N(cj2 cj2Var, long j) {
        cj2Var.zzd |= 1;
        cj2Var.zze = j;
    }

    public static /* synthetic */ void O(cj2 cj2Var, long j) {
        cj2Var.zzd |= 2;
        cj2Var.zzf = j;
    }

    public static /* synthetic */ void P(cj2 cj2Var, long j) {
        cj2Var.zzd |= 4;
        cj2Var.zzg = j;
    }

    public static /* synthetic */ void Q(cj2 cj2Var, long j) {
        cj2Var.zzd |= 8;
        cj2Var.zzh = j;
    }

    public static /* synthetic */ void R(cj2 cj2Var) {
        cj2Var.zzd &= -9;
        cj2Var.zzh = -1L;
    }

    public static /* synthetic */ void S(cj2 cj2Var, long j) {
        cj2Var.zzd |= 16;
        cj2Var.zzi = j;
    }

    public static /* synthetic */ void T(cj2 cj2Var, long j) {
        cj2Var.zzd |= 32;
        cj2Var.zzj = j;
    }

    public static /* synthetic */ void U(cj2 cj2Var, long j) {
        cj2Var.zzd |= 128;
        cj2Var.zzl = j;
    }

    public static /* synthetic */ void V(cj2 cj2Var, long j) {
        cj2Var.zzd |= 256;
        cj2Var.zzm = j;
    }

    public static /* synthetic */ void W(cj2 cj2Var, long j) {
        cj2Var.zzd |= 512;
        cj2Var.zzn = j;
    }

    public static /* synthetic */ void X(cj2 cj2Var, long j) {
        cj2Var.zzd |= 2048;
        cj2Var.zzp = j;
    }

    public static /* synthetic */ void Y(cj2 cj2Var, long j) {
        cj2Var.zzd |= 4096;
        cj2Var.zzq = j;
    }

    public static /* synthetic */ void Z(cj2 cj2Var, long j) {
        cj2Var.zzd |= 8192;
        cj2Var.zzr = j;
    }

    public static /* synthetic */ void a0(cj2 cj2Var, long j) {
        cj2Var.zzd |= 16384;
        cj2Var.zzs = j;
    }

    public static /* synthetic */ void b0(cj2 cj2Var, long j) {
        cj2Var.zzd |= 32768;
        cj2Var.zzt = j;
    }

    public static /* synthetic */ void c0(cj2 cj2Var, long j) {
        cj2Var.zzd |= 65536;
        cj2Var.zzu = j;
    }

    public static /* synthetic */ void d0(cj2 cj2Var, long j) {
        cj2Var.zzd |= 131072;
        cj2Var.zzv = j;
    }

    public static /* synthetic */ void e0(cj2 cj2Var, long j) {
        cj2Var.zzd |= 262144;
        cj2Var.zzw = j;
    }

    public static /* synthetic */ void f0(cj2 cj2Var, int i) {
        cj2Var.zzk = i - 1;
        cj2Var.zzd |= 64;
    }

    public static /* synthetic */ void g0(cj2 cj2Var, int i) {
        cj2Var.zzo = i - 1;
        cj2Var.zzd |= NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
    }

    @Override // com.daaw.ls7
    public final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                ps7 ps7Var = lj2.a;
                return ls7.z(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", ps7Var, "zzl", "zzm", "zzn", "zzo", ps7Var, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
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
