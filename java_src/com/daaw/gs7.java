package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class gs7 extends ja8 implements be8 {
    private static final gs7 zza;
    private int zzd;
    private int zze;
    private db8 zzf = ja8.m18667o();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        gs7 gs7Var = new gs7();
        zza = gs7Var;
        ja8.m18661v(gs7.class, gs7Var);
    }

    @Override // com.daaw.ja8
    /* renamed from: C */
    public final Object mo4853C(int i, Object obj, Object obj2) {
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
            return ja8.m18664s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", aq7.f3477a, "zzf", gs7.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final double m21252D() {
        return this.zzj;
    }

    /* renamed from: F */
    public final String m21250F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final String m21249G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final List m21248H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean m21247I() {
        return this.zzi;
    }

    /* renamed from: J */
    public final boolean m21246J() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: K */
    public final boolean m21245K() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: L */
    public final boolean m21244L() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: M */
    public final int m21243M() {
        int m24019a = dr7.m24019a(this.zze);
        if (m24019a == 0) {
            return 1;
        }
        return m24019a;
    }
}
