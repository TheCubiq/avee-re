package com.daaw;

import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class v53 extends ls7 implements yt7 {
    private static final v53 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private k73 zzi;
    private n53 zzk;
    private q53 zzl;
    private o63 zzm;
    private m43 zzn;
    private y63 zzo;
    private k83 zzp;
    private v43 zzq;
    private String zzf = "";
    private int zzh = 1000;
    private ts7 zzj = ls7.v();

    static {
        v53 v53Var = new v53();
        zzb = v53Var;
        ls7.C(v53.class, v53Var);
    }

    public static u53 N() {
        return (u53) zzb.H();
    }

    public static /* synthetic */ void Q(v53 v53Var, String str) {
        str.getClass();
        v53Var.zzd |= 2;
        v53Var.zzf = str;
    }

    public static /* synthetic */ void R(v53 v53Var, Iterable iterable) {
        ts7 ts7Var = v53Var.zzj;
        if (!ts7Var.zzc()) {
            int size = ts7Var.size();
            v53Var.zzj = ts7Var.a(size == 0 ? 10 : size + size);
        }
        hq7.g(iterable, v53Var.zzj);
    }

    public static /* synthetic */ void T(v53 v53Var, n53 n53Var) {
        n53Var.getClass();
        v53Var.zzk = n53Var;
        v53Var.zzd |= 32;
    }

    public static /* synthetic */ void U(v53 v53Var, m43 m43Var) {
        m43Var.getClass();
        v53Var.zzn = m43Var;
        v53Var.zzd |= 256;
    }

    public static /* synthetic */ void V(v53 v53Var, y63 y63Var) {
        y63Var.getClass();
        v53Var.zzo = y63Var;
        v53Var.zzd |= 512;
    }

    public static /* synthetic */ void W(v53 v53Var, k83 k83Var) {
        k83Var.getClass();
        v53Var.zzp = k83Var;
        v53Var.zzd |= NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
    }

    public static /* synthetic */ void X(v53 v53Var, v43 v43Var) {
        v43Var.getClass();
        v53Var.zzq = v43Var;
        v53Var.zzd |= 2048;
    }

    @Override // com.daaw.ls7
    public final Object I(int i, Object obj, Object obj2) {
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
                    return new u53(null);
                }
                return new v53();
            }
            return ls7.z(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", s53.a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        return (byte) 1;
    }

    public final m43 L() {
        m43 m43Var = this.zzn;
        return m43Var == null ? m43.M() : m43Var;
    }

    public final n53 M() {
        n53 n53Var = this.zzk;
        return n53Var == null ? n53.M() : n53Var;
    }

    public final String P() {
        return this.zzf;
    }
}
