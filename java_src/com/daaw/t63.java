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
    private qs7 zzj = ls7.m16579t();
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
        ls7.m16597C(t63.class, t63Var);
    }

    /* renamed from: L */
    public static /* synthetic */ void m9515L(t63 t63Var, int i) {
        t63Var.zzm = i - 1;
        t63Var.zze |= 64;
    }

    /* renamed from: M */
    public static /* synthetic */ void m9514M(t63 t63Var, int i) {
        t63Var.zzn = i - 1;
        t63Var.zze |= 128;
    }

    /* renamed from: N */
    public static /* synthetic */ void m9513N(t63 t63Var, int i) {
        t63Var.zzp = i - 1;
        t63Var.zze |= 512;
    }

    /* renamed from: T */
    public static s63 m9507T() {
        return (s63) zzd.m16592H();
    }

    /* renamed from: V */
    public static t63 m9505V(byte[] bArr) {
        return (t63) ls7.m16583p(zzd, bArr);
    }

    /* renamed from: Y */
    public static /* synthetic */ void m9502Y(t63 t63Var, long j) {
        t63Var.zze |= 1;
        t63Var.zzf = j;
    }

    /* renamed from: Z */
    public static /* synthetic */ void m9501Z(t63 t63Var, long j) {
        t63Var.zze |= 4;
        t63Var.zzh = j;
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m9500a0(t63 t63Var, long j) {
        t63Var.zze |= 8;
        t63Var.zzi = j;
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m9499b0(t63 t63Var, Iterable iterable) {
        qs7 qs7Var = t63Var.zzj;
        if (!qs7Var.zzc()) {
            t63Var.zzj = ls7.m16578u(qs7Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            t63Var.zzj.mo12226i(((y43) it.next()).zza());
        }
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m9498c0(t63 t63Var, o63 o63Var) {
        o63Var.getClass();
        t63Var.zzk = o63Var;
        t63Var.zze |= 16;
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m9497d0(t63 t63Var, int i) {
        t63Var.zze |= 256;
        t63Var.zzo = i;
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m9496e0(t63 t63Var, x63 x63Var) {
        t63Var.zzq = x63Var.zza();
        t63Var.zze |= NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m9495f0(t63 t63Var, long j) {
        t63Var.zze |= 2048;
        t63Var.zzr = j;
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m9489l0(t63 t63Var, int i) {
        t63Var.zzg = i - 1;
        t63Var.zze |= 2;
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m9488m0(t63 t63Var, int i) {
        t63Var.zzl = i - 1;
        t63Var.zze |= 32;
    }

    @Override // com.daaw.ls7
    /* renamed from: I */
    public final Object mo1768I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                ps7 ps7Var = s53.f25879a;
                return ls7.m16573z(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", ps7Var, "zzh", "zzi", "zzj", y43.m4128b(), "zzk", "zzl", ps7Var, "zzm", ps7Var, "zzn", ps7Var, "zzo", "zzp", ps7Var, "zzq", x63.m5500b(), "zzr"});
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

    /* renamed from: O */
    public final int m9512O() {
        return this.zzo;
    }

    /* renamed from: P */
    public final long m9511P() {
        return this.zzi;
    }

    /* renamed from: Q */
    public final long m9510Q() {
        return this.zzh;
    }

    /* renamed from: R */
    public final long m9509R() {
        return this.zzf;
    }

    /* renamed from: S */
    public final o63 m9508S() {
        o63 o63Var = this.zzk;
        return o63Var == null ? o63.m14527N() : o63Var;
    }

    /* renamed from: W */
    public final x63 m9504W() {
        x63 m5501a = x63.m5501a(this.zzq);
        return m5501a == null ? x63.UNSPECIFIED : m5501a;
    }

    /* renamed from: X */
    public final List m9503X() {
        return new ss7(this.zzj, zzb);
    }

    /* renamed from: g0 */
    public final int m9494g0() {
        int m9519a = t53.m9519a(this.zzm);
        if (m9519a == 0) {
            return 1;
        }
        return m9519a;
    }

    /* renamed from: h0 */
    public final int m9493h0() {
        int m9519a = t53.m9519a(this.zzn);
        if (m9519a == 0) {
            return 1;
        }
        return m9519a;
    }

    /* renamed from: i0 */
    public final int m9492i0() {
        int m9519a = t53.m9519a(this.zzp);
        if (m9519a == 0) {
            return 1;
        }
        return m9519a;
    }

    /* renamed from: j0 */
    public final int m9491j0() {
        int m9519a = t53.m9519a(this.zzg);
        if (m9519a == 0) {
            return 1;
        }
        return m9519a;
    }

    /* renamed from: k0 */
    public final int m9490k0() {
        int m9519a = t53.m9519a(this.zzl);
        if (m9519a == 0) {
            return 1;
        }
        return m9519a;
    }
}
