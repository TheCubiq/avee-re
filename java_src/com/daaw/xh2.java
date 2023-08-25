package com.daaw;

import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class xh2 extends ls7 implements yt7 {
    private static final xh2 zzb;
    private int zzd;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private us7 zzp = ls7.m16576w();

    static {
        xh2 xh2Var = new xh2();
        zzb = xh2Var;
        ls7.m16597C(xh2.class, xh2Var);
    }

    /* renamed from: L */
    public static oh2 m5116L() {
        return (oh2) zzb.m16592H();
    }

    /* renamed from: N */
    public static /* synthetic */ void m5114N(xh2 xh2Var, long j) {
        xh2Var.zzd |= 2;
        xh2Var.zzf = j;
    }

    /* renamed from: O */
    public static /* synthetic */ void m5113O(xh2 xh2Var, String str) {
        str.getClass();
        xh2Var.zzd |= 4;
        xh2Var.zzg = str;
    }

    /* renamed from: P */
    public static /* synthetic */ void m5112P(xh2 xh2Var, String str) {
        str.getClass();
        xh2Var.zzd |= 8;
        xh2Var.zzh = str;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m5111Q(xh2 xh2Var, String str) {
        xh2Var.zzd |= 16;
        xh2Var.zzi = str;
    }

    /* renamed from: R */
    public static /* synthetic */ void m5110R(xh2 xh2Var, String str) {
        xh2Var.zzd |= NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
        xh2Var.zzo = str;
    }

    /* renamed from: S */
    public static /* synthetic */ void m5109S(xh2 xh2Var, String str) {
        str.getClass();
        xh2Var.zzd |= 1;
        xh2Var.zze = str;
    }

    /* renamed from: T */
    public static /* synthetic */ void m5108T(xh2 xh2Var, int i) {
        xh2Var.zzq = i - 1;
        xh2Var.zzd |= 2048;
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
                    return new oh2(null);
                }
                return new xh2();
            }
            return ls7.m16573z(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", qh2.class, "zzq", wh2.f31245a});
        }
        return (byte) 1;
    }
}
