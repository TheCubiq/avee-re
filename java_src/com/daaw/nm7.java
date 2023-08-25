package com.daaw;
/* loaded from: classes.dex */
public final class nm7 extends ls7 implements yt7 {
    private static final nm7 zzb;
    private String zzd = "";
    private yq7 zze = yq7.f33966q;
    private int zzf;

    static {
        nm7 nm7Var = new nm7();
        zzb = nm7Var;
        ls7.m16597C(nm7.class, nm7Var);
    }

    /* renamed from: L */
    public static km7 m15034L() {
        return (km7) zzb.m16592H();
    }

    /* renamed from: O */
    public static nm7 m15031O() {
        return zzb;
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
                    return new km7(null);
                }
                return new nm7();
            }
            return ls7.m16573z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: M */
    public final mm7 m15033M() {
        mm7 m15931a = mm7.m15931a(this.zzf);
        return m15931a == null ? mm7.UNRECOGNIZED : m15931a;
    }

    /* renamed from: P */
    public final yq7 m15030P() {
        return this.zze;
    }

    /* renamed from: Q */
    public final String m15029Q() {
        return this.zzd;
    }
}
