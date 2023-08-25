package com.daaw;
@Deprecated
/* loaded from: classes.dex */
public final class ym7 extends ls7 implements yt7 {
    private static final ym7 zzb;
    private int zzf;
    private boolean zzg;
    private String zzd = "";
    private String zze = "";
    private String zzh = "";

    static {
        ym7 ym7Var = new ym7();
        zzb = ym7Var;
        ls7.m16597C(ym7.class, ym7Var);
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
                    return new xm7(null);
                }
                return new ym7();
            }
            return ls7.m16573z(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m3505L() {
        return this.zzf;
    }

    /* renamed from: N */
    public final String m3503N() {
        return this.zzh;
    }

    /* renamed from: O */
    public final String m3502O() {
        return this.zzd;
    }

    /* renamed from: P */
    public final String m3501P() {
        return this.zze;
    }

    /* renamed from: Q */
    public final boolean m3500Q() {
        return this.zzg;
    }
}
