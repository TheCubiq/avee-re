package com.daaw;
/* loaded from: classes.dex */
public final class aj7 extends ls7 implements yt7 {
    private static final aj7 zzb;
    private int zzd;
    private gj7 zze;
    private yq7 zzf = yq7.f33966q;

    static {
        aj7 aj7Var = new aj7();
        zzb = aj7Var;
        ls7.m16597C(aj7.class, aj7Var);
    }

    /* renamed from: M */
    public static zi7 m27437M() {
        return (zi7) zzb.m16592H();
    }

    /* renamed from: O */
    public static aj7 m27435O(yq7 yq7Var, vr7 vr7Var) {
        return (aj7) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    /* renamed from: S */
    public static /* synthetic */ void m27431S(aj7 aj7Var, gj7 gj7Var) {
        gj7Var.getClass();
        aj7Var.zze = gj7Var;
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
                    return new zi7(null);
                }
                return new aj7();
            }
            return ls7.m16573z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m27438L() {
        return this.zzd;
    }

    /* renamed from: P */
    public final gj7 m27434P() {
        gj7 gj7Var = this.zze;
        return gj7Var == null ? gj7.m21554O() : gj7Var;
    }

    /* renamed from: Q */
    public final yq7 m27433Q() {
        return this.zzf;
    }
}
