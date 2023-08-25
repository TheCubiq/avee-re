package com.daaw;
/* loaded from: classes.dex */
public final class on7 extends ls7 implements yt7 {
    private static final on7 zzb;
    private String zzd = "";

    static {
        on7 on7Var = new on7();
        zzb = on7Var;
        ls7.C(on7.class, on7Var);
    }

    public static on7 M() {
        return zzb;
    }

    public static on7 N(yq7 yq7Var, vr7 vr7Var) {
        return (on7) ls7.q(zzb, yq7Var, vr7Var);
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
                    return new nn7(null);
                }
                return new on7();
            }
            return ls7.z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final String O() {
        return this.zzd;
    }
}
