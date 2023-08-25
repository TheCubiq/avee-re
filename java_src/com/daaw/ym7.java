package com.daaw;
@Deprecated
/* loaded from: classes.dex */
public final class ym7 extends ls7 implements yt7 {
    private static final ym7 zzb;
    private int zzf;
    private boolean zzg;
    private String zzd = "";
    private String zze = "";
    private String zzh = "";

    static {
        ym7 ym7Var = new ym7();
        zzb = ym7Var;
        ls7.C(ym7.class, ym7Var);
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
                    return new xm7(null);
                }
                return new ym7();
            }
            return ls7.z(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zzf;
    }

    public final String N() {
        return this.zzh;
    }

    public final String O() {
        return this.zzd;
    }

    public final String P() {
        return this.zze;
    }

    public final boolean Q() {
        return this.zzg;
    }
}
