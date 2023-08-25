package com.daaw;
/* loaded from: classes.dex */
public final class dj7 extends ls7 implements yt7 {
    private static final dj7 zzb;
    private gj7 zzd;
    private int zze;

    static {
        dj7 dj7Var = new dj7();
        zzb = dj7Var;
        ls7.m16597C(dj7.class, dj7Var);
    }

    /* renamed from: M */
    public static cj7 m24338M() {
        return (cj7) zzb.m16592H();
    }

    /* renamed from: O */
    public static dj7 m24336O(yq7 yq7Var, vr7 vr7Var) {
        return (dj7) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m24334Q(dj7 dj7Var, gj7 gj7Var) {
        gj7Var.getClass();
        dj7Var.zzd = gj7Var;
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
                    return new cj7(null);
                }
                return new dj7();
            }
            return ls7.m16573z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m24339L() {
        return this.zze;
    }

    /* renamed from: P */
    public final gj7 m24335P() {
        gj7 gj7Var = this.zzd;
        return gj7Var == null ? gj7.m21554O() : gj7Var;
    }
}
