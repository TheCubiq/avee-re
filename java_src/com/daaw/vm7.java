package com.daaw;
/* loaded from: classes.dex */
public final class vm7 extends ls7 implements yt7 {
    private static final vm7 zzb;
    private String zzd = "";
    private yq7 zze = yq7.q;
    private int zzf;

    static {
        vm7 vm7Var = new vm7();
        zzb = vm7Var;
        ls7.C(vm7.class, vm7Var);
    }

    public static um7 L() {
        return (um7) zzb.H();
    }

    public static vm7 N() {
        return zzb;
    }

    public static /* synthetic */ void R(vm7 vm7Var, String str) {
        str.getClass();
        vm7Var.zzd = str;
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
                    return new um7(null);
                }
                return new vm7();
            }
            return ls7.z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zn7 O() {
        zn7 a = zn7.a(this.zzf);
        return a == null ? zn7.UNRECOGNIZED : a;
    }

    public final yq7 P() {
        return this.zze;
    }

    public final String Q() {
        return this.zzd;
    }
}
