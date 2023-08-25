package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class gz8 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public gz8(List list, int i, int i2, int i3, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    public static gz8 a(ik5 ik5Var) {
        String str;
        int i;
        int i2;
        float f;
        try {
            ik5Var.g(4);
            int s = (ik5Var.s() & 3) + 1;
            if (s != 3) {
                ArrayList arrayList = new ArrayList();
                int s2 = ik5Var.s() & 31;
                for (int i3 = 0; i3 < s2; i3++) {
                    arrayList.add(b(ik5Var));
                }
                int s3 = ik5Var.s();
                for (int i4 = 0; i4 < s3; i4++) {
                    arrayList.add(b(ik5Var));
                }
                if (s2 > 0) {
                    b42 d = c42.d((byte[]) arrayList.get(0), s + 1, ((byte[]) arrayList.get(0)).length);
                    int i5 = d.e;
                    int i6 = d.f;
                    float f2 = d.g;
                    str = ar4.a(d.a, d.b, d.c);
                    i = i5;
                    i2 = i6;
                    f = f2;
                } else {
                    str = null;
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                }
                return new gz8(arrayList, s, i, i2, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw dl3.a("Error parsing AVC config", e);
        }
    }

    public static byte[] b(ik5 ik5Var) {
        int w = ik5Var.w();
        int k = ik5Var.k();
        ik5Var.g(w);
        return ar4.c(ik5Var.h(), k, w);
    }
}
