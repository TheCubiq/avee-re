package com.daaw;

import java.util.Iterator;
import java.util.List;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class t63 extends ls7 implements yt7 {
    private static final rs7 zzb = new r63();
    private static final t63 zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private qs7 zzj = ls7.t();
    private o63 zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        t63 t63Var = new t63();
        zzd = t63Var;
        ls7.C(t63.class, t63Var);
    }

    public static /* synthetic */ void L(t63 t63Var, int i) {
        t63Var.zzm = i - 1;
        t63Var.zze |= 64;
    }

    public static /* synthetic */ void M(t63 t63Var, int i) {
        t63Var.zzn = i - 1;
        t63Var.zze |= 128;
    }

    public static /* synthetic */ void N(t63 t63Var, int i) {
        t63Var.zzp = i - 1;
        t63Var.zze |= 512;
    }

    public static s63 T() {
        return (s63) zzd.H();
    }

    public static t63 V(byte[] bArr) {
        return (t63) ls7.p(zzd, bArr);
    }

    public static /* synthetic */ void Y(t63 t63Var, long j) {
        t63Var.zze |= 1;
        t63Var.zzf = j;
    }

    public static /* synthetic */ void Z(t63 t63Var, long j) {
        t63Var.zze |= 4;
        t63Var.zzh = j;
    }

    public static /* synthetic */ void a0(t63 t63Var, long j) {
        t63Var.zze |= 8;
        t63Var.zzi = j;
    }

    public static /* synthetic */ void b0(t63 t63Var, Iterable iterable) {
        qs7 qs7Var = t63Var.zzj;
        if (!qs7Var.zzc()) {
            t63Var.zzj = ls7.u(qs7Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            t63Var.zzj.i(((y43) it.next()).zza());
        }
    }

    public static /* synthetic */ void c0(t63 t63Var, o63 o63Var) {
        o63Var.getClass();
        t63Var.zzk = o63Var;
        t63Var.zze |= 16;
    }

    public static /* synthetic */ void d0(t63 t63Var, int i) {
        t63Var.zze |= 256;
        t63Var.zzo = i;
    }

    public static /* synthetic */ void e0(t63 t63Var, x63 x63Var) {
        t63Var.zzq = x63Var.zza();
        t63Var.zze |= NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
    }

    public static /* synthetic */ void f0(t63 t63Var, long j) {
        t63Var.zze |= 2048;
        t63Var.zzr = j;
    }

    public static /* synthetic */ void l0(t63 t63Var, int i) {
        t63Var.zzg = i - 1;
        t63Var.zze |= 2;
    }

    public static /* synthetic */ void m0(t63 t63Var, int i) {
        t63Var.zzl = i - 1;
        t63Var.zze |= 32;
    }

    @Override // com.daaw.ls7
    public final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                ps7 ps7Var = s53.a;
                return ls7.z(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", ps7Var, "zzh", "zzi", "zzj", y43.b(), "zzk", "zzl", ps7Var, "zzm", ps7Var, "zzn", ps7Var, "zzo", "zzp", ps7Var, "zzq", x63.b(), "zzr"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzd;
                }
                return new s63(null);
            } else {
                return new t63();
            }
        }
        return (byte) 1;
    }

    public final int O() {
        return this.zzo;
    }

    public final long P() {
        return this.zzi;
    }

    public final long Q() {
        return this.zzh;
    }

    public final long R() {
        return this.zzf;
    }

    public final o63 S() {
        o63 o63Var = this.zzk;
        return o63Var == null ? o63.N() : o63Var;
    }

    public final x63 W() {
        x63 a = x63.a(this.zzq);
        return a == null ? x63.UNSPECIFIED : a;
    }

    public final List X() {
        return new ss7(this.zzj, zzb);
    }

    public final int g0() {
        int a = t53.a(this.zzm);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final int h0() {
        int a = t53.a(this.zzn);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final int i0() {
        int a = t53.a(this.zzp);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final int j0() {
        int a = t53.a(this.zzg);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final int k0() {
        int a = t53.a(this.zzl);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
