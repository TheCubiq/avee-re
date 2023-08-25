package com.daaw;

import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public final class co7 extends ls7 implements yt7 {
    private static final co7 zzb;
    private String zzd = "";
    private us7 zze = ls7.w();

    static {
        co7 co7Var = new co7();
        zzb = co7Var;
        ls7.C(co7.class, co7Var);
    }

    public static co7 M() {
        return zzb;
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
                    return new bo7(null);
                }
                return new co7();
            }
            return ls7.z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", ym7.class});
        }
        return (byte) 1;
    }

    public final List N() {
        return this.zze;
    }
}
