package com.daaw;
/* loaded from: classes.dex */
public final class dj7 extends ls7 implements yt7 {
    private static final dj7 zzb;
    private gj7 zzd;
    private int zze;

    static {
        dj7 dj7Var = new dj7();
        zzb = dj7Var;
        ls7.C(dj7.class, dj7Var);
    }

    public static cj7 M() {
        return (cj7) zzb.H();
    }

    public static dj7 O(yq7 yq7Var, vr7 vr7Var) {
        return (dj7) ls7.q(zzb, yq7Var, vr7Var);
    }

    public static /* synthetic */ void Q(dj7 dj7Var, gj7 gj7Var) {
        gj7Var.getClass();
        dj7Var.zzd = gj7Var;
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
                    return new cj7(null);
                }
                return new dj7();
            }
            return ls7.z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zze;
    }

    public final gj7 P() {
        gj7 gj7Var = this.zzd;
        return gj7Var == null ? gj7.O() : gj7Var;
    }
}
