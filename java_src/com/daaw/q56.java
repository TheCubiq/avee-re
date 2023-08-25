package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class q56 extends ja8 implements be8 {
    private static final q56 zza;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private db8 zzh = ja8.m18667o();

    static {
        q56 q56Var = new q56();
        zza = q56Var;
        ja8.m18661v(q56.class, q56Var);
    }

    /* renamed from: F */
    public static q56 m12765F() {
        return zza;
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
                    return new d16(null);
                }
                return new q56();
            }
            return ja8.m18664s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", k36.f15640a, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m12767D() {
        return this.zzh.size();
    }

    /* renamed from: G */
    public final String m12764G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final List m12763H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final boolean m12762I() {
        return this.zzg;
    }

    /* renamed from: J */
    public final boolean m12761J() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: K */
    public final boolean m12760K() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: L */
    public final boolean m12759L() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: M */
    public final int m12758M() {
        int m15524a = n46.m15524a(this.zze);
        if (m15524a == 0) {
            return 1;
        }
        return m15524a;
    }
}
