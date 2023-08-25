package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class yz2 {

    /* renamed from: a */
    public final List f34290a;

    /* renamed from: b */
    public final int f34291b;

    public yz2(List list, int i) {
        this.f34290a = list;
        this.f34291b = i;
    }

    /* renamed from: a */
    public static yz2 m3019a(iz2 iz2Var) {
        try {
            iz2Var.m19224w(21);
            int m19240g = iz2Var.m19240g() & 3;
            int m19240g2 = iz2Var.m19240g();
            int m19244c = iz2Var.m19244c();
            int i = 0;
            for (int i2 = 0; i2 < m19240g2; i2++) {
                iz2Var.m19224w(1);
                int m19237j = iz2Var.m19237j();
                for (int i3 = 0; i3 < m19237j; i3++) {
                    int m19237j2 = iz2Var.m19237j();
                    i += m19237j2 + 4;
                    iz2Var.m19224w(m19237j2);
                }
            }
            iz2Var.m19225v(m19244c);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < m19240g2; i5++) {
                iz2Var.m19224w(1);
                int m19237j3 = iz2Var.m19237j();
                for (int i6 = 0; i6 < m19237j3; i6++) {
                    int m19237j4 = iz2Var.m19237j();
                    System.arraycopy(gz2.f11863a, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(iz2Var.f14125a, iz2Var.m19244c(), bArr, i7, m19237j4);
                    i4 = i7 + m19237j4;
                    iz2Var.m19224w(m19237j4);
                }
            }
            return new yz2(i == 0 ? null : Collections.singletonList(bArr), m19240g + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new eq2("Error parsing HEVC config", e);
        }
    }
}
