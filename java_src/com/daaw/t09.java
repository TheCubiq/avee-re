package com.daaw;

import com.google.android.gms.internal.ads.zzbq;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class t09 {
    /* renamed from: a */
    public static zzbq m9666a(k09 k09Var, boolean z) {
        zzbq m6546a = new w32().m6546a(k09Var, z ? null : k72.f15737a);
        if (m6546a == null || m6546a.m1103a() == 0) {
            return null;
        }
        return m6546a;
    }

    /* renamed from: b */
    public static v09 m9665b(ik5 ik5Var) {
        ik5Var.m19715g(1);
        int m19701u = ik5Var.m19701u();
        long m19711k = ik5Var.m19711k() + m19701u;
        int i = m19701u / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long m19696z = ik5Var.m19696z();
            if (m19696z == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = m19696z;
            jArr2[i2] = ik5Var.m19696z();
            ik5Var.m19715g(2);
            i2++;
        }
        ik5Var.m19715g((int) (m19711k - ik5Var.m19711k()));
        return new v09(jArr, jArr2);
    }
}
