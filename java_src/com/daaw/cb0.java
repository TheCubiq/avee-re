package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class cb0 {
    public final List<byte[]> a;
    public final int b;

    public cb0(List<byte[]> list, int i) {
        this.a = list;
        this.b = i;
    }

    public static cb0 a(rv0 rv0Var) {
        try {
            rv0Var.K(21);
            int x = rv0Var.x() & 3;
            int x2 = rv0Var.x();
            int c = rv0Var.c();
            int i = 0;
            for (int i2 = 0; i2 < x2; i2++) {
                rv0Var.K(1);
                int D = rv0Var.D();
                for (int i3 = 0; i3 < D; i3++) {
                    int D2 = rv0Var.D();
                    i += D2 + 4;
                    rv0Var.K(D2);
                }
            }
            rv0Var.J(c);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < x2; i5++) {
                rv0Var.K(1);
                int D3 = rv0Var.D();
                for (int i6 = 0; i6 < D3; i6++) {
                    int D4 = rv0Var.D();
                    byte[] bArr2 = sr0.a;
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    System.arraycopy(rv0Var.a, rv0Var.c(), bArr, length, D4);
                    i4 = length + D4;
                    rv0Var.K(D4);
                }
            }
            return new cb0(i == 0 ? null : Collections.singletonList(bArr), x + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new tv0("Error parsing HEVC config", e);
        }
    }
}
