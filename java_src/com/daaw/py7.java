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
    private us7 zzk = ls7.w();
    private us7 zzl = ls7.w();
    private String zzm = "";
    private us7 zzp = ls7.w();
    private String zzq = "";
    private yq7 zzt = yq7.q;
    private String zzw = "";
    private us7 zzx = ls7.w();
    private us7 zzy = ls7.w();
    private us7 zzA = ls7.w();
    private String zzC = "";
    private us7 zzE = ls7.w();

    static {
        py7 py7Var = new py7();
        zzb = py7Var;
        ls7.C(py7.class, py7Var);
    }

    public static ex7 L() {
        return (ex7) zzb.H();
    }

    public static /* synthetic */ void Q(py7 py7Var, String str) {
        str.getClass();
        py7Var.zzd |= 4;
        py7Var.zzg = str;
    }

    public static /* synthetic */ void R(py7 py7Var, String str) {
        str.getClass();
        py7Var.zzd |= 8;
        py7Var.zzh = str;
    }

    public static /* synthetic */ void S(py7 py7Var, gx7 gx7Var) {
        gx7Var.getClass();
        py7Var.zzj = gx7Var;
        py7Var.zzd |= 32;
    }

    public static /* synthetic */ void T(py7 py7Var, jy7 jy7Var) {
        jy7Var.getClass();
        us7 us7Var = py7Var.zzk;
        if (!us7Var.zzc()) {
            py7Var.zzk = ls7.x(us7Var);
        }
        py7Var.zzk.add(jy7Var);
    }

    public static /* synthetic */ void U(py7 py7Var, String str) {
        py7Var.zzd |= 64;
        py7Var.zzm = str;
    }

    public static /* synthetic */ void V(py7 py7Var) {
        py7Var.zzd &= -65;
        py7Var.zzm = zzb.zzm;
    }

    public static /* synthetic */ void W(py7 py7Var, by7 by7Var) {
        by7Var.getClass();
        py7Var.zzn = by7Var;
        py7Var.zzd |= 128;
    }

    public static /* synthetic */ void X(py7 py7Var, ly7 ly7Var) {
        ly7Var.getClass();
        py7Var.zzu = ly7Var;
        py7Var.zzd |= 8192;
    }

    public static /* synthetic */ void Y(py7 py7Var, Iterable iterable) {
        us7 us7Var = py7Var.zzx;
        if (!us7Var.zzc()) {
            py7Var.zzx = ls7.x(us7Var);
        }
        hq7.g(iterable, py7Var.zzx);
    }

    public static /* synthetic */ void Z(py7 py7Var, Iterable iterable) {
        us7 us7Var = py7Var.zzy;
        if (!us7Var.zzc()) {
            py7Var.zzy = ls7.x(us7Var);
        }
        hq7.g(iterable, py7Var.zzy);
    }

    public static /* synthetic */ void a0(py7 py7Var, int i) {
        py7Var.zze = i - 1;
        py7Var.zzd |= 1;
    }

    @Override // com.daaw.ls7
    public final Object I(int i, Object obj, Object obj2) {
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
            return ls7.z(zzb, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0007\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", jy7.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", ey7.a, "zzf", dx7.a, "zzj", "zzm", "zzn", "zzt", "zzl", ty7.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zy7.class, "zzB", "zzC", "zzD", "zzE", ox7.class});
        }
        return Byte.valueOf(this.zzF);
    }

    public final String N() {
        return this.zzm;
    }

    public final String O() {
        return this.zzg;
    }

    public final List P() {
        return this.zzk;
    }
}
