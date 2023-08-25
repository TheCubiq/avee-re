package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class q56 extends ja8 implements be8 {
    private static final q56 zza;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private db8 zzh = ja8.o();

    static {
        q56 q56Var = new q56();
        zza = q56Var;
        ja8.v(q56.class, q56Var);
    }

    public static q56 F() {
        return zza;
    }

    @Override // com.daaw.ja8
    public final Object C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new d16(null);
                }
                return new q56();
            }
            return ja8.s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", k36.a, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int D() {
        return this.zzh.size();
    }

    public final String G() {
        return this.zzf;
    }

    public final List H() {
        return this.zzh;
    }

    public final boolean I() {
        return this.zzg;
    }

    public final boolean J() {
        return (this.zzd & 4) != 0;
    }

    public final boolean K() {
        return (this.zzd & 2) != 0;
    }

    public final boolean L() {
        return (this.zzd & 1) != 0;
    }

    public final int M() {
        int a = n46.a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
