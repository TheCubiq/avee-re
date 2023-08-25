package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class py7 extends ls7 implements yt7 {
    private static final py7 zzb;
    private kx7 zzB;
    private cx7 zzD;
    private int zzd;
    private int zze;
    private int zzf;
    private gx7 zzj;
    private by7 zzn;
    private boolean zzo;
    private boolean zzr;
    private boolean zzs;
    private ly7 zzu;
    private boolean zzv;
    private oy7 zzz;
    private byte zzF = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private us7 zzk = ls7.m16576w();
    private us7 zzl = ls7.m16576w();
    private String zzm = "";
    private us7 zzp = ls7.m16576w();
    private String zzq = "";
    private yq7 zzt = yq7.f33966q;
    private String zzw = "";
    private us7 zzx = ls7.m16576w();
    private us7 zzy = ls7.m16576w();
    private us7 zzA = ls7.m16576w();
    private String zzC = "";
    private us7 zzE = ls7.m16576w();

    static {
        py7 py7Var = new py7();
        zzb = py7Var;
        ls7.m16597C(py7.class, py7Var);
    }

    /* renamed from: L */
    public static ex7 m12866L() {
        return (ex7) zzb.m16592H();
    }

    /* renamed from: Q */
    public static /* synthetic */ void m12861Q(py7 py7Var, String str) {
        str.getClass();
        py7Var.zzd |= 4;
        py7Var.zzg = str;
    }

    /* renamed from: R */
    public static /* synthetic */ void m12860R(py7 py7Var, String str) {
        str.getClass();
        py7Var.zzd |= 8;
        py7Var.zzh = str;
    }

    /* renamed from: S */
    public static /* synthetic */ void m12859S(py7 py7Var, gx7 gx7Var) {
        gx7Var.getClass();
        py7Var.zzj = gx7Var;
        py7Var.zzd |= 32;
    }

    /* renamed from: T */
    public static /* synthetic */ void m12858T(py7 py7Var, jy7 jy7Var) {
        jy7Var.getClass();
        us7 us7Var = py7Var.zzk;
        if (!us7Var.zzc()) {
            py7Var.zzk = ls7.m16575x(us7Var);
        }
        py7Var.zzk.add(jy7Var);
    }

    /* renamed from: U */
    public static /* synthetic */ void m12857U(py7 py7Var, String str) {
        py7Var.zzd |= 64;
        py7Var.zzm = str;
    }

    /* renamed from: V */
    public static /* synthetic */ void m12856V(py7 py7Var) {
        py7Var.zzd &= -65;
        py7Var.zzm = zzb.zzm;
    }

    /* renamed from: W */
    public static /* synthetic */ void m12855W(py7 py7Var, by7 by7Var) {
        by7Var.getClass();
        py7Var.zzn = by7Var;
        py7Var.zzd |= 128;
    }

    /* renamed from: X */
    public static /* synthetic */ void m12854X(py7 py7Var, ly7 ly7Var) {
        ly7Var.getClass();
        py7Var.zzu = ly7Var;
        py7Var.zzd |= 8192;
    }

    /* renamed from: Y */
    public static /* synthetic */ void m12853Y(py7 py7Var, Iterable iterable) {
        us7 us7Var = py7Var.zzx;
        if (!us7Var.zzc()) {
            py7Var.zzx = ls7.m16575x(us7Var);
        }
        hq7.m20483g(iterable, py7Var.zzx);
    }

    /* renamed from: Z */
    public static /* synthetic */ void m12852Z(py7 py7Var, Iterable iterable) {
        us7 us7Var = py7Var.zzy;
        if (!us7Var.zzc()) {
            py7Var.zzy = ls7.m16575x(us7Var);
        }
        hq7.m20483g(iterable, py7Var.zzy);
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m12851a0(py7 py7Var, int i) {
        py7Var.zze = i - 1;
        py7Var.zzd |= 1;
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
                            this.zzF = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new ex7(null);
                }
                return new py7();
            }
            return ls7.m16573z(zzb, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0007\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", jy7.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", ey7.f8955a, "zzf", dx7.f7968a, "zzj", "zzm", "zzn", "zzt", "zzl", ty7.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zy7.class, "zzB", "zzC", "zzD", "zzE", ox7.class});
        }
        return Byte.valueOf(this.zzF);
    }

    /* renamed from: N */
    public final String m12864N() {
        return this.zzm;
    }

    /* renamed from: O */
    public final String m12863O() {
        return this.zzg;
    }

    /* renamed from: P */
    public final List m12862P() {
        return this.zzk;
    }
}
