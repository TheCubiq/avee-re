package com.daaw;
/* loaded from: classes.dex */
public final class on7 extends ls7 implements yt7 {
    private static final on7 zzb;
    private String zzd = "";

    static {
        on7 on7Var = new on7();
        zzb = on7Var;
        ls7.m16597C(on7.class, on7Var);
    }

    /* renamed from: M */
    public static on7 m14125M() {
        return zzb;
    }

    /* renamed from: N */
    public static on7 m14124N(yq7 yq7Var, vr7 vr7Var) {
        return (on7) ls7.m16582q(zzb, yq7Var, vr7Var);
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
                    return new nn7(null);
                }
                return new on7();
            }
            return ls7.m16573z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    /* renamed from: O */
    public final String m14123O() {
        return this.zzd;
    }
}
