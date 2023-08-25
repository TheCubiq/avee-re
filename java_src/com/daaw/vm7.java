package com.daaw;
/* loaded from: classes.dex */
public final class vm7 extends ls7 implements yt7 {
    private static final vm7 zzb;
    private String zzd = "";
    private yq7 zze = yq7.f33966q;
    private int zzf;

    static {
        vm7 vm7Var = new vm7();
        zzb = vm7Var;
        ls7.m16597C(vm7.class, vm7Var);
    }

    /* renamed from: L */
    public static um7 m7028L() {
        return (um7) zzb.m16592H();
    }

    /* renamed from: N */
    public static vm7 m7026N() {
        return zzb;
    }

    /* renamed from: R */
    public static /* synthetic */ void m7022R(vm7 vm7Var, String str) {
        str.getClass();
        vm7Var.zzd = str;
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
                    return new um7(null);
                }
                return new vm7();
            }
            return ls7.m16573z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    /* renamed from: O */
    public final zn7 m7025O() {
        zn7 m2096a = zn7.m2096a(this.zzf);
        return m2096a == null ? zn7.UNRECOGNIZED : m2096a;
    }

    /* renamed from: P */
    public final yq7 m7024P() {
        return this.zze;
    }

    /* renamed from: Q */
    public final String m7023Q() {
        return this.zzd;
    }
}
