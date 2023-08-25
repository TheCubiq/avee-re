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
    private ts7 zzj = ls7.m16577v();

    static {
        v53 v53Var = new v53();
        zzb = v53Var;
        ls7.m16597C(v53.class, v53Var);
    }

    /* renamed from: N */
    public static u53 m7417N() {
        return (u53) zzb.m16592H();
    }

    /* renamed from: Q */
    public static /* synthetic */ void m7414Q(v53 v53Var, String str) {
        str.getClass();
        v53Var.zzd |= 2;
        v53Var.zzf = str;
    }

    /* renamed from: R */
    public static /* synthetic */ void m7413R(v53 v53Var, Iterable iterable) {
        ts7 ts7Var = v53Var.zzj;
        if (!ts7Var.zzc()) {
            int size = ts7Var.size();
            v53Var.zzj = ts7Var.mo8838a(size == 0 ? 10 : size + size);
        }
        hq7.m20483g(iterable, v53Var.zzj);
    }

    /* renamed from: T */
    public static /* synthetic */ void m7411T(v53 v53Var, n53 n53Var) {
        n53Var.getClass();
        v53Var.zzk = n53Var;
        v53Var.zzd |= 32;
    }

    /* renamed from: U */
    public static /* synthetic */ void m7410U(v53 v53Var, m43 m43Var) {
        m43Var.getClass();
        v53Var.zzn = m43Var;
        v53Var.zzd |= 256;
    }

    /* renamed from: V */
    public static /* synthetic */ void m7409V(v53 v53Var, y63 y63Var) {
        y63Var.getClass();
        v53Var.zzo = y63Var;
        v53Var.zzd |= 512;
    }

    /* renamed from: W */
    public static /* synthetic */ void m7408W(v53 v53Var, k83 k83Var) {
        k83Var.getClass();
        v53Var.zzp = k83Var;
        v53Var.zzd |= NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
    }

    /* renamed from: X */
    public static /* synthetic */ void m7407X(v53 v53Var, v43 v43Var) {
        v43Var.getClass();
        v53Var.zzq = v43Var;
        v53Var.zzd |= 2048;
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
                    return new u53(null);
                }
                return new v53();
            }
            return ls7.m16573z(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", s53.f25879a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final m43 m7419L() {
        m43 m43Var = this.zzn;
        return m43Var == null ? m43.m16216M() : m43Var;
    }

    /* renamed from: M */
    public final n53 m7418M() {
        n53 n53Var = this.zzk;
        return n53Var == null ? n53.m15518M() : n53Var;
    }

    /* renamed from: P */
    public final String m7415P() {
        return this.zzf;
    }
}
