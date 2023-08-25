package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class hu8 extends ju8 {

    /* renamed from: f */
    public final mw8 f12955f;

    /* renamed from: g */
    public final y17 f12956g;

    /* renamed from: h */
    public final xp4 f12957h;

    public hu8(r84 r84Var, int[] iArr, int i, mw8 mw8Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, xp4 xp4Var) {
        super(r84Var, iArr, 0);
        this.f12955f = mw8Var;
        this.f12956g = y17.m4262s(list);
        this.f12957h = xp4Var;
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ y17 m20412c(sv8[] sv8VarArr) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i3 >= 2) {
                break;
            }
            sv8 sv8Var = sv8VarArr[i3];
            if (sv8Var == null || sv8Var.f26707b.length <= 1) {
                arrayList.add(null);
            } else {
                v17 m4266o = y17.m4266o();
                m4266o.m7548f(new fu8(0L, 0L));
                arrayList.add(m4266o);
            }
            i3++;
        }
        long[][] jArr = new long[2];
        for (int i4 = 0; i4 < 2; i4++) {
            sv8 sv8Var2 = sv8VarArr[i4];
            if (sv8Var2 == null) {
                jArr[i4] = new long[0];
            } else {
                jArr[i4] = new long[sv8Var2.f26707b.length];
                int i5 = 0;
                while (true) {
                    int[] iArr = sv8Var2.f26707b;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    long j = sv8Var2.f26706a.m11590b(iArr[i5]).f9271h;
                    long[] jArr2 = jArr[i4];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i5] = j;
                    i5++;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            long[] jArr4 = jArr[i6];
            jArr3[i6] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        m20411d(arrayList, jArr3);
        m27 mo26497c = d37.m24715b(l37.m17166c()).m25643b(2).mo26497c();
        int i7 = 0;
        while (i7 < i) {
            int length = jArr[i7].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    long[] jArr5 = jArr[i7];
                    double d = 0.0d;
                    if (i8 >= jArr5.length) {
                        break;
                    }
                    long j2 = jArr5[i8];
                    if (j2 != -1) {
                        d = Math.log(j2);
                    }
                    dArr[i8] = d;
                    i8++;
                }
                int i9 = length - 1;
                double d2 = dArr[i9] - dArr[c];
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = i10 + 1;
                    mo26497c.mo6568a(Double.valueOf(d2 == 0.0d ? 1.0d : (((dArr[i10] + dArr[i11]) * 0.5d) - dArr[c]) / d2), Integer.valueOf(i7));
                    i10 = i11;
                    c = 0;
                }
            }
            i7++;
            c = 0;
            i = 2;
            i2 = 1;
        }
        y17 m4262s = y17.m4262s(mo26497c.zzt());
        for (int i12 = 0; i12 < m4262s.size(); i12++) {
            int intValue = ((Integer) m4262s.get(i12)).intValue();
            int i13 = iArr2[intValue] + 1;
            iArr2[intValue] = i13;
            jArr3[intValue] = jArr[intValue][i13];
            m20411d(arrayList, jArr3);
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (arrayList.get(i14) != null) {
                long j3 = jArr3[i14];
                jArr3[i14] = j3 + j3;
            }
        }
        m20411d(arrayList, jArr3);
        v17 m4266o2 = y17.m4266o();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            v17 v17Var = (v17) arrayList.get(i15);
            m4266o2.m7548f(v17Var == null ? y17.m4260u() : v17Var.m7546h());
        }
        return m4266o2.m7546h();
    }

    /* renamed from: d */
    public static void m20411d(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            v17 v17Var = (v17) list.get(i2);
            if (v17Var != null) {
                v17Var.m7548f(new fu8(j, jArr[i2]));
            }
        }
    }
}
