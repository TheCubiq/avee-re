package com.daaw;
/* loaded from: classes.dex */
public final class v43 extends ls7 implements yt7 {
    private static final v43 zzb;
    private us7 zzd = ls7.m16576w();

    static {
        v43 v43Var = new v43();
        zzb = v43Var;
        ls7.m16597C(v43.class, v43Var);
    }

    /* renamed from: L */
    public static p43 m7458L() {
        return (p43) zzb.m16592H();
    }

    /* renamed from: N */
    public static /* synthetic */ void m7456N(v43 v43Var, o43 o43Var) {
        o43Var.getClass();
        us7 us7Var = v43Var.zzd;
        if (!us7Var.zzc()) {
            v43Var.zzd = ls7.m16575x(us7Var);
        }
        v43Var.zzd.add(o43Var);
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
                    return new p43(null);
                }
                return new v43();
            }
            return ls7.m16573z(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", o43.class});
        }
        return (byte) 1;
    }
}
