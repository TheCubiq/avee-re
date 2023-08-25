package com.daaw;

import com.daaw.sr0;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.y9 */
/* loaded from: classes.dex */
public final class C3681y9 {

    /* renamed from: a */
    public final List<byte[]> f33429a;

    /* renamed from: b */
    public final int f33430b;

    /* renamed from: c */
    public final int f33431c;

    /* renamed from: d */
    public final int f33432d;

    /* renamed from: e */
    public final float f33433e;

    public C3681y9(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f33429a = list;
        this.f33430b = i;
        this.f33431c = i2;
        this.f33432d = i3;
        this.f33433e = f;
    }

    /* renamed from: a */
    public static byte[] m3999a(rv0 rv0Var) {
        int m10927D = rv0Var.m10927D();
        int m10917c = rv0Var.m10917c();
        rv0Var.m10920K(m10927D);
        return C1183eg.m23491c(rv0Var.f25637a, m10917c, m10927D);
    }

    /* renamed from: b */
    public static C3681y9 m3998b(rv0 rv0Var) {
        int i;
        int i2;
        float f;
        try {
            rv0Var.m10920K(4);
            int m10896x = (rv0Var.m10896x() & 3) + 1;
            if (m10896x != 3) {
                ArrayList arrayList = new ArrayList();
                int m10896x2 = rv0Var.m10896x() & 31;
                for (int i3 = 0; i3 < m10896x2; i3++) {
                    arrayList.add(m3999a(rv0Var));
                }
                int m10896x3 = rv0Var.m10896x();
                for (int i4 = 0; i4 < m10896x3; i4++) {
                    arrayList.add(m3999a(rv0Var));
                }
                if (m10896x2 > 0) {
                    sr0.C2969b m9970i = sr0.m9970i((byte[]) arrayList.get(0), m10896x, ((byte[]) arrayList.get(0)).length);
                    int i5 = m9970i.f26553b;
                    int i6 = m9970i.f26554c;
                    f = m9970i.f26555d;
                    i = i5;
                    i2 = i6;
                } else {
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                }
                return new C3681y9(arrayList, m10896x, i, i2, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new tv0("Error parsing AVC config", e);
        }
    }
}
