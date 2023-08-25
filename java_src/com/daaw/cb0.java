package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class cb0 {

    /* renamed from: a */
    public final List<byte[]> f5686a;

    /* renamed from: b */
    public final int f5687b;

    public cb0(List<byte[]> list, int i) {
        this.f5686a = list;
        this.f5687b = i;
    }

    /* renamed from: a */
    public static cb0 m25457a(rv0 rv0Var) {
        try {
            rv0Var.m10920K(21);
            int m10896x = rv0Var.m10896x() & 3;
            int m10896x2 = rv0Var.m10896x();
            int m10917c = rv0Var.m10917c();
            int i = 0;
            for (int i2 = 0; i2 < m10896x2; i2++) {
                rv0Var.m10920K(1);
                int m10927D = rv0Var.m10927D();
                for (int i3 = 0; i3 < m10927D; i3++) {
                    int m10927D2 = rv0Var.m10927D();
                    i += m10927D2 + 4;
                    rv0Var.m10920K(m10927D2);
                }
            }
            rv0Var.m10921J(m10917c);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < m10896x2; i5++) {
                rv0Var.m10920K(1);
                int m10927D3 = rv0Var.m10927D();
                for (int i6 = 0; i6 < m10927D3; i6++) {
                    int m10927D4 = rv0Var.m10927D();
                    byte[] bArr2 = sr0.f26545a;
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    System.arraycopy(rv0Var.f25637a, rv0Var.m10917c(), bArr, length, m10927D4);
                    i4 = length + m10927D4;
                    rv0Var.m10920K(m10927D4);
                }
            }
            return new cb0(i == 0 ? null : Collections.singletonList(bArr), m10896x + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new tv0("Error parsing HEVC config", e);
        }
    }
}
