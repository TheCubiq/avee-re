package com.daaw;
/* loaded from: classes.dex */
public final class m43 extends ls7 implements yt7 {
    private static final m43 zzb;
    private int zzd;
    private int zze;
    private c53 zzg;
    private j53 zzh;
    private l53 zzj;
    private a73 zzk;
    private q63 zzl;
    private z53 zzm;
    private b63 zzn;
    private int zzf = 1000;
    private us7 zzi = ls7.m16576w();
    private us7 zzo = ls7.m16576w();

    static {
        m43 m43Var = new m43();
        zzb = m43Var;
        ls7.m16597C(m43.class, m43Var);
    }

    /* renamed from: M */
    public static m43 m16216M() {
        return zzb;
    }

    /* renamed from: O */
    public static /* synthetic */ void m16214O(m43 m43Var, k43 k43Var) {
        m43Var.zze = k43Var.zza();
        m43Var.zzd |= 1;
    }

    /* renamed from: P */
    public static /* synthetic */ void m16213P(m43 m43Var, j53 j53Var) {
        j53Var.getClass();
        m43Var.zzh = j53Var;
        m43Var.zzd |= 8;
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
                    return new l43(null);
                }
                return new m43();
            }
            return ls7.m16573z(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", k43.m18048b(), "zzf", s53.f25879a, "zzg", "zzh", "zzi", a53.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", m73.class});
        }
        return (byte) 1;
    }

    /* renamed from: N */
    public final j53 m16215N() {
        j53 j53Var = this.zzh;
        return j53Var == null ? j53.m18859M() : j53Var;
    }
}
