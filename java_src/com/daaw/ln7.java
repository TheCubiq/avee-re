package com.daaw;
/* loaded from: classes.dex */
public final class ln7 extends ls7 implements yt7 {
    private static final ln7 zzb;
    private int zzd;
    private on7 zze;

    static {
        ln7 ln7Var = new ln7();
        zzb = ln7Var;
        ls7.m16597C(ln7.class, ln7Var);
    }

    /* renamed from: M */
    public static kn7 m16711M() {
        return (kn7) zzb.m16592H();
    }

    /* renamed from: O */
    public static ln7 m16709O(yq7 yq7Var, vr7 vr7Var) {
        return (ln7) ls7.m16582q(zzb, yq7Var, vr7Var);
    }

    /* renamed from: R */
    public static /* synthetic */ void m16706R(ln7 ln7Var, on7 on7Var) {
        on7Var.getClass();
        ln7Var.zze = on7Var;
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
                    return new kn7(null);
                }
                return new ln7();
            }
            return ls7.m16573z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m16712L() {
        return this.zzd;
    }

    /* renamed from: P */
    public final on7 m16708P() {
        on7 on7Var = this.zze;
        return on7Var == null ? on7.m14125M() : on7Var;
    }
}
