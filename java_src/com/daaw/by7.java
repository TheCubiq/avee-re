package com.daaw;
/* loaded from: classes.dex */
public final class by7 extends ls7 implements yt7 {
    private static final by7 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private yq7 zzg;
    private yq7 zzh;

    static {
        by7 by7Var = new by7();
        zzb = by7Var;
        ls7.m16597C(by7.class, by7Var);
    }

    public by7() {
        yq7 yq7Var = yq7.f33966q;
        this.zzg = yq7Var;
        this.zzh = yq7Var;
    }

    /* renamed from: L */
    public static zx7 m25733L() {
        return (zx7) zzb.m16592H();
    }

    /* renamed from: N */
    public static /* synthetic */ void m25731N(by7 by7Var, String str) {
        by7Var.zzd |= 2;
        by7Var.zzf = "image/png";
    }

    /* renamed from: O */
    public static /* synthetic */ void m25730O(by7 by7Var, yq7 yq7Var) {
        yq7Var.getClass();
        by7Var.zzd |= 4;
        by7Var.zzg = yq7Var;
    }

    /* renamed from: P */
    public static /* synthetic */ void m25729P(by7 by7Var, int i) {
        by7Var.zze = 1;
        by7Var.zzd = 1 | by7Var.zzd;
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
                    return new zx7(null);
                }
                return new by7();
            }
            return ls7.m16573z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", ay7.f4110a, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
