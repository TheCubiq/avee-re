package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class gs7 extends ja8 implements be8 {
    private static final gs7 zza;
    private int zzd;
    private int zze;
    private db8 zzf = ja8.o();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        gs7 gs7Var = new gs7();
        zza = gs7Var;
        ja8.v(gs7.class, gs7Var);
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
                    return new un7(null);
                }
                return new gs7();
            }
            return ja8.s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", aq7.a, "zzf", gs7.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final double D() {
        return this.zzj;
    }

    public final String F() {
        return this.zzg;
    }

    public final String G() {
        return this.zzh;
    }

    public final List H() {
        return this.zzf;
    }

    public final boolean I() {
        return this.zzi;
    }

    public final boolean J() {
        return (this.zzd & 8) != 0;
    }

    public final boolean K() {
        return (this.zzd & 16) != 0;
    }

    public final boolean L() {
        return (this.zzd & 4) != 0;
    }

    public final int M() {
        int a = dr7.a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
