package com.daaw;

import com.daaw.sr0;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class y9 {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public y9(List<byte[]> list, int i, int i2, int i3, float f) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    public static byte[] a(rv0 rv0Var) {
        int D = rv0Var.D();
        int c = rv0Var.c();
        rv0Var.K(D);
        return eg.c(rv0Var.a, c, D);
    }

    public static y9 b(rv0 rv0Var) {
        int i;
        int i2;
        float f;
        try {
            rv0Var.K(4);
            int x = (rv0Var.x() & 3) + 1;
            if (x != 3) {
                ArrayList arrayList = new ArrayList();
                int x2 = rv0Var.x() & 31;
                for (int i3 = 0; i3 < x2; i3++) {
                    arrayList.add(a(rv0Var));
                }
                int x3 = rv0Var.x();
                for (int i4 = 0; i4 < x3; i4++) {
                    arrayList.add(a(rv0Var));
                }
                if (x2 > 0) {
                    sr0.b i5 = sr0.i((byte[]) arrayList.get(0), x, ((byte[]) arrayList.get(0)).length);
                    int i6 = i5.b;
                    int i7 = i5.c;
                    f = i5.d;
                    i = i6;
                    i2 = i7;
                } else {
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                }
                return new y9(arrayList, x, i, i2, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new tv0("Error parsing AVC config", e);
        }
    }
}
