package com.daaw;
/* loaded from: classes.dex */
public final class vk7 extends ls7 implements yt7 {
    private static final vk7 zzb;
    private el7 zzd;
    private pk7 zze;
    private int zzf;

    static {
        vk7 vk7Var = new vk7();
        zzb = vk7Var;
        ls7.m16597C(vk7.class, vk7Var);
    }

    /* renamed from: M */
    public static uk7 m7074M() {
        return (uk7) zzb.m16592H();
    }

    /* renamed from: O */
    public static vk7 m7072O() {
        return zzb;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m7070Q(vk7 vk7Var, el7 el7Var) {
        el7Var.getClass();
        vk7Var.zzd = el7Var;
    }

    /* renamed from: R */
    public static /* synthetic */ void m7069R(vk7 vk7Var, pk7 pk7Var) {
        pk7Var.getClass();
        vk7Var.zze = pk7Var;
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
                    return new uk7(null);
                }
                return new vk7();
            }
            return ls7.m16573z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final pk7 m7075L() {
        pk7 pk7Var = this.zze;
        return pk7Var == null ? pk7.m13318N() : pk7Var;
    }

    /* renamed from: P */
    public final el7 m7071P() {
        el7 el7Var = this.zzd;
        return el7Var == null ? el7.m23388N() : el7Var;
    }

    /* renamed from: S */
    public final int m7068S() {
        int i = this.zzf;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
