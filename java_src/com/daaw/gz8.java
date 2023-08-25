package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class gz8 {

    /* renamed from: a */
    public final List f11899a;

    /* renamed from: b */
    public final int f11900b;

    /* renamed from: c */
    public final int f11901c;

    /* renamed from: d */
    public final int f11902d;

    /* renamed from: e */
    public final float f11903e;

    /* renamed from: f */
    public final String f11904f;

    public gz8(List list, int i, int i2, int i3, float f, String str) {
        this.f11899a = list;
        this.f11900b = i;
        this.f11901c = i2;
        this.f11902d = i3;
        this.f11903e = f;
        this.f11904f = str;
    }

    /* renamed from: a */
    public static gz8 m21127a(ik5 ik5Var) {
        String str;
        int i;
        int i2;
        float f;
        try {
            ik5Var.m19715g(4);
            int m19703s = (ik5Var.m19703s() & 3) + 1;
            if (m19703s != 3) {
                ArrayList arrayList = new ArrayList();
                int m19703s2 = ik5Var.m19703s() & 31;
                for (int i3 = 0; i3 < m19703s2; i3++) {
                    arrayList.add(m21126b(ik5Var));
                }
                int m19703s3 = ik5Var.m19703s();
                for (int i4 = 0; i4 < m19703s3; i4++) {
                    arrayList.add(m21126b(ik5Var));
                }
                if (m19703s2 > 0) {
                    b42 m25629d = c42.m25629d((byte[]) arrayList.get(0), m19703s + 1, ((byte[]) arrayList.get(0)).length);
                    int i5 = m25629d.f4286e;
                    int i6 = m25629d.f4287f;
                    float f2 = m25629d.f4288g;
                    str = ar4.m27132a(m25629d.f4282a, m25629d.f4283b, m25629d.f4284c);
                    i = i5;
                    i2 = i6;
                    f = f2;
                } else {
                    str = null;
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                }
                return new gz8(arrayList, m19703s, i, i2, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw dl3.m24267a("Error parsing AVC config", e);
        }
    }

    /* renamed from: b */
    public static byte[] m21126b(ik5 ik5Var) {
        int m19699w = ik5Var.m19699w();
        int m19711k = ik5Var.m19711k();
        ik5Var.m19715g(m19699w);
        return ar4.m27130c(ik5Var.m19714h(), m19711k, m19699w);
    }
}
