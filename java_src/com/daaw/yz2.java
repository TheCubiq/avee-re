package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class yz2 {
    public final List a;
    public final int b;

    public yz2(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public static yz2 a(iz2 iz2Var) {
        try {
            iz2Var.w(21);
            int g = iz2Var.g() & 3;
            int g2 = iz2Var.g();
            int c = iz2Var.c();
            int i = 0;
            for (int i2 = 0; i2 < g2; i2++) {
                iz2Var.w(1);
                int j = iz2Var.j();
                for (int i3 = 0; i3 < j; i3++) {
                    int j2 = iz2Var.j();
                    i += j2 + 4;
                    iz2Var.w(j2);
                }
            }
            iz2Var.v(c);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < g2; i5++) {
                iz2Var.w(1);
                int j3 = iz2Var.j();
                for (int i6 = 0; i6 < j3; i6++) {
                    int j4 = iz2Var.j();
                    System.arraycopy(gz2.a, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(iz2Var.a, iz2Var.c(), bArr, i7, j4);
                    i4 = i7 + j4;
                    iz2Var.w(j4);
                }
            }
            return new yz2(i == 0 ? null : Collections.singletonList(bArr), g + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new eq2("Error parsing HEVC config", e);
        }
    }
}
