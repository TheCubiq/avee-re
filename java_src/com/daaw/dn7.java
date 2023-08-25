package com.daaw;

import java.io.InputStream;
import java.util.List;
/* loaded from: classes.dex */
public final class dn7 extends ls7 implements yt7 {
    private static final dn7 zzb;
    private int zzd;
    private us7 zze = ls7.w();

    static {
        dn7 dn7Var = new dn7();
        zzb = dn7Var;
        ls7.C(dn7.class, dn7Var);
    }

    public static an7 N() {
        return (an7) zzb.H();
    }

    public static dn7 P(InputStream inputStream, vr7 vr7Var) {
        return (dn7) ls7.r(zzb, inputStream, vr7Var);
    }

    public static dn7 Q(byte[] bArr, vr7 vr7Var) {
        return (dn7) ls7.s(zzb, bArr, vr7Var);
    }

    public static /* synthetic */ void T(dn7 dn7Var, cn7 cn7Var) {
        cn7Var.getClass();
        us7 us7Var = dn7Var.zze;
        if (!us7Var.zzc()) {
            dn7Var.zze = ls7.x(us7Var);
        }
        dn7Var.zze.add(cn7Var);
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
                    return new an7(null);
                }
                return new dn7();
            }
            return ls7.z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", cn7.class});
        }
        return (byte) 1;
    }

    public final int L() {
        return this.zze.size();
    }

    public final int M() {
        return this.zzd;
    }

    public final List R() {
        return this.zze;
    }
}
