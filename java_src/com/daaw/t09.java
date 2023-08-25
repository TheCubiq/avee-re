package com.daaw;

import com.google.android.gms.internal.ads.zzbq;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class t09 {
    public static zzbq a(k09 k09Var, boolean z) {
        zzbq a = new w32().a(k09Var, z ? null : k72.a);
        if (a == null || a.a() == 0) {
            return null;
        }
        return a;
    }

    public static v09 b(ik5 ik5Var) {
        ik5Var.g(1);
        int u = ik5Var.u();
        long k = ik5Var.k() + u;
        int i = u / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long z = ik5Var.z();
            if (z == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = z;
            jArr2[i2] = ik5Var.z();
            ik5Var.g(2);
            i2++;
        }
        ik5Var.g((int) (k - ik5Var.k()));
        return new v09(jArr, jArr2);
    }
}
