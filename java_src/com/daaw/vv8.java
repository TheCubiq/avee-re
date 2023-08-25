package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class vv8 {

    /* renamed from: a */
    public final String[] f30665a;

    /* renamed from: b */
    public final int[] f30666b;

    /* renamed from: c */
    public final au8[] f30667c;

    /* renamed from: d */
    public final int[] f30668d;

    /* renamed from: e */
    public final int[][][] f30669e;

    /* renamed from: f */
    public final au8 f30670f;

    public vv8(String[] strArr, int[] iArr, au8[] au8VarArr, int[] iArr2, int[][][] iArr3, au8 au8Var) {
        this.f30665a = strArr;
        this.f30666b = iArr;
        this.f30667c = au8VarArr;
        this.f30669e = iArr3;
        this.f30668d = iArr2;
        this.f30670f = au8Var;
    }

    /* renamed from: a */
    public final int m6710a(int i, int i2, boolean z) {
        int i3 = this.f30667c[i].m26965b(i2).f24960a;
        int[] iArr = new int[1];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 <= 0; i6++) {
            if ((this.f30669e[i][i2][i6] & 7) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i5);
        String str = null;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 16;
        while (i4 < copyOf.length) {
            String str2 = this.f30667c[i].m26965b(i2).m11590b(copyOf[i4]).f9275l;
            int i9 = i7 + 1;
            if (i7 != 0) {
                z2 |= !it5.m19376t(str, str2);
            } else {
                str = str2;
            }
            i8 = Math.min(i8, this.f30669e[i][i2][i4] & 24);
            i4++;
            i7 = i9;
        }
        return z2 ? Math.min(i8, this.f30668d[i]) : i8;
    }

    /* renamed from: b */
    public final int m6709b(int i, int i2, int i3) {
        return this.f30669e[i][i2][i3];
    }

    /* renamed from: c */
    public final int m6708c(int i) {
        return this.f30666b[i];
    }

    /* renamed from: d */
    public final au8 m6707d(int i) {
        return this.f30667c[i];
    }

    /* renamed from: e */
    public final au8 m6706e() {
        return this.f30670f;
    }
}
