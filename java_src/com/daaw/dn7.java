package com.daaw;

import java.io.InputStream;
import java.util.List;
/* loaded from: classes.dex */
public final class dn7 extends ls7 implements yt7 {
    private static final dn7 zzb;
    private int zzd;
    private us7 zze = ls7.m16576w();

    static {
        dn7 dn7Var = new dn7();
        zzb = dn7Var;
        ls7.m16597C(dn7.class, dn7Var);
    }

    /* renamed from: N */
    public static an7 m24205N() {
        return (an7) zzb.m16592H();
    }

    /* renamed from: P */
    public static dn7 m24203P(InputStream inputStream, vr7 vr7Var) {
        return (dn7) ls7.m16581r(zzb, inputStream, vr7Var);
    }

    /* renamed from: Q */
    public static dn7 m24202Q(byte[] bArr, vr7 vr7Var) {
        return (dn7) ls7.m16580s(zzb, bArr, vr7Var);
    }

    /* renamed from: T */
    public static /* synthetic */ void m24199T(dn7 dn7Var, cn7 cn7Var) {
        cn7Var.getClass();
        us7 us7Var = dn7Var.zze;
        if (!us7Var.zzc()) {
            dn7Var.zze = ls7.m16575x(us7Var);
        }
        dn7Var.zze.add(cn7Var);
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
                    return new an7(null);
                }
                return new dn7();
            }
            return ls7.m16573z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", cn7.class});
        }
        return (byte) 1;
    }

    /* renamed from: L */
    public final int m24207L() {
        return this.zze.size();
    }

    /* renamed from: M */
    public final int m24206M() {
        return this.zzd;
    }

    /* renamed from: R */
    public final List m24201R() {
        return this.zze;
    }
}
